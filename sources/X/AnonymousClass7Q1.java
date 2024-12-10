package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.7Q1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7Q1 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ C138476x9 A04;

    public final void run() {
        C138476x9 r5 = this.A04;
        UserJid userJid = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        long j = this.A02;
        AnonymousClass63I r7 = new AnonymousClass63I();
        UserJid A002 = ((AnonymousClass4S5) r5.A03.get()).A00(userJid);
        r7.A01 = Integer.valueOf(i);
        r7.A02 = Integer.valueOf(i2);
        r7.A03 = Long.valueOf(j);
        boolean z = true;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C18030ve r2 = r5.A00;
        C18040vf r1 = C18040vf.A02;
        boolean A05 = C18020vd.A05(r1, r2, 2888);
        boolean A052 = C18020vd.A05(r1, r2, 2887);
        C189729ji r0 = (C189729ji) r5.A02.get();
        if (!A05 && !A052) {
            z = false;
        }
        r0.A00(userJid, new AnonymousClass7L1(r7, A002, countDownLatch, A05, A052), z);
        try {
            countDownLatch.await();
            r5.A01.CC7(r7);
        } catch (InterruptedException e) {
            Log.e("log interrupted", e);
        }
    }

    public /* synthetic */ AnonymousClass7Q1(UserJid userJid, C138476x9 r2, int i, int i2, long j) {
        this.A04 = r2;
        this.A03 = userJid;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }
}
