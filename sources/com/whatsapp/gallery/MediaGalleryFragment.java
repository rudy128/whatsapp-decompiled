package com.whatsapp.gallery;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass122;
import X.AnonymousClass1BI;
import X.AnonymousClass1FL;
import X.AnonymousClass1ST;
import X.AnonymousClass1WR;
import X.AnonymousClass21V;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4W0;
import X.AnonymousClass4ZR;
import X.AnonymousClass65B;
import X.AnonymousClass6WZ;
import X.AnonymousClass745;
import X.AnonymousClass77F;
import X.AnonymousClass7AO;
import X.AnonymousClass7FH;
import X.AnonymousClass7H2;
import X.AnonymousClass8B2;
import X.C108055b3;
import X.C108875cR;
import X.C147087Rt;
import X.C17960vV;
import X.C18150vq;
import X.C24681Lg;
import X.C32021gV;
import X.C34141jz;
import X.C72453Mb;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.gallery.viewmodel.MediaGalleryViewModel;
import com.whatsapp.scroller.RecyclerFastScroller;

public class MediaGalleryFragment extends Hilt_MediaGalleryFragment implements C108055b3 {
    public AnonymousClass122 A00;
    public AnonymousClass1ST A01;
    public C24681Lg A02;
    public MediaGalleryViewModel A03;
    public AnonymousClass1BI A04;
    public C32021gV A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public final AnonymousClass00H A08 = C18150vq.A01(new C147087Rt(this, 4));
    public final AnonymousClass1WR A09 = new AnonymousClass7FH(this, 0);

    public void C4h(C34141jz r1) {
    }

    public void BwD(AnonymousClass8B2 r23, AnonymousClass65B r24) {
        C108875cR r1;
        AnonymousClass21V r4;
        AnonymousClass8B2 r2 = r23;
        AnonymousClass1FL A1B = A1B();
        if ((A1B instanceof C108875cR) && (r1 = (C108875cR) A1B) != null && (r4 = ((AnonymousClass7H2) r2).A01) != null && this.A04 != null) {
            AnonymousClass65B r3 = r24;
            if (!r3.A0A() && AnonymousClass000.A1Y(this.A08.get())) {
                return;
            }
            if (!Bf1()) {
                this.A07.get();
                Intent A002 = AnonymousClass6WZ.A00(A1D(), (AnonymousClass77F) null, this.A04, r4.A0v, 34, 1, -1, 0, -1, 2, true, false, false, false, false);
                AnonymousClass745.A09(A1D(), A002, r3, this.A0F);
                AnonymousClass745.A08(A14(), A002, r3, new AnonymousClass4ZR(A1D()), AnonymousClass4W0.A01(r4));
            } else if (r1.CPY(r4)) {
                r3.A09((Integer) null);
            } else {
                r3.A07();
            }
        }
    }

    public void A1r() {
        super.A1r();
        this.A02.unregisterObserver(this.A09);
    }

    public void A21(Bundle bundle, View view) {
        super.A21(bundle, view);
        MediaGalleryViewModel mediaGalleryViewModel = (MediaGalleryViewModel) AnonymousClass3MW.A0N(this).A00(MediaGalleryViewModel.class);
        this.A03 = mediaGalleryViewModel;
        AnonymousClass7AO.A01(A1G(), mediaGalleryViewModel.A00, this, 26);
        AnonymousClass1BI A0l = AnonymousClass3MX.A0l(C72453Mb.A0u(A1D()));
        C17960vV.A07(A0l);
        this.A04 = A0l;
        A2F(false, true);
        if (A1D() instanceof MediaGalleryActivity) {
            RecyclerView recyclerView = this.A07;
            if (recyclerView != null) {
                recyclerView.A0t(((MediaGalleryActivity) A1D()).A0o);
            }
            ((RecyclerFastScroller) view.findViewById(2131434841)).setAppBarLayout((CoordinatorLayout) A1D().findViewById(2131429666), (AppBarLayout) A1D().findViewById(2131427815));
        }
        this.A02.registerObserver(this.A09);
    }

    public boolean Bf1() {
        C108875cR r1;
        AnonymousClass1FL A1B = A1B();
        if (!(A1B instanceof C108875cR) || (r1 = (C108875cR) A1B) == null || !r1.Bcq()) {
            return false;
        }
        return true;
    }

    public boolean BwJ(AnonymousClass8B2 r5, AnonymousClass65B r6) {
        C108875cR r3;
        AnonymousClass21V r2;
        AnonymousClass1FL A1B = A1B();
        if (!(A1B instanceof C108875cR)) {
            r3 = null;
        } else {
            r3 = (C108875cR) A1B;
        }
        if (r3 == null || (r2 = ((AnonymousClass7H2) r5).A01) == null) {
            return false;
        }
        if (!r6.A0A() && AnonymousClass000.A1Y(this.A08.get())) {
            return true;
        }
        if (!Bf1()) {
            r3.COH(r2);
        } else if (!r3.CPY(r2)) {
            r6.A07();
            return true;
        }
        r6.A09((Integer) null);
        return true;
    }

    public void C4y() {
        A2B();
    }
}
