package X;

import android.view.View;
import java.util.LinkedHashMap;

public class A58 {
    public C216816z A00;
    public C185419cY A01;
    public final C21350Aif A02;
    public final C216816z A03 = new ALT(this);
    public final LinkedHashMap A04 = C17880vN.A13();
    public final BTG A05;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = X.C19946A0d.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.View r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0013
            java.util.WeakHashMap r0 = X.C19946A0d.A01
            java.lang.Object r2 = r0.get(r4)
            if (r2 != 0) goto L_0x0013
            X.A0d r2 = new X.A0d
            r2.<init>(r4)
            r0.put(r4, r2)
        L_0x0013:
            X.9cY r0 = r3.A01
            if (r0 == 0) goto L_0x0026
            if (r2 == 0) goto L_0x0026
            X.9cX r1 = r0.A00
            monitor-enter(r1)
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x0022 }
            r0.remove(r2)     // Catch:{ all -> 0x0022 }
            goto L_0x0025
        L_0x0022:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0025:
            monitor-exit(r1)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A58.A02(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = X.C19946A0d.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.view.View r4, X.C1404171i r5) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0013
            java.util.WeakHashMap r0 = X.C19946A0d.A01
            java.lang.Object r2 = r0.get(r4)
            if (r2 != 0) goto L_0x0013
            X.A0d r2 = new X.A0d
            r2.<init>(r4)
            r0.put(r4, r2)
        L_0x0013:
            X.9cY r0 = r3.A01
            if (r0 == 0) goto L_0x0026
            if (r2 == 0) goto L_0x0026
            X.9cX r1 = r0.A00
            monitor-enter(r1)
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x0022 }
            r0.put(r2, r5)     // Catch:{ all -> 0x0022 }
            goto L_0x0025
        L_0x0022:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0025:
            monitor-exit(r1)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A58.A03(android.view.View, X.71i):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.BTG, java.lang.Object] */
    public static A58 A00() {
        return new A58(new C21350Aif(), new Object());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.E7V, java.lang.Object] */
    public static void A01(C191479mf r7, C180769Nv r8, A58 a58, C140006zn r10) {
        BTG btg = a58.A05;
        C185409cX r6 = new C185409cX(btg);
        C185419cY r0 = new C185419cY(r8, btg, r6, new C188589hf(C17890vO.A0D(), new Object(), r7, btg, r6, r10));
        a58.A01 = r0;
        r0.A01.A00 = a58.A03;
    }

    public void A04(View view, C180769Nv r5) {
        if (view != null) {
            A01(new C191479mf(view, this.A02), r5, this, new C140006zn(false));
        }
    }

    public A58(C21350Aif aif, BTG btg) {
        this.A05 = btg;
        this.A02 = aif;
    }
}
