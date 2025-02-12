package day5;

import java.util.Scanner;
import java.sql.* ;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.*;


public class MainMenu {
    String url = "jdbc:postgresql://localhost:5432/Test";
    String username = "postgres";
    String password = "admin";
    Scanner input = new Scanner(System.in);

    public  void getData(){
        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from products");
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            ObjectMapper mapper = new ObjectMapper();
            ArrayNode arrNode = mapper.createArrayNode();
            while (resultSet.next()) {
                ObjectNode objNode = mapper.createObjectNode();
                for(int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    objNode.put(columnName, resultSet.getString(i));

                }
                arrNode.add(objNode);
            }
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
        int category = input.nextInt();

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into products (name,price, category_id) values (?,?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, price);
            preparedStatement.setInt(3, category);
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
        int category = input.nextInt();

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("update products set name = ?, price = ?, category_id = ?  where id = ?");
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, price);
            preparedStatement.setInt(3, category);
            preparedStatement.setInt(4,id);

            int rowsUpdated = preparedStatement.executeUpdate();
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
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("delete from products where id = ?");
            preparedStatement.setInt(1, id);
            int productDeleted = preparedStatement.executeUpdate();
            if (productDeleted > 0 ){
                System.out.println("Data berhasil dihapus!");
            } else {
                System.out.println("Data dengan id = "+id+"tidak ditemukan");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public  void getDataCustomer(){
        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from customers");
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            ObjectMapper mapper = new ObjectMapper();
            ArrayNode arrNode = mapper.createArrayNode();

            while (resultSet.next()) {
                ObjectNode objNode = mapper.createObjectNode();
                for(int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    objNode.put(columnName, resultSet.getString(i));

                }
                arrNode.add(objNode);
            }
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(arrNode);
            System.out.println(jsonString);
        }catch (SQLException  | com.fasterxml.jackson.core.JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void addDataCustomer(){
        System.out.println("Masukan nama  :");
        String name = input.nextLine();

        System.out.println("Masukan email  :");
        String email = input.nextLine();

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into customers (name,email) values (?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.executeUpdate();
            System.out.println("data berhasil ditambahkan!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    public void editDataCustomer(){

        System.out.println("Masukan nama  :");
        String name = input.nextLine();
        System.out.println("Masukan email :");
        String email = input.nextLine();
        System.out.println("Masukan id :");
        int id = input.nextInt();
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("update customers set name = ?, email = ? where id = ?");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setInt(3, id);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0 ){
                System.out.println("Data berhasil diupdate!");
            } else {
                System.out.println("Data dengan id = "+id+"tidak ditemukan");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void deleteDataCostumer(){
        System.out.println("Masukan id Costumer : ");
        int id = input.nextInt();
        input.nextLine();

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("delete from customers where id = ?");
            preparedStatement.setInt(1, id);
            int productDeleted = preparedStatement.executeUpdate();
            if (productDeleted > 0 ){
                System.out.println("Data berhasil dihapus!");
            } else {
                System.out.println("Data dengan id = "+id+"tidak ditemukan");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        MainMenu demo = new MainMenu();
        Scanner input = new Scanner(System.in);

        // Menu
        while(true){
            System.out.println("=====HOME=====");
            System.out.println("1. Menu Produk");
            System.out.println("2. Menu Customer");
            System.out.println("0. Exit");
            System.out.println("==============");
            System.out.print("Pilih menu : ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu){
                case 1:
                    while (true){
                        System.out.println("=====MENU PRODUK=====");
                        System.out.println("1. Tambah Produk");
                        System.out.println("2. Update Produk");
                        System.out.println("3. Hapus Produk");
                        System.out.println("4. Lihat Produk");
                        System.out.println("0. Exit");
                        System.out.println("==============");
                        System.out.print("Pilih menu : ");
                        int menuProduk = input.nextInt();
                        input.nextLine();

                        switch (menuProduk){
                            case 1:
                                System.out.println("=====ADD PRODUCT======");
                                demo.addData();
                                System.out.println("======================");
                                break;
                            case 2:
                                System.out.println("=====UPDATE PRODUCT======");
                                demo.editData();
                                System.out.println("======================");
                                break;
                            case 3:
                                System.out.println("=====DELETE PRODUCT======");
                                demo.deleteData();
                                System.out.println("======================");
                                break;
                            case 4:
                                System.out.println("=====SHOW PRODUCT======");
                                demo.getData();
                                System.out.println("======================");
                                break;
                            case 0:
                                System.out.println("Kembali ke menu awal...");
                                break;
                            default:
                                System.out.println("input tidak valid");
                                break;
                        }
                        if(menuProduk == 0) break;
                    }
                    break;
                case 2:
                    while (true){
                        System.out.println("=====MENU CUTOMER=====");
                        System.out.println("1. Tambah Customer");
                        System.out.println("2. Update Customer");
                        System.out.println("3. Hapus Customer");
                        System.out.println("4. Lihat Customer");
                        System.out.println("0. Exit");
                        System.out.println("==============");
                        System.out.print("Pilih menu : ");
                        int menuCustomer = input.nextInt();
                        input.nextLine();

                        switch (menuCustomer){
                            case 1:
                                System.out.println("=====ADD CUSTOMER======");
                                demo.addDataCustomer();
                                System.out.println("======================");
                                break;
                            case 2:
                                System.out.println("=====UPDATE CUSTOMER======");
                                demo.editDataCustomer();
                                System.out.println("======================");
                                break;
                            case 3:
                                System.out.println("=====DELETE CUSTOMER======");
                                demo.deleteDataCostumer();
                                System.out.println("======================");
                                break;
                            case 4:
                                System.out.println("=====SHOW CUSTOMER======");
                                demo.getDataCustomer();
                                System.out.println("======================");
                                break;
                            case 0:
                                System.out.println("Kembali ke menu awal...");
                                break;
                            default:
                                System.out.println("input tidak valid");
                                break;
                        }
                        if(menuCustomer == 0) break;
                    }
                    break;
                case 0:
                    System.out.println("Terimakasih, sampai jumpa!");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Menu yang anda pilih tidak tersedia");
                    break;
            }
        }
    }
}