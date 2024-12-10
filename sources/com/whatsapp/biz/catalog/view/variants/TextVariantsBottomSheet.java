package com.whatsapp.biz.catalog.view.variants;

import X.AnonymousClass2YI;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass77B;
import X.AnonymousClass7AT;
import X.AnonymousClass7CZ;
import X.AnonymousClass824;
import X.C108945cZ;
import X.C108955ca;
import X.C111055i3;
import X.C112095kv;
import X.C131466l9;
import X.C18000vb;
import X.C18070vi;
import X.C20245ADd;
import X.C24141Ja;
import X.C37891qK;
import X.C41501wV;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class TextVariantsBottomSheet extends Hilt_TextVariantsBottomSheet {
    public RecyclerView A00;
    public AnonymousClass2YI A01;
    public C131466l9 A02;
    public C18000vb A03;
    public C111055i3 A04;

    /* JADX WARNING: type inference failed for: r8v0, types: [X.6Vn, java.lang.Object] */
    public void A21(Bundle bundle, View view) {
        Parcelable parcelable;
        String str;
        Parcelable parcelable2;
        Bundle bundle2;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        ImageView A0G = AnonymousClass3MW.A0G(view, 2131436090);
        Bundle bundle3 = this.A06;
        if (bundle3 == null || !bundle3.getBoolean("USE_BACK_ARROW_FOR_CLOSE_ARG")) {
            A0G.setImageResource(2131231814);
            C108955ca.A1J(A0G, this, 2131898783);
        } else {
            A0G.setImageResource(2131231675);
            C108955ca.A1J(A0G, this, 2131898718);
            C18000vb r0 = this.A03;
            if (r0 != null && AnonymousClass3MW.A1Z(r0)) {
                A0G.setScaleX(-1.0f);
            }
        }
        AnonymousClass3MZ.A1I(A0G, this, 4);
        Bundle bundle4 = this.A06;
        C112095kv r6 = null;
        if (bundle4 != null) {
            parcelable = (Parcelable) C24141Ja.A00(bundle4, AnonymousClass77B.class, "TEXT_OPTIONS_DATA");
        } else {
            parcelable = null;
        }
        AnonymousClass77B r10 = (AnonymousClass77B) parcelable;
        TextView A0J = AnonymousClass3MW.A0J(view, 2131436674);
        Object[] objArr = new Object[1];
        if (r10 != null) {
            str = r10.A00;
        } else {
            str = "";
        }
        A0J.setText(AnonymousClass3MX.A16(this, str, objArr, 0, 2131896825));
        C111055i3 r02 = this.A04;
        if (r02 != null) {
            Number A1C = C108945cZ.A1C(r02.A00);
            if (A1C == null && ((bundle2 = this.A06) == null || (A1C = Integer.valueOf(bundle2.getInt("START_WITH_SELECTION_ARG"))) == null)) {
                A1C = 0;
            }
            int intValue = A1C.intValue();
            Bundle bundle5 = this.A06;
            if (bundle5 != null) {
                parcelable2 = (Parcelable) C24141Ja.A00(bundle5, C20245ADd.class, "OTHER_OPTION_SELECTED_ARG");
            } else {
                parcelable2 = null;
            }
            C20245ADd aDd = (C20245ADd) parcelable2;
            RecyclerView A0U = C108945cZ.A0U(view, 2131436089);
            if (!(r10 == null || this.A01 == null)) {
                C111055i3 r1 = this.A04;
                if (r1 != null) {
                    r6 = new C112095kv(aDd, new Object(), new AnonymousClass7CZ(r1, 0), r10, intValue);
                }
            }
            A0U.setAdapter(r6);
            this.A00 = A0U;
            View view2 = view;
            while (true) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof C37891qK) {
                    C41501wV r3 = ((C37891qK) layoutParams).A0A;
                    if (r3 instanceof BottomSheetBehavior) {
                        ((BottomSheetBehavior) r3).A0C = AnonymousClass3MZ.A09(this).getDisplayMetrics().heightPixels - AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131168364);
                        break;
                    }
                }
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view2 = (View) parent;
                    if (view2 == null) {
                        break;
                    }
                } else {
                    break;
                }
            }
            C111055i3 r03 = this.A04;
            if (r03 != null) {
                AnonymousClass7AT.A01(A1G(), r03.A00, C108945cZ.A1K(this, 3), 4);
                C111055i3 r04 = this.A04;
                if (r04 != null) {
                    AnonymousClass7AT.A01(A1G(), r04.A02, new AnonymousClass824(view, this), 4);
                    return;
                }
            }
        }
        C18070vi.A11("viewModel");
        throw null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A04 = (C111055i3) AnonymousClass3MW.A0N(this).A00(C111055i3.class);
    }
}
