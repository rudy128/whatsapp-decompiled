package X;

/* renamed from: X.5SW  reason: invalid class name */
public final class AnonymousClass5SW extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22509BAq $getSubgroupInfoResponse;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5SW(C22509BAq bAq) {
        super(1);
        this.$getSubgroupInfoResponse = bAq;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A6Z a6z = (A6Z) obj;
        C18070vi.A0d(a6z, 0);
        this.$getSubgroupInfoResponse.onError(a6z.A02().BOq());
        return false;
    }
}
