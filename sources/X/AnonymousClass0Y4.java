package X;

import android.content.Context;

/* renamed from: X.0Y4  reason: invalid class name */
public final class AnonymousClass0Y4 implements AnonymousClass1GE {
    public final C23401Fx A00;

    public void BqQ(AnonymousClass1F9 r3) {
        C18070vi.A0d(r3, 0);
        if (!this.A00.A00(C23401Fx.CREATED)) {
            AnonymousClass0QO.A02((Context) r3);
        }
    }

    public void BrH(AnonymousClass1F9 r4) {
        C18070vi.A0d(r4, 0);
        Context context = (Context) r4;
        AnonymousClass0QO.A03(context);
        r4.getLifecycle().A06(this);
        synchronized (AnonymousClass0QO.A01) {
            AnonymousClass0QO.A03.remove(context);
        }
    }

    public /* synthetic */ void C0B(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C3z(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C6E() {
    }

    public /* synthetic */ void C71(AnonymousClass1F9 r1) {
    }

    public AnonymousClass0Y4(C23401Fx r1) {
        this.A00 = r1;
    }
}
