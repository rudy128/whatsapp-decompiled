package X;

/* renamed from: X.Dlh  reason: case insensitive filesystem */
public final class C27805Dlh extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ C98494rF $maskTextWatcher;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27805Dlh(CTH cth, C98494rF r3) {
        super(0);
        this.$maskTextWatcher = r3;
        this.$controller = cth;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj = this.$maskTextWatcher.element;
        if (obj != null) {
            this.$controller.A01.A02.remove(obj);
        }
        return C27621Wu.A00;
    }
}
