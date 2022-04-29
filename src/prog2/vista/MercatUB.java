package prog2.vista;
import prog2.adaptador.*;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Class that handles menu
 * Connects to adaptador.java
 * @author eshaan
 * @author alex
 */
public class MercatUB {
    private Adaptador adaptador;

    /**
     * Starts menu
     */
    public void gestioMercatUB() throws MercatException {
        Scanner sc = new Scanner(System.in);
        adaptador = new Adaptador();
        gestioMenu(sc);
    }

    /**
     * Main menu options
     */
    private static enum MENU_OPTIONS {
        M_Opcion_1_GestioArticles,
        M_Opcion_2_GestioClient,
        M_Opcion_3_GestioComandes,
        M_Opcion_4_GuardarDades,
        M_Opcion_5_CarregaDades,
        M_Opcion_6_Sortir
    }

    /**
     * Article menu options
     */
    private static enum ARTICLE_OPTIONS {
        M_Opcion_1_AfegirArticle,
        M_Opcion_2_VisualitzarArticles,
        M_Opcion_3_Sortir
    }

    /**
     * Client menu options
     */
    private static enum CLIENT_OPTIONS {
        M_Opcion_1_AfegirClient,
        M_Opcion_2_VisualitzarClients,
        M_Opcion_3_Sortir
    }

    /**
     * Order menu options
     */
    private static enum ORDER_OPTIONS {
        M_Opcion_1_AfegirComanda,
        M_Opcion_2_EsborrarComanda,
        M_Opcion_3_VisualitzarComanda,
        M_Opcion_4_VisualitzarComandaUrgent,
        M_Opcion_5_Sortir
    }

    /**
     * File menu options
     */
    private static enum FILE_OPTIONS {
        M_Opcion_1_Articles,
        M_Opcion_2_Clients,
        M_opcions_3_Comandes
    }

    /**
     * Main menu text
     */
    private static final String[] mainMenu = {
            "Gestio articles", //Option 1
            "Gestio clients",  //Option 2
            "Gestio comandes", //Option 3
            "Guardar dades",   //Option 4
            "Carrega dades",   //Option 5
            "Sortir"           //Option 6
    };

    /**
     * Article menu text
     */
    private static final String[] articleMenu = {
            "Afegir articles",      //Option 1
            "Visualitzar articles", //Option 2
            "Sortir"                //Option 3
    };

    /**
     * Client menu text
     */
    private static final String[] clientMenu = {
            "Afegir client",      //Option 1
            "Visualitzar client", //Option 2
            "Sortir"              //Option 3
    };

    /**
     * Order menu text
     */
    private static final String[] orderMenu = {
            "Afegir comanda",               //Option 1
            "Esborrar comanda",             //Option 2
            "Visualitzar comanda",          //Option 3
            "Visualitzar comandes urgents", //Option 4
            "Sortir"                        //Option 5
    };

    private static final String[] fileMenu = {
            "Articles",
            "Clientes",
            "Comandes"
    };

    /**
     * Asks for article info
     * Passes info to Adaptador.java
     * @param sc
     * @throws MercatException
     */
    private void addArticle(Scanner sc) throws MercatException {
        System.out.print("Identificador del articulo: "); String identifier = sc.nextLine();
        System.out.print("Nombre del articulo: "); String name = sc.nextLine();
        System.out.print("Precio del articulo: "); float price = sc.nextFloat(); sc.nextLine();
        System.out.print("Enviament Urgente(True/False): "); boolean priority = sc.nextBoolean();
        System.out.print("Tiempo para enviar: "); int time = sc.nextInt(); sc.nextLine();
        adaptador.afegirArticle(identifier, name, price, time, priority);
    }

    /**
     * Asks for Client info
     * Passes info to Adaptador.java
     * @param sc
     * @throws MercatException
     */
    private void addClient(Scanner sc) throws MercatException {
        System.out.print("Email del cliente: "); String email = sc.nextLine();
        System.out.print("Nombre del cliente: "); String name = sc.nextLine();
        System.out.print("Direccion del cliente: "); String address = sc.nextLine();
        System.out.print("Cliente Premium(True/False): "); boolean premium = sc.nextBoolean();
        adaptador.afegirClient(email, name, address, premium);
    }

