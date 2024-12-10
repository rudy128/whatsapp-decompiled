package com.whatsapp.wabloks.ui.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1DF;
import X.AnonymousClass1HF;
import X.AnonymousClass785;
import X.AnonymousClass86X;
import X.C108985cd;
import X.C131236kl;
import X.C133336oa;
import X.C143157Cf;
import X.C154867rp;
import X.C154877rq;
import X.C154887rr;
import X.C178149Bz;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18070vi;
import X.C18100vl;
import X.C199029zJ;
import X.C20000A2o;
import X.C26209Cul;
import X.C26235CvV;
import X.C72453Mb;
import X.E8A;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.util.Map;

public final class BkBottomSheetContentFragment extends Hilt_BkBottomSheetContentFragment {
    public static final C131236kl A06 = new Object();
    public Toolbar A00;
    public AnonymousClass86X A01;
    public AnonymousClass00H A02;
    public final C18100vl A03 = AnonymousClass1DF.A01(new C154867rp(this));
    public final C18100vl A04 = AnonymousClass1DF.A01(new C154877rq(this));
    public final C18100vl A05 = AnonymousClass1DF.A01(new C154887rr(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131624275, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C143157Cf r0;
        E8A A0A;
        String A0D;
        Toolbar toolbar;
        C18070vi.A0d(view, 0);
        this.A00 = (Toolbar) AnonymousClass1HF.A06(view, 2131428143);
        C18100vl r2 = this.A04;
        if (r2.getValue() != null) {
            C133336oa r02 = (C133336oa) r2.getValue();
            Drawable drawable = null;
            if (!(r02 == null || (A0D = r02.A00.A0D(36)) == null || A0D.length() == 0 || (toolbar = this.A00) == null)) {
                toolbar.setVisibility(0);
                toolbar.setTitle(toolbar.A0E);
            }
            C133336oa r03 = (C133336oa) r2.getValue();
            if (r03 == null || (A0A = r03.A00.A0A(38)) == null) {
                r0 = null;
            } else {
                r0 = new C143157Cf(A0A, 11);
            }
            this.A01 = r0;
            boolean A1a = C72453Mb.A1a(this.A03);
            Toolbar toolbar2 = this.A00;
            if (!A1a) {
                if (toolbar2 != null) {
                    drawable = toolbar2.getNavigationIcon();
                }
                C17960vV.A07(drawable);
                drawable.setVisible(false, false);
            } else if (toolbar2 != null) {
                toolbar2.setVisibility(0);
                Drawable navigationIcon = toolbar2.getNavigationIcon();
                if (navigationIcon != null) {
                    navigationIcon.setVisible(true, true);
                }
                toolbar2.setNavigationOnClickListener(new AnonymousClass785(this, 6));
            }
        }
        super.A21(bundle, view);
    }

    public void A1r() {
        if (!(this.A01 == null || this.A04.getValue() == null)) {
            try {
                AnonymousClass86X r3 = this.A01;
                if (!(r3 == null || r3.BM3() == null)) {
                    C26209Cul.A05(C199029zJ.A01, r3.BM3(), this.A03);
                }
            } catch (NullPointerException e) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(C17890vO.A0U(this));
                C108985cd.A1M("Failed to execute onContentDismiss Expression: ", A10, e);
            }
        }
        Object value = this.A04.getValue();
        if (value != null && this.A0j) {
            AnonymousClass00H r0 = this.A02;
            if (r0 != null) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("bk_bottom_sheet_content_fragment");
                ((C20000A2o) r0.get()).A05(C178149Bz.A00(C17880vN.A0t(A102, value.hashCode())), "bk_bottom_sheet_content_fragment");
            } else {
                C18070vi.A11("bkCache");
                throw null;
            }
        }
        super.A1r();
    }

    public void A1z(Bundle bundle) {
        C133336oa r0 = (C133336oa) this.A04.getValue();
        if (r0 != null) {
            C26235CvV A002 = r0.A00();
            Map A012 = r0.A01();
            this.A02 = A002;
            this.A06 = A012;
        }
        super.A1z(bundle);
    }
}
