package com.whatsapp.bot.home;

import X.AnonymousClass000;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass7AT;
import X.AnonymousClass7D2;
import X.C108945cZ;
import X.C112735lx;
import X.C115115tQ;
import X.C122626Rc;
import X.C127026dg;
import X.C131346kw;
import X.C136486tt;
import X.C148507hY;
import X.C148517hZ;
import X.C155227sP;
import X.C157677xt;
import X.C157697xv;
import X.C18070vi;
import X.C18100vl;
import X.C57642jP;
import X.C99274sY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public abstract class BotListFragment extends Hilt_BotListFragment {
    public RecyclerView A00;
    public C131346kw A01;
    public C115115tQ A02;
    public C57642jP A03;
    public final C18100vl A04;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131624313, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        List A13;
        C18070vi.A0d(view, 0);
        this.A00 = C108945cZ.A0U(view, 2131428301);
        C131346kw r2 = this.A01;
        if (r2 != null) {
            C136486tt A002 = r2.A00(A1G(), C122626Rc.A05);
            boolean z = this instanceof AiHomeViewAllFragment;
            if (z) {
                A13 = ((AiHomeViewAllViewModel) ((AiHomeViewAllFragment) this).A00.getValue()).A03;
            } else {
                A13 = AnonymousClass000.A13();
            }
            C57642jP r4 = this.A03;
            if (r4 != null) {
                C115115tQ r3 = new C115115tQ(r4, A002, (C127026dg) null, new AnonymousClass7D2(this, 1), A13);
                this.A02 = r3;
                RecyclerView recyclerView = this.A00;
                if (recyclerView != null) {
                    recyclerView.A0R = true;
                    recyclerView.setAdapter(r3);
                }
                if (z) {
                    AiHomeViewAllFragment aiHomeViewAllFragment = (AiHomeViewAllFragment) this;
                    AnonymousClass7AT.A01(aiHomeViewAllFragment.A1G(), ((AiHomeViewAllViewModel) aiHomeViewAllFragment.A00.getValue()).A01, new C157697xv(aiHomeViewAllFragment), 8);
                    RecyclerView recyclerView2 = aiHomeViewAllFragment.A00;
                    if (recyclerView2 != null) {
                        recyclerView2.A0t(new C112735lx(aiHomeViewAllFragment, 0));
                        return;
                    }
                    return;
                }
                AiHomeSearchFragment aiHomeSearchFragment = (AiHomeSearchFragment) this;
                AnonymousClass7AT.A01(aiHomeSearchFragment.A1G(), ((AiHomeSearchViewModel) aiHomeSearchFragment.A00.getValue()).A02, new C157677xt(aiHomeSearchFragment), 7);
                return;
            }
            str = "aiHomeUtil";
        } else {
            str = "botPhotoLoaderFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public BotListFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(AiHomeViewModel.class);
        this.A04 = C99274sY.A00(new C148507hY(this), new C148517hZ(this), new C155227sP(this), A15);
    }

    public void A1s() {
        super.A1s();
        this.A00 = null;
    }
}
