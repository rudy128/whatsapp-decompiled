package X;

/* renamed from: X.7wZ  reason: invalid class name */
public final class AnonymousClass7wZ extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1FU $activity;
    public final /* synthetic */ C145337Kw $disclosureCallback;
    public final /* synthetic */ int $noticeId;
    public final /* synthetic */ C18090vk $onTosAlreadyAccepted;
    public final /* synthetic */ C139966zj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wZ(AnonymousClass1FU r2, C145337Kw r3, C139966zj r4, C18090vk r5, int i) {
        super(0);
        this.this$0 = r4;
        this.$activity = r2;
        this.$noticeId = i;
        this.$onTosAlreadyAccepted = r5;
        this.$disclosureCallback = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C139966zj r4 = this.this$0;
        AnonymousClass1FU r3 = this.$activity;
        int i = this.$noticeId;
        r4.A02(r3, this.$disclosureCallback, this.$onTosAlreadyAccepted, i);
        return C27621Wu.A00;
    }
}
