import java.net.MalformedURLException;
import java.security.NoSuchAlgorithmException;

public class JavaLibraries {
    public static void main(String[] args) throws NoSuchAlgorithmException, MalformedURLException {
        // example of java.lang
        System.out.println("Hello World");
        // example of java.util
        java.util.Date date = new java.util.Date();
        System.out.println(date);
        // example of java.io
        java.io.File file = new java.io.File("JavaLibraries.java");
        System.out.println(file.exists());
        // example of java.text
        java.text.NumberFormat numberFormat = java.text.NumberFormat.getCurrencyInstance();
        System.out.println(numberFormat.format(1000000));
        // example of java.math
        java.math.BigInteger bigInteger = new java.math.BigInteger("1000000000");
        System.out.println(bigInteger);
        // example of java.net
        java.net.URL url = new java.net.URL("https://www.google.com");
        System.out.println(url.getHost());
        // example of java.sql
        java.sql.Date sqlDate = new java.sql.Date(0);
        System.out.println(sqlDate);
        // example of java.awt
        java.awt.Point point = new java.awt.Point(10, 20);
        System.out.println(point);
        // example of java.beans
        java.beans.PropertyChangeListener propertyChangeListener = new java.beans.PropertyChangeListener() {
            @Override
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                System.out.println(evt);
            }
        };
        System.out.println(propertyChangeListener);

        // example of java.nio
        java.nio.file.Path path = java.nio.file.Paths.get("JavaLibraries.java");
        System.out.println(path);
        // example of java.security
        java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("RSA");
        System.out.println(keyPairGenerator);
        // example of java.time
        java.time.LocalDate localDate = java.time.LocalDate.now();
        System.out.println(localDate);
}
}