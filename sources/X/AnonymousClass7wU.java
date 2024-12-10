package X;

/* renamed from: X.7wU  reason: invalid class name */
public final class AnonymousClass7wU extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1FU $dialogActivity;
    public final /* synthetic */ int $disclosureId;
    public final /* synthetic */ AnonymousClass86Z $onboardingCompletedCallback;
    public final /* synthetic */ C1598386b $onboardingSuccessCallback;
    public final /* synthetic */ C25721Pj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wU(AnonymousClass1FU r2, AnonymousClass86Z r3, C1598386b r4, C25721Pj r5, int i) {
        super(0);
        this.this$0 = r5;
        this.$disclosureId = i;
        this.$dialogActivity = r2;
        this.$onboardingSuccessCallback = r4;
        this.$onboardingCompletedCallback = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C108945cZ.A0c(this.this$0.A05).A05(this.$disclosureId);
        C25721Pj r4 = this.this$0;
        C25721Pj.A02(this.$dialogActivity, this.$onboardingCompletedCallback, this.$onboardingSuccessCallback, AnonymousClass6R9.JUST_ACCEPTED, r4, true);
        return C27621Wu.A00;
    }
}
