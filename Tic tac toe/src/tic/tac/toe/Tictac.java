/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

/**
 *
 * @author shrad
 */
public class Tictac extends javax.swing.JFrame {

   int turn  = 2;
   int[] buttonused = {0,0,0,0,0,0,0,0,0};
   int[] pXwon = {0,0,0,0,0,0,0,0,0};
   int[] pOwon = {0,0,0,0,0,0,0,0,0};
  
   
   int Pxwon(){
   if(pXwon[0] == 1 && pXwon[1] == 1 && pXwon[2] == 1){
    return 1;
   }
    if(pXwon[3] == 1 && pXwon[4] == 1 && pXwon[5] == 1){
    return 1;
   }
    if(pXwon[6] == 1 && pXwon[7] == 1 && pXwon[8] == 1){
    return 1;
   }
    if(pXwon[0] == 1 && pXwon[4] == 1 && pXwon[8] == 1){
    return 1;
   }
    if(pXwon[6] == 1 && pXwon[7] == 1 && pXwon[8] == 1){
    return 1;
   }
    if(pXwon[2] == 1 && pXwon[4] == 1 && pXwon[6] == 1){
    return 1;
   }
    if(pXwon[1] == 1 && pXwon[7] == 1 && pXwon[4] == 1){
    return 1;
   }
    if(pXwon[2] == 1 && pXwon[5] == 1 && pXwon[8] == 1){
    return 1;
   }
    if(pXwon[0] == 1 && pXwon[3] == 1 && pXwon[6] == 1){
    return 1;
   }
    return 0;
  }
    int Powon(){
   if(pOwon[0] == 1 && pOwon[1] == 1 && pOwon[2] == 1){
    return 1;
   }
    if(pOwon[3] == 1 && pOwon[4] == 1 && pOwon[5] == 1){
    return 1;
   }
    if(pOwon[6] == 1 && pOwon[7] == 1 && pOwon[8] == 1){
    return 1;
   }
    if(pOwon[0] == 1 && pOwon[4] == 1 && pOwon[8] == 1){
    return 1;
   }
    if(pOwon[6] == 1 && pOwon[7] == 1 && pOwon[8] == 1){
    return 1;
   }
    if(pOwon[2] == 1 && pOwon[4] == 1 && pOwon[6] == 1){
    return 1;
   }
    if(pOwon[1] == 1 && pOwon[7] == 1 && pOwon[4] == 1){
    return 1;
   }
    if(pOwon[2] == 1 && pOwon[5] == 1 && pOwon[8] == 1){
    return 1;
   }
    if(pOwon[0] == 1 && pOwon[3] == 1 && pOwon[6] == 1){
    return 1;
   }
    return 0;
  }

