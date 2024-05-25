package ex5;

public class StringConcatPerformanceTest {
    private static final int ITERATIONS = 100000;

    public static void main(String[] args) {
        long startTime;
        long endTime;

        // Teste com String
        startTime = System.currentTimeMillis();
        testStringConcat();
        endTime = System.currentTimeMillis();
        System.out.println("Tempo com String: " + (endTime - startTime) + " ms");

        // Teste com StringBuffer
        startTime = System.currentTimeMillis();
        testStringBufferConcat();
        endTime = System.currentTimeMillis();
        System.out.println("Tempo com StringBuffer: " + (endTime - startTime) + " ms");
    }

    private static void testStringConcat() {
        String str = "";
        for (int i = 0; i < ITERATIONS; i++) {
            str += "a";
        }
    }

    private static void testStringBufferConcat() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuffer.append("a");
        }
    }
}

// o tempo de execução para a concatenação de strings usando StringBuffer é significativamente 
// menor do que o tempo de execução usando String. Isso ocorre porque StringBuffer evita 
// a criação de novos objetos e a cópia de dados existentes em cada iteração
