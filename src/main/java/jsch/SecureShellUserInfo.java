package jsch;

import com.jcraft.jsch.UserInfo;

/**
 * @author GodzillaHua
 **/
public class SecureShellUserInfo implements UserInfo {

    private final String password;

    public SecureShellUserInfo(String password) {
        this.password = password;
    }

    public String getPassphrase() {
        return null;
    }

    public String getPassword() {
        System.out.println("getpassword");
        return password;
    }

    public boolean promptPassword(String s) {
        return true;
    }

    public boolean promptPassphrase(String s) {
        return false;
    }

    public boolean promptYesNo(String s) {
        return true;
    }

    public void showMessage(String s) {

    }
}
