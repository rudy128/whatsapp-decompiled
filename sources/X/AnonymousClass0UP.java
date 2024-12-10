package X;

/* renamed from: X.0UP  reason: invalid class name */
public final class AnonymousClass0UP implements C17010ta {
    public final C16000rY A00 = AnonymousClass0MN.A00;

    public float BDy(float f, float f2, float f3) {
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        if (Math.abs(f) >= Math.abs(f5)) {
            return f5;
        }
        return f;
    }
}
