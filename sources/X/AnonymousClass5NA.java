package X;

/* renamed from: X.5NA  reason: invalid class name */
public final class AnonymousClass5NA extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C18090vk $extrasProducer;
    public final /* synthetic */ AnonymousClass01C $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5NA(AnonymousClass01C r2, C18090vk r3) {
        super(0);
        this.$extrasProducer = r3;
        this.$this_viewModels = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object invoke;
        C18090vk r0 = this.$extrasProducer;
        if (r0 == null || (invoke = r0.invoke()) == null) {
            return this.$this_viewModels.BQQ();
        }
        return invoke;
    }
}
