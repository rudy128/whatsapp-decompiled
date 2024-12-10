package X;

import java.util.List;

/* renamed from: X.22O  reason: invalid class name */
public class AnonymousClass22O extends AnonymousClass22J {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0 == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A17() {
        /*
            r4 = this;
            java.util.List r1 = r4.A00
            boolean r0 = r1.isEmpty()
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            java.lang.Object r0 = r1.get(r2)
            X.9Bw r0 = (X.C178119Bw) r0
            boolean r0 = r0.A0O()
            r1 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            boolean r0 = r4.A18()
            if (r0 == 0) goto L_0x0022
            if (r1 == 0) goto L_0x0021
            r3 = 3
        L_0x0021:
            return r3
        L_0x0022:
            if (r1 == 0) goto L_0x0025
            r2 = 2
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass22O.A17():int");
    }

    public boolean A18() {
        List list = this.A00;
        if (!list.isEmpty()) {
            return ((C178119Bw) list.get(0)).A0J;
        }
        return false;
    }
}
