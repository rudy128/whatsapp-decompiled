package com.whatsapp.settings;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass112;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass1Y3;
import X.AnonymousClass1YL;
import X.AnonymousClass1YM;
import X.AnonymousClass2QJ;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass48o;
import X.C28281Zt;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C90064dT;
import X.C91034f2;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;
import com.whatsapp.wds.components.topbar.WDSToolbar;

public class About extends AnonymousClass1FY {
    public AnonymousClass1LU A00;
    public boolean A01;

    public About() {
        this(0);
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = AnonymousClass3MY.A0Z(A0L);
        }
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass1Y3 r0;
        super.onCreate(bundle);
        setContentView(2131623968);
        boolean z = !C28281Zt.A0B(this);
        WDSToolbar wDSToolbar = (WDSToolbar) findViewById(2131427362);
        if (z) {
            r0 = AnonymousClass1YM.A00;
        } else {
            r0 = AnonymousClass2QJ.A00;
        }
        wDSToolbar.setIconSet(r0);
        wDSToolbar.setNavigationOnClickListener(new C90064dT((Object) this, 16));
        int A002 = AnonymousClass1YL.A00(this, 2130971972, 2131103141);
        if (AnonymousClass112.A01()) {
            C28281Zt.A05(this, A002);
            C28281Zt.A0A(getWindow(), z);
        } else {
            C28281Zt.A05(this, 2131103052);
        }
        if (AnonymousClass112.A04()) {
            C28281Zt.A07(this, A002, C72453Mb.A03(z ? 1 : 0));
        }
        AnonymousClass3MY.A0y(this, AnonymousClass3MX.A0L(this, 2131436733), new Object[]{"2.24.24.78"}, 2131897829);
        TextView A0L = AnonymousClass3MX.A0L(this, 2131427359);
        SpannableString spannableString = new SpannableString(getString(2131897895));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        A0L.setText(spannableString);
        AnonymousClass48o.A00(A0L, this, 23);
    }

    public About(int i) {
        this.A01 = false;
        C91034f2.A00(this, 8);
    }
}
