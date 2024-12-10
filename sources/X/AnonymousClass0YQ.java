package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.0YQ  reason: invalid class name */
public final class AnonymousClass0YQ implements C16890tO {
    public static Object A00(C01930Bz r1, AnonymousClass0C5 r2) {
        C18070vi.A0d(r1, 1);
        C18070vi.A0d(r2, 2);
        r1.setBackground(r2.A02);
        return null;
    }

    public static void A01(C01930Bz r1) {
        C18070vi.A0d(r1, 1);
        r1.setBackground((Drawable) null);
    }

    public static boolean A02(AnonymousClass0C5 r2, AnonymousClass0C5 r3) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(r3, 1);
        Drawable drawable = r2.A02;
        Drawable drawable2 = r3.A02;
        if (drawable == null) {
            if (drawable2 != null) {
                return true;
            }
            return false;
        } else if (!drawable.equals(drawable2)) {
            return true;
        } else {
            return false;
        }
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
