package X;

import java.util.List;

/* renamed from: X.2i2  reason: invalid class name and case insensitive filesystem */
public class C56792i2 {
    public List A00;

    public boolean A00() {
        for (C37431pX isValid : this.A00) {
            if (!isValid.isValid()) {
                return false;
            }
        }
        return true;
    }

    public C56792i2(C37431pX... r4) {
        int length = r4.length;
        this.A00 = C17880vN.A0z(length);
        for (int i = 0; i < length; i = 1) {
            C37431pX r1 = r4[i];
            if (r1 != null) {
                this.A00.add(r1);
            }
        }
    }
}
