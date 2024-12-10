package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2xx  reason: invalid class name and case insensitive filesystem */
public class C66302xx implements B7A {
    public final int A00;
    public final Object A01;

    public C66302xx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public AnonymousClass8F7 BGH(UserJid userJid) {
        AnonymousClass10E r1;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            r1 = ((C37391pS) obj).A00;
        } else {
            r1 = ((AnonymousClass1K2) obj).A01;
        }
        C18030ve A8r = AnonymousClass10E.A8r(r1);
        AnonymousClass10I AL1 = AnonymousClass10E.AL1(r1);
        return new AnonymousClass8F7(AnonymousClass0YX.A00(r1.Ao9), AnonymousClass10E.A17(r1), (C196149uX) r1.A1I.get(), (C26911Ty) r1.A1J.get(), (C39511tC) r1.A1K.get(), A8r, userJid, AL1);
    }
}
