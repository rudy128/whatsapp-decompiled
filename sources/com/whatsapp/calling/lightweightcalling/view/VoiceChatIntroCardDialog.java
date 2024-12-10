package com.whatsapp.calling.lightweightcalling.view;

import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1V9;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4CF;
import X.AnonymousClass4CI;
import X.C18070vi;
import X.C40501uo;
import X.C72453Mb;
import X.C72473Md;
import X.C82814Ce;
import X.C82824Cf;
import X.C87004Tx;
import X.C87134Uk;
import X.C88494Zy;
import X.C90034dQ;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.components.MaxHeightLinearLayout;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public final class VoiceChatIntroCardDialog extends Hilt_VoiceChatIntroCardDialog {
    public View.OnClickListener A00;
    public AnonymousClass1V9 A01;
    public boolean A02;
    public boolean A03;
    public MaxHeightLinearLayout A04;

    public void A21(Bundle bundle, View view) {
        String string;
        String string2;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        this.A04 = (MaxHeightLinearLayout) view;
        View A06 = AnonymousClass1HF.A06(view, 2131429510);
        C18070vi.A0z(A06, "null cannot be cast to non-null type com.whatsapp.wds.components.textlayout.WDSTextLayout");
        WDSTextLayout wDSTextLayout = (WDSTextLayout) A06;
        C82814Ce r7 = C82814Ce.MEDIUM;
        Resources A09 = AnonymousClass3MZ.A09(this);
        int i = 2131233553;
        if (this.A02) {
            i = 2131233554;
        }
        String str = null;
        Drawable A002 = C40501uo.A00((Resources.Theme) null, A09, i);
        String string3 = AnonymousClass3MZ.A09(this).getString(2131898025);
        if (this.A02) {
            string = null;
        } else {
            string = AnonymousClass3MZ.A09(this).getString(2131898024);
        }
        C87134Uk r8 = new C87134Uk(A002, r7, string3, string);
        C82824Cf r9 = C82824Cf.FOOTER;
        C88494Zy[] r4 = new C88494Zy[2];
        Resources A092 = AnonymousClass3MZ.A09(this);
        int i2 = 2131898029;
        if (this.A02) {
            i2 = 2131898044;
        }
        String A0m = AnonymousClass3MY.A0m(A092, i2);
        if (this.A02) {
            string2 = null;
        } else {
            string2 = AnonymousClass3MZ.A09(this).getString(2131898028);
        }
        C88494Zy.A01(A0m, string2, r4, 2131232107, 0);
        Resources A093 = AnonymousClass3MZ.A09(this);
        int i3 = 2131898027;
        if (this.A02) {
            i3 = 2131898043;
        }
        String A0m2 = AnonymousClass3MY.A0m(A093, i3);
        if (!this.A02) {
            str = AnonymousClass3MZ.A09(this).getString(2131898026);
        }
        AnonymousClass4CF r10 = new AnonymousClass4CF(C18070vi.A0O(new C88494Zy(A0m2, str, 2131232146), r4, 1));
        Resources A094 = AnonymousClass3MZ.A09(this);
        int i4 = 2131898023;
        if (this.A02) {
            i4 = 2131898042;
        }
        wDSTextLayout.setTextLayoutViewState(new AnonymousClass4CI(new C87004Tx(new C90034dQ(this, 41), AnonymousClass3MY.A0m(A094, i4)), new C87004Tx(new C90034dQ(this, 42), AnonymousClass3MY.A0m(AnonymousClass3MZ.A09(this), 2131898766)), r8, r9, r10, (CharSequence) null));
        View A062 = AnonymousClass1HF.A06(view, 2131429518);
        C18070vi.A0b(A062);
        ViewGroup.LayoutParams layoutParams = A062.getLayoutParams();
        if (layoutParams != null) {
            AnonymousClass3MZ.A1F(A062, layoutParams);
            A00();
            return;
        }
        throw AnonymousClass3MY.A0k();
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        A00();
    }

    private final void A00() {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            float f = 0.85f;
            if (C72453Mb.A08(A14()) == 2) {
                f = 1.0f;
            }
            C72473Md.A0p(A1B, this.A04, f);
        }
    }

    public void A1s() {
        super.A1s();
        if (!this.A03) {
            AnonymousClass1V9 r2 = this.A01;
            if (r2 != null) {
                r2.A00(23, 38);
            } else {
                C18070vi.A11("callUserJourneyLogger");
                throw null;
            }
        }
        this.A04 = null;
        this.A03 = false;
    }

    public int A2F() {
        return 2131627453;
    }
}
