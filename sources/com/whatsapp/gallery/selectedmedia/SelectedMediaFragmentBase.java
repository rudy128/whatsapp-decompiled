package com.whatsapp.gallery.selectedmedia;

import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass1DF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C102705Hm;
import X.C102715Hn;
import X.C102725Ho;
import X.C102735Hp;
import X.C102745Hq;
import X.C102755Hr;
import X.C104245Nk;
import X.C104255Nl;
import X.C112225l8;
import X.C136166tN;
import X.C17890vO;
import X.C18070vi;
import X.C18100vl;
import X.C22791Df;
import X.C24771Lp;
import X.C38391rD;
import X.C72463Mc;
import X.C91604fx;
import X.C99274sY;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.gallery.viewmodel.GalleryTabsViewModel;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;

public abstract class SelectedMediaFragmentBase extends Hilt_SelectedMediaFragmentBase {
    public RecyclerView A00;
    public C24771Lp A01;
    public AnonymousClass11C A02;
    public AnonymousClass00H A03;
    public final Handler A04 = C17890vO.A0D();
    public final C18100vl A05;
    public final C18100vl A06;
    public final C18100vl A07 = AnonymousClass1DF.A01(new C102705Hm(this));
    public final C18100vl A08 = AnonymousClass1DF.A01(new C102715Hn(this));

    public void A21(Bundle bundle, View view) {
        RecyclerView recyclerView;
        C18100vl r0;
        C18070vi.A0d(view, 0);
        View view2 = this.A0B;
        if (view2 == null || (recyclerView = AnonymousClass3MX.A0Q(view2, 2131431068)) == null) {
            recyclerView = null;
        } else {
            recyclerView.A0R = true;
            if (this instanceof SelectedMediaStripFragment) {
                r0 = ((SelectedMediaStripFragment) this).A00;
            } else {
                r0 = ((SelectedMediaCaptionFragment) this).A0C;
            }
            recyclerView.setAdapter((C112225l8) r0.getValue());
            C72463Mc.A0z(recyclerView.getContext(), recyclerView, 0);
        }
        this.A00 = recyclerView;
        C22791Df.A00(((GalleryTabsViewModel) this.A06.getValue()).A06).A0A(A1G(), new C91604fx(this, 18));
    }

    public SelectedMediaFragmentBase(int i) {
        super(i);
        AnonymousClass20F A15 = AnonymousClass3MW.A15(GalleryTabsViewModel.class);
        this.A06 = C99274sY.A00(new C102725Ho(this), new C102735Hp(this), new C104245Nk(this), A15);
        AnonymousClass20F A152 = AnonymousClass3MW.A15(GalleryPickerViewModel.class);
        this.A05 = C99274sY.A00(new C102745Hq(this), new C102755Hr(this), new C104255Nl(this), A152);
    }

    public void A1s() {
        super.A1s();
        ((C136166tN) this.A08.getValue()).A00();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter((C38391rD) null);
        }
        this.A00 = null;
    }
}
