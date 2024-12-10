package com.whatsapp.gallery;

import X.AnonymousClass000;
import X.AnonymousClass02B;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass65B;
import X.AnonymousClass7FZ;
import X.AnonymousClass846;
import X.AnonymousClass8B2;
import X.C108945cZ;
import X.C109005cf;
import X.C112225l8;
import X.C136166tN;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C22971Dz;
import X.C38391rD;
import X.C72453Mb;
import X.C72463Mc;
import X.C89944dH;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;

public class NewMediaPickerFragment extends Hilt_NewMediaPickerFragment {
    public LayoutInflater A00;
    public View A01;
    public ViewGroup A02;
    public RecyclerView A03;
    public Menu A04;
    public final Set A05 = C17880vN.A14();

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        this.A00 = layoutInflater;
        return layoutInflater.inflate(2131626162, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        this.A02 = AnonymousClass3MW.A0D(view, 2131431066);
        Context A042 = AnonymousClass3MY.A04(view);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass3MX.A0C(view, 2131431068);
        this.A03 = recyclerView;
        recyclerView.A0R = true;
        C136166tN r3 = this.A0H;
        if (r3 != null) {
            LayoutInflater layoutInflater = this.A00;
            if (layoutInflater == null) {
                C18070vi.A11("inflater");
                throw null;
            } else {
                recyclerView.setAdapter(new C112225l8(layoutInflater, r3, new AnonymousClass846(this)));
                C72463Mc.A0z(A042, recyclerView, 0);
            }
        }
        View A0C = AnonymousClass3MX.A0C(view, 2131431057);
        this.A01 = A0C;
        C89944dH.A00(A0C, this, 28);
    }

    public boolean BwJ(AnonymousClass8B2 r5, AnonymousClass65B r6) {
        Menu menu;
        Menu menu2;
        MenuItem item;
        if (C22971Dz.A0V(this.A09)) {
            if (!C18020vd.A05(C18040vf.A02, A27(), 5643)) {
                return false;
            }
        }
        if (!AnonymousClass000.A1W(this.A04) && (menu = this.A04) != null && menu.size() > 0 && (menu2 = this.A04) != null && (item = menu2.getItem(0)) != null && item.getItemId() == 2131432622) {
            A2J();
            A2B();
        }
        return super.BwJ(r5, r6);
    }

    private final void A00() {
        ViewGroup viewGroup;
        C112225l8 r1;
        if (this.A0P.A04().isEmpty()) {
            this.A05.clear();
        }
        Set set = this.A05;
        int A07 = C72453Mb.A07(C108945cZ.A1U(set) ? 1 : 0);
        ViewGroup viewGroup2 = this.A02;
        if ((viewGroup2 == null || viewGroup2.getVisibility() != A07) && (viewGroup = this.A02) != null) {
            viewGroup.setVisibility(A07);
        }
        RecyclerView recyclerView = this.A03;
        C38391rD r12 = null;
        if (recyclerView != null) {
            r12 = recyclerView.A0B;
        }
        if ((r12 instanceof C112225l8) && (r1 = (C112225l8) r12) != null) {
            r1.A0V(set);
        }
    }

    public void A1s() {
        super.A1s();
        View view = this.A01;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        this.A01 = null;
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            recyclerView.setAdapter((C38391rD) null);
        }
        this.A03 = null;
        this.A02 = null;
    }

    public void A1u() {
        super.A1u();
        A00();
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        C18070vi.A0h(menu, menuInflater);
        super.A22(menu, menuInflater);
        this.A04 = menu;
    }

    public void A2I() {
        super.A2I();
        this.A05.clear();
        A00();
    }

    public void A2L(AnonymousClass8B2 r6) {
        ViewGroup viewGroup;
        AnonymousClass02B r0;
        RecyclerView recyclerView;
        C112225l8 r1;
        super.A2L(r6);
        boolean A1W = AnonymousClass000.A1W(this.A04);
        Set set = this.A05;
        if (A1W) {
            if (!set.remove(r6)) {
                if (!this.A0L) {
                    C109005cf.A0l(this, set.size());
                }
                if (set.size() < this.A01) {
                    set.add(r6);
                }
            }
            int A07 = C72453Mb.A07(C108945cZ.A1U(set) ? 1 : 0);
            ViewGroup viewGroup2 = this.A02;
            if ((viewGroup2 == null || viewGroup2.getVisibility() != A07) && (viewGroup = this.A02) != null) {
                viewGroup.setVisibility(A07);
            }
            RecyclerView recyclerView2 = this.A03;
            C38391rD r12 = null;
            if (recyclerView2 != null) {
                r12 = recyclerView2.A0B;
            }
            if ((r12 instanceof C112225l8) && (r1 = (C112225l8) r12) != null) {
                r1.A0V(set);
            }
            if (C108945cZ.A1U(set)) {
                AnonymousClass7FZ r02 = this.A0J;
                if (r02 != null) {
                    if (C18020vd.A05(C18040vf.A02, r02.A00, 8882) && (recyclerView = this.A03) != null) {
                        recyclerView.A0g(set.size() - 1);
                    }
                }
                C18070vi.A11("mediaTray");
                throw null;
            }
            if (set.isEmpty()) {
                AnonymousClass7FZ r03 = this.A0J;
                if (r03 != null) {
                    if (!C18020vd.A05(C18040vf.A02, r03.A00, 4261) && (r0 = this.A04) != null) {
                        r0.A05();
                        return;
                    }
                    return;
                }
                C18070vi.A11("mediaTray");
                throw null;
            }
            return;
        }
        set.add(r6);
    }
}
