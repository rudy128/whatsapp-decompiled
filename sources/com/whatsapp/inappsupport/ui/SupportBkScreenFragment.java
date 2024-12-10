package com.whatsapp.inappsupport.ui;

import X.A98;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11E;
import X.AnonymousClass198;
import X.AnonymousClass19T;
import X.AnonymousClass1HF;
import X.AnonymousClass1LU;
import X.AnonymousClass1MB;
import X.AnonymousClass5T0;
import X.C132216mP;
import X.C18070vi;
import X.C19943A0a;
import X.C219217x;
import X.C36361nl;
import X.C72453Mb;
import X.C91644g1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.whatsapp.util.Log;
import java.io.IOException;

public final class SupportBkScreenFragment extends Hilt_SupportBkScreenFragment {
    public FrameLayout A00;
    public ProgressBar A01;
    public C36361nl A02;
    public C132216mP A03;
    public C19943A0a A04;
    public AnonymousClass11E A05;
    public AnonymousClass11C A06;
    public C219217x A07;
    public AnonymousClass1MB A08;
    public AnonymousClass1LU A09;
    public AnonymousClass19T A0A;
    public A98 A0B;
    public AnonymousClass198 A0C;
    public AnonymousClass10I A0D;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625389, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        this.A01 = (ProgressBar) AnonymousClass1HF.A06(view, 2131428243);
        FrameLayout frameLayout = (FrameLayout) AnonymousClass1HF.A06(view, 2131428242);
        this.A00 = frameLayout;
        C72453Mb.A1D(frameLayout);
        C72453Mb.A1C(this.A01);
        C91644g1.A00(A1G(), ((SupportBkLayoutViewModel) this.A08).A02, new AnonymousClass5T0(this), 38);
        SupportBkLayoutViewModel supportBkLayoutViewModel = (SupportBkLayoutViewModel) this.A08;
        Bundle bundle2 = this.A06;
        if (bundle2 == null || (str = bundle2.getString("screen_name")) == null) {
            str = "";
        }
        supportBkLayoutViewModel.A01 = str;
        super.A21(bundle, view);
    }

    public Class A26() {
        return SupportBkLayoutViewModel.class;
    }

    public void A27() {
        C72453Mb.A1D(this.A01);
        C72453Mb.A1C(this.A00);
    }

    public void A28() {
        C72453Mb.A1D(this.A01);
        C72453Mb.A1C(this.A00);
    }

    public void A1s() {
        super.A1s();
        this.A01 = null;
        ((SupportBkLayoutViewModel) this.A08).A02.A09(A1G());
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        try {
            AnonymousClass198 r0 = this.A0C;
            if (r0 != null) {
                r0.A00();
            } else {
                C18070vi.A11("whatsAppSoLoader");
                throw null;
            }
        } catch (IOException e) {
            Log.e("SupportBkScreenFragment/so loader init failed", e);
        }
    }

    public int A25() {
        return 2131428240;
    }
}
