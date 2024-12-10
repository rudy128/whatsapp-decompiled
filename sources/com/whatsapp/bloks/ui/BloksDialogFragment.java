package com.whatsapp.bloks.ui;

import X.AnonymousClass01E;
import X.AnonymousClass1L4;
import X.AnonymousClass3MX;
import X.AnonymousClass6bI;
import X.C108955ca;
import X.C109755dx;
import X.C125566bH;
import X.C125576bJ;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C197609wy;
import X.C25813CmQ;
import X.C56382hN;
import X.CXY;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.facebook.rendercore.RootHostView;
import java.util.HashMap;
import java.util.Map;

public class BloksDialogFragment extends Hilt_BloksDialogFragment {
    public C56382hN A00;
    public CXY A01;
    public AnonymousClass6bI A02;
    public C125576bJ A03;
    public C109755dx A04;
    public C18030ve A05;
    public AnonymousClass1L4 A06;
    public Boolean A07;
    public Map A08;
    public View A09;
    public FrameLayout A0A;
    public C125566bH A0B;

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        C56382hN r3 = this.A00;
        this.A01 = C197609wy.A00((AnonymousClass01E) A1D(), A1F(), r3, this.A08);
        C109755dx r2 = this.A04;
        AnonymousClass01E r4 = (AnonymousClass01E) A1B();
        A1n();
        r2.A01(A15(), r4, this, this.A01, this, this.A02, C108955ca.A0s(A15(), "screen_name"), (HashMap) A15().getSerializable("screen_params"));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.whatsapp.bloks.ui.Hilt_BloksDialogFragment, com.whatsapp.bloks.ui.BloksDialogFragment, androidx.fragment.app.Fragment] */
    public static BloksDialogFragment A00(String str, HashMap hashMap) {
        ? hilt_BloksDialogFragment = new Hilt_BloksDialogFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("screen_name", str);
        A0D.putSerializable("screen_params", hashMap);
        A0D.putBoolean("hot_reload", false);
        hilt_BloksDialogFragment.A1R(A0D);
        return hilt_BloksDialogFragment;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 2131625346;
        if (C18020vd.A05(C18040vf.A02, this.A05, 10400)) {
            i = 2131625345;
        }
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, i);
    }

    public void A21(Bundle bundle, View view) {
        C125566bH r0 = new C125566bH(view);
        this.A0B = r0;
        this.A04.A01 = (RootHostView) r0.A00.findViewById(2131428240);
        this.A09 = view.findViewById(2131428243);
        this.A0A = (FrameLayout) view.findViewById(2131428242);
        this.A04.A00();
    }

    public void A1s() {
        super.A1s();
        C109755dx r2 = this.A04;
        r2.A01 = null;
        C25813CmQ cmQ = r2.A02;
        if (cmQ != null) {
            cmQ.A02();
            r2.A02 = null;
        }
        this.A0A = null;
        this.A0B = null;
        this.A09 = null;
    }

    public void A1t() {
        super.A1t();
        View currentFocus = A1D().getCurrentFocus();
        if (currentFocus != null) {
            this.A06.A01(currentFocus);
        }
    }

    public Dialog A27(Bundle bundle) {
        Dialog A27 = super.A27(bundle);
        A27.setCanceledOnTouchOutside(false);
        Window window = A27.getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        return A27;
    }
}
