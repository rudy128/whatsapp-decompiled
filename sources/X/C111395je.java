package X;

import java.util.List;

/* renamed from: X.5je  reason: invalid class name and case insensitive filesystem */
public class C111395je extends C24490C6i {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        List list = this.A01;
        boolean z = ((AnonymousClass6nH) list.get(i)).A00;
        List list2 = this.A00;
        if (z == ((AnonymousClass6nH) list2.get(i2)).A00 && ((AnonymousClass6nH) list.get(i)).A01 == ((AnonymousClass6nH) list2.get(i2)).A01 && ((AnonymousClass6nH) list.get(i)).A02 == ((AnonymousClass6nH) list2.get(i2)).A02) {
            return true;
        }
        return false;
    }

    public boolean A04(int i, int i2) {
        AEX aex = ((AnonymousClass6nH) this.A01.get(i)).A03;
        AEX aex2 = ((AnonymousClass6nH) this.A00.get(i2)).A03;
        if (aex == null) {
            if (aex2 != null) {
                return false;
            }
            return true;
        } else if (aex2 != null) {
            return aex.A0F.equals(aex2.A0F);
        }
        return false;
    }

    public C111395je(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
