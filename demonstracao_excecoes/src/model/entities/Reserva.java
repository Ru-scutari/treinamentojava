package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private Integer numeroDoQuarto;
    private Date checkIn;
    private Date checkOut;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

    public Reserva(){
        super();
    }

    public Reserva(Integer numeroDoQuarto, Date checkIn, Date checkOut) throws DomainException{
        if (!checkOut.after(checkIn)){
            throw new DomainException ("Check-out tem que ser depois da data de check-in");
        }
        this.numeroDoQuarto = numeroDoQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public void setNumeroDoQuarto(Integer numeroDoQuarto) {
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duracao(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void atualizacaoDeDatas (Date checkIn, Date checkOut) throws DomainException{
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)){
            throw new DomainException ("Datas de reserva tem que ser datas futuras");
        }
        if (!checkOut.after(checkIn)){
            throw new DomainException ("Check-out tem que ser depois da data de check-in");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Quarto: ");
        sb.append(numeroDoQuarto);
        sb.append(", check-in: ");
        sb.append(sdf.format(checkIn));
        sb.append(", check-out: ");
        sb.append(sdf.format(checkOut));
        sb.append(", ");
        sb.append(duracao());
        sb.append(" noites.");
        return sb.toString();
    }
}
