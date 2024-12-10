package X;

/* renamed from: X.5UY  reason: invalid class name */
public final class AnonymousClass5UY extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $faceCount;
    public final /* synthetic */ C86094Qd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5UY(C86094Qd r2, int i) {
        super(1);
        this.$faceCount = i;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i = this.$faceCount;
        if (i == 0) {
            return AnonymousClass4DH.POSE_FIND_FACE;
        }
        if (i > 1) {
            return AnonymousClass4DH.POSE_TOO_MANY_FACES;
        }
        if (i != 1 || !this.this$0.A00) {
            return AnonymousClass4DH.POSE_DETECTING;
        }
        return AnonymousClass4DH.DETECTOR_READY;
    }
}
