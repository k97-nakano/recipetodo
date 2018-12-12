package beans;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import util.ItemUtil;

/**
 *
 * @author s20164040
 */

@Named
@SessionScoped
public class Bb implements Serializable {
    
    private String title;
    private String num;
    private String place;
    private String time;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
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
    
    
    
    private List<Item> item;
    
    {	
        item = ItemUtil.getList("/resources/data/Item.csv");
    }
    
     public String next() {
        
        return null;
    }

    public String edit(Item item) {
        Item it = (Item) item;
        Boolean editable = it.isEditable();
        it.setEditable(!editable);
        return null;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
    
    public String add(){
        try {
            
            
            
            FileWriter file = new FileWriter("C:\\Users\\hcs_20164040\\Documents\\NetBeansProjects\\r3a218\\web\\resources\\data\\Item.csv", true);
            
            PrintWriter p = new PrintWriter(new BufferedWriter(file),"UTF-8");
            
            //ファイルに書き込む
            p.println();
            p.print(title+","+num+","+place+","+time);
            
            System.out.print("エラー１");
            //ファイルを閉じる
            p.close();
            System.out.print("エラー2");
        } catch (FileNotFoundException e) {
            e.printStackTrace();    
        System.out.print("エラー5");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print("エラー3");
        }
        System.out.print("エラー4");
        item = ItemUtil.getList("/resources/data/Item.csv");
        return null;
    }
    
}
