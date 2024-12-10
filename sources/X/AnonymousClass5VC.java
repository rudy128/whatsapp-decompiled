package X;

/* renamed from: X.5VC  reason: invalid class name */
public final class AnonymousClass5VC extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C98494rF $liveData;
    public final /* synthetic */ C22801Dg $result;
    public final /* synthetic */ C22821Di $transform;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5VC(C22801Dg r2, C22821Di r3, C98494rF r4) {
        super(1);
        this.$transform = r3;
        this.$liveData = r4;
        this.$result = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1DS r4 = (AnonymousClass1DS) this.$transform.invoke(obj);
        Object obj2 = this.$liveData.element;
        if (obj2 != r4) {
            if (obj2 != null) {
                this.$result.A0G((AnonymousClass1DS) obj2);
            }
            this.$liveData.element = r4;
            if (r4 != null) {
                C22801Dg r3 = this.$result;
                r3.A0H(r4, new C65032vj(new AnonymousClass5QR(r3), 0));
            }
        }
        return C27621Wu.A00;
    }
}
