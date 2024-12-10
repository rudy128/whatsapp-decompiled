package X;

import android.content.Context;

/* renamed from: X.8yl  reason: invalid class name and case insensitive filesystem */
public class C175468yl extends C20992Ack {
    public final /* synthetic */ C33661jB A00;
    public final /* synthetic */ C33651jA A01;
    public final /* synthetic */ C21522AlV A02;
    public final /* synthetic */ BD4 A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175468yl(Context context, C33661jB r2, C33711jG r3, C33651jA r4, C21522AlV alV, BD4 bd4, AnonymousClass119 r7, boolean z) {
        super(context, r3, r7);
        this.A01 = r4;
        this.A03 = bd4;
        this.A02 = alV;
        this.A04 = z;
        this.A00 = r2;
    }

    public void A05(A7B a7b) {
        BD4 bd4 = this.A03;
        if (bd4 != null) {
            bd4.Bi4(a7b, 11);
        }
        C33661jB r0 = this.A00;
        if (r0 != null) {
            r0.C3X(a7b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if ("true".equals(r1) != false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C29621ca r10) {
        /*
            r9 = this;
            X.BD4 r2 = r9.A03
            if (r2 == 0) goto L_0x000a
            r1 = 11
            r0 = 0
            r2.Bi4(r0, r1)
        L_0x000a:
            X.8zf r5 = new X.8zf
            r5.<init>()
            X.1jA r6 = r9.A01
            X.1em r1 = r6.A07
            X.AlV r0 = r9.A02
            java.util.ArrayList r0 = r1.A04(r0, r10)
            r5.A01 = r0
            X.1ca r0 = X.AnonymousClass8BR.A0j(r10)
            if (r0 == 0) goto L_0x0062
            java.lang.String r7 = "after"
            X.ADK r4 = new X.ADK
            r4.<init>()
            X.1MD[] r3 = r0.A0S()
            if (r3 == 0) goto L_0x0060
            r2 = 0
        L_0x002f:
            int r0 = r3.length
            if (r2 >= r0) goto L_0x0060
            r0 = r3[r2]
            java.lang.String r8 = r0.A02
            java.lang.String r1 = r0.A03
            boolean r0 = r7.equals(r8)
            if (r0 == 0) goto L_0x0043
            r4.A00 = r1
        L_0x0040:
            int r2 = r2 + 1
            goto L_0x002f
        L_0x0043:
            java.lang.String r0 = "last"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "true"
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 == 0) goto L_0x005d
        L_0x005c:
            r0 = 1
        L_0x005d:
            r4.A01 = r0
            goto L_0x0040
        L_0x0060:
            r5.A00 = r4
        L_0x0062:
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x0086
            X.1QD r2 = r6.A04
            X.11P r0 = r2.A01
            long r3 = X.AnonymousClass11P.A01(r0)
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r2)
            java.lang.String r0 = "payments_all_transactions_last_sync_time"
            X.C17880vN.A1D(r1, r0, r3)
            X.1QE r2 = r2.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "updateAllTransactionsLastSyncTimeMilli to: "
            java.lang.String r0 = X.C17890vO.A0a(r0, r1, r3)
            r2.A06(r0)
        L_0x0086:
            r6.A03(r5)
            X.1jB r0 = r9.A00
            if (r0 == 0) goto L_0x0090
            r0.C3Y(r5)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175468yl.A06(X.1ca):void");
    }

    public void A04(A7B a7b) {
        A05(a7b);
    }
}
