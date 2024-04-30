
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ahmad
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    Checker c1 = new Checker();
    int[][] finalPuzzle = new int[9][9];
    int CounterCorrect, emptyCells;
    private static int Diff;

    public int getDiff() {
        return Diff;
    }

    public void setDiff(int Diff) {
        this.Diff = Diff;
    }

    public NewJFrame() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height * 9 / 20;
        int width = screenSize.width * 1 / 2;
        this.setPreferredSize(new Dimension(width, height));

        initComponents();
        Counter.setHorizontalAlignment(jTextField100.CENTER);

        T00.setHorizontalAlignment(jTextField100.CENTER);
        T01.setHorizontalAlignment(jTextField100.CENTER);
        T02.setHorizontalAlignment(jTextField100.CENTER);
        T03.setHorizontalAlignment(jTextField100.CENTER);
        T04.setHorizontalAlignment(jTextField100.CENTER);
        T05.setHorizontalAlignment(jTextField100.CENTER);
        T06.setHorizontalAlignment(jTextField100.CENTER);
        T07.setHorizontalAlignment(jTextField100.CENTER);
        T08.setHorizontalAlignment(jTextField100.CENTER);
        T10.setHorizontalAlignment(jTextField100.CENTER);
        T11.setHorizontalAlignment(jTextField100.CENTER);
        T12.setHorizontalAlignment(jTextField100.CENTER);
        T13.setHorizontalAlignment(jTextField100.CENTER);
        T14.setHorizontalAlignment(jTextField100.CENTER);
        T15.setHorizontalAlignment(jTextField100.CENTER);
        T16.setHorizontalAlignment(jTextField100.CENTER);
        T17.setHorizontalAlignment(jTextField100.CENTER);
        T18.setHorizontalAlignment(jTextField100.CENTER);
        T20.setHorizontalAlignment(jTextField100.CENTER);
        T21.setHorizontalAlignment(jTextField100.CENTER);
        T22.setHorizontalAlignment(jTextField100.CENTER);
        T23.setHorizontalAlignment(jTextField100.CENTER);
        T24.setHorizontalAlignment(jTextField100.CENTER);
        T25.setHorizontalAlignment(jTextField100.CENTER);
        T26.setHorizontalAlignment(jTextField100.CENTER);
        T27.setHorizontalAlignment(jTextField100.CENTER);
        T28.setHorizontalAlignment(jTextField100.CENTER);
        T30.setHorizontalAlignment(jTextField100.CENTER);
        T31.setHorizontalAlignment(jTextField100.CENTER);
        T32.setHorizontalAlignment(jTextField100.CENTER);
        T33.setHorizontalAlignment(jTextField100.CENTER);
        T34.setHorizontalAlignment(jTextField100.CENTER);
        T35.setHorizontalAlignment(jTextField100.CENTER);
        T36.setHorizontalAlignment(jTextField100.CENTER);
        T37.setHorizontalAlignment(jTextField100.CENTER);
        T38.setHorizontalAlignment(jTextField100.CENTER);
        T40.setHorizontalAlignment(jTextField100.CENTER);
        T41.setHorizontalAlignment(jTextField100.CENTER);
        T42.setHorizontalAlignment(jTextField100.CENTER);
        T43.setHorizontalAlignment(jTextField100.CENTER);
        T44.setHorizontalAlignment(jTextField100.CENTER);
        T45.setHorizontalAlignment(jTextField100.CENTER);
        T46.setHorizontalAlignment(jTextField100.CENTER);
        T47.setHorizontalAlignment(jTextField100.CENTER);
        T48.setHorizontalAlignment(jTextField100.CENTER);
        T50.setHorizontalAlignment(jTextField100.CENTER);
        T51.setHorizontalAlignment(jTextField100.CENTER);
        T52.setHorizontalAlignment(jTextField100.CENTER);
        T53.setHorizontalAlignment(jTextField100.CENTER);
        T54.setHorizontalAlignment(jTextField100.CENTER);
        T55.setHorizontalAlignment(jTextField100.CENTER);
        T56.setHorizontalAlignment(jTextField100.CENTER);
        T57.setHorizontalAlignment(jTextField100.CENTER);
        T58.setHorizontalAlignment(jTextField100.CENTER);
        T60.setHorizontalAlignment(jTextField100.CENTER);
        T61.setHorizontalAlignment(jTextField100.CENTER);
        T62.setHorizontalAlignment(jTextField100.CENTER);
        T63.setHorizontalAlignment(jTextField100.CENTER);
        T64.setHorizontalAlignment(jTextField100.CENTER);
        T65.setHorizontalAlignment(jTextField100.CENTER);
        T66.setHorizontalAlignment(jTextField100.CENTER);
        T67.setHorizontalAlignment(jTextField100.CENTER);
        T68.setHorizontalAlignment(jTextField100.CENTER);
        T70.setHorizontalAlignment(jTextField100.CENTER);
        T71.setHorizontalAlignment(jTextField100.CENTER);
        T72.setHorizontalAlignment(jTextField100.CENTER);
        T73.setHorizontalAlignment(jTextField100.CENTER);
        T74.setHorizontalAlignment(jTextField100.CENTER);
        T75.setHorizontalAlignment(jTextField100.CENTER);
        T76.setHorizontalAlignment(jTextField100.CENTER);
        T77.setHorizontalAlignment(jTextField100.CENTER);
        T78.setHorizontalAlignment(jTextField100.CENTER);
        T80.setHorizontalAlignment(jTextField100.CENTER);
        T81.setHorizontalAlignment(jTextField100.CENTER);
        T82.setHorizontalAlignment(jTextField100.CENTER);
        T83.setHorizontalAlignment(jTextField100.CENTER);
        T84.setHorizontalAlignment(jTextField100.CENTER);
        T85.setHorizontalAlignment(jTextField100.CENTER);
        T86.setHorizontalAlignment(jTextField100.CENTER);
        T87.setHorizontalAlignment(jTextField100.CENTER);
        T88.setHorizontalAlignment(jTextField100.CENTER);
        Font font = new Font("Courier", Font.BOLD, 16);
        Counter.setFont(font);
        T00.setFont(font);
        T01.setFont(font);
        T02.setFont(font);
        T03.setFont(font);
        T04.setFont(font);
        T05.setFont(font);
        T06.setFont(font);
        T07.setFont(font);
        T08.setFont(font);
        T10.setFont(font);
        T11.setFont(font);
        T12.setFont(font);
        T13.setFont(font);
        T14.setFont(font);
        T15.setFont(font);
        T16.setFont(font);
        T17.setFont(font);
        T18.setFont(font);
        T20.setFont(font);
        T21.setFont(font);
        T22.setFont(font);
        T23.setFont(font);
        T24.setFont(font);
        T25.setFont(font);
        T26.setFont(font);
        T27.setFont(font);
        T28.setFont(font);
        T30.setFont(font);
        T31.setFont(font);
        T32.setFont(font);
        T33.setFont(font);
        T34.setFont(font);
        T35.setFont(font);
        T36.setFont(font);
        T37.setFont(font);
        T38.setFont(font);
        T40.setFont(font);
        T41.setFont(font);
        T42.setFont(font);
        T43.setFont(font);
        T44.setFont(font);
        T45.setFont(font);
        T46.setFont(font);
        T47.setFont(font);
        T48.setFont(font);
        T50.setFont(font);
        T51.setFont(font);
        T52.setFont(font);
        T53.setFont(font);
        T54.setFont(font);
        T55.setFont(font);
        T56.setFont(font);
        T57.setFont(font);
        T58.setFont(font);
        T60.setFont(font);
        T61.setFont(font);
        T62.setFont(font);
        T63.setFont(font);
        T64.setFont(font);
        T65.setFont(font);
        T66.setFont(font);
        T67.setFont(font);
        T68.setFont(font);
        T70.setFont(font);
        T71.setFont(font);
        T72.setFont(font);
        T73.setFont(font);
        T74.setFont(font);
        T75.setFont(font);
        T76.setFont(font);
        T77.setFont(font);
        T78.setFont(font);
        T80.setFont(font);
        T81.setFont(font);
        T82.setFont(font);
        T83.setFont(font);
        T84.setFont(font);
        T85.setFont(font);
        T86.setFont(font);
        T87.setFont(font);
        T88.setFont(font);

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
        jPanel13 = new javax.swing.JPanel();
        jTextField100 = new javax.swing.JTextField();
        jTextField101 = new javax.swing.JTextField();
        jTextField102 = new javax.swing.JTextField();
        jTextField103 = new javax.swing.JTextField();
        jTextField104 = new javax.swing.JTextField();
        jTextField105 = new javax.swing.JTextField();
        jTextField106 = new javax.swing.JTextField();
        jTextField107 = new javax.swing.JTextField();
        jTextField108 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jTextField109 = new javax.swing.JTextField();
        jTextField110 = new javax.swing.JTextField();
        jTextField111 = new javax.swing.JTextField();
        jTextField112 = new javax.swing.JTextField();
        jTextField113 = new javax.swing.JTextField();
        jTextField114 = new javax.swing.JTextField();
        jTextField115 = new javax.swing.JTextField();
        jTextField116 = new javax.swing.JTextField();
        jTextField117 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jTextField118 = new javax.swing.JTextField();
        jTextField119 = new javax.swing.JTextField();
        jTextField120 = new javax.swing.JTextField();
        jTextField121 = new javax.swing.JTextField();
        jTextField122 = new javax.swing.JTextField();
        jTextField123 = new javax.swing.JTextField();
        jTextField124 = new javax.swing.JTextField();
        jTextField125 = new javax.swing.JTextField();
        jTextField126 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        T10 = new javax.swing.JTextField();
        T20 = new javax.swing.JTextField();
        T11 = new javax.swing.JTextField();
        T21 = new javax.swing.JTextField();
        T02 = new javax.swing.JTextField();
        T01 = new javax.swing.JTextField();
        T00 = new javax.swing.JTextField();
        T22 = new javax.swing.JTextField();
        T12 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        T13 = new javax.swing.JTextField();
        T23 = new javax.swing.JTextField();
        T14 = new javax.swing.JTextField();
        T24 = new javax.swing.JTextField();
        T05 = new javax.swing.JTextField();
        T04 = new javax.swing.JTextField();
        T03 = new javax.swing.JTextField();
        T25 = new javax.swing.JTextField();
        T15 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        T16 = new javax.swing.JTextField();
        T26 = new javax.swing.JTextField();
        T17 = new javax.swing.JTextField();
        T27 = new javax.swing.JTextField();
        T08 = new javax.swing.JTextField();
        T07 = new javax.swing.JTextField();
        T06 = new javax.swing.JTextField();
        T28 = new javax.swing.JTextField();
        T18 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        T46 = new javax.swing.JTextField();
        T56 = new javax.swing.JTextField();
        T47 = new javax.swing.JTextField();
        T57 = new javax.swing.JTextField();
        T38 = new javax.swing.JTextField();
        T37 = new javax.swing.JTextField();
        T36 = new javax.swing.JTextField();
        T58 = new javax.swing.JTextField();
        T48 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        T43 = new javax.swing.JTextField();
        T53 = new javax.swing.JTextField();
        T44 = new javax.swing.JTextField();
        T54 = new javax.swing.JTextField();
        T35 = new javax.swing.JTextField();
        T34 = new javax.swing.JTextField();
        T33 = new javax.swing.JTextField();
        T55 = new javax.swing.JTextField();
        T45 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        T40 = new javax.swing.JTextField();
        T50 = new javax.swing.JTextField();
        T41 = new javax.swing.JTextField();
        T51 = new javax.swing.JTextField();
        T32 = new javax.swing.JTextField();
        T31 = new javax.swing.JTextField();
        T30 = new javax.swing.JTextField();
        T52 = new javax.swing.JTextField();
        T42 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        T73 = new javax.swing.JTextField();
        T83 = new javax.swing.JTextField();
        T74 = new javax.swing.JTextField();
        T84 = new javax.swing.JTextField();
        T65 = new javax.swing.JTextField();
        T64 = new javax.swing.JTextField();
        T63 = new javax.swing.JTextField();
        T85 = new javax.swing.JTextField();
        T75 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        T76 = new javax.swing.JTextField();
        T86 = new javax.swing.JTextField();
        T77 = new javax.swing.JTextField();
        T87 = new javax.swing.JTextField();
        T68 = new javax.swing.JTextField();
        T67 = new javax.swing.JTextField();
        T66 = new javax.swing.JTextField();
        T88 = new javax.swing.JTextField();
        T78 = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        T70 = new javax.swing.JTextField();
        T80 = new javax.swing.JTextField();
        T71 = new javax.swing.JTextField();
        T81 = new javax.swing.JTextField();
        T62 = new javax.swing.JTextField();
        T61 = new javax.swing.JTextField();
        T60 = new javax.swing.JTextField();
        T82 = new javax.swing.JTextField();
        T72 = new javax.swing.JTextField();
        Generator = new javax.swing.JButton();
        Counter = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));

        jTextField100.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        jTextField100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField100ActionPerformed(evt);
            }
        });

        jTextField101.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));

        jTextField102.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        jTextField102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField102ActionPerformed(evt);
            }
        });

        jTextField103.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));

        jTextField104.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        jTextField104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField104ActionPerformed(evt);
            }
        });

        jTextField105.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        jTextField105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField105ActionPerformed(evt);
            }
        });

        jTextField106.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        jTextField106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField106ActionPerformed(evt);
            }
        });

        jTextField107.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));

        jTextField108.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        jTextField108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField108ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jTextField106, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField105, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jTextField100, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField102, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jTextField101, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField103, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField104, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField108, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField107, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField106, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField105, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField104, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField102, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField100, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField108, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField103, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField101, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField107, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));

        jTextField109.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        jTextField109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField109ActionPerformed(evt);
            }
        });

        jTextField110.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));

        jTextField111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        jTextField111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField111ActionPerformed(evt);
            }
        });

        jTextField112.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));

        jTextField113.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        jTextField113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField113ActionPerformed(evt);
            }
        });

        jTextField114.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        jTextField114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField114ActionPerformed(evt);
            }
        });

        jTextField115.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        jTextField115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField115ActionPerformed(evt);
            }
        });

        jTextField116.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));

        jTextField117.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        jTextField117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField117ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jTextField115, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField114, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jTextField109, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField111, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jTextField110, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField112, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField113, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField117, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField116, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField115, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField114, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField113, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField111, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField109, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField117, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField112, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField110, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField116, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel15.setBackground(new java.awt.Color(0, 0, 0));

        jTextField118.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        jTextField118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField118ActionPerformed(evt);
            }
        });

        jTextField119.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));

        jTextField120.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        jTextField120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField120ActionPerformed(evt);
            }
        });

        jTextField121.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));

        jTextField122.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        jTextField122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField122ActionPerformed(evt);
            }
        });

        jTextField123.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        jTextField123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField123ActionPerformed(evt);
            }
        });

        jTextField124.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        jTextField124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField124ActionPerformed(evt);
            }
        });

        jTextField125.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));

        jTextField126.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        jTextField126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField126ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jTextField124, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField123, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jTextField118, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField120, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jTextField119, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField121, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField122, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField126, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField125, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField124, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField123, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField122, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField120, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField118, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField126, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField121, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField119, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField125, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        T10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T10ActionPerformed(evt);
            }
        });

        T20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T20ActionPerformed(evt);
            }
        });

        T11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T11ActionPerformed(evt);
            }
        });

        T21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T21ActionPerformed(evt);
            }
        });

        T02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T02ActionPerformed(evt);
            }
        });

        T01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T01ActionPerformed(evt);
            }
        });

        T00.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T00ActionPerformed(evt);
            }
        });

        T22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T22ActionPerformed(evt);
            }
        });

        T12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(T00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T01, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(T10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(T20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T02, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T00, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T01, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T02, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T20, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(250, 28, 134, 128);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        T13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T13ActionPerformed(evt);
            }
        });

        T23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T23ActionPerformed(evt);
            }
        });

        T14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T14ActionPerformed(evt);
            }
        });

        T24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T24ActionPerformed(evt);
            }
        });

        T05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T05ActionPerformed(evt);
            }
        });

        T04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T04ActionPerformed(evt);
            }
        });

        T03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T03ActionPerformed(evt);
            }
        });

        T25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T25ActionPerformed(evt);
            }
        });

        T15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(T03, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T04, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(T13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(T23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T05, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T03, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T04, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T05, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T24, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T23, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T25, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        getContentPane().add(jPanel8);
        jPanel8.setBounds(384, 28, 126, 128);

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        T16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T16ActionPerformed(evt);
            }
        });

        T26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T26ActionPerformed(evt);
            }
        });

        T17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T17ActionPerformed(evt);
            }
        });

        T27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T27ActionPerformed(evt);
            }
        });

        T08.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T08ActionPerformed(evt);
            }
        });

        T07.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T07ActionPerformed(evt);
            }
        });

        T06.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T06ActionPerformed(evt);
            }
        });

        T28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T28ActionPerformed(evt);
            }
        });

        T18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(T06, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T07, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(T16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(T26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T08, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T06, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T07, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T08, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T27, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T26, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T28, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        getContentPane().add(jPanel9);
        jPanel9.setBounds(510, 28, 126, 128);

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        T46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T46ActionPerformed(evt);
            }
        });

        T56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T56ActionPerformed(evt);
            }
        });

        T47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T47ActionPerformed(evt);
            }
        });

        T57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T57ActionPerformed(evt);
            }
        });

        T38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T38ActionPerformed(evt);
            }
        });

        T37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T37ActionPerformed(evt);
            }
        });

        T36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T36ActionPerformed(evt);
            }
        });

        T58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T58ActionPerformed(evt);
            }
        });

        T48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T48ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(T36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(T46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(T56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T36, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T37, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T38, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T47, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T46, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T48, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T57, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T56, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T58, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        getContentPane().add(jPanel10);
        jPanel10.setBounds(510, 156, 126, 128);

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        T43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T43ActionPerformed(evt);
            }
        });

        T53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T53ActionPerformed(evt);
            }
        });

        T44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T44ActionPerformed(evt);
            }
        });

        T54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T54ActionPerformed(evt);
            }
        });

        T35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T35ActionPerformed(evt);
            }
        });

        T34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T34ActionPerformed(evt);
            }
        });

        T33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T33ActionPerformed(evt);
            }
        });

        T55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T55ActionPerformed(evt);
            }
        });

        T45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T45ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(T33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(T43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(T53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T33, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T34, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T35, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T44, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T43, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T45, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T54, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T53, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T55, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        getContentPane().add(jPanel11);
        jPanel11.setBounds(384, 156, 126, 128);

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));

        T40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T40ActionPerformed(evt);
            }
        });

        T50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T50ActionPerformed(evt);
            }
        });

        T41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T41ActionPerformed(evt);
            }
        });

        T51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T51ActionPerformed(evt);
            }
        });

        T32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T32ActionPerformed(evt);
            }
        });

        T31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T31ActionPerformed(evt);
            }
        });

        T30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T30ActionPerformed(evt);
            }
        });

        T52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T52ActionPerformed(evt);
            }
        });

        T42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T42ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(T30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(T40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(T50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T30, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T31, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T32, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T41, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T40, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T42, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T51, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T50, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T52, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        getContentPane().add(jPanel12);
        jPanel12.setBounds(250, 156, 134, 128);

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));

        T73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T73ActionPerformed(evt);
            }
        });

        T83.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T83ActionPerformed(evt);
            }
        });

        T74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T74ActionPerformed(evt);
            }
        });

        T84.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T84ActionPerformed(evt);
            }
        });

        T65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T65ActionPerformed(evt);
            }
        });

        T64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T64ActionPerformed(evt);
            }
        });

        T63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T63ActionPerformed(evt);
            }
        });

        T85.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T85ActionPerformed(evt);
            }
        });

        T75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T75ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(T63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(T73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(T83, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T84, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T85, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T63, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T64, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T65, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T74, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T73, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T75, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T84, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T83, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T85, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        getContentPane().add(jPanel16);
        jPanel16.setBounds(384, 284, 126, 128);

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));

        T76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T76ActionPerformed(evt);
            }
        });

        T86.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T86ActionPerformed(evt);
            }
        });

        T77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T77ActionPerformed(evt);
            }
        });

        T87.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T87ActionPerformed(evt);
            }
        });

        T68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T68ActionPerformed(evt);
            }
        });

        T67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T67ActionPerformed(evt);
            }
        });

        T66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T66ActionPerformed(evt);
            }
        });

        T88.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T88ActionPerformed(evt);
            }
        });

        T78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T78ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(T66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(T76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(T86, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T87, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T88, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T66, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T67, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T68, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T77, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T76, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T78, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T87, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T86, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T88, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        getContentPane().add(jPanel17);
        jPanel17.setBounds(510, 284, 126, 128);

        jPanel18.setBackground(new java.awt.Color(0, 0, 0));

        T70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T70ActionPerformed(evt);
            }
        });

        T80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T80ActionPerformed(evt);
            }
        });

        T71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T71ActionPerformed(evt);
            }
        });

        T81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T81ActionPerformed(evt);
            }
        });

        T62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T62ActionPerformed(evt);
            }
        });

        T61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T61ActionPerformed(evt);
            }
        });

        T60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T60ActionPerformed(evt);
            }
        });

        T82.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T82ActionPerformed(evt);
            }
        });

        T72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        T72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T72ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(T60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(T70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(T80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(T81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T82, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T60, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T61, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T62, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T71, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T70, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T72, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T81, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T80, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T82, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        getContentPane().add(jPanel18);
        jPanel18.setBounds(250, 284, 134, 128);

        Generator.setText("Genrate new puzzle");
        Font font1 = new Font("Courier", Font.BOLD,16);
        Generator.setFont(font1);
        Generator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneratorActionPerformed(evt);
            }
        });
        getContentPane().add(Generator);
        Generator.setBounds(702, 250, 190, 34);

        Counter.setEditable(false);
        Counter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CounterActionPerformed(evt);
            }
        });
        getContentPane().add(Counter);
        Counter.setBounds(760, 120, 112, 48);

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Number of Lives");
        Font font = new Font("Courier", Font.BOLD,24);
        jLabel1.setFont(font);
        jLabel1.setPreferredSize(new java.awt.Dimension(595, 201));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(690, 50, 240, 48);

        jButton1.setText("AI SOLVER");
        jButton1.setFont(font1);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(753, 307, 130, 45);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sudoku.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 950, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T10ActionPerformed
        int num = Integer.valueOf(T10.getText());
        if (!c1.IsPossible(1, 0, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T10.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T10.setEditable(false);
            T10.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T10ActionPerformed

    private void T11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T11ActionPerformed
        int num = Integer.valueOf(T11.getText());
        if (!c1.IsPossible(1, 1, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T11.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T11.setEditable(false);
            T11.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T11ActionPerformed

    private void T02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T02ActionPerformed
        int num = Integer.valueOf(T02.getText());
        if (!c1.IsPossible(0, 2, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T02.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T02.setEditable(false);
            T02.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T02ActionPerformed

    private void T01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T01ActionPerformed
        int num = Integer.valueOf(T01.getText());
        if (!c1.IsPossible(0, 1, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T01.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T01.setEditable(false);
            T01.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }

    }//GEN-LAST:event_T01ActionPerformed

    private void T00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T00ActionPerformed

        int num = Integer.valueOf(T00.getText());
        if (!c1.IsPossible(0, 0, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T00.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T00.setEditable(false);
            T00.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T00ActionPerformed

    private void T12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T12ActionPerformed
        int num = Integer.valueOf(T12.getText());
        if (!c1.IsPossible(1, 2, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T12.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T12.setEditable(false);
            T12.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T12ActionPerformed

    private void T13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T13ActionPerformed
        int num = Integer.valueOf(T13.getText());
        if (!c1.IsPossible(1, 3, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T13.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T13.setEditable(false);
            T13.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T13ActionPerformed

    private void T14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T14ActionPerformed
        int num = Integer.valueOf(T14.getText());
        if (!c1.IsPossible(1, 4, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T14.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T14.setEditable(false);
            T14.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T14ActionPerformed

    private void T05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T05ActionPerformed
        int num = Integer.valueOf(T05.getText());
        if (!c1.IsPossible(0, 5, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T05.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T05.setEditable(false);
            T05.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T05ActionPerformed

    private void T04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T04ActionPerformed
        int num = Integer.valueOf(T04.getText());
        if (!c1.IsPossible(0, 4, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T04.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T04.setEditable(false);
            T04.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T04ActionPerformed

    private void T03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T03ActionPerformed
        int num = Integer.valueOf(T03.getText());
        if (!c1.IsPossible(0, 3, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T03.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T03.setEditable(false);
            T03.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T03ActionPerformed

    private void T15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T15ActionPerformed
        int num = Integer.valueOf(T15.getText());
        if (!c1.IsPossible(1, 5, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T15.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T15.setEditable(false);
            T15.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T15ActionPerformed

    private void T16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T16ActionPerformed
        int num = Integer.valueOf(T16.getText());
        if (!c1.IsPossible(1, 6, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T16.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T16.setEditable(false);
            T16.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T16ActionPerformed

    private void T17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T17ActionPerformed
        int num = Integer.valueOf(T17.getText());
        if (!c1.IsPossible(1, 7, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T17.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T17.setEditable(false);
            T17.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T17ActionPerformed

    private void T08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T08ActionPerformed
        int num = Integer.valueOf(T08.getText());
        if (!c1.IsPossible(0, 8, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T08.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T08.setEditable(false);
            T08.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T08ActionPerformed

    private void T07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T07ActionPerformed
        int num = Integer.valueOf(T07.getText());
        if (!c1.IsPossible(0, 7, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T07.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T07.setEditable(false);
            T07.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T07ActionPerformed

    private void T06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T06ActionPerformed
        int num = Integer.valueOf(T06.getText());
        if (!c1.IsPossible(0, 6, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T06.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T06.setEditable(false);
            T06.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T06ActionPerformed

    private void T18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T18ActionPerformed
        int num = Integer.valueOf(T18.getText());
        if (!c1.IsPossible(1, 8, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T18.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T18.setEditable(false);
            T18.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T18ActionPerformed

    private void T46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T46ActionPerformed
        int num = Integer.valueOf(T46.getText());
        if (!c1.IsPossible(4, 6, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T46.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T46.setEditable(false);
            T46.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T46ActionPerformed

    private void T47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T47ActionPerformed
        int num = Integer.valueOf(T47.getText());
        if (!c1.IsPossible(4, 7, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T47.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T47.setEditable(false);
            T47.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }

    }//GEN-LAST:event_T47ActionPerformed

    private void T38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T38ActionPerformed
        int num = Integer.valueOf(T38.getText());
        if (!c1.IsPossible(3, 8, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T38.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T38.setEditable(false);
            T38.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T38ActionPerformed

    private void T37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T37ActionPerformed
        int num = Integer.valueOf(T37.getText());
        if (!c1.IsPossible(3, 7, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T37.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T37.setEditable(false);
            T37.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T37ActionPerformed

    private void T36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T36ActionPerformed
        int num = Integer.valueOf(T36.getText());
        if (!c1.IsPossible(3, 6, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T36.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T36.setEditable(false);
            T36.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T36ActionPerformed

    private void T48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T48ActionPerformed
        int num = Integer.valueOf(T48.getText());
        if (!c1.IsPossible(4, 8, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T48.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T48.setEditable(false);
            T48.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T48ActionPerformed

    private void T43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T43ActionPerformed
        int num = Integer.valueOf(T43.getText());
        if (!c1.IsPossible(4, 3, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T43.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T43.setEditable(false);
            T43.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T43ActionPerformed

    private void T44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T44ActionPerformed
        int num = Integer.valueOf(T44.getText());
        if (!c1.IsPossible(4, 4, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T44.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T44.setEditable(false);
            T44.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T44ActionPerformed

    private void T35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T35ActionPerformed
        int num = Integer.valueOf(T35.getText());
        if (!c1.IsPossible(3, 5, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T35.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T35.setEditable(false);
            T35.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T35ActionPerformed

    private void T34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T34ActionPerformed
        int num = Integer.valueOf(T34.getText());
        if (!c1.IsPossible(3, 4, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T34.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T34.setEditable(false);
            T34.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T34ActionPerformed

    private void T33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T33ActionPerformed
        int num = Integer.valueOf(T33.getText());
        if (!c1.IsPossible(3, 3, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T33.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T33.setEditable(false);
            T33.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T33ActionPerformed

    private void T45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T45ActionPerformed
        int num = Integer.valueOf(T45.getText());
        if (!c1.IsPossible(4, 5, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T45.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T45.setEditable(false);
            T45.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T45ActionPerformed

    private void T40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T40ActionPerformed
        int num = Integer.valueOf(T40.getText());
        if (!c1.IsPossible(4, 0, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T40.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T40.setEditable(false);
            T40.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }

    }//GEN-LAST:event_T40ActionPerformed

    private void T41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T41ActionPerformed
        int num = Integer.valueOf(T41.getText());
        if (!c1.IsPossible(4, 1, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T41.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T41.setEditable(false);
            T41.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T41ActionPerformed

    private void T32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T32ActionPerformed
        int num = Integer.valueOf(T32.getText());
        if (!c1.IsPossible(3, 2, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T32.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T32.setEditable(false);
            T32.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T32ActionPerformed

    private void T31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T31ActionPerformed
        int num = Integer.valueOf(T31.getText());
        if (!c1.IsPossible(3, 1, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T31.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T31.setEditable(false);
            T31.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T31ActionPerformed

    private void T30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T30ActionPerformed
        int num = Integer.valueOf(T30.getText());
        if (!c1.IsPossible(3, 0, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T30.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T30.setEditable(false);
            T30.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }

    }//GEN-LAST:event_T30ActionPerformed

    private void T42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T42ActionPerformed
        int num = Integer.valueOf(T42.getText());
        if (!c1.IsPossible(4, 2, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T42.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T42.setEditable(false);
            T42.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T42ActionPerformed

    private void jTextField100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField100ActionPerformed

    private void jTextField102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField102ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField102ActionPerformed

    private void jTextField104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField104ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField104ActionPerformed

    private void jTextField105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField105ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField105ActionPerformed

    private void jTextField106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField106ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField106ActionPerformed

    private void jTextField108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField108ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField108ActionPerformed

    private void jTextField109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField109ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField109ActionPerformed

    private void jTextField111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField111ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField111ActionPerformed

    private void jTextField113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField113ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField113ActionPerformed

    private void jTextField114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField114ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField114ActionPerformed

    private void jTextField115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField115ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField115ActionPerformed

    private void jTextField117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField117ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField117ActionPerformed

    private void jTextField118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField118ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField118ActionPerformed

    private void jTextField120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField120ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField120ActionPerformed

    private void jTextField122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField122ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField122ActionPerformed

    private void jTextField123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField123ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField123ActionPerformed

    private void jTextField124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField124ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField124ActionPerformed

    private void jTextField126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField126ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField126ActionPerformed

    private void T73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T73ActionPerformed
        int num = Integer.valueOf(T73.getText());
        if (!c1.IsPossible(7, 3, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T73.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T73.setEditable(false);
            T73.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T73ActionPerformed

    private void T74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T74ActionPerformed
        int num = Integer.valueOf(T74.getText());
        if (!c1.IsPossible(7, 4, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T74.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T74.setEditable(false);
            T74.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T74ActionPerformed

    private void T65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T65ActionPerformed
        int num = Integer.valueOf(T65.getText());
        if (!c1.IsPossible(6, 5, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T65.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T65.setEditable(false);
            T65.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T65ActionPerformed

    private void T64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T64ActionPerformed
        int num = Integer.valueOf(T64.getText());
        if (!c1.IsPossible(6, 4, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T64.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T64.setEditable(false);
            T64.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T64ActionPerformed

    private void T63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T63ActionPerformed
        int num = Integer.valueOf(T63.getText());
        if (!c1.IsPossible(6, 3, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T63.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T63.setEditable(false);
            T63.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T63ActionPerformed

    private void T75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T75ActionPerformed
        int num = Integer.valueOf(T75.getText());
        if (!c1.IsPossible(7, 5, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T75.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T75.setEditable(false);
            T75.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T75ActionPerformed

    private void T76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T76ActionPerformed
        int num = Integer.valueOf(T76.getText());
        if (!c1.IsPossible(7, 6, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T76.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T76.setEditable(false);
            T76.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T76ActionPerformed

    private void T77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T77ActionPerformed
        int num = Integer.valueOf(T77.getText());
        if (!c1.IsPossible(7, 7, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T77.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T77.setEditable(false);
            T77.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T77ActionPerformed

    private void T68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T68ActionPerformed
        int num = Integer.valueOf(T68.getText());
        if (!c1.IsPossible(6, 8, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T68.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T68.setEditable(false);
            T68.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T68ActionPerformed

    private void T67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T67ActionPerformed
        int num = Integer.valueOf(T67.getText());
        if (!c1.IsPossible(6, 7, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T67.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T67.setEditable(false);
            T67.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T67ActionPerformed

    private void T66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T66ActionPerformed
        int num = Integer.valueOf(T66.getText());
        if (!c1.IsPossible(6, 6, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T66.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T66.setEditable(false);
            T66.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T66ActionPerformed

    private void T78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T78ActionPerformed
        int num = Integer.valueOf(T78.getText());
        if (!c1.IsPossible(7, 8, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T78.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T78.setEditable(false);
            T78.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T78ActionPerformed

    private void T70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T70ActionPerformed
        int num = Integer.valueOf(T70.getText());
        if (!c1.IsPossible(7, 0, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T70.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T70.setEditable(false);
            T70.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T70ActionPerformed

    private void T71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T71ActionPerformed
        int num = Integer.valueOf(T71.getText());
        if (!c1.IsPossible(7, 1, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T71.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T71.setEditable(false);
            T71.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T71ActionPerformed

    private void T62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T62ActionPerformed
        int num = Integer.valueOf(T62.getText());
        if (!c1.IsPossible(6, 2, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T62.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T62.setEditable(false);
            T62.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T62ActionPerformed

    private void T61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T61ActionPerformed
        int num = Integer.valueOf(T61.getText());
        if (!c1.IsPossible(6, 1, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T61.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T61.setEditable(false);
            T61.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T61ActionPerformed

    private void T60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T60ActionPerformed
        int num = Integer.valueOf(T60.getText());
        if (!c1.IsPossible(6, 0, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T60.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T60.setEditable(false);
            T60.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T60ActionPerformed

    private void T72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T72ActionPerformed
        int num = Integer.valueOf(T72.getText());
        if (!c1.IsPossible(7, 2, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T72.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T72.setEditable(false);
            T72.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T72ActionPerformed

    private void GeneratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneratorActionPerformed
        Counter.setText(String.valueOf(3));
        Grid g1 = new Grid();
        g1.Filler();
        emptyCells = g1.PuzzleMaker(getDiff());
        CounterCorrect = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                finalPuzzle[i][j] = g1.getGrid()[i][j];
            }
        }
        T00.setText(String.valueOf(g1.getGrid()[0][0]));
        T01.setText(String.valueOf(g1.getGrid()[0][1]));
        T02.setText(String.valueOf(g1.getGrid()[0][2]));
        T03.setText(String.valueOf(g1.getGrid()[0][3]));
        T04.setText(String.valueOf(g1.getGrid()[0][4]));
        T05.setText(String.valueOf(g1.getGrid()[0][5]));
        T06.setText(String.valueOf(g1.getGrid()[0][6]));
        T07.setText(String.valueOf(g1.getGrid()[0][7]));
        T08.setText(String.valueOf(g1.getGrid()[0][8]));
        T10.setText(String.valueOf(g1.getGrid()[1][0]));
        T11.setText(String.valueOf(g1.getGrid()[1][1]));
        T12.setText(String.valueOf(g1.getGrid()[1][2]));
        T13.setText(String.valueOf(g1.getGrid()[1][3]));
        T14.setText(String.valueOf(g1.getGrid()[1][4]));
        T15.setText(String.valueOf(g1.getGrid()[1][5]));
        T16.setText(String.valueOf(g1.getGrid()[1][6]));
        T17.setText(String.valueOf(g1.getGrid()[1][7]));
        T18.setText(String.valueOf(g1.getGrid()[1][8]));
        T20.setText(String.valueOf(g1.getGrid()[2][0]));
        T21.setText(String.valueOf(g1.getGrid()[2][1]));
        T22.setText(String.valueOf(g1.getGrid()[2][2]));
        T23.setText(String.valueOf(g1.getGrid()[2][3]));
        T24.setText(String.valueOf(g1.getGrid()[2][4]));
        T25.setText(String.valueOf(g1.getGrid()[2][5]));
        T26.setText(String.valueOf(g1.getGrid()[2][6]));
        T27.setText(String.valueOf(g1.getGrid()[2][7]));
        T28.setText(String.valueOf(g1.getGrid()[2][8]));
        T30.setText(String.valueOf(g1.getGrid()[3][0]));
        T31.setText(String.valueOf(g1.getGrid()[3][1]));
        T32.setText(String.valueOf(g1.getGrid()[3][2]));
        T33.setText(String.valueOf(g1.getGrid()[3][3]));
        T34.setText(String.valueOf(g1.getGrid()[3][4]));
        T35.setText(String.valueOf(g1.getGrid()[3][5]));
        T36.setText(String.valueOf(g1.getGrid()[3][6]));
        T37.setText(String.valueOf(g1.getGrid()[3][7]));
        T38.setText(String.valueOf(g1.getGrid()[3][8]));
        T40.setText(String.valueOf(g1.getGrid()[4][0]));
        T41.setText(String.valueOf(g1.getGrid()[4][1]));
        T42.setText(String.valueOf(g1.getGrid()[4][2]));
        T43.setText(String.valueOf(g1.getGrid()[4][3]));
        T44.setText(String.valueOf(g1.getGrid()[4][4]));
        T45.setText(String.valueOf(g1.getGrid()[4][5]));
        T46.setText(String.valueOf(g1.getGrid()[4][6]));
        T47.setText(String.valueOf(g1.getGrid()[4][7]));
        T48.setText(String.valueOf(g1.getGrid()[4][8]));
        T50.setText(String.valueOf(g1.getGrid()[5][0]));
        T51.setText(String.valueOf(g1.getGrid()[5][1]));
        T52.setText(String.valueOf(g1.getGrid()[5][2]));
        T53.setText(String.valueOf(g1.getGrid()[5][3]));
        T54.setText(String.valueOf(g1.getGrid()[5][4]));
        T55.setText(String.valueOf(g1.getGrid()[5][5]));
        T56.setText(String.valueOf(g1.getGrid()[5][6]));
        T57.setText(String.valueOf(g1.getGrid()[5][7]));
        T58.setText(String.valueOf(g1.getGrid()[5][8]));
        T60.setText(String.valueOf(g1.getGrid()[6][0]));
        T61.setText(String.valueOf(g1.getGrid()[6][1]));
        T62.setText(String.valueOf(g1.getGrid()[6][2]));
        T63.setText(String.valueOf(g1.getGrid()[6][3]));
        T64.setText(String.valueOf(g1.getGrid()[6][4]));
        T65.setText(String.valueOf(g1.getGrid()[6][5]));
        T66.setText(String.valueOf(g1.getGrid()[6][6]));
        T67.setText(String.valueOf(g1.getGrid()[6][7]));
        T68.setText(String.valueOf(g1.getGrid()[6][8]));
        T70.setText(String.valueOf(g1.getGrid()[7][0]));
        T71.setText(String.valueOf(g1.getGrid()[7][1]));
        T72.setText(String.valueOf(g1.getGrid()[7][2]));
        T73.setText(String.valueOf(g1.getGrid()[7][3]));
        T74.setText(String.valueOf(g1.getGrid()[7][4]));
        T75.setText(String.valueOf(g1.getGrid()[7][5]));
        T76.setText(String.valueOf(g1.getGrid()[7][6]));
        T77.setText(String.valueOf(g1.getGrid()[7][7]));
        T78.setText(String.valueOf(g1.getGrid()[7][8]));
        T80.setText(String.valueOf(g1.getGrid()[8][0]));
        T81.setText(String.valueOf(g1.getGrid()[8][1]));
        T82.setText(String.valueOf(g1.getGrid()[8][2]));
        T83.setText(String.valueOf(g1.getGrid()[8][3]));
        T84.setText(String.valueOf(g1.getGrid()[8][4]));
        T85.setText(String.valueOf(g1.getGrid()[8][5]));
        T86.setText(String.valueOf(g1.getGrid()[8][6]));
        T87.setText(String.valueOf(g1.getGrid()[8][7]));
        T88.setText(String.valueOf(g1.getGrid()[8][8]));

        if (Integer.valueOf(T00.getText()) == 0) {
            T00.setText("");
            T00.setForeground(Color.BLACK);
            T00.setEditable(true);
        } else {
            T00.setForeground(Color.BLACK);
            T00.setEditable(false);
        }
        if (Integer.valueOf(T01.getText()) == 0) {
            T01.setText("");
            T01.setForeground(Color.BLACK);
            T01.setEditable(true);
        } else {
            T01.setForeground(Color.BLACK);
            T01.setEditable(false);
        }
        if (Integer.valueOf(T02.getText()) == 0) {
            T02.setText("");
            T02.setForeground(Color.BLACK);
            T02.setEditable(true);
        } else {
            T02.setForeground(Color.BLACK);
            T02.setEditable(false);
        }
        if (Integer.valueOf(T03.getText()) == 0) {
            T03.setText("");
            T03.setForeground(Color.BLACK);
            T03.setEditable(true);
        } else {
            T03.setForeground(Color.BLACK);
            T03.setEditable(false);
        }
        if (Integer.valueOf(T04.getText()) == 0) {
            T04.setText("");
            T04.setForeground(Color.BLACK);
            T04.setEditable(true);
        } else {
            T04.setForeground(Color.BLACK);
            T04.setEditable(false);
        }
        if (Integer.valueOf(T05.getText()) == 0) {
            T05.setText("");
            T05.setForeground(Color.BLACK);
            T05.setEditable(true);
        } else {
            T05.setForeground(Color.BLACK);
            T05.setEditable(false);
        }
        if (Integer.valueOf(T06.getText()) == 0) {
            T06.setText("");
            T06.setForeground(Color.BLACK);
            T06.setEditable(true);
        } else {
            T06.setForeground(Color.BLACK);
            T06.setEditable(false);
        }
        if (Integer.valueOf(T07.getText()) == 0) {
            T07.setText("");
            T07.setForeground(Color.BLACK);
            T07.setEditable(true);
        } else {
            T07.setForeground(Color.BLACK);
            T07.setEditable(false);
        }
        if (Integer.valueOf(T08.getText()) == 0) {
            T08.setText("");
            T08.setForeground(Color.BLACK);
            T08.setEditable(true);
        } else {
            T08.setForeground(Color.BLACK);
            T08.setEditable(false);
        }
        if (Integer.valueOf(T10.getText()) == 0) {
            T10.setText("");
            T10.setForeground(Color.BLACK);
            T10.setEditable(true);
        } else {
            T10.setForeground(Color.BLACK);
            T10.setEditable(false);
        }
        if (Integer.valueOf(T11.getText()) == 0) {
            T11.setText("");
            T11.setForeground(Color.BLACK);
            T11.setEditable(true);
        } else {
            T11.setForeground(Color.BLACK);
            T11.setEditable(false);
        }
        if (Integer.valueOf(T12.getText()) == 0) {
            T12.setText("");
            T12.setForeground(Color.BLACK);
            T12.setEditable(true);
        } else {
            T12.setForeground(Color.BLACK);
            T12.setEditable(false);
        }
        if (Integer.valueOf(T13.getText()) == 0) {
            T13.setText("");
            T13.setForeground(Color.BLACK);
            T13.setEditable(true);
        } else {
            T13.setForeground(Color.BLACK);
            T13.setEditable(false);
        }
        if (Integer.valueOf(T14.getText()) == 0) {
            T14.setText("");
            T14.setForeground(Color.BLACK);
            T14.setEditable(true);
        } else {
            T14.setForeground(Color.BLACK);
            T14.setEditable(false);
        }
        if (Integer.valueOf(T15.getText()) == 0) {
            T15.setText("");
            T15.setForeground(Color.BLACK);
            T15.setEditable(true);
        } else {
            T15.setForeground(Color.BLACK);
            T15.setEditable(false);
        }
        if (Integer.valueOf(T16.getText()) == 0) {
            T16.setText("");
            T16.setForeground(Color.BLACK);
            T16.setEditable(true);
        } else {
            T16.setForeground(Color.BLACK);
            T16.setEditable(false);
        }
        if (Integer.valueOf(T17.getText()) == 0) {
            T17.setText("");
            T17.setForeground(Color.BLACK);
            T17.setEditable(true);
        } else {
            T17.setForeground(Color.BLACK);
            T17.setEditable(false);
        }
        if (Integer.valueOf(T18.getText()) == 0) {
            T18.setText("");
            T18.setForeground(Color.BLACK);
            T18.setEditable(true);
        } else {
            T18.setForeground(Color.BLACK);
            T18.setEditable(false);
        }
        if (Integer.valueOf(T20.getText()) == 0) {
            T20.setText("");
            T20.setForeground(Color.BLACK);
            T20.setEditable(true);
        } else {
            T20.setForeground(Color.BLACK);
            T20.setEditable(false);
        }
        if (Integer.valueOf(T21.getText()) == 0) {
            T21.setText("");
            T21.setForeground(Color.BLACK);
            T21.setEditable(true);
        } else {
            T21.setForeground(Color.BLACK);
            T21.setEditable(false);
        }
        if (Integer.valueOf(T22.getText()) == 0) {
            T22.setText("");
            T22.setForeground(Color.BLACK);
            T22.setEditable(true);
        } else {
            T22.setForeground(Color.BLACK);
            T22.setEditable(false);
        }
        if (Integer.valueOf(T23.getText()) == 0) {
            T23.setText("");
            T23.setForeground(Color.BLACK);
            T23.setEditable(true);
        } else {
            T23.setForeground(Color.BLACK);
            T23.setEditable(false);
        }
        if (Integer.valueOf(T24.getText()) == 0) {
            T24.setText("");
            T24.setForeground(Color.BLACK);
            T24.setEditable(true);
        } else {
            T24.setForeground(Color.BLACK);
            T24.setEditable(false);
        }
        if (Integer.valueOf(T25.getText()) == 0) {
            T25.setText("");
            T25.setForeground(Color.BLACK);
            T25.setEditable(true);
        } else {
            T25.setForeground(Color.BLACK);
            T25.setEditable(false);
        }
        if (Integer.valueOf(T26.getText()) == 0) {
            T26.setText("");
            T26.setForeground(Color.BLACK);
            T26.setEditable(true);
        } else {
            T26.setForeground(Color.BLACK);
            T26.setEditable(false);
        }
        if (Integer.valueOf(T27.getText()) == 0) {
            T27.setText("");
            T27.setForeground(Color.BLACK);
            T27.setEditable(true);
        } else {
            T27.setForeground(Color.BLACK);
            T27.setEditable(false);
        }
        if (Integer.valueOf(T28.getText()) == 0) {
            T28.setText("");
            T28.setForeground(Color.BLACK);
            T28.setEditable(true);
        } else {
            T28.setForeground(Color.BLACK);
            T28.setEditable(false);
        }
        if (Integer.valueOf(T30.getText()) == 0) {
            T30.setText("");
            T30.setForeground(Color.BLACK);
            T30.setEditable(true);
        } else {
            T30.setForeground(Color.BLACK);
            T30.setEditable(false);
        }
        if (Integer.valueOf(T31.getText()) == 0) {
            T31.setText("");
            T31.setForeground(Color.BLACK);
            T31.setEditable(true);
        } else {
            T31.setForeground(Color.BLACK);
            T31.setEditable(false);
        }
        if (Integer.valueOf(T32.getText()) == 0) {
            T32.setText("");
            T32.setForeground(Color.BLACK);
            T32.setEditable(true);
        } else {
            T32.setForeground(Color.BLACK);
            T32.setEditable(false);
        }
        if (Integer.valueOf(T33.getText()) == 0) {
            T33.setText("");
            T33.setForeground(Color.BLACK);
            T33.setEditable(true);
        } else {
            T33.setForeground(Color.BLACK);
            T33.setEditable(false);
        }
        if (Integer.valueOf(T34.getText()) == 0) {
            T34.setText("");
            T34.setForeground(Color.BLACK);
            T34.setEditable(true);
        } else {
            T34.setForeground(Color.BLACK);
            T34.setEditable(false);
        }
        if (Integer.valueOf(T35.getText()) == 0) {
            T35.setText("");
            T35.setForeground(Color.BLACK);
            T35.setEditable(true);
        } else {
            T35.setForeground(Color.BLACK);
            T35.setEditable(false);
        }
        if (Integer.valueOf(T36.getText()) == 0) {
            T36.setText("");
            T36.setForeground(Color.BLACK);
            T36.setEditable(true);
        } else {
            T36.setForeground(Color.BLACK);
            T36.setEditable(false);
        }
        if (Integer.valueOf(T37.getText()) == 0) {
            T37.setText("");
            T37.setForeground(Color.BLACK);
            T37.setEditable(true);
        } else {
            T37.setForeground(Color.BLACK);
            T37.setEditable(false);
        }
        if (Integer.valueOf(T38.getText()) == 0) {
            T38.setText("");
            T38.setForeground(Color.BLACK);
            T38.setEditable(true);
        } else {
            T38.setForeground(Color.BLACK);
            T38.setEditable(false);
        }
        if (Integer.valueOf(T40.getText()) == 0) {
            T40.setText("");
            T40.setForeground(Color.BLACK);
            T40.setEditable(true);
        } else {
            T40.setForeground(Color.BLACK);
            T40.setEditable(false);
        }
        if (Integer.valueOf(T41.getText()) == 0) {
            T41.setText("");
            T41.setForeground(Color.BLACK);
            T41.setEditable(true);
        } else {
            T41.setForeground(Color.BLACK);
            T41.setEditable(false);
        }
        if (Integer.valueOf(T42.getText()) == 0) {
            T42.setText("");
            T42.setForeground(Color.BLACK);
            T42.setEditable(true);
        } else {
            T42.setForeground(Color.BLACK);
            T42.setEditable(false);
        }
        if (Integer.valueOf(T43.getText()) == 0) {
            T43.setText("");
            T43.setForeground(Color.BLACK);
            T43.setEditable(true);
        } else {
            T43.setForeground(Color.BLACK);
            T43.setEditable(false);
        }
        if (Integer.valueOf(T44.getText()) == 0) {
            T44.setText("");
            T44.setForeground(Color.BLACK);
            T44.setEditable(true);
        } else {
            T44.setForeground(Color.BLACK);
            T44.setEditable(false);
        }
        if (Integer.valueOf(T45.getText()) == 0) {
            T45.setText("");
            T45.setForeground(Color.BLACK);
            T45.setEditable(true);
        } else {
            T45.setForeground(Color.BLACK);
            T45.setEditable(false);
        }
        if (Integer.valueOf(T46.getText()) == 0) {
            T46.setText("");
            T46.setForeground(Color.BLACK);
            T46.setEditable(true);
        } else {
            T46.setForeground(Color.BLACK);
            T46.setEditable(false);
        }
        if (Integer.valueOf(T47.getText()) == 0) {
            T47.setText("");
            T47.setForeground(Color.BLACK);
            T47.setEditable(true);
        } else {
            T47.setForeground(Color.BLACK);
            T47.setEditable(false);
        }
        if (Integer.valueOf(T48.getText()) == 0) {
            T48.setText("");
            T48.setForeground(Color.BLACK);
            T48.setEditable(true);
        } else {
            T48.setForeground(Color.BLACK);
            T48.setEditable(false);
        }
        if (Integer.valueOf(T50.getText()) == 0) {
            T50.setText("");
            T50.setForeground(Color.BLACK);
            T50.setEditable(true);
        } else {
            T50.setForeground(Color.BLACK);
            T50.setEditable(false);
        }
        if (Integer.valueOf(T51.getText()) == 0) {
            T51.setText("");
            T51.setForeground(Color.BLACK);
            T51.setEditable(true);
        } else {
            T51.setForeground(Color.BLACK);
            T51.setEditable(false);
        }
        if (Integer.valueOf(T52.getText()) == 0) {
            T52.setText("");
            T52.setForeground(Color.BLACK);
            T52.setEditable(true);
        } else {
            T52.setForeground(Color.BLACK);
            T52.setEditable(false);
        }
        if (Integer.valueOf(T53.getText()) == 0) {
            T53.setText("");
            T53.setForeground(Color.BLACK);
            T53.setEditable(true);
        } else {
            T53.setForeground(Color.BLACK);
            T53.setEditable(false);
        }
        if (Integer.valueOf(T54.getText()) == 0) {
            T54.setText("");
            T54.setForeground(Color.BLACK);
            T54.setEditable(true);
        } else {
            T54.setForeground(Color.BLACK);
            T54.setEditable(false);
        }
        if (Integer.valueOf(T55.getText()) == 0) {
            T55.setText("");
            T55.setForeground(Color.BLACK);
            T55.setEditable(true);
        } else {
            T55.setForeground(Color.BLACK);
            T55.setEditable(false);
        }
        if (Integer.valueOf(T56.getText()) == 0) {
            T56.setText("");
            T56.setForeground(Color.BLACK);
            T56.setEditable(true);
        } else {
            T56.setForeground(Color.BLACK);
            T56.setEditable(false);
        }
        if (Integer.valueOf(T57.getText()) == 0) {
            T57.setText("");
            T57.setForeground(Color.BLACK);
            T57.setEditable(true);
        } else {
            T57.setForeground(Color.BLACK);
            T57.setEditable(false);
        }
        if (Integer.valueOf(T58.getText()) == 0) {
            T58.setText("");
            T58.setForeground(Color.BLACK);
            T58.setEditable(true);
        } else {
            T58.setForeground(Color.BLACK);
            T58.setEditable(false);
        }
        if (Integer.valueOf(T60.getText()) == 0) {
            T60.setText("");
            T60.setForeground(Color.BLACK);
            T60.setEditable(true);
        } else {
            T60.setForeground(Color.BLACK);
            T60.setEditable(false);
        }
        if (Integer.valueOf(T61.getText()) == 0) {
            T61.setText("");
            T61.setForeground(Color.BLACK);
            T61.setEditable(true);
        } else {
            T61.setForeground(Color.BLACK);
            T61.setEditable(false);
        }
        if (Integer.valueOf(T62.getText()) == 0) {
            T62.setText("");
            T62.setForeground(Color.BLACK);
            T62.setEditable(true);
        } else {
            T62.setForeground(Color.BLACK);
            T62.setEditable(false);
        }
        if (Integer.valueOf(T63.getText()) == 0) {
            T63.setText("");
            T63.setForeground(Color.BLACK);
            T63.setEditable(true);
        } else {
            T63.setForeground(Color.BLACK);
            T63.setEditable(false);
        }
        if (Integer.valueOf(T64.getText()) == 0) {
            T64.setText("");
            T64.setForeground(Color.BLACK);
            T64.setEditable(true);
        } else {
            T64.setForeground(Color.BLACK);
            T64.setEditable(false);
        }
        if (Integer.valueOf(T65.getText()) == 0) {
            T65.setText("");
            T65.setForeground(Color.BLACK);
            T65.setEditable(true);
        } else {
            T65.setForeground(Color.BLACK);
            T65.setEditable(false);
        }
        if (Integer.valueOf(T66.getText()) == 0) {
            T66.setText("");
            T66.setForeground(Color.BLACK);
            T66.setEditable(true);
        } else {
            T66.setForeground(Color.BLACK);
            T66.setEditable(false);
        }
        if (Integer.valueOf(T67.getText()) == 0) {
            T67.setText("");
            T67.setForeground(Color.BLACK);
            T67.setEditable(true);
        } else {
            T67.setForeground(Color.BLACK);
            T67.setEditable(false);
        }
        if (Integer.valueOf(T68.getText()) == 0) {
            T68.setText("");
            T68.setForeground(Color.BLACK);
            T68.setEditable(true);
        } else {
            T68.setForeground(Color.BLACK);
            T68.setEditable(false);
        }
        if (Integer.valueOf(T70.getText()) == 0) {
            T70.setText("");
            T70.setForeground(Color.BLACK);
            T70.setEditable(true);
        } else {
            T70.setForeground(Color.BLACK);
            T70.setEditable(false);
        }
        if (Integer.valueOf(T71.getText()) == 0) {
            T71.setText("");
            T71.setForeground(Color.BLACK);
            T71.setEditable(true);
        } else {
            T71.setForeground(Color.BLACK);
            T71.setEditable(false);
        }
        if (Integer.valueOf(T72.getText()) == 0) {
            T72.setText("");
            T72.setForeground(Color.BLACK);
            T72.setEditable(true);
        } else {
            T72.setForeground(Color.BLACK);
            T72.setEditable(false);
        }
        if (Integer.valueOf(T73.getText()) == 0) {
            T73.setText("");
            T73.setForeground(Color.BLACK);
            T73.setEditable(true);
        } else {
            T73.setForeground(Color.BLACK);
            T73.setEditable(false);
        }
        if (Integer.valueOf(T74.getText()) == 0) {
            T74.setText("");
            T74.setForeground(Color.BLACK);
            T74.setEditable(true);
        } else {
            T74.setForeground(Color.BLACK);
            T74.setEditable(false);
        }
        if (Integer.valueOf(T75.getText()) == 0) {
            T75.setText("");
            T75.setForeground(Color.BLACK);
            T75.setEditable(true);
        } else {
            T75.setForeground(Color.BLACK);
            T75.setEditable(false);
        }
        if (Integer.valueOf(T76.getText()) == 0) {
            T76.setText("");
            T76.setForeground(Color.BLACK);
            T76.setEditable(true);
        } else {
            T76.setForeground(Color.BLACK);
            T76.setEditable(false);
        }
        if (Integer.valueOf(T77.getText()) == 0) {
            T77.setText("");
            T77.setForeground(Color.BLACK);
            T77.setEditable(true);
        } else {
            T77.setForeground(Color.BLACK);
            T77.setEditable(false);
        }
        if (Integer.valueOf(T78.getText()) == 0) {
            T78.setText("");
            T78.setForeground(Color.BLACK);
            T78.setEditable(true);
        } else {
            T78.setForeground(Color.BLACK);
            T78.setEditable(false);
        }
        if (Integer.valueOf(T80.getText()) == 0) {
            T80.setText("");
            T80.setForeground(Color.BLACK);
            T80.setEditable(true);
        } else {
            T80.setForeground(Color.BLACK);
            T80.setEditable(false);
        }
        if (Integer.valueOf(T81.getText()) == 0) {
            T81.setText("");
            T81.setForeground(Color.BLACK);
            T81.setEditable(true);
        } else {
            T81.setForeground(Color.BLACK);
            T81.setEditable(false);
        }
        if (Integer.valueOf(T82.getText()) == 0) {
            T82.setText("");
            T82.setForeground(Color.BLACK);
            T82.setEditable(true);
        } else {
            T82.setForeground(Color.BLACK);
            T82.setEditable(false);
        }
        if (Integer.valueOf(T83.getText()) == 0) {
            T83.setText("");
            T83.setForeground(Color.BLACK);
            T83.setEditable(true);
        } else {
            T83.setForeground(Color.BLACK);
            T83.setEditable(false);
        }
        if (Integer.valueOf(T84.getText()) == 0) {
            T84.setText("");
            T84.setForeground(Color.BLACK);
            T84.setEditable(true);
        } else {
            T84.setForeground(Color.BLACK);
            T84.setEditable(false);
        }
        if (Integer.valueOf(T85.getText()) == 0) {
            T85.setText("");
            T85.setForeground(Color.BLACK);
            T85.setEditable(true);
        } else {
            T85.setForeground(Color.BLACK);
            T85.setEditable(false);
        }
        if (Integer.valueOf(T86.getText()) == 0) {
            T86.setText("");
            T86.setForeground(Color.BLACK);
            T86.setEditable(true);
        } else {
            T86.setForeground(Color.BLACK);
            T86.setEditable(false);
        }
        if (Integer.valueOf(T87.getText()) == 0) {
            T87.setText("");
            T87.setForeground(Color.BLACK);
            T87.setEditable(true);
        } else {
            T87.setForeground(Color.BLACK);
            T87.setEditable(false);
        }
        if (Integer.valueOf(T88.getText()) == 0) {
            T88.setText("");
            T88.setForeground(Color.BLACK);
            T88.setEditable(true);
        } else {
            T88.setForeground(Color.BLACK);
            T88.setEditable(false);
        }


    }//GEN-LAST:event_GeneratorActionPerformed

    private void CounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CounterActionPerformed


    }//GEN-LAST:event_CounterActionPerformed

    private void T20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T20ActionPerformed
        int num = Integer.valueOf(T20.getText());
        if (!c1.IsPossible(2, 0, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T20.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T20.setEditable(false);
            T20.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T20ActionPerformed

    private void T21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T21ActionPerformed
        int num = Integer.valueOf(T21.getText());
        if (!c1.IsPossible(2, 1, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T21.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T21.setEditable(false);
            T21.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T21ActionPerformed

    private void T22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T22ActionPerformed
        int num = Integer.valueOf(T22.getText());
        if (!c1.IsPossible(2, 2, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T22.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T22.setEditable(false);
            T22.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T22ActionPerformed

    private void T23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T23ActionPerformed
        int num = Integer.valueOf(T23.getText());
        if (!c1.IsPossible(2, 3, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T23.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T23.setEditable(false);
            T23.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T23ActionPerformed

    private void T24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T24ActionPerformed
        int num = Integer.valueOf(T24.getText());
        if (!c1.IsPossible(2, 4, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T24.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T24.setEditable(false);
            T24.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T24ActionPerformed

    private void T25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T25ActionPerformed
        int num = Integer.valueOf(T25.getText());
        if (!c1.IsPossible(2, 5, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T25.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T25.setEditable(false);
            T25.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T25ActionPerformed

    private void T26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T26ActionPerformed
        int num = Integer.valueOf(T26.getText());
        if (!c1.IsPossible(2, 6, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T26.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T26.setEditable(false);
            T26.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }

    }//GEN-LAST:event_T26ActionPerformed

    private void T27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T27ActionPerformed
        int num = Integer.valueOf(T27.getText());
        if (!c1.IsPossible(2, 7, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T27.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T27.setEditable(false);
            T27.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T27ActionPerformed

    private void T28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T28ActionPerformed
        int num = Integer.valueOf(T28.getText());
        if (!c1.IsPossible(2, 8, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T28.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T28.setEditable(false);
            T28.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }

    }//GEN-LAST:event_T28ActionPerformed

    private void T50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T50ActionPerformed
        int num = Integer.valueOf(T50.getText());
        if (!c1.IsPossible(5, 0, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T50.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T50.setEditable(false);
            T50.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T50ActionPerformed

    private void T51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T51ActionPerformed
        int num = Integer.valueOf(T51.getText());
        if (!c1.IsPossible(5, 1, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T51.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T51.setEditable(false);
            T51.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T51ActionPerformed

    private void T52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T52ActionPerformed
        int num = Integer.valueOf(T52.getText());
        if (!c1.IsPossible(5, 2, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T52.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T52.setEditable(false);
            T52.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T52ActionPerformed

    private void T53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T53ActionPerformed
        int num = Integer.valueOf(T53.getText());
        if (!c1.IsPossible(5, 3, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T53.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T53.setEditable(false);
            T53.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T53ActionPerformed

    private void T54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T54ActionPerformed
        int num = Integer.valueOf(T54.getText());
        if (!c1.IsPossible(5, 4, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T54.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T54.setEditable(false);
            T54.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T54ActionPerformed

    private void T55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T55ActionPerformed
        int num = Integer.valueOf(T55.getText());
        if (!c1.IsPossible(5, 5, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T55.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T55.setEditable(false);
            T55.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T55ActionPerformed

    private void T56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T56ActionPerformed
        int num = Integer.valueOf(T56.getText());
        if (!c1.IsPossible(5, 6, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T56.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T56.setEditable(false);
            T56.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T56ActionPerformed

    private void T57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T57ActionPerformed
        int num = Integer.valueOf(T57.getText());
        if (!c1.IsPossible(5, 7, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T57.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T57.setEditable(false);
            T57.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T57ActionPerformed

    private void T58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T58ActionPerformed
        int num = Integer.valueOf(T58.getText());
        if (!c1.IsPossible(5, 8, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T58.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T58.setEditable(false);
            T58.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T58ActionPerformed

    private void T80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T80ActionPerformed
        int num = Integer.valueOf(T80.getText());
        if (!c1.IsPossible(8, 0, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T80.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T80.setEditable(false);
            T80.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T80ActionPerformed

    private void T81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T81ActionPerformed
        int num = Integer.valueOf(T81.getText());
        if (!c1.IsPossible(8, 1, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T81.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T81.setEditable(false);
            T81.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T81ActionPerformed

    private void T82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T82ActionPerformed
        int num = Integer.valueOf(T82.getText());
        if (!c1.IsPossible(8, 2, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T82.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T82.setEditable(false);
            T82.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T82ActionPerformed

    private void T83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T83ActionPerformed
        int num = Integer.valueOf(T83.getText());
        if (!c1.IsPossible(8, 3, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T83.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T83.setEditable(false);
            T83.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T83ActionPerformed

    private void T84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T84ActionPerformed
        int num = Integer.valueOf(T84.getText());
        if (!c1.IsPossible(8, 4, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T84.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T84.setEditable(false);
            T84.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T84ActionPerformed

    private void T85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T85ActionPerformed
        int num = Integer.valueOf(T85.getText());
        if (!c1.IsPossible(8, 5, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T85.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T85.setEditable(false);
            T85.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T85ActionPerformed

    private void T86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T86ActionPerformed
        int num = Integer.valueOf(T86.getText());
        if (!c1.IsPossible(8, 6, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T86.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T86.setEditable(false);
            T86.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T86ActionPerformed

    private void T87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T87ActionPerformed
        int num = Integer.valueOf(T87.getText());
        if (!c1.IsPossible(8, 7, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T87.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T87.setEditable(false);
            T87.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T87ActionPerformed

    private void T88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T88ActionPerformed
        int num = Integer.valueOf(T88.getText());
        if (!c1.IsPossible(8, 8, num, finalPuzzle)) {
            Counter.setText(String.valueOf(Integer.valueOf(Counter.getText()) - 1));
            T88.setForeground(Color.RED);
        } else {
            CounterCorrect++;
            T88.setEditable(false);
            T88.setForeground(Color.BLUE);
        }
        if (Integer.valueOf(Counter.getText()) == 0) {
            JOptionPane.showMessageDialog(this, " YOU LOST", "Error", JOptionPane.ERROR_MESSAGE);
            GeneratorActionPerformed(evt);
        }
        if (CounterCorrect == emptyCells) {
            JOptionPane.showMessageDialog(this, " YOU WON", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            GeneratorActionPerformed(evt);
        }
    }//GEN-LAST:event_T88ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Solver g1 = new Solver(finalPuzzle);
        g1.solve();
        T00.setText(String.valueOf(g1.getGrid()[0][0]));
        T01.setText(String.valueOf(g1.getGrid()[0][1]));
        T02.setText(String.valueOf(g1.getGrid()[0][2]));
        T03.setText(String.valueOf(g1.getGrid()[0][3]));
        T04.setText(String.valueOf(g1.getGrid()[0][4]));
        T05.setText(String.valueOf(g1.getGrid()[0][5]));
        T06.setText(String.valueOf(g1.getGrid()[0][6]));
        T07.setText(String.valueOf(g1.getGrid()[0][7]));
        T08.setText(String.valueOf(g1.getGrid()[0][8]));
        T10.setText(String.valueOf(g1.getGrid()[1][0]));
        T11.setText(String.valueOf(g1.getGrid()[1][1]));
        T12.setText(String.valueOf(g1.getGrid()[1][2]));
        T13.setText(String.valueOf(g1.getGrid()[1][3]));
        T14.setText(String.valueOf(g1.getGrid()[1][4]));
        T15.setText(String.valueOf(g1.getGrid()[1][5]));
        T16.setText(String.valueOf(g1.getGrid()[1][6]));
        T17.setText(String.valueOf(g1.getGrid()[1][7]));
        T18.setText(String.valueOf(g1.getGrid()[1][8]));
        T20.setText(String.valueOf(g1.getGrid()[2][0]));
        T21.setText(String.valueOf(g1.getGrid()[2][1]));
        T22.setText(String.valueOf(g1.getGrid()[2][2]));
        T23.setText(String.valueOf(g1.getGrid()[2][3]));
        T24.setText(String.valueOf(g1.getGrid()[2][4]));
        T25.setText(String.valueOf(g1.getGrid()[2][5]));
        T26.setText(String.valueOf(g1.getGrid()[2][6]));
        T27.setText(String.valueOf(g1.getGrid()[2][7]));
        T28.setText(String.valueOf(g1.getGrid()[2][8]));
        T30.setText(String.valueOf(g1.getGrid()[3][0]));
        T31.setText(String.valueOf(g1.getGrid()[3][1]));
        T32.setText(String.valueOf(g1.getGrid()[3][2]));
        T33.setText(String.valueOf(g1.getGrid()[3][3]));
        T34.setText(String.valueOf(g1.getGrid()[3][4]));
        T35.setText(String.valueOf(g1.getGrid()[3][5]));
        T36.setText(String.valueOf(g1.getGrid()[3][6]));
        T37.setText(String.valueOf(g1.getGrid()[3][7]));
        T38.setText(String.valueOf(g1.getGrid()[3][8]));
        T40.setText(String.valueOf(g1.getGrid()[4][0]));
        T41.setText(String.valueOf(g1.getGrid()[4][1]));
        T42.setText(String.valueOf(g1.getGrid()[4][2]));
        T43.setText(String.valueOf(g1.getGrid()[4][3]));
        T44.setText(String.valueOf(g1.getGrid()[4][4]));
        T45.setText(String.valueOf(g1.getGrid()[4][5]));
        T46.setText(String.valueOf(g1.getGrid()[4][6]));
        T47.setText(String.valueOf(g1.getGrid()[4][7]));
        T48.setText(String.valueOf(g1.getGrid()[4][8]));
        T50.setText(String.valueOf(g1.getGrid()[5][0]));
        T51.setText(String.valueOf(g1.getGrid()[5][1]));
        T52.setText(String.valueOf(g1.getGrid()[5][2]));
        T53.setText(String.valueOf(g1.getGrid()[5][3]));
        T54.setText(String.valueOf(g1.getGrid()[5][4]));
        T55.setText(String.valueOf(g1.getGrid()[5][5]));
        T56.setText(String.valueOf(g1.getGrid()[5][6]));
        T57.setText(String.valueOf(g1.getGrid()[5][7]));
        T58.setText(String.valueOf(g1.getGrid()[5][8]));
        T60.setText(String.valueOf(g1.getGrid()[6][0]));
        T61.setText(String.valueOf(g1.getGrid()[6][1]));
        T62.setText(String.valueOf(g1.getGrid()[6][2]));
        T63.setText(String.valueOf(g1.getGrid()[6][3]));
        T64.setText(String.valueOf(g1.getGrid()[6][4]));
        T65.setText(String.valueOf(g1.getGrid()[6][5]));
        T66.setText(String.valueOf(g1.getGrid()[6][6]));
        T67.setText(String.valueOf(g1.getGrid()[6][7]));
        T68.setText(String.valueOf(g1.getGrid()[6][8]));
        T70.setText(String.valueOf(g1.getGrid()[7][0]));
        T71.setText(String.valueOf(g1.getGrid()[7][1]));
        T72.setText(String.valueOf(g1.getGrid()[7][2]));
        T73.setText(String.valueOf(g1.getGrid()[7][3]));
        T74.setText(String.valueOf(g1.getGrid()[7][4]));
        T75.setText(String.valueOf(g1.getGrid()[7][5]));
        T76.setText(String.valueOf(g1.getGrid()[7][6]));
        T77.setText(String.valueOf(g1.getGrid()[7][7]));
        T78.setText(String.valueOf(g1.getGrid()[7][8]));
        T80.setText(String.valueOf(g1.getGrid()[8][0]));
        T81.setText(String.valueOf(g1.getGrid()[8][1]));
        T82.setText(String.valueOf(g1.getGrid()[8][2]));
        T83.setText(String.valueOf(g1.getGrid()[8][3]));
        T84.setText(String.valueOf(g1.getGrid()[8][4]));
        T85.setText(String.valueOf(g1.getGrid()[8][5]));
        T86.setText(String.valueOf(g1.getGrid()[8][6]));
        T87.setText(String.valueOf(g1.getGrid()[8][7]));
        T88.setText(String.valueOf(g1.getGrid()[8][8]));

        JOptionPane.showMessageDialog(this, " Puzzle solved by AI", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Counter;
    private javax.swing.JButton Generator;
    private javax.swing.JTextField T00;
    private javax.swing.JTextField T01;
    private javax.swing.JTextField T02;
    private javax.swing.JTextField T03;
    private javax.swing.JTextField T04;
    private javax.swing.JTextField T05;
    private javax.swing.JTextField T06;
    private javax.swing.JTextField T07;
    private javax.swing.JTextField T08;
    private javax.swing.JTextField T10;
    private javax.swing.JTextField T11;
    private javax.swing.JTextField T12;
    private javax.swing.JTextField T13;
    private javax.swing.JTextField T14;
    private javax.swing.JTextField T15;
    private javax.swing.JTextField T16;
    private javax.swing.JTextField T17;
    private javax.swing.JTextField T18;
    private javax.swing.JTextField T20;
    private javax.swing.JTextField T21;
    private javax.swing.JTextField T22;
    private javax.swing.JTextField T23;
    private javax.swing.JTextField T24;
    private javax.swing.JTextField T25;
    private javax.swing.JTextField T26;
    private javax.swing.JTextField T27;
    private javax.swing.JTextField T28;
    private javax.swing.JTextField T30;
    private javax.swing.JTextField T31;
    private javax.swing.JTextField T32;
    private javax.swing.JTextField T33;
    private javax.swing.JTextField T34;
    private javax.swing.JTextField T35;
    private javax.swing.JTextField T36;
    private javax.swing.JTextField T37;
    private javax.swing.JTextField T38;
    private javax.swing.JTextField T40;
    private javax.swing.JTextField T41;
    private javax.swing.JTextField T42;
    private javax.swing.JTextField T43;
    private javax.swing.JTextField T44;
    private javax.swing.JTextField T45;
    private javax.swing.JTextField T46;
    private javax.swing.JTextField T47;
    private javax.swing.JTextField T48;
    private javax.swing.JTextField T50;
    private javax.swing.JTextField T51;
    private javax.swing.JTextField T52;
    private javax.swing.JTextField T53;
    private javax.swing.JTextField T54;
    private javax.swing.JTextField T55;
    private javax.swing.JTextField T56;
    private javax.swing.JTextField T57;
    private javax.swing.JTextField T58;
    private javax.swing.JTextField T60;
    private javax.swing.JTextField T61;
    private javax.swing.JTextField T62;
    private javax.swing.JTextField T63;
    private javax.swing.JTextField T64;
    private javax.swing.JTextField T65;
    private javax.swing.JTextField T66;
    private javax.swing.JTextField T67;
    private javax.swing.JTextField T68;
    private javax.swing.JTextField T70;
    private javax.swing.JTextField T71;
    private javax.swing.JTextField T72;
    private javax.swing.JTextField T73;
    private javax.swing.JTextField T74;
    private javax.swing.JTextField T75;
    private javax.swing.JTextField T76;
    private javax.swing.JTextField T77;
    private javax.swing.JTextField T78;
    private javax.swing.JTextField T80;
    private javax.swing.JTextField T81;
    private javax.swing.JTextField T82;
    private javax.swing.JTextField T83;
    private javax.swing.JTextField T84;
    private javax.swing.JTextField T85;
    private javax.swing.JTextField T86;
    private javax.swing.JTextField T87;
    private javax.swing.JTextField T88;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField100;
    private javax.swing.JTextField jTextField101;
    private javax.swing.JTextField jTextField102;
    private javax.swing.JTextField jTextField103;
    private javax.swing.JTextField jTextField104;
    private javax.swing.JTextField jTextField105;
    private javax.swing.JTextField jTextField106;
    private javax.swing.JTextField jTextField107;
    private javax.swing.JTextField jTextField108;
    private javax.swing.JTextField jTextField109;
    private javax.swing.JTextField jTextField110;
    private javax.swing.JTextField jTextField111;
    private javax.swing.JTextField jTextField112;
    private javax.swing.JTextField jTextField113;
    private javax.swing.JTextField jTextField114;
    private javax.swing.JTextField jTextField115;
    private javax.swing.JTextField jTextField116;
    private javax.swing.JTextField jTextField117;
    private javax.swing.JTextField jTextField118;
    private javax.swing.JTextField jTextField119;
    private javax.swing.JTextField jTextField120;
    private javax.swing.JTextField jTextField121;
    private javax.swing.JTextField jTextField122;
    private javax.swing.JTextField jTextField123;
    private javax.swing.JTextField jTextField124;
    private javax.swing.JTextField jTextField125;
    private javax.swing.JTextField jTextField126;
    // End of variables declaration//GEN-END:variables
}
