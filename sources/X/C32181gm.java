package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1gm  reason: invalid class name and case insensitive filesystem */
public final class C32181gm implements C32171gl {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    public C32181gm(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r6, 5);
        C18070vi.A0d(r7, 6);
        this.A05 = r2;
        this.A02 = r3;
        this.A00 = r4;
        this.A04 = r5;
        this.A01 = r6;
        this.A03 = r7;
    }

    public boolean Bey(AnonymousClass1BI r3) {
        C18070vi.A0d(r3, 0);
        if (!(r3 instanceof GroupJid)) {
            return false;
        }
        AnonymousClass1E7 A0A = ((AnonymousClass1M9) this.A00.get()).A03.A0A(r3);
        this.A04.get();
        if (A0A == null || A0A.A03 != 1) {
            return false;
        }
        return true;
    }

    public String BSa(AnonymousClass1E7 r6) {
        String str;
        UserJid userJid;
        if (r6 == null || (userJid = r6.A0K) == null) {
            str = null;
        } else {
            str = ((C24921Me) this.A02.get()).A0I(((AnonymousClass1M9) this.A00.get()).A0H(userJid));
        }
        String string = ((AnonymousClass118) this.A05.get()).A00.getResources().getString(2131891142, new Object[]{str});
        C18070vi.A0X(string);
        return string;
    }
}
