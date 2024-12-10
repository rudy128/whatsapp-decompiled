package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* renamed from: X.Cpf  reason: case insensitive filesystem */
public final class C25972Cpf {
    public C25251Cbq A00;

    public static C25972Cpf A00(WindowInsetsAnimation windowInsetsAnimation) {
        C25972Cpf cpf = new C25972Cpf(0, (Interpolator) null, 0);
        if (Build.VERSION.SDK_INT >= 30) {
            cpf.A00 = new C22673BJo(windowInsetsAnimation);
        }
        return cpf;
    }

    public static void A01(View view, C25247Cbm cbm) {
        if (Build.VERSION.SDK_INT >= 30) {
            C22673BJo.A03(view, cbm);
            return;
        }
        Interpolator interpolator = C22672BJn.A00;
        Object tag = view.getTag(2131436010);
        if (cbm == null) {
            view.setTag(2131436019, (Object) null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
                return;
            }
            return;
        }
        C26568D4i d4i = new C26568D4i(view, cbm);
        view.setTag(2131436019, d4i);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(d4i);
        }
    }

    public long A02() {
        return this.A00.A07();
    }

    public C25972Cpf(int i, Interpolator interpolator, long j) {
        C25251Cbq cbq;
        if (Build.VERSION.SDK_INT >= 30) {
            cbq = new C22673BJo(i, interpolator, j);
        } else {
            cbq = new C25251Cbq(i, interpolator, j);
        }
        this.A00 = cbq;
    }
}
