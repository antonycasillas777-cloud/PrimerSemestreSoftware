package EjercicioPaquetes;
import java.util.Scanner;

public class ejercicioPaquete { 

  

    public static void main(String[] args) { 

      Scanner sc = new Scanner(System.in); 

  

        // ---- Leer zona (1 o 2) ---- 

        int zona = 0; 

        boolean zonaValida = false; 

        while (!zonaValida) { 

            System.out.print("Ingrese zona (1: Local, 2: Nacional): "); 

            if (sc.hasNextInt()) { 

                zona = sc.nextInt(); 

                if (zona == 1 || zona == 2) { 

                    zonaValida = true; 

                } else { 

                    System.out.println("Error: la zona debe ser 1 o 2."); 

                } 

            } else { 

                System.out.println("Error: debe ingresar un número entero."); 

            } 

        } 

  

        // ---- Leer peso (entre 0.1 y 30) ---- 

        double peso = 0; 

        boolean pesoValido = false; 

        while (!pesoValido) { 

            System.out.print("Ingrese peso en kg (0.1 a 30): "); 

            if (sc.hasNextDouble()) { 

                peso = sc.nextDouble(); 

                if (peso >= 0.1 && peso <= 30.0) { 

                    pesoValido = true; 

                } else { 

                    System.out.println("Error: el peso debe estar entre 0.1 y 30 kg."); 

                } 

            } else { 

                System.out.println("Error: debe ingresar un número (use punto decimal)."); 

            } 

        } 

  

        // ---- Leer tipo de servicio (1 o 2) ---- 

        int tipoServicio = 0; 

        boolean servicioValido = false; 

        while (!servicioValido) { 

            System.out.print("Ingrese tipo de servicio (1: Normal, 2: Exprés): "); 

            if (sc.hasNextInt()) { 

                tipoServicio = sc.nextInt(); 

                if (tipoServicio == 1 || tipoServicio == 2) { 

                    servicioValido = true; 

                } else { 

                    System.out.println("Error: el tipo de servicio debe ser 1 o 2."); 

                } 

            } else { 

                System.out.println("Error: debe ingresar un número entero."); 

            } 

        } 

  

        // ---- Leer si es cliente frecuente (1 o 2) ---- 

        int esFrecuente = 0; 

        boolean frecuenteValido = false; 

        while (!frecuenteValido) { 

            System.out.print("¿Es cliente frecuente? (1: Sí, 2: No): "); 

            if (sc.hasNextInt()) { 

                esFrecuente = sc.nextInt(); 

                if (esFrecuente == 1 || esFrecuente == 2) { 

                    frecuenteValido = true; 

                } else { 

                    System.out.println("Error: debe responder 1 o 2."); 

                } 

            } else { 

                System.out.println("Error: debe ingresar un número entero."); 

            } 

        } 

  

        // 1. Tarifa base según la zona 

        double costoBase = (zona == 1) ? 5.0 : 10.0; 

  

        // 2. Recargo por exceso de peso (> 10 kg) 

        double recargoPeso = 0.0; 

        if (peso > 10.0) { 

            recargoPeso = (peso - 10.0) * 2.0; 

        } 

  

        double subtotal = costoBase + recargoPeso; 

  

        // 3. Recargo por servicio exprés (20%) 

        if (tipoServicio == 2) { 

            subtotal = subtotal * 1.20; 

        } 

  

        // 4. Descuento por cliente frecuente (10%) 

        double total = subtotal; 

        if (esFrecuente == 1) { 

            total = total * 0.90; 

        } 

  

        System.out.printf("Costo total del envío: $%.2f%n", total); 

        
    } 

} 
