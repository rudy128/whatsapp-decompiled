package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: X.1zx  reason: invalid class name and case insensitive filesystem */
public abstract class C43531zx {
    public static final int A00(View view, int i) {
        C18070vi.A0d(view, 0);
        Resources resources = view.getResources();
        C18070vi.A0X(resources);
        return C22339B3q.A00((((double) (i * resources.getDisplayMetrics().densityDpi)) * 1.0d) / 160.0d);
    }

    public static final C39351sv A01(View view) {
        int i;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        C18070vi.A0d(view, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i4 = 0;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            i = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
            i2 = 0;
        } else {
            i2 = marginLayoutParams2.topMargin;
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            i3 = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
        } else {
            i3 = 0;
        }
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
            i4 = marginLayoutParams.bottomMargin;
        }
        return new C39351sv(i, i2, i3, i4);
    }

    public static final C18100vl A02(View view, Integer num, int i) {
        return AnonymousClass1DF.A00(num, new C99084sF(view, i, 4));
    }

    public static final void A03(View view, C39351sv r6) {
        C18070vi.A0d(view, 0);
        C18070vi.A0d(r6, 1);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(r6.A01, r6.A03, r6.A02, r6.A00);
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void A04(View view, Object obj) {
        int i = 0;
        C18070vi.A0d(view, 0);
        if (obj == null) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public static final void A05(View view, boolean z) {
        C18070vi.A0d(view, 0);
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            Iterator it = new C99434so(view, 1).iterator();
            while (it.hasNext()) {
                A05((View) it.next(), z);
            }
        }
    }

    public static final void A06(C18090vk r3, View view) {
        C18070vi.A0d(view, 0);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new C90574eI(r3, view, 10));
    }
}
