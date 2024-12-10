package X;

import android.text.TextUtils;

/* renamed from: X.37j  reason: invalid class name and case insensitive filesystem */
public class C694837j implements AnonymousClass1Bh {
    public final int A00;
    public final Object A01;

    public C694837j(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BJ9(C223419n r5) {
        if (this.A00 != 0) {
            C36711oL r2 = (C36711oL) this.A01;
            String str = r2.A02;
            if (str == null) {
                str = C17880vN.A0K(r2.A04).A0d();
                r2.A02 = str;
            }
            if (!TextUtils.isEmpty(str)) {
                r5.A04("encrypted_rid", str);
                return;
            }
            return;
        }
        AnonymousClass4RS r1 = (AnonymousClass4RS) this.A01;
        String A0d = C17880vN.A0K(r1.A09).A0d();
        if (!A0d.isEmpty()) {
            if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(r1.A02), 6084)) {
                r5.A04("encrypted_rid", A0d);
            }
        }
    }

    public String BU9() {
        return "encrypted_rid";
    }
}
