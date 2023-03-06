import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Cuenta {
        private double saldo;
        int numero;
        int agencia;
        Cliente titular=new Cliente();
        public void depositar(double saldo){
                this.saldo+=saldo;
        }
        public boolean retirar(double valor){
                if (this.saldo>=valor){
                        this.saldo-=valor;
                        return true;
                } else {
                        return false;
                }
        }
        public boolean transferir(double valor, Cuenta cuenta){
                if (this.saldo>=valor){
                        this.saldo-=valor;
                        cuenta.saldo+=valor;
                        return true;
                } else {
                        return false;
                }
        }
        public double getSaldo(){
                return this.saldo;
        }
        public void setSaldo(double saldo){
                this.saldo+=saldo;
        }
    }

