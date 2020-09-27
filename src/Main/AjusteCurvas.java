/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Datos.Expresion;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Datos.Mtd_AC;
import java.awt.BorderLayout;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author carlo
 */
public class AjusteCurvas extends javax.swing.JFrame {

    /**
     * Creates new form AjusteCurvas
     */
    DefaultTableModel modelo;

    private XYDataset generarDatos(String eq, int r, double[] x2, double[] y,int eje) throws Exception {
        //le pasamos una funcion generadora f(x)

        XYSeries datos = new XYSeries("Linea Funcion");
        for (double x = 0; x <= eje; x += 1) {
            datos.add(x, f(x, eq));
        }

        XYSeries serie3 = new XYSeries("Serie 3");
        for (int x = 0; x <= r; x += 1) {
            serie3.add(x2[x], y[x]);

        }

        XYSeriesCollection conjuntoDatos = new XYSeriesCollection();
        conjuntoDatos.addSeries(datos);
        conjuntoDatos.addSeries(serie3);

        return conjuntoDatos;
    }
    
    private XYDataset generarDatoslog(String eq, int r, double[] x2, double[] y,int eje) throws Exception {
        //le pasamos una funcion generadora f(x)

        XYSeries datos = new XYSeries("Linea Funcion");
        for (double x = 1; x <= eje; x += 1) {
            datos.add(x, f(x, eq));
        }

        XYSeries serie3 = new XYSeries("Serie 3");
        for (int x = 0; x <= r; x += 1) {
            serie3.add(x2[x], y[x]);

        }

        XYSeriesCollection conjuntoDatos = new XYSeriesCollection();
        conjuntoDatos.addSeries(datos);
        conjuntoDatos.addSeries(serie3);

        return conjuntoDatos;
    }
    

    private XYDataset generarDatos(String eq, int r) throws Exception {
        //le pasamos una funcion generadora f(x)
        XYSeries datos = new XYSeries("Linea Funcion");
        for (double x = 0; x <= r; x += 1) {
            datos.add(x, f(x, eq));
        }

        XYSeriesCollection conjuntoDatos = new XYSeriesCollection();
        conjuntoDatos.addSeries(datos);

        return conjuntoDatos;
    }

    

