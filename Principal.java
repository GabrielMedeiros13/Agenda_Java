/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel Medeiros
 */
public class Principal extends javax.swing.JFrame {
    ArrayList<Agenda> ListaNomes;
    String modo;
    
    public void LoadTableNomes(){
        Object Colunas[] = {"Nomes"};
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome"},0);
        
        for(int i = 0; i < ListaNomes.size(); i++){
            Object linha[] = new Object[]{ListaNomes.get(i).getNome()};
            
            modelo.addRow(linha);
    }
        
        tbl_nomes.setModel(modelo);
        
    }
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        ListaNomes = new ArrayList();
       
    }
    
    public void ManipulaInterface(){
        switch(modo){
            case "Adicionar":
                btn_adicionar.setEnabled(true);
                break;
            case "Remover":
                btn_remover.setEnabled(true);
                break;
            case "Atualizar":
                btn_atualizar.setEnabled(true);
                break;
            case "Selecao":
                btn_remover.setEnabled(true);
                btn_atualizar.setEnabled(true);
                break;
            
            default: System.out.println("Modo invalido");
           
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_nomes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        c_telefone = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        c_detalhes = new javax.swing.JTextArea();
        btn_adicionar = new javax.swing.JButton();
        btn_remover = new javax.swing.JButton();
        btn_atualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_nomes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nomes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_nomes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_nomesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_nomes);
        if (tbl_nomes.getColumnModel().getColumnCount() > 0) {
            tbl_nomes.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Nome:");

        jLabel2.setText("Telefone:");

        jLabel3.setText("Detalhes:");

        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });

        c_detalhes.setColumns(20);
        c_detalhes.setRows(5);
        jScrollPane2.setViewportView(c_detalhes);

        btn_adicionar.setText("Adicionar");
        btn_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarActionPerformed(evt);
            }
        });

        btn_remover.setText("Remover");
        btn_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerActionPerformed(evt);
            }
        });

        btn_atualizar.setText("Atualizar");
        btn_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_telefone)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(c_nome)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_adicionar)
                .addGap(10, 10, 10)
                .addComponent(btn_remover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_atualizar)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(c_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_adicionar)
                    .addComponent(btn_remover)
                    .addComponent(btn_atualizar))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Agenda", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nomeActionPerformed

    private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarActionPerformed
        Agenda d = new Agenda(c_nome.getText(), c_telefone.getText(), c_detalhes.getText());
        ListaNomes.add(d);
        LoadTableNomes();
        
        modo = "Adicionar";
        ManipulaInterface();
        c_nome.setText("");
        c_telefone.setText("");
        c_detalhes.setText("");
        

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_adicionarActionPerformed

    private void btn_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerActionPerformed
        int index = tbl_nomes.getSelectedRow();
        if(index >= 0 && index < ListaNomes.size()){
            ListaNomes.remove(index);
           
        }
        LoadTableNomes();
        modo = "Remover";
        ManipulaInterface();
        c_nome.setText("");
        c_telefone.setText("");
        c_detalhes.setText("");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_removerActionPerformed

    private void btn_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizarActionPerformed
        
        modo = "Atualizar";
        ManipulaInterface();
        if(modo.equals("Atualizar")){
            int index = tbl_nomes.getSelectedRow();
            ListaNomes.get(index).setNome(c_nome.getText());
            ListaNomes.get(index).setTelefone(c_telefone.getText());
            ListaNomes.get(index).setDetalhes(c_detalhes.getText());
            
        }
        LoadTableNomes();
        c_nome.setText("");
        c_telefone.setText("");
        c_detalhes.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_atualizarActionPerformed

    private void tbl_nomesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_nomesMouseClicked
        int index = tbl_nomes.getSelectedRow();
        if(index >= 0 && index < ListaNomes.size()){
            Agenda a = ListaNomes.get(index);
            
            c_nome.setText(String.valueOf(a.getNome()));
            c_telefone.setText(String.valueOf(a.getTelefone()));
            c_detalhes.setText(String.valueOf(a.getDetalhes()));
            modo = "Selecao";
            ManipulaInterface();
        }
        modo = "Selecao";
        ManipulaInterface();
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_nomesMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JButton btn_atualizar;
    private javax.swing.JButton btn_remover;
    private javax.swing.JTextArea c_detalhes;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField c_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_nomes;
    // End of variables declaration//GEN-END:variables
}
