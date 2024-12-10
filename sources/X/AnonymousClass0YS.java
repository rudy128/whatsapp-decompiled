package X;

import android.content.Context;
import android.graphics.Paint;

/* renamed from: X.0YS  reason: invalid class name */
public final class AnonymousClass0YS implements C16890tO {
    public static Object A00(C01930Bz r2, AnonymousClass0C5 r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        r2.setLayerType(r3.A01, (Paint) null);
        return null;
    }

    public static void A01(C01930Bz r2) {
        C18070vi.A0d(r2, 1);
        r2.setLayerType(0, (Paint) null);
    }

    public static boolean A02(AnonymousClass0C5 r1, AnonymousClass0C5 r2) {
        C18070vi.A0d(r1, 0);
        C18070vi.A0d(r2, 1);
        return AnonymousClass000.A1S(r1.A01, r2.A01);
    }

    public /* synthetic */ String BQX() {
        return C02730Fd.A00(this);
    }

    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        return A00((C01930Bz) obj, (AnonymousClass0C5) obj2);
    }

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        return A02((AnonymousClass0C5) obj, (AnonymousClass0C5) obj2);
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        A01((C01930Bz) obj);
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }
}
