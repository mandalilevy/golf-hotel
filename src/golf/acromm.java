/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golf;
import golf.acc;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author LEVY
 */
public class acromm extends javax.swing.JFrame {

    /**
     * Creates new form acromm
     */
    public acromm() {
        initComponents();
setIcon();
           Dimension screenSize,frameSize;
int x,y;
screenSize=Toolkit.getDefaultToolkit().getScreenSize();
frameSize=getSize();
x=(screenSize.width-frameSize.width)/2;
y=(screenSize.height-frameSize.height)/2;
setLocation(x, y);
lec();
    }
private void setIcon() {
       //JFrame frame = new JFrame("Title of Frame");
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("golf.png"))); //To change body of generated methods, choose Tools | Templates.
    }
public Void lec(){
        try{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/golf", "root", "");
         String query = "SELECT `name` FROM `room`";
         PreparedStatement st;
         st = con.prepareStatement(query);
         ResultSet rs = st.executeQuery();
         while(rs.next()){
         disp.addItem(rs.getString("name"));
         }
   }
   catch(SQLException ex){
         Logger.getLogger(acc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        disp = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "NEW ROOM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("ROOM NAME");

        name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        disp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        disp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Rooms" }));
        disp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/golf/save.png"))); // NOI18N
        jButton1.setText("SAVE");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/golf/edit.png"))); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("ROOM NUMBER");

        no.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(disp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(disp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(90, 40, 410, 240);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/golf/Clear-icon.png"))); // NOI18N
        jButton3.setText("REFRESH");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(150, 280, 160, 50);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/golf/back-icon.png"))); // NOI18N
        jButton4.setText("BACK");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(310, 280, 140, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/golf/hotel.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 580, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        name.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));

                }
            }

        });
    }//GEN-LAST:event_nameKeyTyped

    private void dispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispActionPerformed

        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/golf", "root", "");
            String query = "SELECT `name`,`id` FROM `room` where name='"+disp.getSelectedItem()+"'";
            PreparedStatement st;
            st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                no.setText(rs.getString("id"));
                name.setText(rs.getString("name"));

            }
        }
        catch(SQLException ex){
            Logger.getLogger(acc.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_dispActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(name.getText().trim().isEmpty()||no.getText().trim().isEmpty() ){
            showMessageDialog(null, "NAME FIELD IS EMPTY!!!\n\n PLEASE,INPUT THE FIELDS", "GOLF HOTEL KAKAMEGA", ERROR_MESSAGE);
        }

        else{

            PreparedStatement st;
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/golf", "root", "");
                String sqls = "SELECT * FROM room WHERE id = '"+no.getText()+"' or name = '"+name.getText()+"'";
                st = con.prepareStatement(sqls);
                ResultSet rs = st.executeQuery(sqls);
                if(rs.next()==true)
                {
                    //showMessageDialog(null, "USERNAME AND PASSWORD FIELDS ARE EMPTY!!!\n\n PLEASE,INPUT THE FIELDS", "PHARMACY INFORMATION MANAGEMENT SYSTEM", ERROR_MESSAGE);
                    showMessageDialog(null, "Room  is already registered into the System", "GOLF HOTEL KAKAMEGA", ERROR_MESSAGE);
                    acromm l = new acromm();
                    l.setVisible(true);
                    this.setVisible(false);
                }
                else{
                    String nm = name.getText();

                    try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        String sql = "INSERT INTO `room`(`id`,`name`) VALUES (?,?)";
                        //java.sql.PreparedStatement st;
                        st = con.prepareStatement(sql);
                        st.setString(1, no.getText());
                        st.setString(2,nm);

                        //ResultSet rs = st.executeUpdate(sql);
                        if(st.executeUpdate()>0){
                            JOptionPane.showMessageDialog(null, "Room Successfully Registered");
                            acromm l = new acromm();
                            l.setVisible(true);
                            this.setVisible(false);
                        }

                        con.close();
                    }catch(SQLException ex){
                        Logger.getLogger(acc.class.getName()).log(Level.SEVERE, null, ex);
                    }   catch (ClassNotFoundException ex) {
                        Logger.getLogger(acc.class.getName()).log(Level.SEVERE, null, ex);
                    } }
                    /*catch (SQLException ex) {
                        Logger.getLogger(adminregister.class.getName()).log(Level.SEVERE, null, ex);
                    }*/}
                    catch (SQLException ex) {
                        Logger.getLogger(acc.class.getName()).log(Level.SEVERE, null, ex);
                    }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(name.getText().trim().isEmpty()||no.getText().trim().isEmpty() ){
            showMessageDialog(null, "NAME FIELD IS EMPTY!!!\n\n PLEASE,INPUT THE FIELDS", "GOLF HOTEL KAKAMEGA", ERROR_MESSAGE);
        }
        else{
            String nm = name.getText();

            try{

                PreparedStatement st;

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/golf", "root", "");

                ResultSet rs ;
                Class.forName("com.mysql.cj.jdbc.Driver");
                String sql = "UPDATE `room` SET `name`=? WHERE id ='"+no.getText()+"'";
                //java.sql.PreparedStatement st;
                st = con.prepareStatement(sql);
                st.setString(1, nm);

                //ResultSet rs = st.executeUpdate(sql);
                if(st.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "Update Successful");
                    acromm l = new acromm();
                    l.setVisible(true);
                    this.setVisible(false);
                }
                else{
                 JOptionPane.showMessageDialog(null, "ROOM DOES NOT EXIST, SAVE BEFORE UPDATING");
                }
                con.close();
            }catch(SQLException ex){
                Logger.getLogger(acc.class.getName()).log(Level.SEVERE, null, ex);
            }   catch (ClassNotFoundException ex) {
                Logger.getLogger(acc.class.getName()).log(Level.SEVERE, null, ex);
            } }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        acromm a = new acromm();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        accom d = new accom();
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(acromm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(acromm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(acromm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(acromm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new acromm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> disp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name;
    private javax.swing.JTextField no;
    // End of variables declaration//GEN-END:variables
}
