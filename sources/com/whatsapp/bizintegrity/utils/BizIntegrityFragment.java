package com.whatsapp.bizintegrity.utils;

import X.AnonymousClass000;
import X.AnonymousClass11C;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass4FE;
import X.AnonymousClass5YY;
import X.C17880vN;
import X.C17890vO;
import X.C18030ve;
import X.C26302CxJ;
import X.C35751mk;
import X.C35771mm;
import X.C55892gX;
import X.C74703cE;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutFragment;
import com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment;
import com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class BizIntegrityFragment extends WDSBottomSheetDialogFragment {
    public View A00;
    public FrameLayout A01;
    public LinearLayout A02;
    public AnonymousClass1L9 A03;
    public AnonymousClass1KB A04;
    public WaImageView A05;
    public AnonymousClass4FE A06;
    public AnonymousClass11C A07;
    public C18030ve A08;
    public AnonymousClass1LU A09;
    public WDSButton A0A;
    public WDSButton A0B;
    public Map A0C;

    /* JADX WARNING: type inference failed for: r9v0, types: [X.4FE, java.lang.Object] */
    public void A2K() {
        if (this instanceof MarketingReOptInFragment) {
            MarketingReOptInFragment marketingReOptInFragment = (MarketingReOptInFragment) this;
            marketingReOptInFragment.A01.A06(marketingReOptInFragment.A03, (String) null, marketingReOptInFragment.A04, 1);
            marketingReOptInFragment.A28();
        } else if (this instanceof MarketingOptOutReasonsFragment) {
            MarketingOptOutReasonsFragment marketingOptOutReasonsFragment = (MarketingOptOutReasonsFragment) this;
            marketingOptOutReasonsFragment.A03 = true;
            marketingOptOutReasonsFragment.A28();
        } else {
            MarketingOptOutFragment marketingOptOutFragment = (MarketingOptOutFragment) this;
            marketingOptOutFragment.A28();
            C55892gX r5 = marketingOptOutFragment.A01;
            UserJid userJid = marketingOptOutFragment.A03;
            ? obj = new Object();
            obj.A01 = 2131625928;
            obj.A06 = null;
            obj.A04 = null;
            obj.A05 = null;
            obj.A02 = 2131891897;
            obj.A03 = 2131891895;
            obj.A00 = 2131891896;
            obj.A07 = 2131891894;
            C18030ve r12 = r5.A04;
            AnonymousClass1KB r7 = r5.A01;
            AnonymousClass1LU r13 = r5.A05;
            MarketingOptOutReasonsFragment marketingOptOutReasonsFragment2 = new MarketingOptOutReasonsFragment(r5.A00, r7, (C35771mm) r5.A06.get(), obj, (C35751mk) r5.A07.get(), r5.A02, r12, r13, userJid);
            marketingOptOutReasonsFragment2.A2C(marketingOptOutFragment.A1F(), C17890vO.A0U(marketingOptOutReasonsFragment2));
        }
    }

    public void A2L() {
        if (!(this instanceof MarketingReOptInFragment)) {
            A28();
        }
    }

    public void A2M(View view, int i, int i2) {
        TextEmojiLabel A0W = AnonymousClass3MX.A0W(view, i);
        Context A1n = A1n();
        C18030ve r3 = this.A08;
        AnonymousClass1KB r12 = this.A04;
        AnonymousClass1L9 r11 = this.A03;
        AnonymousClass11C r13 = this.A07;
        String A1H = A1H(i2);
        Map map = this.A0C;
        HashMap hashMap = C26302CxJ.A01;
        HashMap A11 = C17880vN.A11();
        if (map != null) {
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                Object key = A16.getKey();
                C74703cE r9 = new C74703cE(A1n, r11, r12, r13, A16.getValue().toString());
                r9.A03 = false;
                r9.A04((AnonymousClass5YY) map.get(key));
                A11.put(A16.getKey(), r9);
            }
        }
        SpannableStringBuilder A032 = C26302CxJ.A03(A1H, A11);
        AnonymousClass3Ma.A1L(r3, A0W);
        AnonymousClass3Ma.A1K(A0W, r13);
        A0W.setText(A032);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1q(android.os.Bundle r10, android.view.LayoutInflater r11, android.view.ViewGroup r12) {
        /*
            r9 = this;
            r0 = 2131624269(0x7f0e014d, float:1.8875713E38)
            r3 = 0
            android.view.View r1 = r11.inflate(r0, r12, r3)
            r9.A00 = r1
            r0 = 2131428130(0x7f0b0322, float:1.8477896E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass3MW.A0R(r1, r0)
            r9.A05 = r0
            android.view.View r1 = r9.A00
            r0 = 2131428127(0x7f0b031f, float:1.847789E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.AnonymousClass3MW.A0q(r1, r0)
            r9.A0A = r0
            android.view.View r1 = r9.A00
            r0 = 2131428133(0x7f0b0325, float:1.8477902E38)
            com.whatsapp.wds.components.button.WDSButton r1 = X.AnonymousClass3MW.A0q(r1, r0)
            r9.A0B = r1
            X.4FE r2 = r9.A06
            java.lang.Integer r0 = r2.A07
            int r0 = X.C72453Mb.A0F(r0)
            r1.setVisibility(r0)
            android.view.View r1 = r9.A00
            r0 = 2131428128(0x7f0b0320, float:1.8477892E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r9.A01 = r1
            int r0 = r2.A01
            android.view.View r0 = r11.inflate(r0, r1, r3)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r9.A02 = r0
            boolean r3 = r9 instanceof com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment
            if (r3 == 0) goto L_0x01d5
            java.util.HashMap r2 = X.C17880vN.A11()
            r0 = 3
            X.4gm r1 = new X.4gm
            r1.<init>(r9, r0)
            java.lang.String r0 = "stop-business-info"
            r2.put(r0, r1)
            r0 = 4
            X.4gm r1 = new X.4gm
            r1.<init>(r9, r0)
            java.lang.String r0 = "offers-updates"
        L_0x0066:
            r2.put(r0, r1)
        L_0x0069:
            r9.A0C = r2
            X.4FE r5 = r9.A06
            java.lang.Integer r4 = r5.A06
            if (r4 == 0) goto L_0x01cc
            java.lang.Integer r0 = r5.A04
            if (r0 == 0) goto L_0x01cc
            com.whatsapp.WaImageView r2 = r9.A05
            android.content.Context r1 = r9.A1n()
            int r0 = r0.intValue()
            android.graphics.drawable.Drawable r0 = X.AnonymousClass03S.A01(r1, r0)
            r2.setBackground(r0)
            android.content.Context r1 = r9.A1n()
            int r0 = r4.intValue()
            android.graphics.drawable.Drawable r0 = X.AnonymousClass03S.A01(r1, r0)
            android.graphics.drawable.Drawable r2 = r0.mutate()
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r9)
            java.lang.Integer r0 = r5.A05
            int r0 = r0.intValue()
            int r1 = r1.getColor(r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r2.setColorFilter(r1, r0)
            com.whatsapp.WaImageView r0 = r9.A05
            r0.setImageDrawable(r2)
        L_0x00ae:
            com.whatsapp.wds.components.button.WDSButton r2 = r9.A0A
            X.4FE r1 = r9.A06
            int r0 = r1.A00
            r2.setText(r0)
            java.lang.Integer r0 = r1.A07
            if (r0 == 0) goto L_0x00d1
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A0B
            int r0 = r0.intValue()
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A0B
            r0 = 0
            r1.setBackground(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A0B
            r0 = 26
            X.AnonymousClass3MZ.A1I(r1, r9, r0)
        L_0x00d1:
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A0A
            r0 = 27
            X.AnonymousClass3MZ.A1I(r1, r9, r0)
            android.view.View r6 = r9.A00
            X.4FE r0 = r9.A06
            int r5 = r0.A02
            android.content.Context r2 = r6.getContext()
            r1 = 2130970831(0x7f0408cf, float:1.7550383E38)
            r0 = 2131102246(0x7f060a26, float:1.7816925E38)
            int r4 = X.AnonymousClass1YL.A00(r2, r1, r0)
            r0 = 2131428136(0x7f0b0328, float:1.8477908E38)
            android.widget.TextView r2 = X.C17880vN.A0E(r6, r0)
            android.content.res.Resources r0 = X.AnonymousClass3MZ.A09(r9)
            java.lang.String r1 = r0.getString(r5)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.NORMAL
            r2.setText(r1, r0)
            android.content.res.Resources r0 = X.AnonymousClass3MZ.A09(r9)
            int r0 = r0.getColor(r4)
            r2.setTextColor(r0)
            android.view.View r1 = r9.A00
            r0 = 2131428131(0x7f0b0323, float:1.8477898E38)
            android.view.View r2 = r1.findViewById(r0)
            X.4FE r0 = r9.A06
            java.lang.Integer r1 = r0.A03
            int r0 = X.C72453Mb.A0F(r1)
            r2.setVisibility(r0)
            if (r1 == 0) goto L_0x014e
            android.view.View r2 = r9.A00
            int r1 = r1.intValue()
            android.content.Context r0 = r9.A1n()
            int r4 = X.C72463Mc.A01(r0)
            r0 = 2131428131(0x7f0b0323, float:1.8477898E38)
            android.widget.TextView r2 = X.C17880vN.A0E(r2, r0)
            android.content.res.Resources r0 = X.AnonymousClass3MZ.A09(r9)
            java.lang.String r1 = r0.getString(r1)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.NORMAL
            r2.setText(r1, r0)
            android.content.res.Resources r0 = X.AnonymousClass3MZ.A09(r9)
            int r0 = r0.getColor(r4)
            r2.setTextColor(r0)
        L_0x014e:
            android.widget.FrameLayout r1 = r9.A01
            android.widget.LinearLayout r0 = r9.A02
            r1.addView(r0)
            r5 = r9
            if (r3 == 0) goto L_0x0171
            android.widget.LinearLayout r2 = r9.A02
            r1 = 2131432312(0x7f0b1378, float:1.8486378E38)
            r0 = 2131891900(0x7f1216bc, float:1.9418533E38)
            r9.A2M(r2, r1, r0)
            android.widget.LinearLayout r2 = r9.A02
            r1 = 2131432309(0x7f0b1375, float:1.8486372E38)
            r0 = 2131891903(0x7f1216bf, float:1.941854E38)
        L_0x016b:
            r9.A2M(r2, r1, r0)
        L_0x016e:
            android.view.View r0 = r9.A00
            return r0
        L_0x0171:
            boolean r0 = r9 instanceof com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment
            if (r0 == 0) goto L_0x01b8
            com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment r5 = (com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment) r5
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r5.A02 = r0
            X.4FC[] r8 = com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutReasonsFragment.A08
            r6 = 4
            r4 = 0
        L_0x0181:
            r7 = r8[r4]
            r0 = 2131624270(0x7f0e014e, float:1.8875715E38)
            android.view.View r3 = X.AnonymousClass3MY.A0D(r11, r0)
            r0 = 2131428134(0x7f0b0326, float:1.8477904E38)
            android.widget.TextView r2 = X.C17880vN.A0E(r3, r0)
            r0 = 2131428132(0x7f0b0324, float:1.84779E38)
            android.view.View r1 = r3.findViewById(r0)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r5.A07
            r1.setOnCheckedChangeListener(r0)
            int r0 = r7.A00
            r2.setText(r0)
            android.view.View$OnClickListener r0 = r5.A00
            r3.setOnClickListener(r0)
            java.util.List r0 = r5.A02
            r0.add(r1)
            android.widget.LinearLayout r0 = r5.A02
            r0.addView(r3)
            int r4 = r4 + 1
            if (r4 >= r6) goto L_0x016e
            goto L_0x0181
        L_0x01b8:
            android.widget.LinearLayout r2 = r9.A02
            r1 = 2131432310(0x7f0b1376, float:1.8486374E38)
            r0 = 2131891898(0x7f1216ba, float:1.941853E38)
            r9.A2M(r2, r1, r0)
            android.widget.LinearLayout r2 = r9.A02
            r1 = 2131432314(0x7f0b137a, float:1.8486382E38)
            r0 = 2131891887(0x7f1216af, float:1.9418507E38)
            goto L_0x016b
        L_0x01cc:
            com.whatsapp.WaImageView r1 = r9.A05
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00ae
        L_0x01d5:
            boolean r0 = r9 instanceof com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutFragment
            if (r0 == 0) goto L_0x01f2
            java.util.HashMap r2 = X.C17880vN.A11()
            r0 = 1
            X.4gm r1 = new X.4gm
            r1.<init>(r9, r0)
            java.lang.String r0 = "resume-business-info"
            r2.put(r0, r1)
            r0 = 2
            X.4gm r1 = new X.4gm
            r1.<init>(r9, r0)
            java.lang.String r0 = "intro-warning"
            goto L_0x0066
        L_0x01f2:
            r2 = 0
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bizintegrity.utils.BizIntegrityFragment.A1q(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }
}
