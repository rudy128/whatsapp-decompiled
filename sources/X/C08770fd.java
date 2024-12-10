package X;

/* renamed from: X.0fd  reason: invalid class name and case insensitive filesystem */
public final class C08770fd extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1GB $androidxRegistry;
    public final /* synthetic */ String $key;
    public final /* synthetic */ boolean $registered;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08770fd(AnonymousClass1GB r2, String str, boolean z) {
        super(0);
        this.$registered = z;
        this.$androidxRegistry = r2;
        this.$key = str;
    }

    public final void A00() {
        if (this.$registered) {
            this.$androidxRegistry.A04(this.$key);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        A00();
        return C27621Wu.A00;
    }
}
