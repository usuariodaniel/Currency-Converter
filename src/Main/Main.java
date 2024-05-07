package Main;

import converter.currency.module.ApiRequest;
import converter.currency.module.ConverterData;
import converter.currency.module.Currency;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ApiRequest apiRequest = new ApiRequest();

        String opcao;
        do {
            opcao = JOptionPane.showInputDialog(null, """
                    Bem-Vindo ao Conversor de Moeda\nDigite a Opção Desejada\n
                    1 - Converter de Dólar para Real
                    2 - Converter de Real para Dólar
                    3 - Converter de Dólar para Peso Chileno
                    4 - Converter de Dólar para Euro
                    5 - Converter de Euro para Real
                    6 - Converter de Libra Esterlina para Real
                    7 - Sair""");

            if (opcao.equals("7")) {
                JOptionPane.showMessageDialog(null, "Encerrando...");
                break;
            }

            switch (opcao) {
                case "1":
                    int valorDolarReal = Integer.parseInt(JOptionPane.showInputDialog(null, "Conversor Dólar > Real\n\nInsira o Valor que deseja converter"));
                    ConverterData newConverterDolarReal = apiRequest.currencyConverter("USD", "BRL");
                    Currency currencyDolarReal = new Currency();
                    double conversionDolarReal = currencyDolarReal.ConvertertoBrl(newConverterDolarReal.conversion_rate() * valorDolarReal);
                    JOptionPane.showMessageDialog(null, "Valor convertido com sucesso!\n" + valorDolarReal + " USD Equivale a " + conversionDolarReal + " BRL");
                    break;
                case "2":
                    int valorRealDolar = Integer.parseInt(JOptionPane.showInputDialog(null, "Conversor Real > Dólar\n\nInsira o Valor que deseja converter"));
                    ConverterData newConverterRealDolar = apiRequest.currencyConverter("BRL", "USD");
                    Currency currencyRealDolar = new Currency();
                    double conversionRealDolar = currencyRealDolar.ConvertertoBrl(newConverterRealDolar.conversion_rate() * valorRealDolar);
                    JOptionPane.showMessageDialog(null, "Valor convertido com sucesso!\n" + valorRealDolar + " BRL Equivale a " + conversionRealDolar + " USD");
                    break;
                case "3":
                    int valorDolarPesoChileno = Integer.parseInt(JOptionPane.showInputDialog(null, "Conversor Dólar > Peso Chileno\n\nInsira o Valor que deseja converter"));
                    ConverterData newConverterDolarPesoChileno = apiRequest.currencyConverter("USD", "CLP");
                    Currency currencyDolarPesoChileno = new Currency();
                    double conversionDolarPesoChileno = currencyDolarPesoChileno.ConvertertoBrl(newConverterDolarPesoChileno.conversion_rate() * valorDolarPesoChileno);
                    JOptionPane.showMessageDialog(null, "Valor convertido com sucesso!\n" + valorDolarPesoChileno + " USD Equivale a " + conversionDolarPesoChileno + " CLP");
                    break;
                case "4":
                    int valorDolarEuro = Integer.parseInt(JOptionPane.showInputDialog(null, "Conversor Dólar > Euro\n\nInsira o Valor que deseja converter"));
                    ConverterData newConverterDolarEuro = apiRequest.currencyConverter("USD", "EUR");
                    Currency currencyDolarEuro = new Currency();
                    double conversionDolarEuro = currencyDolarEuro.ConvertertoBrl(newConverterDolarEuro.conversion_rate() * valorDolarEuro);
                    JOptionPane.showMessageDialog(null, "Valor convertido com sucesso!\n" + valorDolarEuro + " USD Equivale a " + conversionDolarEuro + " EUR");
                    break;
                case "5":
                    int valorEuroReal = Integer.parseInt(JOptionPane.showInputDialog(null, "Conversor Euro > Real\n\nInsira o Valor que deseja converter"));
                    ConverterData newConverterEuroReal = apiRequest.currencyConverter("EUR", "BRL");
                    Currency currencyEuroReal = new Currency();
                    double conversionEuroReal = currencyEuroReal.ConvertertoBrl(newConverterEuroReal.conversion_rate() * valorEuroReal);
                    JOptionPane.showMessageDialog(null, "Valor convertido com sucesso!\n" + valorEuroReal + " EUR Equivale a " + conversionEuroReal + " BRL");
                    break;
                case "6":
                    int valorLibraReal = Integer.parseInt(JOptionPane.showInputDialog(null, "Conversor Libra Esterlina > Real\n\nInsira o Valor que deseja converter"));
                    ConverterData newConverterLibraReal = apiRequest.currencyConverter("GBP", "BRL");
                    Currency currencyLibraReal = new Currency();
                    double conversionLibraReal = currencyLibraReal.ConvertertoBrl(newConverterLibraReal.conversion_rate() * valorLibraReal);
                    JOptionPane.showMessageDialog(null, "Valor convertido com sucesso!\n" + valorLibraReal + " GBP Equivale a " + conversionLibraReal + " BRL");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Insira uma opção válida");
            }
        } while (!opcao.equals("7"));
    }
}
