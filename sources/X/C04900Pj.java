package X;

import androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3;
import java.util.Map;

/* renamed from: X.0Pj  reason: invalid class name and case insensitive filesystem */
public abstract class C04900Pj {
    public static final AnonymousClass0U0 A00 = new AnonymousClass0U0((Object) null, 1500.0f);
    public static final AnonymousClass0U0 A01 = new AnonymousClass0U0(DSH.A00(0.1f), 1500.0f);
    public static final AnonymousClass0U0 A02 = new AnonymousClass0U0(1, 1500.0f);
    public static final AnonymousClass0U0 A03;
    public static final AnonymousClass0U0 A04;
    public static final AnonymousClass0U0 A05 = new AnonymousClass0U0(AnonymousClass000.A0e(AnonymousClass001.A0p(0.5f, 0.5f)), 1500.0f);
    public static final AnonymousClass0U0 A06 = new AnonymousClass0U0(AnonymousClass0GP.A00, 1500.0f);
    public static final AnonymousClass0U0 A07 = AnonymousClass0U0.A01(new AnonymousClass0QG(AnonymousClass001.A0p(0.5f, 0.5f)));

    static {
        Map map = AnonymousClass0GP.A01;
        long j = AnonymousClass0QG.A02;
        long j2 = AnonymousClass0QY.A03;
        long A0o = AnonymousClass001.A0o();
        A03 = new AnonymousClass0U0(C26143Ct6.A00(A0o), 1500.0f);
        A04 = new AnonymousClass0U0(C26142Ct5.A00(A0o), 1500.0f);
    }

    public static final C16300s2 A00(C16000rY r10, C16590sg r11, C17130tn r12, Object obj) {
        r12.COB(-1994373980);
        Object A0u = AnonymousClass000.A0u(r12, -492369756);
        Object obj2 = AnonymousClass0MH.A00;
        if (A0u == obj2) {
            A0u = AnonymousClass0Q9.A02((Object) null);
            AnonymousClass0VR.A0V(r12, A0u);
        }
        AnonymousClass0VR r2 = (AnonymousClass0VR) r12;
        AnonymousClass0VR.A0R(r2, false);
        C17330uU r3 = (C17330uU) A0u;
        Object A0u2 = AnonymousClass000.A0u(r12, -492369756);
        if (A0u2 == obj2) {
            A0u2 = new AnonymousClass0Q3(r11, obj, (Object) null);
            r2.A0c(A0u2);
        }
        AnonymousClass0VR.A0R(r2, false);
        AnonymousClass0Q3 r6 = (AnonymousClass0Q3) A0u2;
        C17330uU A012 = AnonymousClass0Ou.A01(r12, (Object) null);
        C17330uU A013 = AnonymousClass0Ou.A01(r12, r10);
        Object A0u3 = AnonymousClass000.A0u(r12, -492369756);
        if (A0u3 == obj2) {
            A0u3 = AnonymousClass4W8.A01(C25691Pg.A04, -1);
            r12.CRH(A0u3);
        }
        AnonymousClass0VR.A0R(r2, false);
        C108485bm r102 = (C108485bm) A0u3;
        AnonymousClass0QC.A05(r12, new C08590fL(obj, r102));
        AnonymousClass0QC.A04(r12, r102, new AnimateAsStateKt$animateValueAsState$3(r6, A013, A012, (C30391dr) null, r102));
        C16300s2 r0 = (C16300s2) r3.getValue();
        if (r0 == null) {
            r0 = r6.A04;
        }
        AnonymousClass0VR.A0R(r2, false);
        return r0;
    }

    public static final C16300s2 A01(C16000rY r2, C17130tn r3, float f) {
        r3.COB(-1407150062);
        C16300s2 A002 = A00(r2, AnonymousClass0MW.A01, r3, DSH.A00(f));
        AnonymousClass0VR.A0T(r3);
        return A002;
    }

    public static final C22821Di A02(C16300s2 r0) {
        return (C22821Di) r0.getValue();
    }
}
