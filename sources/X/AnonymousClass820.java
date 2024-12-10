package X;

/* renamed from: X.820  reason: invalid class name */
public final class AnonymousClass820 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ String $encodedUuid;
    public final /* synthetic */ C22821Di $onComplete;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass820(String str, C22821Di r3) {
        super(1);
        this.$onComplete = r3;
        this.$encodedUuid = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1193567u A0S = C108955ca.A0S(obj);
        C22821Di r2 = this.$onComplete;
        A0S.A00 = new C1587781z(this.$encodedUuid, r2);
        A0S.A01 = new AnonymousClass7xT(r2);
        return C27621Wu.A00;
    }
}
