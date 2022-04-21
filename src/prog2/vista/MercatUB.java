package prog2.vista;
import prog2.adaptador.*;
import java.util.Scanner;

/**
 * Class that handles menu
 * Connects to adaptador.java
 * @author eshaan
 * @author alex
 */
public class MercatUB {


    /**
     * Starts menu
     */
    public void gestioMercatUB(){
        Scanner sc = new Scanner(System.in);
        gestioMenu(sc);
    }

    private static enum MENU_OPTIONS {
        M_Opcion_1_GestioArticles,
        M_Opcion_2_GestioClient,
        M_Opcion_3_GestioComandes,
        M_Opcion_4_GuardarDades,
        M_Opcion_5_CarregaDades,
        M_Opcion_6_Sortir
    }

    private static enum ARTICLE_OPTIONS {
        M_Opcion_1_AfegirArticle,
        M_Opcion_2_VisualitzarArticles,
        M_Opcion_3_Sortir
    }

    private static enum CLIENT_OPTIONS {
        M_Opcion_1_AfegirClient,
        M_Opcion_2_VisualitzarClients,
        M_Opcion_3_Sortir
    }

    private static enum ORDER_OPTIONS {
        M_Opcion_1_AfegirComanda,
        M_Opcion_2_EsborrarComanda,
        M_Opcion_3_VisualitzarComanda,
        M_Opcion_4_VisualitzarComandaUrgent,
        M_Opcion_5_Sortir
    }

    private static final String[] mainMenu = {
            "Gestio articles", //Option 1
            "Gestio clients",  //Option 2
            "Gestio comandes", //Option 3
            "Guardar dades",   //Option 4
            "Carrega dades",   //Option 5
            "Sortir"           //Option 6
    };

    private static final String[] articleMenu = {
            "Afegir articles",      //Option 1
            "Visualitzar articles", //Option 2
            "Sortir"                //Option 3
    };

    private static final String[] clientMenu = {
            "Afegir client",      //Option 1
            "Visualitzar client", //Option 2
            "Sortir"              //Option 3
    };

    private static final String[] orderMenu = {
            "Afegir comanda",               //Option 1
            "Esborrar comanda",             //Option 2
            "Visualitzar comanda",          //Option 3
            "Visualitzar comandes urgents", //Option 4
            "Sortir"                        //Option 5
    };

    public void gestioMenu(Scanner sc){
        Menu menu = new Menu<>("Menu Principal", MENU_OPTIONS.values());
        menu.setDescripcions(mainMenu);

        MENU_OPTIONS mainOption = null;
        ARTICLE_OPTIONS aOption = null;
        CLIENT_OPTIONS cOption = null;
        ORDER_OPTIONS oOption = null;

        do {
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

                            break;
                        case M_Opcion_2_VisualitzarArticles:

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

                            break;
                        case M_Opcion_2_VisualitzarClients:

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

                            break;
                        case M_Opcion_2_EsborrarComanda:

                            break;
                        case M_Opcion_3_VisualitzarComanda:

                            break;
                        case M_Opcion_4_VisualitzarComandaUrgent:

                            break;
                        case M_Opcion_5_Sortir:
                            break;
                    }
                    break;
                case M_Opcion_4_GuardarDades:

                    break;
                case M_Opcion_5_CarregaDades:

                    break;
            }
        }while(mainOption != MENU_OPTIONS.M_Opcion_6_Sortir);
    }
}
