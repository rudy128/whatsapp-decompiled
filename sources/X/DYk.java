package X;

import java.math.BigInteger;

public class DYk implements E3O {
    public BigInteger A00;
    public BigInteger A01;
    public BigInteger A02;
    public C6Q A03;

    public boolean equals(Object obj) {
        if (!(obj instanceof DYk)) {
            return false;
        }
        DYk dYk = (DYk) obj;
        if (!dYk.A01.equals(this.A01) || !dYk.A02.equals(this.A02) || !dYk.A00.equals(this.A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() ^ this.A02.hashCode()) ^ this.A00.hashCode();
    }
}
