package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.5jk  reason: invalid class name and case insensitive filesystem */
public final class C111455jk extends C24490C6i {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public Object A02(int i, int i2) {
        AnonymousClass8B2 r1;
        Uri A09 = C108975cc.A09(this.A01, i);
        List list = this.A00;
        if (!C18070vi.A18(A09, C108975cc.A09(list, i2))) {
            r1 = (AnonymousClass8B2) list.get(i2);
        } else {
            r1 = null;
        }
        return new C134346qR(r1);
    }

    public boolean A03(int i, int i2) {
        if (this.A00.size() == this.A01.size() && i == i2) {
            return true;
        }
        return false;
    }

    public boolean A04(int i, int i2) {
        return C18070vi.A18(C108975cc.A09(this.A01, i), C108975cc.A09(this.A00, i2));
    }

    public C111455jk(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
