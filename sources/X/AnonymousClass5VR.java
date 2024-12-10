package X;

/* renamed from: X.5VR  reason: invalid class name */
public final class AnonymousClass5VR extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C18090vk $successCallback;
    public final /* synthetic */ C135386s7 $targetedNewsletter;
    public final /* synthetic */ AnonymousClass440 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5VR(AnonymousClass440 r2, C135386s7 r3, C18090vk r4) {
        super(1);
        this.$targetedNewsletter = r3;
        this.$successCallback = r4;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18090vk r0;
        AnonymousClass6TY r3 = (AnonymousClass6TY) obj;
        C18070vi.A0d(r3, 0);
        C135386s7 r1 = this.$targetedNewsletter;
        r1.A01 = false;
        if (r3 instanceof C120056Bf) {
            C46162Dk r02 = r1.A02;
            C179509Ig r12 = ((C120056Bf) r3).A00;
            r02.A02 = r12;
            if (!(r12 == C179509Ig.GUEST || (r0 = this.$successCallback) == null)) {
                r0.invoke();
            }
        }
        C137196v4.A00(this.this$0.A02);
        return C27621Wu.A00;
    }
}
