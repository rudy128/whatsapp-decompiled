package com.whatsapp.gallerypicker;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass7AT;
import X.AnonymousClass7S2;
import X.AnonymousClass7SB;
import X.C108975cc;
import X.C110215f7;
import X.C136166tN;
import X.C139226yS;
import X.C1422678u;
import X.C151307m5;
import X.C151317m6;
import X.C156027th;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C20050A4v;
import X.C22507BAo;
import X.C24771Lp;
import X.C28931bI;
import X.C99274sY;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import com.whatsapp.gallerypicker.views.ConditionalSpinner;

public final class GalleryDropdownFilterFragment extends Hilt_GalleryDropdownFilterFragment implements C22507BAo, AdapterView.OnItemSelectedListener {
    public C24771Lp A00;
    public AnonymousClass11C A01;
    public C18030ve A02;
    public C110215f7 A03;
    public ConditionalSpinner A04;
    public AnonymousClass00H A05;
    public C136166tN A06;
    public final C18100vl A07;
    public final C18100vl A08 = AnonymousClass7S2.A01(0);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131625410, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        Integer valueOf;
        int intValue;
        TextView textView;
        C18070vi.A0d(view, 0);
        Bundle bundle2 = this.A06;
        if (bundle2 == null || (valueOf = Integer.valueOf(bundle2.getInt("arg_action_picker_title", -1))) == null || (intValue = valueOf.intValue()) == -1) {
            C18100vl r5 = this.A07;
            AnonymousClass7AT.A01(A1G(), ((GalleryPickerViewModel) AnonymousClass7AT.A00(A1G(), ((GalleryPickerViewModel) r5.getValue()).A04, r5, AnonymousClass7SB.A00(this, 13), 34)).A03, AnonymousClass7SB.A00(this, 12), 34);
            C24771Lp r52 = this.A00;
            if (r52 != null) {
                AnonymousClass11C r4 = this.A01;
                if (r4 != null) {
                    C136166tN r2 = new C136166tN((Handler) this.A08.getValue(), r52, r4, "image-loader-gallery-picker-dropdown-loader-id");
                    this.A03 = new C110215f7(A14(), this, r2);
                    this.A06 = r2;
                    ConditionalSpinner conditionalSpinner = (ConditionalSpinner) AnonymousClass1HF.A06(view, 2131431070);
                    conditionalSpinner.setAdapter(this.A03);
                    conditionalSpinner.setOnItemSelectedListener(this);
                    conditionalSpinner.A00 = this;
                    C1422678u.A00(conditionalSpinner, this, 15);
                    this.A04 = conditionalSpinner;
                    Bundle bundle3 = this.A06;
                    if (bundle3 != null && bundle3.getBoolean("picker_redesign", false)) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.setMarginEnd(0);
                            view.setLayoutParams(marginLayoutParams);
                            return;
                        }
                        throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    return;
                }
                str = "systemServices";
            } else {
                str = "caches";
            }
            C18070vi.A11(str);
            throw null;
        }
        C108975cc.A0t(view, 2131431070);
        View findViewById = view.findViewById(2131431074);
        if (findViewById != null) {
            View A0I = AnonymousClass3MY.A0I(new C28931bI(findViewById), 0);
            if ((A0I instanceof WaTextView) && (textView = (TextView) A0I) != null) {
                textView.setText(intValue);
            }
        }
    }

    public boolean BgF(int i) {
        C139226yS r0;
        C110215f7 r02 = this.A03;
        if (r02 == null || (r0 = (C139226yS) r02.getItem(i)) == null || r0.A02 != 9) {
            return false;
        }
        return true;
    }

    public boolean CMB(int i) {
        C139226yS r0;
        C110215f7 r02 = this.A03;
        boolean z = false;
        if (!(r02 == null || (r0 = (C139226yS) r02.getItem(i)) == null || r0.A02 != 12)) {
            z = true;
        }
        return !z;
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C110215f7 r1;
        C110215f7 r0 = this.A03;
        C139226yS r6 = null;
        if (r0 != null) {
            r6 = (C139226yS) r0.getItem(i);
        }
        C18100vl r5 = this.A07;
        Integer A002 = GalleryPickerViewModel.A00(r5);
        if (!(A002 == null || r6 == null)) {
            int i2 = r6.A02;
            if (Integer.valueOf(i2) != null) {
                int i3 = 88;
                if (i2 != 3) {
                    if (i2 == 7) {
                        i3 = 89;
                    } else {
                        i3 = 90;
                        if (i2 != 1) {
                            i3 = 91;
                            if (i2 != 10) {
                                i3 = 92;
                                if (i2 != 11) {
                                    if (i2 == 9) {
                                        if (r6.A04 == null) {
                                            i3 = 93;
                                        }
                                    } else if (i2 == 12) {
                                        i3 = 94;
                                    }
                                }
                            }
                        }
                    }
                }
                Integer valueOf = Integer.valueOf(i3);
                AnonymousClass00H r02 = this.A05;
                if (r02 != null) {
                    ((C20050A4v) r02.get()).A02(valueOf, 1, A002.intValue());
                } else {
                    C18070vi.A11("mediaSharingUserJourneyLogger");
                    throw null;
                }
            }
        }
        ((GalleryPickerViewModel) r5.getValue()).A08.A0F(r6);
        if ((r6 == null || r6.A02 != 12) && (r1 = this.A03) != null) {
            r1.A00 = Integer.valueOf(i);
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
        ((GalleryPickerViewModel) this.A07.getValue()).A08.A0F((Object) null);
    }

    public GalleryDropdownFilterFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(GalleryPickerViewModel.class);
        this.A07 = C99274sY.A00(new C151307m5(this), new C151317m6(this), new C156027th(this), A15);
    }

    public void A1r() {
        super.A1r();
        C136166tN r0 = this.A06;
        if (r0 != null) {
            r0.A00();
        }
        this.A06 = null;
        ConditionalSpinner conditionalSpinner = this.A04;
        if (conditionalSpinner != null) {
            conditionalSpinner.setAdapter((SpinnerAdapter) null);
        }
        this.A04 = null;
        this.A03 = null;
    }
}
