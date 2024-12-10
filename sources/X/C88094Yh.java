package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.4Yh  reason: invalid class name and case insensitive filesystem */
public final class C88094Yh {
    public final Context A00;
    public final C108025b0 A01;
    public final C18100vl A02 = AnonymousClass1DF.A01(new AnonymousClass5H0(this));
    public final C34101jv A03;
    public final AnonymousClass5ZZ A04;
    public final C107265Za A05;
    public final C87564Wb A06;
    public final C18000vb A07;
    public final AnonymousClass1KW A08;
    public final C18030ve A09;
    public final Integer A0A;
    public final List A0B = AnonymousClass000.A13();

    public C88094Yh(Context context, C34101jv r3, AnonymousClass5ZZ r4, C107265Za r5, C87564Wb r6, C108025b0 r7, C18000vb r8, AnonymousClass1KW r9, C18030ve r10, Integer num) {
        C18070vi.A0g(r9, 3, r4);
        C18070vi.A0q(r5, r6, r3);
        this.A00 = context;
        this.A01 = r7;
        this.A08 = r9;
        this.A07 = r8;
        this.A04 = r4;
        this.A05 = r5;
        this.A06 = r6;
        this.A03 = r3;
        this.A0A = num;
        this.A09 = r10;
    }

    private final void A00(int i) {
        String str;
        Object obj;
        C108445bi r1;
        Iterator it = this.A0B.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C87044Ub) obj).A03 == i) {
                break;
            }
        }
        C87044Ub r3 = (C87044Ub) obj;
        if (r3 != null && (r1 = (C108445bi) AnonymousClass000.A0w(AnonymousClass3MW.A12(this.A06.A00), i)) != null) {
            CharSequence A052 = C43251zV.A05(this.A00, this.A08, r1.BaW((C108015az) this.A02.getValue()));
            if (A052 != null) {
                str = A052.toString();
            }
            r3.A01 = str;
        }
    }

    public final List A01() {
        String str;
        Integer num;
        List list = this.A0B;
        list.clear();
        C107265Za r5 = this.A05;
        C18100vl r4 = this.A06.A00;
        Set keySet = AnonymousClass3MW.A12(r4).keySet();
        C18070vi.A0d(keySet, 0);
        Iterator it = C98974s1.A00(keySet, new AnonymousClass5W7((C95134lk) r5), 9).iterator();
        while (it.hasNext()) {
            int A0H = C72453Mb.A0H(it);
            C108445bi r9 = (C108445bi) AnonymousClass000.A0w(AnonymousClass3MW.A12(r4), A0H);
            if (r9 == null) {
                C17960vV.A0F(false, "Action id returned from repository provided a null action!");
            } else {
                String BaW = r9.BaW((C108015az) this.A02.getValue());
                Context context = this.A00;
                CharSequence A052 = C43251zV.A05(context, this.A08, BaW);
                Drawable BSc = r9.BSc(context, this.A07);
                if (!(BSc == null || (num = this.A0A) == null)) {
                    BSc.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_ATOP);
                }
                if (A052 != null) {
                    str = A052.toString();
                } else {
                    str = null;
                }
                list.add(new C87044Ub(BSc, str, A0H));
                int intValue = r5.BXA(A0H).intValue();
                if (intValue == 0) {
                    this.A03.BBi(A0H);
                } else if (intValue == 2) {
                    this.A03.BBp(A0H);
                }
            }
        }
        return list;
    }

    public final List A02() {
        Object obj;
        Object obj2;
        boolean z;
        C108025b0 r6 = this.A01;
        Collection BYq = r6.BYq();
        if (BYq == null || BYq.isEmpty()) {
            return this.A0B;
        }
        Collection BYq2 = r6.BYq();
        if (BYq2 != null) {
            obj = C29431cG.A0Y(BYq2);
        } else {
            obj = null;
        }
        C17960vV.A07(obj);
        C18070vi.A0X(obj);
        if (((AnonymousClass206) obj).A0w()) {
            if (C18020vd.A05(C18040vf.A02, this.A09, 6516)) {
                C34101jv r1 = this.A03;
                r1.BBp(5);
                r1.BBp(34);
            }
        }
        List<C87044Ub> list = this.A0B;
        for (C87044Ub r2 : list) {
            C87564Wb r0 = this.A06;
            C108445bi r02 = (C108445bi) AnonymousClass000.A0w(AnonymousClass3MW.A12(r0.A00), r2.A03);
            if (r02 != null) {
                z = r02.CMC(BYq);
            } else {
                z = false;
            }
            r2.A02 = z;
        }
        if (BYq.size() == 1) {
            Collection BYq3 = r6.BYq();
            if (BYq3 != null) {
                obj2 = C29431cG.A0Y(BYq3);
            } else {
                obj2 = null;
            }
            C17960vV.A07(obj2);
            C18070vi.A0X(obj2);
            AnonymousClass206 r22 = (AnonymousClass206) obj2;
            AnonymousClass205 r12 = r22.A0v;
            if (C22971Dz.A0e(r12.A00) && (!r12.A02 || r22.A0D() == 6)) {
                A00(11);
                A00(15);
            }
        }
        A00(17);
        A00(30);
        return list;
    }

    public final boolean A03(int i) {
        C108025b0 r3 = this.A01;
        Collection BYq = r3.BYq();
        if (BYq != null && !BYq.isEmpty()) {
            if (!this.A04.BKp(i, BYq)) {
                return false;
            }
            C108445bi r0 = (C108445bi) AnonymousClass000.A0w(AnonymousClass3MW.A12(this.A06.A00), i);
            if (r0 != null && r0.BRj()) {
                this.A0B.clear();
                r3.BLL();
            }
        }
        return true;
    }
}
