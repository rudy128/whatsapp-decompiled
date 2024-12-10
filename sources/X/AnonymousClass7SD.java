package X;

/* renamed from: X.7SD  reason: invalid class name */
public class AnonymousClass7SD implements C18080vj, AnonymousClass1OS {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008e, code lost:
        if (r5.contains(java.lang.Character.valueOf(r6.charAt(r4 + 1))) != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0092, code lost:
        if (r3 == 10) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            r7 = r11
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x005b;
                case 1: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r0 = 0
            return r0
        L_0x0008:
            java.lang.Object r4 = r9.A01
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity r4 = (com.whatsapp.payments.ui.BrazilOrderDetailsActivity) r4
            java.lang.Object r5 = r9.A02
            X.21K r5 = (X.AnonymousClass21K) r5
            java.lang.Object r6 = r9.A03
            X.73o r10 = (X.C1409173o) r10
            X.6uk r7 = (X.C136996uk) r7
            java.io.File r0 = r7.A03()
            if (r0 == 0) goto L_0x0006
            X.AEt r0 = r5.BPK()
            if (r0 == 0) goto L_0x0035
            X.AEE r0 = r0.A05
            if (r0 == 0) goto L_0x0035
            X.AEi r0 = r0.A00
            if (r0 == 0) goto L_0x0035
            X.10I r0 = r4.A05
            r8 = 7
            X.7Py r3 = new X.7Py
            r3.<init>(r4, r5, r6, r7, r8)
            r0.CGF(r3)
        L_0x0035:
            boolean r0 = r10.A03()
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity.A0s(r4, r0)
            java.io.File r3 = r7.A03()
            monitor-enter(r7)
            java.lang.String r2 = r7.A0C     // Catch:{ all -> 0x009b }
            monitor-exit(r7)
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = X.C108945cZ.A0G(r0)
            android.net.Uri r0 = X.C64062u9.A02(r4, r3)
            r1.setDataAndType(r0, r2)
            r0 = 1
            r1.setFlags(r0)
            X.1L9 r0 = r4.A01
            r0.A08(r4, r1)
            goto L_0x0006
        L_0x005b:
            java.lang.Object r0 = r9.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r6 = r9.A02
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.Object r5 = r9.A03
            java.util.List r5 = (java.util.List) r5
            int r4 = X.AnonymousClass000.A0M(r10)
            java.lang.Character r7 = (java.lang.Character) r7
            char r3 = r7.charValue()
            r2 = 1
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x0099
            int r0 = r6.length()
            r1 = 1
            int r0 = r0 - r2
            if (r4 >= r0) goto L_0x0090
            int r0 = r4 + 1
            char r0 = r6.charAt(r0)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x0094
        L_0x0090:
            r0 = 10
            if (r3 != r0) goto L_0x0099
        L_0x0094:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L_0x0099:
            r1 = 0
            goto L_0x0094
        L_0x009b:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7SD.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public AnonymousClass7SD(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }
}
