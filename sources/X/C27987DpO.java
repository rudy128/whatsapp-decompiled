package X;

/* renamed from: X.DpO  reason: case insensitive filesystem */
public final class C27987DpO extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C18090vk $failure;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27987DpO(C18090vk r2) {
        super(1);
        this.$failure = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        C18070vi.A0d(th, 0);
        C26294Cx6.A0A("lam:LinkedDevice", "Failed to switch link. Establish link again.", th);
        this.$failure.invoke();
        return C27621Wu.A00;
    }
}
