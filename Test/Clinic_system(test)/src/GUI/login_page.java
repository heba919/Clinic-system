/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Function_database.*;
import javax.swing.JOptionPane;
import Function_database.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Class.*;
import Collage_main.*;
import GUI.*;
/**
 *
 * @author hp
 */
public class login_page extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login_page() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Lab_u_id_login = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        Tf_u_id_login = new javax.swing.JTextField();
        Tf_pass_login = new javax.swing.JTextField();
        Comb_personselect = new javax.swing.JComboBox<>();
        login_butt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(185, 219, 237));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        Lab_u_id_login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lab_u_id_login.setText("Username");

        jlabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabel2.setText("Password");

        Tf_u_id_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_u_id_loginActionPerformed(evt);
            }
        });

        Tf_pass_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_pass_loginActionPerformed(evt);
            }
        });

        Comb_personselect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Comb_personselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "patient(new reveal)", "patient(consultation)", "Admin" }));
        Comb_personselect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Comb_personselectItemStateChanged(evt);
            }
        });
        Comb_personselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comb_personselectActionPerformed(evt);
            }
        });

        login_butt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        login_butt.setText("login");
        login_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Select person ");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlabel2)
                            .addComponent(Lab_u_id_login))))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Tf_pass_login)
                    .addComponent(Tf_u_id_login)
                    .addComponent(Comb_personselect, 0, 202, Short.MAX_VALUE))
                .addGap(0, 171, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(login_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Comb_personselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lab_u_id_login)
                    .addComponent(Tf_u_id_login, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel2)
                    .addComponent(Tf_pass_login, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(login_butt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tf_u_id_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_u_id_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_u_id_loginActionPerformed

    private void Tf_pass_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_pass_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_pass_loginActionPerformed

    private void Comb_personselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comb_personselectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Comb_personselectActionPerformed

    private void Comb_personselectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Comb_personselectItemStateChanged
   
        ///// select only 
     
    int index = (int) Comb_personselect.getSelectedIndex();
            switch (index) {
            case 0:  // doctor
            break;
                
            case 1: //new
                Tf_u_id_login.setVisible(false);
                Tf_pass_login.setVisible(false);
                break;
                
      
            case 2: //con
                Lab_u_id_login.setText("ID");
                Tf_pass_login.setVisible(false);
             break;
                //
            case 3: //admin
                //
                    break;
                   
        }
       

        
    }//GEN-LAST:event_Comb_personselectItemStateChanged

    private void login_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttActionPerformed
  
    int index =  Comb_personselect.getSelectedIndex();
             
     try {
            
         helperFunction fu = new helperFunction(); 
            if  (index==0) {
              // doctor
            if(  fu.login_doctor(Tf_u_id_login.getText(), Tf_pass_login.getText())){
                Doctor_page doctor_page= new Doctor_page(Integer.parseInt(Tf_u_id_login.getText()));        //constractor
                 doctor_page.setVisible(true);
                 this.setVisible(false);
            
              
             }else {
               JOptionPane.showConfirmDialog(this,
                       "Something Went Wrong, please enter information again! ");
            }
            }
              
                
            if (index==1)//new
            {// JOptionPane.showConfirmDialog(this, "ok");
                
                new_reveal r= new new_reveal();        //constractor
                 r.setVisible(true);
                 this.setVisible(false);
            }
              
                
      
             if(index==2) //con
            {  
                Lab_u_id_login.setText("ID");
                Tf_pass_login.setVisible(false);
              if(  fu.login_con(Tf_u_id_login.getText())){
               Consultation con= new Consultation(Integer.parseInt(Tf_u_id_login.getText())) ;        //constractor
                 con.setVisible(true);
                 this.setVisible(false);
            
              
              }
             }
                 
                
                //
            if (index==3){
                if(  fu.login_admin(Tf_u_id_login.getText(), Tf_pass_login.getText())){
             
                 admin d = new admin(Integer.parseInt(Tf_u_id_login.getText()),Integer.parseInt(Tf_u_id_login.getText())) ;        //constractor
                 d.setVisible(true);
                 this.setVisible(false);
            
              }
            }else {
               JOptionPane.showConfirmDialog(this,
                       "Something Went Wrong, please enter information again! ");
            }
            }
     
            catch (NumberFormatException | SQLException e) {}
          
        
        
        
        
        
    }//GEN-LAST:event_login_buttActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int user =0;
        Doctor_page doctor_page= new Doctor_page(user);        //constractor
                 doctor_page.setVisible(true);
                 this.setVisible(false);  
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Comb_personselect;
    private javax.swing.JLabel Lab_u_id_login;
    private javax.swing.JTextField Tf_pass_login;
    private javax.swing.JTextField Tf_u_id_login;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JButton login_butt;
    // End of variables declaration//GEN-END:variables
}
