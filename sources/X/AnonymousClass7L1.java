package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.7L1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7L1 implements B9F {
    public final /* synthetic */ AnonymousClass63I A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ CountDownLatch A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public final void Bx7(Integer num) {
        int intValue;
        boolean z = this.A03;
        AnonymousClass63I r4 = this.A00;
        boolean z2 = this.A04;
        UserJid userJid = this.A01;
        CountDownLatch countDownLatch = this.A02;
        if (z) {
            r4.A00 = num;
        }
        if (z2 && num != null && ((intValue = num.intValue()) == 2 || intValue == 3)) {
            r4.A04 = userJid.getRawString();
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ AnonymousClass7L1(AnonymousClass63I r1, UserJid userJid, CountDownLatch countDownLatch, boolean z, boolean z2) {
        this.A03 = z;
        this.A00 = r1;
        this.A04 = z2;
        this.A01 = userJid;
        this.A02 = countDownLatch;
    }
}
