package X;

import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.Cao  reason: case insensitive filesystem */
public final class C25197Cao {
    public int A00;
    public long A01;
    public C25497Cgs A02 = C25497Cgs.A01;
    public Object A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            C25197Cao cao = (C25197Cao) obj;
            if (!Util.A0D(this.A03, cao.A03) || this.A00 != cao.A00 || this.A01 != cao.A01 || !Util.A0D(this.A02, cao.A02)) {
                return false;
            }
        }
        return true;
    }

    public int A00(long j) {
        int length;
        C25497Cgs cgs = this.A02;
        int i = 0;
        while (true) {
            long[] jArr = cgs.A00;
            length = jArr.length;
            if (i >= length) {
                break;
            }
            long j2 = jArr[i];
            if (j2 == Long.MIN_VALUE) {
                break;
            } else if (j < j2) {
                throw AnonymousClass000.A0s("hasUnplayedAds");
            } else {
                i++;
            }
        }
        if (i >= length) {
            return -1;
        }
        return i;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, BE8.A09(0, BE8.A09(this.A01, (((6727 + C17880vN.A02(this.A03)) * 31) + this.A00) * 31)) * 31);
    }
}
