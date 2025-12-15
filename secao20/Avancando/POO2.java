package secao20.Avancando;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class POO2 {
    public static void main(String[] args) {
        // 1 - Classes com final
        ContaBancaria conta = new ContaBancaria(500);
        System.out.println(conta.getSaldo());

        // 2 - Reflection API
        try {
            Class<?> classePessoa = Class.forName("secao20.Avancando.Pessoa");
            Constructor<?> constructor = classePessoa.getConstructor(String.class, int.class);
            Object pessoa = constructor.newInstance("Ana", 22);
            Method metodo = classePessoa.getMethod("dizerHello");
            metodo.invoke(pessoa);

            Field nome = classePessoa.getDeclaredField("nome");
            nome.setAccessible(true);
            nome.set(pessoa, "Maria");

            metodo.invoke(pessoa);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
