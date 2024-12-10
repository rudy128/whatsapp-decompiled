package com.whatsapp.contact.picker;

import X.AnonymousClass11N;
import X.AnonymousClass1BI;
import X.AnonymousClass1DT;
import X.AnonymousClass1E7;
import X.AnonymousClass1HQ;
import X.AnonymousClass1J8;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6LQ;
import X.AnonymousClass7RP;
import X.AnonymousClass7RT;
import X.C003101k;
import X.C108965cb;
import X.C108975cc;
import X.C108985cd;
import X.C127096dn;
import X.C130886kA;
import X.C136666uB;
import X.C1408673j;
import X.C142977Bn;
import X.C145907Nb;
import X.C146497Pi;
import X.C17880vN;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C199429zz;
import X.C22891Dp;
import X.C28931bI;
import X.C70563Bp;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.search.WDSSearchBar;
import java.util.HashSet;
import java.util.Map;

public final class VoipContactPickerFragment extends Hilt_VoipContactPickerFragment {
    public C199429zz A00;
    public AnonymousClass1HQ A01;
    public C1408673j A02;
    public CallSuggestionsViewModel A03;
    public AnonymousClass11N A04;
    public C28931bI A05;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        this.A03 = (CallSuggestionsViewModel) AnonymousClass3Ma.A0I(this).A00(CallSuggestionsViewModel.class);
        C28931bI A002 = C28931bI.A00(view, 2131427646);
        C145907Nb.A00(A002, this, 2);
        this.A05 = A002;
        A35();
    }

    public void A2L() {
    }

    public void A2W(C127096dn r6) {
        Long l;
        C18070vi.A0d(r6, 0);
        super.A2W(r6);
        CallSuggestionsViewModel callSuggestionsViewModel = this.A03;
        Long l2 = null;
        if (callSuggestionsViewModel != null) {
            l = Long.valueOf(callSuggestionsViewModel.A00);
        } else {
            l = null;
        }
        Long A0Y = C108975cc.A0Y(this.A39);
        if (this.A03 != null) {
            l2 = A0Y;
        }
        C1408673j A37 = A37();
        C108965cb.A1K(A37.A02, A37, l2, l, 12);
    }

    public void A2X(C130886kA r2) {
        C18070vi.A0d(r2, 0);
        super.A2X(r2);
        this.A00 = r2.A00;
    }

    public void A2a(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        super.A2a(userJid);
        boolean A2n = A2n();
        C1408673j A37 = A37();
        A37.A02.execute(new AnonymousClass7RT(userJid, A37, this.A00, 14, A2n));
    }

    public boolean A2p() {
        return true;
    }

    public boolean A2q() {
        return false;
    }

    public boolean A2r() {
        return true;
    }

    public boolean A2u() {
        return true;
    }

    public boolean A2z(View view, AnonymousClass1E7 r10) {
        C18070vi.A0d(view, 1);
        if (!super.A2z(view, r10)) {
            return false;
        }
        A00();
        Jid A012 = AnonymousClass1E7.A01(r10);
        boolean A2n = A2n();
        C1408673j A37 = A37();
        A37.A02.execute(new AnonymousClass7RT(A012, A37, this.A00, 14, A2n));
        return true;
    }

    private final void A00() {
        int i;
        long size;
        Object[] A1b;
        Map map = this.A4G;
        boolean isEmpty = map.isEmpty();
        C18000vb r5 = this.A19;
        if (isEmpty) {
            i = 2131755250;
            size = (long) this.A35.size();
            A1b = new Object[1];
            C108985cd.A1S(this.A35, A1b, 0);
        } else {
            i = 2131755259;
            size = (long) map.size();
            A1b = AnonymousClass3MW.A1b();
            C17880vN.A1T(A1b, map.size(), 0);
            C17880vN.A1T(A1b, this.A00, 1);
        }
        C142977Bn.A00(this).A0R(r5.A0K(A1b, i, size));
    }

    public AnonymousClass6LQ A2B() {
        C199429zz r2;
        AnonymousClass1DT r0;
        HashSet hashSet = this.A4D;
        C18070vi.A0W(hashSet);
        boolean z = this.A3M;
        boolean z2 = this.A3R;
        CallSuggestionsViewModel callSuggestionsViewModel = this.A03;
        if (callSuggestionsViewModel == null || (r0 = callSuggestionsViewModel.A03) == null) {
            r2 = null;
        } else {
            r2 = (C199429zz) r0.A06();
        }
        return this.A0O.A00(new C136666uB(r2, this, (AnonymousClass1BI) null, hashSet, false, false, false, false, false, false, z, z2, false, false, false, false, false, false, false));
    }

    public void A2K() {
        WDSSearchBar.A01(this.A20, true, true);
        C1408673j A37 = A37();
        A37.A02.execute(new C70563Bp(A37, 13));
    }

    public void A2g(boolean z) {
        if (z) {
            C1408673j A37 = A37();
            A37.A02.execute(new C70563Bp(A37, 18));
        }
    }

    public void A35() {
        C28931bI r3 = this.A05;
        if (r3 != null) {
            Map map = this.A4G;
            C18070vi.A0W(map);
            if (!map.isEmpty()) {
                AnonymousClass3MY.A0I(r3, 0).post(new C146497Pi(this, r3, 12));
                return;
            }
            r3.A04(8);
            if (r3.A00 != null) {
                A2Q(0, 0);
            }
        }
    }

    public final C1408673j A37() {
        C1408673j r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("searchUserJourneyLogger");
        throw null;
    }

    public LayoutInflater A1o(Bundle bundle) {
        LayoutInflater A1o = super.A1o(bundle);
        C18070vi.A0X(A1o);
        C003101k r4 = new C003101k(A1n(), 2132083998);
        Resources.Theme theme = r4.getTheme();
        C18070vi.A0X(theme);
        C18070vi.A0W(this.A1x);
        if (C22891Dp.A02) {
            theme.applyStyle(2132083508, true);
        }
        Resources.Theme theme2 = r4.getTheme();
        C18070vi.A0X(theme2);
        C18030ve r1 = this.A1U;
        C18070vi.A0W(r1);
        C18070vi.A0W(this.A1x);
        if (AnonymousClass1J8.A09(r1)) {
            theme2.applyStyle(2132083514, true);
        }
        LayoutInflater cloneInContext = A1o.cloneInContext(r4);
        C18070vi.A0X(cloneInContext);
        return cloneInContext;
    }

    public void A1r() {
        super.A1r();
        C1408673j A37 = A37();
        A37.A02.execute(new C70563Bp(A37, 15));
        this.A05 = null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        C1408673j A37 = A37();
        A37.A02.execute(new C70563Bp(A37, 16));
    }

    public int A26() {
        return 2131627500;
    }

    public void A2H() {
        C1408673j A37 = A37();
        A37.A02.execute(new C70563Bp(A37, 17));
    }

    public void A2I() {
        super.A2I();
        this.A3f = true;
        this.A00 = A27().getInt("custom_multiselect_limit", 32);
        this.A01 = 2131755495;
        C142977Bn.A00(this).A0S(AnonymousClass3MZ.A09(this).getQuantityText(2131755496, this.A00));
    }

    public void A2Z(UserJid userJid) {
        C1408673j A37 = A37();
        boolean A2n = A2n();
        C199429zz r4 = this.A00;
        C18070vi.A0d(userJid, 0);
        A37.A02.execute(new AnonymousClass7RT(A37, userJid, r4, 16, A2n));
        super.A2Z(userJid);
    }

    public void A2c(String str) {
        C1408673j A37 = A37();
        A37.A02.execute(new AnonymousClass7RP(A37, str.length(), 42));
        super.A2c(str);
    }

    public void A36(AnonymousClass1E7 r8) {
        A00();
        C1408673j A37 = A37();
        Jid A0g = AnonymousClass3MW.A0g(r8);
        if (A0g == null) {
            Log.e("VoipContactPickerFragment/deselected contact has no jid, skipping log");
            return;
        }
        boolean A2n = A2n();
        A37.A02.execute(new AnonymousClass7RT(A37, A0g, this.A00, 15, A2n));
    }
}
