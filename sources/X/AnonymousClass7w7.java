package X;

/* renamed from: X.7w7  reason: invalid class name */
public final class AnonymousClass7w7 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ int $disclosureId;
    public final /* synthetic */ int $promptIndex;
    public final /* synthetic */ C120206Cu this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7w7(C120206Cu r2, int i, int i2) {
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
