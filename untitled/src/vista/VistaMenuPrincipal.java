package vista;

import control.ControlMenuPrincipal;

import javax.swing.*;

public class VistaMenuPrincipal extends JFrame {

    private static JDesktopPane escritorio = new JDesktopPane();

    public VistaMenuPrincipal() {

        super("Menu Principal");

        add(escritorio);

        setJMenuBar(getBarraMenu());

        setSize(600, 770);

        setResizable(false);

        setVisible(true);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private JMenuBar getBarraMenu() {

        //Declaramos la barra de menu
        var barraMenu = new JMenuBar();

        //Declaramos los menus disponibles que habra en el sistema
        var mSistema = new JMenu("Sistema");
        var mPasajeros = new JMenu("Pasajeros");
        var mConductores = new JMenu("Conductores");
        var mEmpleados = new JMenu("Empleados");
        var mViajes = new JMenu("Viajes");
        var mRutas = new JMenu("Rutas");
        var mNominas = new JMenu("Nomina");
        var mReportes = new JMenu("Reportes");

        //Declaramos las opciones que habra en el menu sistema
        var isSalir = new JMenuItem("Salir");

        isSalir.addActionListener(new ControlMenuPrincipal());

        //Declaramos las opciones que habra en el menu pasajeros
        var ipAlta = new JMenuItem("Alta de pasajero");
        var ipBaja = new JMenuItem("Baja de pasajero");
        var ipActua = new JMenuItem("Actualizar datos de pasajero");
        var ipMostra = new JMenuItem("Mostrar datos de pasajero");

        ipAlta.addActionListener(new ControlMenuPrincipal());
        ipBaja.addActionListener(new ControlMenuPrincipal());
        ipActua.addActionListener(new ControlMenuPrincipal());
        ipMostra.addActionListener(new ControlMenuPrincipal());

        //Declaramos las opciones que habra en los conductores
        var icAlta = new JMenuItem("Alta de conductor");
        var icBaja = new JMenuItem("Baja de conductor");
        var icActua = new JMenuItem("Actualizar datos de conductor");
        var icMostra = new JMenuItem("Mostrar datos de conductor");

        //Declaramos las opciones que habra en el menu empleados
        var ieAlta = new JMenuItem("Alta de empleado");
        var ieBaja = new JMenuItem("Baja de empleado");
        var ieActua = new JMenuItem("Actualizar datos de empleado");
        var ieMostra = new JMenuItem("Mostrar datos de empleado");

        //Declaramos las opciones que habra en el menu viajes
        var ivAlta = new JMenuItem("Alta del viaje");
        var ivBaja = new JMenuItem("Baja del viaje");
        var ivAct = new JMenuItem("Actualizar datos del viaje");
        var ivMostra = new JMenuItem("Mostrar datos del viaje");
        var ivReembolso = new JMenuItem("Reembolso");
        var ivTarifa = new JMenuItem("Tarifa");
        var ivCalculoReembolso = new JMenuItem("Calculo Reembolso");
        var ivCalculoTarifa = new JMenuItem("Calculo Tarifa");

        //Declaramos las opciones que habra en el menu rutas
        var irAlta = new JMenuItem("Alta de ruta");
        var irBaja = new JMenuItem("Baja de ruta");
        var irAct = new JMenuItem("Modificacion datos de ruta");
        var irMostra = new JMenuItem("Mostrar datos de ruta");

        //Declaramos las opciones que habra en el menu nomina
        var inPConductor = new JMenuItem("Pago a conductor");
        var inPEmpleado = new JMenuItem("Pago a empleado");

        //Declaramos las opciones que habra en el menu reportes
        var irSemanalViajes = new JMenuItem("Reporte semanal de viajes");
        var irSemanalPagos = new JMenuItem("Reporte semanal de pagos");
        var irMensualGanancias = new JMenuItem("Reporte mensual de ganancias");
        var irExtraordinarioPagos = new JMenuItem("Reporte extraordinario de pagos");
        var irExtraordinarioGanancias = new JMenuItem("Reporte extraordinario de ganancias");

        mSistema.add(isSalir);

        mPasajeros.add(ipAlta);
        mPasajeros.add(ipActua);
        mPasajeros.add(ipMostra);
        mPasajeros.add(ipBaja);

        mConductores.add(icAlta);
        mConductores.add(icActua);
        mConductores.add(icMostra);
        mConductores.add(icBaja);

        mEmpleados.add(ieAlta);
        mEmpleados.add(ieActua);
        mEmpleados.add(ieMostra);
        mEmpleados.add(ieBaja);

        mViajes.add(ivAlta);
        mViajes.add(ivAct);
        mViajes.add(ivMostra);
        mViajes.add(ivBaja);
        mViajes.add(ivReembolso);
        mViajes.add(ivTarifa);
        mViajes.add(ivCalculoReembolso);
        mViajes.add(ivCalculoTarifa);

        mRutas.add(irAlta);
        mRutas.add(irAct);
        mRutas.add(irMostra);
        mRutas.add(irBaja);

        mNominas.add(inPConductor);
        mNominas.add(inPEmpleado);

        mReportes.add(irSemanalViajes);
        mReportes.add(irSemanalPagos);
        mReportes.add(irMensualGanancias);
        mReportes.add(irExtraordinarioPagos);
        mReportes.add(irExtraordinarioGanancias);

        barraMenu.add(mSistema);
        barraMenu.add(mPasajeros);
        barraMenu.add(mConductores);
        barraMenu.add(mEmpleados);
        barraMenu.add(mViajes);
        barraMenu.add(mRutas);
        barraMenu.add(mNominas);
        barraMenu.add(mReportes);

        return barraMenu;

    }

    public static JDesktopPane getEscritorio() {

        return escritorio;

    }

}