package X;

import com.whatsapp.jid.UserJid;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.7I8  reason: invalid class name */
public class AnonymousClass7I8 implements C1606989o {
    public AnonymousClass897 A00;
    public long A01;
    public final C136376ti A02;
    public final C125976bz A03;
    public final AnonymousClass1KB A04;
    public final AnonymousClass11E A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass9AV A07;
    public final AnonymousClass7CB A08;
    public final C36921og A09;
    public final AnonymousClass10I A0A;

    private void A00() {
        AnonymousClass7CB r4 = this.A08;
        long j = this.A01;
        r4.BiV((Integer) null, Long.valueOf(j), C108945cZ.A1B(System.currentTimeMillis(), j), (String) null, "xwa_linked_business_account_posts");
    }

    private void A01(int i) {
        this.A04.A0J(new AnonymousClass7RM((Object) this, i, 13));
        A00();
    }

    public void A02() {
        if (!this.A05.A09()) {
            A01(-1);
            return;
        }
        this.A0A.CGF(new C146447Pd(this, 47));
        this.A01 = System.currentTimeMillis();
    }

    public void BE5(C138506xC r6) {
        Object obj;
        if (r6.A00 != 0 || (obj = r6.A03.A00) == null) {
            A01(2);
            return;
        }
        AnonymousClass9AV r3 = this.A07;
        C135266rv r4 = (C135266rv) obj;
        UserJid userJid = this.A02.A03;
        synchronized (r3) {
            C193079pV r1 = r4.A00;
            if (r1 != null) {
                r3.A00.put(userJid, r1);
            }
            C193079pV r12 = r4.A01;
            if (r12 != null) {
                r3.A02.put(userJid, r12);
            }
            String str = r4.A02;
            if (str != null) {
                r3.A01.put(userJid, str);
            }
        }
        this.A04.A0J(new C146447Pd(this, 46));
        A00();
    }

    public void Bsw(Exception exc) {
        if (exc instanceof C122816Sa) {
            A01(2);
            C1404571m r2 = ((C122816Sa) exc).error;
            C36921og r1 = this.A09;
            Integer valueOf = Integer.valueOf(r2.A01);
            Integer valueOf2 = Integer.valueOf(r2.A00);
            Iterator A0h = C17890vO.A0h(r1.A00);
            while (A0h.hasNext()) {
                ((AM5) A0h.next()).Bib(valueOf, valueOf2, (Integer) null, "xwa_linked_business_account_posts", (String) null, (String) null);
            }
        }
        A01(3);
    }

    public AnonymousClass7I8(AnonymousClass1KB r3, AnonymousClass11E r4, AnonymousClass11P r5, AnonymousClass9AV r6, AnonymousClass897 r7, C136376ti r8, C52262ad r9, AnonymousClass7CB r10, C36921og r11, AnonymousClass10I r12) {
        this.A06 = r5;
        this.A02 = r8;
        this.A04 = r3;
        this.A00 = r7;
        this.A0A = r12;
        this.A07 = r6;
        this.A09 = r11;
        Object A0w = AnonymousClass000.A0w(r9.A00, 1);
        C17960vV.A07(A0w);
        this.A03 = (C125976bz) A0w;
        this.A08 = r10;
        this.A05 = r4;
    }

    public void BrB(IOException iOException) {
        iOException.getMessage();
        A01(1);
    }
}
