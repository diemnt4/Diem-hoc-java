package abstractClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	
	
	public static List getXpath(String objPath) {
		FileInputStream br = null;
		LinkedHashMap<String , List> objRepo = new LinkedHashMap<>();
        try {   
            br = new FileInputStream(new File("C:\\Users\\DIEM\\eclipse-workspace\\DiemHocCode\\src\\object_repositories\\FacebookLogin.properties"));       

            System.out.println("Đọc nội dung file sử dụng phương thức readLine()");
            String allText = "";
            int i = 0;
            String fileText = "";
            while ((i = br.read()) != -1) {
            	fileText += (char) i;
            }
            String xpathlist[] = fileText.split("\n");
            
    		for (String a : xpathlist) {
    			String xpathItem[] = a.split("=");
    			String xPathName = xpathItem[0].trim().substring(0, xpathItem[0].trim().lastIndexOf("."));
    			String xPathLocator = xpathItem[0].trim().substring( xpathItem[0].trim().lastIndexOf(".") + 1, xpathItem[0].trim().length());
    			List list = new ArrayList();
    			list.add(xPathLocator);
    			list.add(xpathItem[1].trim());
    			objRepo.put(xPathName, list);
    		}  System.out.println(objRepo.get(objPath));
        } catch (IOException e) {
            e.printStackTrace();
        } 
		return objRepo.get(objPath);
	}

	public static void main(String[] args) {
		getXpath("FacebookLogIn.TextBox_Email");
	 }
	
	public static void show(LinkedHashMap<String, List> linkedHashMap) {
        Set<String> keySet = linkedHashMap.keySet();
        for (String key : keySet) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }


}
