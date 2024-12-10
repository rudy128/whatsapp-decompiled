package X;

import java.util.Arrays;

public class C6Q {
    public int A00;
    public byte[] A01;

    public int hashCode() {
        return this.A00 ^ AnonymousClass1C2.A00(this.A01);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6Q) {
            C6Q c6q = (C6Q) obj;
            if (c6q.A00 == this.A00) {
                return Arrays.equals(this.A01, c6q.A01);
            }
        }
        return false;
    }
}
