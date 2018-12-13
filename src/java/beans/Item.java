package beans;

/**
 *
 * @author s20164040
 */
public class Item {
    
    private String title;
    private String num;
    private String place;
    private String time;
    private boolean editable;
 
    public Item(){
        
    }
    
    public Item(String title, String num, String place, String time){
        
        this.title = title;
        this.num = num;
        this.place = place;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
    
    
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    
}
