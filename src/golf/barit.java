/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golf;
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
/**
 *
 * @author LEVY
 */
public class barit extends javax.swing.JFrame {

    /**
     * Creates new form barit
     */
    public barit() {
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
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        qt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        it = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ADD ITEM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

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

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Quantity");

        qt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        qt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Item Name");

        it.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        it.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qt, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(it, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(it, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(qt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(70, 60, 480, 200);

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
        jButton3.setBounds(150, 290, 150, 40);

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
        jButton4.setBounds(320, 290, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/golf/hotel.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 630, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(it.getText().trim().isEmpty()||qt.getText().trim().isEmpty()  ){
            showMessageDialog(null, "NAME FIELD IS EMPTY!!!\n\n PLEASE,INPUT THE FIELDS", "GOLF HOTEL KAKAMEGA", ERROR_MESSAGE);
        }

        else{

            PreparedStatement st;
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/golf", "root", "");
                String sqls = "SELECT `qtt` FROM bar WHERE item = '"+it.getText()+"'";
                st = con.prepareStatement(sqls);
                ResultSet rs = st.executeQuery(sqls);
                if(rs.next()==true)
                {
                    int a =Integer.parseInt(rs.getString("qtt"));
                    int b = Integer.parseInt(qt.getText());
                    int tot=a+b;
                    try{
                        // PreparedStatement st;

                        Class.forName("com.mysql.cj.jdbc.Driver");
                        //  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/golf", "root", "");
                        String sql = "UPDATE `bar` SET `qtt`=? WHERE item='"+it.getText()+"'";
                        st = con.prepareStatement(sql);
                        st.setString(1, ""+tot);

                        if(st.executeUpdate()>0){
                            JOptionPane.showMessageDialog(null, "Update Successful");
                            barit l = new barit();
                            l.setVisible(true);
                            this.setVisible(false);
                        }

                        con.close();
                    }catch(SQLException | ClassNotFoundException ex){
                        Logger.getLogger(rr.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{

                    try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        String sql = "INSERT INTO `bar`(`item`, `qtt`)VALUES (?,?)";
                        //java.sql.PreparedStatement st;
                        st = con.prepareStatement(sql);

                        st.setString(1,  it.getText());
                        st.setString(2,  qt.getText());
                        //ResultSet rs = st.executeUpdate(sql);
                        if(st.executeUpdate()>0){
                            JOptionPane.showMessageDialog(null, "Item Successfully Registered");
                            barit l = new barit();
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

    private void qtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == keyEvent.VK_DELETE))) {
            evt.consume();

        } else if (qt.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_qtKeyTyped

    private void itKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itKeyReleased

    }//GEN-LAST:event_itKeyReleased

    private void itKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itKeyTyped
        it.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));

                }
            }

        });
    }//GEN-LAST:event_itKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        barit a = new barit();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        bar d = new bar();
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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(barit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField it;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField qt;
    // End of variables declaration//GEN-END:variables
}
