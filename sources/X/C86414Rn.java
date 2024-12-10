package X;

import android.view.View;
import android.view.animation.AnimationUtils;
import java.util.TreeSet;

/* renamed from: X.4Rn  reason: invalid class name and case insensitive filesystem */
public final class C86414Rn {
    public final AnonymousClass4XJ A00;
    public final TreeSet A01 = new TreeSet();

    public final void A01(Class cls, boolean z) {
        C18070vi.A0d(cls, 0);
        C98524rI A002 = this.A00.A00(cls);
        if (A002 != null) {
            int i = A002.A00;
            C98524rI A003 = A00();
            if (!C18070vi.A18(A003, A002) && A002.A08()) {
                if (A003 != null) {
                    if (C18070vi.A00(i, A003.A00) < 0) {
                        C98524rI A004 = A00();
                        if (A004 != null) {
                            A004.Bcw(new C94404kZ(0), false);
                        }
                    } else {
                        this.A01.add(A002);
                        return;
                    }
                }
                this.A01.add(A002);
                A002.A05();
                View A04 = A002.A04();
                if (z && A04 != null) {
                    A04.startAnimation(AnimationUtils.loadAnimation(A04.getContext(), 2130772004));
                }
            }
        }
    }

    public final C98524rI A00() {
        TreeSet treeSet = this.A01;
        if (treeSet.isEmpty()) {
            return null;
        }
        return (C98524rI) treeSet.first();
    }

    public C86414Rn(AnonymousClass4XJ r2) {
        this.A00 = r2;
    }
}
