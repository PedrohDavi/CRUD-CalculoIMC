package DAO;

import DTO.AlunoDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;


public class AlunoDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs; 
    ArrayList<AlunoDTO> lista = new ArrayList<>();
    
    public void cadastrarAluno(AlunoDTO objAlunoDto){
    String sql ="INSERT INTO Aluno(CPF, Nome, DataNascimento, Peso, Altura) VALUES (?, ?, ?, ?, ?);";
        
    conn = new ConexaoDAO().conectaBD();
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objAlunoDto.getCPF());
            pstm.setString(2, objAlunoDto.getNome());
            pstm.setString(3, objAlunoDto.getDataNascimento());
            pstm.setFloat(4, objAlunoDto.getPeso());
            pstm.setFloat(5, objAlunoDto.getAltura());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "AlunoDAO Cadastrar" + erro);
        }
        
    }
    
    public ArrayList<AlunoDTO> PesquisarAluno(){
        
        String sql = "select * from Aluno";
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                AlunoDTO objAlunoDto = new AlunoDTO();
                objAlunoDto.setId(rs.getInt("id"));
                objAlunoDto.setNome(rs.getString("Nome"));
                objAlunoDto.setCPF(rs.getString("CPF"));
                objAlunoDto.setDataNascimento(rs.getString("DataNascimento"));
                objAlunoDto.setPeso(rs.getFloat("Peso"));
                objAlunoDto.setAltura(rs.getFloat("Altura"));
                
                lista.add(objAlunoDto);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AlunoDAO Pesquisar:" + erro);
        }
        return lista;
    }
    
    public void excluirAluno(AlunoDTO objAlunoDto){
    
        String sql = "delete from Aluno where id = ?";
        
        conn = new ConexaoDAO().conectaBD();
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objAlunoDto.getId());
           
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "AlunoDAO Excluir" + erro);
        }
        
    }
    
    public void alterarAluno(AlunoDTO objAlunoDto){
    
        String sql = "update Aluno set CPF = ?, Nome = ?, DataNascimento = ?, Peso = ?, Altura = ? where id = ?";
        
        conn = new ConexaoDAO().conectaBD();
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objAlunoDto.getCPF());
            pstm.setString(2, objAlunoDto.getNome());
            pstm.setString(3, objAlunoDto.getDataNascimento());
            pstm.setFloat(4, objAlunoDto.getPeso());
            pstm.setFloat(5, objAlunoDto.getAltura());
            pstm.setInt(6, objAlunoDto.getId());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "AlunoDAO Alterar" + erro);
        }
    
    }
    
}
