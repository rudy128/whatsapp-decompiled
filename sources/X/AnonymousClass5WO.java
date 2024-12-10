package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.5WO  reason: invalid class name */
public final class AnonymousClass5WO extends C99664tG {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A02 = AtomicIntegerFieldUpdater.newUpdater(AnonymousClass5WO.class, "consumed$volatile");
    public final C108585bw A00;
    public final boolean A01;
    public volatile /* synthetic */ int consumed$volatile = 0;

    public Object A00(C30391dr r4, C108475bl r5) {
        Object A002 = AnonymousClass4WB.A00(r4, this.A00, new C99514sw(r5), this.A01);
        if (A002 != C31751g4.COROUTINE_SUSPENDED) {
            return C27621Wu.A00;
        }
        return A002;
    }

    public C108585bw A01(AnonymousClass1OX r3) {
        if (this.A01 && A02.getAndSet(this, 1) != 0) {
            throw AnonymousClass000.A0n("ReceiveChannel.consumeAsFlow can be collected just once");
        } else if (this.A00 == -3) {
            return this.A00;
        } else {
            return super.A01(r3);
        }
    }

    public Object BFC(C30391dr r4, AnonymousClass1G2 r5) {
        Object obj;
        if (this.A00 == -3) {
            boolean z = this.A01;
            if (!z || A02.getAndSet(this, 1) == 0) {
                obj = AnonymousClass4WB.A00(r4, this.A00, r5, z);
            } else {
                throw AnonymousClass000.A0n("ReceiveChannel.consumeAsFlow can be collected just once");
            }
        } else {
            obj = super.BFC(r4, r5);
        }
        return AnonymousClass3MX.A13(obj);
    }

    public AnonymousClass5WO(C18560wh r2, C25691Pg r3, C108585bw r4, int i, boolean z) {
        super(r2, r3, i);
        this.A00 = r4;
        this.A01 = z;
    }
}
