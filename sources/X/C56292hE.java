package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.2hE  reason: invalid class name and case insensitive filesystem */
public final class C56292hE {
    public final AnonymousClass1EB A00(AnonymousClass11S r4, String str) {
        AnonymousClass1EB r1;
        PhoneUserJid A01 = AnonymousClass11S.A01(r4);
        C18070vi.A0X(A01);
        StringBuilder A10 = AnonymousClass000.A10();
        String str2 = A01.user;
        C17960vV.A07(str2);
        A10.append(str2);
        A10.append('-');
        A10.append(str);
        String A0y = AnonymousClass000.A0y("@temp", A10);
        Jid A00 = C22911Dt.A00(A0y);
        if ((A00 instanceof AnonymousClass1EB) && (r1 = (AnonymousClass1EB) A00) != null) {
            return r1;
        }
        throw new AnonymousClass11T(A0y);
    }
}
