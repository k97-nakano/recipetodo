package util;

import beans.Item;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

public class ItemUtil {

    

    public static List<Item> getList(String fpath) {
        Logger log = Logger.getLogger(ItemUtil.class.getName());
        String path = getRealPath(fpath);		
        List<Item> ls = new ArrayList<>();
        String line;
        try (InputStream is = new FileInputStream(path);
                BufferedReader in = new BufferedReader(new InputStreamReader(is, "UTF-8"));) {

            while ((line = in.readLine()) != null) {
                String[] s = line.split(",");
                if (s.length != 4) {
                    continue;
                }
                Item item = new Item(s);
                ls.add(item);
            }
        } catch (IOException e) {
            log.severe("★ファイルが見つからない:" + fpath);
        }
        return ls;
    }



    public static String getRealPath(String path) {
        ServletContext ctx = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
        return ctx.getRealPath(path);
    }
}
