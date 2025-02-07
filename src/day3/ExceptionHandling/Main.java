package day3.ExceptionHandling;

import java.util.Objects;

// EXCEPTION HANDLING : error handling ketika ada operasi yang gagal
// macam -macam error handling
// -IllegalArgumentException : error handling argumen/paremmeter yang dikirim
// -ArrayIndexOutOfBoundsException : error handling data array
// -ArrayIndexOutOfBoundsException: error handling untuk operasi file
// -ArithmeticException : error handling untuk operasi matematika
// -ResourceNotFoundException : error handling resource (404 notfound)
// -BadRequestException : error handling UNTUK (400 bad request)
// -UnauthorizedException : error handling untuk akses tidak diizinkan (401 unauthorized)
// -ForbiddenException : error handling akses ditolak (403 forbidden)
// -NotFoundException : error handling ketika data tidak ditemukan (404 notfound)
// -MethodNotAllowException : error handling ketika method yang diakses tidak diizinkan (405 method not allowed)
// -InternalServerException : error handling ketika server error (500 internal server error)
// -Error : error handling umum

public class Main {
    static  void checkRole(String role) {
        // equals untuk cek data yang dikrim dari paremeter
        if (Objects.equals(role, "user")) {
            // respon error manual
            throw  new IllegalArgumentException("Access Denied! only admin can access ");
        } else {
            System.out.println("Access Granted!");
        }
    }

    public static void main(String[] args) {
        try {
            // panggil method
            checkRole("user");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
