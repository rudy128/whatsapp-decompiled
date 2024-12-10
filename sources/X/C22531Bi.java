package X;

import android.text.TextUtils;

/* renamed from: X.1Bi  reason: invalid class name and case insensitive filesystem */
public class C22531Bi implements AnonymousClass1Bh {
    public final /* synthetic */ AnonymousClass1Bd A00;

    public C22531Bi(AnonymousClass1Bd r1) {
        this.A00 = r1;
    }

    public void BJ9(C223419n r3) {
        String A0d = ((C19830z4) this.A00.A0N.get()).A0d();
        if (!TextUtils.isEmpty(A0d)) {
            r3.A04("encrypted_rid", A0d);
        }
    }

    public String BU9() {
        return "encrypted_rid";
    }
}
