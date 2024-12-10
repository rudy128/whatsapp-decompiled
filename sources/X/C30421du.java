package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1du  reason: invalid class name and case insensitive filesystem */
public abstract class C30421du extends C30411dt {
    public final C18560wh _context;
    public transient C30391dr intercepted;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C30421du(X.C30391dr r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000a
            X.0wh r0 = r2.getContext()
        L_0x0006:
            r1.<init>(r2, r0)
            return
        L_0x000a:
            r0 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30421du.<init>(X.1dr):void");
    }

    public C18560wh getContext() {
        C18560wh r0 = this._context;
        C18070vi.A0b(r0);
        return r0;
    }

    public final C30391dr intercepted() {
        C30391dr r1 = this.intercepted;
        if (r1 == null) {
            C18590wk r0 = (C18590wk) getContext().get(C18590wk.A00);
            if (r0 != null) {
                r1 = new C30611eE(this, (C18600wl) r0);
            } else {
                r1 = this;
            }
            this.intercepted = r1;
        }
        return r1;
    }

    public void releaseIntercepted() {
        C31781g7 r1;
        C30391dr r3 = this.intercepted;
        if (!(r3 == null || r3 == this)) {
            C18070vi.A0b(getContext().get(C18590wk.A00));
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C30611eE.A04;
            do {
            } while (atomicReferenceFieldUpdater.get(r3) == C30621eF.A00);
            Object obj = atomicReferenceFieldUpdater.get(r3);
            if ((obj instanceof C31781g7) && (r1 = (C31781g7) obj) != null) {
                r1.A0G();
            }
        }
        this.intercepted = C31791g8.A00;
    }

    public C30421du(C30391dr r1, C18560wh r2) {
        super(r1);
        this._context = r2;
    }
}
