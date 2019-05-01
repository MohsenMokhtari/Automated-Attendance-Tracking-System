public class RetinaScanner extends AttendanceAPI {
    private Compressor compressor = new Compressor();

    public String readDevice(){
        return scanRetina();
    }

    public String readDB(String studentName){
        return getRetinaFromDB(studentName);
    }

    public boolean compare(String dataFromRetinaScanner, String dataFromDB){
        return compressor.compress(dataFromRetinaScanner).equals(dataFromDB);
    }

    public void writeDB(String studentName){
        System.out.println("Attendance for "+ studentName +" has been added via Retina Scanner.");
    }

    public String scanRetina(){
        return "you have beautiful eyes.  ";
    }

    public String getRetinaFromDB(String studentName){
        return "you have beautiful eyes.";
    }



}
