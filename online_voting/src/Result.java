
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Result extends javax.swing.JFrame {

    public Result() {

        initComponents();
        setBounds(new java.awt.Rectangle(1, 1, 825, 470));
        setResizable(false);
        setTitle("Current Status");

        Connection conn = null;

        ResultSet rs = null;
        ResultSet rs2 = null;
        ResultSet r3s = null;
        ResultSet rs4 = null;
        ResultSet rs5 = null;
        java.sql.Statement stmt = null;
        java.sql.Statement stmt2 = null;
        java.sql.Statement stmt3 = null;
        java.sql.Statement stmt4 = null;
        java.sql.Statement stmt5 = null;

        try {
            String sql = "select count,name,party,id from result where id=1234;";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/voting", "root", "123456");
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            // JOptionPane.showMessageDialog(null,"executed");
            while (rs.next()) {
                // JOptionPane.showMessageDialog(null,"in while");
                int count = rs.getInt("count");
                String counts = Integer.toString(count);
                String name = rs.getString("name");
                String party = rs.getString("party");
                String id = Integer.toString(rs.getInt("id"));
                aa1.setText(name);
                aa2.setText(party);
                aa3.setText(id);
                aa4.setText(counts);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex);
        }

        try {
            String sql = "select count,name,party,id from result where id = 1512;";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/voting", "root", "123456");
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            // JOptionPane.showMessageDialog(null,"executed");
            while (rs.next()) {
                // JOptionPane.showMessageDialog(null,"in while");
                int count = rs.getInt("count");
                String counts = Integer.toString(count);
                String name = rs.getString("name");
                String party = rs.getString("party");
                String id = Integer.toString(rs.getInt("id"));
                a1.setText(name);
                a2.setText(party);
                a3.setText(id);
                a4.setText(counts);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex);
        }

        try {
            String sql = "select count,name,party,id from result where id=1256;";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/voting", "root", "123456");
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            //JOptionPane.showMessageDialog(null,"executed");
            while (rs.next()) {
                // JOptionPane.showMessageDialog(null,"in while");
                int count = rs.getInt("count");
                String counts = Integer.toString(count);
                String name = rs.getString("name");
                String party = rs.getString("party");
                String id = Integer.toString(rs.getInt("id"));
                b1.setText(name);
                b2.setText(party);
                b3.setText(id);
                b4.setText(counts);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex);
        }

        try {
            String sql = "select count,name,party,id from result where id=1789;";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/voting", "root", "123456");
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            // JOptionPane.showMessageDialog(null,"executed");
            while (rs.next()) {
                // JOptionPane.showMessageDialog(null,"in while");
                int count = rs.getInt("count");
                String counts = Integer.toString(count);
                String name = rs.getString("name");
                String party = rs.getString("party");
                String id = Integer.toString(rs.getInt("id"));
                c1.setText(name);
                c2.setText(party);
                c3.setText(id);
                c4.setText(counts);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex);
        }

        try {
            String sql = "select count,name,party,id from result where id=4256;";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/voting", "root", "123456");
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            // JOptionPane.showMessageDialog(null,"executed");
            while (rs.next()) {
                //   JOptionPane.showMessageDialog(null,"in while");
                int count = rs.getInt("count");
                String counts = Integer.toString(count);
                String name = rs.getString("name");
                String party = rs.getString("party");
                String id = Integer.toString(rs.getInt("id"));
                d1.setText(name);
                d2.setText(party);
                d3.setText(id);
                d4.setText(counts);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex);
        }

        try {
            int no = 0;
            String sql7 = "select count(*) from login";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/voting", "root", "123456");
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql7);
            // JOptionPane.showMessageDialog(null,"executed");
            while (rs.next()) {

                no = rs.getInt(1);
                // percentage.setText("Total no of voters are :"+no);
            }
            String sql8 = " select count(*) from login where flag=0;";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql8);
            //JOptionPane.showMessageDialog(null,"executed");
            while (rs.next()) {

                int voted = rs.getInt(1);
                float nof = (float) no;
                float votedf = (float) voted;
                double per = nof / votedf;
                DecimalFormat dec = new DecimalFormat("#0.00");
                percentage.setText("Total no of voters are :" + no + "    Total no Voters voted are :" + voted + "    Voting Percentage is : " + dec.format(per) + "%");

                System.out.print(per);
            }
        } catch (Exception ex) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        aa4 = new javax.swing.JLabel();
        aa3 = new javax.swing.JLabel();
        aa2 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        aa1 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();
        f2 = new javax.swing.JLabel();
        f3 = new javax.swing.JLabel();
        f4 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        percentage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("           CURRENT VOTING SCENARIO :");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 50, 530, 32);

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 110, 110, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel4.setText("ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(540, 110, 50, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel5.setText("Name of Party");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(330, 110, 180, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel6.setText("Count");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(640, 110, 100, 30);
        getContentPane().add(aa4);
        aa4.setBounds(640, 150, 90, 30);
        getContentPane().add(aa3);
        aa3.setBounds(520, 150, 90, 30);
        getContentPane().add(aa2);
        aa2.setBounds(360, 150, 90, 30);
        getContentPane().add(a1);
        a1.setBounds(180, 200, 90, 30);
        getContentPane().add(a2);
        a2.setBounds(360, 200, 90, 30);
        getContentPane().add(a3);
        a3.setBounds(520, 200, 90, 30);
        getContentPane().add(a4);
        a4.setBounds(640, 200, 90, 30);
        getContentPane().add(b1);
        b1.setBounds(180, 240, 140, 30);
        getContentPane().add(b2);
        b2.setBounds(360, 240, 90, 30);
        getContentPane().add(b3);
        b3.setBounds(520, 240, 90, 30);
        getContentPane().add(b4);
        b4.setBounds(640, 240, 90, 30);
        getContentPane().add(c1);
        c1.setBounds(180, 280, 150, 30);
        getContentPane().add(c2);
        c2.setBounds(360, 280, 90, 30);
        getContentPane().add(c3);
        c3.setBounds(520, 280, 90, 30);
        getContentPane().add(c4);
        c4.setBounds(640, 280, 90, 30);
        getContentPane().add(d2);
        d2.setBounds(360, 320, 90, 30);
        getContentPane().add(aa1);
        aa1.setBounds(180, 150, 90, 30);
        getContentPane().add(d3);
        d3.setBounds(520, 320, 90, 30);
        getContentPane().add(d4);
        d4.setBounds(640, 320, 90, 30);
        getContentPane().add(f2);
        f2.setBounds(360, 400, 90, 30);
        getContentPane().add(f3);
        f3.setBounds(520, 400, 90, 30);
        getContentPane().add(f4);
        f4.setBounds(640, 400, 90, 30);
        getContentPane().add(d1);
        d1.setBounds(180, 320, 130, 30);

        percentage.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        percentage.setText("jLabel7");
        getContentPane().add(percentage);
        percentage.setBounds(0, 390, 820, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\abstract-2597264_960_720.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 820, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel aa1;
    private javax.swing.JLabel aa2;
    private javax.swing.JLabel aa3;
    private javax.swing.JLabel aa4;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel d4;
    private javax.swing.JLabel f2;
    private javax.swing.JLabel f3;
    private javax.swing.JLabel f4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel percentage;
    // End of variables declaration//GEN-END:variables
}
