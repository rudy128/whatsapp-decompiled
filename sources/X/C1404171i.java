package X;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* renamed from: X.71i  reason: invalid class name and case insensitive filesystem */
public class C1404171i {
    public static final C1404171i A06 = new C1404171i((C1404171i) null, (Object) null, (Object) null, "empty", Collections.emptyList());
    public String A00;
    public boolean A01;
    public final C1404171i A02;
    public final Object A03;
    public final Object A04;
    public final List A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1404171i(X.C129566i0 r7) {
        /*
            r6 = this;
            java.lang.Object r2 = r7.A02
            java.lang.Object r3 = r7.A03
            java.lang.String r4 = r7.A04
            java.util.List r5 = r7.A01
            if (r5 != 0) goto L_0x000e
            java.util.List r5 = java.util.Collections.emptyList()
        L_0x000e:
            X.71i r1 = r7.A00
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1404171i.<init>(X.6i0):void");
    }

    public void A00(C140006zn r3) {
        for (AnonymousClass86O BKl : this.A05) {
            BKl.BKl(this, r3);
        }
        if (((C128256fh) r3.A04.get(this.A00)).A00 == AnonymousClass00R.A00) {
            this.A01 = true;
        }
    }

    public C1404171i(C1404171i r2, Object obj, Object obj2, String str, List list) {
        if (!(obj instanceof View)) {
            this.A03 = obj;
            this.A04 = obj2;
            this.A00 = str;
            this.A02 = r2;
            this.A01 = false;
            this.A05 = list;
            return;
        }
        throw AnonymousClass000.A0k("ViewpointData should not contain a view as model");
    }
}
