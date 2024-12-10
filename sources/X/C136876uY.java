package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6uY  reason: invalid class name and case insensitive filesystem */
public class C136876uY {
    public final C33251iW A00;
    public final C35681md A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass1KB A05;
    public final AnonymousClass11E A06;
    public final AnonymousClass1M9 A07;
    public final AnonymousClass1NN A08;
    public final AnonymousClass126 A09;
    public final AnonymousClass12M A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;

    public void A00(Activity activity, C1600286v r12, AnonymousClass1E7 r13, Integer num, Integer num2, String str, String str2, String str3, boolean z) {
        UserJid userJid = (UserJid) C72453Mb.A0m(r13);
        AnonymousClass3MW.A0V(this.A0B).A0G(activity, r13, userJid, num, num2, str, str2, str3);
        if (z) {
            this.A00.A0X(userJid, true, false);
        }
        if (r12 != null) {
            r12.C9q(r13);
        }
    }

    public void A01(C1600186u r12, AnonymousClass1E7 r13, boolean z, boolean z2) {
        AnonymousClass12M r1 = this.A0A;
        AnonymousClass126 r7 = this.A09;
        Jid A062 = r13.A06(AnonymousClass1EC.class);
        C17960vV.A07(A062);
        r1.A0D(new C1192367g(r12, this, this.A08, r13, r7, (AnonymousClass1EC) A062, z, z2));
    }

    public void A02(AnonymousClass1E7 r22, String str, List list) {
        boolean z;
        boolean z2;
        C29621ca r16;
        AnonymousClass1E7 r2 = r22;
        List list2 = list;
        AnonymousClass1BI A0g = C72463Mc.A0g(r2);
        AnonymousClass1Q1 r6 = (AnonymousClass1Q1) this.A0C.get();
        C18070vi.A0d(A0g, 0);
        ((AnonymousClass11A) r6.A00.get()).A00(new AnonymousClass3C4(r6, A0g, list2, 9));
        C33251iW r0 = this.A00;
        C17960vV.A00();
        C33251iW.A09(r0, A0g);
        if (r0.A07.A07) {
            if (list == null) {
                z = r0.A0R.A0R(A0g);
                list2 = AnonymousClass1R3.A01((C199410f) r0.A0p.A00.getValue(), r0.A0W, A0g, 5, true, z);
                z2 = false;
            } else {
                z = false;
                z2 = true;
            }
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = list2.iterator();
            loop0:
            while (it.hasNext()) {
                AnonymousClass206 A0Y = C17880vN.A0Y(it);
                if (A0Y instanceof AnonymousClass247) {
                    AnonymousClass247 r10 = (AnonymousClass247) A0Y;
                    int i = 0;
                    r0.A0e.A0A(r10.A04);
                    ArrayList A17 = r10.A17();
                    while (i < A17.size() && i < 4) {
                        A13.add(A17.get(i));
                        if (A13.size() == 5) {
                            break loop0;
                        }
                        i++;
                    }
                } else {
                    A13.add(A0Y);
                    if (A13.size() == 5) {
                        break;
                    }
                }
            }
            AnonymousClass00H r4 = r0.A1D;
            String str2 = str;
            if (z2) {
                ((A5M) r4.get()).A05((Integer) null, A13, 3);
            } else {
                ((A5M) r4.get()).A03(A0g, (Integer) null, (String) null, (String) null, C88244Yx.A01(str2), 7, z, false);
            }
            UserJid A002 = C22941Dw.A00(A0g);
            if (A002 != null) {
                ((C170038od) r0.A1T.get()).A08(A002, str2);
            }
            C129206hQ r7 = (C129206hQ) r0.A1Y.get();
            AnonymousClass00H r9 = r7.A02;
            String A0T = C17890vO.A0T(r9);
            try {
                if (C22971Dz.A0d(A0g)) {
                    UserJid userJid = (UserJid) A0g;
                    C72473Md.A1I(userJid, str2);
                    r16 = ((C192329oB) ((C129816iP) r7.A03.get()).A02.get()).A00(userJid, A0T, str2, A13);
                } else if (C22971Dz.A0W(A0g)) {
                    AnonymousClass1EC r5 = (AnonymousClass1EC) A0g;
                    C72473Md.A1I(r5, str2);
                    r16 = ((C191179m9) ((C129816iP) r7.A03.get()).A01.get()).A00(r5, A0T, str2, A13);
                } else if (C22971Dz.A0a(A0g) && A13.size() > 0) {
                    C29671cg r102 = (C29671cg) A0g;
                    AnonymousClass206 r52 = (AnonymousClass206) A13.get(0);
                    C18070vi.A0o(r102, r52, str2);
                    r16 = ((C189739jl) ((C129816iP) r7.A03.get()).A04.get()).A00(r102, r52, A0T, str2);
                } else if (C22971Dz.A0V(A0g)) {
                    C29681ch r53 = (C29681ch) A0g;
                    C72473Md.A1I(r53, str2);
                    r16 = ((C190309kj) ((C129816iP) r7.A03.get()).A03.get()).A00(r53, A0T, str2, A13);
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Unrecognized Jid of type: ");
                    C17900vP.A0o(A10, A0g.getType());
                    r7.A01.A00(AnonymousClass8oH.A09, str2);
                    ((C62042qh) r0.A1E.get()).A01(r2, A0g);
                }
                if (r16 != null) {
                    C17880vN.A0U(r9).A0N(new C693736y(r7, 4), r16, A0T, 98, 32000);
                }
            } catch (Exception e) {
                r7.A01.A01(AnonymousClass8oH.A07, str2, e);
            }
            ((C62042qh) r0.A1E.get()).A01(r2, A0g);
        }
        r2.A0x = true;
        this.A07.A0T(r2);
    }

    public boolean A03(Context context) {
        if (this.A06.A09()) {
            return true;
        }
        Log.w("spamreportmanager/spam/report/no-network-cannot-report");
        int i = 2131892942;
        if (AnonymousClass11E.A02(context)) {
            i = 2131892943;
        }
        this.A05.A08(i, 0);
        return false;
    }

    public C136876uY(AnonymousClass1KB r1, C33251iW r2, AnonymousClass11E r3, AnonymousClass1M9 r4, AnonymousClass1NN r5, AnonymousClass126 r6, AnonymousClass12M r7, C35681md r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        this.A05 = r1;
        this.A00 = r2;
        this.A0C = r9;
        this.A07 = r4;
        this.A0B = r10;
        this.A09 = r6;
        this.A0A = r7;
        this.A03 = r11;
        this.A01 = r8;
        this.A08 = r5;
        this.A04 = r12;
        this.A06 = r3;
        this.A02 = r13;
    }
}
