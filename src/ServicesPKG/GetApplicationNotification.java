package ServicesPKG;
import ExtraResources.ArriveDate;
import LoginControllerPKG.LogInFrame;
import java.awt.Toolkit;
import static NotifocationComponents.NotificationCollector.rd;
import static NotifocationComponents.NotificationCollector.util;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class GetApplicationNotification extends javax.swing.JFrame {

    ArriveDate ad = new ArriveDate();
    TableModel model;
    int index;
    String info,accNo,date,status = "pending",notiNo;
    public GetApplicationNotification() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(LogInFrame.img_path)));
        setLocationRelativeTo(null);
        getTableData();
        editComponents();
        pendingPnl.setVisible(true);
        rejectedPnl.setVisible(false);
        acceptedPnl.setVisible(false);        
    }

    void getTableData(){
        rd.getRelativeColumn("select Accountno,NotiInfo,Date from CardsNotification where Status = 'accept'");
        acceptedAppTbl.setModel(DbUtils.resultSetToTableModel(rd.rs));
        
        rd.getRelativeColumn("select Accountno,NotiInfo,Date from CardsNotification where Status = 'reject'");
        rejectedAppTbl.setModel(DbUtils.resultSetToTableModel(rd.rs));
        
        rd.getRelativeColumn("select Accountno,NotiInfo,Date from CardsNotification where Status = 'pending'");
        pendingAppTbl.setModel(DbUtils.resultSetToTableModel(rd.rs));
    }
    
    void editComponents(){
        util.editTextField(searchTxt, 0, 0, 0);
        util.editButton(searchBtn);
        util.imageIcon(searchBtn, "src//images//search_icon.png");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        pendingBtn = new javax.swing.JButton();
        rejectBtn = new javax.swing.JButton();
        acceptBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pendingPnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pendingAppTbl = new javax.swing.JTable();
        rejectedPnl = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rejectedAppTbl = new javax.swing.JTable();
        acceptedPnl = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        acceptedAppTbl = new javax.swing.JTable();
        searchTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        pendingBtn.setBackground(new java.awt.Color(255, 255, 255));
        pendingBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pendingBtn.setText("Pending");
        pendingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendingBtnActionPerformed(evt);
            }
        });

        rejectBtn.setBackground(new java.awt.Color(255, 255, 255));
        rejectBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rejectBtn.setText("Rejected");
        rejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectBtnActionPerformed(evt);
            }
        });

        acceptBtn.setBackground(new java.awt.Color(255, 255, 255));
        acceptBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        acceptBtn.setText("Accepted");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.CardLayout());

        pendingPnl.setBackground(new java.awt.Color(255, 255, 255));

        pendingAppTbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        pendingAppTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        pendingAppTbl.setRowHeight(30);
        pendingAppTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendingAppTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pendingAppTbl);

        javax.swing.GroupLayout pendingPnlLayout = new javax.swing.GroupLayout(pendingPnl);
        pendingPnl.setLayout(pendingPnlLayout);
        pendingPnlLayout.setHorizontalGroup(
            pendingPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendingPnlLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        pendingPnlLayout.setVerticalGroup(
            pendingPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendingPnlLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel2.add(pendingPnl, "card2");

        rejectedPnl.setBackground(new java.awt.Color(255, 255, 255));

        rejectedAppTbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rejectedAppTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        rejectedAppTbl.setRowHeight(30);
        rejectedAppTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rejectedAppTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(rejectedAppTbl);

        javax.swing.GroupLayout rejectedPnlLayout = new javax.swing.GroupLayout(rejectedPnl);
        rejectedPnl.setLayout(rejectedPnlLayout);
        rejectedPnlLayout.setHorizontalGroup(
            rejectedPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rejectedPnlLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        rejectedPnlLayout.setVerticalGroup(
            rejectedPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rejectedPnlLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel2.add(rejectedPnl, "card2");

        acceptedPnl.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane3MouseClicked(evt);
            }
        });

        acceptedAppTbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        acceptedAppTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        acceptedAppTbl.setRowHeight(30);
        acceptedAppTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptedAppTblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(acceptedAppTbl);

        javax.swing.GroupLayout acceptedPnlLayout = new javax.swing.GroupLayout(acceptedPnl);
        acceptedPnl.setLayout(acceptedPnlLayout);
        acceptedPnlLayout.setHorizontalGroup(
            acceptedPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acceptedPnlLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        acceptedPnlLayout.setVerticalGroup(
            acceptedPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acceptedPnlLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel2.add(acceptedPnl, "card2");

        searchTxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        searchTxt.setText("Search");
        searchTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTxtFocusLost(evt);
            }
        });

        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pendingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(rejectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pendingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rejectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pendingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendingBtnActionPerformed
        status = "pending";
        pendingPnl.setVisible(true);
        rejectedPnl.setVisible(false);
        acceptedPnl.setVisible(false);
    }//GEN-LAST:event_pendingBtnActionPerformed

    private void rejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectBtnActionPerformed
        status = "reject";
        pendingPnl.setVisible(false);
        rejectedPnl.setVisible(true);
        acceptedPnl.setVisible(false);
    }//GEN-LAST:event_rejectBtnActionPerformed

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        status = "accept";
        pendingPnl.setVisible(false);
        rejectedPnl.setVisible(false);
        acceptedPnl.setVisible(true);
    }//GEN-LAST:event_acceptBtnActionPerformed

    private void searchTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTxtFocusGained
        if(searchTxt.getText().equals("Search"))
            searchTxt.setText("");
    }//GEN-LAST:event_searchTxtFocusGained

    private void searchTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTxtFocusLost
        if(searchTxt.getText().equals("")){
            searchTxt.setText("Search");
            getTableData();
        }
    }//GEN-LAST:event_searchTxtFocusLost

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        if(searchTxt.getText().equals("Search"))
            getTableData();
        else{
            rd.getRelativeColumn("select Accountno,NotiInfo,Date from CardsNotification where Status = 'accept' and Accountno = '"+searchTxt.getText()+"'");
            acceptedAppTbl.setModel(DbUtils.resultSetToTableModel(rd.rs));

            rd.getRelativeColumn("select Accountno,NotiInfo,Date from CardsNotification where Status = 'reject' and Accountno = '"+searchTxt.getText()+"'");
            rejectedAppTbl.setModel(DbUtils.resultSetToTableModel(rd.rs));

            rd.getRelativeColumn("select Accountno,NotiInfo,Date from CardsNotification where Status = 'pending' and Accountno = '"+searchTxt.getText()+"'");
            pendingAppTbl.setModel(DbUtils.resultSetToTableModel(rd.rs));         
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void pendingAppTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingAppTblMouseClicked
        tableClick(pendingAppTbl);
    }//GEN-LAST:event_pendingAppTblMouseClicked

    private void rejectedAppTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rejectedAppTblMouseClicked
        tableClick(rejectedAppTbl);
    }//GEN-LAST:event_rejectedAppTblMouseClicked

    private void jScrollPane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane3MouseClicked
    }//GEN-LAST:event_jScrollPane3MouseClicked

    private void acceptedAppTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptedAppTblMouseClicked
        tableClick(acceptedAppTbl);
    }//GEN-LAST:event_acceptedAppTblMouseClicked

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(GetApplicationNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetApplicationNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetApplicationNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetApplicationNotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetApplicationNotification().setVisible(true);
            }
        });
    }

    void tableClick(JTable table){
        index = table.getSelectedRow();
        model = table.getModel();
        accNo = model.getValueAt(index, 0).toString();
        info  = model.getValueAt(index, 1).toString();
        date  = model.getValueAt(index, 2).toString();
        cardsConfiramtion(status, accNo,info, date);
        
        rd.rs = rd.resultSet("select NotificationNo from CardsNotification where Accountno = '"+accNo+"' and NotiInfo = '"+info+"' and Date = '"+date+"'");
        try {
            if(rd.rs.next())
                notiNo = rd.rs.getString("NotificationNo");
            } catch (SQLException ex) {
            Logger.getLogger(GetApplicationNotification.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void cardsConfiramtion(String flag, String accNo,String info,String date){
        rd.reLiveProfileData("acc_no", accNo);
        switch(flag){
            case "accept":                                                                                                      
                notification(accNo,"update CardsNotification set Status = 'pending' where NotificationNo = '"+notiNo+"'"
                                  ,"update CardsNotification set Status = 'reject'  where NotificationNo = '"+notiNo+"'"
                                  ,"Accepted Application",rd.name,date,info,"Pending","Reject");
                break;
            case "reject":
                notification(accNo,"update CardsNotification set Status = 'pending' where NotificationNo = '"+notiNo+"'"
                                  ,"update CardsNotification set Status = 'accept'  where NotificationNo = '"+notiNo+"'"
                                  ,"Rejected Application",rd.name,date,info,"Pending","Accept");
                break;
            case "pending":
                notification(accNo,"update CardsNotification set Status = 'reject' where NotificationNo = '"+notiNo+"'"
                                  ,"update CardsNotification set Status = 'accept' where NotificationNo = '"+notiNo+"'"
                                  ,"Pending Application",rd.name,date,info,"Reject","Accept");
                break;
            default:
                System.out.println("default case in cards notification");
                break;
        }
    }
    
void notification(String accno  , String Querry1 , String Querry2 , 
                  String title   , String leb1    , String leb3   , 
                  String info    , String btnLeb1 , String btnLeb2){
        new ApplicationsAction(title,leb1,accno,leb3,"\t"+info,btnLeb1,btnLeb2) {
            @Override
            public void closeBtnAction() {
                dispose();
            }

            @Override
            public void btn1Action() {
                rd.insertORupdateDataBase(Querry1);
                getTableData();
                getStatus(btnLeb1,accno);
                dispose();
            }

            @Override
            public void btn2Action() {
                rd.insertORupdateDataBase(Querry2);
                getTableData();
                getStatus(btnLeb2,accno);
                dispose();
            }
        }.show();
    }

    void getStatus(String leb, String accno){
        switch(leb){
            case"Pending":
                rd.insertORupdateDataBase("update   Cards    set Status = '"+leb.toLowerCase()+"'      where NotificationNo = '"+notiNo+"'");
                rd.insertORupdateDataBase("update application set type   = '"+leb+"ed".toLowerCase()+"' where applicationNo = '"+notiNo+"' and accountNo ='"+accno+"'");
                break;
            case"Reject":
                rd.insertORupdateDataBase("update    Cards   set Status = '"+leb.toLowerCase()+"'      where NotificationNo = '"+notiNo+"'");
                rd.insertORupdateDataBase("update application set type   = '"+leb+"ed".toLowerCase()+"' where applicationNo = '"+notiNo+"' and accountNo ='"+accno+"'");
                break;
            case"Accept":
                rd.insertORupdateDataBase("update    Cards   set Status = '"+leb.toLowerCase()+"'      where NotificationNo = '"+notiNo+"'");
                rd.insertORupdateDataBase("update application set type   = '"+leb+"ed".toLowerCase()+"' where applicationNo = '"+notiNo+"' and accountNo ='"+accno+"'");
                break;
            default:
                System.out.println("Deault case in class getApplicationNotification function getCardStatus");
                break;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton acceptBtn;
    private javax.swing.JTable acceptedAppTbl;
    private javax.swing.JPanel acceptedPnl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable pendingAppTbl;
    public static javax.swing.JButton pendingBtn;
    private javax.swing.JPanel pendingPnl;
    public static javax.swing.JButton rejectBtn;
    private javax.swing.JTable rejectedAppTbl;
    private javax.swing.JPanel rejectedPnl;
    public static javax.swing.JButton searchBtn;
    public static javax.swing.JTextField searchTxt;
    // End of variables declaration//GEN-END:variables
}
