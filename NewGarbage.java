import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class NewGarbage {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String newGarbageFilePath = "C:/Users/hanshuhao/Desktop/newgarbage.json";
        
        String khsws = "aaa";

        String yhljs = "bb";

        String sljs = "cc";

        String gljs = "dd";

        String qts = "";

        String[] khsw = khsws.split("、");
        String[] yhlj = yhljs.split("、");
        String[] slj = sljs.split("、");
        String[] glj = gljs.split("、");
        String[] qt = qts.split("、");
        
        clearFile(newGarbageFilePath);

        for(int i = 0; i < khsw.length; i ++){
            String str = "{\"_id\":\"" + UUID.randomUUID().toString().replace("-", "") + "\",\"_openid\":\"oT0SX5Ka9-SMEe0Yx-tJBbnzLk5A\",\"garbagename\":" + "\"" + khsw[i]+ "\",\"sort\":\"可回收物\",\"sortid\":\"sort-0\",\"searchtimes\":0}\r\n";
            writeToFile(newGarbageFilePath,str);
        }
        for(int i = 0; i < yhlj.length; i ++){
            String str = "{\"_id\":\"" + UUID.randomUUID().toString().replace("-", "") + "\",\"_openid\":\"oT0SX5Ka9-SMEe0Yx-tJBbnzLk5A\",\"garbagename\":" + "\"" + yhlj[i]+ "\",\"sort\":\"有害垃圾\",\"sortid\":\"sort-1\",\"searchtimes\":0}\n";
            writeToFile(newGarbageFilePath,str);
        }
        for(int i = 0; i < slj.length; i ++){
            String str = "{\"_id\":\"" + UUID.randomUUID().toString().replace("-", "") + "\",\"_openid\":\"oT0SX5Ka9-SMEe0Yx-tJBbnzLk5A\",\"garbagename\":" + "\"" + slj[i]+ "\",\"sort\":\"湿垃圾\",\"sortid\":\"sort-2\",\"searchtimes\":0}\n";
            writeToFile(newGarbageFilePath,str);
        }
        for(int i = 0; i < glj.length; i ++){
            String str = "{\"_id\":\"" + UUID.randomUUID().toString().replace("-", "") + "\",\"_openid\":\"oT0SX5Ka9-SMEe0Yx-tJBbnzLk5A\",\"garbagename\":" + "\"" + glj[i]+ "\",\"sort\":\"干垃圾\",\"sortid\":\"sort-3\",\"searchtimes\":0}\n";
            writeToFile(newGarbageFilePath,str);
        }

        for(int i = 0; i < qt.length; i ++){
            String str = "{\"_id\":\"" + UUID.randomUUID().toString().replace("-", "") + "\",\"_openid\":\"oT0SX5Ka9-SMEe0Yx-tJBbnzLk5A\",\"garbagename\":" + "\"" + qt[i]+ "\",\"sort\":\"其他\",\"sortid\":\"sort-4\",\"searchtimes\":0}\n";
            writeToFile(newGarbageFilePath,str);
        }

        writeToFile(newGarbageFilePath,sub(khsws.concat(yhljs).concat(sljs).concat(gljs).concat(qts).replace("、","").replace("（","").replace("）","")));

    }
    static String sub(String str){
        StringBuffer result = new StringBuffer();
        List list = new ArrayList();
        char[] cs = str.toCharArray();
        for(int i=0; i<cs.length; i++){
            if(!list.contains(cs[i])){
                result.append(cs[i]);
                list.add(cs[i]);
            }
        }
        return result.toString();
    }

    //写入文件
    public static void writeToFile(String file, String str) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file, true)));
            out.write(str);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 清空已有的文件内容，以便下次重新写入新的内容
    public static void clearFile(String fileName) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //判断文件是否存在
    public static void createNewFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
