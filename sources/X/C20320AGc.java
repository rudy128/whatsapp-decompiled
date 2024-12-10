package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.AGc  reason: case insensitive filesystem */
public final class C20320AGc implements AnonymousClass1GE {
    public static final C198829yy A05 = new Object();
    public C186379e6 A00;
    public Integer A01;
    public final AHz A02;
    public final C25813CmQ A03;
    public final Context A04;

    public /* synthetic */ void BqQ(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C0B(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C3z(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C6E() {
    }

    public /* synthetic */ void C71(AnonymousClass1F9 r1) {
    }

    public final BV8 A00() {
        Context context = this.A04;
        C25813CmQ cmQ = this.A03;
        C18070vi.A0d(cmQ, 1);
        BV8 bv8 = new BV8(context);
        bv8.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        cmQ.A03(bv8);
        return bv8;
    }

    public final void A01() {
        C186379e6 r1;
        String str;
        Integer num = this.A01;
        Integer num2 = AnonymousClass00R.A01;
        Integer num3 = num2;
        if (num != num2 && (r1 = this.A00) != null) {
            this.A01 = num2;
            if (num != AnonymousClass00R.A00) {
                num2 = AnonymousClass00R.A0C;
            }
            E8A e8a = r1.A02;
            if (e8a != null) {
                DFL dfl = r1.A01;
                DOZ doz = r1.A00;
                if (num2 == num3) {
                    str = "forward";
                } else {
                    str = "back";
                }
                C20046A4p a4p = new C20046A4p();
                a4p.A03(doz, 0);
                a4p.A03(str, 1);
                C20046A4p.A01(doz, dfl, a4p, e8a);
            }
        }
    }

    public final void A02(Integer num) {
        E8A e8a;
        String str;
        Integer num2 = this.A01;
        Integer num3 = AnonymousClass00R.A01;
        if (num2 == num3) {
            this.A01 = AnonymousClass00R.A0C;
            C186379e6 r1 = this.A00;
            if (r1 != null && (e8a = r1.A03) != null) {
                DFL dfl = r1.A01;
                DOZ doz = r1.A00;
                if (num == num3) {
                    str = "forward";
                } else {
                    str = "back";
                }
                C20046A4p a4p = new C20046A4p();
                a4p.A03(doz, 0);
                a4p.A03(str, 1);
                C20046A4p.A01(doz, dfl, a4p, e8a);
            }
        }
    }

    public void BrH(AnonymousClass1F9 r5) {
        Iterator it = this.A02.A07.iterator();
        while (it.hasNext()) {
            int A0H = C72453Mb.A0H(it);
            if (Integer.valueOf(A0H) != null) {
                synchronized (C25925Coo.A01) {
                    C25925Coo.A00.delete(A0H);
                }
            }
        }
        this.A03.A01();
    }

    public C20320AGc(Context context, SparseArray sparseArray, AHz aHz, CXY cxy, Integer num) {
        this.A04 = context;
        this.A02 = aHz;
        this.A01 = num;
        C26235CvV cvV = aHz.A02;
        Map emptyMap = Collections.emptyMap();
        new SparseArray();
        Map map = aHz.A08;
        C25344Ce3.A00(context);
        C25344Ce3.A00(cvV);
        this.A03 = new C25813CmQ(context, sparseArray, cvV, cxy, emptyMap, map);
    }
}
