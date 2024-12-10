package X;

import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.3mb  reason: invalid class name and case insensitive filesystem */
public final class C76103mb extends AnonymousClass3ZY {
    public static final void A00(AnonymousClass5X0 r2, WDSButton wDSButton, C18090vk r4) {
        String str;
        String A11;
        C90034dQ.A01(wDSButton, r4, 9);
        if (r2 instanceof C93454j0) {
            wDSButton.setVisibility(8);
            return;
        }
        if (r2 instanceof C93464j1) {
            wDSButton.setVisibility(0);
            C93464j1 r22 = (C93464j1) r2;
            wDSButton.setSelected(r22.A09);
            wDSButton.setEnabled(r22.A08);
            int i = r22.A02;
            if (i != 0) {
                wDSButton.setIcon(i);
            }
            int i2 = r22.A01;
            int i3 = r22.A00;
            str = null;
            if (i2 == 0) {
                A11 = null;
            } else {
                A11 = AnonymousClass3Ma.A11(wDSButton, i2);
            }
            if (i3 != 0) {
                str = AnonymousClass3Ma.A11(wDSButton, i3);
            }
        } else if (r2 instanceof C93444iz) {
            wDSButton.setVisibility(0);
            C93444iz r23 = (C93444iz) r2;
            wDSButton.setText(r23.A02);
            wDSButton.setIcon(r23.A01);
            int i4 = r23.A00;
            str = null;
            if (i4 == 0) {
                A11 = null;
            } else {
                A11 = AnonymousClass3Ma.A11(wDSButton, i4);
            }
        } else {
            return;
        }
        AnonymousClass4aR.A07(wDSButton, A11, str);
    }
}
