package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.3Ad  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70203Ad implements AnonymousClass1TI {
    public final /* synthetic */ AnonymousClass1BI A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ AnonymousClass34B A02;
    public final /* synthetic */ C55032f6 A03;
    public final /* synthetic */ C62542rZ A04;
    public final /* synthetic */ AnonymousClass206 A05;
    public final /* synthetic */ C1418377d A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ CountDownLatch A08;

    public final void accept(Object obj) {
        C62542rZ r4 = this.A04;
        C55032f6 r3 = this.A03;
        C1418377d r8 = this.A06;
        AnonymousClass1BI r5 = this.A00;
        UserJid userJid = this.A01;
        AnonymousClass206 r7 = this.A05;
        Integer num = this.A07;
        AnonymousClass34B r2 = this.A02;
        CountDownLatch countDownLatch = this.A08;
        if (AnonymousClass000.A0M(obj) == 0) {
            r3.A01 = 1;
            r3.A03 = r4.A02(r5, userJid, r7, r8, num);
            r3.A02 = r2;
        } else {
            r3.A01 = 3;
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ C70203Ad(AnonymousClass1BI r1, UserJid userJid, AnonymousClass34B r3, C55032f6 r4, C62542rZ r5, AnonymousClass206 r6, C1418377d r7, Integer num, CountDownLatch countDownLatch) {
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r7;
        this.A00 = r1;
        this.A01 = userJid;
        this.A05 = r6;
        this.A07 = num;
        this.A02 = r3;
        this.A08 = countDownLatch;
    }
}
