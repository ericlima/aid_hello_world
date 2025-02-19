package pt.ipcb.aid.hello;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;


public class Conta {
    private long id;
    private String titular;
    private String morada;
    private long nif;
    private long pin;
    private double saldo;
    @JsonFormat(pattern = "dd:MM:yyyy")
    private LocalDateTime data_atual;

    public Conta(long id, String titular, String morada, int nif, int pin, double saldo, LocalDateTime data_atual) {
        this.id=id;
        this.titular=titular;
        this.morada=morada;
        this.nif=nif;
        this.pin=pin;
        this.saldo=saldo;
        this.data_atual=data_atual;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }
    public String getMorada() { return morada; }
    public void setMorada(String morada) { this.morada = morada; }
    public long getNif() { return nif; }
    public void setNif(long nif) { this.nif = nif; }
    public long getPin() { return pin; }
    public void setPin(long pin) { this.pin = pin; }
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public LocalDateTime getData_atual() { return data_atual; }

    @Override
    public String toString() {
        return super.toString();
    }
}