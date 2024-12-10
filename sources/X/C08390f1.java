package X;

/* renamed from: X.0f1  reason: invalid class name and case insensitive filesystem */
public final class C08390f1 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C04310Mr $focusRequester;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ C04940Pp $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08390f1(C04940Pp r2, C04310Mr r3, boolean z) {
        super(0);
        this.$state = r2;
        this.$focusRequester = r3;
        this.$readOnly = z;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C16750sx r0;
        C04940Pp r4 = this.$state;
        C04310Mr r3 = this.$focusRequester;
        boolean z = !this.$readOnly;
        if (!AnonymousClass001.A1b(r4.A08)) {
            r3.A00();
        } else if (z && (r0 = r4.A0H) != null) {
            r0.CMX();
        }
        return true;
    }
}
