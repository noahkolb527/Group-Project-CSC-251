/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybill_browntaylor;

/**
 *
 * @author brownt7272
 */
public class MyBill_JF_Residency
        extends javax.swing.JFrame
{

    /**
     * Creates new form MyBill_JF_UserName
     */
    public MyBill_JF_Residency()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        L_Question = new javax.swing.JLabel();
        CB_Residency = new javax.swing.JComboBox<>();
        Btn_Exit = new javax.swing.JButton();
        Btn_Next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyBill | Taylor & Lester");

        L_Question.setText("Are you in-state or out-of-state?");

        CB_Residency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In-State", "Out-Of-State" }));

        Btn_Exit.setText("Exit");
        Btn_Exit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Btn_ExitActionPerformed(evt);
            }
        });

        Btn_Next.setText("Next");
        Btn_Next.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Btn_NextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CB_Residency, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_Question)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_Exit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_Next)))
                        .addGap(0, 105, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_Question)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CB_Residency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Exit)
                    .addComponent(Btn_Next))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_NextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Btn_NextActionPerformed
    {//GEN-HEADEREND:event_Btn_NextActionPerformed
        // Collects the residency status from the student
        String residency = CB_Residency.getSelectedItem().toString();
        
        // Assigns true for in state and false for out of state
        boolean rate = false;
        switch (residency){
            case "In-State":
                rate = true;
                break;
            default:
                break;
        }
        
        // Sends the data to the main program for storage
        MyBill_Taylor_and_Lester.getResidency(rate);
        
        // Calls calculate method in the main program and closes the window
        this.dispose();
        MyBill_Taylor_and_Lester.calculateTotal();
    }//GEN-LAST:event_Btn_NextActionPerformed

    private void Btn_ExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Btn_ExitActionPerformed
    {//GEN-HEADEREND:event_Btn_ExitActionPerformed
        // Terminates the program
        System.exit(0);
    }//GEN-LAST:event_Btn_ExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MyBill_JF_Residency.class.
                    getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MyBill_JF_Residency.class.
                    getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MyBill_JF_Residency.class.
                    getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MyBill_JF_Residency.class.
                    getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MyBill_JF_Residency().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Exit;
    private javax.swing.JButton Btn_Next;
    private javax.swing.JComboBox<String> CB_Residency;
    private javax.swing.JLabel L_Question;
    // End of variables declaration//GEN-END:variables
}
