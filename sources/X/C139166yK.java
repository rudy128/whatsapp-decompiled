package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6yK  reason: invalid class name and case insensitive filesystem */
public final class C139166yK {
    public final C26911Ty A00;
    public final AnonymousClass1M9 A01;
    public final C27181Vb A02;
    public final AnonymousClass118 A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    public final List A01(UserJid userJid) {
        AEW A08;
        ArrayList arrayList = null;
        if (!(userJid == null || (A08 = this.A00.A08(userJid)) == null)) {
            List list = A08.A0Q;
            arrayList = C29351c6.A0D(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A00(this, userJid, arrayList, it);
            }
        }
        return arrayList;
    }

    public C139166yK(C26911Ty r2, AnonymousClass1M9 r3, C27181Vb r4, AnonymousClass118 r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r5, r6, r2, r3, r4);
        C18070vi.A0d(r7, 6);
        this.A03 = r5;
        this.A05 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r7;
    }

    public static void A00(C139166yK r4, Jid jid, AbstractCollection abstractCollection, Iterator it) {
        C446124c r0 = (C446124c) it.next();
        String str = r0.A02;
        abstractCollection.add(new C446124c(((C131276kp) r4.A04.get()).A00(jid.getRawString(), str), str, r0.A01));
    }
}
