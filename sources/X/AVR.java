package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

public final class AVR implements AnonymousClass897 {
    public final /* synthetic */ C161508Fg A00;

    public AVR(C161508Fg r1) {
        this.A00 = r1;
    }

    public void C7J(UserJid userJid) {
        C193079pV r2;
        String A0s;
        C161508Fg r3 = this.A00;
        AnonymousClass9AV r5 = r3.A04;
        UserJid userJid2 = r3.A02;
        if (userJid2 != null) {
            synchronized (r5) {
                r2 = (C193079pV) r5.A02.get(userJid2);
            }
            UserJid userJid3 = r3.A02;
            if (userJid3 != null) {
                synchronized (r5) {
                    A0s = C17880vN.A0s(userJid3, r5.A01);
                }
                if (A0s != null) {
                    r3.A06.A0E(A0s);
                }
                if (r2 != null) {
                    List list = r2.A00;
                    if (AnonymousClass000.A1a(list)) {
                        ArrayList A13 = AnonymousClass000.A13();
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            C195249t2 r7 = (C195249t2) list.get(i);
                            if (!r7.A04.isEmpty()) {
                                AEI aei = (AEI) r7.A04.get(0);
                                r3.A0A.add(new AnonymousClass77G(aei, r7.A02, r7.A01, r7.A03, r7.A00));
                                String A1H = AnonymousClass001.A1H("thumb-transition-", A1M.A00(aei.A04, 0), AnonymousClass000.A10());
                                C18070vi.A0X(A1H);
                                A13.add(new C85774Or((Drawable) null, new C21073Ae3(r3, i), new C21076Ae6(r3, aei, 2), (String) null, (String) null, A1H));
                            }
                        }
                        r3.A08.A0E(A13);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        C18070vi.A11("bizJid");
        throw null;
    }

    public void Bto(UserJid userJid, int i) {
    }
}
