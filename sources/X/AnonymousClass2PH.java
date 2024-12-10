package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* renamed from: X.2PH  reason: invalid class name */
public class AnonymousClass2PH extends A34 {
    public final AnonymousClass12E A00;
    public final C24751Ln A01;
    public final UserJid A02;
    public final AnonymousClass1QS A03;

    public AnonymousClass2PH(AnonymousClass12E r1, C24751Ln r2, UserJid userJid, AnonymousClass1QS r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = userJid;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C62602rf r0;
        PhoneUserJid A0D;
        ArrayList A13 = AnonymousClass000.A13();
        UserJid userJid = this.A02;
        if (userJid != null) {
            A13.add(userJid);
        }
        AnonymousClass12E r9 = this.A00;
        AnonymousClass2R1 r3 = AnonymousClass2R1.A0E;
        C62132qq r2 = C62132qq.A0M;
        if (!r9.A08.A09()) {
            Log.i("contactsyncmethods/network_unavailable");
            r0 = C62602rf.A04;
        } else {
            C17960vV.A0C(r2.A00());
            C17960vV.A0C(AnonymousClass000.A1Z(r3.scope, C49362Qe.MULTI_PROTOCOLS_QUERY));
            A13.size();
            C63212sh A002 = C63212sh.A00(r3);
            A002.A03 = true;
            A002.A00 = r2;
            Iterator it = A13.iterator();
            while (it.hasNext()) {
                AnonymousClass1BI A0Q = C17880vN.A0Q(it);
                if (!C18020vd.A05(C18040vf.A02, r9.A0I, 3311)) {
                    r9.A09.A0H(A0Q);
                }
                if (A0Q != null) {
                    A002.A08.add(A0Q);
                }
            }
            try {
                r0 = (C62602rf) AnonymousClass12E.A00(r9, A002.A02(), false).get();
            } catch (InterruptedException | ExecutionException unused) {
                r0 = C62602rf.A03;
            }
        }
        if (!r0.A00()) {
            return false;
        }
        Iterator it2 = A13.iterator();
        while (it2.hasNext()) {
            UserJid A0T = C17880vN.A0T(it2);
            AnonymousClass1QS r02 = this.A03;
            AnonymousClass1QS.A00(r02);
            AnonymousClass1KH r22 = r02.A05;
            C24751Ln r1 = this.A01;
            C18070vi.A0d(A0T, 0);
            C18070vi.A0e(r22, 1, r1);
            if (A0T instanceof PhoneUserJid) {
                r22.A0G(A0T, r1.A0C((PhoneUserJid) A0T));
            } else if ((A0T instanceof AnonymousClass1E2) && (A0D = r1.A0D((AnonymousClass1E1) A0T)) != null) {
                r22.A0G(A0D, A0T);
            }
        }
        return true;
    }
}
