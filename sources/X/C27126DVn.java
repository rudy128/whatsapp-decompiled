package X;

import android.content.Context;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.DVn  reason: case insensitive filesystem */
public final class C27126DVn implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C25006CTg A02;
    public final /* synthetic */ AnonymousClass0IV A03;
    public final /* synthetic */ C04220Mi A04;
    public final /* synthetic */ DFL A05;

    public C27126DVn(C25006CTg cTg, AnonymousClass0IV r2, C04220Mi r3, DFL dfl, int i, int i2) {
        this.A02 = cTg;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = r2;
        this.A05 = dfl;
        this.A04 = r3;
    }

    public /* bridge */ /* synthetic */ Object call() {
        AnonymousClass1D6 r1;
        int width;
        int i;
        int A0B;
        C25006CTg cTg = this.A02;
        int i2 = this.A00;
        int i3 = this.A01;
        AnonymousClass0IV r6 = this.A03;
        DFL dfl = this.A05;
        Object obj = cTg.A04;
        synchronized (obj) {
            r1 = cTg.A08;
        }
        if (r1 == null) {
            List list = cTg.A06;
            ArrayList A14 = AnonymousClass000.A14(list);
            int size = list.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                long j = ((AnonymousClass0JN) cTg.A07.get(i5)).A00;
                AnonymousClass0OS r16 = C04220Mi.A04;
                Context context = cTg.A02;
                DOZ doz = cTg.A03;
                DOZ doz2 = doz;
                Context context2 = context;
                C04220Mi A032 = r16.A03(context2, (C04220Mi) cTg.A05.get(i5), (AnonymousClass0Jt) list.get(i5), doz2, cTg.A01, j);
                A14.add(A032);
                int i6 = cTg.A00;
                C04240Mk r0 = A032.A01;
                if (i6 == 1) {
                    A0B = BE8.A0A(r0);
                } else {
                    A0B = BE8.A0B(r0);
                }
                i4 = Math.max(i4, A0B);
            }
            r1 = AnonymousClass1D6.A00(A14, i4);
            synchronized (obj) {
                if (cTg.A08 == null) {
                    cTg.A08 = r1;
                }
            }
        }
        int A09 = C108955ca.A09(r1);
        C04220Mi r10 = (C04220Mi) ((List) r1.first).get(i2);
        Rect rect = r10.A01.A03.A03;
        if (i3 == 1) {
            width = rect.height();
        } else {
            width = rect.width();
        }
        if (width == A09) {
            return r10;
        }
        if (i3 == 1) {
            i = rect.width();
        } else {
            i = A09;
            A09 = rect.height();
        }
        long A012 = AnonymousClass0OH.A00.A01(i, i, A09, A09);
        AnonymousClass0OS r8 = C04220Mi.A04;
        Context context3 = r6.A02;
        AnonymousClass0Jt r11 = new AnonymousClass0Jt(dfl, (Object) null, (List) null);
        Object obj2 = r6.A03;
        CBx.A00((DOZ) obj2);
        return r8.A03(context3, r10, r11, obj2, r6.A01, A012);
    }
}
