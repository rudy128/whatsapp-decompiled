package X;

import java.lang.ref.WeakReference;

/* renamed from: X.6Le  reason: invalid class name and case insensitive filesystem */
public class C121706Le extends A34 {
    public final C72403Lu A00;
    public final Integer A01;
    public final WeakReference A02;

    public C121706Le(AnonymousClass1FU r2, C72403Lu r3, Integer num) {
        super(r2, true);
        this.A00 = r3;
        this.A01 = num;
        this.A02 = AnonymousClass3MW.A0z(r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.util.concurrent.Future} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.util.concurrent.Future} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.util.concurrent.Future} */
    /* JADX WARNING: type inference failed for: r1v12, types: [X.Bly, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r13) {
        /*
            r12 = this;
            X.3Lu r3 = r12.A00
            java.lang.Integer r2 = r12.A01
            com.whatsapp.report.ReportActivity r3 = (com.whatsapp.report.ReportActivity) r3
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.7Fd r1 = com.whatsapp.report.ReportActivity.A03(r3, r2)
            r4 = 0
            if (r1 == 0) goto L_0x0021
            boolean r0 = r1 instanceof X.C120676Ev
            if (r0 == 0) goto L_0x002a
            r3.A4b()
            X.5qs r1 = new X.5qs
            r1.<init>()
            r1.A03(r4)
        L_0x0020:
            r4 = r1
        L_0x0021:
            r3 = 0
            if (r4 != 0) goto L_0x00a3
            java.lang.String r0 = "SendGetGdprReportTask/send-get-gdpr-report/failed/callback is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        L_0x002a:
            X.6mB r5 = r3.A08
            if (r5 == 0) goto L_0x00b2
            X.6cY r4 = new X.6cY
            r4.<init>(r1)
            X.00H r3 = r5.A01
            java.lang.String r8 = X.C17890vO.A0T(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GdprXmppMethods/sendGetGdprReport; iq="
            X.C17900vP.A0f(r0, r8, r1)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.lang.String r1 = "action"
            java.lang.String r0 = "status"
            X.C17890vO.A11(r1, r0, r6)
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r2 != r0) goto L_0x0058
            java.lang.String r1 = "report_type"
            java.lang.String r0 = "newsletters"
            X.C17890vO.A11(r1, r0, r6)
        L_0x0058:
            r2 = 0
            X.1MD[] r0 = new X.AnonymousClass1MD[r2]
            java.lang.Object[] r1 = r6.toArray(r0)
            X.1MD[] r1 = (X.AnonymousClass1MD[]) r1
            java.lang.String r0 = "gdpr"
            X.1ca r7 = new X.1ca
            r7.<init>(r0, r1)
            r0 = 4
            X.1MD[] r6 = new X.AnonymousClass1MD[r0]
            java.lang.String r1 = "to"
            X.8v4 r0 = X.C173438v4.A00
            X.C17880vN.A1I(r0, r1, r6, r2)
            java.lang.String r2 = "xmlns"
            java.lang.String r0 = "urn:xmpp:whatsapp:account"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 1
            r6[r0] = r1
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.C17890vO.A12(r1, r0, r6)
            java.lang.String r0 = "id"
            X.1ca r7 = X.C29621ca.A01(r7, r0, r8, r6)
            X.5qs r1 = new X.5qs
            r1.<init>()
            r0 = 7
            X.7LL r6 = new X.7LL
            r6.<init>(r5, r4, r1, r0)
            X.1OZ r5 = X.C17880vN.A0U(r3)
            r9 = 168(0xa8, float:2.35E-43)
            r10 = 32000(0x7d00, double:1.581E-319)
            r5.A0I(r6, r7, r8, r9, r10)
            goto L_0x0020
        L_0x00a3:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00ab }
            r0 = 32000(0x7d00, double:1.581E-319)
            r4.get(r0, r2)     // Catch:{ all -> 0x00ab }
            return r3
        L_0x00ab:
            r1 = move-exception
            java.lang.String r0 = "SendGetGdprReportTask/send-get-gdpr-report/timeout"
            com.whatsapp.util.Log.w(r0, r1)
            return r3
        L_0x00b2:
            java.lang.String r0 = "gdprXmppMethods"
            X.C18070vi.A11(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121706Le.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.A02);
        if (A0Z != null && !A0Z.Bed()) {
            this.A00.CDp(this.A01);
        }
    }
}
