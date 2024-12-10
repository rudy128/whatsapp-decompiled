package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ANm  reason: case insensitive filesystem */
public final class C20501ANm implements B7I {
    public int A00;
    public int A01 = 4;
    public AnonymousClass1DT A02;
    public final C20114A7x A03;
    public final C185569cn A04;
    public final UserJid A05;
    public final List A06;
    public final AnonymousClass1KB A07;

    public C20501ANm(AnonymousClass1KB r2, C20114A7x a7x, C185569cn r4, UserJid userJid, List list) {
        C18070vi.A0g(a7x, 4, r4);
        this.A07 = r2;
        this.A05 = userJid;
        this.A06 = list;
        this.A03 = a7x;
        this.A04 = r4;
    }

    public void CBu(AN6 an6) {
        this.A01 = an6.A00;
        List list = an6.A01;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.A03.A0I(AnonymousClass8BS.A0B(it), this.A05);
            }
        }
        an6.A01 = A00(this);
        C21450AkH.A00(this.A07, this, an6, 6);
    }

    public static final ArrayList A00(C20501ANm aNm) {
        AEJ aej;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = aNm.A06.iterator();
        while (it.hasNext()) {
            C20287AEv A0A = aNm.A03.A0A((UserJid) null, C17880vN.A0v(it));
            if (A0A != null && (aej = A0A.A03) != null && aej.A00 == 0 && !A0A.A0C) {
                A13.add(A0A);
            }
        }
        return A13;
    }
}
