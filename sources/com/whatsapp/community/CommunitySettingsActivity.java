package com.whatsapp.community;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass5X9;
import X.AnonymousClass8GZ;
import X.C000200d;
import X.C101875Eh;
import X.C101885Ei;
import X.C103995Ml;
import X.C105225Re;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C28931bI;
import X.C34511kb;
import X.C56362hL;
import X.C72473Md;
import X.C72483Me;
import X.C84004Hm;
import X.C89894dC;
import X.C91004ez;
import X.C91644g1;
import X.C98804rk;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel;
import com.whatsapp.wds.components.list.listitem.WDSListItem;

public final class CommunitySettingsActivity extends AnonymousClass1FY implements AnonymousClass5X9 {
    public C56362hL A00;
    public AnonymousClass1EC A01;
    public C28931bI A02;
    public WDSListItem A03;
    public AnonymousClass00H A04;
    public boolean A05;
    public final C18100vl A06;
    public final C18100vl A07;
    public final C18100vl A08;

    public CommunitySettingsActivity() {
        this(0);
        this.A07 = AnonymousClass1DF.A00(AnonymousClass00R.A01, new C103995Ml(this));
        this.A08 = AnonymousClass1DF.A01(new C101885Ei(this));
        this.A06 = AnonymousClass1DF.A01(new C101875Eh(this));
    }

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A04 = C000200d.A00(r2.A2L);
            this.A00 = (C56362hL) A0K.A1r.get();
        }
    }

    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView(2131624038);
        C18000vb r1 = this.A00;
        C18070vi.A0W(r1);
        C84004Hm.A00(this, (Toolbar) AnonymousClass3MY.A0C(this, 2131436270), r1, C18070vi.A0F(this, 2131888599));
        this.A02 = AnonymousClass3Ma.A0x(this, 2131429284);
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            C34511kb A0Z = AnonymousClass3MW.A0Z(r0);
            C18100vl r3 = this.A07;
            AnonymousClass1EC A042 = A0Z.A04(AnonymousClass3MX.A0p(r3));
            this.A01 = A042;
            if (bundle == null && A042 != null) {
                CommunitySettingsViewModel communitySettingsViewModel = (CommunitySettingsViewModel) this.A08.getValue();
                AnonymousClass1EC A0p = AnonymousClass3MX.A0p(r3);
                AnonymousClass8GZ r4 = (AnonymousClass8GZ) this.A06.getValue();
                C18070vi.A0d(A0p, 0);
                communitySettingsViewModel.A03 = A0p;
                communitySettingsViewModel.A02 = A042;
                C98804rk.A01(communitySettingsViewModel.A09, communitySettingsViewModel, A0p, 26);
                communitySettingsViewModel.A01 = r4;
                if (r4 != null) {
                    C91644g1.A01(r4.A0E, communitySettingsViewModel.A04, new C105225Re(communitySettingsViewModel), 0);
                }
            }
            WDSListItem wDSListItem = (WDSListItem) AnonymousClass3MY.A0H(this, 2131429283);
            this.A03 = wDSListItem;
            if (wDSListItem == null) {
                C18070vi.A11("allowNonAdminSubgroupCreation");
                throw null;
            }
            wDSListItem.setIcon((Drawable) null);
            WDSListItem wDSListItem2 = this.A03;
            if (wDSListItem2 == null) {
                C18070vi.A11("allowNonAdminSubgroupCreation");
                throw null;
            }
            C89894dC.A00(wDSListItem2, this, 17);
            C18100vl r42 = this.A08;
            AnonymousClass3MY.A1K(this, ((CommunitySettingsViewModel) r42.getValue()).A07, AnonymousClass3MW.A16(this, 13), 33);
            if (this.A01 != null) {
                C28931bI r02 = this.A02;
                if (r02 == null) {
                    C18070vi.A11("membersAddSettingRow");
                    throw null;
                }
                r02.A04(0);
                C28931bI r03 = this.A02;
                if (r03 == null) {
                    C18070vi.A11("membersAddSettingRow");
                    throw null;
                }
                ((WDSListItem) r03.A02()).setIcon((Drawable) null);
                C28931bI r04 = this.A02;
                if (r04 == null) {
                    C18070vi.A11("membersAddSettingRow");
                    throw null;
                }
                WDSListItem wDSListItem3 = (WDSListItem) r04.A02();
                if (AnonymousClass3MX.A1Y(this.A0E)) {
                    string = getString(2131888597);
                } else {
                    string = getString(2131888589);
                }
                wDSListItem3.setText((CharSequence) string);
                C28931bI r05 = this.A02;
                if (r05 == null) {
                    C18070vi.A11("membersAddSettingRow");
                    throw null;
                } else {
                    C89894dC.A00(r05.A02(), this, 16);
                    AnonymousClass3MY.A1K(this, ((CommunitySettingsViewModel) r42.getValue()).A04, AnonymousClass3MW.A16(this, 14), 33);
                }
            }
            AnonymousClass3MY.A1K(this, ((CommunitySettingsViewModel) r42.getValue()).A08, AnonymousClass3MW.A16(this, 15), 33);
            return;
        }
        C18070vi.A11("communityChatManager");
        throw null;
    }

    public CommunitySettingsActivity(int i) {
        this.A05 = false;
        C91004ez.A00(this, 0);
    }
}
