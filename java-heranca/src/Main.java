class Main {
    public static void main(String[] args) throws Exception {
        Veiculo veiculo = new Veiculo();

        //Upcast: A a = new B();
        //Há caracterisiticas de Caminhão, Carro e Moto que preenchem Veiculo.
        
        Veiculo caminhao = new Caminhao();
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();


        //Downcast: B a = (B) new A();
        //Porém há caracteristicas a mais de Veiculos que preencham
        //e ainda sobram as classes filhas,daí o erro no Downcast.
        Moto moto = (Moto) new Veiculo();

    }
}
