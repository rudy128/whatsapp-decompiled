package X;

/* renamed from: X.Dmi  reason: case insensitive filesystem */
public final class C27847Dmi extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24246By4 $layoutDirection;
    public final /* synthetic */ C18090vk $onDismissRequest;
    public final /* synthetic */ BJD $popupLayout;
    public final /* synthetic */ C25999CqG $properties;
    public final /* synthetic */ String $testTag;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27847Dmi(C24246By4 by4, BJD bjd, C25999CqG cqG, String str, C18090vk r6) {
        super(0);
        this.$popupLayout = bjd;
        this.$onDismissRequest = r6;
        this.$properties = cqG;
        this.$testTag = str;
        this.$layoutDirection = by4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        BJD bjd = this.$popupLayout;
        C18090vk r3 = this.$onDismissRequest;
        bjd.A0A(this.$layoutDirection, this.$properties, this.$testTag, r3);
        return C27621Wu.A00;
    }
}
