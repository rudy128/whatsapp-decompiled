package X;

import android.graphics.Canvas;
import android.os.Build;
import java.util.Collection;
import java.util.List;

/* renamed from: X.BTq  reason: case insensitive filesystem */
public final class C22879BTq extends C3J implements C28554E7f {
    public final float A00;
    public final int A01;
    public final long A02;
    public final BU3 A03;
    public final List A04;
    public final BUD A05;

    public void BJL(Canvas canvas, C25741ClB clB) {
        C18070vi.A0d(clB, 1);
        clB.A01(this.A05, new C28071Dql(canvas, clB, this));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22879BTq) {
                C22879BTq bTq = (C22879BTq) obj;
                if (!C18070vi.A18(this.A05, bTq.A05) || this.A02 != bTq.A02 || !C18070vi.A18(this.A03, bTq.A03) || Float.compare(this.A00, bTq.A00) != 0 || this.A01 != bTq.A01 || !C18070vi.A18(this.A04, bTq.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public boolean BkE() {
        int i = this.A01;
        List<C28554E7f> list = this.A04;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        if (i == 16 || i == 17 || i == 15) {
            return true;
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
        int A0L = AnonymousClass000.A0L(this.A05);
        return AnonymousClass000.A0O(this.A04, (AnonymousClass000.A0B((AnonymousClass001.A0K(this.A02, A0L) + AnonymousClass001.A0k(this.A03)) * 31, this.A00) + this.A01) * 31);
    }

    public C22879BTq(BU3 bu3, BUD bud, List list, float f, int i, long j) {
        this.A05 = bud;
        this.A02 = j;
        this.A03 = bu3;
        this.A00 = f;
        this.A01 = i;
        this.A04 = list;
    }
}
