package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.36X  reason: invalid class name */
public final class AnonymousClass36X implements B9F {
    public final /* synthetic */ C55842gS A00;
    public final /* synthetic */ CountDownLatch A01;

    public AnonymousClass36X(C55842gS r1, CountDownLatch countDownLatch) {
        this.A00 = r1;
        this.A01 = countDownLatch;
    }

    public void Bx7(Integer num) {
        this.A00.A00 = C17900vP.A08(num);
        this.A01.countDown();
    }
}
