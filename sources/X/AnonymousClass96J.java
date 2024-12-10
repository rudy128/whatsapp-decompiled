package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.96J  reason: invalid class name */
public final class AnonymousClass96J extends C161588Gc {
    public void A0h(List list) {
        AW0 aw0;
        UserJid userJid;
        AW0 aw02;
        AW0 aw03;
        A0g(list);
        ArrayList A13 = AnonymousClass000.A13();
        C1767495k A0V = A0V();
        if (A0V != null) {
            A13.add(A0V);
        }
        AnonymousClass9NU r0 = this.A06;
        if (!(r0 == null || (aw03 = r0.A01) == null)) {
            C1767495k r2 = new C1767495k();
            Context context = this.A0P.A00;
            C161588Gc.A00(context, r2, 2131896972);
            r2.A03 = context.getString(this.A0k.A0G(aw03));
            A13.add(r2);
        }
        AnonymousClass9NU r02 = this.A06;
        if (!(r02 == null || (aw02 = r02.A01) == null)) {
            C1767495k r5 = new C1767495k();
            Context context2 = this.A0P.A00;
            C161588Gc.A00(context2, r5, 2131893476);
            Object[] A1a = AnonymousClass3MW.A1a();
            C18000vb r7 = this.A0Q;
            AnonymousClass11Y r8 = AnonymousClass11X.A00;
            C18070vi.A0W(r7);
            AnonymousClass11P r9 = this.A0O;
            r5.A03 = C108975cc.A0b(context2, A87.A03(r7, r8.A07(r7, r9.A09(aw02.A06)), A8I.A00(r7, r9.A09(aw02.A06))), A1a, 2131896920);
            A13.add(r5);
        }
        if (C17880vN.A1X(A13)) {
            C161588Gc.A05(list);
            Iterator it = A13.iterator();
            while (it.hasNext()) {
                list.add(it.next());
            }
        }
        AnonymousClass1QO r3 = this.A0b;
        if (r3.A0C()) {
            C1767295i r1 = new C1767295i();
            r1.A02 = "";
            list.add(r1);
            C1766895e r22 = new C1766895e();
            r22.A01 = true;
            r22.A00 = new AFR(this, 31);
            list.add(r22);
        }
        C1767295i r6 = new C1767295i();
        if (r3.A0C()) {
            r6.A00 = "756694756131577";
            r6.A01 = "p2m-lite-learn-more-link";
        } else {
            AnonymousClass118 r72 = this.A0P;
            Context context3 = r72.A00;
            Object[] A1a2 = AnonymousClass3MW.A1a();
            AnonymousClass9NU r03 = this.A06;
            String str = null;
            if (!(r03 == null || (aw0 = r03.A01) == null || (userJid = aw0.A0D) == null)) {
                AnonymousClass1E7 A0H = this.A0M.A0H(userJid);
                String A0K = A0H.A0K();
                if (A0K == null || !(!AnonymousClass1YF.A0T(A0K))) {
                    String A0L = A0H.A0L();
                    str = (A0L == null || !(AnonymousClass1YF.A0T(A0L) ^ true)) ? r72.A01(2131899296) : A0H.A0L();
                } else {
                    str = A0H.A0K();
                }
            }
            r6.A02 = C108975cc.A0b(context3, str, A1a2, 2131896978);
        }
        list.add(r6);
    }
}
