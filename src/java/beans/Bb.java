package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

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
        item = new ArrayList<>();	// Listを生成してデータをセット
        item.add(new Item("じゃがいも","80","スーパー１","2019-01-01"));
        item.add(new Item("たまねぎ","70","スーパー２","2019-01-02"));
        item.add(new Item("にんじん","60","スーパー３","2019-01-03"));
        item.add(new Item("ぶたにく","50","スーパー４","2019-01-04"));
        item.add(new Item("しらたき","40","スーパー４","2019-01-05"));
    }
    
     public String next() {
        
        return null;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
    
    public String edit(Item item) {
        Item it = (Item) item;
        Boolean editable = it.isEditable();
        it.setEditable(!editable);
        return null;
    }
    
    public String add(){
        /*try {
            File f = new File("C:\\Users\\s20164040\\Documents\\NetBeansProjects\\R3A218\\web\\resources\\data\\Item.csv");
            OutputStreamWriter osw  = new OutputStreamWriter(new FileOutputStream(f), "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            
            bw.newLine();
            bw.write(title+","+num+","+place+","+time);
            

            bw.close();
            
            
            FileWriter file = new FileWriter("C:\\Users\\s20164040\\Documents\\NetBeansProjects\\R3A218\\web\\resources\\data\\Item.csv", true);
            
            PrintWriter p = new PrintWriter(new BufferedWriter(file));
            
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
        item = ItemUtil.getList("/resources/data/Item.csv");*/
        
        item.add(new Item(title,num,place,time));
        
        //入力欄の初期化
        title=null;
        num=null;
        place=null;
        time=null;
        
        return null;
    }
    
    public String delete(Item item){
        this.item.remove(item);
        return null;
    }
    
}
