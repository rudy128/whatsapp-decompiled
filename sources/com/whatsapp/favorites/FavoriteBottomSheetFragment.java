package com.whatsapp.favorites;

import X.A09;
import X.AnonymousClass00H;
import X.AnonymousClass1LU;
import X.AnonymousClass1Xr;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3W8;
import X.AnonymousClass3XF;
import X.AnonymousClass4CZ;
import X.AnonymousClass4PZ;
import X.AnonymousClass5HV;
import X.AnonymousClass5HW;
import X.BM5;
import X.C104175Nd;
import X.C108505bo;
import X.C139436yq;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C62482rT;
import X.C72483Me;
import X.C80923yN;
import X.C89944dH;
import X.C96044nD;
import X.C99274sY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public final class FavoriteBottomSheetFragment extends Hilt_FavoriteBottomSheetFragment implements C108505bo {
    public RecyclerView A00;
    public AnonymousClass4PZ A01;
    public AnonymousClass3XF A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public BM5 A05;
    public final C18100vl A06;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625311, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        RecyclerView A0Q = AnonymousClass3MX.A0Q(view, 2131434428);
        this.A00 = A0Q;
        BM5 bm5 = new BM5(new AnonymousClass3W8(this));
        this.A05 = bm5;
        bm5.A0D(A0Q);
        AnonymousClass3MX.A1Q(new FavoriteBottomSheetFragment$initObservables$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        C18100vl r2 = this.A06;
        ((FavoriteListViewModel) r2.getValue()).A0T();
        AnonymousClass3MY.A1Y(((FavoriteListViewModel) r2.getValue()).A07, true);
        C89944dH.A00(view.findViewById(2131428348), this, 4);
        C89944dH.A00(view.findViewById(2131428346), this, 5);
        ((FavoriteListViewModel) r2.getValue()).A00 = A15().getInt("ENTRY_POINT", 6);
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            if (C18020vd.A00(C18040vf.A02, C17880vN.A0P(r0), 4708) == 0) {
                C17880vN.A0E(view, 2131430810).setText(2131890383);
                return;
            }
            return;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public void Bl2() {
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            r0.get();
            A1k(AnonymousClass1LU.A0X(A1D(), AnonymousClass4CZ.CHATS, ((FavoriteListViewModel) this.A06.getValue()).A00));
            return;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public void Bty(C62482rT r2, int i) {
        AnonymousClass3XF r0 = this.A02;
        if (r0 == null) {
            AnonymousClass3MW.A1B();
            throw null;
        }
        r0.A0I(i);
        ((FavoriteListViewModel) this.A06.getValue()).A0U(r2);
    }

    public void Btz(int i, int i2) {
        AnonymousClass3XF r2 = this.A02;
        if (r2 == null) {
            AnonymousClass3MW.A1B();
            throw null;
        }
        List list = r2.A04;
        list.add(i2, list.remove(i));
        r2.A01.A01(i, i2);
    }

    public void Bu0() {
        FavoriteListViewModel favoriteListViewModel = (FavoriteListViewModel) this.A06.getValue();
        AnonymousClass3XF r0 = this.A02;
        if (r0 == null) {
            AnonymousClass3MW.A1B();
            throw null;
        } else {
            favoriteListViewModel.A0V(r0.A04);
        }
    }

    public void Bu1(C80923yN r2) {
        BM5 bm5 = this.A05;
        if (bm5 != null) {
            bm5.A0A(r2);
        }
    }

    public void C0V(View view, C96044nD r5) {
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            r0.get();
            A09 a09 = new A09(view, r5.A01.A03, 10);
            a09.A02 = AnonymousClass1Xr.A02(view);
            a09.A01(A1D());
            return;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public FavoriteBottomSheetFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(FavoriteListViewModel.class);
        this.A06 = C99274sY.A00(new AnonymousClass5HV(this), new AnonymousClass5HW(this), new C104175Nd(this), A15);
    }

    public void A1s() {
        super.A1s();
        this.A00 = null;
        BM5 bm5 = this.A05;
        if (bm5 != null) {
            bm5.A0D((RecyclerView) null);
        }
        this.A05 = null;
    }

    public void A2I(C139436yq r1) {
        C72483Me.A13(r1);
    }
}
