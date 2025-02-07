package day3.Enums;

import java.util.EnumSet;

/*
 * ENUM TEST
 * Buat class untuk mengelola hak akses user menggunakan role dengan spesifikasi berikut:
 * 1. Buat enum UserAccess dengan nilai: CREATE, EDIT, DELETE, DISPLAY_DASHBOARD, dan USER_MANAGEMENT.
 * 2. Buat enum ROLE yang masing-masing role punya akses berikut:
 *    - ADMIN punya semua akses
 *    - EDITOR hanya punya akses CREATE, EDIT, dan DISPLAY_DASHBOARD
 *    - GUEST cuma punya akses DISPLAY_DASHBOARD
 * 3. Buat kelas User dengan atribut name dan role.
 * 4. Buat method untuk validasi dan menampilkan apakah user punya hak akses tertentu.
 * 5. Buat method untuk eksekusinya dalam satu file ini.
 */

public class Test {
    // NO.1:
    public enum UserAccess {
        CREATE, EDIT, DELETE, DISPLAY_DASHBOARD, USER_MANAGEMENT
    }

    // NO.2:
    public enum Role {
        ADMIN(EnumSet.of(UserAccess.CREATE, UserAccess.EDIT, UserAccess.DELETE, UserAccess.DISPLAY_DASHBOARD, UserAccess.USER_MANAGEMENT)),
        EDITOR(EnumSet.of(UserAccess.CREATE, UserAccess.EDIT, UserAccess.DISPLAY_DASHBOARD)),
        GUEST(EnumSet.of(UserAccess.DISPLAY_DASHBOARD));

        private final EnumSet<UserAccess> access;
        Role(EnumSet<UserAccess> access) {
            this.access = access;
        }

        public EnumSet<UserAccess> getAccess() {
            return access;
        }
    }

    // NO.3:
    public static class User {
        private String name;
        private Role role;

        public User(String name, Role role) {
            this.name = name;
            this.role = role;
        }

        public String getUsername() {
            return name;
        }

        public Role getRole() {
            return role;
        }

        // NO.4:
        public void checkAccess(UserAccess access) {
            if (this.role.getAccess().contains(access)) {
                System.out.println(name + " memiliki akses: " + access);
            } else {
                System.out.println(name + " tidak memiliki akses: " + access);
            }
        }
    }

    // NO.5:
    public static void main(String[] args) {
        User danu = new User("Danu", Role.GUEST);
        danu.checkAccess(UserAccess.CREATE);

        User imron = new User("Imron", Role.ADMIN);
        imron.checkAccess(UserAccess.CREATE);

        User pipit = new User("Pipit", Role.EDITOR);
        pipit.checkAccess(UserAccess.EDIT);
    }
}
