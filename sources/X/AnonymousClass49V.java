package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.49V  reason: invalid class name */
public final class AnonymousClass49V extends A34 {
    public C81833zs A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1CJ A02;
    public final AnonymousClass1MZ A03;
    public final C18030ve A04;
    public final C25241Nl A05;
    public final GroupJid A06;
    public final C85994Pt A07;
    public final C25431Oe A08;
    public final /* synthetic */ C26241Rj A09;

    public AnonymousClass49V(AnonymousClass11S r1, AnonymousClass1CJ r2, AnonymousClass1MZ r3, C18030ve r4, C25241Nl r5, GroupJid groupJid, C85994Pt r7, C26241Rj r8, C25431Oe r9) {
        this.A09 = r8;
        this.A04 = r4;
        this.A01 = r1;
        this.A02 = r2;
        this.A08 = r9;
        this.A05 = r5;
        this.A03 = r3;
        this.A06 = groupJid;
        this.A07 = r7;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass1EC r4;
        Map map = (Map) obj;
        if (C18020vd.A05(C18040vf.A02, this.A04, 11746)) {
            r4 = AnonymousClass3MW.A0i(this.A06);
        } else {
            r4 = null;
        }
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            C26241Rj.A01((AnonymousClass1BI) A16.getKey(), r4, (C52502b1) A16.getValue(), this.A09);
        }
        C81833zs r2 = this.A00;
        if (r2 != null) {
            this.A07.A00(r2, map.keySet());
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C52502b1 A002;
        HashMap A11 = C17880vN.A11();
        AnonymousClass1CJ r0 = this.A02;
        GroupJid groupJid = this.A06;
        if (!r0.A0R(groupJid)) {
            C63872tp A0B = this.A03.A08.A0B(groupJid);
            C18030ve r3 = this.A04;
            C18040vf r1 = C18040vf.A02;
            if (C18020vd.A00(r1, r3, 10861) != 0 && C18020vd.A00(r1, r3, 10861) >= A0B.A07().size()) {
                HashSet A12 = C17880vN.A12();
                AnonymousClass1IZ it = A0B.A07().iterator();
                while (it.hasNext()) {
                    Jid A0S = C17880vN.A0S(it);
                    if (C22971Dz.A0T(A0S)) {
                        A12.add(A0S);
                    }
                }
                C26241Rj r12 = this.A09;
                C27300DbW create = C27300DbW.create((Map) r12.A04.A0H(A12));
                AnonymousClass1IZ it2 = A0B.A07().iterator();
                int i = 0;
                int i2 = 0;
                while (it2.hasNext()) {
                    AnonymousClass1BI A0Q = C17880vN.A0Q(it2);
                    if (!this.A01.A0O(A0Q) && !AnonymousClass1E5.A00(A0Q)) {
                        C43371zh r02 = (C43371zh) r12.A0F.get(A0Q);
                        if (r02 == null || r02.A03 != 1) {
                            if (C22971Dz.A0T(A0Q)) {
                                A002 = C26241Rj.A00((AnonymousClass1BI) create.inverse().get(A0Q), r12);
                            } else {
                                A002 = C26241Rj.A00(A0Q, r12);
                            }
                            if (A002.A00 != null) {
                                i2++;
                            }
                            A11.put(A0Q, A002);
                        } else {
                            i++;
                        }
                    }
                }
                Set keySet = A11.keySet();
                String A032 = this.A08.A03();
                String A14 = AnonymousClass3Ma.A14(this.A05, groupJid);
                long A062 = (long) A0B.A06();
                long size = (long) r12.A0F.size();
                C81833zs r13 = new C81833zs();
                this.A00 = r13;
                r13.A0D = A032;
                r13.A0C = A14;
                r13.A06 = C17880vN.A0n(keySet.size());
                C81833zs r14 = this.A00;
                r14.A01 = Long.valueOf(A062);
                r14.A02 = Long.valueOf((long) i);
                r14.A03 = Long.valueOf((long) i2);
                r14.A0B = Long.valueOf(size);
                return A11;
            }
        }
        A0B(true);
        return A11;
    }
}
