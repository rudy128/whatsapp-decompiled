package X;

/* renamed from: X.Dr1  reason: case insensitive filesystem */
public final class C28087Dr1 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C24246By4 $layoutDirection;
    public final /* synthetic */ C18090vk $onDismissRequest;
    public final /* synthetic */ BJD $popupLayout;
    public final /* synthetic */ C25999CqG $properties;
    public final /* synthetic */ String $testTag;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28087Dr1(C24246By4 by4, BJD bjd, C25999CqG cqG, String str, C18090vk r6) {
        super(1);
        this.$popupLayout = bjd;
        this.$onDismissRequest = r6;
        this.$properties = cqG;
        this.$testTag = str;
        this.$layoutDirection = by4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        BJD bjd = this.$popupLayout;
        bjd.A0A.addView(bjd, bjd.A09);
        BJD bjd2 = this.$popupLayout;
        C18090vk r3 = this.$onDismissRequest;
        bjd2.A0A(this.$layoutDirection, this.$properties, this.$testTag, r3);
        return new C26589D5d(this.$popupLayout);
    }
}
