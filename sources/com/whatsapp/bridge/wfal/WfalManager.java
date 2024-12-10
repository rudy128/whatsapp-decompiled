package com.whatsapp.bridge.wfal;

import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass3EW;
import X.AnonymousClass732;
import X.C122646Re;
import X.C139786zR;
import X.C1418477e;
import X.C146787Qp;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C34951lN;
import X.C34991lS;
import X.C35011lV;
import X.C35051lZ;
import X.C35101le;
import X.C35131lh;
import X.C59472mM;
import android.content.SharedPreferences;

public final class WfalManager {
    public final C34951lN A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass11S A07;
    public final C18030ve A08;

    public WfalManager(AnonymousClass11S r2, C18030ve r3, C34951lN r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r7, 4);
        C18070vi.A0d(r8, 5);
        C18070vi.A0d(r9, 6);
        C18070vi.A0d(r10, 7);
        C18070vi.A0d(r2, 8);
        C18070vi.A0d(r3, 9);
        this.A00 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = r8;
        this.A01 = r9;
        this.A02 = r10;
        this.A07 = r2;
        this.A08 = r3;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.87L] */
    public final C1418477e A03(C122646Re r6) {
        String str;
        SharedPreferences A042;
        String str2;
        C18070vi.A0d(r6, 0);
        C34951lN r2 = (C34951lN) this.A04.get();
        int ordinal = r6.ordinal();
        if (ordinal == 0) {
            str = "F";
        } else if (ordinal == 1) {
            str = "I";
        } else {
            throw new AnonymousClass3EW();
        }
        if (!r2.A07() || C34951lN.A03(r2)) {
            return null;
        }
        if (str.equals("F")) {
            A042 = r2.A04();
            str2 = "crossposting_destination_fb";
        } else if (!str.equals("I")) {
            return null;
        } else {
            A042 = r2.A04();
            str2 = "crossposting_destination_ig";
        }
        String string = A042.getString(str2, (String) null);
        if (string != null) {
            return new C1418477e(new Object(), String.class, string, "WaffleCrosspostingDestination");
        }
        return null;
    }

    public static final boolean A00(WfalManager wfalManager, boolean z) {
        int i;
        if (wfalManager.A07.A0N()) {
            return false;
        }
        int A002 = ((C35101le) wfalManager.A06.get()).A00(C35131lh.A02);
        C18030ve r2 = wfalManager.A08;
        if (A002 != 4) {
            i = 11797;
        } else if (z) {
            i = 12156;
        } else {
            i = 538;
        }
        return C18020vd.A05(C18040vf.A02, r2, i);
    }

    public final C139786zR A01() {
        return ((C59472mM) this.A01.get()).A00();
    }

    public final AnonymousClass732 A02() {
        return ((C34991lS) this.A03.get()).A00(C35011lV.A00);
    }

    public final void A04(C139786zR r6) {
        C59472mM r3 = (C59472mM) this.A01.get();
        AnonymousClass00H r4 = r3.A02;
        boolean z = r6.A00;
        SharedPreferences.Editor edit = C35051lZ.A00((C35051lZ) r4.get()).edit();
        C18070vi.A0X(edit);
        edit.putBoolean("pref_auto_crossposting_on_fb", z).apply();
        boolean z2 = r6.A01;
        SharedPreferences.Editor edit2 = C35051lZ.A00((C35051lZ) r4.get()).edit();
        C18070vi.A0X(edit2);
        edit2.putBoolean("pref_auto_crossposting_on_ig", z2).apply();
        r3.A00.A0J(new C146787Qp(r3, 40));
    }
}
