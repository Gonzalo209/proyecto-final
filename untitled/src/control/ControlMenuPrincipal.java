package control;

import vista.VistaMenuPrincipal;
import vista.VistaPasajero;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlMenuPrincipal implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent evento) {

        var menu = evento.getActionCommand();

        switch (menu) {

            case "Alta de pasajero" -> VistaMenuPrincipal.getEscritorio().add(new VistaPasajero());
            case "Baja de pasajero" -> System.out.println("Baja");
            case "Actualizar datos de pasajero" -> System.out.println("Actualizar");
            case "Mostrar datos de pasajero" -> System.out.println("Mostrar");
            case "Salir" -> System.exit(0);

        }

    }

}