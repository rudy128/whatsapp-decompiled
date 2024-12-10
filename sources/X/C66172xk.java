package X;

import com.whatsapp.cron.daily.RandomizedDailyCronWorker;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2xk  reason: invalid class name and case insensitive filesystem */
public final class C66172xk implements AnonymousClass191 {
    public final C19830z4 A00;
    public final AnonymousClass19K A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass1Cd A03;
    public final AnonymousClass00H A04;

    public final synchronized void A00(boolean z) {
        long j;
        C19830z4 r6 = this.A00;
        long j2 = C17890vO.A0B(r6).getLong("next_randomized_daily_cron", 0);
        long A012 = AnonymousClass11P.A01(this.A02);
        if (j2 <= 0 || j2 - A012 > 86400000) {
            j = (long) new Random().nextInt(43200000);
        } else if (j2 > A012) {
            A87.A02(j2);
            if (z) {
                C17880vN.A1D(C19830z4.A00(r6), "next_randomized_daily_cron", j2);
                C196269uj r4 = new C196269uj(RandomizedDailyCronWorker.class);
                r4.A02(Math.abs(j2 - A012), TimeUnit.MILLISECONDS);
                r4.A07("tag.whatsapp.cron.daily.randomized");
                ((A7W) this.A01.get()).A07((C162248Jv) r4.A00(), AnonymousClass00R.A00, "tag.whatsapp.cron.daily.randomized");
            }
        } else {
            AnonymousClass1Cd r0 = this.A03;
            r0.A06();
            if (r0.A08) {
                Iterator A0h = C17890vO.A0h(this.A04);
                while (A0h.hasNext()) {
                    ((C72113Kr) A0h.next()).Bqf();
                }
            }
            j2 += 86400000;
            if (j2 < A012) {
                j = j2 % 86400000;
            }
            A87.A02(j2);
            C17880vN.A1D(C19830z4.A00(r6), "next_randomized_daily_cron", j2);
            C196269uj r42 = new C196269uj(RandomizedDailyCronWorker.class);
            r42.A02(Math.abs(j2 - A012), TimeUnit.MILLISECONDS);
            r42.A07("tag.whatsapp.cron.daily.randomized");
            ((A7W) this.A01.get()).A07((C162248Jv) r42.A00(), AnonymousClass00R.A00, "tag.whatsapp.cron.daily.randomized");
        }
        j2 = j + A012;
        A87.A02(j2);
        C17880vN.A1D(C19830z4.A00(r6), "next_randomized_daily_cron", j2);
        C196269uj r422 = new C196269uj(RandomizedDailyCronWorker.class);
        r422.A02(Math.abs(j2 - A012), TimeUnit.MILLISECONDS);
        r422.A07("tag.whatsapp.cron.daily.randomized");
        ((A7W) this.A01.get()).A07((C162248Jv) r422.A00(), AnonymousClass00R.A00, "tag.whatsapp.cron.daily.randomized");
    }

    public void Blf() {
        A00(false);
    }

    public /* synthetic */ void Blg() {
    }

    public C66172xk(AnonymousClass11P r1, C19830z4 r2, AnonymousClass1Cd r3, AnonymousClass19K r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r4, r3, r2, r5);
        this.A02 = r1;
        this.A01 = r4;
        this.A03 = r3;
        this.A00 = r2;
        this.A04 = r5;
    }

    public void Ba9() {
    }
}
