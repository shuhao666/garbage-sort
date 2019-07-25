import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Garbage {

    public static void main(String[] args) {
        String allGarbageFilePath = "C:/Users/hanshuhao/Desktop/allgarbage.json";
        // TODO Auto-generated method stub
        String khsws = "酸奶盒、酸奶纸盒、塑料酸奶盒、酸奶杯、酸奶瓶、酸奶玻璃瓶、酸奶塑料瓶、苹果手机、苹果耳机、苹果电脑、苹果AirPods、苹果AirPods耳机盒、USB风扇、USB线、A4纸、iPad、平板、AD钙奶瓶、吸尘器、车用吸尘器、吸铁石、废旧吸铁石、金属门吸、吸门器、吸附物与载体废物、老鼠夹、老干妈瓶子、老抽瓶、王老吉包装盒、王老吉易拉罐、男靴、男鞋、女靴、女鞋、电脑、笔记本电脑、电脑显示器、电脑小音箱、电脑机箱、电脑包、键盘、酒瓶、酒精瓶、空酒瓶、废酒瓶、啤酒瓶、啤酒瓶盖、料酒瓶、酒瓶罐、红酒瓶、鸡尾酒瓶子、玻璃烟灰缸、油烟机、鼠标、废鼠标、旧鼠标、无线鼠标、耳机、快递包装盒、酱油瓶、雨伞股价、烧烤铁签、利乐枕牛奶袋、牛奶盒、牛奶纸盒、塑料牛奶瓶、牛奶瓶子、鸡蛋盒、鸡蛋塑料保护壳、电动剃须刀、塑料剃须刀、剃须刀片、猫罐头、木质猫爬架、金属鱼钩、鱼竿、鱼缸、废纸张、纸板箱、报纸、废弃书本、快递纸袋、打印纸、信封、广告单、纸塑铝复合包装（利乐包）、废塑料、饮料瓶、奶瓶、洗发水瓶、乳液罐、食用油桶、塑料碗（盆）、塑料盒子（食品保鲜盒）、塑料盒子（收纳盒）、塑料玩具（塑料积木）、塑料玩具（塑料模型）、塑料衣架、施工安全帽、PE-塑料、pvc、亚克力板、塑料卡片、密胺餐具、kt板、泡沫（泡沫塑料）、泡沫（水果网套）、废玻璃制品、调料瓶、酒瓶、化妆品瓶、玻璃杯、窗玻璃、玻璃制品（放大镜）、玻璃制品（玻璃摆件）、碎玻璃、废金属、易拉罐、食品罐、水桶、矿泉水桶、马桶盖、奶粉桶、软桶、垃圾桶、塑料垃圾桶、不锈钢垃圾桶、拖把桶、洗衣液桶、食用油桶、废油桶、机油桶、花生油桶、塑料桶、菜刀、菜刀锅、刀片、指甲剪、螺丝刀、铁钉、铁皮、铝箔、废织物、旧衣服、床单、枕头、棉被、皮鞋、毛绒玩具（布偶）、棉袄、包、皮带、丝绸制品、电路板（主板）、电路板（内存条）、充电宝、电线、插头、积木、木制砧板";

        String yhljs = "口服液吸管、达克宁药膏达克宁药膏皮、农药、农药瓶、过期的胶囊药物、过期药品、感冒药、西药、膏药、药盒、药品包装盒、咳嗽药片、咳嗽药水瓶、空药瓶、塑料药瓶、药壶、外敷伤药、药剂、药片包装、眼药膏、眼药水瓶子、蟑螂药、塑料药瓶、过期药膏、药品包装塑料纸、维生素药、给药器、膏药布、膏药包装、酒精、深海鱼油、鱼油胶囊、废电池、废镍镉电池、废氧化汞电池、充电电池、镉镍电池、铅酸电池、蓄电池、纽扣电池、笔记本电脑电池、手机电池、锂电池、纽扣电池、废荧光灯管、荧光（日光）灯管、吸顶灯、卤素灯、废药品及其包装物、过期药物、药物胶囊、药片、药瓶、避孕药、玻璃药瓶、药品内包装、老鼠药、毒鼠强、杀虫喷雾罐、废油漆和溶剂及其包装物、油漆桶、废油漆桶、胶水桶、化学剂桶、染发剂壳、过期的指甲油、洗甲水、废含汞温度计、废含汞血压计、水银血压计、水银体温计、水银温度计、废胶片及废相纸、x光片等感光胶片、相片底片";

        String sljs = "可降解吸管、可降解纸吸管、辣酱、老干妈辣酱、山药、铁棍山药、中草药材、酒酿圆子、脱排油烟机油渣、油烟机油脂、老鼠、死老鼠、仓鼠、荔枝壳、荔枝核、荔枝皮、荔枝叶、碎骨牛蛙骨头、排骨、小排骨、猪肉、猪尾巴、猪肝、猪扒、猪皮、猪蹄、猪肉脯、猪肝粥、猪骨粥、猪排骨、猪肋骨、整只粽子、粽子馅、蛋、蛋壳、蛋糕、蛋黄、蛋卷、蛋挞皮、皮蛋瘦肉粥、蛋黄派、茶叶蛋、茶叶蛋壳、鸡蛋、鸡精、鸡爪、炸鸡、鸡蛋壳、鸡蛋饼、鸡蛋黄、鸡蛋清、鸡蛋皮、鸡蛋卷、鸡骨头、鸡蛋仔、鸡锁骨、鸡软骨、鸡翅骨、羊骨头、熟鸡蛋、熟鸡蛋壳、生鸡蛋壳、鸡屎、烤鸡、鸡肉粥、叫花鸡、鸡屁股、鸡腿菇、素鸡、五香蛋、咸蛋、闲蛋壳、皮蛋壳、鸭蛋、鸭蛋黄、鸭骨头、鸭蛋皮、鸭蛋壳、鸭锁骨、咸鸭蛋壳、鹅蛋皮、鹌鹑蛋壳、鹌鹑蛋皮、吃剩的蛋糕、蛋挞、咸蛋黄、蛋白粉、皮蛋、变蛋、大猪蹄子、狗屎、狗尸体、狗大便、狗粮、猫粮、猫屎、猫屎咖啡、猫便、猫尸体、死猫、豆腐猫砂、团结猫砂、矿物猫砂、猫冻干、玉米猫砂、食材废料、米、米饭、面、面包、豆类、鸡、鸭、猪、牛、羊肉、动物内脏、腊肉、午餐肉、鱼、鱼鳞、鱼刺、鱼骨头、鱼肉、鱼头、鱼油、鱼食、鱼饲料、带鱼骨头、鲍鱼壳、鲫鱼、甲鱼、三文鱼、咸鱼、鱼内脏、章鱼、酸菜鱼、鱼茸粥、鱼片粥、黑鱼、黄鱼、多宝鱼骨头、墨鱼、渔肠、鱼泡、虾、虾壳、对虾、河虾、江虾、湖虾、沼虾、明虾、白虾、青虾、水晶虾、白米虾、黄虾、米虾、毛虾、基围虾、花虾、虎虾、红爪虾、草虾、大虎虾、黑壳虾、牛形对虾、立虾、鹰爪虾、鸡爪虾、红虾、沙虾、厚壳虾、鱿鱼、蔬菜、绿叶菜、根茎蔬菜、菌菇、调料、酱料、剩菜剩饭、火锅汤底、鱼骨、碎骨、茶叶渣、咖啡渣、过期食品、糕饼、糖果、肉干、红枣、中药材、冲泡饮料、面粉、宠物饲料、瓜皮果核、椰子肉、西瓜、西瓜皮、西瓜籽、香蕉、香蕉皮、香蕉干、桔子、桔子皮、苹果、苹果皮、苹果核、苹果果核、苹果泥、苹果派、苹果肉、苹果屑、拔丝苹果、烂苹果、坏苹果、葡萄、葡萄干、葡萄籽、葡萄核、葡萄枝、葡萄梗、桂圆、桂圆干、桂圆壳、桂圆皮、干桂圆壳、桂圆干壳、花卉植物、家养绿植、花卉、花瓣、枝叶、中药药渣";

        String gljs = "酸奶杯盖、酸奶袋、酸奶勺、干电池、一次性餐盒、快餐盒、一次性塑料勺子、外卖袋、粽叶、粽子绳、iPad保护壳、平板保护壳、Costa咖啡杯、A4纸包装袋、BB霜、气垫BB霜、吸尘器垃圾、吸尘器灰尘、老鼠贴、老花镜、老花眼镜、中药袋、中草药、渔网、碱性电池、碱性无汞电池、键盘清洁胶、酒精棉、酒精棉包装袋、鸡眼膏、荷兰猪毛、烟盒、香烟头、湿烟头、烟丝、香烟灰、香烟盒、香烟屁股、陶瓷烟灰缸、一次性电子烟、烟盒内锡纸、电子烟烟弹、鼠标垫、粘鼠板、仓鼠垫沙、快递单、快递纸袋、快递袋、快递盒子、快递包装袋、旧袜子、酱油袋、酱油包装袋、鸡腿骨头、牛骨头、牛尾骨、牛仔骨、大骨头、大棒骨、猪大骨头、肉骨头、烧烤棍、烧烤锡纸、烧烤木签、烧烤竹签、吸管、吸管薄膜、吸管塑料袋、塑料吸管、酸奶吸管、豆浆吸管、奶茶杯、奶茶杯盖、奶茶杯身、奶茶吸管、牛奶瓶吸管、吸管纸质包装、吸油纸、吸油面纸、吸湿剂、吸味剂、牛奶袋、蛋糕盒、蛋糕包装盒、包蛋糕的塑料袋、蛋糕包装袋、蛋糕袋、蛋挞托、跳蛋、海绵蛋、美妆蛋、一次性剃须刀片、手指甲、外卖餐盒、塑料袋、面膜、狗毛、狗屎纸、狗尿垫、狗屎垫、包裹着狗屎的纸巾、包裹着狗屎的报纸、包裹着狗屎的塑料袋、猫毛、膨润土猫砂、逗猫棒、沸石猫砂、硅胶猫砂、混合猫砂、猫粮包装袋、水晶猫砂、松木猫砂、鱼缸过滤网、鱼缸过滤棉、甲鱼壳、妇女卫生用品、女士香烟、使用过的女性卫生巾、头发、餐巾纸、卫生间用纸、尿不湿、污损纸张、烟蒂、干燥剂、污损塑料、尼龙制品、编织袋、防碎气泡膜、大骨头、硬贝壳、椰子壳、榴莲壳、核桃壳、玉米衣、甘蔗皮、榴莲核、菠萝蜜核、毛发、灰土、炉渣、橡皮泥、太空沙、胶水、胶带、花盆、毛巾、一次性餐具、镜子、陶瓷制品、竹篮、竹筷、竹制牙签、伞、笔、眼镜、打火机、葡萄酒木塞";

        String qts = "单身狗、前男友、前女友、老婆、老公、男朋友、女朋友、渣男、渣女";

        String[] khsw = khsws.split("、");
        String[] yhlj = yhljs.split("、");
        String[] slj = sljs.split("、");
        String[] glj = gljs.split("、");
        String[] qt = qts.split("、");

        for (int i = 0; i < khsw.length; i++) {
            String str = "{\"_id\":\"" + UUID.randomUUID().toString().replace("-", "") + "\",\"_openid\":\"oT0SX5Ka9-SMEe0Yx-tJBbnzLk5A\",\"garbagename\":" + "\"" + khsw[i] + "\",\"sort\":\"可回收物\",\"sortid\":\"sort-0\",\"searchtimes\":0}\r\n";
            writeToFile(allGarbageFilePath, str);
        }
        for (int i = 0; i < yhlj.length; i++) {
            String str = "{\"_id\":\"" + UUID.randomUUID().toString().replace("-", "") + "\",\"_openid\":\"oT0SX5Ka9-SMEe0Yx-tJBbnzLk5A\",\"garbagename\":" + "\"" + yhlj[i] + "\",\"sort\":\"有害垃圾\",\"sortid\":\"sort-1\",\"searchtimes\":0}\n";
            writeToFile(allGarbageFilePath, str);
        }
        for (int i = 0; i < slj.length; i++) {
            String str = "{\"_id\":\"" + UUID.randomUUID().toString().replace("-", "") + "\",\"_openid\":\"oT0SX5Ka9-SMEe0Yx-tJBbnzLk5A\",\"garbagename\":" + "\"" + slj[i] + "\",\"sort\":\"湿垃圾\",\"sortid\":\"sort-2\",\"searchtimes\":0}\n";
            writeToFile(allGarbageFilePath, str);
        }
        for (int i = 0; i < glj.length; i++) {
            String str = "{\"_id\":\"" + UUID.randomUUID().toString().replace("-", "") + "\",\"_openid\":\"oT0SX5Ka9-SMEe0Yx-tJBbnzLk5A\",\"garbagename\":" + "\"" + glj[i] + "\",\"sort\":\"干垃圾\",\"sortid\":\"sort-3\",\"searchtimes\":0}\n";
            writeToFile(allGarbageFilePath, str);
        }

        for (int i = 0; i < qt.length; i++) {
            String str = "{\"_id\":\"" + UUID.randomUUID().toString().replace("-", "") + "\",\"_openid\":\"oT0SX5Ka9-SMEe0Yx-tJBbnzLk5A\",\"garbagename\":" + "\"" + qt[i] + "\",\"sort\":\"其他\",\"sortid\":\"sort-4\",\"searchtimes\":0}\n";
            writeToFile(allGarbageFilePath, str);
        }

        writeToFile(allGarbageFilePath, sub(khsws.concat(yhljs).concat(sljs).concat(gljs).concat(qts).replace("、", "").replace("（", "").replace("）", "")));

    }

    static String sub(String str) {
        StringBuffer result = new StringBuffer();
        List list = new ArrayList();
        char[] cs = str.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (!list.contains(cs[i])) {
                result.append(cs[i]);
                list.add(cs[i]);
            }
        }
        return result.toString();
    }

    //写入文件
    public static void writeToFile(String filePath, String str) {
        createNewFile(filePath);
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(filePath, true)));
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
