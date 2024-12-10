package X;

public final class B1R extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ String $annotationKey;
    public final /* synthetic */ String $annotationValue;
    public final /* synthetic */ Integer $instanceKey;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1R(Integer num, String str, String str2) {
        super(1);
        this.$instanceKey = num;
        this.$annotationKey = str;
        this.$annotationValue = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C222119a r6 = (C222119a) obj;
        C18070vi.A0d(r6, 0);
        Integer num = this.$instanceKey;
        if (num == null) {
            r6.A0A(this.$annotationKey, this.$annotationValue, false);
        } else {
            r6.A06.markerAnnotate(r6.A05.A06, num.intValue(), this.$annotationKey, this.$annotationValue);
        }
        return C27621Wu.A00;
    }
}
