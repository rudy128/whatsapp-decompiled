package X;

/* renamed from: X.DhV  reason: case insensitive filesystem */
public final class C27564DhV extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C22654BId this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27564DhV(C22654BId bId) {
        super(0);
        this.this$0 = bId;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return this.this$0.getBackupSharedPreferencesLazy().get();
    }
}
