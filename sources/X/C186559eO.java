package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9eO  reason: invalid class name and case insensitive filesystem */
public final class C186559eO {
    public final C20653ATl A00;
    public final List A01;
    public final AtomicInteger A02 = new AtomicInteger(0);
    public final AnonymousClass1XN A03;

    public C186559eO(C20653ATl aTl, AnonymousClass118 r7, AnonymousClass1XN r8) {
        C18070vi.A0e(r7, 1, r8);
        this.A03 = r8;
        this.A00 = aTl;
        int dimensionPixelSize = AnonymousClass3MW.A05(r7).getDimensionPixelSize(2131166470);
        ArrayList A11 = AnonymousClass8BR.A11(new C169118kO(dimensionPixelSize, dimensionPixelSize), new AnonymousClass9M4[1], 0);
        this.A01 = A11;
        A11.add(new Object());
        A11.add(new C169108kN(dimensionPixelSize, dimensionPixelSize));
    }
}
