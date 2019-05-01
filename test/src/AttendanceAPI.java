public abstract class AttendanceAPI {
    public abstract String readDevice();
    public abstract String readDB(String id);
    public abstract boolean compare(String dataFromDevice, String dataFromDB );
    public abstract void writeDB(String id);

    public boolean takeAttendance(String id){
        String dataFromDevice = readDevice();
        String dataFromDB =  readDB(id);
        boolean verified = compare(dataFromDevice, dataFromDB);
        if(verified){
            writeDB(id);
            return true;
        }else{
            return false;
        }
    }

}
