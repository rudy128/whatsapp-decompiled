package X;

/* renamed from: X.7s6  reason: invalid class name and case insensitive filesystem */
public final class C155037s6 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass77S $userAccessToken;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155037s6(AnonymousClass77S r2) {
        super(0);
        this.$userAccessToken = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object A00 = this.$userAccessToken.A00("XFAM_CROSSPOSTING_NATIVE_AUTH_TOKEN_XCHANGE_GQL");
        if (A00 != null) {
            return A00;
        }
        throw C17880vN.A0g();
    }
}
