package X;

/* renamed from: X.7sA  reason: invalid class name and case insensitive filesystem */
public final class C155077sA extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass77S $userAccessTokenEnforced;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155077sA(AnonymousClass77S r2) {
        super(0);
        this.$userAccessTokenEnforced = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object A00 = this.$userAccessTokenEnforced.A00("XFAM_CROSSPOSTING_REQUEST_GQL");
        if (A00 != null) {
            return A00;
        }
        throw C17880vN.A0g();
    }
}
