package day4;

import java.sql.* ;
import java.time.LocalDate;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.*;


public class DemoCRUD {
    // connect to database
    String url = "jdbc:postgresql://localhost:5432/bootcamp";
    String username = "postgres";
    String password = "admin";
    Scanner input = new Scanner(System.in);


    public  void getData(){
        try{
                // DriverManager.getConnection : untuk menghubungkan ke database
                Connection connection = DriverManager.getConnection(url, username, password);
                // panggil objek statement untuk ekseskusi query
                Statement statement = connection.createStatement();
                // panggil ResultSet : untuk menampung hasil query
                ResultSet resultSet = statement.executeQuery("select * from products");

                // get nama  colom dan tipe data dari tiap kolom
                ResultSetMetaData metaData = resultSet.getMetaData();
                // ambil jumlah kolom
                int columnCount = metaData.getColumnCount();

                // ObjectMapper : untuk mapping data ke format JSON
                ObjectMapper mapper = new ObjectMapper();
                // ArrayNode buat nampung data ke array of object(JSON)
                ArrayNode arrNode = mapper.createArrayNode();// buat array kosong

                while (resultSet.next()) {
                    ObjectNode objNode = mapper.createObjectNode();
                    for(int i = 1; i <= columnCount; i++) {
                            String columnName = metaData.getColumnName(i);
                            objNode.put(columnName, resultSet.getString(i));

                    }
                    // masukin data objek yang udah dilooping ke array
                    arrNode.add(objNode);

                }
                // buat format data ke format JSON yang lebih rapi
                String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(arrNode);
                System.out.println(jsonString);
                }catch (SQLException  | com.fasterxml.jackson.core.JsonProcessingException e) {
                throw new RuntimeException(e);
        }
    }

