package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.7PX  reason: invalid class name */
public class AnonymousClass7PX implements Comparable {
    public final long A00;
    public final long A01;
    public final long A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass1BI A04;
    public final String A05;

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A04;
        objArr[1] = this.A05;
        objArr[2] = Long.valueOf(this.A01);
        C17890vO.A1O(objArr, this.A02);
        return AnonymousClass000.A0P(Long.valueOf(this.A00), objArr, 4);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass7PX r8 = (AnonymousClass7PX) obj;
        AnonymousClass11S r0 = this.A03;
        AnonymousClass1BI r6 = this.A04;
        boolean A0O = r0.A0O(r6);
        AnonymousClass1BI r5 = r8.A04;
        if (A0O == r0.A0O(r5)) {
            int i = (this.A02 > r8.A02 ? 1 : (this.A02 == r8.A02 ? 0 : -1));
            if (i != 0) {
                return i;
            }
            int compareTo = r6.compareTo((Jid) r5);
            if (compareTo == 0) {
                return (this.A00 > r8.A00 ? 1 : (this.A00 == r8.A00 ? 0 : -1));
            }
            return compareTo;
        } else if (A0O) {
            return 1;
        } else {
            return -1;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass7PX)) {
            return false;
        }
        AnonymousClass7PX r7 = (AnonymousClass7PX) obj;
        if (this.A01 == r7.A01 && this.A02 == r7.A02 && this.A00 == r7.A00 && this.A04.equals(r7.A04) && C42171xk.A00(this.A05, r7.A05)) {
            return true;
        }
        return false;
    }

    public AnonymousClass7PX(AnonymousClass11S r1, AnonymousClass1BI r2, String str, long j, long j2, long j3) {
        this.A03 = r1;
        this.A04 = r2;
        this.A05 = str;
        this.A01 = j;
        this.A02 = j2;
        this.A00 = j3;
    }
}
