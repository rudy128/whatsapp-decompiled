package X;

import android.text.TextUtils;

/* renamed from: X.1QI  reason: invalid class name */
public class AnonymousClass1QI implements AnonymousClass1KG {
    public final AnonymousClass18O A00;
    public final C19830z4 A01;
    public final C18000vb A02;
    public final C18030ve A03;

    public String BPX() {
        C19830z4 r0 = this.A01;
        String A0l = r0.A0l();
        String A0n = r0.A0n();
        if (TextUtils.isEmpty(A0l) || TextUtils.isEmpty(A0n)) {
            return this.A02.A04();
        }
        return AnonymousClass1K3.A01(A0l, A0n);
    }

    public AnonymousClass1QI(AnonymousClass18O r1, C19830z4 r2, C18000vb r3, C18030ve r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
