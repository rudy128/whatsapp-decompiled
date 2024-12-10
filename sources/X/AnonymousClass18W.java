package X;

/* renamed from: X.18W  reason: invalid class name */
public final class AnonymousClass18W extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass00H $abProps;
    public final /* synthetic */ AnonymousClass00H $waMetaAttributeStore;
    public final /* synthetic */ AnonymousClass00H $wamAttributeStore;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass18W(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        super(0);
        this.$abProps = r2;
        this.$waMetaAttributeStore = r3;
        this.$wamAttributeStore = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass00H r0;
        int A00 = C18020vd.A00(C18040vf.A02, (C18020vd) this.$abProps.get(), 5120);
        if (A00 != 0) {
            if (A00 == 1) {
                r0 = this.$waMetaAttributeStore;
                return r0.get();
            } else if (A00 == 2 || A00 == 3 || A00 == 4 || A00 == 5) {
                Object obj = this.$wamAttributeStore.get();
                C18070vi.A0X(obj);
                Object obj2 = this.$waMetaAttributeStore.get();
                C18070vi.A0X(obj2);
                return new C679631n((AnonymousClass18C) obj2, (AnonymousClass189) obj);
            }
        }
        r0 = this.$wamAttributeStore;
        return r0.get();
    }
}
