package X;

/* renamed from: X.Dlg  reason: case insensitive filesystem */
public final class C27804Dlg extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ C98494rF $lineCountWatcher;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27804Dlg(CTH cth, C98494rF r3) {
        super(0);
        this.$lineCountWatcher = r3;
        this.$controller = cth;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj = this.$lineCountWatcher.element;
        if (obj != null) {
            this.$controller.A01.A02.remove(obj);
        }
        return C27621Wu.A00;
    }
}
