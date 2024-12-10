package X;

import java.net.InetAddress;
import java.util.Locale;

/* renamed from: X.2mm  reason: invalid class name and case insensitive filesystem */
public final class C59722mm {
    public final int A00;
    public final Long A01;
    public final Short A02;
    public final InetAddress A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C59722mm)) {
            return false;
        }
        C59722mm r4 = (C59722mm) obj;
        Long l = this.A01;
        Long l2 = r4.A01;
        if (l != l2 && (l == null || !l.equals(l2))) {
            return false;
        }
        InetAddress inetAddress = this.A03;
        InetAddress inetAddress2 = r4.A03;
        if (inetAddress != inetAddress2 && (inetAddress == null || !inetAddress.equals(inetAddress2))) {
            return false;
        }
        Short sh = this.A02;
        Short sh2 = r4.A02;
        return sh == sh2 || (sh != null && sh.equals(sh2));
    }

    public int hashCode() {
        int i = 0;
        int A0l = (((41 + AnonymousClass001.A0l(this.A01)) * 41) + AnonymousClass001.A0l(this.A03)) * 41;
        Short sh = this.A02;
        if (sh != null) {
            i = sh.hashCode();
        }
        return A0l + i;
    }

    public String toString() {
        return String.format(Locale.US, "%s:%d EXPIRE: %tc", new Object[]{this.A03, this.A02, this.A01});
    }

    public C59722mm(Long l, Short sh, InetAddress inetAddress, int i, boolean z, boolean z2) {
        this.A01 = l;
        this.A03 = inetAddress;
        this.A02 = sh;
        this.A05 = z;
        this.A04 = z2;
        this.A00 = i;
    }
}
