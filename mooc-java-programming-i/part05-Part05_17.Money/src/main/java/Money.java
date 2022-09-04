
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        double first = this.euros + (this.cents / 100.0);
        double second = compared.euros + (compared.cents / 100.0);
        if (first < second) {
            return true;
        } else {
            return false;
        }
    }
    
    public Money minus(Money decreaser) {
        double first = this.euros + (this.cents / 100.0);
        double second = decreaser.euros + (decreaser.cents / 100.0);
        if (first < second) {
            return new Money(0, 0);
        }
        if (this.cents == 0 && decreaser.cents == 0) {
            return new Money (this.euros - decreaser.euros, this.cents - decreaser.cents);
        }
        if (this.cents== 0 && decreaser.cents != 0) {
            return new Money (this.euros - decreaser.euros - 1, 100 - decreaser.cents);
        }
        if (this.euros == decreaser.euros && this.cents != decreaser.cents) {
            return new Money (this.euros - decreaser.euros, this.cents - decreaser.cents);
        }
        return new Money (this.euros - decreaser.euros - 1, this.cents - decreaser.cents);
    }

}
