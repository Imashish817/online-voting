
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author GUV SOFTWORLD
 */
public class vote extends javax.swing.JFrame {

    String aadharnor;
    int flag1;
    static int count = 0;

    /**
     * Creates new form vote
     */
    public vote() {

    }

    public vote(String s) {
        initComponents();
        setBounds(new java.awt.Rectangle(1, 1, 899, 550));
        setResizable(false);
        setTitle("Geniun Candidates For Voting..........");
        a.setText(s);
        aadharnor = s;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        name5 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        party4 = new javax.swing.JLabel();
        party3 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        party5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        party1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        party2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton2.setText("Vote");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 330, 73, 23);

        jButton3.setText("Vote");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(420, 330, 73, 23);

        jButton1.setText("Vote");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 330, 73, 20);

        jButton4.setText("Vote");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(580, 330, 73, 23);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Naina_Lal_Kidwai.jpg"))); // NOI18N
        jLabel5.setText("jLabel1");
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(721, 69, 117, 146);

        jButton5.setText("Vote");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(750, 330, 73, 23);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/download (2).jpg"))); // NOI18N
        jLabel7.setText("jLabel1");
        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(560, 70, 117, 146);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/images.jpg"))); // NOI18N
        jLabel8.setText("jLabel1");
        jLabel8.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 70, 117, 146);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setForeground(new java.awt.Color(102, 0, 102));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/download (1).jpg"))); // NOI18N
        jLabel9.setText("jLabel1");
        jLabel9.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(400, 70, 117, 146);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/download.jpg"))); // NOI18N
        jLabel3.setText("jLabel1");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 69, 117, 146);

        name1.setText("Ram singh");
        getContentPane().add(name1);
        name1.setBounds(80, 230, 117, 22);

        name5.setText("Hardeep Kaur");
        getContentPane().add(name5);
        name5.setBounds(721, 221, 117, 31);

        name4.setText("Samarpreet Singh");
        getContentPane().add(name4);
        name4.setBounds(560, 220, 117, 29);

        name3.setText("Samarpreet Singh");
        getContentPane().add(name3);
        name3.setBounds(400, 230, 117, 14);

        jLabel11.setText("REG ID : 4256");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(720, 280, 117, 28);

        party4.setText("Aam Aadami Party");
        getContentPane().add(party4);
        party4.setBounds(560, 250, 117, 21);

        party3.setText("Congress");
        getContentPane().add(party3);
        party3.setBounds(400, 250, 117, 21);

        id1.setText("REG ID : 1234");
        getContentPane().add(id1);
        id1.setBounds(80, 280, 117, 34);

        party5.setText("BJP");
        getContentPane().add(party5);
        party5.setBounds(721, 258, 72, 14);

        jLabel17.setText("REG ID : 1789");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(560, 290, 117, 14);

        jLabel18.setText("REG ID : 1256");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(400, 280, 117, 42);

        party1.setText("BJP");
        getContentPane().add(party1);
        party1.setBounds(80, 254, 117, 23);

        name2.setText("Hardeep Kaur");
        getContentPane().add(name2);
        name2.setBounds(250, 230, 117, 14);

        party2.setText("Akali Dal");
        getContentPane().add(party2);
        party2.setBounds(250, 250, 117, 21);

        jLabel19.setText("REG ID : 1512");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(250, 280, 117, 34);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("                            Candidate For Election 2018-23           ");
        jLabel14.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel14);
        jLabel14.setBounds(80, 20, 760, 40);

        jLabel15.setText("Logined as: ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(350, 410, 70, 14);

        a.setText("jLabel20");
        getContentPane().add(a);
        a.setBounds(420, 410, 170, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/abstract-2597264_960_720.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 880, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection conn = null;

        java.sql.Statement stmt = null;

        java.sql.Statement stmt2 = null;
        java.sql.Statement stmt3 = null;
        java.sql.Statement stmt4 = null;

        ResultSet rs2;
        ResultSet rs3;
        ResultSet rs4;

        String sql = "Select count from result where id=1234";

        String sql3 = "select flag from login where aadharno = " + aadharnor;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/voting", "root", "123456");
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql3);

            while (rs.next()) {
                flag1 = rs.getInt("flag");

            }
            stmt4 = conn.createStatement();
            rs4 = stmt4.executeQuery(sql);
            while (rs4.next()) {
                count = rs4.getInt("count");

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (flag1 == 1) {
            String b = "Confirm to vote\n write CONFIRM in below box";
            String OTP = "CONFIRM";
            String OTP2 = JOptionPane.showInputDialog(null, b, " ", QUESTION_MESSAGE);
            if (OTP2.equals(OTP)) {
                String name = name1.getText();
                String party = party1.getText();

                String c = "you have Succesfully voted to " + name + " (" + party + ")";
                JOptionPane.showMessageDialog(null, c);
                count = count + 1;
                ;
                String sql2 = "update result set count= " + count + " where id=1234";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    stmt2 = conn.createStatement();
                    stmt2.executeUpdate(sql2);

                    stmt.close();
                    String sql5 = "update login set flag= 0 where aadharno= " + aadharnor;

                    Class.forName("com.mysql.jdbc.Driver");

                    stmt3 = conn.createStatement();

                    stmt3.executeUpdate(sql5);
                    System.exit(0);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                String d = "invalid otp";
                JOptionPane.showMessageDialog(null, d, "Invalid otp", WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You Have Used Your Voting Power.......");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection conn = null;

        java.sql.Statement stmt = null;

        java.sql.Statement stmt2 = null;
        java.sql.Statement stmt3 = null;
        java.sql.Statement stmt4 = null;

        ResultSet rs2;
        ResultSet rs3;
        ResultSet rs4;

        String sql = "Select count from result where id=1512";

        String sql3 = "select flag from login where aadharno = " + aadharnor;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/voting", "root", "123456");
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql3);

            while (rs.next()) {
                flag1 = rs.getInt("flag");

            }
            stmt4 = conn.createStatement();
            rs4 = stmt4.executeQuery(sql);
            while (rs4.next()) {
                count = rs4.getInt("count");

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (flag1 == 1) {
            String b = "Confirm to vote\n write CONFIRM in below box";
            String OTP = "CONFIRM";
            String OTP2 = JOptionPane.showInputDialog(null, b, " ", QUESTION_MESSAGE);
            if (OTP2.equals(OTP)) {
                String name = name2.getText();
                String party = party2.getText();

                String c = "you have Succesfully voted to " + name + " (" + party + ")";
                JOptionPane.showMessageDialog(null, c);
                count = count + 1;
                ;
                String sql2 = "update result set count= " + count + " where id=1512";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    stmt2 = conn.createStatement();
                    stmt2.executeUpdate(sql2);

                    stmt.close();
                    String sql5 = "update login set flag= 0 where aadharno= " + aadharnor;

                    Class.forName("com.mysql.jdbc.Driver");

                    stmt3 = conn.createStatement();

                    stmt3.executeUpdate(sql5);
                    System.exit(0);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                String d = "invalid otp";
                JOptionPane.showMessageDialog(null, d, "Invalid otp", WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You Have Used Your Voting Power.......");
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Connection conn = null;

        java.sql.Statement stmt = null;

        java.sql.Statement stmt2 = null;
        java.sql.Statement stmt3 = null;
        java.sql.Statement stmt4 = null;

        ResultSet rs2;
        ResultSet rs3;
        ResultSet rs4;

        String sql = "Select count from result where id=1256";

        String sql3 = "select flag from login where aadharno = " + aadharnor;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/voting", "root", "123456");
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql3);

            while (rs.next()) {
                flag1 = rs.getInt("flag");

            }
            stmt4 = conn.createStatement();
            rs4 = stmt4.executeQuery(sql);
            while (rs4.next()) {
                count = rs4.getInt("count");

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (flag1 == 1) {
            String b = "Confirm to vote\n write CONFIRM in below box";
            String OTP = "CONFIRM";
            String OTP2 = JOptionPane.showInputDialog(null, b, " ", QUESTION_MESSAGE);
            if (OTP2.equals(OTP)) {
                String name = name3.getText();
                String party = party3.getText();

                String c = "you have Succesfully voted to " + name + " (" + party + ")";
                JOptionPane.showMessageDialog(null, c);
                count = count + 1;
                ;
                String sql2 = "update result set count= " + count + " where id=1256";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    stmt2 = conn.createStatement();
                    stmt2.executeUpdate(sql2);

                    stmt.close();
                    String sql5 = "update login set flag= 0 where aadharno= " + aadharnor;

                    Class.forName("com.mysql.jdbc.Driver");

                    stmt3 = conn.createStatement();

                    stmt3.executeUpdate(sql5);
                    System.exit(0);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                String d = "invalid otp";
                JOptionPane.showMessageDialog(null, d, "Invalid otp", WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You Have Used Your Voting Power.......");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Connection conn = null;

        java.sql.Statement stmt = null;

        java.sql.Statement stmt2 = null;
        java.sql.Statement stmt3 = null;
        java.sql.Statement stmt4 = null;

        ResultSet rs2;
        ResultSet rs3;
        ResultSet rs4;

        String sql = "Select count from result where id=1789";

        String sql3 = "select flag from login where aadharno = " + aadharnor;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/voting", "root", "123456");
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql3);

            while (rs.next()) {
                flag1 = rs.getInt("flag");

            }
            stmt4 = conn.createStatement();
            rs4 = stmt4.executeQuery(sql);
            while (rs4.next()) {
                count = rs4.getInt("count");

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (flag1 == 1) {
            String b = "Confirm to vote\n write CONFIRM in below box";
            String OTP = "CONFIRM";
            String OTP2 = JOptionPane.showInputDialog(null, b, " ", QUESTION_MESSAGE);
            if (OTP2.equals(OTP)) {
                String name = name4.getText();
                String party = party4.getText();

                String c = "you have Succesfully voted to " + name + " (" + party + ")";
                JOptionPane.showMessageDialog(null, c);
                count = count + 1;
                ;
                String sql2 = "update result set count= " + count + " where id=1789";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    stmt2 = conn.createStatement();
                    stmt2.executeUpdate(sql2);

                    stmt.close();
                    String sql5 = "update login set flag= 0 where aadharno= " + aadharnor;

                    Class.forName("com.mysql.jdbc.Driver");

                    stmt3 = conn.createStatement();

                    stmt3.executeUpdate(sql5);
                    System.exit(0);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                String d = "invalid otp";
                JOptionPane.showMessageDialog(null, d, "Invalid otp", WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You Have Used Your Voting Power.......");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Connection conn = null;

        java.sql.Statement stmt = null;

        java.sql.Statement stmt2 = null;
        java.sql.Statement stmt3 = null;
        java.sql.Statement stmt4 = null;

        ResultSet rs2;
        ResultSet rs3;
        ResultSet rs4;

        String sql = "Select count from result where id=4256";

        String sql3 = "select flag from login where aadharno = " + aadharnor;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/voting", "root", "123456");
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql3);

            while (rs.next()) {
                flag1 = rs.getInt("flag");

            }
            stmt4 = conn.createStatement();
            rs4 = stmt4.executeQuery(sql);
            while (rs4.next()) {
                count = rs4.getInt("count");

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (flag1 == 1) {
            String b = "Confirm to vote\n write CONFIRM in below box";
            String OTP = "CONFIRM";
            String OTP2 = JOptionPane.showInputDialog(null, b, " ", QUESTION_MESSAGE);
            if (OTP2.equals(OTP)) {
                String name = name5.getText();
                String party = party5.getText();

                String c = "you have Succesfully voted to " + name + " (" + party + ")";
                JOptionPane.showMessageDialog(null, c);
                count = count + 1;
                ;
                String sql2 = "update result set count= " + count + " where id=4256";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    stmt2 = conn.createStatement();
                    stmt2.executeUpdate(sql2);

                    stmt.close();
                    String sql5 = "update login set flag= 0 where aadharno= " + aadharnor;

                    Class.forName("com.mysql.jdbc.Driver");

                    stmt3 = conn.createStatement();

                    stmt3.executeUpdate(sql5);
                    System.exit(0);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                String d = "invalid otp";
                JOptionPane.showMessageDialog(null, d, "Invalid otp", WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You Have Used Your Voting Power.......");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel party1;
    private javax.swing.JLabel party2;
    private javax.swing.JLabel party3;
    private javax.swing.JLabel party4;
    private javax.swing.JLabel party5;
    // End of variables declaration//GEN-END:variables
}
