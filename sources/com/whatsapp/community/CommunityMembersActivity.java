package com.whatsapp.community;

import X.A2B;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11S;
import X.AnonymousClass129;
import X.AnonymousClass12E;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1KW;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3XL;
import X.AnonymousClass4G9;
import X.AnonymousClass4P7;
import X.AnonymousClass4PT;
import X.AnonymousClass4XS;
import X.AnonymousClass4XU;
import X.AnonymousClass5X7;
import X.AnonymousClass5Z1;
import X.AnonymousClass5Z2;
import X.C000200d;
import X.C003401n;
import X.C110885hR;
import X.C222219b;
import X.C24921Me;
import X.C27201Vd;
import X.C36401np;
import X.C37451pZ;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C90994ey;
import X.C91484fl;
import X.C91514fo;
import X.C91524fp;
import X.C91584fv;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.GroupJid;

public class CommunityMembersActivity extends AnonymousClass1FY {
    public C003401n A00;
    public RecyclerView A01;
    public AnonymousClass4PT A02;
    public AnonymousClass5Z1 A03;
    public AnonymousClass5Z2 A04;
    public AnonymousClass5X7 A05;
    public AnonymousClass1M9 A06;
    public C24921Me A07;
    public C27201Vd A08;
    public AnonymousClass12E A09;
    public AnonymousClass129 A0A;
    public C36401np A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public Runnable A0G;
    public boolean A0H;

    public CommunityMembersActivity() {
        this(0);
    }

    public int A31() {
        return 579545668;
    }

    public void A2y() {
        if (!this.A0H) {
            this.A0H = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r3 = r2.A00;
            AnonymousClass1FB.A0K(r2, r3, this, r3.A45);
            AnonymousClass1FB.A0L(r2, r3, this, r3.A5A);
            this.A05 = (AnonymousClass5X7) A0K.A1W.get();
            this.A0B = AnonymousClass3MY.A0e(r3);
            this.A0F = AnonymousClass3MW.A0s(r2);
            this.A08 = AnonymousClass3MZ.A0i(r2);
            this.A06 = AnonymousClass10E.A4z(r2);
            this.A0A = AnonymousClass3Ma.A0t(r2);
            this.A07 = AnonymousClass3MZ.A0g(r2);
            this.A0C = C000200d.A00(r2.A0F);
            this.A09 = (AnonymousClass12E) r2.A2k.get();
            this.A0E = C000200d.A00(r2.A2L);
            this.A0D = C000200d.A00(r2.A0l);
            this.A04 = (AnonymousClass5Z2) A0K.A1f.get();
            this.A02 = (AnonymousClass4PT) A0K.A0f.get();
            this.A03 = (AnonymousClass5Z1) A0K.A1e.get();
        }
    }

    public void onCreate(Bundle bundle) {
        GroupJid groupJid;
        super.onCreate(bundle);
        A3D("load_community_member");
        setContentView(2131624039);
        C003401n A0S = C72463Mc.A0S(this, AnonymousClass3Ma.A0G(this));
        this.A00 = A0S;
        A0S.A0Y(true);
        this.A00.A0W(true);
        this.A00.A0M(2131891970);
        C37451pZ A062 = this.A08.A06(this, "community-view-members");
        this.A01 = (RecyclerView) C110885hR.A0A(this, 2131429252);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.A1Z(1);
        this.A01.setLayoutManager(linearLayoutManager);
        AnonymousClass1EC A0Y = C72473Md.A0Y(getIntent(), "extra_community_jid");
        boolean A1a = AnonymousClass3MY.A1a(getIntent(), "extra_non_cag_members_view");
        A2B A012 = AnonymousClass3MW.A0Z(this.A0E).A01(A0Y);
        if (A012 != null) {
            groupJid = A012.A02;
        } else {
            groupJid = null;
        }
        AnonymousClass4XS BGK = this.A03.BGK(this, A0Y, 2);
        CommunityMembersViewModel A002 = AnonymousClass4G9.A00(this, this.A05, A0Y);
        AnonymousClass5Z2 r1 = this.A04;
        AnonymousClass11S r9 = this.A02;
        AnonymousClass1KW r15 = this.A0D;
        AnonymousClass3XL BGn = r1.BGn(new AnonymousClass4P7((AnonymousClass4XU) this.A0D.get(), r9, this, BGK, A002, this.A06, this.A07, r15), A062, groupJid, A0Y);
        BGn.A0K(true);
        this.A01.setAdapter(BGn);
        C91584fv.A00(this, A002.A01, 8);
        A002.A00.A0A(this, new C91524fp(BGn, this, 0, A1a));
        A002.A02.A0A(this, new C91484fl(0, BGn, A1a));
        A002.A03.A0A(this, new C91514fo(A0Y, this.A02.A00(this, A002), this, 0));
    }

    public C222219b A33() {
        C222219b A33 = super.A33();
        A33.A04 = true;
        return A33;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10) {
            this.A09.A0D((Integer) null);
            C72453Mb.A1O(this.A0C);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.A0G;
        if (runnable != null) {
            this.A05.A0I(runnable);
        }
    }

    public CommunityMembersActivity(int i) {
        this.A0H = false;
        C90994ey.A00(this, 47);
    }
}
