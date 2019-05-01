public abstract class AttendanceAPI {
    public abstract String readDevice();

    public abstract String readDB(String studentName);

    public abstract boolean compare(String dataFromDevice, String dataFromDB);

    public abstract void writeDB(String studentName);

    public boolean takeAttendance(String studentName) {
        //compares the data from device and the data from the database
        //if they are equal, write to the database and return true
        //else return false
        if (compare(readDevice(), readDB(studentName))) {
            writeDB(studentName);
            return true;
        } else {
            System.out.println("Incorrect input, please try again.");
            return false;
        }
    }
}
