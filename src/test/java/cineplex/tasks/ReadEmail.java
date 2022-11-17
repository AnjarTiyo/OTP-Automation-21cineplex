package cineplex.tasks;

import javax.mail.*;
import javax.mail.internet.MimeMessage;
import javax.mail.search.SearchTerm;
import java.util.*;

// https://www.quora.com/How-do-we-automate-email-verification-in-Selenium

public class ReadEmail {

//    private static String imapHost = "imap.gmail.com";
//    private static String imapPort = "993";
//
//    private String userName = null;
//    private String password = null;
//
//    public ReadEmail(String userName, String password){
//        this.userName = userName;
//        this.password = password;
//    }
//
//    public Session setIMAPSession(){
//        Properties properties = new Properties();
//
//        properties.put("mail.imap.host", imapHost);
//        properties.put("mail.imap.port", imapPort);
//
//        properties.setProperty("mail.imap.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        properties.setProperty("mail.imap.socketFactory.fallback", "false");
//        properties.setProperty("mail.imap.socketFactory.port", String.valueOf(imapPort));
//
//        return Session.getInstance(properties);
//    }
//
//    public List<Message> searchEmail(int secToWait, String folder, final String keyword, Date emailDate) throws InterruptedException, MessagingException {
//        Session session=setIMAPSession();
//
//        List<Message> returnList = new ArrayList<>();
//
//        try {
//            Thread.sleep(secToWait * 1000);
//
//            System.out.println("Connect to Message Store . . .");
//
//            Store store = session.getStore("imap");
//            store.connect(userName, password);
//
//            System.out.println("Opens folder: " + folder);
//
//            Folder folderInbox = store.getFolder(folder);
//            folderInbox.open(Folder.READ_ONLY);
//
//            System.out.println("Searching message with keyword: " + keyword + " on folder: " + folder);
//
//            SearchTerm searchTerm = new SearchTerm() {
//
//                private static final long serialVersionUID = 1L;
//
//                @Override
//                public boolean match(Message message) {
//                    try {
//                        if (message.getSubject().contains(keyword) && (null == emailDate || message.getSentDate().after(emailDate))){
//                            return true;
//                        }
//                    }catch (MessagingException ex){
//                        System.out.println(ex.getMessage());
//                        ex.printStackTrace();
//                    }
//                    return false;
//                }
//            };
//
//            System.out.println("Perform searches through the folder : " + folder);
//            Message[] foundMessages = folderInbox.search(searchTerm);
//
//            System.out.println("Number of message found: " + foundMessages.length);
//            for (int i = 0; i < foundMessages.length; i++){
//                Message message = foundMessages[i];
//                Message copyOfMessage = new MimeMessage((MimeMessage) message);
//                returnList.add(copyOfMessage);
//            }
//
//            System.out.println();
//        }
//    }
}
