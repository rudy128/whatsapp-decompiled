package X;

public final class B1A extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22393B5w $callback;
    public final /* synthetic */ boolean $isEnabled;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1A(C22393B5w b5w, boolean z) {
        super(1);
        this.$callback = b5w;
        this.$isEnabled = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C22393B5w b5w = this.$callback;
        ((C21047Add) b5w).A00.A0F.A0E(Boolean.valueOf(this.$isEnabled));
        return C27621Wu.A00;
    }
}
