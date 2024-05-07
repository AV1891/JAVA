/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicTacToeGame;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author aseesvirk
 */
public class TicTacToe extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToe
     */
    private String startGame= "X";
     private int xCount =0;
     private int OCount =0;
     boolean checker;
      
     
    public TicTacToe() { 
        initComponents();
    }
    
    private void gameScore()
    {
        jlblPlayerX.setText(String.valueOf(xCount));
        jlblPlayer0.setText(String.valueOf(OCount));
 
    }
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }

    } 
     private void winningGame()
    {
        String b1 = jbtnTic1.getText();
         String b2 = jbtnTic2.getText();
          String b3 = jbtnTic3.getText();
           String b4 = jbtnTic4.getText();
           String b5 = jbtnTic5.getText();
         String b6 = jbtnTic6.getText();
          String b7 = jbtnTic7.getText();
           String b8 = jbtnTic8.getText();
            String b9 = jbtnTic9.getText();
            
            if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
               
            {
                JOptionPane.showMessageDialog(this, "Player X Wins  ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                jbtnTic1.setBackground(Color.red);
                 jbtnTic2.setBackground(Color.red);
                 jbtnTic3.setBackground(Color.red);
                 xCount++; 
                 gameScore();
            }
            
            if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
               
            {
                JOptionPane.showMessageDialog(this, "Player X Wins  ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                jbtnTic4.setBackground(Color.cyan);
                 jbtnTic5.setBackground(Color.cyan);
                 jbtnTic6.setBackground(Color.cyan);
                 xCount++; 
                 gameScore();
            }
            if(b7 == ("X") && b8 == ("X") && b9  == ("X"))
               
            {
                JOptionPane.showMessageDialog(this, "Player X Wins  ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                jbtnTic7.setBackground(Color.magenta);
                 jbtnTic8.setBackground(Color.magenta);
                 jbtnTic9.setBackground(Color.magenta );
                 xCount++; 
                 gameScore();
            }
            if(b7 == ("O") && b8 == ("O") && b9  == ("O"))
               
            {
                JOptionPane.showMessageDialog(this, "Player O Wins  ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                jbtnTic7.setBackground(Color.magenta);
                 jbtnTic8.setBackground(Color.magenta);
                 jbtnTic9.setBackground(Color.magenta );
                 OCount++; 
                 gameScore();
            }
            if(b4 == ("O") && b5 == ("O") && b6 == ("O"))
               
            {
                JOptionPane.showMessageDialog(this, "Player O Wins  ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                jbtnTic4.setBackground(Color.cyan);
                 jbtnTic5.setBackground(Color.cyan);
                 jbtnTic6.setBackground(Color.cyan);
                 OCount++; 
                 gameScore();
            }
            if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
               
            {
                JOptionPane.showMessageDialog(this, "Player O Wins  ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                jbtnTic1.setBackground(Color.red);
                 jbtnTic2.setBackground(Color.red);
                 jbtnTic3.setBackground(Color.red);
                 OCount++; 
                 gameScore();
            }
            if(b1 == ("X") && b4 == ("X") && b7 == ("X"))
               
            {
                JOptionPane.showMessageDialog(this, "Player X Wins  ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                jbtnTic1.setBackground(Color.pink);
                 jbtnTic4.setBackground(Color.pink);
                 jbtnTic7.setBackground(Color.pink);
                 xCount++; 
                 gameScore();
            }
            if(b1 == ("O") && b4 == ("O") && b7 == ("O"))
               
            {
                JOptionPane.showMessageDialog(this, "Player O Wins  ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                jbtnTic1.setBackground(Color.pink);
                 jbtnTic4.setBackground(Color.pink);
                 jbtnTic7.setBackground(Color.pink);
                 OCount++; 
                 gameScore();
            }
            if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
               
            {
                JOptionPane.showMessageDialog(this, "Player X Wins  ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                jbtnTic2.setBackground(Color.ORANGE);
                 jbtnTic5.setBackground(Color.ORANGE);
                 jbtnTic8.setBackground(Color.ORANGE);
                 xCount++; 
                 gameScore();
            }
            if(b2 == ("O") && b5 == ("O") && b8 == ("O"))
               
            {
                JOptionPane.showMessageDialog(this, "Player O Wins  ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                jbtnTic2.setBackground(Color.ORANGE);
                 jbtnTic5.setBackground(Color.ORANGE);
                 jbtnTic8.setBackground(Color.ORANGE);
                 OCount++; 
                 gameScore();
            }
            if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
               
            {
                JOptionPane.showMessageDialog(this, "Player X Wins  ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                jbtnTic3.setBackground(Color.ORANGE);
                 jbtnTic6.setBackground(Color.ORANGE);
                 jbtnTic9.setBackground(Color.ORANGE);
                 xCount++; 
                 gameScore();
            }
            if(b3 == ("O") && b6 == ("O") && b9 == ("O"))
               
            {
                JOptionPane.showMessageDialog(this, "Player O Wins  ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                jbtnTic3.setBackground(Color.ORANGE);
                 jbtnTic6.setBackground(Color.ORANGE);
                 jbtnTic9.setBackground(Color.ORANGE);
                 OCount++; 
                 gameScore();
            }
            if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
               
            {
                JOptionPane.showMessageDialog(this, "Player X Wins  ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                jbtnTic1.setBackground(Color.pink);
                 jbtnTic5.setBackground(Color.pink);
                 jbtnTic9.setBackground(Color.pink);
                 xCount++; 
                 gameScore();
            }
            if(b1 == ("O") && b5 == ("O") && b9 == ("O"))
               
            {
                JOptionPane.showMessageDialog(this, "Player O Wins  ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                jbtnTic1.setBackground(Color.pink);
                 jbtnTic5.setBackground(Color.pink);
                 jbtnTic9.setBackground(Color.pink);
                 OCount++; 
                 gameScore();
            }
            if(b3 == ("X") && b5 == ("X") && b7 == ("X"))
               
            {
                JOptionPane.showMessageDialog(this, "Player X Wins  ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                jbtnTic3.setBackground(Color.YELLOW);
                 jbtnTic5.setBackground(Color.YELLOW);
                 jbtnTic7.setBackground(Color.YELLOW);
                 xCount++; 
                 gameScore();
            }
            if(b3 == ("O") && b5 == ("O") && b7 == ("O"))
               
            {
                JOptionPane.showMessageDialog(this, "Player O Wins  ", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                jbtnTic3.setBackground(Color.YELLOW);
                 jbtnTic5.setBackground(Color.YELLOW);
                 jbtnTic7.setBackground(Color.YELLOW);
                 OCount++; 
                 gameScore();
            }
            
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jbtnTic3 = new javax.swing.JButton();
        jbtnTic6 = new javax.swing.JButton();
        jbtnTic8 = new javax.swing.JButton();
        jbtnTic7 = new javax.swing.JButton();
        jbtnTic1 = new javax.swing.JButton();
        jbtnTic2 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jbtnTic4 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jbtnTic5 = new javax.swing.JButton();
        jbtnTic9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlblPlayerX = new javax.swing.JLabel();
        jlblPlayer0 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(95, 158, 248));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(95, 120, 248));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnTic3.setFont(new java.awt.Font("Helvetica Neue", 1, 96)); // NOI18N
        jbtnTic3.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic3.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic3.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic3ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnTic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 200, 180));

        jbtnTic6.setFont(new java.awt.Font("Helvetica Neue", 1, 96)); // NOI18N
        jbtnTic6.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic6.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic6.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic6ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnTic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 200, 180));

        jbtnTic8.setFont(new java.awt.Font("Helvetica Neue", 1, 96)); // NOI18N
        jbtnTic8.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic8.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic8.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic8ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnTic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 200, 180));

        jbtnTic7.setFont(new java.awt.Font("Helvetica Neue", 1, 96)); // NOI18N
        jbtnTic7.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic7.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic7.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic7ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnTic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 200, 180));

        jbtnTic1.setFont(new java.awt.Font("Helvetica Neue", 1, 96)); // NOI18N
        jbtnTic1.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic1.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic1.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic1ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnTic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 200, 180));

        jbtnTic2.setFont(new java.awt.Font("Helvetica Neue", 1, 96)); // NOI18N
        jbtnTic2.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic2.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic2.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic2ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnTic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 200, 180));

        jButton13.setFont(new java.awt.Font("Helvetica Neue", 1, 96)); // NOI18N
        jButton13.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton13.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton13.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 200, 180));

        jbtnTic4.setFont(new java.awt.Font("Helvetica Neue", 1, 96)); // NOI18N
        jbtnTic4.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic4.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic4.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic4ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnTic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 180));

        jButton15.setFont(new java.awt.Font("Helvetica Neue", 1, 96)); // NOI18N
        jButton15.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton15.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton15.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 200, 180));

        jbtnTic5.setFont(new java.awt.Font("Helvetica Neue", 1, 96)); // NOI18N
        jbtnTic5.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic5.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic5.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic5ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnTic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 200, 180));

        jbtnTic9.setFont(new java.awt.Font("Helvetica Neue", 1, 96)); // NOI18N
        jbtnTic9.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic9.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic9.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic9ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnTic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 200, 180));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 730, 640));

        jPanel2.setBackground(new java.awt.Color(95, 120, 248));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(95, 158, 248));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 66)); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("InaiMathi", 1, 66)); // NOI18N
        jLabel3.setText("Player 0:");
        jLabel3.setToolTipText("");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jlblPlayerX.setFont(new java.awt.Font("InaiMathi", 1, 66)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jlblPlayerX.setToolTipText("");
        jlblPlayerX.setOpaque(true);
        jPanel5.add(jlblPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 280, 100));

        jlblPlayer0.setFont(new java.awt.Font("InaiMathi", 1, 66)); // NOI18N
        jlblPlayer0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayer0.setText("0");
        jlblPlayer0.setToolTipText("");
        jlblPlayer0.setOpaque(true);
        jPanel5.add(jlblPlayer0, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 280, 100));

        jLabel4.setFont(new java.awt.Font("InaiMathi", 1, 66)); // NOI18N
        jLabel4.setText("Player X:");
        jLabel4.setToolTipText("");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 640, 280));

        jPanel6.setBackground(new java.awt.Color(95, 158, 248));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setFont(new java.awt.Font("InaiMathi", 1, 96)); // NOI18N
        jButton9.setText("Reset");
        jButton9.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton9.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton9.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 300, 120));

        jButton20.setFont(new java.awt.Font("InaiMathi", 1, 96)); // NOI18N
        jButton20.setText("Exit");
        jButton20.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton20.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton20.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 310, 120));

        jButton21.setFont(new java.awt.Font("InaiMathi", 1, 96)); // NOI18N
        jButton21.setText("New Game");
        jButton21.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton21.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton21.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 620, 110));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 640, 290));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 700, 640));

        jPanel7.setBackground(new java.awt.Color(95, 120, 248));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("InaiMathi", 1, 66)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Java Tic Tac Toe Asees");
        jLabel2.setToolTipText("");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, 80));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1370, 120));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 810));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jbtnTic3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jbtnTic3.setText(startGame);
         
         if(startGame.equalsIgnoreCase("X"))
         {
              checker = false;
         }
         else
          {
              checker = true;
         } 
         choose_a_Player(); 
         winningGame();
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
       
        jbtnTic1.setEnabled(true);
            jbtnTic2.setEnabled(true);
                jbtnTic3.setEnabled(true); 
           jbtnTic4.setEnabled(true);
            jbtnTic5.setEnabled(true);
                jbtnTic6.setEnabled(true);
                jbtnTic7.setEnabled(true);
            jbtnTic8.setEnabled(true);
                jbtnTic9 .setEnabled(true);
                
                jbtnTic1.setText("");
                 jbtnTic2.setText("");
                 jbtnTic3.setText("");
                jbtnTic4.setText("");
                 jbtnTic5.setText(""); 
                 jbtnTic6.setText("");
                jbtnTic7.setText("");
                jbtnTic8.setText("");
                 jbtnTic9.setText("");
                 
                 jbtnTic1.setBackground(Color.LIGHT_GRAY);
                 jbtnTic2.setBackground(Color.LIGHT_GRAY);
                 jbtnTic3.setBackground(Color.LIGHT_GRAY);
                 jbtnTic4.setBackground(Color.LIGHT_GRAY);
                 jbtnTic5.setBackground(Color.LIGHT_GRAY);
                 jbtnTic6.setBackground(Color.LIGHT_GRAY);
                 jbtnTic7.setBackground(Color.LIGHT_GRAY);
                 jbtnTic8.setBackground(Color.LIGHT_GRAY);
                 jbtnTic9.setBackground(Color.LIGHT_GRAY);
    }                                        

    private void jbtnTic7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jbtnTic7.setText(startGame);
         
         if(startGame.equalsIgnoreCase("X"))
         {
              checker = false;
         }
         else
          {
              checker = true;
         } 
         choose_a_Player(); 
         winningGame();
    }                                        

    private void jbtnTic1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
         jbtnTic1.setText(startGame);
         
         if(startGame.equalsIgnoreCase("X"))
         {
              checker = false;
         }
         else
          {
              checker = true;
         } 
         choose_a_Player(); 
         winningGame();
    }                                        

    private void jbtnTic2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jbtnTic2.setText(startGame);
         
         if(startGame.equalsIgnoreCase("X"))
         {
              checker = false;
         }
         else
          {
              checker = true;
         } 
         choose_a_Player(); 
         winningGame();
    }                                        

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jbtnTic4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jbtnTic4.setText(startGame);
         
         if(startGame.equalsIgnoreCase("X"))
         {
              checker = false;
         }
         else
          {
              checker = true;
         } 
         choose_a_Player(); 
         winningGame();
    }                                        

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jbtnTic5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jbtnTic5 .setText(startGame);
         
         if(startGame.equalsIgnoreCase("X"))
         {
              checker = false;
         }
         else
          {
              checker = true;
         } 
         choose_a_Player(); 
         winningGame();
    }                                        

    private void jbtnTic9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jbtnTic9.setText(startGame);
         
         if(startGame.equalsIgnoreCase("X"))
         {
              checker = false;
         }
         else
          {
              checker = true;
         } 
         choose_a_Player(); 
         winningGame();
    }                                        
