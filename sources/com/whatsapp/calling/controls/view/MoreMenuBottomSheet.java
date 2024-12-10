package com.whatsapp.calling.controls.view;

import X.AnonymousClass00H;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass4RC;
import X.C17880vN;
import X.C18070vi;
import X.C201811d;
import X.C30391dr;
import X.C38391rD;
import X.C90034dQ;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class MoreMenuBottomSheet extends Hilt_MoreMenuBottomSheet {
    public WaImageView A00;
    public WaImageView A01;
    public WaTextView A02;
    public WaTextView A03;
    public AnonymousClass4RC A04;
    public RecyclerView A05;
    public final AnonymousClass00H A06 = C201811d.A00(16470);

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        WaImageView A0R = AnonymousClass3MW.A0R(view, 2131430238);
        this.A00 = A0R;
        if (A0R != null) {
            C90034dQ.A01(A0R, this, 10);
        }
        WaTextView A0T = AnonymousClass3MW.A0T(view, 2131431375);
        this.A02 = A0T;
        if (A0T != null) {
            C90034dQ.A01(A0T, this, 11);
        }
        RecyclerView recyclerView = (RecyclerView) AnonymousClass1HF.A06(view, 2131432798);
        this.A05 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter((C38391rD) this.A06.get());
        }
        this.A01 = AnonymousClass3MW.A0R(view, 2131432942);
        this.A03 = AnonymousClass3MW.A0T(view, 2131432944);
        AnonymousClass3MX.A1Q(new MoreMenuBottomSheet$onViewCreated$3(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
    }

    public void A1s() {
        super.A1s();
        A1F().A0w("more_menu_dismissed", C17880vN.A0D());
        this.A00 = null;
        this.A02 = null;
        this.A05 = null;
        this.A01 = null;
        this.A03 = null;
    }

    public int A25() {
        return 2132083351;
    }

    public int A2F() {
        return 2131626071;
    }
}
