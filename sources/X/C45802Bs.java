package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2Bs  reason: invalid class name and case insensitive filesystem */
public class C45802Bs extends C167258fi {
    public final Collection A00;
    public final boolean A01;
    public final boolean A02;
    public final /* synthetic */ C32861hs A03;

    public C45802Bs(C32861hs r1, Collection collection, boolean z, boolean z2) {
        this.A03 = r1;
        this.A00 = collection;
        this.A01 = z;
        this.A02 = z2;
    }

    public /* bridge */ /* synthetic */ Object A0E() {
        AnonymousClass34B A04;
        int i;
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            AnonymousClass21V A0b = C17880vN.A0b(it);
            C32861hs r7 = this.A03;
            boolean z = this.A02;
            boolean z2 = this.A01;
            if (A0b.A0D() != 1) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("SendMediaMessageManager/tryCancelMessageAndMediaJob ");
                A10.append(A0b.A0v);
                A10.append(" status:");
                C17900vP.A0o(A10, A0b.A0D());
            } else {
                C63642tS A002 = C32861hs.A00(r7, A0b);
                if (!(A002 == null || (A04 = r7.A04(A002)) == null)) {
                    C167228ff r0 = (C167228ff) r7.A0I.A03(A04);
                    if (r0 != null) {
                        r7.A0A.A05(A0b.A02, r0.A0Z, A0b);
                    }
                    synchronized (A04.A0V) {
                        A002.A03(A0b.A0v);
                        if (A002.A06()) {
                            C32861hs.A01(r7, (AnonymousClass34B) null, A002);
                        }
                    }
                    synchronized (r7.A0R) {
                        Iterator A0i = C17890vO.A0i(r7.A0S);
                        i = 0;
                        while (A0i.hasNext()) {
                            Map.Entry A16 = AnonymousClass000.A16(A0i);
                            C17960vV.A0D(!((C63642tS) A16.getKey()).A06());
                            if (A16.getValue() == A04) {
                                i += ((C63642tS) A16.getKey()).A03.size();
                            }
                        }
                    }
                    if (i == 0) {
                        AnonymousClass1T6 r2 = r7.A09;
                        A04.A08(z);
                        if (z2) {
                            A04.A0O.A08();
                        }
                        r2.A09.A02(A04, A04.A02().A06);
                        C26471Sg r1 = r2.A0B;
                        r1.A08(A04);
                        AnonymousClass34A r02 = A04.A02;
                        if (r02 != null) {
                            r1.A08(r02);
                        }
                    }
                }
            }
        }
        return AnonymousClass000.A0i();
    }
}
