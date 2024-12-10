package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.9Px  reason: invalid class name and case insensitive filesystem */
public abstract class C181299Px {
    public static A21 A00(C98464rC r9, C29621ca r10) {
        AnonymousClass9F6 r4 = (AnonymousClass9F6) r9.A03.getValue();
        ArrayList A16 = C108955ca.A16(r4, 1);
        try {
            AnonymousClass9FK r92 = new AnonymousClass9FK(r10, r4);
            ArrayList A13 = AnonymousClass000.A13();
            LinkedHashMap A132 = C17880vN.A13();
            for (AnonymousClass9DL r0 : r92.A03) {
                UserJid userJid = (UserJid) r0.A00;
                C178179Cc r5 = (C178179Cc) r0.A01;
                if (r5 != null) {
                    C184359ap r02 = new C184359ap(userJid, A132);
                    r02.A01.put(r02.A00, r5.A01);
                } else {
                    A13.add(userJid);
                }
            }
            return new A21(r92.A00, C29431cG.A0t(A13), AnonymousClass1D7.A0F(A132));
        } catch (AnonymousClass1UI e) {
            AnonymousClass8BY.A1I("RemoveParticipantsResponseSuccess: ", AnonymousClass000.A10(), e, A16);
            try {
                C22527BBk bBk = (C22527BBk) new AnonymousClass9FP(r10, r4, 2).A01;
                return new A21(String.valueOf(bBk.BOr()), bBk.BaG());
            } catch (AnonymousClass1UI e2) {
                AnonymousClass8BY.A1I("RemoveParticipantsResponseClientError: ", AnonymousClass000.A10(), e2, A16);
                try {
                    C178309Cp r2 = (C178309Cp) ((AnonymousClass9DP) new AnonymousClass9FQ(r10, r4, 3).A01).A00;
                    return new A21(String.valueOf(r2.A00), r2.A02);
                } catch (AnonymousClass1UI e3) {
                    throw AnonymousClass8BY.A0N("RemoveParticipantsResponseServerError: ", AnonymousClass000.A10(), e3, A16);
                }
            }
        }
    }
}
