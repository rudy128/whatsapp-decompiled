package X;

/* renamed from: X.1jC  reason: invalid class name and case insensitive filesystem */
public class C33671jC implements C33661jB {
    public int A00;
    public int A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass1QR A03;
    public final AnonymousClass1QD A04;
    public final AnonymousClass1QS A05;
    public final AnonymousClass1QE A06 = AnonymousClass1QE.A00("PaymentUnfinishedTransactionsSyncer", "network", "COMMON");
    public final AnonymousClass1QL A07;
    public final AnonymousClass1QO A08;
    public final AnonymousClass10I A09;

    public synchronized void A00(AnonymousClass3LD r4) {
        if (!this.A08.A04(0) || !this.A07.A0F()) {
            this.A06.A06("skipped as account setup is incomplete.");
        } else {
            this.A09.CGF(new C70653Bz(this, r4, 30));
        }
    }

    public void C3L(A7B a7b) {
        AnonymousClass1QE r2 = this.A06;
        StringBuilder sb = new StringBuilder();
        sb.append("onRequestError: ");
        sb.append(a7b);
        r2.A05(sb.toString());
        BD4 BRb = this.A05.A06().BRb();
        if (BRb != null) {
            BRb.Bi4(a7b, 10);
        }
    }

    public void C3X(A7B a7b) {
        AnonymousClass1QE r2 = this.A06;
        StringBuilder sb = new StringBuilder();
        sb.append("onResponseError: ");
        sb.append(a7b);
        r2.A05(sb.toString());
        BD4 BRb = this.A05.A06().BRb();
        if (BRb != null) {
            BRb.Bi4(a7b, 10);
        }
    }

    public void C3Y(C186089dd r6) {
        BD4 BRb = this.A05.A06().BRb();
        if (BRb != null) {
            BRb.Bi4((A7B) null, 10);
        }
        if (r6.A02) {
            int i = this.A00 + 1;
            this.A00 = i;
            AnonymousClass1QE r4 = this.A06;
            StringBuilder sb = new StringBuilder();
            sb.append("finished syncing ");
            sb.append(i);
            sb.append(" transactions; total to sync: ");
            sb.append(this.A01);
            r4.A06(sb.toString());
            if (this.A01 == this.A00) {
                long A012 = AnonymousClass11P.A01(this.A02);
                this.A04.A03().edit().putLong("payments_pending_transactions_last_sync_time", A012).apply();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("updatePendingTransactionsLastSyncTimeMilli to: ");
                sb2.append(A012);
                r4.A06(sb2.toString());
            }
        }
    }

    public C33671jC(AnonymousClass11P r4, AnonymousClass1QR r5, AnonymousClass1QL r6, AnonymousClass1QD r7, AnonymousClass1QO r8, AnonymousClass1QS r9, AnonymousClass10I r10) {
        this.A02 = r4;
        this.A09 = r10;
        this.A05 = r9;
        this.A04 = r7;
        this.A07 = r6;
        this.A08 = r8;
        this.A03 = r5;
    }
}
