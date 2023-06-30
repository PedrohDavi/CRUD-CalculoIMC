
package VIEW;

import DAO.AlunoDAO;
import DTO.AlunoDTO;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;



public class CadastroAluno extends javax.swing.JFrame {

    public CadastroAluno() {
        initComponents();
        ListarValores();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtDataNascimento = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAluno = new javax.swing.JTable();
        btnCarregarCampos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        btnCalcularIMC = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Cadastro de Aluno");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Data de Nascimento:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Peso:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Altura:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        tabelaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Data de Nascimento", "Peso", "Altura","ID"
            }
        ));
        jScrollPane1.setViewportView(tabelaAluno);

        btnCarregarCampos.setText("Carregar campos");
        btnCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCamposActionPerformed(evt);
            }
        });

        jButton1.setText("Limpar");
        jButton1.setActionCommand("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel7.setText("ID:");

        txtId.setEnabled(false);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCalcularIMC.setText("Calcular");
        btnCalcularIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularIMCActionPerformed(evt);
            }
        });

        jLabel8.setText("IMC:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAltura))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPeso))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCarregarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)))))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(200, 200, 200))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcularIMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(jButton1)
                    .addComponent(btnAlterar)
                    .addComponent(btnCalcularIMC)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarregarCampos)
                    .addComponent(btnExcluir))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CadastrarAluno();
        ListarValores();
        LimparCampos();
        salvarArquivoTxt();
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCamposActionPerformed
        CarregarCampos();
    }//GEN-LAST:event_btnCarregarCamposActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       LimparCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ExcluirAluno();
        ListarValores();
        LimparCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        AlterarAluno();
        ListarValores();
        LimparCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCalcularIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularIMCActionPerformed
        CalcularIMC();
        LimparCampos();
    }//GEN-LAST:event_btnCalcularIMCActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCalcularIMC;
    private javax.swing.JButton btnCarregarCampos;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAluno;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
    
    private void ListarValores(){
        try {
            AlunoDAO objAlunoDao = new AlunoDAO();
            
            DefaultTableModel model = (DefaultTableModel) tabelaAluno.getModel();
            model.setNumRows(0);
            
            ArrayList<AlunoDTO> lista = objAlunoDao.PesquisarAluno();
            
            for(int num = 0; num < lista.size(); num++){
                model.addRow(new Object[]{
                    lista.get(num).getNome(),
                    lista.get(num).getCPF(),
                    lista.get(num).getDataNascimento(),
                    lista.get(num).getPeso(),
                    lista.get(num).getAltura(),
                    lista.get(num).getId()
                });
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Valores VIEW: " + erro);
        }
    }
    
    private void CarregarCampos(){
        int setar = tabelaAluno.getSelectedRow();
        txtNome.setText(tabelaAluno.getModel().getValueAt(setar, 0).toString());
        txtCPF.setText(tabelaAluno.getModel().getValueAt(setar, 1).toString());
        txtDataNascimento.setText(tabelaAluno.getModel().getValueAt(setar, 2).toString());
        txtPeso.setText(tabelaAluno.getModel().getValueAt(setar, 3).toString());
        txtAltura.setText(tabelaAluno.getModel().getValueAt(setar, 4).toString());
        txtId.setText(tabelaAluno.getModel().getValueAt(setar, 5).toString());
    }

    private void CadastrarAluno(){
        String nome, cpf,dataNascimentotxt;
        float  peso, altura;
        
        
        nome = txtNome.getText();
        cpf = txtCPF.getText();
        dataNascimentotxt = txtDataNascimento.getText();
        peso = Float.parseFloat(txtPeso.getText());
        altura = Float.parseFloat(txtAltura.getText());
        
        AlunoDTO objAlunoDto = new AlunoDTO();
        objAlunoDto.setNome(nome);
        objAlunoDto.setCPF(cpf);
        objAlunoDto.setDataNascimento(dataNascimentotxt);
        objAlunoDto.setPeso(peso);
        objAlunoDto.setAltura(altura);
        
        AlunoDAO objAlunoDao = new AlunoDAO();
        objAlunoDao.cadastrarAluno(objAlunoDto);
        
    }
    
    private void LimparCampos(){
        txtId.setText("");
        txtNome.setText("");
        txtCPF.setText("");
        txtDataNascimento.setText("");
        txtPeso.setText("");
        txtAltura.setText("");
        txtNome.requestFocus();
        }
    
    private void ExcluirAluno(){
        int id;
        id = Integer.parseInt(txtId.getText());
        
        AlunoDTO objAlunoDto = new AlunoDTO();
        objAlunoDto.setId(id);
        
        AlunoDAO objAlunoDAO = new AlunoDAO();
        objAlunoDAO.excluirAluno(objAlunoDto);
    }
    
    private void AlterarAluno(){
        int id;
        String nome, cpf, dataNascimentotxt; 
        float peso, altura;
        
        
        id = Integer.parseInt(txtId.getText());
        nome = txtNome.getText();
        cpf = txtCPF.getText();
        dataNascimentotxt = txtDataNascimento.getText();
        peso = Float.parseFloat(txtPeso.getText());
        altura = Float.parseFloat(txtAltura.getText());
        
        AlunoDTO objAlunoDto = new AlunoDTO();
        objAlunoDto.setId(id);
        objAlunoDto.setNome(nome);
        objAlunoDto.setCPF(cpf);
        objAlunoDto.setDataNascimento(dataNascimentotxt);
        objAlunoDto.setPeso(peso);
        objAlunoDto.setAltura(altura);
        
        AlunoDAO objAlunoDao = new AlunoDAO();
        objAlunoDao.alterarAluno(objAlunoDto);
    }
    
    private void CalcularIMC(){
        float peso, altura, imc;
        
        peso = Float.parseFloat(txtPeso.getText());
        altura = Float.parseFloat(txtAltura.getText());
        imc = peso / (altura*altura);
        
        String resultadoImc = String.format("%.2f", imc);
        
        if(imc <= 18.5){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + resultadoImc + "  Você está abaixo do Peso!");
            } if(imc >= 18.6 && imc <= 24.9){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + resultadoImc + "  Seu peso está normal.");
            } if(imc >= 25 && imc <= 29.9){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + resultadoImc + "  Você está levemente acima do peso!");
            } if(imc >= 30 && imc <= 34.9){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + resultadoImc + "  Você está com Obesidade Grau 1!");
            } if(imc >= 35 && imc <= 39.9){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + resultadoImc + "  Você está com Obesidade Severa!");
            } if(imc >= 40){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + resultadoImc + "  Você está com Obesidade Mórbida!!");}
    
    }
    
    private void salvarArquivoTxt(){
    


    File ArquivoTxt = new File("C:\\Users\\Pedro Davi\\OneDrive\\Área de Trabalho\\ADS 2°semestre\\Linguagem de Programação\\AlunoIMC.txt");


    AlunoDAO alunos = new AlunoDAO();
    ArrayList<AlunoDTO> alunosSet = alunos.PesquisarAluno();

    try  {
        
        FileWriter file = new FileWriter("C:\\Users\\Pedro Davi\\OneDrive\\Área de Trabalho\\ADS 2°semestre\\Linguagem de Programação\\AlunoIMC.txt");

        BufferedWriter fileWrite = new BufferedWriter(file);
        
        StringBuilder sb = new StringBuilder();
            for (AlunoDTO aluno : alunosSet) {

                sb.append(aluno);
                sb.append(System.lineSeparator());
                sb.append(System.lineSeparator());
            }
            String alunosString = sb.toString();

            fileWrite.write(alunosString);
        
         
        fileWrite.close();
        Desktop.getDesktop().open(ArquivoTxt);
        
    } catch (IOException e) {
        System.err.println("Erro ao salvar os dados do aluno no arquivo: " + e.getMessage());
    }
    }
  }

