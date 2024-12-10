package X;

import com.whatsapp.biz.catalog.view.activity.ProductListActivity;
import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AO0 implements B7O {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AO0(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void C2L(long j) {
        C168018i9 r1;
        String str;
        List A10;
        String str2;
        String str3;
        C192829p3 r3;
        UserJid userJid;
        C185599cq BOv;
        int i = this.A00;
        Object obj = this.A01;
        long j2 = j;
        if (i != 0) {
            C168658jQ r32 = (C168658jQ) obj;
            C22369B4x b4x = (C22369B4x) this.A02;
            C18070vi.A0h(r32, b4x);
            List list = C42011xT.A0I;
            if (r32.A05() != -1) {
                AnonymousClass1D6 A002 = AnonymousClass1D6.A00(r32.A0A.BXb(r32.A05()), r32.A05());
                C20287AEv aEv = (C20287AEv) A002.first;
                int A09 = C108955ca.A09(A002);
                B7L b7l = r32.A01;
                String str4 = null;
                if (b7l == null || (BOv = b7l.BOv(A09)) == null) {
                    str2 = null;
                    str3 = null;
                } else {
                    str4 = BOv.A01;
                    str2 = BOv.A02;
                    str3 = BOv.A00;
                }
                AOC aoc = (AOC) b4x;
                int i2 = aoc.A00;
                C18070vi.A0d(aEv, 1);
                switch (i2) {
                    case 0:
                        AnonymousClass8F8 A4e = ((C168578j9) aoc.A01).A4e();
                        r3 = A4e.A0E;
                        userJid = A4e.A0O;
                        break;
                    case 1:
                        AnonymousClass8F5 r0 = ((ProductListActivity) aoc.A01).A0F;
                        if (r0 != null) {
                            r3 = r0.A04;
                            userJid = r0.A09;
                            break;
                        } else {
                            C18070vi.A11("productListViewModel");
                            throw null;
                        }
                    case 2:
                        AnonymousClass8F1 A4b = ((C169018kE) aoc.A01).A4b();
                        r3 = A4b.A02;
                        userJid = A4b.A05;
                        break;
                    default:
                        BusinessProductListBaseFragment businessProductListBaseFragment = (BusinessProductListBaseFragment) aoc.A01;
                        userJid = businessProductListBaseFragment.A27();
                        r3 = ((AnonymousClass8FU) businessProductListBaseFragment.A0K.getValue()).A02;
                        break;
                }
                r3.A01(aEv, userJid, str4, str2, str3, (List) null, j2);
                return;
            }
            return;
        }
        C168108iI r33 = (C168108iI) obj;
        B79 b79 = (B79) this.A02;
        AnonymousClass3MX.A1O(r33);
        if (r33.A05() != -1) {
            C182879Wb BQj = b79.BQj(r33.A05());
            if (!(!(BQj instanceof C168018i9) || (r1 = (C168018i9) BQj) == null || (str = r1.A00.A01.A0H) == null)) {
                AnonymousClass8G8 A2K = r33.A09.A2K();
                if (j == 0) {
                    C198799yv r4 = A2K.A0I;
                    UserJid userJid2 = A2K.A0O;
                    A8Q a8q = r4.A0I;
                    A7D A003 = A8Q.A00(a8q);
                    AtomicInteger atomicInteger = a8q.A0D;
                    A003.A05 = Integer.valueOf(atomicInteger.get());
                    A8Q.A02(A003, a8q);
                    AtomicInteger atomicInteger2 = a8q.A0E;
                    A003.A09 = C17880vN.A0n(atomicInteger2.getAndIncrement());
                    A7D.A01(A003, 30);
                    A7D.A02(A003, 54);
                    A003.A04(C198799yv.A00(r4, str));
                    A003.A0H = str;
                    A003.A00 = userJid2;
                    a8q.A09(A003);
                    AnonymousClass1DT r02 = r4.A01;
                    if (r02 != null && (A10 = AnonymousClass3MW.A10(r02)) != null && A10.size() == 1 && str.equals(((C194209rM) A10.get(0)).A01.A0H)) {
                        A7D A004 = A8Q.A00(a8q);
                        A004.A05 = Integer.valueOf(atomicInteger.get());
                        A8Q.A02(A004, a8q);
                        A004.A09 = C17880vN.A0n(atomicInteger2.getAndIncrement());
                        A7D.A01(A004, 31);
                        A7D.A02(A004, 55);
                        A004.A04(C198799yv.A00(r4, str));
                        A004.A00 = userJid2;
                        a8q.A09(A004);
                    }
                    C21459AkQ.A01(r4.A0N, r4, userJid2, str, 26);
                } else {
                    C198799yv r13 = A2K.A0I;
                    UserJid userJid3 = A2K.A0O;
                    A8Q a8q2 = r13.A0I;
                    A7D A005 = A8Q.A00(a8q2);
                    A8Q.A04(A005, a8q2);
                    A8Q.A02(A005, a8q2);
                    A8Q.A03(A005, a8q2);
                    A7D.A01(A005, 29);
                    A7D.A02(A005, 53);
                    A005.A04(C198799yv.A00(r13, str));
                    A005.A0H = str;
                    A005.A00 = userJid3;
                    A005.A08 = Long.valueOf(j2);
                    a8q2.A09(A005);
                    r13.A0N.CGF(new C21366Aiv(r13, userJid3, str, 1, j2));
                }
            }
            int i3 = 0;
            if (j == 0) {
                i3 = 4;
            }
            r33.A0B.setVisibility(i3);
        }
    }
}
