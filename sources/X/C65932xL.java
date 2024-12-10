package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2xL  reason: invalid class name and case insensitive filesystem */
public class C65932xL implements C22417B6z {
    public final int A00;
    public final Object A01;

    public C65932xL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C192829p3 BGF(UserJid userJid) {
        AnonymousClass10E r1;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            r1 = ((C37391pS) obj).A00;
        } else {
            r1 = ((AnonymousClass1K2) obj).A01;
        }
        AnonymousClass10I AL1 = AnonymousClass10E.AL1(r1);
        return new C192829p3((C189889k1) r1.A1n.get(), (A8S) r1.A1o.get(), (A8Q) r1.A1p.get(), userJid, AL1);
    }
}
