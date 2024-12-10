package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4mS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C95574mS implements C107305Ze {
    public final /* synthetic */ AnonymousClass4aY A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public final void Bkp() {
        C108865cQ r1;
        DialogFragment A002;
        AnonymousClass4aY r4 = this.A00;
        boolean z = this.A01;
        boolean z2 = this.A02;
        UserJid A0j = AnonymousClass3MW.A0j(r4);
        Integer num = null;
        C88654aI.A03(C88444Zs.A00(r4), A0j, (String) null, 8, true);
        C87684Wn.A00(r4.A4G, 6);
        C194859sP r2 = (C194859sP) AnonymousClass3Ma.A0Z(r4).A0B.get();
        r2.A00();
        if (r4.A6n) {
            num = C72483Me.A0V(r4);
        }
        r2.A02(1, num, 2);
        AnonymousClass4aY.A0l(r4);
        if (!z || !z2) {
            C72453Mb.A1P(AnonymousClass3Ma.A0Z(r4).A0E);
            if (((AnonymousClass1VD) r4.A5w.get()).A01(r4.A35, false)) {
                r1 = r4.A2Q;
                A002 = ((AnonymousClass1VD) r4.A5w.get()).A00();
            } else {
                r4.A2x(r4.A35, false, false, false);
                return;
            }
        } else if (A0j != null) {
            r1 = r4.A2Q;
            A002 = AnonymousClass4Fv.A00(A0j, 8);
        } else {
            return;
        }
        r1.CMl(A002);
    }

    public /* synthetic */ C95574mS(AnonymousClass4aY r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = z;
        this.A02 = z2;
    }
}
