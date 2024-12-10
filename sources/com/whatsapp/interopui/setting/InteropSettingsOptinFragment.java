package com.whatsapp.interopui.setting;

import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass129;
import X.AnonymousClass1YL;
import X.AnonymousClass1ZU;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4CF;
import X.C146447Pd;
import X.C18030ve;
import X.C18070vi;
import X.C38541rS;
import X.C39401t1;
import X.C825148g;
import X.C88494Zy;
import X.C99434so;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;
import java.util.Iterator;

public final class InteropSettingsOptinFragment extends Hilt_InteropSettingsOptinFragment {
    public AnonymousClass11C A00;
    public C18030ve A01;
    public AnonymousClass129 A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625377, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        WDSTextLayout wDSTextLayout = (WDSTextLayout) C18070vi.A05(view, 2131435298);
        wDSTextLayout.setFootnoteText(A1H(2131895950));
        AnonymousClass3MY.A1J(this, wDSTextLayout, 2131895916);
        C88494Zy[] r4 = new C88494Zy[2];
        C88494Zy.A01(AnonymousClass3MY.A0n(this, 2131895914), (CharSequence) null, r4, 2131233679, 0);
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            AnonymousClass4CF.A00(wDSTextLayout, C18070vi.A0O(new C88494Zy(((C38541rS) r0.get()).A04(AnonymousClass3MY.A04(view), new C146447Pd(this, 30), AnonymousClass3MY.A0n(this, 2131895915), "learn-more", AnonymousClass1YL.A00(view.getContext(), 2130970299, 2131101293)), (CharSequence) null, 2131233682), r4, 1));
            Iterator A002 = C99434so.A00(C18070vi.A05(wDSTextLayout, 2131429513), 1);
            int i = 0;
            while (A002.hasNext()) {
                Object next = A002.next();
                int i2 = i + 1;
                if (i < 0) {
                    AnonymousClass1ZU.A0B();
                    throw null;
                }
                View view2 = (View) next;
                if (i == 1) {
                    TextView A0E = AnonymousClass3Ma.A0E(view2, 2131428486);
                    C18030ve r02 = this.A01;
                    if (r02 != null) {
                        AnonymousClass3Ma.A1I(A0E, r02);
                        Rect rect = C39401t1.A0A;
                        AnonymousClass11C r03 = this.A00;
                        if (r03 != null) {
                            AnonymousClass3MZ.A1Q(A0E, r03);
                        } else {
                            str = "systemServices";
                        }
                    } else {
                        str = "abProps";
                    }
                    C18070vi.A11(str);
                    throw null;
                }
                i = i2;
            }
            AnonymousClass3MY.A1I(this, wDSTextLayout, 2131887451);
            wDSTextLayout.setPrimaryButtonClickListener(new C825148g(this, 42));
            return;
        }
        C18070vi.A11("linkifierUtils");
        throw null;
    }
}
