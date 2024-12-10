package X;

/* renamed from: X.82T  reason: invalid class name */
public final class AnonymousClass82T extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C18090vk $onError;
    public final /* synthetic */ C18090vk $onTosDownloaded;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82T(C18090vk r2, C18090vk r3) {
        super(1);
        this.$onTosDownloaded = r2;
        this.$onError = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18090vk r0;
        if (AnonymousClass000.A1Y(obj)) {
            r0 = this.$onTosDownloaded;
        } else {
            r0 = this.$onError;
        }
        r0.invoke();
        return C27621Wu.A00;
    }
}
