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
    
    public Item(String[] s){
        
        this.title = s[0] != null ? s[0] : "";
        this.num = s[1] != null ? s[1] : "";
        this.place = s[2] != null ? s[2] : "";
        this.time = s[3] != null ? s[3] : "";
    }
    
    @Override
    public String toString(){
        return title + "/" + num + "/" + place + "/" + time;
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
