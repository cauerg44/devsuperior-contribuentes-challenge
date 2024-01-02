package app;

import ents.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Quantos contribuintes você vai digitar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados do " + (i + 1) + "o contribuinte:");
            System.out.print("Renda anual com salário: ");
            double salaryIncome = sc.nextDouble();
            System.out.print("Renda anual com prestação de serviço: ");
            double serviceIncome = sc.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            double capitalIncome = sc.nextDouble();
            System.out.print("Gastos médicos: ");
            double healthSpending = sc.nextDouble();
            System.out.print("Gastos educacionais: ");
            double educationSpending = sc.nextDouble();
            System.out.println();

            list.add(new TaxPayer(salaryIncome, serviceIncome, capitalIncome, healthSpending, educationSpending));
        }

        for (int i = 0; i < n; i++) {
            TaxPayer taxpayer = list.get(i);

            System.out.println("Resumo do " + (i + 1) + "o contribuinte:");
            System.out.printf("Imposto bruto total: %.2f%n", taxpayer.grossTax());
            System.out.printf("Abatimento: %.2f%n", taxpayer.taxRebate());
            System.out.printf("Imposto devido: %.2f%n", taxpayer.netTax());
            System.out.println();
        }


        sc.close();
    }
}