    public Tictac() {
        initComponents(); 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        tf = new javax.swing.JTextField();
        b = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfActionPerformed(evt);
            }
        });

        b.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b.setText("Start new game");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(b)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfActionPerformed
         
    }//GEN-LAST:event_tfActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(buttonused[0] == 0){
        if(turn%2 == 0){
            b1.setText("X");
            turn ++;
            buttonused[0] = 1;
             b1.setEnabled(false);
             pXwon[0] = 1;
             int result1 = Pxwon();
             int result2 = Powon();
             
             if(result1 == 1){
                 tf.setText("X has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }else if(result2 == 1){
                 tf.setText("O has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }
        }else{
            b1.setText("O");
            turn ++;
            buttonused[0] = 1;
             b1.setEnabled(false);
             pOwon[0] = 1;
             
             int result1 = Pxwon();
             int result2 = Powon();
             
             if(result1 == 1){
                 tf.setText("X has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }else if(result2 == 1){
                 tf.setText("O has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }
        }
      }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        if(buttonused[1] == 0){
        if(turn%2 == 0){
            b2.setText("X");
            turn ++;
            buttonused[1] = 1;
             b2.setEnabled(false);
             pXwon[1] = 1;
             int result1 = Pxwon();
             int result2 = Powon();
             
             if(result1 == 1){
                 tf.setText("X has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }else if(result2 == 1){
                 tf.setText("O has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }
        }else{
            b2.setText("O");
            turn ++;
            buttonused[1] = 1;
             b2.setEnabled(false);
             pOwon[1] = 1;
             
             int result1 = Pxwon();
             int result2 = Powon();
             
             if(result1 == 1){
                 tf.setText("X has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }else if(result2 == 1){
                 tf.setText("O has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }
        }
      }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        if(buttonused[2] == 0){
        if(turn%2 == 0){
            b3.setText("X");
            turn ++;
            buttonused[2] = 1;
             b3.setEnabled(false);
             pXwon[2] = 1;
             int result1 = Pxwon();
             int result2 = Powon();
             
             if(result1 == 1){
                 tf.setText("X has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }else if(result2 == 1){
                 tf.setText("O has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }
        }else{
            b3.setText("O");
            turn ++;
            buttonused[2] = 1;
             b3.setEnabled(false);
             pOwon[2] = 1;
             
             int result1 = Pxwon();
             int result2 = Powon();
             
             if(result1 == 1){
                 tf.setText("X has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }else if(result2 == 1){
                 tf.setText("O has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }
        }
      }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        if(buttonused[3] == 0){
        if(turn%2 == 0){
            b4.setText("X");
            turn ++;
            buttonused[0] = 1;
             b4.setEnabled(false);
             pXwon[3] = 1;
             int result1 = Pxwon();
             int result2 = Powon();
             
             if(result1 == 1){
                 tf.setText("X has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }else if(result2 == 1){
                 tf.setText("O has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }
        }else{
            b4.setText("O");
            turn ++;
            buttonused[3] = 1;
             b4.setEnabled(false);
             pOwon[3] = 1;
             
             int result1 = Pxwon();
             int result2 = Powon();
             
             if(result1 == 1){
                 tf.setText("X has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }else if(result2 == 1){
                 tf.setText("O has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }
        }
      }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        if(buttonused[4] == 0){
        if(turn%2 == 0){
            b5.setText("X");
            turn ++;
            buttonused[4] = 1;
             b5.setEnabled(false);
             pXwon[4] = 1;
             int result1 = Pxwon();
             int result2 = Powon();
             
             if(result1 == 1){
                 tf.setText("X has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }else if(result2 == 1){
                 tf.setText("O has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }
        }else{
            b5.setText("O");
            turn ++;
            buttonused[4] = 1;
             b5.setEnabled(false);
             pOwon[4] = 1;
             
             int result1 = Pxwon();
             int result2 = Powon();
             
             if(result1 == 1){
                 tf.setText("X has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }else if(result2 == 1){
                 tf.setText("O has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }
        }
      }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        if(buttonused[5] == 0){
        if(turn%2 == 0){
            b6.setText("X");
            turn ++;
            buttonused[5] = 1;
             b6.setEnabled(false);
             pXwon[5] = 1;
             int result1 = Pxwon();
             int result2 = Powon();
             
             if(result1 == 1){
                 tf.setText("X has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }else if(result2 == 1){
                 tf.setText("O has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }
        }else{
            b6.setText("O");
            turn ++;
            buttonused[5] = 1;
             b6.setEnabled(false);
             pOwon[5] = 1;
             
             int result1 = Pxwon();
             int result2 = Powon();
             
             if(result1 == 1){
                 tf.setText("X has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }else if(result2 == 1){
                 tf.setText("O has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }
        }
      }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        if(buttonused[6] == 0){
        if(turn%2 == 0){
            b7.setText("X");
            turn ++;
            buttonused[6] = 1;
             b7.setEnabled(false);
             pXwon[6] = 1;
             int result1 = Pxwon();
             int result2 = Powon();
             
             if(result1 == 1){
                 tf.setText("X has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }else if(result2 == 1){
                 tf.setText("O has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }
        }else{
            b7.setText("O");
            turn ++;
            buttonused[6] = 1;
             b7.setEnabled(false);
             pOwon[6] = 1;
             
             int result1 = Pxwon();
             int result2 = Powon();
             
             if(result1 == 1){
                 tf.setText("X has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }else if(result2 == 1){
                 tf.setText("O has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }
        }
      }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        if(buttonused[7] == 0){
        if(turn%2 == 0){
            b8.setText("X");
            turn ++;
            buttonused[7] = 1;
             b8.setEnabled(false);
             pXwon[7] = 1;
             int result1 = Pxwon();
             int result2 = Powon();
             
             if(result1 == 1){
                 tf.setText("X has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }else if(result2 == 1){
                 tf.setText("O has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }
        }else{
            b8.setText("O");
            turn ++;
            buttonused[7] = 1;
             b8.setEnabled(false);
             pOwon[7] = 1;
             
             int result1 = Pxwon();
             int result2 = Powon();
             
             if(result1 == 1){
                 tf.setText("X has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }else if(result2 == 1){
                 tf.setText("O has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }
        }
      }
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        if(buttonused[8] == 0){
        if(turn%2 == 0){
            b9.setText("X");
            turn ++;
            buttonused[8] = 1;
             b9.setEnabled(false);
             pXwon[8] = 1;
             int result1 = Pxwon();
             int result2 = Powon();
             
             if(result1 == 1){
                 tf.setText("X has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }else if(result2 == 1){
                 tf.setText("O has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }
        }else{
            b9.setText("O");
            turn ++;
            buttonused[8] = 1;
             b9.setEnabled(false);
             pOwon[8] = 1;
             
             int result1 = Pxwon();
             int result2 = Powon();
             
             if(result1 == 1){
                 tf.setText("X has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }else if(result2 == 1){
                 tf.setText("O has won the game");
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);
             }
        }
      }
    }//GEN-LAST:event_b9ActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tictac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
}
