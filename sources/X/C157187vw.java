package X;

/* renamed from: X.7vw  reason: invalid class name and case insensitive filesystem */
public final class C157187vw extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C18090vk $callback;
    public final /* synthetic */ AnonymousClass6RD $type;
    public final /* synthetic */ C25721Pj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157187vw(C25721Pj r2, AnonymousClass6RD r3, C18090vk r4) {
        super(0);
        this.this$0 = r2;
        this.$type = r3;
        this.$callback = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass6RD r2;
        C25721Pj r1 = this.this$0;
        AnonymousClass6RD r5 = this.$type;
        AnonymousClass00H r4 = r1.A05;
        boolean z = false;
        if (!C108945cZ.A0c(r4).A0A(r5) && C18070vi.A18(r1.A02.A04(), "US") && r5 == (r2 = AnonymousClass6RD.META_AI_SHORTCUT_TOS) && C108945cZ.A0c(r4).A0A(AnonymousClass6RD.INVOKE_TOS) && !C108945cZ.A0c(r4).A0A(r2)) {
            z = true;
        }
        C25721Pj r0 = this.this$0;
        if (z) {
            C1408073d A0c = C108945cZ.A0c(r0.A05);
            AnonymousClass6RD r3 = this.$type;
            AnonymousClass7D7 r22 = new AnonymousClass7D7(this.this$0, this.$callback);
            C18070vi.A0d(r3, 0);
            C1408073d.A02(r22, A0c, C1408073d.A00(r3));
        } else {
            r0.A01.CGP(new C21446AkD(this.$callback, 3));
        }
        return C27621Wu.A00;
    }
}
