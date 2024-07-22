# Tipos de Dados em Java

## Tipos Primitivos

Java possui oito tipos de dados primitivos, cada um projetado para armazenar um tipo específico de dado. Eles são eficientes e de baixo nível, diretamente mapeados para tipos primitivos suportados pelo hardware da máquina.

### Tipos Numéricos Inteiros

1. **byte**

   - **Tamanho**: 8 bits
   - **Intervalo**: -128 a 127
   - **Exemplo**: `byte b = 100;`

2. **short**

   - **Tamanho**: 16 bits
   - **Intervalo**: -32,768 a 32,767
   - **Exemplo**: `short s = 10000;`

3. **int**

   - **Tamanho**: 32 bits
   - **Intervalo**: -2^31 a 2^31-1
   - **Exemplo**: `int i = 100000;`

4. **long**
   - **Tamanho**: 64 bits
   - **Intervalo**: -2^63 a 2^63-1
   - **Exemplo**: `long l = 100000L;`

### Tipos Numéricos de Ponto Flutuante

5. **float**

   - **Tamanho**: 32 bits
   - **Precisão**: Aproximadamente 7 dígitos decimais significativos
   - **Exemplo**: `float f = 234.5f;`

6. **double**
   - **Tamanho**: 64 bits
   - **Precisão**: Aproximadamente 15 dígitos decimais significativos
   - **Exemplo**: `double d = 123.4;`

### Tipo Caractere

7. **char**
   - **Tamanho**: 16 bits
   - **Intervalo**: '\u0000' a '\uffff' (0 a 65,535)
   - **Exemplo**: `char c = 'A';`

### Tipo Booleano

8. **boolean**
   - **Valores**: `true` ou `false`
   - **Exemplo**: `boolean bool = true;`
