package X;

import android.util.Pair;
import java.util.Map;

/* renamed from: X.8jq  reason: invalid class name and case insensitive filesystem */
public final class C168878jq extends C133336oa {
    public final Pair A00;
    public final C26235CvV A01;
    public final Object A02;

    public C26235CvV A00() {
        Object obj = this.A00.second;
        C18070vi.A0W(obj);
        return (C26235CvV) obj;
    }

    public Map A01() {
        DFL dfl = (DFL) this.A00.first;
        Object obj = this.A02;
        C18070vi.A0z(obj, "null cannot be cast to non-null type com.instagram.common.bloks.BloksInterpreterEnvironment");
        C23736Boh boh = (C23736Boh) obj;
        if (dfl == null || dfl.A0A(65) == null) {
            return C17880vN.A11();
        }
        return (Map) C25974Cph.A00(boh, C199029zJ.A01, dfl.A0A(65));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C168878jq(X.C26235CvV r6, java.lang.Object r7) {
        /*
            r5 = this;
            X.C18070vi.A0j(r7, r6)
            X.DFL r4 = r6.A01
            r0 = 35
            java.lang.Object r3 = X.DFL.A00(r4, r0)
            X.DFL r3 = (X.DFL) r3
            if (r3 == 0) goto L_0x002a
            X.Cip r2 = r6.A00
            java.lang.String r1 = r6.A02
            X.CvV r0 = new X.CvV
            r0.<init>(r2, r3, r1)
            android.util.Pair r1 = X.C108945cZ.A0N(r4, r0)
            java.lang.Object r0 = r1.first
            X.DFL r0 = (X.DFL) r0
            r5.<init>(r0)
            r5.A02 = r7
            r5.A01 = r6
            r5.A00 = r1
            return
        L_0x002a:
            java.lang.String r0 = "Null content for BottomSheet"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168878jq.<init>(X.CvV, java.lang.Object):void");
    }
}
