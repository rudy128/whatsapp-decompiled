package X;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.D7e  reason: case insensitive filesystem */
public class C26631D7e implements C28645ECd, E3k {
    public boolean A00;
    public final C38631rd A01;
    public final Path A02 = C108945cZ.A0L();
    public final C25042CUw A03 = new C25042CUw();
    public final AnonymousClass29I A04;
    public final boolean A05;

    public void C9s() {
        this.A00 = false;
        this.A01.invalidateSelf();
    }

    public void CIY(List list, List list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            E7G e7g = (E7G) list.get(i);
            if ((e7g instanceof D7c) && ((D7c) e7g).A03 == AnonymousClass00R.A00) {
                D7c d7c = (D7c) e7g;
                this.A03.A00.add(d7c);
                d7c.A04.add(this);
            } else if (e7g instanceof D7b) {
                if (arrayList == null) {
                    arrayList = AnonymousClass000.A13();
                }
                arrayList.add(e7g);
            }
        }
        this.A04.A00 = arrayList;
    }

    public Path BWP() {
        boolean z = this.A00;
        Path path = this.A02;
        if (!z) {
            path.reset();
            if (!this.A05) {
                Path path2 = (Path) this.A04.A05();
                if (path2 != null) {
                    path.set(path2);
                    path.setFillType(Path.FillType.EVEN_ODD);
                    this.A03.A00(path);
                }
            }
            this.A00 = true;
        }
        return path;
    }

    public C26631D7e(C38631rd r3, C40801vI r4, C26642D7p d7p) {
        this.A05 = r4.A02;
        this.A01 = r3;
        AnonymousClass29I r0 = new AnonymousClass29I(r4.A00.A00);
        this.A04 = r0;
        d7p.A0C(r0);
        r0.A0A(this);
    }

    public String getName() {
        throw AnonymousClass04E.createAndThrow();
    }
}
