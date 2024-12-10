package com.whatsapp.stickers.store;

import X.A59;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass1SB;
import X.AnonymousClass2LK;
import X.AnonymousClass3MX;
import X.AnonymousClass4VT;
import X.AnonymousClass6H5;
import X.AnonymousClass6H9;
import X.AnonymousClass6RG;
import X.AnonymousClass725;
import X.AnonymousClass78P;
import X.AnonymousClass793;
import X.AnonymousClass7RI;
import X.AnonymousClass7RQ;
import X.BM5;
import X.C108945cZ;
import X.C108955ca;
import X.C111665k9;
import X.C112295lF;
import X.C134226qF;
import X.C136936ue;
import X.C138326wt;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C24481Km;
import X.C26631Sw;
import X.C43421zm;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public abstract class StickerStoreTabFragment extends Hilt_StickerStoreTabFragment {
    public int A00;
    public LayoutInflater A01;
    public View A02;
    public LinearLayoutManager A03;
    public RecyclerView A04;
    public AnonymousClass1KB A05;
    public AnonymousClass11S A06;
    public C18030ve A07;
    public C24481Km A08;
    public C26631Sw A09;
    public AnonymousClass1SB A0A;
    public C112295lF A0B;
    public AnonymousClass10I A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public List A0J;
    public final ViewTreeObserver.OnGlobalLayoutListener A0K = new AnonymousClass793(this, 25);
    public final C134226qF A0L = new AnonymousClass6H5(this, 6);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        this.A01 = layoutInflater;
        boolean z = this instanceof StickerStoreMyTabFragment;
        if (z) {
            i = 2131627118;
        } else {
            i = 2131627116;
        }
        View A092 = AnonymousClass3MX.A09(layoutInflater, viewGroup, i);
        this.A04 = C108945cZ.A0U(A092, 2131435838);
        this.A02 = AnonymousClass1HF.A06(A092, 2131435837);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(A1n());
        this.A03 = linearLayoutManager;
        linearLayoutManager.A1Z(1);
        this.A04.setLayoutManager(this.A03);
        this.A04.getViewTreeObserver().addOnGlobalLayoutListener(this.A0K);
        this.A04.setNestedScrollingEnabled(true);
        ((AnonymousClass2LK) this.A0F.get()).registerObserver(this.A0L);
        if (z) {
            StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) this;
            stickerStoreMyTabFragment.A00 = A092.findViewById(2131430354);
            TextView A0E2 = C17880vN.A0E(A092, 2131431114);
            C43421zm.A04(A0E2);
            AnonymousClass78P.A00(A0E2, stickerStoreMyTabFragment, 30);
        } else {
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) this;
            stickerStoreFeaturedTabFragment.A00 = A092.findViewById(2131435770);
            stickerStoreFeaturedTabFragment.A01 = A092.findViewById(2131430354);
            View A062 = AnonymousClass1HF.A06(A092, 2131430907);
            stickerStoreFeaturedTabFragment.A02 = A062;
            A062.setVisibility(0);
            C108955ca.A1J(stickerStoreFeaturedTabFragment.A02, stickerStoreFeaturedTabFragment, 2131896500);
            AnonymousClass78P.A00(stickerStoreFeaturedTabFragment.A02, stickerStoreFeaturedTabFragment, 29);
            if (stickerStoreFeaturedTabFragment.A29()) {
                C136936ue A0p = C108945cZ.A0p(stickerStoreFeaturedTabFragment.A06);
                A0p.A02 = C17890vO.A0Q();
                A0p.A00 = 3;
            }
            stickerStoreFeaturedTabFragment.A04.A0t(stickerStoreFeaturedTabFragment.A0B);
        }
        A27();
        if (z) {
            StickerStoreMyTabFragment stickerStoreMyTabFragment2 = (StickerStoreMyTabFragment) this;
            stickerStoreMyTabFragment2.A04 = false;
            BM5 bm5 = new BM5(new C111665k9(stickerStoreMyTabFragment2));
            stickerStoreMyTabFragment2.A01 = bm5;
            bm5.A0D(stickerStoreMyTabFragment2.A04);
            stickerStoreMyTabFragment2.A02.postDelayed(AnonymousClass7RI.A00(stickerStoreMyTabFragment2, 27), 300);
        } else {
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment2 = (StickerStoreFeaturedTabFragment) this;
            stickerStoreFeaturedTabFragment2.A02.setVisibility(0);
            if (!stickerStoreFeaturedTabFragment2.A09) {
                stickerStoreFeaturedTabFragment2.A0A = true;
                C138326wt r3 = (C138326wt) stickerStoreFeaturedTabFragment2.A07.get();
                AnonymousClass7RQ.A02(r3.A01, r3, new AnonymousClass6H9(stickerStoreFeaturedTabFragment2), 13);
                return A092;
            }
        }
        return A092;
    }

    public void A1s() {
        this.A04.getViewTreeObserver().removeOnGlobalLayoutListener(this.A0K);
        AnonymousClass1SB r2 = this.A0A;
        AnonymousClass4VT r0 = r2.A00;
        if (r0 != null) {
            r0.A02.A04(false);
            r2.A00 = null;
        }
        C26631Sw r02 = this.A09;
        if (r02 != null) {
            r02.A04();
        }
        C17880vN.A0V(this.A0F).unregisterObserver(this.A0L);
        super.A1s();
    }

    public void A26() {
        if (this instanceof StickerStoreFeaturedTabFragment) {
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) this;
            if (stickerStoreFeaturedTabFragment.A09) {
                stickerStoreFeaturedTabFragment.A0A = true;
                C138326wt r3 = (C138326wt) stickerStoreFeaturedTabFragment.A07.get();
                AnonymousClass7RQ.A02(r3.A01, r3, new AnonymousClass6H9(stickerStoreFeaturedTabFragment), 13);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r0.A0Q() != 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A27() {
        /*
            r3 = this;
            X.5lF r0 = r3.A0B
            if (r0 == 0) goto L_0x000b
            int r0 = r0.A0Q()
            r2 = 1
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            r1 = r3
            boolean r0 = r3 instanceof com.whatsapp.stickers.store.StickerStoreMyTabFragment
            if (r0 == 0) goto L_0x001f
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r1 = (com.whatsapp.stickers.store.StickerStoreMyTabFragment) r1
            android.view.View r1 = r1.A00
            if (r1 == 0) goto L_0x001e
            int r0 = X.C72453Mb.A07(r2)
            r1.setVisibility(r0)
        L_0x001e:
            return
        L_0x001f:
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r1 = (com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment) r1
            android.view.View r1 = r1.A01
            if (r1 == 0) goto L_0x001e
            int r0 = X.C72453Mb.A07(r2)
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.store.StickerStoreTabFragment.A27():void");
    }

    public void A28(AnonymousClass725 r7, int i) {
        AnonymousClass6RG r1;
        A59 A0e = C108945cZ.A0e(this.A0E);
        boolean z = this instanceof StickerStoreMyTabFragment;
        int i2 = 1;
        if (z) {
            i2 = 7;
        }
        A0e.A03(33, 1, i2);
        Context A0A2 = C108955ca.A0A(this, this.A0H);
        String str = r7.A0H;
        if (z) {
            r1 = AnonymousClass6RG.STICKER_STORE_MY_TAB;
        } else {
            r1 = AnonymousClass6RG.STICKER_STORE_FEATURED_TAB;
        }
        C18070vi.A0d(str, 1);
        A1D().startActivityForResult(AnonymousClass1LU.A0W(A0A2, r1, str, (String) null), 1);
    }

    public boolean A29() {
        if (!this.A06.A0N()) {
            if (!C18020vd.A05(C18040vf.A02, this.A07, 1396)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
