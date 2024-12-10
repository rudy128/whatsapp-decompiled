package X;

public final class B1T extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ String $annotationKey;
    public final /* synthetic */ boolean $annotationValue;
    public final /* synthetic */ Integer $instanceKey;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1T(Integer num, String str, boolean z) {
        super(1);
        this.$instanceKey = num;
        this.$annotationKey = str;
        this.$annotationValue = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C222119a r6 = (C222119a) obj;
        C18070vi.A0d(r6, 0);
        Integer num = this.$instanceKey;
        if (num == null) {
            r6.A0B(this.$annotationKey, this.$annotationValue, false);
        } else {
            r6.A06.markerAnnotate(r6.A05.A06, num.intValue(), this.$annotationKey, this.$annotationValue);
        }
        return C27621Wu.A00;
    }
}
