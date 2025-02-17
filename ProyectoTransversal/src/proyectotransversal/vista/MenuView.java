package proyectotransversal.vista;

import javax.swing.JFrame;

/**
 *
 * @author Osman Herman
 * @author Ulises Perez
 * @author Nahuel Alegre
 * @author Nicolas Dominguez
 */
public class MenuView extends javax.swing.JFrame {

    /**
     * Creates new form MenuView
     */
    public MenuView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAlumno = new javax.swing.JMenu();
        itemAlumnos = new javax.swing.JMenuItem();
        menuMateria = new javax.swing.JMenu();
        itemMaterias = new javax.swing.JMenuItem();
        menuAdmin = new javax.swing.JMenu();
        menuInscripcciones = new javax.swing.JMenuItem();
        menuNotas = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuConsultasAlumnoMateria = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        menuAlumno.setText("Alumno");
        menuAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlumnoActionPerformed(evt);
            }
        });

        itemAlumnos.setText("Formulario de Alumno");
        itemAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlumnosActionPerformed(evt);
            }
        });
        menuAlumno.add(itemAlumnos);

        jMenuBar1.add(menuAlumno);

        menuMateria.setText("Materia");

        itemMaterias.setText("Formulario de Materia");
        itemMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMateriasActionPerformed(evt);
            }
        });
        menuMateria.add(itemMaterias);

        jMenuBar1.add(menuMateria);

        menuAdmin.setText("Administración");

        menuInscripcciones.setText("Inscripcciones");
        menuInscripcciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInscripccionesActionPerformed(evt);
            }
        });
        menuAdmin.add(menuInscripcciones);

        menuNotas.setText("Notas");
        menuNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNotasActionPerformed(evt);
            }
        });
        menuAdmin.add(menuNotas);

        jMenuBar1.add(menuAdmin);

        jMenu1.setText("Consultas");

        menuConsultasAlumnoMateria.setText("Alumnos por materia");
        menuConsultasAlumnoMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasAlumnoMateriaActionPerformed(evt);
            }
        });
        jMenu1.add(menuConsultasAlumnoMateria);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlumnosActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaAlumno alumno = new VistaAlumno();
        alumno.setVisible(true);
        escritorio.add(alumno);
    }//GEN-LAST:event_itemAlumnosActionPerformed

    private void menuAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAlumnoActionPerformed

    private void itemMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMateriasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaMateria materia = new VistaMateria();
        materia.setVisible(true);
        escritorio.add(materia);
    }//GEN-LAST:event_itemMateriasActionPerformed

    private void menuInscripccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInscripccionesActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaInscripccion vista = new VistaInscripccion();
        vista.setVisible(true);
        escritorio.add(vista);
    }//GEN-LAST:event_menuInscripccionesActionPerformed

    private void menuNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNotasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaNotas vista = new VistaNotas();
        vista.setVisible(true);
        escritorio.add(vista);
    }//GEN-LAST:event_menuNotasActionPerformed

    private void menuConsultasAlumnoMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultasAlumnoMateriaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaAlumnosPorMateria vista = new VistaAlumnosPorMateria();
        vista.setVisible(true);
        escritorio.add(vista);
    }//GEN-LAST:event_menuConsultasAlumnoMateriaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemAlumnos;
    private javax.swing.JMenuItem itemMaterias;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAdmin;
    private javax.swing.JMenu menuAlumno;
    private javax.swing.JMenuItem menuConsultasAlumnoMateria;
    private javax.swing.JMenuItem menuInscripcciones;
    private javax.swing.JMenu menuMateria;
    private javax.swing.JMenuItem menuNotas;
    // End of variables declaration//GEN-END:variables
}