    private JFreeChart crearDiagrama(XYDataset conjuntoDatos) throws IOException {
        JFreeChart diag = ChartFactory.createXYLineChart(
                null, //Titulo Grafica
                "X", // Leyenda eje X
                "Y", // Leyenda eje Y
                conjuntoDatos, // Los datos
                PlotOrientation.VERTICAL, //orientacion
                false, // ver titulo de linea
                true, //tooltips
                false //URL
        );
        XYPlot xyplot = (XYPlot) diag.getPlot();
        xyplot.setBackgroundPaint(Color.white);
        xyplot.setDomainGridlinePaint(Color.white);
        xyplot.setRangeGridlinePaint(Color.white);
        xyplot.setRangeZeroBaselineVisible(true);
        xyplot.setDomainZeroBaselineVisible(true);
        xyplot.setOutlinePaint(Color.WHITE);
        XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) xyplot.getRenderer();
        renderer.setSeriesLinesVisible(1, false);
        renderer.setSeriesShapesVisible(1, true);
        return diag;
    }

    //aqui definimos la funcion que desees, en esta caso la f(x) = 4sen(x)
    private double f(double x, String eq) throws Exception {
        Expresion e = new Expresion();
        double a = e.Evaluar(eq, x);
        return a;
    }

    public double[] captura(int a) {

        double[] column = new double[tabla.getRowCount()];
        int i = 0;
        do {
            column[i] = Double.parseDouble(modelo.getValueAt(i, a).toString());

            i++;
        } while (i != tabla.getRowCount());
        return column;

    }
    int cont = 0;
    public ChartPanel chartPanel;

    public AjusteCurvas() throws Exception {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.white);
        modelo = new DefaultTableModel();
        modelo.addColumn("X");
        modelo.addColumn("Y");
        tabla.setModel(modelo);
        rsscalelabel.RSScaleLabel.setScaleLabel(btn_equal, "src/assets/icon_equal.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(btn_max, "src/assets/icon_max.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(btn_min, "src/assets/icon_min.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(eq, "src/assets/eq_lineal.png");

        grado.setVisible(false);
        jLabel2.setVisible(false);
        grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"2", "3", "4", "5"}));
        op_ac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Lineal", "Polinomica", "Exponencial", "Logaritmica", "Potencial"}));
        XYDataset paresDeDatos = generarDatos("x", 0);
        JFreeChart diagrama = crearDiagrama(paresDeDatos);
        chartPanel = new ChartPanel(diagrama);
        grafica.setLayout(new java.awt.BorderLayout());
        grafica.add(chartPanel, BorderLayout.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        op_ac = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        grado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btn_equal = new javax.swing.JLabel();
        grafica = new javax.swing.JPanel();
        btn_min = new javax.swing.JLabel();
        btn_max = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        A0 = new javax.swing.JLabel();
        eq = new javax.swing.JLabel();
        n = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(23, 17, 256, 500);

        op_ac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        op_ac.setBorder(null);
        op_ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_acActionPerformed(evt);
            }
        });
        getContentPane().add(op_ac);
        op_ac.setBounds(20, 569, 149, 26);

        jLabel1.setText("Seleccione la linea de tendencia que desea");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 535, 244, 16);

        grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(grado);
        grado.setBounds(20, 640, 65, 26);

        jLabel2.setText("Grado:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 610, 37, 16);

        btn_equal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_equalMouseClicked(evt);
            }
        });
        getContentPane().add(btn_equal);
        btn_equal.setBounds(219, 569, 60, 60);

        javax.swing.GroupLayout graficaLayout = new javax.swing.GroupLayout(grafica);
        grafica.setLayout(graficaLayout);
        graficaLayout.setHorizontalGroup(
            graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 895, Short.MAX_VALUE)
        );
        graficaLayout.setVerticalGroup(
            graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(grafica);
        grafica.setBounds(331, 17, 895, 500);

        btn_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minMouseClicked(evt);
            }
        });
        getContentPane().add(btn_min);
        btn_min.setBounds(285, 85, 40, 40);

        btn_max.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_maxMouseClicked(evt);
            }
        });
        getContentPane().add(btn_max);
        btn_max.setBounds(285, 27, 40, 40);

        A1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(A1);
        A1.setBounds(330, 610, 100, 30);

        A0.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(A0);
        A0.setBounds(330, 550, 100, 30);

        eq.setMaximumSize(new java.awt.Dimension(40, 15));
        eq.setMinimumSize(new java.awt.Dimension(40, 15));
        eq.setPreferredSize(new java.awt.Dimension(40, 15));
        getContentPane().add(eq);
        eq.setBounds(881, 540, 350, 170);

        n.setText("0");
        getContentPane().add(n);
        n.setBounds(290, 140, 60, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_maxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maxMouseClicked
        String add[] = {"", ""};
        modelo.addRow(add);// TODO add your handling code here:
        cont++;
        n.setText("" + cont);
    }//GEN-LAST:event_btn_maxMouseClicked

    private void btn_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseClicked
        int a = modelo.getRowCount();
        if (cont != 0) {
            cont--;
            modelo.removeRow(a - 1);
            n.setText("" + cont);
        }
    }//GEN-LAST:event_btn_minMouseClicked

    private void op_acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_acActionPerformed
        if (op_ac.getSelectedItem().equals("Polinomica")) {
            jLabel2.setVisible(true);
            grado.setVisible(true);
        } else if (op_ac.getSelectedItem().equals("Lineal")) {
            rsscalelabel.RSScaleLabel.setScaleLabel(eq, "src/assets/eq_lineal.png");
        } else if (op_ac.getSelectedItem().equals("Exponencial")) {
            rsscalelabel.RSScaleLabel.setScaleLabel(eq, "src/assets/eq_exp.png");
        } else if (op_ac.getSelectedItem().equals("Logaritmica")) {
            rsscalelabel.RSScaleLabel.setScaleLabel(eq, "src/assets/eq_log.png");
        } else if (op_ac.getSelectedItem().equals("Potencial")) {
            rsscalelabel.RSScaleLabel.setScaleLabel(eq, "src/assets/eq_pot.png");
        }
        if (op_ac.getSelectedItem().equals("Polinomica")) {
            jLabel2.setVisible(true);
            grado.setVisible(true);
        } else {
            jLabel2.setVisible(false);
            grado.setVisible(false);
        }
    }//GEN-LAST:event_op_acActionPerformed

    private void btn_equalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_equalMouseClicked
        try {
            Mtd_AC ac = new Mtd_AC();
            double[] x = captura(0);
            double[] y = captura(1);
            int eje = (int) Double.parseDouble(modelo.getValueAt(tabla.getRowCount() - 1, 0).toString());
            switch (op_ac.getSelectedIndex() + 1) {
                case 1:
                    double[] res = ac.A_Lineal(x, y);
                    String lineal = "(" + res[0] + ")+(" + res[1] + ")*x";
                    A0.setText("A0=" + res[0]);
                    A1.setText("A1=" + res[1]);
                    XYDataset paresDeDatos = generarDatos(lineal, (x.length - 1), x, y,eje);
                    JFreeChart diagrama = crearDiagrama(paresDeDatos);
                    chartPanel.setChart(diagrama);
                    break;
                case 2:
                    break;
                case 3:
                    double[] res3 = ac.A_Exp(x, y);
                    String exp = "(" + res3[0] + ")*exp((" + res3[1] + ")*x)";
                    A0.setText("A0=" + res3[0]);
                    A1.setText("A1=" + res3[1]);
                    XYDataset paresDeDatos3 = generarDatos(exp, (x.length - 1), x, y,eje);
                    JFreeChart diagrama3 = crearDiagrama(paresDeDatos3);
                    chartPanel.setChart(diagrama3);
                    break;
                case 4:
                    double[] res4 = ac.A_Log(x, y);
                    A0.setText("A0=" + res4[0]);
                    A1.setText("A1=" + res4[1]);
                    String log = "(" + res4[0] + ")+(" + res4[1] + ")*log(x)";
                    XYDataset paresDeDatos4 = generarDatoslog(log, (x.length - 1), x, y,eje);
                    JFreeChart diagrama4 = crearDiagrama(paresDeDatos4);
                    chartPanel.setChart(diagrama4);
                    break;
                case 5:
                    double[] res5 = ac.A_Pot(x, y);
                    String pot = "(" + res5[0] + ")*(x^(" + res5[1] + "))";
                    A0.setText("A0=" + res5[0]);
                    A1.setText("A1=" + res5[1]);
                    XYDataset paresDeDatos5 = generarDatos(pot, (x.length - 1), x, y,eje);
                    JFreeChart diagrama5 = crearDiagrama(paresDeDatos5);
                    chartPanel.setChart(diagrama5);
                    break;
            }
        } catch (Exception ex) {
            Logger.getLogger(Raices.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ha habido un error en la muestra de los datos");
        }
    }//GEN-LAST:event_btn_equalMouseClicked

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
            java.util.logging.Logger.getLogger(AjusteCurvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjusteCurvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjusteCurvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjusteCurvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AjusteCurvas().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(AjusteCurvas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A0;
    private javax.swing.JLabel A1;
    private javax.swing.JLabel btn_equal;
    private javax.swing.JLabel btn_max;
    private javax.swing.JLabel btn_min;
    private javax.swing.JLabel eq;
    private javax.swing.JComboBox<String> grado;
    private javax.swing.JPanel grafica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel n;
    private javax.swing.JComboBox<String> op_ac;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
