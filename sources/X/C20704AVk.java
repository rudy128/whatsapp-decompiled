package X;

/* renamed from: X.AVk  reason: case insensitive filesystem */
public class C20704AVk implements C25471Oi {
    public final AnonymousClass2L2 A00;
    public final AnonymousClass11S A01;
    public final C192789oz A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass118 A04;
    public final AnonymousClass121 A05;
    public final A0E A06;
    public final AnonymousClass1QR A07;
    public final C25011Mn A08;
    public final C48052Kz A09;
    public final AnonymousClass1QD A0A;
    public final C33681jD A0B;
    public final AnonymousClass1QO A0C;
    public final AnonymousClass1W6 A0D;
    public final AnonymousClass11A A0E;

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvt(C63362sw r1) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01cc, code lost:
        if (r13.A0B <= 0) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ce, code lost:
        r0 = X.C108945cZ.A0s(r13.A0v, r12.A0D);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01d6, code lost:
        if (r0 == null) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01d8, code lost:
        r1 = X.AnonymousClass8BT.A0z();
        r1.add(r0);
        r12.A05.BIL(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e6, code lost:
        return X.C20700AVg.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.B5J BCv(X.AnonymousClass206 r13, X.C63362sw r14) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.AnonymousClass23U
            if (r0 != 0) goto L_0x01f1
            X.206 r1 = r13.A0K()
            if (r1 == 0) goto L_0x000f
            X.1QR r0 = r12.A07
            r0.A0Z(r1)
        L_0x000f:
            boolean r0 = r13 instanceof X.AnonymousClass21L
            if (r0 == 0) goto L_0x0024
            com.whatsapp.jid.UserJid r3 = r14.A05()
            X.C17960vV.A07(r3)
            r2 = r13
            X.21L r2 = (X.AnonymousClass21L) r2
            X.9oz r1 = r12.A02
            X.118 r0 = r12.A04
            X.C181619Re.A00(r1, r0, r3, r2)
        L_0x0024:
            java.lang.Class<X.AW0> r0 = X.AW0.class
            X.B5K r2 = r14.A06(r0)
            X.AW0 r2 = (X.AW0) r2
            X.1QO r0 = r12.A0C
            boolean r0 = r0.A03()
            r9 = 0
            if (r0 != 0) goto L_0x004e
            X.1jD r3 = r12.A0B
            monitor-enter(r3)
            boolean r0 = r3.A01     // Catch:{ all -> 0x01ed }
            monitor-exit(r3)
            if (r0 != 0) goto L_0x004e
            if (r2 == 0) goto L_0x004e
            monitor-enter(r2)
            int r1 = r2.A03     // Catch:{ all -> 0x01e7 }
            r0 = 2
            if (r1 == r0) goto L_0x00d7
            r0 = 20
            if (r1 == r0) goto L_0x00d7
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x00d7
            monitor-exit(r2)
        L_0x004e:
            X.AW0 r4 = X.AnonymousClass25B.A00(r13)
            if (r4 == 0) goto L_0x0069
            X.1QR r2 = r12.A07
            X.AW0 r5 = X.AnonymousClass25B.A00(r13)
            X.C17960vV.A07(r5)
            int r1 = r5.A03
            r0 = 5
            if (r1 != r0) goto L_0x0077
            X.1QE r1 = r2.A04
            java.lang.String r0 = "verifyPaymentAcceptedRequest type future"
        L_0x0066:
            r1.A05(r0)
        L_0x0069:
            boolean r0 = r13 instanceof X.AnonymousClass21F
            if (r0 == 0) goto L_0x01f1
            r0 = r13
            X.21F r0 = (X.AnonymousClass21F) r0
            java.lang.String r1 = r0.A00
            X.A0E r2 = r12.A06
            monitor-enter(r2)
            goto L_0x0127
        L_0x0077:
            boolean r0 = X.C20128A8n.A07(r5)
            if (r0 == 0) goto L_0x0082
            X.1QE r1 = r2.A04
            java.lang.String r0 = "verifyPaymentAcceptedRequest empty transaction"
            goto L_0x0066
        L_0x0082:
            java.lang.String r0 = r5.A0M
            r3 = 0
            X.AW0 r2 = X.AnonymousClass8BU.A0J(r2, r0, r3)
            if (r2 == 0) goto L_0x00d4
            com.whatsapp.jid.UserJid r0 = r13.A0I()
            boolean r0 = r2.A0Q(r0)
            if (r0 == 0) goto L_0x00d4
            monitor-enter(r2)
            com.whatsapp.jid.UserJid r1 = r5.A0E     // Catch:{ all -> 0x01ea }
            if (r1 == 0) goto L_0x00a8
            com.whatsapp.jid.UserJid r0 = r2.A0E     // Catch:{ all -> 0x01ea }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01ea }
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "Pay: PaymentTransactionInfoData canBeAcceptedWithTransaction: sender mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01ea }
            goto L_0x00d3
        L_0x00a8:
            java.lang.String r1 = r2.A0I     // Catch:{ all -> 0x01ea }
            if (r1 == 0) goto L_0x00ce
            java.lang.String r0 = r5.A0I     // Catch:{ all -> 0x01ea }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01ea }
            if (r0 == 0) goto L_0x00ce
            X.1KN r1 = r2.A09     // Catch:{ all -> 0x01ea }
            if (r1 == 0) goto L_0x00ce
            X.1KN r0 = r5.A09     // Catch:{ all -> 0x01ea }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01ea }
            if (r0 == 0) goto L_0x00ce
            monitor-exit(r2)
            X.11A r2 = r12.A0E
            r1 = 47
            X.3Bz r0 = new X.3Bz
            r0.<init>(r12, r4, r1)
            r2.A00(r0)
            goto L_0x0069
        L_0x00ce:
            java.lang.String r0 = "PAY: PaymentTransactionInfoData canBeAcceptedWithTransaction: amount mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01ea }
        L_0x00d3:
            monitor-exit(r2)
        L_0x00d4:
            r5.A0M = r3
            goto L_0x0069
        L_0x00d7:
            monitor-exit(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PaymentsIncomingMessageListener/PAY: received payment message with payments not enabled: "
            X.C63362sw.A01(r14, r0, r1)
            java.lang.String r0 = " "
            r1.append(r0)
            java.lang.String r0 = r2.A0K
            r1.append(r0)
            java.lang.String r0 = "; getting server props"
            X.C17890vO.A1A(r1, r0)
            X.1Mn r0 = r12.A08
            r0.A04(r9)
            monitor-enter(r3)
            r0 = 1
            r3.A01 = r0     // Catch:{ all -> 0x01ed }
            monitor-exit(r3)
            X.11S r1 = r12.A01
            com.whatsapp.jid.UserJid r0 = r2.A0D
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x004e
            X.1QD r4 = r12.A0A
            X.11P r0 = r12.A03
            long r2 = X.AnonymousClass11P.A01(r0)
            long r0 = X.AnonymousClass8BW.A05()
            long r2 = r2 + r0
            r4.A0E(r9, r2)
            X.11A r3 = r12.A0E
            X.2Kz r2 = r12.A09
            r2.getClass()
            r1 = 24
            X.Ajs r0 = new X.Ajs
            r0.<init>((java.lang.Object) r2, (int) r1)
            r3.A00(r0)
            goto L_0x004e
        L_0x0127:
            X.1QS r0 = r2.A04     // Catch:{ all -> 0x01e7 }
            X.1QR r5 = X.AnonymousClass8BR.A0O(r0)     // Catch:{ all -> 0x01e7 }
            X.C18070vi.A0X(r5)     // Catch:{ all -> 0x01e7 }
            r0 = 0
            X.AW0 r3 = X.AnonymousClass8BU.A0J(r5, r1, r0)     // Catch:{ all -> 0x01e7 }
            if (r3 == 0) goto L_0x01c9
            com.whatsapp.jid.UserJid r0 = r13.A0I()     // Catch:{ all -> 0x01e7 }
            boolean r0 = r3.A0Q(r0)     // Catch:{ all -> 0x01e7 }
            if (r0 == 0) goto L_0x01c9
            X.00H r0 = r2.A05     // Catch:{ all -> 0x01e7 }
            X.2lL r0 = X.AnonymousClass8BR.A0N(r0)     // Catch:{ all -> 0x01e7 }
            X.206 r4 = r0.A00(r3)     // Catch:{ all -> 0x01e7 }
            if (r4 == 0) goto L_0x0192
            int r8 = r3.A02     // Catch:{ all -> 0x01e7 }
            boolean r0 = X.A0E.A00(r2, r3, r13)     // Catch:{ all -> 0x01e7 }
            if (r0 == 0) goto L_0x01c9
            X.11P r0 = r2.A00     // Catch:{ all -> 0x01e7 }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x01e7 }
            r3.A06 = r0     // Catch:{ all -> 0x01e7 }
            X.AnonymousClass25B.A02(r3, r4)     // Catch:{ all -> 0x01e7 }
            X.205 r7 = r4.A0v     // Catch:{ all -> 0x01e7 }
            X.AW0 r6 = X.AnonymousClass25B.A00(r4)     // Catch:{ all -> 0x01e7 }
            X.C17960vV.A07(r6)     // Catch:{ all -> 0x01e7 }
            r10 = 0
            boolean r0 = r5.A0f(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01e7 }
            if (r0 == 0) goto L_0x01c9
            java.lang.String r5 = "CoreMessageStore"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = "msgStore/markPaymentRequestMessageResponded request message id: "
            r1.append(r0)     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = r3.A0L     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x01e7 }
            X.AnonymousClass8BS.A1G(r5, r0)     // Catch:{ all -> 0x01e7 }
            X.1Q2 r1 = r2.A02     // Catch:{ all -> 0x01e7 }
            r0 = 16
            r1.A01(r4, r0)     // Catch:{ all -> 0x01e7 }
            X.1QB r0 = r2.A01     // Catch:{ all -> 0x01e7 }
            r0.A0L(r4)     // Catch:{ all -> 0x01e7 }
            goto L_0x01f0
        L_0x0192:
            boolean r0 = X.A0E.A00(r2, r3, r13)     // Catch:{ all -> 0x01e7 }
            if (r0 == 0) goto L_0x01c9
            X.11P r0 = r2.A00     // Catch:{ all -> 0x01e7 }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x01e7 }
            r3.A06 = r0     // Catch:{ all -> 0x01e7 }
            boolean r0 = r5.A0c(r3)     // Catch:{ all -> 0x01e7 }
            if (r0 == 0) goto L_0x01c9
            java.lang.String r4 = "CoreMessageStore"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = "msgStore/markPaymentRequestMessageResponded request message id: "
            r1.append(r0)     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = r3.A0L     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x01e7 }
            X.AnonymousClass8BS.A1G(r4, r0)     // Catch:{ all -> 0x01e7 }
            X.1ib r5 = r2.A03     // Catch:{ all -> 0x01e7 }
            X.10I r4 = r5.A06     // Catch:{ all -> 0x01e7 }
            r1 = 25
            X.3Bz r0 = new X.3Bz     // Catch:{ all -> 0x01e7 }
            r0.<init>(r5, r3, r1)     // Catch:{ all -> 0x01e7 }
            r4.CGF(r0)     // Catch:{ all -> 0x01e7 }
            goto L_0x01f0
        L_0x01c9:
            monitor-exit(r2)
            int r0 = r13.A0B
            if (r0 <= 0) goto L_0x01e4
            X.1W6 r1 = r12.A0D
            X.205 r0 = r13.A0v
            X.206 r0 = X.C108945cZ.A0s(r0, r1)
            if (r0 == 0) goto L_0x01e4
            java.util.ArrayList r1 = X.AnonymousClass8BT.A0z()
            r1.add(r0)
            X.121 r0 = r12.A05
            r0.BIL(r1, r9)
        L_0x01e4:
            X.AVg r0 = X.C20700AVg.A00
            return r0
        L_0x01e7:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01ea:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01ed:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01f0:
            monitor-exit(r2)
        L_0x01f1:
            X.AVf r0 = X.C20699AVf.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20704AVk.BCv(X.206, X.2sw):X.B5J");
    }

    public void Bvr(C166278cd r4, AnonymousClass206 r5, C63362sw r6) {
        AW0 aw0 = (AW0) r6.A06(AW0.class);
        if (aw0 != null) {
            String str = aw0.A0K;
            if (str == null) {
                str = "UNSET";
            }
            AnonymousClass25B.A03(r5, new AnonymousClass25E(aw0, str));
        }
    }

    public C20704AVk(AnonymousClass11S r1, C192789oz r2, AnonymousClass11P r3, AnonymousClass118 r4, AnonymousClass121 r5, A0E a0e, AnonymousClass1QR r7, C25011Mn r8, C48052Kz r9, AnonymousClass1QD r10, AnonymousClass2L2 r11, C33681jD r12, AnonymousClass1QO r13, AnonymousClass1W6 r14, AnonymousClass11A r15) {
        this.A03 = r3;
        this.A01 = r1;
        this.A04 = r4;
        this.A08 = r8;
        this.A0D = r14;
        this.A0E = r15;
        this.A02 = r2;
        this.A0A = r10;
        this.A05 = r5;
        this.A0C = r13;
        this.A09 = r9;
        this.A07 = r7;
        this.A00 = r11;
        this.A0B = r12;
        this.A06 = a0e;
    }

    public String BSr() {
        return "PaymentsIncomingMessageListener";
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }
}
