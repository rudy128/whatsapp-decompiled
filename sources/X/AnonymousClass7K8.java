package X;

/* renamed from: X.7K8  reason: invalid class name */
public final class AnonymousClass7K8 implements C108105b8 {
    public final /* synthetic */ C46162Dk A00;
    public final /* synthetic */ C132876nm A01;
    public final /* synthetic */ C30391dr A02;

    public AnonymousClass7K8(C46162Dk r1, C132876nm r2, C30391dr r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void Bkr(C29681ch r3, Integer num, Throwable th) {
        if (!C18070vi.A18(r3, this.A00.A08())) {
            return;
        }
        if (num == AnonymousClass00R.A0C || num == AnonymousClass00R.A0N) {
            this.A01.A00.unregisterObserver(this);
            this.A02.resumeWith(new AnonymousClass6Bg(num, th));
        }
    }

    public void Bkv(C29681ch r4, Integer num) {
        C179509Ig r2;
        if (C18070vi.A18(r4, this.A00.A08())) {
            if (num == AnonymousClass00R.A0C) {
                r2 = C179509Ig.SUBSCRIBED;
            } else if (num == AnonymousClass00R.A0N) {
                r2 = C179509Ig.GUEST;
            } else {
                return;
            }
            this.A01.A00.unregisterObserver(this);
            this.A02.resumeWith(new C120056Bf(r2));
        }
    }
}
