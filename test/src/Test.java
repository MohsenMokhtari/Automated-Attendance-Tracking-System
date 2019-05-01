public class Test {
    public static void main(String[] args) {
        AttendanceAPI smartCard = new SmartCardReader();
        AttendanceAPI fingerprintScanner = new FingerPrintScanner();
        AttendanceAPI retinaScanner = new RetinaScanner();

        smartCard.takeAttendance("James Bond");
        fingerprintScanner.takeAttendance("Mohsen Mokhtari Sarab");
        retinaScanner.takeAttendance("Charlize Theron");
    }
}
