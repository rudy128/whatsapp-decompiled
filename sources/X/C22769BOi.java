package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.BOi  reason: case insensitive filesystem */
public final class C22769BOi extends C25973Cpg {
    public final long A00;
    public final List A01 = AnonymousClass000.A13();
    public final List A02 = AnonymousClass000.A13();

    public C22769BOi A00(int i) {
        List list = this.A01;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C22769BOi bOi = (C22769BOi) list.get(i2);
            if (bOi.A00 == i) {
                return bOi;
            }
        }
        return null;
    }

    public C22768BOh A01(int i) {
        List list = this.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C22768BOh bOh = (C22768BOh) list.get(i2);
            if (bOh.A00 == i) {
                return bOh;
            }
        }
        return null;
    }

    public C22769BOi(int i, long j) {
        super(i);
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(C25973Cpg.A00(this.A00));
        A10.append(" leaves: ");
        BE6.A1L(A10, this.A02.toArray());
        A10.append(" containers: ");
        return AnonymousClass000.A0y(Arrays.toString(this.A01.toArray()), A10);
    }
}
