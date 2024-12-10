package X;

public class DAK implements C28573E8e {
    public final String A00;

    public String Bb4() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DAK) {
            return this.A00.equals(((DAK) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00;
    }

    public DAK(String str) {
        C26208Cuj.A01(str);
        this.A00 = str;
    }
}
