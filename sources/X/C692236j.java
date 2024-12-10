package X;

import com.whatsapp.jid.Jid;
import java.util.Set;

/* renamed from: X.36j  reason: invalid class name and case insensitive filesystem */
public final class C692236j implements AnonymousClass25D {
    public int A00 = 3;
    public AnonymousClass77N A01;
    public AnonymousClass6RJ A02;
    public AnonymousClass77K A03;
    public Set A04;
    public Set A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C18070vi.A18(cls2, cls)) {
            return false;
        }
        C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.protocol.StatusData");
        C692236j r4 = (C692236j) obj;
        return C18070vi.A18(this.A03, r4.A03) && this.A00 == r4.A00 && this.A09 == r4.A09 && C18070vi.A18(this.A05, r4.A05) && this.A07 == r4.A07 && this.A06 == r4.A06 && this.A08 == r4.A08 && C18070vi.A18(this.A04, r4.A04);
    }

    public final void A00(AnonymousClass77K r2) {
        if (r2 != null) {
            this.A00 = r2.A00;
        } else {
            r2 = null;
        }
        this.A03 = r2;
    }

    public final boolean A01() {
        Jid jid;
        Set set = this.A04;
        if (set == null || set.size() != 1) {
            return false;
        }
        Set set2 = this.A04;
        if (set2 != null) {
            jid = (Jid) C29431cG.A0X(set2);
        } else {
            jid = null;
        }
        if (!C22971Dz.A0e(jid)) {
            return true;
        }
        return false;
    }

    public final boolean A02() {
        Set set = this.A04;
        if ((set == null || set.isEmpty()) && !this.A09) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        objArr[0] = this.A03;
        AnonymousClass000.A1M(objArr, this.A00);
        objArr[2] = Boolean.valueOf(this.A09);
        objArr[3] = this.A05;
        objArr[4] = Boolean.valueOf(this.A07);
        objArr[5] = Boolean.valueOf(this.A06);
        objArr[6] = Boolean.valueOf(this.A08);
        objArr[7] = this.A04;
        return AnonymousClass000.A0P(this.A02, objArr, 8);
    }
}
