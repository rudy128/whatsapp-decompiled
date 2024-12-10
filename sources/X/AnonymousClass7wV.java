package X;

/* renamed from: X.7wV  reason: invalid class name */
public final class AnonymousClass7wV extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Integer $entryPoint;
    public final /* synthetic */ AnonymousClass6RD $noticeType;
    public final /* synthetic */ AnonymousClass86Z $onboardingCompletedCallback;
    public final /* synthetic */ C1598386b $onboardingSuccessCallback;
    public final /* synthetic */ C25721Pj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wV(AnonymousClass86Z r2, C1598386b r3, C25721Pj r4, AnonymousClass6RD r5, Integer num) {
        super(0);
        this.this$0 = r4;
        this.$noticeType = r5;
        this.$onboardingSuccessCallback = r3;
        this.$onboardingCompletedCallback = r2;
        this.$entryPoint = num;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass6RD r2 = this.$noticeType;
        ((C1408073d) C18070vi.A0E(this.this$0.A05)).A06(this.$onboardingCompletedCallback, this.$onboardingSuccessCallback, r2);
        AnonymousClass18K r3 = this.this$0.A04;
        C47192Hl r22 = new C47192Hl();
        Integer num = this.$entryPoint;
        C108945cZ.A1M(r22, 34);
        AnonymousClass3MZ.A1T(r22, num);
        r3.CC7(r22);
        return C27621Wu.A00;
    }
}
