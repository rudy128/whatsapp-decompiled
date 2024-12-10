package X;

/* renamed from: X.82W  reason: invalid class name */
public final class AnonymousClass82W extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $onError;
    public final /* synthetic */ C138596xL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82W(C138596xL r2, C22821Di r3) {
        super(1);
        this.this$0 = r2;
        this.$onError = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object r4;
        C123076Ta r6 = (C123076Ta) obj;
        C18070vi.A0d(r6, 0);
        if (r6 instanceof AnonymousClass6D2) {
            r4 = ((AnonymousClass6D2) r6).A00;
        } else if (r6 instanceof AnonymousClass6D1) {
            r4 = new AnonymousClass6DL(((AnonymousClass6D1) r6).A00);
        } else if (r6 instanceof AnonymousClass6D4) {
            r4 = new AnonymousClass6DL(((AnonymousClass6D4) r6).A00);
        } else if (r6 instanceof AnonymousClass6D3) {
            r4 = new AnonymousClass6DM(((AnonymousClass6D3) r6).A00);
        } else if (r6 instanceof AnonymousClass6D0) {
            r4 = new AnonymousClass6DN(0);
        } else {
            throw AnonymousClass3MW.A14();
        }
        this.this$0.A00.A0J(new C21433Ak0(this.$onError, r4, 39));
        return C27621Wu.A00;
    }
}
