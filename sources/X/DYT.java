package X;

import java.io.IOException;
import java.io.InputStream;

public class DYT implements EEO {
    public C25193Cak A00;

    public InputStream BVZ() {
        return new C24222Bxa(this.A00);
    }

    public AnonymousClass1Bz BU4() {
        return new C28328Dxa(C24647CDm.A00(new C24222Bxa(this.A00)));
    }

    public AnonymousClass1Bz CP9() {
        try {
            return BU4();
        } catch (IOException e) {
            throw new C24415C2o(C17900vP.A0C("IOException converting stream to byte array: ", AnonymousClass000.A10(), e), e);
        }
    }
}
