package com.whatsapp.areffects;

import X.AnonymousClass00R;
import X.AnonymousClass11C;
import X.AnonymousClass1D6;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3R4;
import X.AnonymousClass4DE;
import X.AnonymousClass4V6;
import X.AnonymousClass78Q;
import X.C107075Yh;
import X.C107855aj;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C194139rE;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C83484Fh;
import X.C86704Ss;
import X.C86714St;
import X.C87144Ul;
import X.C92304h5;
import X.C99144sL;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class ArEffectsButtonHeaderFragment extends Hilt_ArEffectsButtonHeaderFragment {
    public AnonymousClass11C A00;
    public final C18100vl A01 = C99144sL.A00(AnonymousClass00R.A0C, this, 1);
    public final C18100vl A02 = C83484Fh.A00(this);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131624203, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        View view2 = view;
        C18070vi.A0d(view2, 0);
        if (view2 instanceof RelativeLayout) {
            C87144Ul r1 = (C87144Ul) AnonymousClass3MX.A0Y(this.A02).A0C.getValue();
            ViewGroup viewGroup = (ViewGroup) view2;
            C107075Yh r5 = r1.A01;
            WDSButton BHC = r5.BHC(AnonymousClass3MY.A04(viewGroup));
            BHC.setId(2131427840);
            C86714St r2 = r1.A02;
            BHC.setIcon(2131231675);
            BHC.setMirrorIconForRtl(true);
            C86704Ss r22 = r2.A00;
            AnonymousClass1Y5.A03(BHC, 2131898718);
            Integer num = r22.A01;
            if (num != null) {
                AnonymousClass1Y5.A02(BHC, num.intValue());
            }
            BHC.setOnClickListener(new AnonymousClass78Q((Object) BHC, (Object) this, 14));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(20, -1);
            layoutParams.addRule(10, -1);
            viewGroup.addView(BHC, layoutParams);
            LinkedHashMap A13 = C17880vN.A13();
            LinkedHashMap A132 = C17880vN.A13();
            int dimensionPixelSize = AnonymousClass3MZ.A09(this).getDimensionPixelSize(r1.A00);
            List list = r1.A04;
            Iterator it = C29431cG.A15(C29431cG.A0r(list)).iterator();
            while (it.hasNext()) {
                C194139rE r0 = (C194139rE) it.next();
                int i = r0.A00;
                AnonymousClass4V6 r15 = (AnonymousClass4V6) r0.A01;
                AnonymousClass4DE r13 = r15.A01;
                C107855aj r12 = r15.A02;
                A132.put(AnonymousClass1D6.A01(r13, r12), r15);
                AnonymousClass3R4 r10 = new AnonymousClass3R4(AnonymousClass3MY.A04(viewGroup));
                r10.setId(View.generateViewId());
                r10.A01(new C92304h5(this, r10, r15), r12, r5, r15.A00, r15.A06);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.setMarginEnd(dimensionPixelSize * i);
                layoutParams2.addRule(21, -1);
                layoutParams2.addRule(10, -1);
                viewGroup.addView(r10, layoutParams2);
                A13.put(AnonymousClass1D6.A01(r13, r12), r10);
                if (i == 0) {
                    dimensionPixelSize += r10.getButtonWidth();
                }
            }
            int size = dimensionPixelSize * list.size();
            WDSButton BHC2 = r5.BHC(AnonymousClass3MY.A04(viewGroup));
            BHC2.setId(2131434484);
            BHC2.setIcon(2131233468);
            C86704Ss r14 = r1.A03.A00;
            AnonymousClass1Y5.A03(BHC2, 2131886711);
            Integer num2 = r14.A01;
            if (num2 != null) {
                AnonymousClass1Y5.A02(BHC2, num2.intValue());
            }
            BHC2.setOnClickListener(new AnonymousClass78Q((Object) BHC2, (Object) this, 13));
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.setMarginEnd(size);
            layoutParams3.addRule(21, -1);
            layoutParams3.addRule(10, -1);
            viewGroup.addView(BHC2, layoutParams3);
            Collection<AnonymousClass3R4> values = A13.values();
            ArrayList A0E = C29351c6.A0E(values);
            for (AnonymousClass3R4 button$app_productinfra_areffects_areffects : values) {
                A0E.add(button$app_productinfra_areffects_areffects.getButton$app_productinfra_areffects_areffects());
            }
            WDSButton[] wDSButtonArr = new WDSButton[2];
            wDSButtonArr[0] = BHC;
            ArrayList A0k = C29431cG.A0k(C18070vi.A0O(BHC2, wDSButtonArr, 1), A0E);
            AnonymousClass3MX.A1Q(new ArEffectsButtonHeaderFragment$onViewCreated$2(this, BHC2, A0k, A13, A132, (C30391dr) null), AnonymousClass3MZ.A0G(this));
        }
    }
}
