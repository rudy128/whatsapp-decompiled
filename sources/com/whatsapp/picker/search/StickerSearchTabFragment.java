package com.whatsapp.picker.search;

import X.AnonymousClass1BI;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass7AS;
import X.AnonymousClass7MX;
import X.AnonymousClass7SL;
import X.AnonymousClass88B;
import X.C108945cZ;
import X.C108965cb;
import X.C112185l4;
import X.C112715lv;
import X.C117015z4;
import X.C130726ju;
import X.C134166q9;
import X.C1418377d;
import X.C17960vV;
import X.C18030ve;
import X.C18070vi;
import X.C26631Sw;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public final class StickerSearchTabFragment extends Hilt_StickerSearchTabFragment implements AnonymousClass88B {
    public ViewTreeObserver.OnGlobalLayoutListener A00;
    public RecyclerView A01;
    public C18030ve A02;
    public C112185l4 A03;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C134166q9 r0;
        C26631Sw r9;
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131627113, viewGroup, false);
        this.A01 = C108945cZ.A0U(inflate, 2131436001);
        C18070vi.A0b(inflate);
        AnonymousClass7MX r6 = A00(this).A00;
        C17960vV.A07(r6);
        List A0t = C108965cb.A0t(r6);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            int i = bundle2.getInt("sticker_category_tab");
            AnonymousClass7AS.A00(A1G(), A00(this).A2H().A01, new AnonymousClass7SL(this, i), 8);
            A0t = A00(this).A2I(i);
        }
        C117015z4 r02 = r6.A00;
        if (!(r02 == null || (r0 = r02.A0A) == null || (r9 = r0.A0A) == null)) {
            C112185l4 r7 = new C112185l4(A14(), r9, this, A0t, 1);
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                recyclerView.setAdapter(r7);
                C130726ju r4 = new C130726ju(A14(), viewGroup, recyclerView, r7);
                this.A00 = r4.A05;
                inflate.getViewTreeObserver().addOnGlobalLayoutListener(this.A00);
                C18030ve r3 = this.A02;
                if (r3 != null) {
                    recyclerView.A0t(new C112715lv(AnonymousClass3MZ.A09(this), r4.A06, r3));
                } else {
                    AnonymousClass3MW.A1A();
                    throw null;
                }
            }
            this.A03 = r7;
        }
        return inflate;
    }

    public void A1t() {
        C112185l4 r0 = this.A03;
        if (r0 != null) {
            r0.A04 = false;
            r0.notifyDataSetChanged();
        }
        super.A1t();
    }

    public static final StickerSearchDialogFragment A00(StickerSearchTabFragment stickerSearchTabFragment) {
        Fragment fragment = stickerSearchTabFragment.A0E;
        if (fragment instanceof StickerSearchDialogFragment) {
            C18070vi.A0z(fragment, "null cannot be cast to non-null type com.whatsapp.picker.search.StickerSearchDialogFragment");
            return (StickerSearchDialogFragment) fragment;
        }
        throw new RuntimeException("Parent fragment of StickerSearchTabFragment is not of type StickerSearchDialogFragment");
    }

    public void A1s() {
        List list;
        ViewTreeObserver viewTreeObserver;
        RecyclerView recyclerView = this.A01;
        if (!(recyclerView == null || (viewTreeObserver = recyclerView.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A00);
        }
        RecyclerView recyclerView2 = this.A01;
        if (!(recyclerView2 == null || (list = recyclerView2.A0L) == null)) {
            list.clear();
        }
        super.A1s();
        this.A01 = null;
    }

    public void A1u() {
        super.A1u();
        C112185l4 r0 = this.A03;
        if (r0 != null) {
            r0.A04 = true;
            r0.notifyDataSetChanged();
        }
    }

    public void C6w(AnonymousClass1BI r2, C1418377d r3, Integer num, int i) {
        A00(this).C6w(r2, r3, num, i);
    }
}
