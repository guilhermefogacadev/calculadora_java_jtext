/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author guilh
 */
public class CALC extends javax.swing.JFrame {

    double valorPress;
    double valorPress2;
    int valorPosResul;
    double resultado;
    String op;

    public CALC() {
        initComponents();
        valorPress = 0;
        resultado = -1;
        valorPosResul = 0;
        valorPress2 = 0;
        op = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        resultadoFinal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        oito = new javax.swing.JButton();
        nove = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        multiplica = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        sete = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        um = new javax.swing.JButton();
        dois = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        quatro = new javax.swing.JButton();
        soma = new javax.swing.JButton();
        subtrai = new javax.swing.JButton();
        ce = new javax.swing.JButton();
        igual = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(2, 4));

        jPanel1.setLayout(new java.awt.GridLayout());

        resultadoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoFinalActionPerformed(evt);
            }
        });
        jPanel1.add(resultadoFinal);

        getContentPane().add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(4, 1));

        oito.setText("8");
        oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitoActionPerformed(evt);
            }
        });
        jPanel2.add(oito);

        nove.setText("9");
        nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noveActionPerformed(evt);
            }
        });
        jPanel2.add(nove);

        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        jPanel2.add(zero);

        multiplica.setText("*");
        multiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicaActionPerformed(evt);
            }
        });
        jPanel2.add(multiplica);

        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        jPanel2.add(cinco);

        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        jPanel2.add(seis);

        sete.setText("7");
        sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seteActionPerformed(evt);
            }
        });
        jPanel2.add(sete);

        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });
        jPanel2.add(divide);

        um.setText("1");
        um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umActionPerformed(evt);
            }
        });
        jPanel2.add(um);

        dois.setText("2");
        dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisActionPerformed(evt);
            }
        });
        jPanel2.add(dois);

        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        jPanel2.add(tres);

        quatro.setText("4");
        quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroActionPerformed(evt);
            }
        });
        jPanel2.add(quatro);

        soma.setText("+");
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });
        jPanel2.add(soma);

        subtrai.setText("-");
        subtrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtraiActionPerformed(evt);
            }
        });
        jPanel2.add(subtrai);

        ce.setText("CE");
        ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceActionPerformed(evt);
            }
        });
        jPanel2.add(ce);

        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });
        jPanel2.add(igual);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteActionPerformed
        resultadoFinal.setText(resultadoFinal.getText()+7);
    }//GEN-LAST:event_seteActionPerformed

    private void noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveActionPerformed
       resultadoFinal.setText(resultadoFinal.getText()+9);
    }//GEN-LAST:event_noveActionPerformed

    private void subtraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtraiActionPerformed
        valorPress=Double.parseDouble(resultadoFinal.getText());
        op = "Su";
        resultadoFinal.setText("");
    }//GEN-LAST:event_subtraiActionPerformed

    private void somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somaActionPerformed
        valorPress=Double.parseDouble(resultadoFinal.getText());
        System.out.println("v1: "+valorPress);
        op = "So";
        resultadoFinal.setText("");
    }//GEN-LAST:event_somaActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        String re;
        if ("So".equals(op) ) {
            valorPress2=Integer.parseInt(resultadoFinal.getText());
            resultado = valorPress + valorPress2;
            re = Double.toString(resultado);
            resultadoFinal.setText(re);
            System.out.println("resul: "+resultado);
        } else if ("Su".equals(op) ) {
            valorPress2=Integer.parseInt(resultadoFinal.getText());
            resultado = valorPress - valorPress2;
            re = Double.toString(resultado);
            resultadoFinal.setText(re);
            System.out.println("resul: "+resultado);
        } else if ("M".equals(op) ) {
            valorPress2=Integer.parseInt(resultadoFinal.getText());
            resultado = valorPress * valorPress2;
            re = Double.toString(resultado);
            resultadoFinal.setText(re);
            System.out.println("resul: "+resultado);
        } else if ("D".equals(op) ) {
            valorPress2=Integer.parseInt(resultadoFinal.getText());
            resultado = valorPress / valorPress2;
            re = Double.toString(resultado);
            resultadoFinal.setText(re);
            System.out.println("resul: "+resultado);
        
        }

    }//GEN-LAST:event_igualActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        valorPress=Double.parseDouble(resultadoFinal.getText());
        op = "D";
        resultadoFinal.setText("");
    }//GEN-LAST:event_divideActionPerformed

    private void multiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicaActionPerformed
        valorPress=Double.parseDouble(resultadoFinal.getText());
        op = "M";
        resultadoFinal.setText("");
    }//GEN-LAST:event_multiplicaActionPerformed

    private void quatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroActionPerformed
        resultadoFinal.setText(resultadoFinal.getText()+4);
    }//GEN-LAST:event_quatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        resultadoFinal.setText(resultadoFinal.getText()+5);
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
       resultadoFinal.setText(resultadoFinal.getText()+6);
    }//GEN-LAST:event_seisActionPerformed

    private void umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umActionPerformed
       resultadoFinal.setText(resultadoFinal.getText()+1);
    }//GEN-LAST:event_umActionPerformed

    private void doisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisActionPerformed
        resultadoFinal.setText(resultadoFinal.getText()+2);
    }//GEN-LAST:event_doisActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        resultadoFinal.setText(resultadoFinal.getText()+3);
    }//GEN-LAST:event_tresActionPerformed

    private void resultadoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoFinalActionPerformed

    private void oitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoActionPerformed
        resultadoFinal.setText(resultadoFinal.getText()+8);
    }//GEN-LAST:event_oitoActionPerformed

    private void ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceActionPerformed
        valorPress = 0;
        valorPress2 = 0;
        resultadoFinal.setText("");
        resultado = -1;
        valorPosResul = 0;
    }//GEN-LAST:event_ceActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
      resultadoFinal.setText(resultadoFinal.getText()+0);
    }//GEN-LAST:event_zeroActionPerformed

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
            java.util.logging.Logger.getLogger(CALC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CALC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CALC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CALC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CALC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ce;
    private javax.swing.JButton cinco;
    private javax.swing.JButton divide;
    private javax.swing.JButton dois;
    private javax.swing.JButton igual;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton multiplica;
    private javax.swing.JButton nove;
    private javax.swing.JButton oito;
    private javax.swing.JButton quatro;
    private javax.swing.JTextField resultadoFinal;
    private javax.swing.JButton seis;
    private javax.swing.JButton sete;
    private javax.swing.JButton soma;
    private javax.swing.JButton subtrai;
    private javax.swing.JButton tres;
    private javax.swing.JButton um;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
