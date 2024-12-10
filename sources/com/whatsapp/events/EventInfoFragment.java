package com.whatsapp.events;

import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1OR;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3XC;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C27201Vd;
import X.C30391dr;
import X.C30451dy;
import X.C37581pm;
import X.C88124Yk;
import X.C99154sM;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.wds.components.button.WDSButton;

public final class EventInfoFragment extends Hilt_EventInfoFragment {
    public View A00;
    public RecyclerView A01;
    public AnonymousClass1KB A02;
    public AnonymousClass11S A03;
    public C27201Vd A04;
    public AnonymousClass3XC A05;
    public C88124Yk A06;
    public C18030ve A07;
    public WDSButton A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public C18600wl A0B;
    public final C18100vl A0C = C99154sM.A01(this, 17);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131625254, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        this.A08 = AnonymousClass3MW.A0q(view, 2131430584);
        this.A00 = AnonymousClass1HF.A06(view, 2131430585);
        this.A01 = (RecyclerView) AnonymousClass1HF.A06(view, 2131430586);
        C27201Vd r2 = this.A04;
        if (r2 != null) {
            this.A05 = new AnonymousClass3XC(r2.A04(A14(), this, "event-info-fragment"));
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                AnonymousClass3Ma.A15(A1n(), recyclerView);
            }
            RecyclerView recyclerView2 = this.A01;
            if (recyclerView2 != null) {
                AnonymousClass3XC r0 = this.A05;
                if (r0 == null) {
                    str = "adapter";
                } else {
                    recyclerView2.setAdapter(r0);
                }
            }
            C37581pm A0G = AnonymousClass3MZ.A0G(this);
            EventInfoFragment$onViewCreated$1 eventInfoFragment$onViewCreated$1 = new EventInfoFragment$onViewCreated$1(this, (C30391dr) null);
            AnonymousClass1OR r3 = AnonymousClass1OR.A00;
            C30451dy.A02(AnonymousClass3MW.A0w(r3, eventInfoFragment$onViewCreated$1, A0G), r3, new EventInfoFragment$onViewCreated$2(this, (C30391dr) null), AnonymousClass3MZ.A0G(this));
            return;
        }
        str = "contactPhotos";
        C18070vi.A11(str);
        throw null;
    }

    public void A1s() {
        WDSButton wDSButton = this.A08;
        if (wDSButton != null) {
            wDSButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A08 = null;
        this.A00 = null;
        this.A01 = null;
        super.A1s();
    }
}
