package X;

/* renamed from: X.9AT  reason: invalid class name */
public abstract class AnonymousClass9AT extends C20133A8t {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (X.C22971Dz.A0a(r5) != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.A51 A00(X.AnonymousClass11S r6, X.AnonymousClass1BI r7, X.C166408cq r8, X.AnonymousClass205 r9, boolean r10) {
        /*
            java.lang.String r0 = r8.participant_
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A02(r0)
            boolean r0 = r9.A02
            if (r0 != 0) goto L_0x0042
            X.1BI r5 = r9.A00
            boolean r0 = X.C22971Dz.A0e(r5)
            r3 = 1
            if (r0 != 0) goto L_0x001a
            boolean r0 = X.C22971Dz.A0a(r5)
            r2 = 0
            if (r0 == 0) goto L_0x001b
        L_0x001a:
            r2 = 1
        L_0x001b:
            boolean r0 = r8.fromMe_
            r1 = 0
            if (r0 == 0) goto L_0x0034
            if (r2 == 0) goto L_0x0032
            if (r7 == 0) goto L_0x0032
        L_0x0024:
            r3 = 0
        L_0x0025:
            r4 = r7
        L_0x0026:
            java.lang.String r0 = r8.id_
            X.205 r1 = X.AnonymousClass205.A01(r5, r0, r3)
            X.A51 r0 = new X.A51
            r0.<init>(r4, r1)
            return r0
        L_0x0032:
            r7 = r1
            goto L_0x0024
        L_0x0034:
            boolean r0 = r6.A0O(r4)
            if (r0 != 0) goto L_0x003e
            if (r2 != 0) goto L_0x0040
            if (r10 != 0) goto L_0x0040
        L_0x003e:
            r7 = r1
            goto L_0x0025
        L_0x0040:
            r7 = r4
            goto L_0x0024
        L_0x0042:
            boolean r3 = r8.fromMe_
            X.1BI r5 = r9.A00
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9AT.A00(X.11S, X.1BI, X.8cq, X.205, boolean):X.A51");
    }

    public static A51 A01(AnonymousClass206 r4) {
        if (!r4.A0l) {
            return null;
        }
        AnonymousClass205 r3 = r4.A0v;
        return new A51(r3.A00, AnonymousClass205.A01(r4.A0H(), r3.A01, r3.A02));
    }

    public static void A02(AnonymousClass1BI r2, AnonymousClass8X7 r3, AnonymousClass205 r4) {
        AnonymousClass1BI r1 = r4.A00;
        C17960vV.A07(r1);
        AnonymousClass8X7.A00(r1, r3);
        r3.A0H(r4.A01);
        boolean z = r4.A02;
        r3.A0K(z);
        if (r2 == null) {
            return;
        }
        if ((!z && C22971Dz.A0e(r1)) || C22971Dz.A0N(r1)) {
            AnonymousClass8X7.A01(r2, r3);
        }
    }
}