    public void addData(){
        System.out.println("Masukan nama produk :");
        String name = input.nextLine();

        System.out.println("Masukan harga produk :");
        double price = input.nextDouble();
        input.nextLine();

        System.out.println("Masukan kategori produk :");
        String category = input.nextLine();

        try {
            // DriverManager.getConnection : untuk menghubungkan ke database
            Connection connection = DriverManager.getConnection(url, username, password);
            // PraeparedStatement : untuk ekseskusi query yang memiliki jumlah data yang banyak.(?,?,?) pada values untuk cegah SQL injection
            PreparedStatement preparedStatement = connection.prepareStatement("insert into products (product_name,product_price,category) values (?,?,?)");
            preparedStatement.setString(1, name); // Set string untuk memasukan data string
            preparedStatement.setDouble(2, price); // double untuk memasukan data double,sesuakan dengan tipe data yang diinginkan
            preparedStatement.setString(3, category);
            preparedStatement.executeUpdate();
            System.out.println("data berhasil ditambahkan!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void editData(){
        System.out.println("Masukan id produk :");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Masukan nama produk :");
        String name = input.nextLine();

        System.out.println("Masukan harga produk :");
        double price = input.nextDouble();
        input.nextLine();

        System.out.println("Masukan kategori produk :");
        String category = input.nextLine();

        try {
            // DriverManager.getConnection : untuk menghubungkan ke database
            Connection connection = DriverManager.getConnection(url, username, password);
            // PraeparedStatement : untuk ekseskusi query yang memiliki jumlah data yang banyak.(?,?,?) pada values untuk cegah SQL injection
            PreparedStatement preparedStatement = connection.prepareStatement("update products set product_name = ?, product_price = ?, category = ?  where id = ?");
            preparedStatement.setString(1, name); // Set string untuk memasukan data string
            preparedStatement.setDouble(2, price); // double untuk memasukan data double,sesuakan dengan tipe data yang diinginkan
            preparedStatement.setString(3, category);
            preparedStatement.setInt(4,id);
            // eksekusi querry
            int rowsUpdated = preparedStatement.executeUpdate();
            // kondisi untuk cek apa ada data yang di  update
            if (rowsUpdated > 0 ){
                System.out.println("Data berhasil diupdate!");
            } else {
                System.out.println("Data dengan id = "+id+"tidak ditemukan");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteData(){
        System.out.println("Masukan data produk : ");
        int id = input.nextInt();
        input.nextLine();

        try {
            // DriverManager.getConnection : untuk menghubungkan ke database
            Connection connection = DriverManager.getConnection(url, username, password);
            // PraeparedStatement : untuk ekseskusi query yang memiliki jumlah data yang banyak.(?,?,?) pada values untuk cegah SQL injection
            PreparedStatement preparedStatement = connection.prepareStatement("delete from products where id = ?");
            preparedStatement.setInt(1, id);
            // eksekusi querry
            int productDeleted = preparedStatement.executeUpdate();
            // kondisi untuk cek apa ada data yang di  update
            if (productDeleted > 0 ){
                System.out.println("Data berhasil dihapus!");
            } else {
                System.out.println("Data dengan id = "+id+"tidak ditemukan");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void orderData() {
        System.out.println("Masukkan ID produk yang ingin dipesan (ketik 0 untuk batal): ");
        int id = input.nextInt();
        input.nextLine(); // Buang newline agar tidak terjadi error saat membaca String selanjutnya

        // Jika user mengetik 0, batalkan pemesanan
        if (id == 0) {
            System.out.println("Pemesanan dibatalkan.");
            return;
        }

        // Tampilkan informasi produk sebelum melanjutkan
        showProductDetails(id);

        System.out.println("Masukkan jumlah produk yang ingin dipesan (ketik 0 untuk batal): ");
        int quantity = input.nextInt();
        input.nextLine();

        // Jika user mengetik 0, batalkan pemesanan
        if (quantity == 0) {
            System.out.println("Pemesanan dibatalkan.");
            return;
        }

        // Konfirmasi pemesanan
        System.out.println("Konfirmasi pemesanan? (Y/N): ");
        String confirm = input.nextLine().trim().toLowerCase();

        if (!confirm.equals("y")) {
            System.out.println("Pemesanan dibatalkan.");
            return;
        }

        // Eksekusi pemesanan setelah konfirmasi
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "INSERT INTO orders (product_id, order_date, quantity) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.setDate(2, Date.valueOf(LocalDate.now()));
            preparedStatement.setInt(3, quantity);

            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("✅ Pesanan berhasil ditambahkan ke tabel orders!");
            }

        } catch (SQLException e) {
            System.err.println("⚠️ Terjadi kesalahan: " + e.getMessage());
        }
    }

    private void showProductDetails(int id) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT * FROM products WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("\n📌 Detail Produk:");
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Nama: " + resultSet.getString("product_name"));
                System.out.println("Harga: " + resultSet.getDouble("product_price"));
                System.out.println("Kategori: " + resultSet.getString("category"));
            } else {
                System.out.println("⚠️ Produk dengan ID " + id + " tidak ditemukan.");
            }
        } catch (SQLException e) {
            System.err.println("⚠️ Terjadi kesalahan: " + e.getMessage());
        }
    }




    public static void main(String[] args) {
        DemoCRUD demo = new DemoCRUD();
        Scanner input = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        while (isLanjutkan){
            System.out.println("===Menu===");
            System.out.println("1. View all product");
            System.out.println("2. Add new product");
            System.out.println("3. Edit product");
            System.out.println("4. Delete pproduct");
            System.out.println("5. Order product");
            System.out.println("0. Exit");
            System.out.println("Pilih menu : ");
            int menu = input.nextInt();
            switch (menu){
                case 1:
                    demo.getData();
                            break;
                case 2:
                    demo.addData();
                    break;
                case 3:
                    demo.editData();
                case 4:
                    demo.deleteData();
                    break;
                case 5:
                    demo.orderData();
                case 0:
                    System.out.println("Thank you have a good day!");
                    input.close();
                    return;// buat close menu input
                default:
                    System.out.println("input tidak valid");
            }
            System.out.println("\nApakah anda ingin melanjutkan (Y/N)?");
            pilihanUser = input.next();
            isLanjutkan = pilihanUser.equalsIgnoreCase("y");
        }


    }
}
