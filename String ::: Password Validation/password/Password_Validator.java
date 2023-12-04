package password;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Password_Validator extends javax.swing.JFrame {

    public Password_Validator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Password = new javax.swing.JPasswordField();
        Show_Pass = new javax.swing.JCheckBox();
        Enter = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        validator = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        num1 = new javax.swing.JLabel();
        num2 = new javax.swing.JLabel();
        num3 = new javax.swing.JLabel();
        num4 = new javax.swing.JLabel();
        num5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Password.setBackground(new java.awt.Color(204, 204, 255));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 210, 40));

        Show_Pass.setText("Show Password");
        Show_Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_PassActionPerformed(evt);
            }
        });
        jPanel1.add(Show_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        Enter.setBackground(new java.awt.Color(204, 204, 255));
        Enter.setText("Enter Password");
        Enter.setToolTipText("");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });
        jPanel1.add(Enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        Exit.setBackground(new java.awt.Color(204, 204, 255));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 110, -1));

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PASSWORD VALIDATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 40));

        validator.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        validator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(validator, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 290, 20));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        num1.setForeground(new java.awt.Color(255, 255, 255));
        num1.setText("1. The password must be at least 8 characters long.");
        jPanel2.add(num1);

        num2.setForeground(new java.awt.Color(255, 255, 255));
        num2.setText("2. The password must contain at least one uppercase letter.");
        jPanel2.add(num2);

        num3.setForeground(new java.awt.Color(255, 255, 255));
        num3.setText("3. The password must contain at least one lowercase letter.");
        jPanel2.add(num3);

        num4.setForeground(new java.awt.Color(255, 255, 255));
        num4.setText("4. The password must contain at least one digit.");
        jPanel2.add(num4);

        num5.setForeground(new java.awt.Color(255, 255, 255));
        num5.setText("5. The password may contain special characters such as @, #, $, %, &, *, or +.");
        jPanel2.add(num5);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 430, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password/background.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 450, 240));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password/background.gif"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 240));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Show_PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_PassActionPerformed
        if(Show_Pass.isSelected()){
            Password.setEchoChar((char)0);
        }else {
            Password.setEchoChar('*');
        }
    }//GEN-LAST:event_Show_PassActionPerformed

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        String txt = Password.getText().toString(); 
        char[] password = new char[txt.length()]; 
        
        int capitaltxt = 0;  
        int smalltxt = 0;  
        int numbers = 0;  
        int length = 0;  
        int specialtxt = 0; 
        
        for (int i = 0; i < txt.length(); i++){
            password[i] = txt.charAt(i);
            
            if (password[i] >= 'A' && password[i] <= 'Z'){
                capitaltxt = 1;
            }
            if (password[i] >= 'a' && password[i] <= 'z'){
                smalltxt = 1;
            }
            if (password[i] >= '0' && password[i] <= '9'){
                numbers = 1;
            }
            if (txt.length() >= 8){
                length = 1;
            }
            if(password[i] == '$' || password[i] == '@' || password[i] == '#' || password[i] == '%' || password[i] == '*' || password[i] == '+'){
                specialtxt =1;
            }
            if (capitaltxt == 0){
            }
            if (capitaltxt ==1 && smalltxt ==1 && numbers ==1 || length ==1 && specialtxt==1){
                validator.setText("Password is Valid");
            }else
                validator.setText("Password is Invalid");
                
            }
            if (capitaltxt ==1){
                num2.setForeground(Color.white);
            }else{
                num2.setForeground(Color.red);
            }
            if (smalltxt ==1){
                num3.setForeground(Color.white);
            }else{
                num3.setForeground(Color.red);
            }
            if (numbers ==1){
                num4.setForeground(Color.white);
            }else{
                num4.setForeground(Color.red);
            }
            if (length ==1){
                num1.setForeground(Color.white);
            }else{
                num1.setForeground(Color.red);
            }
            if (specialtxt ==1){
                num5.setForeground(Color.white);
            }else{
                num5.setForeground(Color.red);
            }
    }//GEN-LAST:event_EnterActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        JFrame frame = new JFrame ("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit <3", "Password Validator",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
        System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(Password_Validator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Password_Validator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Password_Validator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Password_Validator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Password_Validator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enter;
    private javax.swing.JButton Exit;
    private javax.swing.JPasswordField Password;
    private javax.swing.JCheckBox Show_Pass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel num1;
    private javax.swing.JLabel num2;
    private javax.swing.JLabel num3;
    private javax.swing.JLabel num4;
    private javax.swing.JLabel num5;
    private javax.swing.JLabel validator;
    // End of variables declaration//GEN-END:variables
}