private JFrame frame;
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        frame = new JFrame ("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Tic Tac Toe",
                JOptionPane.YES_NO_OPTION )== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }                                         

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         // TODO add your handling code here:
         
        jbtnTic1.setEnabled(true);
            jbtnTic2.setEnabled(true);
                jbtnTic3.setEnabled(true); 
           jbtnTic4.setEnabled(true);
            jbtnTic5.setEnabled(true);
                jbtnTic6.setEnabled(true);
                jbtnTic7.setEnabled(true);
            jbtnTic8.setEnabled(true);
                jbtnTic9 .setEnabled(true);
                
                jlblPlayerX.setText("0 ");
                jlblPlayer0.setText("0 ");
                
                jbtnTic1.setText("");
                 jbtnTic2.setText("");
                jbtnTic4.setText("");
                 jbtnTic5.setText(""); 
                 jbtnTic6.setText("");
                jbtnTic7.setText("");
                jbtnTic8.setText("");
                 jbtnTic9.setText("");
                 
                 jbtnTic1.setBackground(Color.LIGHT_GRAY);
                 jbtnTic2.setBackground(Color.LIGHT_GRAY);
                 jbtnTic3.setBackground(Color.LIGHT_GRAY);
                 jbtnTic4.setBackground(Color.LIGHT_GRAY);
                 jbtnTic5.setBackground(Color.LIGHT_GRAY);
                 jbtnTic6.setBackground(Color.LIGHT_GRAY);
                 jbtnTic7.setBackground(Color.LIGHT_GRAY);
                 jbtnTic8.setBackground(Color.LIGHT_GRAY);
                 jbtnTic9.setBackground(Color.LIGHT_GRAY);
    }                                         

    private void jbtnTic6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jbtnTic6.setText(startGame);
         
         if(startGame.equalsIgnoreCase("X"))
         {
              checker = false;
         }
         else
          {
              checker = true;
         } 
         choose_a_Player(); 
         winningGame();
    }                                        

    private void jbtnTic8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jbtnTic8.setText(startGame);
         
         if(startGame.equalsIgnoreCase("X"))
         {
              checker = false;
         }
         else
          {
              checker = true;
         } 
         choose_a_Player(); 
         winningGame();
    }                                        

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton jbtnTic1;
    private javax.swing.JButton jbtnTic2;
    private javax.swing.JButton jbtnTic3;
    private javax.swing.JButton jbtnTic4;
    private javax.swing.JButton jbtnTic5;
    private javax.swing.JButton jbtnTic6;
    private javax.swing.JButton jbtnTic7;
    private javax.swing.JButton jbtnTic8;
    private javax.swing.JButton jbtnTic9;
    private javax.swing.JLabel jlblPlayer0;
    private javax.swing.JLabel jlblPlayerX;
    // End of variables declaration                   
}
 
