package X;

import java.io.IOException;

public class DYQ implements AnonymousClass1Bx, E75 {
    public C25193Cak A00;

    public AnonymousClass1Bz BU4() {
        try {
            return new C28271Dwf(this.A00.A01());
        } catch (IllegalArgumentException e) {
            throw new C24210BxM(e.getMessage(), e);
        }
    }

    public AnonymousClass1Bz CP9() {
        try {
            return BU4();
        } catch (IOException e) {
            throw new C24415C2o("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new C24415C2o("unable to get DER object", e2);
        }
    }
}
