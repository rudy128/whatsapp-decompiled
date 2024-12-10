package com.whatsapp.community;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1M9;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C17960vV;
import X.C23581Gv;
import X.C24671Lf;
import X.C24791Lr;
import X.C24921Me;
import X.C26881Tv;
import X.C27201Vd;
import X.C37451pZ;
import X.C42661yX;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C77063pI;
import X.C91004ez;
import X.C94164k9;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.WaEditText;
import com.whatsapp.jid.GroupJid;

public class EditCommunityActivity extends C77063pI {
    public AnonymousClass1M9 A00;
    public C24671Lf A01;
    public C24921Me A02;
    public C26881Tv A03;
    public C37451pZ A04;
    public C27201Vd A05;
    public AnonymousClass1E7 A06;
    public GroupJid A07;
    public boolean A08;
    public final C23581Gv A09;

    public EditCommunityActivity() {
        this(0);
        this.A09 = new C94164k9(this, 8);
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r2 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r2, this, r2.A45);
            AnonymousClass1FB.A0L(A0L, r2, this, r2.A5A);
            this.A09 = (C24791Lr) A0L.A2h.get();
            this.A0B = AnonymousClass3MZ.A0s(A0L);
            this.A0D = C72453Mb.A0p(A0L);
            this.A0F = C000200d.A00(A0L.A2P);
            this.A0C = AnonymousClass3Ma.A0r(A0L);
            this.A0A = AnonymousClass3MZ.A0j(A0L);
            this.A05 = AnonymousClass3MZ.A0i(A0L);
            this.A00 = AnonymousClass10E.A4z(A0L);
            this.A02 = AnonymousClass3MZ.A0g(A0L);
            this.A01 = AnonymousClass3Ma.A0S(A0L);
            this.A03 = (C26881Tv) A0L.AIX.get();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 64206) {
            if (i != 16436755) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            this.A0D.A0A("EditCommunityActivity");
            if (i2 != -1) {
                if (i2 == 0 && intent != null) {
                    this.A0D.A03(intent, this);
                    return;
                }
                return;
            }
        } else if (i2 == -1) {
            if (intent != null) {
                if (intent.getBooleanExtra("is_reset", false)) {
                    this.A01.A01(this.A07);
                    this.A0D.A0D(this.A06);
                    return;
                } else if (intent.getBooleanExtra("skip_cropping", false)) {
                    this.A0D.A0A("EditCommunityActivity");
                }
            }
            this.A0D.A04(intent, this, 16436755);
            return;
        } else {
            return;
        }
        this.A01.A01(this.A07);
        this.A0D.A0F(this.A06);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A04 = this.A05.A04(this, this, "community-home");
        this.A01.registerObserver(this.A09);
        AnonymousClass1EC A0Y = C72473Md.A0Y(getIntent(), "extra_community_jid");
        this.A07 = A0Y;
        AnonymousClass1E7 A0H = this.A00.A0H(A0Y);
        this.A06 = A0H;
        this.A08.setText(this.A02.A0I(A0H));
        WaEditText waEditText = this.A07;
        C42661yX r0 = this.A06.A0M;
        C17960vV.A07(r0);
        waEditText.setText(r0.A03);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168001);
        this.A04.A0B(this.A03, this.A06, dimensionPixelSize, false);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A01.unregisterObserver(this.A09);
    }

    public EditCommunityActivity(int i) {
        this.A08 = false;
        C91004ez.A00(this, 1);
    }
}
