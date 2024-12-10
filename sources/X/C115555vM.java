package X;

import android.app.Activity;
import android.view.View;
import android.view.Window;

/* renamed from: X.5vM  reason: invalid class name and case insensitive filesystem */
public final class C115555vM extends C25141CZr {
    public final C18100vl A00;

    public void A01(View view, DOZ doz, DFL dfl, DFL dfl2) {
        Object obj;
        C18070vi.A0d(view, 0);
        boolean A0I = dfl.A0I(35, false);
        C128276fj r6 = (C128276fj) C26272CwJ.A04(doz, dfl);
        if (r6 != null) {
            if (C18020vd.A05(C18040vf.A02, r6.A00, 11037)) {
                try {
                    obj = AnonymousClass3Ma.A05(view);
                } catch (Throwable th) {
                    obj = C108945cZ.A1J(th);
                }
                if (obj instanceof AnonymousClass1IU) {
                    obj = null;
                }
                Activity activity = (Activity) obj;
                if (activity != null) {
                    if (!r6.A02) {
                        r6.A02 = true;
                        boolean A0B = C28281Zt.A0B(activity);
                        Window window = activity.getWindow();
                        if (window != null) {
                            window.setNavigationBarColor(0);
                            window.setStatusBarColor(0);
                            boolean z = !A0B;
                            C123496Ur r0 = new C25932Cow(window.getDecorView(), window).A00;
                            r0.A03(z);
                            r0.A04(z);
                        }
                    }
                    if (r6.A01 != A0I) {
                        r6.A01 = A0I;
                        Window window2 = activity.getWindow();
                        if (window2 != null) {
                            AnonymousClass6VM.A00(window2, !A0I);
                        }
                        View findViewById = activity.findViewById(16908290);
                        if (findViewById != null) {
                            AnonymousClass1HF.A0g(findViewById, new C1425679y(A0I));
                        }
                    }
                }
            }
        }
    }

    public void A02(View view, DOZ doz, DFL dfl, DFL dfl2) {
        C18070vi.A0d(view, 0);
        C128276fj r0 = (C128276fj) C26272CwJ.A04(doz, dfl);
        if (r0 != null) {
            r0.A01 = false;
        }
    }

    public C115555vM(C18140vp r3) {
        super(16807);
        this.A00 = AnonymousClass1DF.A01(new C147967gg(r3, 13));
    }

    public /* bridge */ /* synthetic */ Object A00(DOZ doz) {
        return this.A00.getValue();
    }
}
