import java.util.HashMap;

public class IDandPassword {
    HashMap<String,String> logininfo = new HashMap<String, String>();

    IDandPassword() {
        logininfo.put("Bro", "Pizza");
        logininfo.put("Nikolai", "HJFDFE3");
        logininfo.put("Sus", "Amongus");
        logininfo.put("Admin", "1234");
    }
    protected HashMap getLoginInfo() {
        return logininfo;
    }
}
