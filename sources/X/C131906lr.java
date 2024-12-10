package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6lr  reason: invalid class name and case insensitive filesystem */
public class C131906lr {
    public final AtomicInteger A00 = new AtomicInteger();
    public final AnonymousClass18K A01;

    public void A00(Boolean bool, Boolean bool2, int i) {
        AnonymousClass633 r1 = new AnonymousClass633();
        r1.A03 = C17880vN.A0n(this.A00.getAndIncrement());
        r1.A02 = Integer.valueOf(i);
        r1.A00 = bool;
        r1.A01 = bool2;
        this.A01.CC7(r1);
    }

    public C131906lr(AnonymousClass18K r2) {
        this.A01 = r2;
    }
}
