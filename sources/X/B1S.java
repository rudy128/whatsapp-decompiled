package X;

public final class B1S extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ String $annotationKey;
    public final /* synthetic */ long $annotationValue;
    public final /* synthetic */ Integer $instanceKey;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1S(Integer num, String str, long j) {
        super(1);
        this.$instanceKey = num;
        this.$annotationKey = str;
        this.$annotationValue = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C222119a r5 = (C222119a) obj;
        C18070vi.A0d(r5, 0);
        Integer num = this.$instanceKey;
        if (num == null) {
            r5.A06.markerAnnotate(r5.A05.A06, this.$annotationKey, this.$annotationValue);
        } else {
            r5.A09(this.$annotationKey, num.intValue(), this.$annotationValue, false);
        }
        return C27621Wu.A00;
    }
}
