/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Opcao;

/**
 *
 * @author Wanderson
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    Opcao opcao;

    public FormPrincipal() {
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

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmCadastrar = new javax.swing.JMenu();
        jmMedicoCad = new javax.swing.JMenuItem();
        jmPacienteCad = new javax.swing.JMenuItem();
        jmConsultaCad = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmMedicoCons = new javax.swing.JMenuItem();
        jmPacienteCons = new javax.swing.JMenuItem();
        jmConsultaCons = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmMedicoAlt = new javax.swing.JMenuItem();
        jmPacienteAlt = new javax.swing.JMenuItem();
        jmConsultaAlt = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmMedicoExc = new javax.swing.JMenuItem();
        jmPacienteExc = new javax.swing.JMenuItem();
        jmConsultaExc = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/10130.png"))); // NOI18N
        jDesktopPane2.add(jLabel3);
        jLabel3.setBounds(0, -30, 850, 610);

        jMenu1.setMnemonic('f');
        jMenu1.setText("File");

        jmCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/create.png"))); // NOI18N
        jmCadastrar.setMnemonic('c');
        jmCadastrar.setText("Cadastrar");

        jmMedicoCad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmMedicoCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medico.png"))); // NOI18N
        jmMedicoCad.setText("Medico");
        jmMedicoCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMedicoCadActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmMedicoCad);

        jmPacienteCad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmPacienteCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paciente.png"))); // NOI18N
        jmPacienteCad.setText("Paciente");
        jmPacienteCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPacienteCadActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmPacienteCad);

        jmConsultaCad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmConsultaCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consulta.png"))); // NOI18N
        jmConsultaCad.setText("Consulta");
        jmConsultaCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultaCadActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmConsultaCad);

        jMenu1.add(jmCadastrar);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/read.png"))); // NOI18N
        jMenu3.setMnemonic('o');
        jMenu3.setText("Consultar");

        jmMedicoCons.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmMedicoCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medico.png"))); // NOI18N
        jmMedicoCons.setText("Medico");
        jmMedicoCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMedicoConsActionPerformed(evt);
            }
        });
        jMenu3.add(jmMedicoCons);

        jmPacienteCons.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmPacienteCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paciente.png"))); // NOI18N
        jmPacienteCons.setText("Paciente");
        jmPacienteCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPacienteConsActionPerformed(evt);
            }
        });
        jMenu3.add(jmPacienteCons);

        jmConsultaCons.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmConsultaCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consulta.png"))); // NOI18N
        jmConsultaCons.setText("Consulta");
        jmConsultaCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultaConsActionPerformed(evt);
            }
        });
        jMenu3.add(jmConsultaCons);

        jMenu1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/updated.png"))); // NOI18N
        jMenu4.setMnemonic('a');
        jMenu4.setText("Alterar");

        jmMedicoAlt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmMedicoAlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medico.png"))); // NOI18N
        jmMedicoAlt.setText("Medico");
        jmMedicoAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMedicoAltActionPerformed(evt);
            }
        });
        jMenu4.add(jmMedicoAlt);

        jmPacienteAlt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmPacienteAlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paciente.png"))); // NOI18N
        jmPacienteAlt.setText("Paciente");
        jmPacienteAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPacienteAltActionPerformed(evt);
            }
        });
        jMenu4.add(jmPacienteAlt);

        jmConsultaAlt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmConsultaAlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consulta.png"))); // NOI18N
        jmConsultaAlt.setText("Consulta");
        jmConsultaAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultaAltActionPerformed(evt);
            }
        });
        jMenu4.add(jmConsultaAlt);

        jMenu1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete-file.png"))); // NOI18N
        jMenu5.setMnemonic('e');
        jMenu5.setText("Excluir");

        jmMedicoExc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmMedicoExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/medico.png"))); // NOI18N
        jmMedicoExc.setText("Medico");
        jmMedicoExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMedicoExcActionPerformed(evt);
            }
        });
        jMenu5.add(jmMedicoExc);

        jmPacienteExc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmPacienteExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paciente.png"))); // NOI18N
        jmPacienteExc.setText("Paciente");
        jmPacienteExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPacienteExcActionPerformed(evt);
            }
        });
        jMenu5.add(jmPacienteExc);

        jmConsultaExc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmConsultaExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consulta.png"))); // NOI18N
        jmConsultaExc.setText("Consulta");
        jmConsultaExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultaExcActionPerformed(evt);
            }
        });
        jMenu5.add(jmConsultaExc);

        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmMedicoCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMedicoCadActionPerformed
        Medico medico = new Medico();
        jDesktopPane2.add(medico);
        medico.setVisible(true);
        medico.selecionado(opcao.CADASTRAR);
    }//GEN-LAST:event_jmMedicoCadActionPerformed

    private void jmPacienteCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPacienteCadActionPerformed
        Paciente paciente = new Paciente();
        jDesktopPane2.add(paciente);
        paciente.setVisible(true);
        paciente.selecionado(opcao.CADASTRAR);

    }//GEN-LAST:event_jmPacienteCadActionPerformed

    private void jmConsultaCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultaCadActionPerformed
        Consulta consulta = new Consulta();
        jDesktopPane2.add(consulta);
        consulta.setVisible(true);
        consulta.selecionado(opcao.CADASTRAR);

    }//GEN-LAST:event_jmConsultaCadActionPerformed

    private void jmMedicoConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMedicoConsActionPerformed
        Medico medico = new Medico();
        jDesktopPane2.add(medico);
        medico.setVisible(true);
        medico.selecionado(opcao.CONSULTAR);    }//GEN-LAST:event_jmMedicoConsActionPerformed

    private void jmPacienteConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPacienteConsActionPerformed
        Paciente paciente = new Paciente();
        jDesktopPane2.add(paciente);
        paciente.setVisible(true);
        paciente.selecionado(opcao.CONSULTAR);    }//GEN-LAST:event_jmPacienteConsActionPerformed

    private void jmConsultaConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultaConsActionPerformed
        Consulta consulta = new Consulta();
        jDesktopPane2.add(consulta);
        consulta.setVisible(true);
        consulta.selecionado(opcao.CONSULTAR);    }//GEN-LAST:event_jmConsultaConsActionPerformed

    private void jmMedicoAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMedicoAltActionPerformed
        Medico medico = new Medico();
        jDesktopPane2.add(medico);
        medico.setVisible(true);
        medico.selecionado(opcao.ALTERAR);    }//GEN-LAST:event_jmMedicoAltActionPerformed

    private void jmPacienteAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPacienteAltActionPerformed
        Paciente paciente = new Paciente();
        jDesktopPane2.add(paciente);
        paciente.setVisible(true);
        paciente.selecionado(opcao.ALTERAR);    }//GEN-LAST:event_jmPacienteAltActionPerformed

    private void jmConsultaAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultaAltActionPerformed
        Consulta consulta = new Consulta();
        jDesktopPane2.add(consulta);
        consulta.setVisible(true);
        consulta.selecionado(opcao.ALTERAR);    }//GEN-LAST:event_jmConsultaAltActionPerformed

    private void jmMedicoExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMedicoExcActionPerformed
        Medico medico = new Medico();
        jDesktopPane2.add(medico);
        medico.setVisible(true);
        medico.selecionado(opcao.EXCLUIR);    }//GEN-LAST:event_jmMedicoExcActionPerformed

    private void jmPacienteExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPacienteExcActionPerformed
        Paciente paciente = new Paciente();
        jDesktopPane2.add(paciente);
        paciente.setVisible(true);
        paciente.selecionado(opcao.EXCLUIR);    }//GEN-LAST:event_jmPacienteExcActionPerformed

    private void jmConsultaExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultaExcActionPerformed
        Consulta consulta = new Consulta();
        jDesktopPane2.add(consulta);
        consulta.setVisible(true);
        consulta.selecionado(opcao.EXCLUIR);    }//GEN-LAST:event_jmConsultaExcActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmCadastrar;
    private javax.swing.JMenuItem jmConsultaAlt;
    private javax.swing.JMenuItem jmConsultaCad;
    private javax.swing.JMenuItem jmConsultaCons;
    private javax.swing.JMenuItem jmConsultaExc;
    private javax.swing.JMenuItem jmMedicoAlt;
    private javax.swing.JMenuItem jmMedicoCad;
    private javax.swing.JMenuItem jmMedicoCons;
    private javax.swing.JMenuItem jmMedicoExc;
    private javax.swing.JMenuItem jmPacienteAlt;
    private javax.swing.JMenuItem jmPacienteCad;
    private javax.swing.JMenuItem jmPacienteCons;
    private javax.swing.JMenuItem jmPacienteExc;
    // End of variables declaration//GEN-END:variables
}
