/*

3. Considere os métodos declarados na implementação abaixo (houve ocultação intencional do corpo dos métodos). Indique se
está havendo sobrecarga ou sobrescrita dos mesmos. Em caso de sobrecarga ou sobrescrita, indique sob qual outro método ela
está ocorrendo.

public class A {
...
public A() { ... }
public A( int x ) { ... }
public void m1() { ... }
public void m1(int h) { ... }
}
public class B extends A {
...
public B() { ... }
public void m1() { ... }
public void m1( double x, double y) { ... }
public void m2() { ... }
}

Resposta:
- Sobrecarga dos construtores A.
- Na classe A, há sobrecarga entre m1() e m1(int h).
- Na classe B, o método m1() sobrescreve o m1() da classe A.
- O método m1(double x, double y) em B é uma sobrecarga em relação aos outros m1 (de A e B).

*/
