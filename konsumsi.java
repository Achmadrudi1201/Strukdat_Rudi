package latihan_strukdat;

/**
 *
 * @author Rudi
 */
public class konsumsi <M,I>{
   private M m;
   private I i;
   
   public M getm(){
     return m;  
   }
   
   public I getI(){
       return i;
   }
   
   public void setkonsumsi (M makanan, I minuman){
       this.m = makanan;
       this.i = minuman;
   }
}
