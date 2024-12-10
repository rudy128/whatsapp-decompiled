package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.48x  reason: invalid class name and case insensitive filesystem */
public final class C825748x extends A34 {
    public final C139176yM A00;
    public final C85254Mr A01;

    public C825748x(C139176yM r2, C85254Mr r3) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        AnonymousClass8B2 r3 = null;
        C160878Ah A012 = this.A00.A01(C139176yM.A00((String) null, 1, false), false);
        for (int i = 0; i < A012.getCount() && r3 == null; i++) {
            r3 = A012.BUY(i);
        }
        return r3;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass4M3 r1;
        int A05;
        AnonymousClass8B2 r7 = (AnonymousClass8B2) obj;
        if (r7 == null) {
            AnonymousClass47X r2 = this.A01.A00;
            List list = C42011xT.A0I;
            r2.A00 = null;
            r1 = r2.A00;
            A05 = r2.A05();
        } else if (!this.A02.isCancelled()) {
            C85254Mr r0 = this.A01;
            AnonymousClass47X r5 = r0.A00;
            String str = r0.A01;
            List list2 = C42011xT.A0I;
            Context context = r5.A0H.getContext();
            C96094nI r22 = new C96094nI(r7, r5, AnonymousClass3MW.A05(r5.A02).getDimensionPixelSize(2131166893));
            C96114nK r12 = new C96114nK(context, r22, r5, str);
            r5.A05.setTag(r22);
            r5.A04.A02(r22, r12);
            r1 = r5.A00;
            A05 = r5.A05();
        } else {
            return;
        }
        r1.A00.remove(Integer.valueOf(A05));
    }
}
