package X;

import java.lang.ref.WeakReference;

/* renamed from: X.6ME  reason: invalid class name */
public final class AnonymousClass6ME extends A34 {
    public final AnonymousClass1KB A00;
    public final C72403Lu A01;
    public final Integer A02;
    public final WeakReference A03;
    public final AnonymousClass11P A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6ME(AnonymousClass1FU r3, AnonymousClass1KB r4, AnonymousClass11P r5, C72403Lu r6, Integer num) {
        super(r3, true);
        C18070vi.A0d(num, 4);
        this.A00 = r4;
        this.A01 = r6;
        this.A02 = num;
        this.A04 = r5;
        this.A03 = AnonymousClass3MW.A0z(r3);
    }

    public void A0F() {
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.A03);
        if (A0Z != null && !A0Z.Bed()) {
            A0Z.CNB(0, 2131895077);
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.A03);
        if (A0Z != null && !A0Z.Bed()) {
            A0Z.CEx();
            this.A01.CDp(this.A02);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.util.concurrent.Future} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.util.concurrent.Future} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.concurrent.Future} */
    /* JADX WARNING: type inference failed for: r11v2, types: [X.Bly, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r22) {
        /*
            r21 = this;
            long r8 = android.os.SystemClock.elapsedRealtime()
            r3 = r21
            X.3Lu r2 = r3.A01
            java.lang.Integer r5 = r3.A02
            com.whatsapp.report.ReportActivity r2 = (com.whatsapp.report.ReportActivity) r2
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.7Fd r1 = com.whatsapp.report.ReportActivity.A03(r2, r5)
            r4 = 0
            if (r1 == 0) goto L_0x0027
            boolean r0 = r1 instanceof X.C120676Ev
            if (r0 == 0) goto L_0x004f
            r2.A4b()
            X.5qs r11 = new X.5qs
            r11.<init>()
            r11.A03(r4)
        L_0x0026:
            r4 = r11
        L_0x0027:
            r5 = 0
            if (r4 != 0) goto L_0x0037
            java.lang.String r0 = "SendDeleteGdprReportTask/doInBackground/failed/callback is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1KB r1 = r3.A00
            r0 = 34
            X.C146767Qn.A00(r1, r3, r0)
        L_0x0036:
            return r5
        L_0x0037:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00d3 }
            r0 = 32000(0x7d00, double:1.581E-319)
            r4.get(r0, r2)     // Catch:{ all -> 0x00d3 }
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r8
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0036
            long r1 = r1 - r3
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0036 }
            goto L_0x00d2
        L_0x004f:
            X.6mB r13 = r2.A08
            if (r13 == 0) goto L_0x00e1
            r0 = 31
            X.7Qn r14 = new X.7Qn
            r14.<init>(r1, r0)
            X.7LH r12 = new X.7LH
            r12.<init>(r1, r2)
            X.00H r4 = r13.A01
            java.lang.String r2 = X.C17890vO.A0T(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GdprXmppMethods/sendDeleteGdprReport; iq="
            X.C17900vP.A0f(r0, r2, r1)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.lang.String r1 = "action"
            java.lang.String r0 = "delete"
            X.C17890vO.A11(r1, r0, r6)
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r5 != r0) goto L_0x0084
            java.lang.String r1 = "report_type"
            java.lang.String r0 = "newsletters"
            X.C17890vO.A11(r1, r0, r6)
        L_0x0084:
            r5 = 0
            X.1MD[] r0 = new X.AnonymousClass1MD[r5]
            java.lang.Object[] r1 = r6.toArray(r0)
            X.1MD[] r1 = (X.AnonymousClass1MD[]) r1
            java.lang.String r0 = "gdpr"
            X.1ca r7 = new X.1ca
            r7.<init>(r0, r1)
            r0 = 4
            X.1MD[] r6 = new X.AnonymousClass1MD[r0]
            java.lang.String r1 = "to"
            X.8v4 r0 = X.C173438v4.A00
            X.C17880vN.A1I(r0, r1, r6, r5)
            java.lang.String r5 = "xmlns"
            java.lang.String r0 = "urn:xmpp:whatsapp:account"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r5, (java.lang.String) r0)
            r0 = 1
            r6[r0] = r1
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.C17890vO.A12(r1, r0, r6)
            java.lang.String r0 = "id"
            X.1ca r16 = X.C29621ca.A01(r7, r0, r2, r6)
            X.5qs r11 = new X.5qs
            r11.<init>()
            r15 = 1
            X.7LP r10 = new X.7LP
            r10.<init>(r11, r12, r13, r14, r15)
            X.1OZ r14 = X.C17880vN.A0U(r4)
            r18 = 169(0xa9, float:2.37E-43)
            r19 = 32000(0x7d00, double:1.581E-319)
            r15 = r10
            r17 = r2
            r14.A0I(r15, r16, r17, r18, r19)
            goto L_0x0026
        L_0x00d2:
            return r5
        L_0x00d3:
            r1 = move-exception
            java.lang.String r0 = "SendDeleteGdprReportTask/doInBackground/timeout"
            com.whatsapp.util.Log.w(r0, r1)
            X.1KB r1 = r3.A00
            r0 = 34
            X.C146767Qn.A00(r1, r3, r0)
            return r5
        L_0x00e1:
            java.lang.String r0 = "gdprXmppMethods"
            X.C18070vi.A11(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6ME.A0G(java.lang.Object[]):java.lang.Object");
    }
}
