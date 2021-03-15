package NotifocationComponents;
import Database.ReLiveData;
import ExtraResources.Utilities;
import LoginControllerPKG.LogInFrame;
import MainFramePkg.GenerateUserType;
import ServicesPKG.GetApplicationNotification;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class NotificationCollector extends javax.swing.JFrame {
    TableModel model;
    int index;
    public static Utilities util = new Utilities();
    public static ReLiveData  rd = new ReLiveData();
    GetApplicationNotification gan;
    public NotificationCollector() {
        initComponents();
        getTableData();
        setLocationRelativeTo(null);
    }

    void getTableData(){
        rd.getRelativeColumn("Select * from Notification where ForUserType = '"+GenerateUserType.getUser()+"' or ForUserType = 'public' and ForUser = 'public' or ForUser = '"+LogInFrame.account_no+"'");
        notificationTbl.setModel(DbUtils.resultSetToTableModel(rd.rs));
    }
    
    void getNotifiaction(String infoTitle){
        switch(infoTitle){
            case"Apply For Cards":
                rd.insertORupdateDataBase("update Notification set Flag = 'seen' where NotificationInfo = '"+infoTitle+"'");
                new GetApplicationNotification().show();
                dispose();
                break;
            case "Request For Money":
                if(rd.getEntryCount("select * from Notification where NotificationInfo = 'Request For Money'") == 1)
                    new RequestMoneyNotification().show();
                else{
//                    new GetApplicationNotification().show();
//                    gan.searchTxt.setVisible(false);
//                    gan.searchBtn.setVisible(false);
//                    gan.rejectBtn.setVisible(false);
//                    gan.acceptBtn.setVisible(false);
//                    gan.pendingBtn.setVisible(false);
//                    gan.jSeparator1.setVisible(false);
                }
                break;
            default:
                JOptionPane.showMessageDialog(rootPane, "Default casse in  NotificationCollector");
                break;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        notificationTbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Notification");

        notificationTbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        notificationTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        notificationTbl.setRowHeight(35);
        notificationTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notificationTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(notificationTbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1649, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
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

    private void notificationTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationTblMouseClicked
        index = notificationTbl.getSelectedRow();
        model = notificationTbl.getModel();
        getNotifiaction(model.getValueAt(index, 0).toString());
    }//GEN-LAST:event_notificationTblMouseClicked


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
            java.util.logging.Logger.getLogger(NotificationCollector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotificationCollector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotificationCollector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotificationCollector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotificationCollector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable notificationTbl;
    // End of variables declaration//GEN-END:variables
}
