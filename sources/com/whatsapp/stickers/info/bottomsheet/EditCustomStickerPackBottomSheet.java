package com.whatsapp.stickers.info.bottomsheet;

import X.AnonymousClass00H;
import X.AnonymousClass1DF;
import X.AnonymousClass1HF;
import X.AnonymousClass2LK;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3NL;
import X.AnonymousClass725;
import X.AnonymousClass78P;
import X.AnonymousClass78Z;
import X.AnonymousClass81L;
import X.C111765kO;
import X.C135516sK;
import X.C1424879q;
import X.C146887Qz;
import X.C154027qT;
import X.C17880vN;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C201811d;
import X.C26631Sw;
import X.C72483Me;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.wds.components.topbar.WDSToolbar;
import java.util.Set;

public class EditCustomStickerPackBottomSheet extends Hilt_EditCustomStickerPackBottomSheet {
    public C18030ve A00;
    public AnonymousClass2LK A01;
    public AnonymousClass725 A02;
    public WDSToolbar A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public final AnonymousClass00H A0B = C201811d.A00(49491);
    public final Set A0C = C17880vN.A14();
    public final C18100vl A0D = AnonymousClass1DF.A01(new C154027qT(this));

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        String string = A15().getString("arg_sticker_pack_id");
        if (string != null) {
            View findViewById = view.findViewById(2131433390);
            C18070vi.A0z(findViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            this.A03 = (WDSToolbar) AnonymousClass1HF.A06(view, 2131430257);
            A00(this, 0);
            WDSToolbar wDSToolbar = this.A03;
            if (wDSToolbar != null) {
                AnonymousClass00H r0 = this.A0A;
                if (r0 != null) {
                    AnonymousClass3NL.A02(wDSToolbar.getContext(), wDSToolbar, (C18000vb) r0.get(), 2131233243);
                    wDSToolbar.setNavigationContentDescription((CharSequence) A1H(2131898783));
                    wDSToolbar.A0N(2131820562);
                    wDSToolbar.setNavigationOnClickListener(new AnonymousClass78P((Object) this, 23));
                    wDSToolbar.A0C = new C1424879q(this, 4);
                } else {
                    str = "whatsAppLocale";
                    C18070vi.A11(str);
                    throw null;
                }
            }
            GridLayoutManager gridLayoutManager = new GridLayoutManager(AnonymousClass3MY.A04(view), -1, 1, false);
            recyclerView.addOnLayoutChangeListener(new AnonymousClass78Z(gridLayoutManager, this, 4));
            AnonymousClass00H r02 = this.A08;
            if (r02 != null) {
                C135516sK r2 = (C135516sK) C18070vi.A0E(r02);
                AnonymousClass00H r03 = this.A05;
                if (r03 != null) {
                    C111765kO r3 = new C111765kO((C26631Sw) C18070vi.A0E(r03), r2, new AnonymousClass81L(this));
                    recyclerView.setLayoutManager(gridLayoutManager);
                    recyclerView.setAdapter(r3);
                    AnonymousClass00H r04 = this.A09;
                    if (r04 != null) {
                        AnonymousClass3MX.A0x(r04).CGF(new C146887Qz(this, r3, string, 21));
                        return;
                    }
                    str = "waWorkers";
                } else {
                    str = "stickerImageFileLoader";
                }
            } else {
                str = "stickerSizeCalculator";
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public static final void A00(EditCustomStickerPackBottomSheet editCustomStickerPackBottomSheet, int i) {
        String A0W;
        WDSToolbar wDSToolbar = editCustomStickerPackBottomSheet.A03;
        if (wDSToolbar != null) {
            if (i == 0) {
                AnonymousClass725 r0 = editCustomStickerPackBottomSheet.A02;
                if (r0 != null) {
                    A0W = r0.A04;
                } else {
                    A0W = null;
                }
            } else {
                A0W = C72483Me.A0W(AnonymousClass3MZ.A09(editCustomStickerPackBottomSheet), i, 2131755267);
            }
            wDSToolbar.setTitle((CharSequence) A0W);
        }
    }
}
