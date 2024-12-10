package com.whatsapp.languageselector;

import X.AnonymousClass11C;
import X.AnonymousClass11S;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass5Y2;
import X.AnonymousClass5a6;
import X.AnonymousClass5a7;
import X.AnonymousClass6VM;
import X.AnonymousClass86E;
import X.C108095b7;
import X.C17880vN;
import X.C18000vb;
import X.C184859bd;
import X.C72453Mb;
import X.C72463Mc;
import X.C72933Og;
import X.C74483bk;
import X.C825148g;
import X.C90744eZ;
import X.C90794ee;
import X.C91324fV;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.BottomSheetListView;
import com.whatsapp.wds.components.button.WDSButton;

public class LanguageSelectorBottomSheet extends Hilt_LanguageSelectorBottomSheet implements AnonymousClass86E {
    public BottomSheetBehavior A00;
    public BottomSheetListView A01;
    public AnonymousClass11S A02;
    public AnonymousClass11C A03;
    public C18000vb A04;
    public AnonymousClass5Y2 A05;
    public AnonymousClass5a7 A06;
    public C108095b7 A07;
    public C184859bd A08;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.languageselector.LanguageSelectorBottomSheet, com.whatsapp.languageselector.Hilt_LanguageSelectorBottomSheet, androidx.fragment.app.Fragment] */
    public static LanguageSelectorBottomSheet A00() {
        ? hilt_LanguageSelectorBottomSheet = new Hilt_LanguageSelectorBottomSheet();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("HEADER_TEXT_KEY", 2131897656);
        A0D.putBoolean("SHOW_CONTINUE_CTA", true);
        A0D.putInt("CONTINUE_CTA_GLYPH", 2131232150);
        hilt_LanguageSelectorBottomSheet.A1R(A0D);
        return hilt_LanguageSelectorBottomSheet;
    }

    public void A1K() {
        super.A1K();
        C108095b7 r0 = this.A07;
        if (r0 != null) {
            r0.BwW();
        }
        this.A06 = null;
        this.A07 = null;
        this.A05 = null;
        this.A08 = null;
    }

    public void A1j() {
        super.A1j();
        C108095b7 r0 = this.A07;
        if (r0 != null) {
            r0.BwW();
        }
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C825148g r0;
        Object A1D;
        View inflate = layoutInflater.inflate(2131625775, viewGroup);
        int i = 8;
        AnonymousClass1HF.A06(inflate, 2131436286).setVisibility(C72453Mb.A01(A2L() ? 1 : 0));
        C825148g.A00(AnonymousClass1HF.A06(inflate, 2131429133), this, 45);
        Bundle bundle2 = this.A06;
        if (bundle2 == null) {
            bundle2 = C17880vN.A0D();
        }
        AnonymousClass3MW.A0J(inflate, 2131427810).setText(bundle2.getInt("HEADER_TEXT_KEY", 2131891591));
        this.A01 = (BottomSheetListView) AnonymousClass1HF.A06(inflate, 2131431934);
        WDSButton A0q = AnonymousClass3MW.A0q(inflate, 2131429537);
        Bundle bundle3 = this.A06;
        if (bundle3 == null) {
            bundle3 = C17880vN.A0D();
        }
        if (bundle3.getBoolean("SHOW_CONTINUE_CTA", false)) {
            i = 0;
        }
        Bundle bundle4 = this.A06;
        if (bundle4 == null) {
            bundle4 = C17880vN.A0D();
        }
        A0q.setIcon(bundle4.getInt("CONTINUE_CTA_GLYPH", 0));
        A0q.setVisibility(i);
        if (i == 0) {
            r0 = new C825148g(this, 46);
        } else {
            r0 = null;
        }
        A0q.setOnClickListener(r0);
        Fragment fragment = this.A0E;
        if (fragment == null || !(fragment instanceof AnonymousClass5a6)) {
            if (A1D() instanceof AnonymousClass5a6) {
                A1D = A1D();
            }
            return inflate;
        }
        A1D = A19();
        C72933Og BMY = ((AnonymousClass5a6) A1D).BMY();
        this.A01.setAdapter(BMY);
        this.A01.setOnItemClickListener(new C90794ee(BMY, this, 2));
        BottomSheetListView bottomSheetListView = this.A01;
        bottomSheetListView.setOnScrollListener(new C90744eZ(AnonymousClass1HF.A06(inflate, 2131430073), bottomSheetListView, this, AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131167226)));
        return inflate;
    }

    public void A1v() {
        Dialog dialog;
        Window window;
        super.A1v();
        C108095b7 r0 = this.A07;
        if (r0 != null) {
            r0.BwY();
        }
        if (!A2L() && (dialog = this.A03) != null && (window = dialog.getWindow()) != null) {
            AnonymousClass6VM.A00(window, false);
            dialog.findViewById(2131429504).setFitsSystemWindows(false);
            dialog.findViewById(2131429666).setFitsSystemWindows(false);
            AnonymousClass1HF.A0g(dialog.findViewById(2131429504), new C91324fV(this, 1));
        }
    }

    public void A2K(View view) {
        this.A00 = BottomSheetBehavior.A02(view);
        if (!A2L()) {
            this.A00.A0a(new C74483bk(this, 4));
        } else {
            this.A00.A0h = true;
        }
        Point point = new Point();
        C72463Mc.A0u(A1D(), point);
        this.A00.A0Y((int) (AnonymousClass3MZ.A09(this).getFraction(2131361792, 1, 1) * ((float) point.y)), false);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        AnonymousClass5a7 r0 = this.A06;
        if (r0 != null) {
            r0.BwX();
        }
        C108095b7 r02 = this.A07;
        if (r02 != null) {
            r02.BwW();
        }
    }

    public int A25() {
        return 2132083403;
    }
}
