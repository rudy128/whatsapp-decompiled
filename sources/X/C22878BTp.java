package X;

import android.graphics.Canvas;
import android.os.Build;
import java.util.Collection;
import java.util.List;

/* renamed from: X.BTp  reason: case insensitive filesystem */
public final class C22878BTp extends C3J implements C28554E7f {
    public final long A00;
    public final BU3 A01;
    public final List A02;
    public final boolean A03;
    public final BUD A04;

    public void BJL(Canvas canvas, C25741ClB clB) {
        C18070vi.A0d(clB, 1);
        clB.A01(this.A04, new C28070Dqk(canvas, clB, this));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22878BTp) {
                C22878BTp bTp = (C22878BTp) obj;
                if (!C18070vi.A18(this.A04, bTp.A04) || this.A00 != bTp.A00 || !C18070vi.A18(this.A01, bTp.A01) || this.A03 != bTp.A03 || !C18070vi.A18(this.A02, bTp.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public boolean BkE() {
        List<C28554E7f> list = this.A02;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C28554E7f BkE : list) {
            if (BkE.BkE()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass0DV.A00((AnonymousClass001.A0K(this.A00, AnonymousClass000.A0L(this.A04)) + AnonymousClass001.A0k(this.A01)) * 31, this.A03));
    }

    public C22878BTp(BU3 bu3, BUD bud, List list, long j, boolean z) {
        this.A04 = bud;
        this.A00 = j;
        this.A01 = bu3;
        this.A03 = z;
        this.A02 = list;
    }
}
