package com.whatsapp.areffects.tray;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass11C;
import X.AnonymousClass1KB;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3Vk;
import X.AnonymousClass3WK;
import X.AnonymousClass3XT;
import X.AnonymousClass4P0;
import X.AnonymousClass4VF;
import X.C109475dV;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C19740yt;
import X.C30391dr;
import X.C83484Fh;
import X.C84604Kd;
import X.C93864jf;
import X.C99144sL;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.collections.centeredrecyclerview.CenteredSelectionRecyclerView;

public final class ArEffectsTrayFragment extends Hilt_ArEffectsTrayFragment {
    public AnonymousClass1KB A00;
    public AnonymousClass11C A01;
    public C18000vb A02;
    public AnonymousClass00H A03;
    public final C18100vl A04 = C99144sL.A00(AnonymousClass00R.A0C, this, 11);
    public final C18100vl A05 = C83484Fh.A00(this);
    public final C84604Kd A06 = new C84604Kd(this);
    public final AnonymousClass3Vk A07 = new AnonymousClass3Vk(this);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131624212, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        C18100vl r4 = this.A05;
        AnonymousClass4VF r7 = (AnonymousClass4VF) AnonymousClass3MX.A0Y(r4).A0H.getValue();
        CenteredSelectionRecyclerView centeredSelectionRecyclerView = (CenteredSelectionRecyclerView) C18070vi.A05(view, 2131434428);
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            AnonymousClass4P0 r2 = (AnonymousClass4P0) C18070vi.A0E(r0);
            C84604Kd r1 = this.A06;
            if (!r7.A07) {
                r1 = null;
            }
            AnonymousClass3WK r5 = new AnonymousClass3WK(r1, r2, AnonymousClass3MX.A0Y(r4).A06);
            centeredSelectionRecyclerView.setAdapter(r5);
            int dimensionPixelSize = AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131165343);
            C18000vb r12 = this.A02;
            if (r12 != null) {
                centeredSelectionRecyclerView.A0r(new AnonymousClass3XT(r12, dimensionPixelSize));
                CircularProgressBar circularProgressBar = (CircularProgressBar) C18070vi.A05(view, 2131435102);
                circularProgressBar.setMax(100);
                circularProgressBar.setProgress(0);
                circularProgressBar.A05 = 0.1f;
                circularProgressBar.A06 = 8.0f;
                FrameLayout frameLayout = (FrameLayout) C18070vi.A05(view, 2131435126);
                frameLayout.setBackground(new C109475dV(C19740yt.A00(A14(), 2131099730)));
                TextView A0E = AnonymousClass3Ma.A0E(view, 2131435125);
                centeredSelectionRecyclerView.setCenteredSelectionListener(new C93864jf(centeredSelectionRecyclerView, r5, this));
                centeredSelectionRecyclerView.setItemAnimator(this.A07);
                AnonymousClass3MX.A1Q(new ArEffectsTrayFragment$onViewCreated$2(frameLayout, A0E, circularProgressBar, r5, this, r7, centeredSelectionRecyclerView, (C30391dr) null), AnonymousClass3MZ.A0G(this));
                return;
            }
            str = "whatsAppLocale";
        } else {
            str = "thumbnailLoader";
        }
        C18070vi.A11(str);
        throw null;
    }
}
