package com.whatsapp.community.communityInfo;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass02n;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass18K;
import X.AnonymousClass1DF;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3XE;
import X.AnonymousClass5F0;
import X.AnonymousClass5F1;
import X.AnonymousClass5F2;
import X.AnonymousClass5RP;
import X.C102055Ez;
import X.C104065Ms;
import X.C106065Uk;
import X.C106935Xt;
import X.C106955Xv;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C22801Dg;
import X.C31191fA;
import X.C81723zh;
import X.C91074f6;
import X.C98804rk;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class CAGInfoFragment extends Hilt_CAGInfoFragment {
    public AnonymousClass1KB A00;
    public C31191fA A01;
    public AnonymousClass1M9 A02;
    public AnonymousClass11P A03;
    public C18030ve A04;
    public AnonymousClass18K A05;
    public C106935Xt A06;
    public C106955Xv A07;
    public AnonymousClass10I A08;
    public AnonymousClass00H A09;
    public AnonymousClass02n A0A;
    public final C81723zh A0B = new C81723zh();
    public final C18100vl A0C = AnonymousClass1DF.A01(new C102055Ez(this));
    public final C18100vl A0D = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C104065Ms(this));
    public final C18100vl A0E = AnonymousClass1DF.A01(new AnonymousClass5F0(this));
    public final C18100vl A0F = AnonymousClass1DF.A01(new AnonymousClass5F1(this));
    public final C18100vl A0G = AnonymousClass1DF.A01(new AnonymousClass5F2(this));

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.02h] */
    public void A1z(Bundle bundle) {
        C18030ve r2 = this.A04;
        if (r2 != null) {
            if (C18020vd.A05(C18040vf.A02, r2, 7628)) {
                this.A0A = CDw(new C91074f6(this, 4), new Object());
            }
            super.A1z(bundle);
            return;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        RecyclerView recyclerView = new RecyclerView(A14(), (AttributeSet) null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(A1n());
        linearLayoutManager.A1Z(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        AnonymousClass10I r1 = this.A08;
        if (r1 != null) {
            C98804rk.A01(r1, this, bundle, 25);
            C18100vl r2 = this.A0D;
            AnonymousClass1EC A0p = AnonymousClass3MX.A0p(r2);
            AnonymousClass00H r0 = this.A09;
            if (r0 != null) {
                AnonymousClass1EC A052 = AnonymousClass3MW.A0Z(r0).A05(AnonymousClass3MX.A0p(r2));
                AnonymousClass3XE r6 = new AnonymousClass3XE(this.A0A, this.A0B, A0p, A052);
                C18100vl r5 = this.A0C;
                C22801Dg r22 = ((CAGInfoViewModel) r5.getValue()).A08;
                C18100vl r4 = this.A0E;
                AnonymousClass3MY.A1K((AnonymousClass1FB) r4.getValue(), r22, new C106065Uk(recyclerView, r6), 36);
                AnonymousClass3MY.A1K((AnonymousClass1FB) r4.getValue(), ((CAGInfoViewModel) r5.getValue()).A0K, new AnonymousClass5RP(this), 36);
                r6.A0K(true);
                recyclerView.setAdapter(r6);
                return recyclerView;
            }
            str = "communityChatManager";
        } else {
            str = "waWorkers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A1r() {
        super.A1r();
        AnonymousClass18K r1 = this.A05;
        if (r1 != null) {
            r1.CC7(this.A0B);
        } else {
            AnonymousClass3MW.A1J();
            throw null;
        }
    }
}
