package X;

/* renamed from: X.7w8  reason: invalid class name */
public final class AnonymousClass7w8 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ int $disclosureId;
    public final /* synthetic */ int $promptIndex;
    public final /* synthetic */ C120216Cv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7w8(C120216Cv r2, int i, int i2) {
        super(0);
        this.this$0 = r2;
        this.$disclosureId = i;
        this.$promptIndex = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ((C25768Clf) this.this$0.getPrivacyDisclosureLogger().get()).A01(this.$disclosureId, this.$promptIndex);
        return C27621Wu.A00;
    }
}
