package X;

import android.content.res.Resources;

/* renamed from: X.4ZM  reason: invalid class name */
public class AnonymousClass4ZM {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public AnonymousClass4DG A0B = AnonymousClass4DG.NORMAL;
    public AnonymousClass4D1 A0C = AnonymousClass4D1.NORMAL;
    public C27881Xz A0D = C27881Xz.FILLED;
    public Integer A0E = AnonymousClass00R.A0C;
    public final C18030ve A0F;

    public static final int A00(Resources resources, AnonymousClass4ZM r4) {
        int ordinal = r4.A0C.ordinal();
        int i = 2131169351;
        if (ordinal != 0) {
            i = 2131169388;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i = 2131169365;
                } else {
                    throw AnonymousClass3MW.A14();
                }
            }
        }
        return resources.getDimensionPixelSize(i);
    }

    public static final int A01(Resources resources, AnonymousClass4ZM r4) {
        int ordinal = r4.A0C.ordinal();
        int i = 2131169358;
        if (ordinal != 0) {
            i = 2131169395;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i = 2131169372;
                } else {
                    throw AnonymousClass3MW.A14();
                }
            }
        }
        return resources.getDimensionPixelSize(i);
    }

    public AnonymousClass4ZM(C18030ve r2) {
        this.A0F = r2;
    }
}
