package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class DYS implements AnonymousClass1Bx, E75 {
    public final int A00;
    public final C25193Cak A01;

    public DYS(C25193Cak cak, int i) {
        this.A00 = i;
        this.A01 = cak;
    }

    public AnonymousClass1Bz CP9() {
        try {
            return BU4();
        } catch (IOException e) {
            throw new C24415C2o(e.getMessage(), e);
        }
    }

    public AnonymousClass1Bz BU4() {
        int i = this.A00;
        C26135Csy A012 = this.A01.A01();
        ByteArrayOutputStream A15 = C108945cZ.A15();
        int i2 = 0;
        while (i2 != A012.A00) {
            try {
                A15.write(((AnonymousClass1By) A012.A01(i2)).A0C("BER"));
                i2++;
            } catch (IOException e) {
                throw new C24415C2o(AnonymousClass001.A1E(e, "malformed object: ", AnonymousClass000.A10()), e);
            }
        }
        return new C28334Dxg(A15.toByteArray(), i, true);
    }
}
