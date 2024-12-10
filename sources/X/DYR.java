package X;

import java.io.IOException;

public class DYR implements AnonymousClass1Bx, E75 {
    public int A00;
    public C25193Cak A01;
    public boolean A02;

    public AnonymousClass1Bz BU4() {
        return this.A01.A02(this.A00, this.A02);
    }

    public AnonymousClass1Bz CP9() {
        try {
            return BU4();
        } catch (IOException e) {
            throw new C24415C2o(e.getMessage());
        }
    }
}
