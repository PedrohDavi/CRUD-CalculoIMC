
package DTO;

import java.time.LocalDate;

public class AlunoDTO {
    
    private int id;
    private String CPF;
    private String Nome;
    private String DataNascimento;
    private float Peso;
    private float Altura;

 
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

   
    public String getNome() {
        return Nome;
    }


    public void setNome(String Nome) {
        this.Nome = Nome;
    }


    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }


    public float getPeso() {
        return Peso;
    }


    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getId() {
        return id;
    }

  
    public void setId(int id) {
        this.id = id;
    }

    
    public float calcularIMC(float Peso,  float Altura) {
        float imc;
        imc = (float) (Peso/(Altura * Altura));

        return imc;
    }
    
    public String classificarIMC(float imc) {
        String StringIMC;
        if (imc < 18.5) {
            StringIMC = "Baixo Peso";
        } else if (imc >= 18.5 & imc < 24.9) {
            StringIMC = "Peso Normal";
        } else if (imc >= 24.9 & imc < 29.9) {
            StringIMC = "Excesso de Peso";
        } else if (imc >= 29.9 & imc < 34.9) {
            StringIMC = "Obesidade Classe 1";
        } else if (imc >= 34.9 & imc < 39.9) {
            StringIMC = "Obesidade Classe 2";
        } else {
            StringIMC = "Obesidade Classe 3";
        }
    return StringIMC;
}
    
        @Override
        public String toString() {
        return "Aluno: " + Nome + ", CPF= " + CPF + ", ID= " + id + ", Data de Nascimento= " + DataNascimento +
               ", Peso=" + Peso + ", Altura= " + Altura + ", IMC= " + this.calcularIMC(Peso, Altura) + 
                ", Classificação: " + this.classificarIMC(this.calcularIMC(Peso, Altura))+ "]" ;
    }
}
