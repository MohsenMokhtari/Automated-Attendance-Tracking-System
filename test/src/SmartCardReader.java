public class SmartCardReader extends AttendanceAPI {

    public String readDevice(){
       return readSmartCard();
    }

    public String readDB(String studentName){
        return getStudentID(studentName);
    }

    public boolean compare(String dataFromDevice, String dataFromDB){
        return verify(dataFromDevice, dataFromDB);
    }

    public void writeDB(String studentName){
        updateAttendance(studentName);
    }

    public String readSmartCard(){
        return "007";
    }

    public String getStudentID(String studentName){
        return "007";
    }

    public boolean verify(String dataFromCard, String dataFromDB){
        return dataFromCard.equals(dataFromDB);
    }

    public void updateAttendance(String studentName){
        System.out.println("Attendance for "+ studentName +" has been added via Smart Card");
    }









}
