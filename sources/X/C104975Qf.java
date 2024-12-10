package X;

/* renamed from: X.5Qf  reason: invalid class name and case insensitive filesystem */
public final class C104975Qf extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass4DA $detectionResult;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104975Qf(AnonymousClass4DA r2) {
        super(1);
        this.$detectionResult = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass4DA r0 = this.$detectionResult;
        if (r0 != null) {
            int ordinal = r0.ordinal();
            if (ordinal == 1) {
                return AnonymousClass4DH.POSE_DETECTED;
            }
            if (ordinal == 2) {
                return AnonymousClass4DH.POSE_CENTER_FACE;
            }
            if (ordinal == 3) {
                return AnonymousClass4DH.POSE_TOO_CLOSE;
            }
            if (ordinal == 4) {
                return AnonymousClass4DH.POSE_TOO_FAR;
            }
        }
        return AnonymousClass4DH.POSE_DETECTING;
    }
}
