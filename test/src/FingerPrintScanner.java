public class FingerPrintScanner extends AttendanceAPI {

    public String readDevice(){
        return scanFingerPrint();
    }

    public String readDB(String studentName){
        return getFPFromDB(studentName);
    }

    public boolean compare(String dataFromFingerprintScanner, String dataFromDB){
        return dataFromFingerprintScanner.equals(dataFromDB);
    }

    public void writeDB(String studentName){
        setAttendance(studentName);
    }

    public String scanFingerPrint(){
        return "loops and radials";
    }

    public String getFPFromDB(String studentName){
        return "loops and radials";
    }


    public void setAttendance(String studentName){
        System.out.println("Attendance for "+ studentName +" has been added via Fingerprint Scanner.");
    }

}
