package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.5WI  reason: invalid class name */
public final class AnonymousClass5WI extends C30501e3 implements C108485bm, C108475bl {
    public final C108485bm A00;

    public AnonymousClass5WI(C18560wh r2, C108485bm r3) {
        this(r2, r3, true, true);
    }

    public boolean BF8(Throwable th) {
        return this.A00.BF8(th);
    }

    public C24937CQk BVj() {
        return this.A00.BVj();
    }

    public C24937CQk BVk() {
        return this.A00.BVk();
    }

    public void Bdw(C22821Di r2) {
        this.A00.Bdw(r2);
    }

    public boolean BeJ() {
        return this.A00.BeJ();
    }

    public C27177DXm Bh9() {
        return this.A00.Bh9();
    }

    public Object CDW(C30391dr r2) {
        return this.A00.CDW(r2);
    }

    public Object CDX(C30391dr r2) {
        return this.A00.CDX(r2);
    }

    public Object CHH(Object obj, C30391dr r3) {
        return this.A00.CHH(obj, r3);
    }

    public Object CPy() {
        return this.A00.CPy();
    }

    public Object CQ0(Object obj) {
        return this.A00.CQ0(obj);
    }

    public final C108485bm A14() {
        return this.A00;
    }

    public void A0m(Throwable th) {
        CancellationException A0D = A0g((String) null, th);
        this.A00.BEM(A0D);
        A0o(A0D);
    }

    public void A13(Throwable th, boolean z) {
        if (!A14().BF8(th) && !z) {
            C181879Se.A00(getContext(), th);
        }
    }

    /* renamed from: A15 */
    public void A10() {
        A14().BF8((Throwable) null);
    }

    public final void BEM(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new C71313Et(A0d(), (Throwable) null, this);
            }
            A0m(cancellationException);
        }
    }

    public AnonymousClass5WI(C18560wh r2, C108485bm r3, boolean z, boolean z2) {
        super(r2, true);
        this.A00 = r3;
    }
}
