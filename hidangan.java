package latihan_strukdat;

/**
 *
 * @author Rudi
 */
public class hidangan {
    protected String namahidangan;
    
    public String getnamahidangan(){
        return namahidangan;
    }
    public void setnamahidangan(String namahidangan){
        this.namahidangan=namahidangan;
    }
    public String disantap(){
        return"Makanan Dihidangkan";
    }
}
