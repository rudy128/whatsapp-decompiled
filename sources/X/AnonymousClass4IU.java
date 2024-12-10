package X;

import android.view.animation.Interpolator;

/* renamed from: X.4IU  reason: invalid class name */
public abstract class AnonymousClass4IU {
    public static final Interpolator A00;
    public static final Interpolator A01;
    public static final Interpolator A02;

    static {
        Interpolator A002 = C29111bd.A00(0.65f, 0.0f, 0.35f, 1.0f);
        C18070vi.A0X(A002);
        A00 = A002;
        Interpolator A003 = C29111bd.A00(0.45f, 0.0f, 0.55f, 1.0f);
        C18070vi.A0X(A003);
        A02 = A003;
        Interpolator A004 = C29111bd.A00(0.87f, 0.0f, 0.13f, 1.0f);
        C18070vi.A0X(A004);
        A01 = A004;
    }
}
