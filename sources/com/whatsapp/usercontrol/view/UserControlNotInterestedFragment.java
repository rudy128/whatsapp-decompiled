package com.whatsapp.usercontrol.view;

import X.A3H;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6U3;
import X.AnonymousClass7RC;
import X.C121556Kl;
import X.C121566Km;
import X.C18030ve;
import X.C18070vi;
import X.C19740yt;
import X.C30391dr;
import android.os.Bundle;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import com.whatsapp.FAQTextView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.list.listitem.WDSListItem;

public final class UserControlNotInterestedFragment extends UserControlBaseFragment {
    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        WaTextView waTextView = this.A03;
        if (waTextView != null) {
            waTextView.setText(2131897229);
        }
        AnonymousClass3MX.A1Q(new UserControlNotInterestedFragment$onViewCreated$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
    }

    public void A2K(AnonymousClass6U3 r11) {
        if (r11 instanceof C121566Km) {
            WDSListItem wDSListItem = this.A08;
            if (wDSListItem != null) {
                wDSListItem.setText((CharSequence) ((C121566Km) r11).A00);
            }
        } else if (r11 instanceof C121556Kl) {
            String str = ((C121556Kl) r11).A00;
            FAQTextView fAQTextView = this.A02;
            if (fAQTextView != null) {
                fAQTextView.setText(A3H.A00(A14(), (TextAppearanceSpan) null, AnonymousClass7RC.A00(this, 48), str, "undo", C19740yt.A00(A14(), 2131103158), false));
            }
            FAQTextView fAQTextView2 = this.A02;
            if (fAQTextView2 != null) {
                C18030ve r0 = this.A05;
                if (r0 != null) {
                    AnonymousClass3Ma.A1I(fAQTextView2, r0);
                } else {
                    AnonymousClass3MW.A1A();
                    throw null;
                }
            }
        } else {
            super.A2K(r11);
        }
    }
}
