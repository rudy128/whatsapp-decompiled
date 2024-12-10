package X;

/* renamed from: X.0f0  reason: invalid class name and case insensitive filesystem */
public final class C08380f0 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $customDescription = null;
    public final /* synthetic */ int $fixedBinderIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08380f0(int i) {
        super(0);
        this.$fixedBinderIndex = i;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj = this.$customDescription;
        if (obj == null) {
            obj = Integer.valueOf(this.$fixedBinderIndex);
        }
        return String.valueOf(obj);
    }
}
