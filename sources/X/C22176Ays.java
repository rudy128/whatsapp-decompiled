package X;

/* renamed from: X.Ays  reason: case insensitive filesystem */
public final class C22176Ays extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C18090vk $callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22176Ays(C18090vk r2) {
        super(1);
        this.$callback = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A6Z a6z = (A6Z) obj;
        StringBuilder A19 = AnonymousClass3MZ.A19(a6z, 0);
        A19.append("ContactSyncHelperUtils/getContactsBackupSetting/onError : ");
        C17890vO.A1A(A19, a6z.A03());
        this.$callback.invoke();
        return false;
    }
}
