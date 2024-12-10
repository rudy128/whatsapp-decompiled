package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2Pg  reason: invalid class name and case insensitive filesystem */
public class C49122Pg extends A34 {
    public int A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass1Q2 A02;
    public final C58842lL A03;
    public final AW0 A04;
    public final UserJid A05;
    public final C31061ex A06;
    public final AnonymousClass1QS A07;
    public final AnonymousClass1PP A08;
    public final Runnable A09;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.21F, X.206] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r14) {
        /*
            r13 = this;
            int r4 = r13.A00
            r0 = 15
            if (r4 != r0) goto L_0x0089
            X.1PP r1 = r13.A08
            X.AW0 r7 = r13.A04
            X.1BI r0 = r7.A0C
            X.205 r3 = X.C17880vN.A0Z(r0, r1)
            X.11P r5 = r13.A01
            long r0 = X.AnonymousClass11P.A01(r5)
            r2 = 21
            X.21G r6 = new X.21G
            r6.<init>(r3, r2, r0)
            r1 = 0
            r6.A02 = r1
        L_0x0020:
            r6.A02 = r1
            java.lang.String r0 = r7.A0L
            X.C18070vi.A0d(r0, r1)
            r6.A00 = r0
            com.whatsapp.jid.UserJid r0 = r13.A05
            r6.A0d(r0)
            X.1ex r3 = r13.A06
            X.1QO r0 = r3.A0A
            boolean r0 = r0.A04(r1)
            if (r0 != 0) goto L_0x0078
            X.1QE r2 = r3.A0D
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "decline/cancelPaymentRequest is not enabled for country: "
            r1.append(r0)
            X.1QJ r0 = r3.A09
            X.2tK r0 = r0.A02()
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
        L_0x004d:
            r2.A06(r0)
        L_0x0050:
            int r9 = r7.A02
            r7.A02 = r4
            long r0 = X.AnonymousClass11P.A01(r5)
            r7.A06 = r0
            X.1QS r0 = r13.A07
            X.AnonymousClass1QS.A00(r0)
            X.1QR r6 = r0.A04
            X.1BI r2 = r7.A0C
            boolean r1 = r7.A0Q
            java.lang.String r0 = r7.A0L
            X.205 r8 = X.AnonymousClass205.A01(r2, r0, r1)
            r11 = -1
            r10 = 0
            r6.A0f(r7, r8, r9, r10, r11)
            X.2lL r0 = r13.A03
            X.206 r0 = r0.A00(r7)
            return r0
        L_0x0078:
            X.205 r0 = r6.A0v
            X.1BI r0 = r0.A00
            if (r0 != 0) goto L_0x0083
            X.1QE r2 = r3.A0D
            java.lang.String r0 = "requestPayment found null or empty args jid"
            goto L_0x004d
        L_0x0083:
            X.121 r0 = r3.A03
            r0.BBY(r6)
            goto L_0x0050
        L_0x0089:
            r0 = 18
            if (r4 != r0) goto L_0x00a7
            X.1PP r1 = r13.A08
            X.AW0 r7 = r13.A04
            X.1BI r0 = r7.A0C
            X.205 r3 = X.C17880vN.A0Z(r0, r1)
            X.11P r5 = r13.A01
            long r1 = X.AnonymousClass11P.A01(r5)
            r0 = 22
            X.21I r6 = new X.21I
            r6.<init>(r3, r0, r1)
            r1 = 0
            goto L_0x0020
        L_0x00a7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Transaction status is not cancelled or rejected, status: "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r4)
            java.lang.String r0 = "PaymentsMessageHandler"
            java.lang.String r0 = X.AnonymousClass1QE.A01(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49122Pg.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass206 r4 = (AnonymousClass206) obj;
        if (r4 != null) {
            AW0 A002 = AnonymousClass25B.A00(r4);
            A002.A02 = this.A00;
            A002.A06 = AnonymousClass11P.A01(this.A01);
            AnonymousClass1Q2.A00(this.A02, r4, 16);
        }
        this.A09.run();
    }

    public C49122Pg(AnonymousClass11P r1, AnonymousClass1Q2 r2, C58842lL r3, AW0 aw0, UserJid userJid, C31061ex r6, AnonymousClass1QS r7, AnonymousClass1PP r8, Runnable runnable, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A08 = r8;
        this.A07 = r7;
        this.A03 = r3;
        this.A06 = r6;
        this.A04 = aw0;
        this.A05 = userJid;
        this.A00 = i;
        this.A09 = runnable;
    }
}
