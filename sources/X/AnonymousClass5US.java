package X;

/* renamed from: X.5US  reason: invalid class name */
public final class AnonymousClass5US extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Class $klass;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5US(Class cls) {
        super(1);
        this.$klass = cls;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(this.$klass.isInstance(obj));
    }
}
