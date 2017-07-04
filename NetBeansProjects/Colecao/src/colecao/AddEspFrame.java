/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laura
 */
public class AddEspFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddEspFrame
     */
    public AddEspFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addFamTextField = new javax.swing.JTextField();
        btClearEsp = new javax.swing.JButton();
        btAddEsp = new javax.swing.JButton();
        addGenTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addEspTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabEsp = new javax.swing.JTable();
        btBackEsp = new javax.swing.JButton();
        btShowEsp = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar Espécie"));

        jLabel2.setText("Nome da Família:");

        addFamTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFamTextFieldActionPerformed(evt);
            }
        });

        btClearEsp.setText("Limpar");
        btClearEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearEspActionPerformed(evt);
            }
        });

        btAddEsp.setText("Add");
        btAddEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddEspActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome do Gênero");

        jLabel4.setText("Nome da Espécie");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btClearEsp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAddEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addEspTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addGenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(addFamTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addFamTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addGenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addEspTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btClearEsp)
                    .addComponent(btAddEsp)))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Espécies Cadastradas"));

        tabEsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Família", "Gênero", "Espécie"
            }
        ));
        jScrollPane1.setViewportView(tabEsp);

        btBackEsp.setText("Sair");
        btBackEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackEspActionPerformed(evt);
            }
        });

        btShowEsp.setText("Ver Espécies Cadastradas");
        btShowEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btShowEspActionPerformed(evt);
            }
        });

        btDelete.setText("Deletar");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 238, Short.MAX_VALUE)
                        .addComponent(btBackEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btShowEsp)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btShowEsp)
                    .addComponent(btDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBackEsp)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btClearEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearEspActionPerformed
        addFamTextField.setText("");
        addGenTextField.setText("");
        addEspTextField.setText("");
    }//GEN-LAST:event_btClearEspActionPerformed

    private void btAddEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddEspActionPerformed
        String nomeFam = addFamTextField.getText();
        String nomeGen = addGenTextField.getText();
        String nomeEsp = addEspTextField.getText();
        
        Genero genero = GeneroFactory.getInstance().findGen(nomeFam, nomeGen);
        Especie e = EspecieFactory.getInstance().cadastrarEspecie(genero, nomeEsp);
        
        initEspTable();
        addFamTextField.setText("");
        addGenTextField.setText("");
        addEspTextField.setText("");    
    }//GEN-LAST:event_btAddEspActionPerformed
    
    private void initEspTable(){
        DefaultTableModel m = (DefaultTableModel) tabEsp.getModel();
        m.setRowCount(0);
        for(Especie e : EspecieFactory.getInstance().findAll()){
            m.addRow(new Object[] {e.getGenero().getFamilia(), e.getGenero().getNome(), e.getNome()});
        }
    }   
    
    private void btBackEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackEspActionPerformed
        this.dispose();
    }//GEN-LAST:event_btBackEspActionPerformed

    private void btShowEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btShowEspActionPerformed
        initEspTable();
    }//GEN-LAST:event_btShowEspActionPerformed

    private void addFamTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFamTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addFamTextFieldActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
       int row = tabEsp.getSelectedRow();
       int columnFam = 0;
       int columnGen = 1; 
       int columnEsp = 2;
       
       Object f = tabEsp.getValueAt(row, columnFam);
       Object g = tabEsp.getValueAt(row, columnGen);
       Object e = tabEsp.getValueAt(row, columnEsp);

       String familia = f.toString();       
       String genero = g.toString();       
       String especie = e.toString(); 
       
       Especie eRemove = EspecieFactory.getInstance().findEsp(familia,genero,especie);
       
       if((EspecieFactory.getInstance().deleteEsp(eRemove))==true){
            initEspTable();
       }
       
       else{
           ImpossivelDeletar frame = new ImpossivelDeletar();
           frame.setVisible(true);
       }
    }//GEN-LAST:event_btDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addEspTextField;
    private javax.swing.JTextField addFamTextField;
    private javax.swing.JTextField addGenTextField;
    private javax.swing.JButton btAddEsp;
    private javax.swing.JButton btBackEsp;
    private javax.swing.JButton btClearEsp;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btShowEsp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabEsp;
    // End of variables declaration//GEN-END:variables
}
