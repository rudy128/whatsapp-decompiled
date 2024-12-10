package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Np  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C146047Np implements AnonymousClass88N {
    public final /* synthetic */ C129726iG A00;
    public final /* synthetic */ AnonymousClass70X A01;

    public final void BwB(boolean z) {
        int i;
        C129726iG r1 = this.A00;
        AnonymousClass70X r0 = this.A01;
        C127396eH r7 = r1.A02;
        int A05 = r0.A05();
        if (!z && (i = r7.A00) != -1) {
            int i2 = A05;
            List list = r7.A01.A00;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C134736r4 r12 = (C134736r4) it.next();
                int i3 = r12.A01;
                if (i2 >= i3 - 1) {
                    int i4 = r12.A00;
                    if (i <= i4 + 1) {
                        i = Math.min(i, i3);
                        i2 = Math.max(i2, i4);
                        it.remove();
                    }
                }
            }
            list.add(new C134736r4(i, i2));
        }
        r7.A00 = A05;
    }

    public /* synthetic */ C146047Np(C129726iG r1, AnonymousClass70X r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
