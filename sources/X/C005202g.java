package X;

/* renamed from: X.02g  reason: invalid class name and case insensitive filesystem */
public final class C005202g implements C005102e {
    public final AnonymousClass01T A00;
    public final /* synthetic */ AnonymousClass02V A01;

    public C005202g(AnonymousClass01T r1, AnonymousClass02V r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void cancel() {
        AnonymousClass02V r3 = this.A01;
        AnonymousClass1JD A002 = r3.A06;
        AnonymousClass01T r2 = this.A00;
        A002.remove(r2);
        if (C18070vi.A18(r3.A00, r2)) {
            r2.A01();
            r3.A00 = null;
        }
        r2.A02.remove(this);
        C18090vk A003 = r2.A00();
        if (A003 != null) {
            A003.invoke();
        }
        r2.A05((C18090vk) null);
    }
}
