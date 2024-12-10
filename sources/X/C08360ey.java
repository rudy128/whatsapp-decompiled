package X;

/* renamed from: X.0ey  reason: invalid class name and case insensitive filesystem */
public final class C08360ey extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass0RZ $listener;
    public final /* synthetic */ AnonymousClass05G $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08360ey(AnonymousClass05G r2, AnonymousClass0RZ r3) {
        super(0);
        this.$view = r2;
        this.$listener = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
        return C27621Wu.A00;
    }
}
