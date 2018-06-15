
import java.awt.Component;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import java.sql.*;
import java.net.*;
import com.teknikindustries.bulksms.SMS;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Date;
import java.util.stream.IntStream;
import static java.util.stream.StreamSupport.intStream;
import static java.util.stream.StreamSupport.intStream;
import javax.swing.Timer;

public class welcome extends javax.swing.JFrame {

    Connection con = null;
    String aadharnot;
    int flag1;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String OTPs;
    String timeofelection = "19-04-2018";

    public welcome() {

        initComponents();
        setTitle("Online Voting System 1.0");
        setBounds(new java.awt.Rectangle(1, 1, 1200, 670));
        setResizable(false);
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date dateobj = new Date();
        String current = df.format(dateobj);
        date.setText(current);
        time.setText(timeofelection);
        /////////////////////////

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aadharno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mobileno = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        timel = new javax.swing.JLabel();
        DATEl1 = new javax.swing.JLabel();
        TITLE = new javax.swing.JLabel();
        ANAME = new javax.swing.JLabel();
        AUID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBounds(new java.awt.Rectangle(5, 5, 500, 300));
        getContentPane().setLayout(null);

        aadharno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadharnoActionPerformed(evt);
            }
        });
        getContentPane().add(aadharno);
        aadharno.setBounds(480, 90, 285, 37);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter The Aadhar Card No");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 90, 150, 34);

        mobileno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobilenoActionPerformed(evt);
            }
        });
        getContentPane().add(mobileno);
        mobileno.setBounds(480, 190, 285, 34);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 140, 170, 34);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(400, 240, 131, 23);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(570, 240, 126, 23);

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton3.setText("Results of Election");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(790, 490, 290, 100);

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton5.setText("Aadhar card registration for voting purpose");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(440, 490, 310, 100);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mobile No");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 190, 120, 30);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(480, 140, 285, 34);

        time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(time);
        time.setBounds(170, 520, 170, 40);

        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(date);
        date.setBounds(140, 490, 250, 40);

        timel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timel.setForeground(new java.awt.Color(255, 255, 255));
        timel.setText("DATE OF ELECTION :");
        getContentPane().add(timel);
        timel.setBounds(20, 520, 160, 40);

        DATEl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DATEl1.setForeground(new java.awt.Color(255, 255, 255));
        DATEl1.setText("TODAY'S  DATE : ");
        getContentPane().add(DATEl1);
        DATEl1.setBounds(20, 490, 160, 40);

        TITLE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TITLE.setForeground(new java.awt.Color(255, 255, 255));
        TITLE.setText("THIS PROJECT IS CREATED BY :");
        getContentPane().add(TITLE);
        TITLE.setBounds(930, 10, 240, 40);

        ANAME.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        ANAME.setForeground(new java.awt.Color(255, 255, 255));
        ANAME.setText("NAVEEN PATIDAR");
        getContentPane().add(ANAME);
        ANAME.setBounds(1030, 40, 160, 40);

        AUID.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        AUID.setForeground(new java.awt.Color(255, 255, 255));
        AUID.setText("                   16BCS2687");
        getContentPane().add(AUID);
        AUID.setBounds(1010, 60, 160, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welcome/Election-Commission-of-India-–-Static-GK-Notes-PDF-4.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -130, 1240, 910);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aadharnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadharnoActionPerformed

    }//GEN-LAST:event_aadharnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s = aadharno.getText();
        new vote(s).setVisible(true);
        Connection con = null;
        PreparedStatement pst = null;
        java.sql.Statement stmt = null;
        ResultSet rs = null;
        String mobileno1 = mobileno.getText();

        //time seceduling.................
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date dateobj = new Date();
        String current = df.format(dateobj);

        if (current.equals(timeofelection)) {
            //database.....................
            String sql = "select address from login where aadharno=? and pass=? and mobileno2=?";

            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/voting", "root", "123456");
                pst = con.prepareStatement(sql);

                pst.setString(1, aadharno.getText());
                pst.setString(2, password.getText());
                pst.setString(3, mobileno.getText());

                rs = pst.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "login Succesfully");
                    Random ran = new Random();

                    int a = ran.nextInt();
                    a = a % 1000000;
                    while (a < 0) {
                        a = a * (-1);
                    }
                    OTPs = Integer.toString(a);

                    //sending OTP section................................................
                    System.out.print(OTPs);
                    /////////////////////////////////////////////////////////////////////////////////
                    try {
                        // Construct data
                        String data = "";
                        /*
             * Note the suggested encoding for certain parameters, notably
             * the username, password and especially the message.  ISO-8859-1
             * is essentially the character set that we use for message bodies,
             * with a few exceptions for e.g. Greek characters.  For a full list,
             * see:  http://developer.bulksms.com/eapi/submission/character-encoding/
                         */
                        data += "username=" + URLEncoder.encode("nagpal", "ISO-8859-1");
                        data += "&password=" + URLEncoder.encode("123456789", "ISO-8859-1");
                        data += "&message=" + URLEncoder.encode("Recieved Rs.1325 from Naveen (99xxxxx541) in your Paytm Wallet.Wallet txn id 18503066612.", "ISO-8859-1");
                        data += "&want_report=1";
                        data += "&msisdn=91" + "7087959641" + "";

                        // Send data
                        // Please see the FAQ regarding HTTPS (port 443) and HTTP (port 80/5567)
                        URL url = new URL("https://bulksms.vsms.net/eapi/submission/send_sms/2/2.0");

                        URLConnection conn = url.openConnection();
                        conn.setDoOutput(true);
                        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
                        wr.write(data);
                        wr.flush();

                        // Get the response
                        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                        String line;
                        while ((line = rd.readLine()) != null) {

                        }
                        wr.close();
                        rd.close();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                        e.printStackTrace();
                    }

                    ///////////////////////////////////////////////////
                    mobileno.setText("");
                    password.setText("");
                    mobileno.setText("");
                    String OTPinput = JOptionPane.showInputDialog(null, "enter the 6 digit OTP", "OTP ", QUESTION_MESSAGE);

                    if (OTPs.equals(OTPinput)) {
                        JOptionPane.showConfirmDialog(rootPane, "logined succesfully");

                    } else {
                        String d = "invalid otp............Exiting Now";
                        JOptionPane.showMessageDialog(null, d, "Invalid otp .....", WARNING_MESSAGE);
                        System.exit(1);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Entered Details are Wrong");
                    System.exit(0);
                }

                con.close();
                stmt.close();
                rs.close();
                pst.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "today is not a voting day meet us on " + timeofelection);
            System.exit(1);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Result re = new Result();
        re.show(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void mobilenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobilenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobilenoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Candidate reg = new Candidate();
        reg.show();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ANAME;
    private javax.swing.JLabel AUID;
    private javax.swing.JLabel DATEl1;
    private javax.swing.JLabel TITLE;
    private javax.swing.JTextField aadharno;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField mobileno;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel time;
    private javax.swing.JLabel timel;
    // End of variables declaration//GEN-END:variables
}
