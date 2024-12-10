package X;

import java.util.Arrays;

public class C6P {
    public int A00;
    public byte[] A01;

    public int hashCode() {
        return this.A00 ^ AnonymousClass1C2.A00(this.A01);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6P) {
            C6P c6p = (C6P) obj;
            if (c6p.A00 == this.A00) {
                return Arrays.equals(this.A01, c6p.A01);
            }
        }
        return false;
    }
}
