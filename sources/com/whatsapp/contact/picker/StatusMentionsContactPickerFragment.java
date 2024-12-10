package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1HF;
import X.AnonymousClass1YQ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass71W;
import X.C003401n;
import X.C1420978d;
import X.C142977Bn;
import X.C149587jI;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C18460wS;
import X.C19830z4;
import X.C22971Dz;
import X.C32741hg;
import X.C36401np;
import X.C70563Bp;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.WaTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class StatusMentionsContactPickerFragment extends Hilt_StatusMentionsContactPickerFragment {
    public ScrollView A00;
    public C32741hg A01;
    public C36401np A02;
    public List A03;
    public AnonymousClass1YQ A04;
    public final C1420978d A05 = new C1420978d((Object) this, 3);
    public final C18100vl A06 = AnonymousClass1DF.A01(new C149587jI(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ArrayList arrayList;
        WaTextView waTextView;
        RelativeLayout relativeLayout;
        C18070vi.A0d(layoutInflater, 0);
        this.A38 = C22971Dz.A0A(AnonymousClass1BI.class, A27().getStringArrayList("jids"));
        boolean z = A27().getBoolean("use_custom_multiselect_limit", false);
        this.A3f = z;
        if (z) {
            this.A00 = A27().getInt("custom_multiselect_limit");
            this.A01 = 2131755406;
        }
        List list = this.A38;
        if (list != null) {
            arrayList = C17880vN.A10(list);
        } else {
            arrayList = null;
        }
        this.A03 = arrayList;
        View A1q = super.A1q(bundle, layoutInflater, viewGroup);
        if (A1q == null) {
            return null;
        }
        AnonymousClass1YQ r3 = (AnonymousClass1YQ) AnonymousClass1HF.A06(A1q, 2131434788);
        AnonymousClass3Ma.A1B(r3, this, 41);
        List list2 = this.A38;
        int i = 0;
        if (list2 == null || !(!list2.isEmpty())) {
            i = 8;
        }
        r3.setVisibility(i);
        this.A04 = r3;
        this.A00 = (ScrollView) AnonymousClass1HF.A06(A1q, 2131430393);
        if (!C17880vN.A1W(C17890vO.A0B(this.A18), "show_nux_status_mentions_poster")) {
            A01(this);
        }
        int i2 = 2131891985;
        if (C18020vd.A05(C18040vf.A02, this.A1m.A01, 12255)) {
            i2 = 2131891986;
        }
        String A1H = A1H(i2);
        C18070vi.A0b(A1H);
        if (A1n() == null) {
            return A1q;
        }
        C36401np r32 = this.A02;
        if (r32 != null) {
            SpannableStringBuilder A052 = r32.A05(A1n(), new C70563Bp(this, 12), A1H, "status-mentions");
            C18070vi.A0X(A052);
            this.A04 = true;
            RelativeLayout relativeLayout2 = this.A00;
            if (relativeLayout2 == null || (waTextView = AnonymousClass3MW.A0U(relativeLayout2, 2131430382)) == null) {
                waTextView = null;
            } else {
                waTextView.setText(A052);
                AnonymousClass3Ma.A1I(waTextView, waTextView.getAbProps());
                C1420978d r1 = this.A05;
                if (!(r1 == null || (relativeLayout = this.A00) == null)) {
                    relativeLayout.addOnLayoutChangeListener(r1);
                }
            }
            this.A02 = waTextView;
            return A1q;
        }
        C18070vi.A11("linkifier");
        throw null;
    }

    public boolean A2p() {
        return true;
    }

    public boolean A2x() {
        return false;
    }

    private final void A00() {
        long size = (long) this.A4G.size();
        C003401n A002 = C142977Bn.A00(this);
        if (A002 != null) {
            C18000vb r5 = this.A19;
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1L(A1a, (int) size);
            A002.A0R(r5.A0K(A1a, 2131755023, size));
        }
    }

    public static final void A01(StatusMentionsContactPickerFragment statusMentionsContactPickerFragment) {
        ((DialogFragment) statusMentionsContactPickerFragment.A06.getValue()).A2C(statusMentionsContactPickerFragment.A1F(), "StatusMentionsPosterNuxDialog");
        C17880vN.A1F(C19830z4.A00(statusMentionsContactPickerFragment.A18), "show_nux_status_mentions_poster", true);
    }

    public boolean A2o() {
        List list = this.A03;
        if (list == null) {
            list = C18460wS.A00;
        }
        Set keySet = this.A4G.keySet();
        if (list.size() == keySet.size() && keySet.containsAll(list)) {
            return super.A2o();
        }
        A34();
        return true;
    }

    public void A35() {
        boolean z;
        AnonymousClass1YQ r0;
        Map map = this.A4G;
        C18070vi.A0W(map);
        boolean z2 = false;
        if ((!map.isEmpty()) || ((r0 = this.A04) != null && r0.getVisibility() == 0)) {
            z = true;
        } else {
            z = false;
        }
        AnonymousClass1YQ r02 = this.A04;
        if (r02 != null) {
            if (r02.getVisibility() == 0) {
                z2 = true;
            }
            if (z2 == z) {
                return;
            }
        }
        AnonymousClass1YQ r03 = this.A04;
        if (r03 != null) {
            AnonymousClass71W.A00(r03, z, true);
        }
    }

    public void A1y(Bundle bundle) {
        super.A1y(bundle);
        C142977Bn.A00(this).A0S(AnonymousClass3MZ.A09(this).getString(2131895623));
        A00();
    }

    public void A2N() {
        A00();
    }
}
