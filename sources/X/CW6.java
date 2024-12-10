package X;

public class CW6 {
    public final DOZ A00;
    public final DFL A01;
    public final E8A A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof CW6) || ((CW6) obj).A02 != this.A02) {
            return false;
        }
        return true;
    }

    public CW6(DOZ doz, DFL dfl, E8A e8a) {
        this.A01 = dfl;
        this.A00 = doz;
        this.A02 = e8a;
    }
}
