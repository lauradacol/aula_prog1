package colecao;

/**
 *
 * @author laura
 * 
 * Este é um sistema de gerenciamento de dados de uma coleção biológica. 
 * O objetivo é permitir o cadastro, busca e atualização dos dados de indivíduos tombados na coleção. Os dados relacionam-se da seguinte forma:
 * - Indivíduos pertencem à uma única espécie. 
 * - Espécies pertencem à um único gênero. 
 * - Gêneros pertencem à uma única família.
 * - Os indivíduos foram coletados em uma localidade por um coletor. 
 * - A Localidade possui dados: Unidade Federativa (UF), Município e Localidade). Exemplo: SC, Chapecó, UFFS. SC, Chapecó, Ecoparque.
 * - O coletor possui os dados: Nome, email e telefone. 
 * - Indivíduos ainda possuiem os atributos data (data em que foi coletado), recipiente (recipiente na coleção física em que este animal encontra-se, por exemplo "Estante 1, Vidro 6") e observações.
 *
 * É possível cadastrar no sistema familia, genero, especie, localidade e coletor separadamente ou no momento de tombar um indivíduo. 
 * 
 * 
 * 
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        btAddGen = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        btAddFam = new javax.swing.JButton();
        btAddEsp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btAddLoc = new javax.swing.JButton();
        btAddCol = new javax.swing.JButton();
        btAddInd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btAddGen.setText("Gênero");
        btAddGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddGenActionPerformed(evt);
            }
        });

        desktopPane.setBackground(new java.awt.Color(78, 145, 18));

        btAddFam.setText("Família");
        btAddFam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddFamActionPerformed(evt);
            }
        });

        btAddEsp.setText("Espécie");
        btAddEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddEspActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Baloo Thambi", 1, 24)); // NOI18N
        jLabel1.setText("Sistema de Gerenciamento de Colecao Biológica");

        btAddLoc.setText("Localidade");
        btAddLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddLocActionPerformed(evt);
            }
        });

        btAddCol.setText("Coletor");
        btAddCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddColActionPerformed(evt);
            }
        });

        btAddInd.setText("Tombar Indivíduo");
        btAddInd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddIndActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btAddGen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAddFam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAddEsp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAddLoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAddCol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAddInd, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1205, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAddFam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAddGen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAddEsp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAddLoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAddCol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAddInd)
                        .addGap(0, 365, Short.MAX_VALUE))
                    .addComponent(desktopPane))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddGenActionPerformed
        criaAddGenFrame();
    }//GEN-LAST:event_btAddGenActionPerformed

    private void btAddFamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddFamActionPerformed
        criaAddFamFrame();
    }//GEN-LAST:event_btAddFamActionPerformed

    private void btAddEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddEspActionPerformed
        criaAddEspFrame();
    }//GEN-LAST:event_btAddEspActionPerformed

    private void btAddLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddLocActionPerformed
        criaAddLocFrame();
    }//GEN-LAST:event_btAddLocActionPerformed

    private void btAddColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddColActionPerformed
        criaAddColFrame();
    }//GEN-LAST:event_btAddColActionPerformed

    private void btAddIndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddIndActionPerformed
        criaAddIndFrame();
    }//GEN-LAST:event_btAddIndActionPerformed

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
    private javax.swing.JButton btAddCol;
    private javax.swing.JButton btAddEsp;
    private javax.swing.JButton btAddFam;
    private javax.swing.JButton btAddGen;
    private javax.swing.JButton btAddInd;
    private javax.swing.JButton btAddLoc;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

   /**
    * Frames declaration
    */ 
   AddFamFrame addFamFrame;
   AddGenFrame addGenFrame;
   AddEspFrame addEspFrame;
   AddLocFrame addLocFrame;
   AddColFrame addColFrame;
   AddIndFrame addIndFrame;
   
   /**
    * Create and open the add familia frame
    */

   private void criaAddFamFrame() {
        if(addFamFrame == null){
           addFamFrame = new AddFamFrame(); 
        }

        desktopPane.add(addFamFrame);
        addFamFrame.setVisible(true);
   }

   /**
    * Create and open the add genero frame
    */
   private void criaAddGenFrame() {
        if(addGenFrame == null){
           addGenFrame = new AddGenFrame(); 
        }

        desktopPane.add(addGenFrame);
        addGenFrame.setVisible(true);
   }

   /**
    * Create and open the add especie frame
    */   
   private void criaAddEspFrame() {
        if(addEspFrame == null){
           addEspFrame = new AddEspFrame(); 
        }

        desktopPane.add(addEspFrame);
        addEspFrame.setVisible(true);
   }      

   /**
    * Create and open the add localidade frame
    */   
    private void criaAddLocFrame() {
        if(addLocFrame == null){
           addLocFrame = new AddLocFrame(); 
        }

        desktopPane.add(addLocFrame);
       addLocFrame.setVisible(true);
    }   

    /**
    * Create and open the add coletor frame
    */
    private void criaAddColFrame() {
        if(addColFrame == null){
           addColFrame = new AddColFrame(); 
        }

        desktopPane.add(addColFrame);
       addColFrame.setVisible(true);
    }     

   /**
    * Create and open the add individuo frame
    */    
    private void criaAddIndFrame() {
        if(addIndFrame == null){
           addIndFrame = new AddIndFrame(); 
        }

        desktopPane.add(addIndFrame);
       addIndFrame.setVisible(true);
    }        
    
}
