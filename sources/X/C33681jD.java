package X;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1jD  reason: invalid class name and case insensitive filesystem */
public class C33681jD implements C26181Rd, AnonymousClass11J {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass1KB A02;
    public final C23651Hc A03;
    public final AnonymousClass11E A04;
    public final C33671jC A05;
    public final C33651jA A06;
    public final AnonymousClass1QL A07;
    public final AnonymousClass1QD A08;
    public final AnonymousClass1QE A09 = AnonymousClass1QE.A00("PaymentsConnectivityManager", "network", "COMMON");
    public final AnonymousClass00H A0A = C221618v.A00(AnonymousClass16J.class);

    public synchronized void Bps(C59732mn r5) {
        AnonymousClass1QE r3 = this.A09;
        StringBuilder sb = new StringBuilder();
        sb.append("Connectivity connected: ");
        boolean z = r5.A02;
        sb.append(z);
        r3.A06(sb.toString());
        if (this.A00 && !z) {
            A00();
        }
    }

    public synchronized void BvR() {
        AnonymousClass1QL r0;
        this.A09.A06("ChatConnectivity connected");
        if (this.A00 && (r0 = this.A07) != null && r0.A0F()) {
            AnonymousClass1QD r1 = this.A08;
            if (AnonymousClass11P.A01(r1.A01) - r1.A03().getLong("payments_pending_transactions_last_sync_time", 0) > TimeUnit.DAYS.toMillis(1)) {
                this.A05.A00(new C20760AXp(this, 0));
            }
        }
    }

    public /* synthetic */ void BvS() {
    }

    public synchronized void BvT() {
        this.A09.A06("ChatConnectivity disconnected");
        if (this.A00) {
            A00();
        }
    }

    public /* synthetic */ void BvU() {
    }

    public /* synthetic */ void BvV() {
    }

    private void A00() {
        Set keySet;
        C33661jB r2;
        AnonymousClass00H r6 = this.A0A;
        AnonymousClass16J r5 = (AnonymousClass16J) r6.get();
        synchronized (r5) {
            keySet = r5.A00.keySet();
        }
        for (Object next : keySet) {
            AnonymousClass16J r52 = (AnonymousClass16J) r6.get();
            synchronized (r52) {
                r2 = (C33661jB) r52.A00.get(next);
            }
            A7B a7b = new A7B(7);
            AnonymousClass16J r53 = (AnonymousClass16J) r6.get();
            synchronized (r53) {
                r53.A01.remove(next);
            }
            r2.C3X(a7b);
        }
        ((AnonymousClass16J) r6.get()).A00();
        this.A01 = false;
    }

    public C33681jD(AnonymousClass1KB r4, C23651Hc r5, AnonymousClass11E r6, AnonymousClass1QL r7, AnonymousClass1QD r8, C33671jC r9, C33651jA r10) {
        this.A02 = r4;
        this.A03 = r5;
        this.A08 = r8;
        this.A07 = r7;
        this.A06 = r10;
        this.A04 = r6;
        this.A05 = r9;
    }
}
