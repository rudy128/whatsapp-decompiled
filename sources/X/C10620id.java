package X;

/* renamed from: X.0id  reason: invalid class name and case insensitive filesystem */
public final class C10620id extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C18090vk $itemProviderLambda;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10620id(C18090vk r2) {
        super(1);
        this.$itemProviderLambda = r2;
    }

    /* renamed from: A00 */
    public final Integer invoke(Object obj) {
        C16610si r3 = (C16610si) this.$itemProviderLambda.invoke();
        int i = ((AnonymousClass0V1) r3).A01.A00.A00;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                if (C18070vi.A18(r3.BTi(i2), obj)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        return Integer.valueOf(i2);
    }
}
