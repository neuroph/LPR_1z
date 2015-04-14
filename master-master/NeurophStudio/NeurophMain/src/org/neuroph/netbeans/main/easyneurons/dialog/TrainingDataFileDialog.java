/***
 * Neuroph  http://neuroph.sourceforge.net
 * Copyright by Neuroph Project (C) 2008
 *
 * This file is part of Neuroph framework.
 *
 * Neuroph is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * Neuroph is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Neuroph. If not, see <http://www.gnu.org/licenses/>.
 */

package org.neuroph.netbeans.main.easyneurons.dialog;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.jdesktop.application.Action;
import org.neuroph.core.data.DataSet;
import org.neuroph.netbeans.main.easyneurons.DataSetTopComponent;
import org.neuroph.util.TrainingSetImport;


/**
 * Handles training set imports
 *
 * @author Zoran Sevarac
 * @author Ivan Nedeljkovic
 * @author Dusica Milosevic
 * @author Kokanovic Rados
 * @author Karanovic Djordje
 * @author Ivkovic Marko
 */
public class TrainingDataFileDialog extends javax.swing.JDialog {

    private JFileChooser fileChooser = new JFileChooser();
    private int numOfInputs = 0;
    private int numOfOutputs = 0;
    private String separator = " ";
    DataSetTopComponent tsetTc;

    /** Creates new form TrainingDataFileDialog */
    public TrainingDataFileDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public TrainingDataFileDialog(int inputs, int outputs, DataSetTopComponent tsef) {
        this.numOfInputs = inputs;
        this.numOfOutputs = outputs;
        this.tsetTc = tsef;
        initComponents();
    }



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        separatorButtonGroup = new javax.swing.ButtonGroup();
        fieldPanel = new javax.swing.JPanel();
        chooseFileButton = new javax.swing.JButton();
        fileField = new javax.swing.JTextField();
        separatorSelect = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        loadButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(TrainingDataFileDialog.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setModal(true);
        setName("Form"); // NOI18N
        setResizable(false);

        fieldPanel.setName("fieldPanel"); // NOI18N

        chooseFileButton.setText(resourceMap.getString("chooseFileButton.text")); // NOI18N
        chooseFileButton.setName("chooseFileButton"); // NOI18N
        chooseFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileButtonActionPerformed(evt);
            }
        });

        fileField.setColumns(30);
        fileField.setText(resourceMap.getString("fileField.text")); // NOI18N
        fileField.setName("fileField"); // NOI18N

        separatorSelect.setName("separatorSelect"); // NOI18N
        separatorSelect.addItem(new ComboItem("space", " "));
        separatorSelect.addItem(new ComboItem("tab", "\t"));
        separatorSelect.addItem(new ComboItem(",", ","));
        separatorSelect.addItem(new ComboItem(";", ";"));

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        javax.swing.GroupLayout fieldPanelLayout = new javax.swing.GroupLayout(fieldPanel);
        fieldPanel.setLayout(fieldPanelLayout);
        fieldPanelLayout.setHorizontalGroup(
            fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fieldPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separatorSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fieldPanelLayout.createSequentialGroup()
                        .addComponent(fileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chooseFileButton)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        fieldPanelLayout.setVerticalGroup(
            fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseFileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(separatorSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(fieldPanel, java.awt.BorderLayout.CENTER);

        buttonPanel.setName("buttonPanel"); // NOI18N

        loadButton.setText(resourceMap.getString("loadButton.text")); // NOI18N
        loadButton.setName("loadButton"); // NOI18N
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(loadButton);

        cancelButton.setText(resourceMap.getString("cancelButton.text")); // NOI18N
        cancelButton.setName("cancelButton"); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(cancelButton);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileButtonActionPerformed
        chooseFile();
    }//GEN-LAST:event_chooseFileButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        loadFile();
    }//GEN-LAST:event_loadButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        cancel();
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TrainingDataFileDialog dialog = new TrainingDataFileDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public void cancel() {
        this.dispose();
    }

    public void chooseFile() {
        int option = this.fileChooser.showOpenDialog(this);

        if (option == JFileChooser.APPROVE_OPTION ) {
          File selectedFile = this.fileChooser.getSelectedFile();
          String  fileLocation = selectedFile.getPath();
          this.fileField.setText(fileLocation);
        }

    }

    public boolean checkBeforeLoad() {
        if (fileField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please choose the file to load!");
            return false;
    }

    return true;
  }

    public void loadFile() {
        if (!(checkBeforeLoad()))  return;

        // get file name
        String filePath = fileField.getText().trim();
        // get separator
        
        this.separator = ((ComboItem)separatorSelect.getSelectedItem()).getValue().toString();
        // load file
        try {
             DataSet trainingSet = TrainingSetImport.importFromFile(filePath, this.numOfInputs, this.numOfOutputs, this.separator);
             this.tsetTc.setTrainingSet(trainingSet);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "File not Found!");
        } catch(IOException ex) {
            JOptionPane.showMessageDialog(this, "Error loading file!");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid number format!");
        }

        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton chooseFileButton;
    private javax.swing.JPanel fieldPanel;
    private javax.swing.JTextField fileField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loadButton;
    private javax.swing.ButtonGroup separatorButtonGroup;
    private javax.swing.JComboBox separatorSelect;
    // End of variables declaration//GEN-END:variables

}
