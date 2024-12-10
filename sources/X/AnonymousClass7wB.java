package X;

/* renamed from: X.7wB  reason: invalid class name */
public final class AnonymousClass7wB extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1FU $dialogActivity;
    public final /* synthetic */ AnonymousClass77S $fbUserFullName;
    public final /* synthetic */ C98494rF $subtitle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wB(AnonymousClass1FU r2, AnonymousClass77S r3, C98494rF r4) {
        super(0);
        this.$subtitle = r4;
        this.$fbUserFullName = r3;
        this.$dialogActivity = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object string;
        C98494rF r2 = this.$subtitle;
        AnonymousClass77S r1 = this.$fbUserFullName;
        if (r1 != null) {
            string = r1.A00("XFAM_CROSSPOSTING_STATUS_PRIVACY_UI");
        } else {
            string = this.$dialogActivity.getString(2131886429);
        }
        r2.element = string;
        return C27621Wu.A00;
    }
}
