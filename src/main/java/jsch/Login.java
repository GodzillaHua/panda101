package jsch;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import org.apache.commons.io.IOUtils;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author GodzillaHua
 **/
public class Login {

    public static void main(String[] args) throws Exception {
        final Properties properties = new Properties();
        properties.load(Login.class.getResourceAsStream("/jsch.properties"));
        JSch jSch = new JSch();


        Session session = jSch.getSession(properties.getProperty("ssh.user"), properties.getProperty("ssh.host"), Integer.parseInt(properties.getProperty("ssh.port", "22")));
        session.setUserInfo(new SecureShellUserInfo(properties.getProperty("ssh.password")));

        session.connect();



        session.disconnect();


    }
}
