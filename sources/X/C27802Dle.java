package X;

/* renamed from: X.Dle  reason: case insensitive filesystem */
public final class C27802Dle extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C98494rF $listener;
    public final /* synthetic */ C26574D4o $multiplexingFocusChangeListener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27802Dle(C26574D4o d4o, C98494rF r3) {
        super(0);
        this.$listener = r3;
        this.$multiplexingFocusChangeListener = d4o;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C26574D4o d4o;
        Object obj = this.$listener.element;
        if (!(obj == null || (d4o = this.$multiplexingFocusChangeListener) == null)) {
            d4o.A00.remove(obj);
        }
        return C27621Wu.A00;
    }
}
