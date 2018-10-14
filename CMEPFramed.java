package CMEPReport;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class CMEPFramed {

                private JFrame frame;
                private JTextField CMEPFilePath_text;
                private JTextField KWHREG_text;
                private JTextField KWH_text;
                private JTextField KVARHREG_text;
                private JTextField KVARH_text;
                private JTextField GKWHREG_text;
                private JTextField GKWH_text;
                private JTextField CCFREG_text;
                private JTextField CCF_text;
                private JTextField CCFCREG_text;
                private JTextField CCFC_text;
                private JTextField SKWH_text;
                private JTextField TotalIMDs_text;

                /**
                * Launch the application.
                */
                /*
                public static void main(String[] args) {
                                EventQueue.invokeLater(new Runnable() {
                                                public void run() {
                                                                try {
                                                                                CMEPFramed window = new CMEPFramed();
                                                                                window.frame.setVisible(true);
                                                                } catch (Exception e) {
                                                                                e.printStackTrace();
                                                                }
                                                }
                                });
                }
                */

                /**
                * Create the application.
                */
                public CMEPFramed() {
                                initialize();
                }

                /**
                * Initialize the contents of the frame.
                */
                private void initialize() {
                                frame = new JFrame();
                                frame.setBounds(0, 0, 557, 448);
                                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frame.getContentPane().setLayout(null);
                                
                                JTextPane txtpnCmepFilePath = new JTextPane();
                                txtpnCmepFilePath.setFont(new Font("Dialog", Font.BOLD, 12));
                                txtpnCmepFilePath.setBackground(Color.LIGHT_GRAY);
                                txtpnCmepFilePath.setText("CMEP File Path");
                                txtpnCmepFilePath.setBounds(12, 12, 103, 22);
                                frame.getContentPane().add(txtpnCmepFilePath);
                                
                                CMEPFilePath_text = new JTextField();
                                CMEPFilePath_text.setBounds(134, 12, 395, 22);
                                frame.getContentPane().add(CMEPFilePath_text);
                                CMEPFilePath_text.setColumns(10);
                                
                                JButton btnSubmit = new JButton("Submit");
                                btnSubmit.setBounds(255, 46, 90, 26);
                                frame.getContentPane().add(btnSubmit);
                                
                                JButton btnClear = new JButton("Clear");
                                btnClear.setBounds(255, 364, 90, 26);
                                frame.getContentPane().add(btnClear);
                                
                                JTextPane txtpnKwhreg = new JTextPane();
                                txtpnKwhreg.setFont(new Font("Dialog", Font.BOLD, 12));
                                txtpnKwhreg.setBackground(Color.LIGHT_GRAY);
                                txtpnKwhreg.setText("KWHREG");
                                txtpnKwhreg.setBounds(12, 142, 73, 22);
                                frame.getContentPane().add(txtpnKwhreg);
                                
                                KWHREG_text = new JTextField();
                                KWHREG_text.setBounds(99, 142, 73, 22);
                                frame.getContentPane().add(KWHREG_text);
                                KWHREG_text.setColumns(10);
                                
                                JTextPane txtpnKwh = new JTextPane();
                                txtpnKwh.setText("KWH");
                                txtpnKwh.setFont(new Font("Dialog", Font.BOLD, 12));
                                txtpnKwh.setBackground(Color.LIGHT_GRAY);
                                txtpnKwh.setBounds(12, 176, 73, 22);
                                frame.getContentPane().add(txtpnKwh);
                                
                                KWH_text = new JTextField();
                                KWH_text.setColumns(10);
                                KWH_text.setBounds(99, 176, 73, 22);
                                frame.getContentPane().add(KWH_text);
                                
                                JTextPane txtpnKvarhreg = new JTextPane();
                                txtpnKvarhreg.setText("KVARHREG");
                                txtpnKvarhreg.setFont(new Font("Dialog", Font.BOLD, 12));
                                txtpnKvarhreg.setBackground(Color.LIGHT_GRAY);
                                txtpnKvarhreg.setBounds(12, 210, 73, 22);
                                frame.getContentPane().add(txtpnKvarhreg);
                                
                                KVARHREG_text = new JTextField();
                                KVARHREG_text.setColumns(10);
                                KVARHREG_text.setBounds(99, 210, 73, 22);
                                frame.getContentPane().add(KVARHREG_text);
                                
                                JTextPane txtpnKvarh = new JTextPane();
                                txtpnKvarh.setText("KVARH");
                                txtpnKvarh.setFont(new Font("Dialog", Font.BOLD, 12));
                                txtpnKvarh.setBackground(Color.LIGHT_GRAY);
                                txtpnKvarh.setBounds(12, 244, 73, 22);
                                frame.getContentPane().add(txtpnKvarh);
                                
                                KVARH_text = new JTextField();
                                KVARH_text.setColumns(10);
                                KVARH_text.setBounds(99, 244, 73, 22);
                                frame.getContentPane().add(KVARH_text);
                                
                                JTextPane txtpnGkwhreg = new JTextPane();
                                txtpnGkwhreg.setText("GKWHREG");
                                txtpnGkwhreg.setFont(new Font("Dialog", Font.BOLD, 12));
                                txtpnGkwhreg.setBackground(Color.LIGHT_GRAY);
                                txtpnGkwhreg.setBounds(12, 278, 73, 22);
                                frame.getContentPane().add(txtpnGkwhreg);
                                
                                GKWHREG_text = new JTextField();
                                GKWHREG_text.setColumns(10);
                                GKWHREG_text.setBounds(99, 278, 73, 22);
                                frame.getContentPane().add(GKWHREG_text);
                                
                                JTextPane txtpnGkwh = new JTextPane();
                                txtpnGkwh.setText("GKWH");
                                txtpnGkwh.setFont(new Font("Dialog", Font.BOLD, 12));
                                txtpnGkwh.setBackground(Color.LIGHT_GRAY);
                                txtpnGkwh.setBounds(12, 312, 73, 22);
                                frame.getContentPane().add(txtpnGkwh);
                                
                                GKWH_text = new JTextField();
                                GKWH_text.setColumns(10);
                                GKWH_text.setBounds(99, 312, 73, 22);
                                frame.getContentPane().add(GKWH_text);
                                
                                JTextPane txtpnCcfreg = new JTextPane();
                                txtpnCcfreg.setText("CCFREG");
                                txtpnCcfreg.setFont(new Font("Dialog", Font.BOLD, 12));
                                txtpnCcfreg.setBackground(Color.LIGHT_GRAY);
                                txtpnCcfreg.setBounds(222, 142, 73, 22);
                                frame.getContentPane().add(txtpnCcfreg);
                                
                                CCFREG_text = new JTextField();
                                CCFREG_text.setColumns(10);
                                CCFREG_text.setBounds(307, 142, 73, 22);
                                frame.getContentPane().add(CCFREG_text);
                                
                                JTextPane txtpnCcf = new JTextPane();
                                txtpnCcf.setText("CCF");
                                txtpnCcf.setFont(new Font("Dialog", Font.BOLD, 12));
                                txtpnCcf.setBackground(Color.LIGHT_GRAY);
                                txtpnCcf.setBounds(222, 176, 73, 22);
                                frame.getContentPane().add(txtpnCcf);
                                
                                CCF_text = new JTextField();
                                CCF_text.setColumns(10);
                                CCF_text.setBounds(307, 176, 73, 22);
                                frame.getContentPane().add(CCF_text);
                                
                                JTextPane txtpnCcfcreg = new JTextPane();
                                txtpnCcfcreg.setText("CCF-CREG");
                                txtpnCcfcreg.setFont(new Font("Dialog", Font.BOLD, 12));
                                txtpnCcfcreg.setBackground(Color.LIGHT_GRAY);
                                txtpnCcfcreg.setBounds(222, 210, 73, 22);
                                frame.getContentPane().add(txtpnCcfcreg);
                                
                                CCFCREG_text = new JTextField();
                                CCFCREG_text.setColumns(10);
                                CCFCREG_text.setBounds(307, 210, 73, 22);
                                frame.getContentPane().add(CCFCREG_text);
                                
                                JTextPane txtpnCcfc = new JTextPane();
                                txtpnCcfc.setText("CCF-C");
                                txtpnCcfc.setFont(new Font("Dialog", Font.BOLD, 12));
                                txtpnCcfc.setBackground(Color.LIGHT_GRAY);
                                txtpnCcfc.setBounds(222, 244, 73, 22);
                                frame.getContentPane().add(txtpnCcfc);
                                
                                CCFC_text = new JTextField();
                                CCFC_text.setColumns(10);
                                CCFC_text.setBounds(307, 244, 73, 22);
                                frame.getContentPane().add(CCFC_text);
                                
                                JTextPane txtpnSkwh = new JTextPane();
                                txtpnSkwh.setText("SKWH");
                                txtpnSkwh.setFont(new Font("Dialog", Font.BOLD, 12));
                                txtpnSkwh.setBackground(Color.LIGHT_GRAY);
                                txtpnSkwh.setBounds(222, 278, 73, 22);
                                frame.getContentPane().add(txtpnSkwh);
                                
                                SKWH_text = new JTextField();
                                SKWH_text.setColumns(10);
                                SKWH_text.setBounds(307, 278, 73, 22);
                                frame.getContentPane().add(SKWH_text);
                                
                                JTextPane txtpnTotalImds = new JTextPane();
                                txtpnTotalImds.setText("Total IMDs");
                                txtpnTotalImds.setFont(new Font("Dialog", Font.BOLD, 12));
                                txtpnTotalImds.setBackground(Color.LIGHT_GRAY);
                                txtpnTotalImds.setBounds(112, 93, 83, 22);
                                frame.getContentPane().add(txtpnTotalImds);
                                
                                TotalIMDs_text = new JTextField();
                                TotalIMDs_text.setColumns(10);
                                TotalIMDs_text.setBounds(209, 93, 73, 22);
                                frame.getContentPane().add(TotalIMDs_text);
                                                                

                                btnSubmit.addActionListener(new ActionListener() {
                                                public void actionPerformed(ActionEvent e) {
                                                                String FilePath = CMEPFilePath_text.getText();
                                                                CMEPReport ct = new CMEPReport();
                                                                try {
                                                                                ct.main(FilePath);
                                                                } catch (IOException e1) {
                                                                                e1.printStackTrace();
                                                                }
                                                }

                                });
                                
                                JButton btnReset = new JButton("clear");
                                btnReset.addActionListener(new ActionListener() {
                                                public void actionPerformed(ActionEvent arg0) {
                                                                CMEPFilePath_text.setText(null);
                                                                KWHREG_text.setText(null);
                                                                KWH_text.setText(null);
                                                                KVARHREG_text.setText(null);
                                                                KVARH_text.setText(null);
                                                                GKWHREG_text.setText(null);
                                                                GKWH_text.setText(null);
                                                                CCFREG_text.setText(null);
                                                                CCF_text.setText(null);
                                                                CCFCREG_text.setText(null);
                                                                CCFC_text.setText(null);
                                                                SKWH_text.setText(null);
                                                                TotalIMDs_text.setText(null);
                                                                
                                                }
                                });

                                frame.setVisible(true);
                }

                public static void main(String[] args) {
                                CMEPFramed fr = new CMEPFramed();
                                fr.initialize();
                                // JProgressBar progressBar = new JProgressBar();
                                // progressBar.setValue(100);
                }
/*
                public void actionPerformed(ActionEvent e) {
                                String FilePath = CMEPFilePath_text.getText();
                                CMEPReport ct = new CMEPReport();
                                try {
                                                CMEPReport.main(FilePath);
                                } catch (IOException e1) {
                                                // TODO Auto-generated catch block
                                                e1.printStackTrace();
                                }
                }*/
};
