package X;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Rd  reason: invalid class name and case insensitive filesystem */
public final class C86314Rd {
    public final Map A00;

    public C86314Rd(Map map) {
        C18070vi.A0d(map, 1);
        this.A00 = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        r2 = (X.AnonymousClass5ZX) r1.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        r2.CBR(r3, r4, r5, r6, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Context r9, X.AnonymousClass5XY r10, X.AnonymousClass206 r11, int r12) {
        /*
            r8 = this;
            r4 = r10
            r0 = 0
            r3 = r9
            X.C18070vi.A0d(r9, r0)
            r2 = 1
            r5 = r11
            X.C18070vi.A0d(r11, r2)
            boolean r0 = r11 instanceof X.AnonymousClass21K
            if (r0 == 0) goto L_0x0021
            r0 = r5
            X.21K r0 = (X.AnonymousClass21K) r0
            if (r0 == 0) goto L_0x0021
            X.AEt r6 = r0.BPK()
            if (r6 == 0) goto L_0x0021
            int r0 = r6.A00
            if (r0 == 0) goto L_0x0021
            switch(r0) {
                case 1: goto L_0x002d;
                case 2: goto L_0x0026;
                case 3: goto L_0x0022;
                case 4: goto L_0x0031;
                case 5: goto L_0x0042;
                case 6: goto L_0x0026;
                case 7: goto L_0x0042;
                case 8: goto L_0x0021;
                case 9: goto L_0x0042;
                default: goto L_0x0021;
            }
        L_0x0021:
            return
        L_0x0022:
            java.util.Map r1 = r8.A00
            r0 = 3
            goto L_0x0034
        L_0x0026:
            java.util.Map r1 = r8.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x0038
        L_0x002d:
            java.util.Map r1 = r8.A00
            r0 = 2
            goto L_0x0034
        L_0x0031:
            java.util.Map r1 = r8.A00
            r0 = 4
        L_0x0034:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0038:
            java.lang.Object r2 = r1.get(r0)
            X.5ZX r2 = (X.AnonymousClass5ZX) r2
            if (r2 == 0) goto L_0x0021
            r4 = 0
            goto L_0x004d
        L_0x0042:
            java.util.Map r1 = r8.A00
            r0 = 5
            java.lang.Object r2 = X.AnonymousClass000.A0w(r1, r0)
            X.5ZX r2 = (X.AnonymousClass5ZX) r2
            if (r2 == 0) goto L_0x0021
        L_0x004d:
            r7 = r12
            r2.CBR(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86314Rd.A01(android.content.Context, X.5XY, X.206, int):void");
    }

    public final void A00(Context context, AnonymousClass5XY r6, AnonymousClass206 r7) {
        AnonymousClass21K r0;
        C20285AEt BPK;
        C20277AEk aEk;
        ADE ade;
        boolean A15 = C18070vi.A15(context, r7);
        if (!(!(r7 instanceof AnonymousClass21K) || (r0 = (AnonymousClass21K) r7) == null || (BPK = r0.BPK()) == null || (aEk = BPK.A06) == null)) {
            if (aEk.A01 != 2 || (ade = aEk.A00) == null) {
                List list = aEk.A03;
                if (list.size() > 0 && ((C20253ADl) list.get(A15)).A00) {
                    return;
                }
            } else if (ade.A00) {
                return;
            }
        }
        A01(context, r6, r7, A15 ? 1 : 0);
    }
}
