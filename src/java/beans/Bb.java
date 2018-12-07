package beans;

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
    
    
}
