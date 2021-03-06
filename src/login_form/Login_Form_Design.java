/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_form;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Vinh Mai
 */
public class Login_Form_Design extends javax.swing.JFrame {

    /**
     * Creates new form Login_Form_Design
     */
    public Login_Form_Design() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        minimize_icon = new javax.swing.JLabel();
        close_icon = new javax.swing.JLabel();
        signin_area = new javax.swing.JPanel();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        forgot_pass_text = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        signin_button = new javax.swing.JPanel();
        signin_text_button = new javax.swing.JLabel();
        signin_text_area = new javax.swing.JLabel();
        signup_area = new javax.swing.JPanel();
        signup_area = new javax.swing.JPanel();
        create_account = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        n_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        n_pass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        n_name = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        signup_button = new javax.swing.JPanel();
        signup_text_button = new javax.swing.JLabel();
        next_signin_panel = new javax.swing.JPanel();
        signup_panel = new javax.swing.JPanel();
        signup_text = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        background_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 100));
        setUndecorated(true);

        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_form/img/down_icon.png"))); // NOI18N
        minimize_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize_iconMouseClicked(evt);
            }
        });
        backgroundPanel.add(minimize_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 30));

        close_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_form/img/close_icon_1.png"))); // NOI18N
        close_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                close_iconMousePressed(evt);
            }
        });
        backgroundPanel.add(close_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 30));

        signin_area.setBackground(new java.awt.Color(255, 255, 255));
        signin_area.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setText("Email");
        email.setBorder(null);
        signin_area.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 320, 50));

        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(102, 102, 102));
        password.setText("Password");
        password.setBorder(null);
        password.setCaretColor(new java.awt.Color(153, 153, 153));
        signin_area.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 310, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_form/img/pass_icon_1.png"))); // NOI18N
        signin_area.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 270, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_form/img/email_icon.png"))); // NOI18N
        signin_area.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 40, 30));
        signin_area.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 300, 20));
        signin_area.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 300, 20));

        forgot_pass_text.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        forgot_pass_text.setForeground(new java.awt.Color(102, 102, 102));
        forgot_pass_text.setText("Forgot your password?");
        signin_area.add(forgot_pass_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 190, 30));
        signin_area.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 160, 30));

        signin_button.setBackground(new java.awt.Color(0, 51, 102));

        signin_text_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signin_text_button.setForeground(new java.awt.Color(255, 255, 255));
        signin_text_button.setText("SIGN IN");

        javax.swing.GroupLayout signin_buttonLayout = new javax.swing.GroupLayout(signin_button);
        signin_button.setLayout(signin_buttonLayout);
        signin_buttonLayout.setHorizontalGroup(
            signin_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signin_buttonLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(signin_text_button)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        signin_buttonLayout.setVerticalGroup(
            signin_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signin_text_button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        signin_area.add(signin_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 270, 80));

        signin_text_area.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        signin_text_area.setForeground(new java.awt.Color(0, 51, 102));
        signin_text_area.setText("Sign in to APP");
        signin_area.add(signin_text_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 280, 50));

        backgroundPanel.add(signin_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 500, 610));

        signup_area.setBackground(new java.awt.Color(255, 255, 255));
        signup_area.setBackground(new java.awt.Color(255, 255, 255));
        signup_area.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        signup_area.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        signup_area.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_account.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        create_account.setForeground(new java.awt.Color(0, 51, 102));
        create_account.setText("Create Account");
        signup_area.add(create_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 280, 50));
        signup_area.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 300, 20));

        n_email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n_email.setForeground(new java.awt.Color(102, 102, 102));
        n_email.setText("Email");
        n_email.setBorder(null);
        signup_area.add(n_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 320, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_form/img/email_icon.png"))); // NOI18N
        signup_area.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 40, 30));
        signup_area.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 300, 20));

        n_pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n_pass.setForeground(new java.awt.Color(102, 102, 102));
        n_pass.setText("Password");
        n_pass.setBorder(null);
        n_pass.setCaretColor(new java.awt.Color(153, 153, 153));
        signup_area.add(n_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 310, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_form/img/pass_icon_1.png"))); // NOI18N
        signup_area.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 370, 30, 40));

        n_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n_name.setForeground(new java.awt.Color(102, 102, 102));
        n_name.setText("Name");
        n_name.setBorder(null);
        signup_area.add(n_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 320, 50));
        signup_area.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 300, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_form/img/name_icon_2.png"))); // NOI18N
        signup_area.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 230, -1, 40));

        signup_button.setBackground(new java.awt.Color(0, 51, 102));

        signup_text_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signup_text_button.setForeground(new java.awt.Color(255, 255, 255));
        signup_text_button.setText("SIGN UP");

        javax.swing.GroupLayout signup_buttonLayout = new javax.swing.GroupLayout(signup_button);
        signup_button.setLayout(signup_buttonLayout);
        signup_buttonLayout.setHorizontalGroup(
            signup_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signup_buttonLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(signup_text_button)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        signup_buttonLayout.setVerticalGroup(
            signup_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signup_text_button, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        signup_area.add(signup_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, -1, -1));

        backgroundPanel.add(signup_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 500, 610));
        signup_area.setVisible(false);

        next_signin_panel.setBackground(new java.awt.Color(0, 51, 102));
        next_signin_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signup_panel.setBackground(new java.awt.Color(0, 51, 102));
        signup_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        signup_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signup_panelMousePressed(evt);
            }
        });

        signup_text.setBackground(new java.awt.Color(0, 51, 102));
        signup_text.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        signup_text.setForeground(new java.awt.Color(255, 255, 255));
        signup_text.setText("Sign Up");

        javax.swing.GroupLayout signup_panelLayout = new javax.swing.GroupLayout(signup_panel);
        signup_panel.setLayout(signup_panelLayout);
        signup_panelLayout.setHorizontalGroup(
            signup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signup_panelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(signup_text)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        signup_panelLayout.setVerticalGroup(
            signup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signup_text, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        next_signin_panel.add(signup_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 240, 70));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("and start our journey");
        next_signin_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 250, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 38)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hello, Friend!");
        next_signin_panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 310, 100));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter your persional details");
        next_signin_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 320, 50));

        backgroundPanel.add(next_signin_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 430, 610));

        background_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_form/img/night_mode.png"))); // NOI18N
        backgroundPanel.add(background_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void wait(int ms){
        try {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    public void change_str(String title, String line1, String line2, String str_btn) {
        signup_text.setText(str_btn);
        jLabel4.setText(title);
        jLabel5.setText(line1);
        jLabel1.setText(line2);
    }
    
    private void signup_panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_panelMousePressed
        // TODO add your handling code here:
        int p = this.next_signin_panel.getX(); 
        if (p > 650) {
            Animacion.Animacion.mover_izquierda(700, 200, 2, 3, next_signin_panel);
            wait(100);
            signup_area.setVisible(true);
            Animacion.Animacion.mover_derecha(270, 630, 2, 3, signup_area);
            signin_area.setVisible(false);
            wait(100);
            change_str("Welcome Back!", "Let's back to work by sign in", "with your persional info", "Sign In");
        }
        else {
            Animacion.Animacion.mover_derecha(200, 700, 2, 3, next_signin_panel);
            wait(100);
            signin_area.setVisible(true);
            Animacion.Animacion.mover_izquierda(640, 200, 2, 3, signin_area);
            signup_area.setVisible(false);
            wait(100);
            change_str("Hello, Friend!", "Enter your persional details", "and start out journey", "Sign Up");
        }
    }//GEN-LAST:event_signup_panelMousePressed

    private void close_iconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_iconMousePressed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_close_iconMousePressed

    private void minimize_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_iconMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(Login_Form_Design.ICONIFIED);
    }//GEN-LAST:event_minimize_iconMouseClicked

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
            java.util.logging.Logger.getLogger(Login_Form_Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Form_Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Form_Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Form_Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Form_Design().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel background_img;
    private javax.swing.JLabel close_icon;
    private javax.swing.JLabel create_account;
    private javax.swing.JTextField email;
    private javax.swing.JLabel forgot_pass_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel minimize_icon;
    private javax.swing.JTextField n_email;
    private javax.swing.JTextField n_name;
    private javax.swing.JPasswordField n_pass;
    private javax.swing.JPanel next_signin_panel;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel signin_area;
    private javax.swing.JPanel signin_button;
    private javax.swing.JLabel signin_text_area;
    private javax.swing.JLabel signin_text_button;
    private javax.swing.JPanel signup_area;
    private javax.swing.JPanel signup_button;
    private javax.swing.JPanel signup_panel;
    private javax.swing.JLabel signup_text;
    private javax.swing.JLabel signup_text_button;
    // End of variables declaration//GEN-END:variables
}
