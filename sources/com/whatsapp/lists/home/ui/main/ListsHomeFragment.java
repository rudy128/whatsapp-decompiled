package com.whatsapp.lists.home.ui.main;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1KW;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3W9;
import X.AnonymousClass5IH;
import X.AnonymousClass5II;
import X.AnonymousClass5IJ;
import X.AnonymousClass5IK;
import X.AnonymousClass5TA;
import X.AnonymousClass5TB;
import X.AnonymousClass5TC;
import X.AnonymousClass5TD;
import X.AnonymousClass5TE;
import X.BM5;
import X.C100995An;
import X.C156087tn;
import X.C156097to;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C41561wd;
import X.C72463Mc;
import X.C73693Wy;
import X.C91644g1;
import X.C99274sY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public final class ListsHomeFragment extends Hilt_ListsHomeFragment {
    public BM5 A00;
    public RecyclerView A01;
    public AnonymousClass1KW A02;
    public C73693Wy A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public Integer A07;
    public boolean A08;
    public boolean A09;
    public final C18100vl A0A;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625378, viewGroup, false);
        this.A01 = AnonymousClass3MX.A0Q(inflate, 2131432126);
        return inflate;
    }

    public void A1s() {
        this.A01 = null;
        C18100vl r2 = this.A0A;
        AnonymousClass3MX.A0q(r2).A07.A09(A1G());
        AnonymousClass3MX.A0q(r2).A05.A09(A1G());
        AnonymousClass3MY.A1L(AnonymousClass3MX.A0q(r2).A00, false);
        super.A1s();
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        AnonymousClass1KW r0 = this.A02;
        if (r0 != null) {
            C73693Wy r1 = new C73693Wy(r0);
            this.A03 = r1;
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                recyclerView.setAdapter(r1);
            }
            C73693Wy r2 = this.A03;
            if (r2 == null) {
                C18070vi.A11("listsItemAdapter");
                throw null;
            }
            AnonymousClass3W9 r4 = new AnonymousClass3W9(new AnonymousClass5IH(this), new C100995An(r2, 7), false);
            C91644g1.A00(A1G(), r2.A00, new AnonymousClass5TA(this), 47);
            BM5 bm5 = new BM5(r4);
            this.A00 = bm5;
            bm5.A0D(this.A01);
            AnonymousClass3MX.A1Q(new ListsHomeFragment$onViewCreated$2(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
            C18100vl r42 = this.A0A;
            C91644g1.A00(A1G(), AnonymousClass3MX.A0q(r42).A07, new AnonymousClass5TB(this), 47);
            C91644g1.A00(A1G(), AnonymousClass3MX.A0q(r42).A05, new AnonymousClass5TC(this), 47);
            A25();
            Bundle bundle2 = this.A06;
            if (bundle2 != null) {
                boolean z = bundle2.getBoolean("is_edit", false);
                ListsHomeViewModel A0q = AnonymousClass3MX.A0q(r42);
                Integer num = this.A07;
                if (z && A0q.A03) {
                    A0q.A03 = false;
                }
                ListsHomeViewModel.A04(A0q, num, (List) null, (List) null, 5, z);
                AnonymousClass3MX.A0q(r42).A04 = bundle2.getBoolean("is_reorder_bottom_sheet", false);
            }
            C91644g1.A00(A1G(), AnonymousClass3MX.A0q(r42).A00, new AnonymousClass5TD(this), 47);
            C91644g1.A00(A1G(), AnonymousClass3MX.A0q(r42).A06, new AnonymousClass5TE(this), 47);
            return;
        }
        C18070vi.A11("emojiLoader");
        throw null;
    }

    public final void A25() {
        ListsHomeViewModel A0q = AnonymousClass3MX.A0q(this.A0A);
        Integer num = this.A07;
        AnonymousClass3MX.A1Q(new ListsHomeViewModel$loadLists$1(A0q, num, (C30391dr) null), C41561wd.A00(A0q));
    }

    public ListsHomeFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5IJ(new AnonymousClass5II(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(ListsHomeViewModel.class);
        this.A0A = C99274sY.A00(new AnonymousClass5IK(A002), new C156097to(this, A002), new C156087tn(A002), A15);
    }

    public void A1u() {
        super.A1u();
        C18100vl r5 = this.A0A;
        ListsHomeViewModel A0q = AnonymousClass3MX.A0q(r5);
        Integer num = this.A07;
        AnonymousClass3MX.A1Q(new ListsHomeViewModel$loadLists$1(A0q, num, (C30391dr) null), C41561wd.A00(A0q));
        if (this.A09) {
            C72463Mc.A1B(AnonymousClass3MX.A0q(r5).A07);
            this.A09 = false;
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        int i = A15().getInt("arg_entry_point", -1);
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        this.A07 = valueOf;
        this.A09 = A15().getBoolean("launch_from_deeplink", false);
    }
}
