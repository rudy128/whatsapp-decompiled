package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.LinkedHashMap;

/* renamed from: X.0YT  reason: invalid class name */
public final class AnonymousClass0YT implements C16890tO {
    public static /* synthetic */ C26738DBr A00(Resources resources, C22825BRd bRd, E13 e13) {
        C18070vi.A0d(e13, 1);
        if (bRd == null) {
            bRd = C22825BRd.A0Z;
        }
        return new C26738DBr(resources, bRd, e13, new LinkedHashMap());
    }

    public static Object A02(Context context, ImageView imageView, AnonymousClass0C6 r11, Object obj) {
        Rect rect;
        C22825BRd bRd;
        C22825BRd bRd2;
        Object obj2 = obj;
        C18070vi.A0d(context, 0);
        C18070vi.A0d(imageView, 1);
        C18070vi.A0d(r11, 2);
        if (obj instanceof Rect) {
            rect = (Rect) obj2;
        } else {
            rect = null;
        }
        if (r11.A01 == null || !C18070vi.A18(r11.A00, rect)) {
            if (rect == null || (bRd2 = r11.A04) == null || !AnonymousClass0P6.A02(r11)) {
                bRd = r11.A04;
            } else {
                C22824BRc A00 = bRd2.A00();
                A00.A01(A01(rect.width(), rect.height()));
                bRd = A00.A00();
            }
            C25869Cnd.A01();
            Resources resources = context.getResources();
            C18070vi.A0X(resources);
            r11.A01 = A00(resources, bRd, r11.A0N());
            r11.A00 = rect;
        }
        E4Q A01 = AnonymousClass0P6.A00(imageView);
        C26202CuY A002 = C25869Cnd.A00();
        C26738DBr A012 = r11.A01;
        if (A012 != null) {
            Object obj3 = r11.A06;
            A002.A08(rect, r11.A09, A01, A012, r11.A03, obj3);
            imageView.setTag(2131431019, r11.A04);
            imageView.setTag(2131431018, obj3);
            return null;
        }
        throw AnonymousClass000.A0n("renderUnit.cachedImageRequest is null");
    }

    public static void A03(ImageView imageView, AnonymousClass0C6 r4) {
        C18070vi.A0d(imageView, 1);
        C18070vi.A0d(r4, 2);
        E4Q A01 = AnonymousClass0P6.A00(imageView);
        Drawable BMW = A01.BMW();
        C22825BRd bRd = r4.A04;
        if ((bRd == null || bRd.A03()) && (BMW instanceof Animatable)) {
            ((Animatable) BMW).stop();
        }
        C25869Cnd.A00().A06(A01);
        imageView.setTag(2131431019, (Object) null);
        imageView.setTag(2131431018, (Object) null);
    }

    public static boolean A04(AnonymousClass0C6 r1, AnonymousClass0C6 r2, Object obj, Object obj2) {
        C18070vi.A0d(r1, 0);
        C18070vi.A0d(r2, 1);
        if (AnonymousClass0C6.A03(r1, r2) || !C18070vi.A18(obj, obj2)) {
            return true;
        }
        return false;
    }

    public static final C25157Ca8 A01(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        return new C25157Ca8(i, i2);
    }

    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        return A02(context, (ImageView) obj, (AnonymousClass0C6) obj2, obj3);
    }

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        return A04((AnonymousClass0C6) obj, (AnonymousClass0C6) obj2, obj3, obj4);
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        A03((ImageView) obj, (AnonymousClass0C6) obj2);
    }

    public String BQX() {
        return "FrescoRenderUnit#attachDetach";
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }
}
