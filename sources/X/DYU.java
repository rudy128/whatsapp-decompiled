package X;

import java.io.IOException;
import java.io.InputStream;

public class DYU implements EEO {
    public C28371DyH A00;

    public AnonymousClass1Bz BU4() {
        return new C28327DxZ(this.A00.A03());
    }

    public InputStream BVZ() {
        return this.A00;
    }

    public AnonymousClass1Bz CP9() {
        try {
            return BU4();
        } catch (IOException e) {
            throw new C24415C2o(C17900vP.A0C("IOException converting stream to byte array: ", AnonymousClass000.A10(), e), e);
        }
    }
}
