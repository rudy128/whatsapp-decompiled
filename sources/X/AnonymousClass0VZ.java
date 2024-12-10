package X;

import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.0VZ  reason: invalid class name */
public final class AnonymousClass0VZ implements C17860vL {
    public final Choreographer A00;
    public final C15290qO A01;

    public /* synthetic */ C23801Hr getKey() {
        return AnonymousClass0EJ.A00();
    }

    public Object CSE(C30391dr r6, C22821Di r7) {
        C22821Di r0;
        C15290qO r4 = this.A01;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
        C31781g7 r3 = new C31781g7(1, C30581eB.A02(r6));
        r3.A0F();
        AnonymousClass0RU r2 = new AnonymousClass0RU(this, r7, r3);
        Choreographer A0E = r4.A0E();
        Choreographer choreographer = this.A00;
        if (C18070vi.A18(A0E, choreographer)) {
            r4.A0G(r2);
            r0 = new C10360iD(r2, r4);
        } else {
            choreographer.postFrameCallback(r2);
            r0 = new C10370iE(r2, this);
        }
        r3.Bdu(r0);
        return r3.A0C();
    }

    public AnonymousClass0VZ(Choreographer choreographer, C15290qO r2) {
        this.A00 = choreographer;
        this.A01 = r2;
    }

    public final Choreographer A00() {
        return this.A00;
    }

    public Object fold(Object obj, AnonymousClass1OS r3) {
        return C04770Os.A00(this, obj, r3);
    }

    public C18570wi get(C23801Hr r2) {
        return C04770Os.A01(this, r2);
    }

    public C18560wh minusKey(C23801Hr r2) {
        return C04770Os.A02(this, r2);
    }

    public C18560wh plus(C18560wh r2) {
        return C04770Os.A03(this, r2);
    }
}
