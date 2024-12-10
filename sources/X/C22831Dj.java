package X;

/* renamed from: X.1Dj  reason: invalid class name and case insensitive filesystem */
public final class C22831Dj extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22811Dh $firstTime;
    public final /* synthetic */ C22801Dg $outputLiveData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22831Dj(C22801Dg r2, C22811Dh r3) {
        super(1);
        this.$outputLiveData = r2;
        this.$firstTime = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object A06 = this.$outputLiveData.A06();
        if (this.$firstTime.element || (A06 != null ? !A06.equals(obj) : obj != null)) {
            this.$firstTime.element = false;
            this.$outputLiveData.A0F(obj);
        }
        return C27621Wu.A00;
    }
}
