package X;

import android.view.ViewGroup;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

/* renamed from: X.4sk  reason: invalid class name and case insensitive filesystem */
public abstract class C99394sk implements E8K {
    public Object A00;

    public void CLJ(Object obj, EEE eee) {
        C107805ac r0;
        C18070vi.A0d(eee, 1);
        Object obj2 = this.A00;
        this.A00 = obj;
        AnonymousClass5WG r4 = (AnonymousClass5WG) this;
        AnonymousClass4F7 r6 = (AnonymousClass4F7) obj;
        if (obj2.getClass() != r6.getClass()) {
            WDSTextLayout wDSTextLayout = r4.A00;
            wDSTextLayout.removeAllViews();
            wDSTextLayout.A01 = null;
            wDSTextLayout.A00 = null;
            if (r6 instanceof AnonymousClass4CH) {
                ViewGroup.LayoutParams layoutParams = wDSTextLayout.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                    wDSTextLayout.setLayoutParams(layoutParams);
                    AnonymousClass3S8 r02 = new AnonymousClass3S8(AnonymousClass3MY.A04(wDSTextLayout));
                    wDSTextLayout.addView(r02);
                    wDSTextLayout.A00 = r02;
                } else {
                    throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else if (r6 instanceof AnonymousClass4CI) {
                ViewGroup.LayoutParams layoutParams2 = wDSTextLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -1;
                    wDSTextLayout.setLayoutParams(layoutParams2);
                    AnonymousClass3S9 r03 = new AnonymousClass3S9(AnonymousClass3MY.A04(wDSTextLayout));
                    wDSTextLayout.addView(r03);
                    wDSTextLayout.A01 = r03;
                } else {
                    throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else if (r6 instanceof AnonymousClass4CJ) {
                ViewGroup.LayoutParams layoutParams3 = wDSTextLayout.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = -2;
                    wDSTextLayout.setLayoutParams(layoutParams3);
                } else {
                    throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else {
                throw AnonymousClass3MW.A14();
            }
        }
        WDSTextLayout wDSTextLayout2 = r4.A00;
        if (r6 instanceof AnonymousClass4CH) {
            r0 = wDSTextLayout2.A00;
        } else if (r6 instanceof AnonymousClass4CI) {
            r0 = wDSTextLayout2.A01;
        } else if (!r6.equals(AnonymousClass4CJ.A00)) {
            throw AnonymousClass3MW.A14();
        } else {
            return;
        }
        if (r0 != null) {
            r0.setViewState(r6);
        }
    }

    public Object BbC() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ObservableProperty(value=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
