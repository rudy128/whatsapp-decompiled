package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1eE  reason: invalid class name and case insensitive filesystem */
public final class C30611eE extends C30601eD implements C30391dr, C30401ds {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A04 = AtomicReferenceFieldUpdater.newUpdater(C30611eE.class, Object.class, "_reusableCancellableContinuation$volatile");
    public Object A00 = C30621eF.A01;
    public final Object A01;
    public final C30391dr A02;
    public final C18600wl A03;
    public volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    public C30611eE(C30391dr r2, C18600wl r3) {
        this.A00 = -1;
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = C30631eG.A01(r2.getContext());
    }

    public C18560wh getContext() {
        return this.A02.getContext();
    }

    public C30401ds getCallerFrame() {
        C30391dr r1 = this.A02;
        if (r1 instanceof C30401ds) {
            return (C30401ds) r1;
        }
        return null;
    }

    public void resumeWith(Object obj) {
        C18560wh context;
        Object A002;
        C30391dr r9 = this.A02;
        C18560wh context2 = r9.getContext();
        Object obj2 = obj;
        Throwable A003 = C30671eK.A00(obj);
        if (A003 != null) {
            obj2 = new C30681eL(A003);
        }
        C18600wl r1 = this.A03;
        if (r1.A0C(context2)) {
            this.A00 = obj2;
            this.A00 = 0;
            r1.A0D(this, context2);
            return;
        }
        AnonymousClass1IJ A004 = C37591po.A00();
        long j = A004.A00;
        if (j >= 4294967296L) {
            this.A00 = obj2;
            this.A00 = 0;
            A004.A0G(this);
            return;
        }
        A004.A00 = j + 4294967296L;
        try {
            context = r9.getContext();
            A002 = C30631eG.A00(this.A01, context);
            r9.resumeWith(obj);
            C30631eG.A02(A002, context);
            do {
            } while (A004.A0I());
        } catch (Throwable th) {
            try {
                A0A(th, (Throwable) null);
            } catch (Throwable th2) {
                A004.A0H(true);
                throw th2;
            }
        }
        A004.A0H(true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispatchedContinuation[");
        sb.append(this.A03);
        sb.append(", ");
        sb.append(AnonymousClass2VG.A00(this.A02));
        sb.append(']');
        return sb.toString();
    }
}
