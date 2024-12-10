package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.1pm  reason: invalid class name and case insensitive filesystem */
public final class C37581pm extends C37571pl implements AnonymousClass1GC {
    public final C23381Fv A00;
    public final C18560wh A01;

    public C37581pm(C23381Fv r3, C18560wh r4) {
        C18070vi.A0d(r4, 2);
        this.A00 = r3;
        this.A01 = r4;
        if (((C23391Fw) r3).A02 == C23401Fx.DESTROYED) {
            C30551e8.A03((CancellationException) null, r4);
        }
    }

    public void C6U(C27581Wq r4, AnonymousClass1F9 r5) {
        C23381Fv r2 = this.A00;
        if (((C23391Fw) r2).A02.compareTo(C23401Fx.DESTROYED) <= 0) {
            r2.A06(this);
            C30551e8.A03((CancellationException) null, this.A01);
        }
    }

    public C18560wh getCoroutineContext() {
        return this.A01;
    }
}
