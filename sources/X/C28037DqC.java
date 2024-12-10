package X;

/* renamed from: X.DqC  reason: case insensitive filesystem */
public final class C28037DqC extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ DFL $component;
    public final /* synthetic */ AnonymousClass0HY $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28037DqC(AnonymousClass0HY r2, DFL dfl) {
        super(1);
        this.$context = r2;
        this.$component = dfl;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass0sX r0;
        C18070vi.A0d(obj, 0);
        AnonymousClass0QP r5 = this.$context.A00;
        CO5 co5 = new CO5(new C26587D5b(obj, 1), this.$component.A04);
        synchronized (r5) {
            r5.A0I.add(co5);
            r0 = r5.A00;
        }
        if (r0 != null) {
            C009104x r4 = r5.A0G;
            Object obj2 = r5.A0H;
            r4.removeCallbacksAndMessages(obj2);
            r4.postAtTime(new AnonymousClass0Z9(r5), obj2, 0);
        }
        return C27621Wu.A00;
    }
}
