package X;

/* renamed from: X.AwD  reason: case insensitive filesystem */
public final class C22011AwD extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $purpose;
    public final /* synthetic */ C193029pQ $userEntitySourceAccessTokenPair;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22011AwD(C193029pQ r2, String str) {
        super(0);
        this.$userEntitySourceAccessTokenPair = r2;
        this.$purpose = str;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        AnonymousClass1D6 r0 = (AnonymousClass1D6) this.$userEntitySourceAccessTokenPair.A00.A00(this.$purpose);
        if (r0 != null && (obj = r0.first) != null) {
            return obj;
        }
        throw C17880vN.A0g();
    }
}
