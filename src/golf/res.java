/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golf;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
/**
 *
 * @author LEVY
 */
public class res extends javax.swing.JFrame {

    /**
     * Creates new form res
     */
    public res() {
        initComponents();
    setIcon();
           Dimension screenSize,frameSize;
int x,y;
screenSize=Toolkit.getDefaultToolkit().getScreenSize();
frameSize=getSize();
x=(screenSize.width-frameSize.width)/2;
y=(screenSize.height-frameSize.height)/2;
setLocation(x, y);

    }
private void setIcon() {
       //JFrame frame = new JFrame("Title of Frame");
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("golf.png"))); //To change body of generated methods, choose Tools | Templates.
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
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        pasword = new javax.swing.JPasswordField();
        err1 = new javax.swing.JTextField();
        err2 = new javax.swing.JTextField();
        sh = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "RESET PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("New Password");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("User Name");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jLabel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel4KeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/golf/edit.png"))); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        user.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        user.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userKeyReleased(evt);
            }
        });

        pasword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pasword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pasword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paswordKeyTyped(evt);
            }
        });

        err1.setEditable(false);
        err1.setBackground(new java.awt.Color(255, 255, 255));
        err1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        err1.setForeground(new java.awt.Color(153, 0, 0));
        err1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        err1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        err2.setEditable(false);
        err2.setBackground(new java.awt.Color(255, 255, 255));
        err2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        err2.setForeground(new java.awt.Color(153, 0, 0));
        err2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        err2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        sh.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        sh.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sh))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(pasword)
                            .addComponent(err1)
                            .addComponent(err2))))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(err1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pasword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(err2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(sh))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 30, 530, 250);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/golf/back-icon.png"))); // NOI18N
        jButton5.setText("BACK");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(220, 280, 140, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/golf/hotel.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 580, 340);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel4KeyPressed

    }//GEN-LAST:event_jLabel4KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(user.getText().trim().isEmpty() && pasword.getText().trim().isEmpty()){
            err1.setText("Username is Empty");
            err2.setText("Password is Empty");}
        else if (user.getText().trim().isEmpty()){
            err1.setText("Please Enter your Username");
        }
        else if (pasword.getText().trim().isEmpty()){
            err2.setText("Please Enter your Password");
        }
      
        else{

            PreparedStatement st;
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/golf", "root", "");
                String sqls = "SELECT * FROM login WHERE user = '"+user.getText()+"'";
                // java.sql.PreparedStatement st;
                st = con.prepareStatement(sqls);
                //st.setString(1, user.getText());
                ResultSet rs = st.executeQuery(sqls);
                if(rs.next()!=true)
                {
                    JOptionPane.showMessageDialog(null, ""+user.getText()+", Does Not Exist in the System!!!!\n\nYou Might Have Not Been Registered into the System", "GOLF HOTEL", ERROR_MESSAGE);
                    user.setText("");
                    pasword.setText("");
                }
                else{
                    String name = user.getText();
                    String pass = pasword.getText();

                    try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/global", "root", "");
                        //   java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy", "root", "");
                        String sql = "UPDATE `login` SET `user`=?,`pass`=? WHERE user = '"+user.getText()+"'";
                        //java.sql.PreparedStatement st;
                        st = con.prepareStatement(sql);
                        st.setString(1, name);
                        st.setString(2, pass);

                        //ResultSet rs = st.executeUpdate(sql);
                        if(st.executeUpdate()>0){
                            JOptionPane.showMessageDialog(null, "Password Successfully Changed");
                            login l = new login();
                            l.setVisible(true);
                            this.setVisible(false);
                        }
                        //                        else{
                            //                            JOptionPane.showMessageDialog(null, "YOU ARE ALREADY REGISTERED INTO THE SYSTEM");
                            //                            user.setText("");
                            //                            pasword.setText("");
                            //                        }
                        con.close();
                    }catch(SQLException ex){
                        Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                    }   catch (ClassNotFoundException ex) {
                        Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                    } }
                    /*catch (SQLException ex) {
                        Logger.getLogger(adminregister.class.getName()).log(Level.SEVERE, null, ex);
                    }*/}
                    catch (SQLException ex) {
                        Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                    }}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pasword.requestFocus();
        }
    }//GEN-LAST:event_userKeyPressed

    private void userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyReleased
        err1.setText("");
    }//GEN-LAST:event_userKeyReleased

    private void paswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paswordKeyReleased
        err2.setText("");
    }//GEN-LAST:event_paswordKeyReleased

    private void paswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paswordKeyTyped

    }//GEN-LAST:event_paswordKeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        login l = new login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new res().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField err1;
    private javax.swing.JTextField err2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pasword;
    private javax.swing.JLabel sh;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
