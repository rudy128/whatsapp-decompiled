package X;

import android.content.Context;
import android.widget.ImageView;

/* renamed from: X.0YP  reason: invalid class name */
public final class AnonymousClass0YP implements C16890tO {
    public static Object A00(ImageView imageView) {
        C18070vi.A0d(imageView, 1);
        E4Q unused = AnonymousClass0P6.A00(imageView);
        return null;
    }

    public static void A01(ImageView imageView) {
        C18070vi.A0d(imageView, 1);
        C25869Cnd.A00().A05(AnonymousClass0P6.A00(imageView));
    }

    public static boolean A02(AnonymousClass0C6 r1, AnonymousClass0C6 r2) {
        C18070vi.A0d(r1, 0);
        C18070vi.A0d(r2, 1);
        return AnonymousClass0C6.A03(r1, r2);
    }

    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        return A00((ImageView) obj);
    }

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        return A02((AnonymousClass0C6) obj, (AnonymousClass0C6) obj2);
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        A01((ImageView) obj);
    }

    public String BQX() {
        return "FrescoRenderUnit#mountUnmount";
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }
}
