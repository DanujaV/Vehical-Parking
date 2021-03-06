
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danu
 */
public class CashierForm extends javax.swing.JFrame {

    /**
     * Creates new form CashierForm
     */
    public CashierForm() {
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

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        arrivalTimeLbl = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        vehicalNumberTxt = new javax.swing.JTextField();
        pressKeyCmbo = new javax.swing.JButton();
        cstLbl = new javax.swing.JLabel();
        prkdTimeLbl = new javax.swing.JLabel();
        paymentBtn = new javax.swing.JButton();
        cashierBackBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        costPerHourCmbo = new javax.swing.JComboBox<>();
        cashCheck = new javax.swing.JRadioButton();
        cardChekc = new javax.swing.JRadioButton();
        jButton10 = new javax.swing.JButton();
        departureTimeTxt = new javax.swing.JTextField();
        clckBtn = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        vehicalTypeLbl = new javax.swing.JLabel();
        hourLbl = new javax.swing.JLabel();
        costLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 720));

        jPanel1.setBackground(new java.awt.Color(236, 240, 241));

        jPanel2.setBackground(new java.awt.Color(19, 15, 64));

        jLabel1.setBackground(new java.awt.Color(214, 48, 49));
        jLabel1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(214, 48, 49));
        jLabel1.setText("The Sunrise Shopping Complex Parking System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton5.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        jButton5.setText("Arrival Time");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        arrivalTimeLbl.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        arrivalTimeLbl.setForeground(new java.awt.Color(213, 95, 95));

        jButton6.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        jButton6.setText("Departure Time");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        vehicalNumberTxt.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N

        pressKeyCmbo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        pressKeyCmbo.setText("Press Here to Check Parked Time & Total Cost");
        pressKeyCmbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressKeyCmboActionPerformed(evt);
            }
        });

        cstLbl.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cstLbl.setForeground(new java.awt.Color(213, 95, 95));

        prkdTimeLbl.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        prkdTimeLbl.setForeground(new java.awt.Color(213, 95, 95));
        prkdTimeLbl.setBorder(new javax.swing.border.MatteBorder(null));

        paymentBtn.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        paymentBtn.setText("Payment As");
        paymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBtnActionPerformed(evt);
            }
        });

        cashierBackBtn.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        cashierBackBtn.setText("Back");
        cashierBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashierBackBtnActionPerformed(evt);
            }
        });

        exitBtn.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        jButton9.setText("Cost Per Hour");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        costPerHourCmbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "50.00 - Car", "75.00 - Van", "100.00 - Bus", "150.00 - Lorry" }));
        costPerHourCmbo.setSelectedItem(null);
        costPerHourCmbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costPerHourCmboActionPerformed(evt);
            }
        });

        buttonGroup.add(cashCheck);
        cashCheck.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cashCheck.setForeground(new java.awt.Color(214, 48, 49));
        cashCheck.setText("Cash");
        cashCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashCheckActionPerformed(evt);
            }
        });

        buttonGroup.add(cardChekc);
        cardChekc.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cardChekc.setForeground(new java.awt.Color(214, 48, 49));
        cardChekc.setText("Card");
        cardChekc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardChekcActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        jButton10.setText("Vehical Number");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        departureTimeTxt.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        departureTimeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departureTimeTxtActionPerformed(evt);
            }
        });

        clckBtn.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        clckBtn.setText("Click Here");
        clckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clckBtnActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        jButton11.setText("Vehical Type");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        vehicalTypeLbl.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        vehicalTypeLbl.setForeground(new java.awt.Color(213, 95, 95));

        hourLbl.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        hourLbl.setForeground(new java.awt.Color(213, 95, 95));
        hourLbl.setBorder(new javax.swing.border.MatteBorder(null));

        costLbl.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        costLbl.setForeground(new java.awt.Color(213, 95, 95));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cashierBackBtn)
                        .addGap(18, 18, 18)
                        .addComponent(exitBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton9)
                                                    .addComponent(paymentBtn))
                                                .addGap(54, 54, 54))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(departureTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(costPerHourCmbo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton5)
                                                .addGap(82, 82, 82)
                                                .addComponent(arrivalTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jButton11)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(vehicalTypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jButton10)
                                                        .addGap(53, 53, 53)
                                                        .addComponent(vehicalNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(32, 32, 32)
                                                .addComponent(clckBtn)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(cashCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardChekc)))
                        .addGap(142, 142, 142)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(prkdTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hourLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(costLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cstLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(pressKeyCmbo, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(vehicalNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clckBtn))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicalTypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(arrivalTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(departureTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(costPerHourCmbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(pressKeyCmbo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cstLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(prkdTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hourLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(costLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cashierBackBtn)
                            .addComponent(exitBtn))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paymentBtn)
                            .addComponent(cardChekc)
                            .addComponent(cashCheck))
                        .addGap(27, 27, 27))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void pressKeyCmboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pressKeyCmboActionPerformed
        
        double departureTime = Double.parseDouble(departureTimeTxt.getText());
        double arrivalTime = Double.parseDouble(arrivalTimeLbl.getText());
        String costPerHour =  costPerHourCmbo.getSelectedItem().toString();
        
        if(costPerHour == "50.00 - Car"){costPerHour = "50.00";}
        else if(costPerHour == "75.00 - Van"){costPerHour = "75.00";}
        else if(costPerHour == "100.00 - Bus"){costPerHour = "100.00";}
        else if(costPerHour == "150.00 - Lorry"){costPerHour = "150.00";}
        
        double costFee = Double.parseDouble(costPerHour);
        
        double cost = (departureTime - arrivalTime) * costFee;
        
        String s = Double.toString(Math.round(cost*100)/100);
        cstLbl.setText(s);
        
        double parkedTime = (departureTime - arrivalTime); 
        String c = Double.toString(Math.round(parkedTime*100)/100);
        prkdTimeLbl.setText(c);
        hourLbl.setText("hr");
        costLbl.setText("Rs: ");
    }//GEN-LAST:event_pressKeyCmboActionPerformed

    private void paymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBtnActionPerformed
        
        if(cashCheck.isSelected() == true){
            try {
                ParkingDetailsModule parkingModule = new ParkingDetailsModule(vehicalNumberTxt.getText(), arrivalTimeLbl.getText(),departureTimeTxt.getText(), cashCheck.getText());
                boolean isUpdated = VehicalController.setPayment(parkingModule);
                if (isUpdated) {
                    JOptionPane.showMessageDialog(this, "Payment Succesfully");
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Payment Fail");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Driver not found...");
            }
        }else if(cardChekc.isSelected() == true){
             try {
                ParkingDetailsModule parkingModule = new ParkingDetailsModule(vehicalNumberTxt.getText(), arrivalTimeLbl.getText(),departureTimeTxt.getText(), cardChekc.getText());
                boolean isUpdated = VehicalController.setPayment(parkingModule);
                if (isUpdated) {
                    JOptionPane.showMessageDialog(this, "Payment Succesfully");
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Payment Fail");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Driver not found...");
            }
        
        
        }
        
        
        try {
            ParkingDetailsModule parkingModule = new ParkingDetailsModule(vehicalNumberTxt.getText(),arrivalTimeLbl.getText(),departureTimeTxt.getText(),"Not Yet Pay");
            boolean isUpdated = VehicalController.addDepartureTime(parkingModule);
            if (isUpdated) {
               // JOptionPane.showMessageDialog(this, "Update Success");
                
            } else {
                JOptionPane.showMessageDialog(this, "Update Fail");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Driver not found...");
        }
        
    }//GEN-LAST:event_paymentBtnActionPerformed

    private void cashierBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashierBackBtnActionPerformed
        dispose();
        new MainFrameForm().setVisible(true);
        
    }//GEN-LAST:event_cashierBackBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void clckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clckBtnActionPerformed
        try {
            ParkingDetailsModule parkModule = VehicalController.findVehical(vehicalNumberTxt.getText());
            VehicalModule vehicalModule = VehicalController.findVehicalType(vehicalNumberTxt.getText());
            if(parkModule!=null){
                arrivalTimeLbl.setText(parkModule.getArrivalTime());
                
            }else{
                JOptionPane.showMessageDialog(this, "Vehical isn't Rejister Under this Vehical Number...");
            }
            
            if(vehicalModule!=null){
                vehicalTypeLbl.setText(vehicalModule.getVehicalType());
                
            }else{
               // JOptionPane.showMessageDialog(this, "Item not found...");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Driver not found...");
        }
        
                
    }//GEN-LAST:event_clckBtnActionPerformed

    private void cashCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashCheckActionPerformed

    private void cardChekcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardChekcActionPerformed
          
    }//GEN-LAST:event_cardChekcActionPerformed

    private void costPerHourCmboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costPerHourCmboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costPerHourCmboActionPerformed

    private void departureTimeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departureTimeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departureTimeTxtActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(CashierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrivalTimeLbl;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JRadioButton cardChekc;
    private javax.swing.JRadioButton cashCheck;
    private javax.swing.JButton cashierBackBtn;
    private javax.swing.JButton clckBtn;
    private javax.swing.JLabel costLbl;
    private javax.swing.JComboBox<String> costPerHourCmbo;
    private javax.swing.JLabel cstLbl;
    private javax.swing.JTextField departureTimeTxt;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel hourLbl;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton paymentBtn;
    private javax.swing.JButton pressKeyCmbo;
    private javax.swing.JLabel prkdTimeLbl;
    private javax.swing.JTextField vehicalNumberTxt;
    private javax.swing.JLabel vehicalTypeLbl;
    // End of variables declaration//GEN-END:variables
}
