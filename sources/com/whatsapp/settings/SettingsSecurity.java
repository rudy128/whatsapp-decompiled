package com.whatsapp.settings;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass129;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1U5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C26302CxJ;
import X.C36531o3;
import X.C36721oM;
import X.C38541rS;
import X.C72473Md;
import X.C72483Me;
import X.C89974dK;
import X.C90874em;
import X.C91034f2;
import X.C98844ro;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;

public class SettingsSecurity extends AnonymousClass1FY {
    public C36531o3 A00;
    public C36721oM A01;
    public AnonymousClass1U5 A02;
    public AnonymousClass129 A03;
    public C38541rS A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public boolean A07;
    public boolean A08;

    public SettingsSecurity() {
        this(0);
        this.A07 = false;
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A05 = C000200d.A00(r2.A6N);
            this.A03 = AnonymousClass3Ma.A0t(r2);
            this.A06 = C000200d.A00(r2.A6x);
            this.A01 = (C36721oM) A0K.A0m.get();
            this.A02 = (AnonymousClass1U5) r2.A3L.get();
            this.A00 = AnonymousClass3Ma.A0T(r2);
            this.A04 = (C38541rS) r2.A5j.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131896004);
        setContentView(2131626927);
        C72473Md.A17(this);
        C18030ve r1 = this.A0E;
        C18040vf r5 = C18040vf.A02;
        this.A07 = C18020vd.A05(r5, r1, 8926);
        CompoundButton compoundButton = (CompoundButton) AnonymousClass1HF.A06(this.A00, 2131435047);
        compoundButton.setChecked(this.A0A.A2M());
        C90874em.A00(compoundButton, this, 21);
        if (this.A07) {
            C36721oM r10 = this.A01;
            int i = 2131895576;
            if (C72473Md.A1Y(this.A06)) {
                i = 2131895577;
            }
            String A0R = C17890vO.A0R(this, "learn-more", 1, 0, i);
            TextEmojiLabel A0V = AnonymousClass3MX.A0V(this.A00, 2131435324);
            C18070vi.A0f(A0R, 0, A0V);
            r10.A00(this, A0V, A0R, "learn-more", "security-code-change-notification");
        } else {
            C18030ve r15 = this.A0E;
            AnonymousClass1KB r12 = this.A05;
            AnonymousClass1L9 r11 = this.A01;
            AnonymousClass11C r14 = this.A08;
            TextEmojiLabel A0V2 = AnonymousClass3MX.A0V(this.A00, 2131435324);
            int i2 = 2131895576;
            if (C72473Md.A1Y(this.A06)) {
                i2 = 2131895577;
            }
            C26302CxJ.A0K(this, this.A03.A05("security-and-privacy", "security-code-change-notification"), r11, r12, A0V2, r14, r15, C17890vO.A0R(this, "learn-more", 1, 0, i2), "learn-more");
        }
        C18030ve r152 = this.A0E;
        AnonymousClass1KB r122 = this.A05;
        AnonymousClass1L9 r112 = this.A01;
        AnonymousClass11C r142 = this.A08;
        C26302CxJ.A0K(this, this.A03.A00("https://www.whatsapp.com/security"), r112, r122, AnonymousClass3MX.A0V(this.A00, 2131435323), r142, r152, C17890vO.A0R(this, "learn-more", 1, 0, 2131895580), "learn-more");
        TextView A0J = AnonymousClass3MW.A0J(this.A00, 2131435326);
        int i3 = 2131896006;
        if (C72473Md.A1Y(this.A06)) {
            i3 = 2131896007;
        }
        A0J.setText(i3);
        C89974dK.A00(findViewById(2131435048), compoundButton, 1);
        if (C18020vd.A05(r5, this.A0E, 1071)) {
            View A062 = AnonymousClass1HF.A06(this.A00, 2131430240);
            View A063 = AnonymousClass1HF.A06(this.A00, 2131435327);
            TextEmojiLabel A0V3 = AnonymousClass3MX.A0V(this.A00, 2131435054);
            SpannableStringBuilder A012 = C38541rS.A01(this, new C98844ro((Object) this, 21), getString(2131899101));
            AnonymousClass3Ma.A1L(this.A0E, A0V3);
            A0V3.setText(A012);
            A062.setVisibility(0);
            A063.setVisibility(8);
        }
        AnonymousClass1HF.A06(this.A00, 2131435322);
    }

    public SettingsSecurity(int i) {
        this.A08 = false;
        C91034f2.A00(this, 22);
    }
}
