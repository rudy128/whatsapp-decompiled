package X;

import java.util.concurrent.atomic.AtomicInteger;

public class A05 {
    public static final AtomicInteger A05 = new AtomicInteger(0);
    public Integer A00 = AnonymousClass00R.A00;
    public boolean A01;
    public final int A02;
    public final C190389kr A03;
    public final C20282AEq A04;

    public void A00(Integer num) {
        Integer num2 = this.A00;
        if (num != num2) {
            int intValue = num2.intValue();
            if (intValue != 0) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Already finished, cannot change to ");
                        throw AnonymousClass001.A12(AnonymousClass9OW.A00(num), A10);
                    } else if (intValue == 4) {
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("Already cancelled, cannot change to ");
                        throw AnonymousClass001.A12(AnonymousClass9OW.A00(num), A102);
                    }
                } else if (num == AnonymousClass00R.A0N) {
                    throw new IllegalArgumentException();
                }
            } else if (num == AnonymousClass00R.A0N || num == AnonymousClass00R.A0C) {
                throw new IllegalArgumentException();
            }
            this.A00 = num;
            return;
        }
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("Already in state: ");
        throw AnonymousClass001.A12(AnonymousClass9OW.A00(num), A103);
    }

    public A05(C190389kr r2, C20282AEq aEq, boolean z) {
        this.A01 = z;
        this.A04 = aEq;
        this.A03 = r2;
        this.A02 = A05.incrementAndGet();
    }
}
