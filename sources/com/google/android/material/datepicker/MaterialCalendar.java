package com.google.android.material.datepicker;

import X.ADU;
import X.AJO;
import X.AnonymousClass00R;
import X.AnonymousClass1HF;
import X.AnonymousClass3MZ;
import X.AnonymousClass78Q;
import X.AnonymousClass7RP;
import X.AnonymousClass8DD;
import X.AnonymousClass8DE;
import X.AnonymousClass8EJ;
import X.AnonymousClass8HP;
import X.AnonymousClass8HY;
import X.AnonymousClass8I5;
import X.AnonymousClass8IB;
import X.BDX;
import X.C108975cc;
import X.C113705na;
import X.C161768Hr;
import X.C188209h3;
import X.C21349Aie;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.format.DateUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

public final class MaterialCalendar extends PickerFragment {
    public static final Object A0C = "MONTHS_VIEW_GROUP_TAG";
    public static final Object A0D = "NAVIGATION_NEXT_TAG";
    public static final Object A0E = "NAVIGATION_PREV_TAG";
    public static final Object A0F = "SELECTOR_TOGGLE_TAG";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public RecyclerView A04;
    public RecyclerView A05;
    public ADU A06;
    public C188209h3 A07;
    public BDX A08;
    public C21349Aie A09;
    public Integer A0A;
    public int A0B;

    public void A20(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.A0B);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.A08);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.A06);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.A09);
    }

    public void A25(C21349Aie aie) {
        RecyclerView recyclerView = this.A04;
        C161768Hr r1 = (C161768Hr) recyclerView.A0B;
        int A0U = r1.A0U(aie);
        int A0U2 = A0U - r1.A0U(this.A09);
        boolean z = true;
        boolean A1D = C108975cc.A1D(Math.abs(A0U2), 3);
        if (A0U2 <= 0) {
            z = false;
        }
        this.A09 = aie;
        if (A1D) {
            int i = A0U + 3;
            if (z) {
                i = A0U - 3;
            }
            recyclerView.A0f(i);
        }
        this.A04.post(new AnonymousClass7RP(this, A0U, 14));
    }

    public void A26(Integer num) {
        this.A0A = num;
        if (num == AnonymousClass00R.A01) {
            RecyclerView recyclerView = this.A05;
            recyclerView.getLayoutManager().A13(this.A09.A04 - ((AnonymousClass8HY) recyclerView.A0B).A00.A06.A06.A04);
            this.A03.setVisibility(0);
            this.A00.setVisibility(8);
            this.A02.setVisibility(8);
            this.A01.setVisibility(8);
        } else if (num == AnonymousClass00R.A00) {
            this.A03.setVisibility(8);
            this.A00.setVisibility(0);
            this.A02.setVisibility(0);
            this.A01.setVisibility(0);
            A25(this.A09);
        }
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass8DD r0;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(A1n(), this.A0B);
        this.A07 = new C188209h3(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C21349Aie aie = this.A06.A06;
        int i = 2131626084;
        int i2 = 0;
        if (MaterialDatePicker.A03(contextThemeWrapper, 16843277)) {
            i = 2131626089;
            i2 = 1;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources A092 = AnonymousClass3MZ.A09(this);
        int dimensionPixelSize = A092.getDimensionPixelSize(2131167826) + A092.getDimensionPixelOffset(2131167827) + A092.getDimensionPixelOffset(2131167825);
        int dimensionPixelSize2 = A092.getDimensionPixelSize(2131167810);
        int i3 = AnonymousClass8DE.A05;
        inflate.setMinimumHeight(dimensionPixelSize + dimensionPixelSize2 + (i3 * A092.getDimensionPixelSize(2131167805)) + ((i3 - 1) * A092.getDimensionPixelOffset(2131167824)) + A092.getDimensionPixelOffset(2131167802));
        GridView gridView = (GridView) inflate.findViewById(2131432814);
        AnonymousClass1HF.A0f(gridView, new AnonymousClass8EJ(this, 1));
        int i4 = this.A06.A01;
        if (i4 <= 0) {
            r0 = new AnonymousClass8DD();
        }
        gridView.setAdapter(r0);
        gridView.setNumColumns(aie.A02);
        gridView.setEnabled(false);
        this.A04 = (RecyclerView) inflate.findViewById(2131432817);
        this.A04.setLayoutManager(new AnonymousClass8HP(A1n(), this, i2, i2));
        this.A04.setTag("MONTHS_VIEW_GROUP_TAG");
        C161768Hr r2 = new C161768Hr(contextThemeWrapper, this.A06, this.A08, new AJO(this));
        this.A04.setAdapter(r2);
        int integer = contextThemeWrapper.getResources().getInteger(2131492916);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(2131432820);
        this.A05 = recyclerView;
        if (recyclerView != null) {
            recyclerView.A0R = true;
            recyclerView.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.A05.setAdapter(new AnonymousClass8HY(this));
            this.A05.A0r(new AnonymousClass8I5(this));
        }
        if (inflate.findViewById(2131432780) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(2131432780);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AnonymousClass1HF.A0f(materialButton, new AnonymousClass8EJ(this, 3));
            View findViewById = inflate.findViewById(2131432782);
            this.A02 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(2131432781);
            this.A01 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.A03 = inflate.findViewById(2131432820);
            this.A00 = inflate.findViewById(2131432813);
            A26(AnonymousClass00R.A00);
            C21349Aie aie2 = this.A09;
            String str = aie2.A00;
            if (str == null) {
                str = DateUtils.formatDateTime((Context) null, aie2.A06.getTimeInMillis(), 8228);
                aie2.A00 = str;
            }
            materialButton.setText(str);
            this.A04.A0t(new AnonymousClass8IB(materialButton, this, r2));
            AnonymousClass3MZ.A1N(materialButton, this, 11);
            AnonymousClass78Q.A00(this.A01, this, r2, 3);
            AnonymousClass78Q.A00(this.A02, this, r2, 2);
        }
        if (!MaterialDatePicker.A03(contextThemeWrapper, 16843277)) {
            new C113705na().A08(this.A04);
        }
        this.A04.A0f(r2.A0U(this.A09));
        AnonymousClass1HF.A0f(this.A04, new AnonymousClass8EJ(this, 2));
        return inflate;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        if (bundle == null) {
            bundle = this.A06;
        }
        this.A0B = bundle.getInt("THEME_RES_ID_KEY");
        this.A08 = (BDX) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.A06 = (ADU) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.A09 = (C21349Aie) bundle.getParcelable("CURRENT_MONTH_KEY");
    }
}
