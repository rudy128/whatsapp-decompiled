package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.36M  reason: invalid class name */
public final class AnonymousClass36M implements C437420t {
    public final AnonymousClass00H A00;
    public final C32191gn A01;

    public AnonymousClass3KT BXT(AnonymousClass206 r7) {
        String str;
        StringBuilder A10;
        int i;
        C18070vi.A0d(r7, 0);
        C436420i r72 = (C436420i) r7;
        String A0P = r72.A0P();
        if (A0P == null) {
            A0P = "";
        }
        StringBuilder sb = new StringBuilder(A0P);
        if (r72 instanceof AnonymousClass2MN) {
            UserJid userJid = ((AnonymousClass2MN) r72).A01;
            if (userJid != null) {
                A10 = AnonymousClass000.A10();
                A10.append(' ');
                str = userJid.getRawString();
            }
            return C690335q.A01(C18070vi.A0H(sb));
        }
        if (r72 instanceof AnonymousClass2MB) {
            AnonymousClass2MB r73 = (AnonymousClass2MB) r72;
            str = r73.A00;
            AnonymousClass1BI r1 = r73.A0v.A00;
            if (!(str == null || str.length() == 0 || r1 == null)) {
                AnonymousClass1E7 A0H = ((AnonymousClass1M9) this.A00.get()).A0H(r1);
                if ((!A0H.A0C() || !((i = A0H.A0A) == 2 || i == 1)) && str.length() != 0) {
                    A10 = AnonymousClass000.A10();
                    A10.append(' ');
                }
            }
        }
        return C690335q.A01(C18070vi.A0H(sb));
        sb.append(AnonymousClass000.A0y(str, A10));
        return C690335q.A01(C18070vi.A0H(sb));
    }

    public AnonymousClass3KT BXU(AnonymousClass206 r3) {
        C18070vi.A0d(r3, 0);
        String A0S = this.A01.A0S((C436420i) r3, false);
        if (A0S == null) {
            A0S = "";
        }
        return C690335q.A01(A0S);
    }

    public AnonymousClass36M(C32191gn r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
