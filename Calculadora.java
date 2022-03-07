
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Jose Oswaldo
 */
public class Calculadora extends JFrame{
    JLabel ettitulo;
    JPanel panel;
    JTextField pantalla;
    JButton btnBorrar, btnPor, btnDiv, btnRaiz, btn7, btn8, btn9, btnSuma, btn4, btn5, btn6, btnResta, btn1, btn2, btn3, btnIgual, btn0, btnPunto;
    public float num1 = 0, num2 = 0;
    public String operador = ""; 
    public boolean identificador;
    public Calculadora(){
        iniciarComponentes();
        
    }
    public void iniciarComponentes(){
        this.setSize(317, 450);
        this.setTitle("Calculadora");
        this.setMaximumSize(new Dimension(200,200));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Panel
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.lightGray);
        this.getContentPane().add(panel);
        
        //Etiquetas 
        //Equiqueta 1 Titulo
        ettitulo = new JLabel();
        ettitulo.setLayout(null);
        ettitulo.setText("Calculadora Básica");
        ettitulo.setBackground(Color.white);
        ettitulo.setBounds(70, 10, 150, 20);
        ettitulo.setHorizontalAlignment(SwingConstants.CENTER);
        ettitulo.setFont(new Font("arial", 0, 17));
        panel.add(ettitulo);
        
        //TextField - Pantalla
        pantalla = new JTextField();
        pantalla.setBounds(20, 40, 259, 50);
        pantalla.setFont(new Font("arial", 0, 20));
        pantalla.setEditable(false);
        panel.add(pantalla);
        
