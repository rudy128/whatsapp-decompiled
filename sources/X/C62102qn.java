package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2qn  reason: invalid class name and case insensitive filesystem */
public class C62102qn {
    public final AnonymousClass11S A00;
    public final AnonymousClass1M9 A01;
    public final C24921Me A02;
    public final AnonymousClass11P A03;
    public final C18030ve A04;
    public final AnonymousClass126 A05;
    public final C24901Mc A06;
    public final List A07 = Collections.synchronizedList(AnonymousClass000.A13());
    public final Map A08;
    public final boolean A09;

    public static boolean A00(AnonymousClass11S r4, C18030ve r5, C178119Bw r6, C89444cT r7) {
        if (!AnonymousClass000.A1T(r6.A07, 3) || r6.A0E != null) {
            if (r6.A0E == null && r6.A0Q()) {
                C178119Bw.A00(r6);
                if (r6.A09 == 3) {
                    return false;
                }
            }
            if (r6.A0W() && r6.A0E == null && ((r6.A09 == 6 || r6.A09 == 7 || r6.A09 == 8) && C40811vJ.A0P(r5))) {
                return false;
            }
            if (!r6.A04.equals(r7)) {
                if (!r6.A0O() || r6.A0B == null) {
                    return true;
                }
                ArrayList A0B = r6.A0B();
                if (A0B.size() > 1) {
                    return true;
                }
                if (A0B.size() == 1 && !C40811vJ.A0K(r4, ((C178109Bv) A0B.get(0)).A00)) {
                    return true;
                }
            }
            if (r6.A0E != null) {
                ArrayList A0B2 = r6.A0B();
                if (A0B2.size() > 1) {
                    return true;
                }
                if ((A0B2.size() == 1 && !C40811vJ.A0K(r4, ((C178109Bv) A0B2.get(0)).A00)) || r6.A0W()) {
                    return true;
                }
            }
            if (r6.A07 == 1) {
                return true;
            }
        }
        return false;
    }

    public void A01(C89444cT r10, ArrayList arrayList) {
        C70483Bg r1;
        C70483Bg r2;
        Object obj;
        if (this.A09) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C178119Bw r5 = (C178119Bw) it.next();
                AnonymousClass11S r0 = this.A00;
                C18030ve r7 = this.A04;
                if (A00(r0, r7, r5, r10)) {
                    boolean A0W = r5.A0W();
                    GroupJid groupJid = r5.A0C;
                    AnonymousClass1M9 r6 = this.A01;
                    if (C63982u1.A01(r6, this.A05, groupJid, this.A06, A0W) != null) {
                        obj = r5.A0C;
                    } else {
                        if (!r5.A0O()) {
                            obj = r5.A04.A01;
                        }
                        r2 = new C70483Bg(r6, this.A02, this.A03, r7);
                        this.A07.add(r2);
                        r2.A04.add(r5);
                    }
                    if (obj != null) {
                        Map map = this.A08;
                        r2 = (C70483Bg) map.get(obj);
                        if (r2 == null) {
                            r2 = new C70483Bg(r6, this.A02, this.A03, r7);
                            this.A07.add(r2);
                            map.put(obj, r2);
                        }
                        r2.A04.add(r5);
                    }
                    r2 = new C70483Bg(r6, this.A02, this.A03, r7);
                    this.A07.add(r2);
                    r2.A04.add(r5);
                }
            }
            return;
        }
        List list = this.A07;
        if (list.isEmpty()) {
            r1 = new C70483Bg(this.A01, this.A02, this.A03, this.A04);
        } else {
            int size = list.size() - 1;
            r1 = (C70483Bg) list.get(size);
            list.remove(size);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C178119Bw r52 = (C178119Bw) it2.next();
            boolean A0W2 = r52.A0W();
            GroupJid groupJid2 = r52.A0C;
            AnonymousClass1M9 r62 = this.A01;
            boolean A1W = AnonymousClass000.A1W(C63982u1.A01(r62, this.A05, groupJid2, this.A06, A0W2));
            AnonymousClass11S r02 = this.A00;
            C18030ve r3 = this.A04;
            if (A00(r02, r3, r52, r10) && !r1.A05(r52, A1W)) {
                if (!r1.A04.isEmpty()) {
                    list.add(r1);
                }
                AnonymousClass11P r22 = this.A03;
                C24921Me r03 = this.A02;
                C18070vi.A0w(r22, r3, r62, r03, r52);
                r1 = new C70483Bg(r62, r03, r22, r3);
                r1.A04.add(r52);
            }
        }
        if (!r1.A04.isEmpty()) {
            list.add(r1);
        }
    }

    public C62102qn(AnonymousClass11S r3, AnonymousClass1M9 r4, C24921Me r5, AnonymousClass11P r6, C18030ve r7, AnonymousClass126 r8, C24901Mc r9) {
        HashMap hashMap;
        this.A04 = r7;
        this.A01 = r4;
        this.A05 = r8;
        this.A06 = r9;
        this.A03 = r6;
        this.A02 = r5;
        this.A00 = r3;
        boolean A052 = C18020vd.A05(C18040vf.A02, r7, 3918);
        this.A09 = A052;
        if (A052) {
            hashMap = C17880vN.A11();
        } else {
            hashMap = null;
        }
        this.A08 = hashMap;
    }
}
