package X;

/* renamed from: X.Aul  reason: case insensitive filesystem */
public final class C21921Aul extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C187969gf this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21921Aul(C187969gf r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C187969gf r0 = this.this$0;
        C185909dL r1 = r0.A02;
        AnonymousClass20E r2 = r0.A04;
        C18070vi.A0d(r2, 0);
        C18140vp r02 = (C18140vp) AnonymousClass8BV.A0n(r2, r1.A02);
        if (r02 != null) {
            return r02.get();
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Subsystem ");
        A10.append(C60662oP.A00(((AnonymousClass20F) r2).A00));
        throw new C47282Hu(AnonymousClass000.A0y(" was not registered.", A10));
    }
}
