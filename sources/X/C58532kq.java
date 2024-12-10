package X;

import com.whatsapp.util.Log;

/* renamed from: X.2kq  reason: invalid class name and case insensitive filesystem */
public class C58532kq {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C24531Kr A02;

    public C58532kq(C24531Kr r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    public void A00() {
        C24531Kr r2 = this.A02;
        int i = this.A00;
        C17960vV.A0D(C17890vO.A1R(r2.A05(i)));
        Log.e("CategoryManager/onManifestError/manifest was errory");
        r2.A0A(2, i);
        C24531Kr.A02(r2, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        if ((r3 + 3600000) <= X.AnonymousClass11P.A01(r5.A06)) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C62612rg r9) {
        /*
            r8 = this;
            X.1Kr r5 = r8.A02
            int r6 = r8.A00
            r7 = 0
            int r3 = r8.A01
            int r0 = r5.A05(r6)
            boolean r0 = X.C17890vO.A1R(r0)
            X.C17960vV.A0D(r0)
            boolean r0 = r5 instanceof X.AnonymousClass2E5
            if (r0 == 0) goto L_0x00a3
            java.lang.String r2 = "filter"
        L_0x0018:
            if (r9 != 0) goto L_0x002b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CategoryManager/onManifestReady/No info in manifest for category "
            X.C17900vP.A0e(r0, r2, r1)
            r1 = 2
        L_0x0024:
            r5.A0A(r1, r6)
            X.C24531Kr.A02(r5, r7)
            return
        L_0x002b:
            java.lang.String r0 = r9.A01
            boolean r0 = r2.equals(r0)
            X.C17960vV.A0D(r0)
            X.2rg r2 = r5.A06()
            if (r2 == 0) goto L_0x006e
            java.lang.String r1 = r2.A01()
            java.lang.String r0 = r9.A01()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006b
            java.lang.String r1 = r2.A03(r6)
            java.lang.String r0 = r9.A03(r6)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006e
            boolean r0 = r5.A0C(r6)
            if (r0 == 0) goto L_0x006b
            r0 = 5
            r5.A0A(r0, r6)
            java.lang.String r0 = r2.A03(r6)
            X.C24531Kr.A02(r5, r0)
            X.C24531Kr.A00(r5, r6)
            return
        L_0x006b:
            r5.A08()
        L_0x006e:
            if (r3 != 0) goto L_0x0094
            monitor-enter(r5)
            android.util.SparseArray r0 = r5.A02     // Catch:{ all -> 0x00a7 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x00a7 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x007c
            goto L_0x0082
        L_0x007c:
            long r3 = r0.longValue()     // Catch:{ all -> 0x00a7 }
            monitor-exit(r5)
            goto L_0x0085
        L_0x0082:
            monitor-exit(r5)
            r3 = 0
        L_0x0085:
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r3 = r3 + r0
            X.11P r0 = r5.A06
            long r1 = X.AnonymousClass11P.A01(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 4
            if (r0 > 0) goto L_0x0024
        L_0x0094:
            r0 = 3
            r5.A0A(r0, r6)
            X.10I r1 = r5.A0E
            X.3Cu r0 = new X.3Cu
            r0.<init>((X.C24531Kr) r5, (X.C62612rg) r9, (int) r6)
            r1.CGF(r0)
            return
        L_0x00a3:
            java.lang.String r2 = "doodle_emoji"
            goto L_0x0018
        L_0x00a7:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58532kq.A01(X.2rg):void");
    }
}
