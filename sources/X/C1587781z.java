package X;

/* renamed from: X.81z  reason: invalid class name and case insensitive filesystem */
public final class C1587781z extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ String $encodedUuid;
    public final /* synthetic */ C22821Di $onComplete;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1587781z(String str, C22821Di r3) {
        super(1);
        this.$onComplete = r3;
        this.$encodedUuid = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        StringBuilder A0K = C18070vi.A0K(obj);
        A0K.append("MultiAccountServerPrimer/AddMultiAccountLinkMutation/onData/");
        C17900vP.A0r(A0K, ((C20125A8k) obj).A0G("xwa2_multi_acc_add_acc"));
        this.$onComplete.invoke(this.$encodedUuid);
        return C27621Wu.A00;
    }
}