    /**
     * Asks for order info
     * Passes info to Adaptador.java
     * @param sc
     * @throws MercatException
     */
    private void addOrder(Scanner sc) throws MercatException {
        System.out.print("Posicion del articulo: "); int posA = sc.nextInt(); sc.nextLine();
        System.out.print("Posicion del cliente: "); int posC = sc.nextInt(); sc.nextLine();
        System.out.print("Cantidad: "); int quantity = sc.nextInt(); sc.nextLine();
        System.out.print("Pedido Urgente(True/False): "); boolean urgent = sc.nextBoolean();
        posA--; posC--;
        adaptador.afegirComanda(posA, posC, quantity, urgent);
    }

    /**
     * Asks for position order to delete
     * Passes position to Adaptador.java
     * @param sc
     * @throws MercatException
     */
    private void delOrder(Scanner sc) throws MercatException {
        System.out.print("Posicion de pedido que quieres borrar: ");
        int pos = sc.nextInt(); sc.nextLine();
        adaptador.esborrarComanda(pos);
        System.out.println("Pedido borrado");
    }

    /**
     * Calls menus
     * @param sc
     * @throws MercatException
     */
    public void gestioMenu(Scanner sc) throws MercatException {
        Menu menu = new Menu<>("Menu Principal", MENU_OPTIONS.values());
        menu.setDescripcions(mainMenu);

        MENU_OPTIONS mainOption = null;
        ARTICLE_OPTIONS aOption = null;
        CLIENT_OPTIONS cOption = null;
        ORDER_OPTIONS oOption = null;
        FILE_OPTIONS fOption = null;
        do {
            try{
                menu.mostrarMenu();
                mainOption = (MENU_OPTIONS) menu.getOpcio(sc);

                switch (mainOption){
                    case M_Opcion_1_GestioArticles:
                        Menu menu1 = new Menu("Menu de Articles", ARTICLE_OPTIONS.values());
                        menu1.setDescripcions(articleMenu);
                        menu1.mostrarMenu();
                        aOption = (ARTICLE_OPTIONS) menu1.getOpcio(sc);
                        switch (aOption){
                            case M_Opcion_1_AfegirArticle:
                                addArticle(sc);
                                break;
                            case M_Opcion_2_VisualitzarArticles:
                                System.out.println(adaptador.recuperaArticles());
                                break;
                            case M_Opcion_3_Sortir:
                                break;
                        }
                        break;
                    case M_Opcion_2_GestioClient:
                        Menu menu2 = new Menu("Menu de Clients", CLIENT_OPTIONS.values());
                        menu2.setDescripcions(clientMenu);
                        menu2.mostrarMenu();
                        cOption = (CLIENT_OPTIONS) menu2.getOpcio(sc);
                        switch (cOption){
                            case M_Opcion_1_AfegirClient:
                                addClient(sc);
                                break;
                            case M_Opcion_2_VisualitzarClients:
                                System.out.println(adaptador.recuperaClients());
                                break;
                            case M_Opcion_3_Sortir:
                                break;
                        }
                        break;
                    case M_Opcion_3_GestioComandes:
                        Menu menu3 = new Menu("Menu de Comandes", ORDER_OPTIONS.values());
                        menu3.setDescripcions(orderMenu);
                        menu3.mostrarMenu();
                        oOption = (ORDER_OPTIONS) menu3.getOpcio(sc);
                        switch (oOption){
                            case M_Opcion_1_AfegirComanda:
                                addOrder(sc);
                                break;
                            case M_Opcion_2_EsborrarComanda:
                                delOrder(sc);
                                break;
                            case M_Opcion_3_VisualitzarComanda:
                                System.out.println(adaptador.recuperaComanda());
                                break;
                            case M_Opcion_4_VisualitzarComandaUrgent:
                                System.out.println(adaptador.recuperaComandaUrgents());
                                break;
                            case M_Opcion_5_Sortir:
                                break;
                        }
                        break;
                    case M_Opcion_4_GuardarDades:
                        Menu menu4 = new Menu("Menu de Ficheros", FILE_OPTIONS.values());
                        menu4.setDescripcions(fileMenu);
                        menu4.mostrarMenu();
                        fOption = (FILE_OPTIONS) menu4.getOpcio(sc);
                        switch (fOption){

                        }
                        break;
                    case M_Opcion_5_CarregaDades:
                        Menu menu5 = new Menu("Menu de Ficheros", FILE_OPTIONS.values());
                        menu5.setDescripcions(fileMenu);
                        menu5.mostrarMenu();
                        fOption = (FILE_OPTIONS) menu5.getOpcio(sc);
                        switch (fOption){

                        }
                        break;
                }
            } catch (MercatException e) { System.out.println(e.getMessage()); }
        }while(mainOption != MENU_OPTIONS.M_Opcion_6_Sortir);
    }
}