        //Botones 
        btnBorrar = new JButton();
        btnBorrar.setText("C");
        btnBorrar.setBackground(Color.DARK_GRAY);
        btnBorrar.setForeground(Color.white);
        btnBorrar.setBounds(20, 100, 50, 40);
        panel.add(btnBorrar);
        btnBorrar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        btnBorrarActionPerdormed(evt);
        }
        });
        
        
        btnPor = new JButton();
        btnPor.setText("x");
        btnPor.setBackground(Color.DARK_GRAY);
        btnPor.setForeground(Color.white);
        btnPor.setBounds(90, 100, 50, 40);
        panel.add(btnPor);
        btnPor.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        btnPorActionPerdormed(evt);
        }
        });
        

        btnDiv = new JButton();
        btnDiv.setText("/");
        btnDiv.setBackground(Color.DARK_GRAY);
        btnDiv.setForeground(Color.white);
        btnDiv.setBounds(160, 100, 50, 40);
        panel.add(btnDiv);
        btnDiv.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        btnDivActionPerdormed(evt);
        }
        });
        

        btn7 = new JButton();
        btn7.setText("7");
        btn7.setBackground(Color.DARK_GRAY);
        btn7.setForeground(Color.white);
        btn7.setBounds(20, 160, 50, 40);
        panel.add(btn7);
        btn7.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        btn7ActionPerdormed(evt);
        }
        });
        

        btn8 = new JButton();
        btn8.setText("8");
        btn8.setBackground(Color.DARK_GRAY);
        btn8.setForeground(Color.white);
        btn8.setBounds(90, 160, 50, 40);
        panel.add(btn8);
        btn8.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        btn8ActionPerdormed(evt);
        }
        });
        

        btn9 = new JButton();
        btn9.setText("9");
        btn9.setBackground(Color.DARK_GRAY);
        btn9.setForeground(Color.white);
        btn9.setBounds(160, 160, 50, 40);
        panel.add(btn9);
        btn9.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        btn9ActionPerdormed(evt);
        }
        });
        

        btnSuma = new JButton();
        btnSuma.setText("+");
        btnSuma.setBackground(Color.DARK_GRAY);
        btnSuma.setForeground(Color.white);
        btnSuma.setBounds(230, 160, 50, 100);
        panel.add(btnSuma);
        btnSuma.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        btnSumaActionPerdormed(evt);
        }
        });
        

        btn4 = new JButton();
        btn4.setText("4");
        btn4.setBackground(Color.DARK_GRAY);
        btn4.setForeground(Color.white);
        btn4.setBounds(20, 220, 50, 40);
        panel.add(btn4);
        btn4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        btn4ActionPerdormed(evt);
        }
        });

        btn5 = new JButton();
        btn5.setText("5");
        btn5.setBackground(Color.DARK_GRAY);
        btn5.setForeground(Color.white);
        btn5.setBounds(90, 220, 50, 40);
        panel.add(btn5);       
        btn5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        btn5ActionPerdormed(evt);
        }
        });

        btn6 = new JButton();
        btn6.setText("6");
        btn6.setBackground(Color.DARK_GRAY);
        btn6.setForeground(Color.white);
        btn6.setBounds(160, 220, 50, 40);
        panel.add(btn6); 
        btn6.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        btn6ActionPerdormed(evt);
        }
        });

        btnResta = new JButton();
        btnResta.setText("-");
        btnResta.setBackground(Color.DARK_GRAY);
        btnResta.setForeground(Color.white);
        btnResta.setBounds(230, 100, 50, 40);
        panel.add(btnResta);
        btnResta.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        btnRestaActionPerdormed(evt);
        }
        });

        btn1 = new JButton();
        btn1.setText("1");
        btn1.setBackground(Color.DARK_GRAY);
        btn1.setForeground(Color.white);
        btn1.setBounds(20, 280, 50, 40);
        panel.add(btn1);
        btn1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        btn1ActionPerdormed(evt);
        }
        });

        btn2 = new JButton();
        btn2.setText("2");
        btn2.setBackground(Color.DARK_GRAY);
        btn2.setForeground(Color.white);
        btn2.setBounds(90, 280, 50, 40);
        panel.add(btn2);
        btn2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        btn2ActionPerdormed(evt);
        }
        });
        

        btn3 = new JButton();
        btn3.setText("3");
        btn3.setBackground(Color.DARK_GRAY);
        btn3.setForeground(Color.white);
        btn3.setBounds(160, 280, 50, 40);
        panel.add(btn3);
        btn3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        btn3ActionPerdormed(evt);
        }
        });

        btnIgual = new JButton();
        btnIgual.setText("=");
        btnIgual.setBackground(Color.DARK_GRAY);
        btnIgual.setForeground(Color.white);
        btnIgual.setBounds(230, 280, 50, 100);
        panel.add(btnIgual);
        btnIgual.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        btnIgualActionPerdormed(evt);
        }
        });

        btn0 = new JButton();
        btn0.setText("0");
        btn0.setBackground(Color.DARK_GRAY);
        btn0.setForeground(Color.white);
        btn0.setBounds(20, 340, 120, 40);
        panel.add(btn0);
        btn0.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        btn0ActionPerdormed(evt);
        }
        });

        btnPunto = new JButton();
        btnPunto.setText(".");
        btnPunto.setBackground(Color.DARK_GRAY);
        btnPunto.setForeground(Color.white);
        btnPunto.setBounds(160, 340, 50, 40);
        panel.add(btnPunto);  
        btnPunto.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        btnPuntoActionPerdormed(evt);
        }
        });
    } 
    private void btn0ActionPerdormed(ActionEvent evt){
        pantalla.setText(this.pantalla.getText()+"0");
    }
    private void btn1ActionPerdormed(ActionEvent evt){
        pantalla.setText(this.pantalla.getText()+"1");
    }
    private void btn2ActionPerdormed(ActionEvent evt){
        pantalla.setText(this.pantalla.getText()+"2");
    }
    private void btn3ActionPerdormed(ActionEvent evt){
        pantalla.setText(this.pantalla.getText()+"3");
    }
    private void btn4ActionPerdormed(ActionEvent evt){
        pantalla.setText(this.pantalla.getText()+"4");
    }
    private void btn5ActionPerdormed(ActionEvent evt){
        pantalla.setText(this.pantalla.getText()+"5");
    }
    private void btn6ActionPerdormed(ActionEvent evt){
        pantalla.setText(this.pantalla.getText()+"6");
    }
    private void btn7ActionPerdormed(ActionEvent evt){
        pantalla.setText(this.pantalla.getText()+"7");
    }
    private void btn8ActionPerdormed(ActionEvent evt){
        pantalla.setText(this.pantalla.getText()+"8");
    }
    private void btn9ActionPerdormed(ActionEvent evt){
        pantalla.setText(this.pantalla.getText()+"9");
    }
    private void btnBorrarActionPerdormed(ActionEvent evt){
        pantalla.setText("");
    }
    private void btnPorActionPerdormed(ActionEvent evt){
        try{
            this.num1=Float.parseFloat(this.pantalla.getText());
            this.operador = "*";
            this.pantalla.setText("");
        }catch(Exception e){
            this.pantalla.setText("SyntaxError");
        }
         
    }
    private void btnDivActionPerdormed(ActionEvent evt){
        try{
            this.num1=Float.parseFloat(this.pantalla.getText());
            this.operador = "/";
            this.pantalla.setText("");  
        }catch(Exception e){
            this.pantalla.setText("SyntaxError");
        }
    }
    
    private void btnSumaActionPerdormed(ActionEvent evt){
        try{
            this.num1=Float.parseFloat(this.pantalla.getText());
            this.operador = "+";
            this.pantalla.setText("");
        }catch(Exception e){
            this.pantalla.setText("SyntaxError");
        }

    }
    private void btnRestaActionPerdormed(ActionEvent evt){
        try{
            this.num1=Float.parseFloat(this.pantalla.getText());
            this.operador = "-";
            this.pantalla.setText(""); 
        }catch(Exception e){
            pantalla.setText("SyntaxError");
        }

    }
    private void btnIgualActionPerdormed(ActionEvent evt){
        try{
        this.num2=Float.parseFloat(this.pantalla.getText());
            switch(operador){
                case "+":
                    this.pantalla.setText(sincero(this.num1+this.num2));
                    break;
                case "-":
                    this.pantalla.setText(sincero(this.num1-this.num2));
                    break;
                case "*":
                    this.pantalla.setText(sincero(this.num1*this.num2));
                    break;
                case "/":
                    if(this.num2==0){
                        this.pantalla.setText("No se puede bro");
                    }else{
                        this.pantalla.setText(sincero(this.num1/this.num2));
                    }
                    break;   
            }
        }catch(Exception e){
            this.pantalla.setText("SyntaxError");
        }        

    }
    private void btnPuntoActionPerdormed(ActionEvent evt){
        if(!this.pantalla.getText().contains(".")){
            pantalla.setText(this.pantalla.getText()+"."); 
        }
    }
    public String sincero(float resultado){
        String retorno = "";
        retorno = Float.toString(resultado);
        if (resultado%1==0){
            retorno = retorno.substring(0, retorno.length()-2);
        }
        return retorno;
    }
    public boolean verificador(String operador){
        boolean veri = false;
        try{
            this.num1=Float.parseFloat(operador);
        }catch(Exception e){
            veri = true;
        }
        return veri;
    }
}
