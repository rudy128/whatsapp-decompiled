package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Re  reason: invalid class name and case insensitive filesystem */
public abstract class C181619Re {
    public static final void A00(C192789oz r4, AnonymousClass118 r5, UserJid userJid, AnonymousClass21L r7) {
        AER aer;
        C18070vi.A0h(userJid, r7);
        AnonymousClass3Ma.A1O(r4, 2, r5);
        C20285AEt aEt = r7.A00;
        if (aEt != null) {
            int i = aEt.A00;
            if ((i == 2 || i == 6) && (aer = aEt.A07) != null) {
                List<C20254ADm> list = aer.A02;
                ArrayList<C20243ADb> A13 = AnonymousClass000.A13();
                for (C20254ADm aDm : list) {
                    C29401cD.A0J(aDm.A01, A13);
                }
                ArrayList A0D = C29351c6.A0D(A13);
                for (C20243ADb aDb : A13) {
                    A0D.add(aDb.A00);
                }
                String valueOf = String.valueOf(AnonymousClass3MW.A01(AnonymousClass3MW.A05(r5), 2131167707));
                r4.A01(new A20(userJid, valueOf, valueOf, A0D));
            }
        }
    }
}
