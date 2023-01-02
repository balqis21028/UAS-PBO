public class Main {
    public static void main(String[] args) {

        Staff staff = new Staff();
        Staff staff2 = new Staff();
        Staff staff3 = new Staff();
        staff.setName("Jhorgi");
        staff.setStaffId(1123);
        staff.setLebur(2.5);

        staff2.setName("Rudi");
        staff2.setStaffId(1124);
        staff2.setLebur(3.5);

        staff3.setName("Joko");
        staff3.setStaffId(1125);
        staff3.setLebur(7.5);

        System.out.println("Nama Staff:"+staff.name);
        System.out.println("ID Staff:"+staff.staffId);
        System.out.println("Gaji Pokok:"+staff.Salary);
        System.out.println("Jumlah Lembur:"+staff.getLebur()+" Jam \n");

        System.out.println("Nama Staff:"+staff2.name);
        System.out.println("ID Staff:"+staff2.staffId);
        System.out.println("Gaji Pokok:"+staff2.Salary);
        System.out.println("Jumlah Lembur:"+staff2.getLebur()+" Jam\n");

        System.out.println("Nama Staff:"+staff3.name);
        System.out.println("ID Staff:"+staff3.staffId);
        System.out.println("Gaji Pokok:"+staff3.Salary);
        System.out.println("Jumlah Lembur:"+staff3.getLebur()+" Jam\n");



        Lecturer lecturer = new Lecturer();
        lecturer.setName("Roby");
        lecturer.setLecturerID(1111);
        lecturer.setCourselist("DDP,PBO,Statistika");
      
        Lecturer lecturer2 = new Lecturer();
        lecturer2.setName("John");
        lecturer2.setLecturerID(2222);
        lecturer2.setCourselist("DDP,PBO,Basis Data");

        System.out.println("Nama Dosen:"+lecturer.name);
        System.out.println("ID Dosen: "+lecturer.lecturerID);
        System.out.println("Matkul:"+lecturer.getCourceList()+"\n");

        System.out.println("Nama Dosen:"+lecturer2.name);
        System.out.println("ID Dosen: "+lecturer2.lecturerID);
        System.out.println("Matkul:"+lecturer2.getCourceList()+"\n");

    }
}
