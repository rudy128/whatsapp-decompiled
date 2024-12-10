package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* renamed from: X.BJn  reason: case insensitive filesystem */
public class C22672BJn extends C25251Cbq {
    public static final Interpolator A00 = new DecelerateInterpolator();
    public static final Interpolator A01 = new AnonymousClass1YY();
    public static final Interpolator A02 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    public static C25247Cbm A00(View view) {
        Object tag = view.getTag(2131436019);
        if (tag instanceof C26568D4i) {
            return ((C26568D4i) tag).A01;
        }
        return null;
    }

    public static void A01(View view, WindowInsets windowInsets, C25972Cpf cpf, boolean z) {
        C25247Cbm A002 = A00(view);
        if (A002 != null) {
            A002.A00 = windowInsets;
            if (!z) {
                A002.A03(cpf);
                z = AnonymousClass000.A1P(A002.A01);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A01(viewGroup.getChildAt(i), windowInsets, cpf, z);
            }
        }
    }

    public static void A02(View view, C26000CqH cqH, C25972Cpf cpf) {
        C25247Cbm A002 = A00(view);
        if (A002 != null) {
            A002.A01(cqH);
            if (A002.A01 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A02(viewGroup.getChildAt(i), cqH, cpf);
            }
        }
    }

    public static void A03(View view, C25972Cpf cpf) {
        C25247Cbm A002 = A00(view);
        if (A002 != null) {
            A002.A02(cpf);
            if (A002.A01 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A03(viewGroup.getChildAt(i), cpf);
            }
        }
    }

    public static void A04(View view, AnonymousClass1HO r3, List list) {
        C25247Cbm A002 = A00(view);
        if (A002 != null) {
            r3 = A002.A00(r3);
            if (A002.A01 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A04(viewGroup.getChildAt(i), r3, list);
            }
        }
    }
}
