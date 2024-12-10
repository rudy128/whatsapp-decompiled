package X;

import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: X.D8y  reason: case insensitive filesystem */
public final class C26675D8y implements E8W {
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    public boolean BgN() {
        return true;
    }

    public long BR1() {
        return this.A05;
    }

    public C25155Ca6 BYo(long j) {
        long[] jArr = this.A04;
        int A032 = Util.A03(jArr, j, true);
        long j2 = jArr[A032];
        long[] jArr2 = this.A03;
        C25781Cls cls = new C25781Cls(j2, jArr2[A032]);
        if (cls.A01 >= j || A032 == this.A00 - 1) {
            return new C25155Ca6(cls, cls);
        }
        int i = A032 + 1;
        return new C25155Ca6(cls, new C25781Cls(jArr[i], jArr2[i]));
    }

    public C26675D8y(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        int length = iArr.length;
        this.A00 = length;
        if (length > 0) {
            int i = length - 1;
            this.A05 = jArr2[i] + jArr3[i];
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ChunkIndex(length=");
        A10.append(this.A00);
        A10.append(", sizes=");
        A10.append(Arrays.toString(this.A01));
        A10.append(", offsets=");
        A10.append(Arrays.toString(this.A03));
        A10.append(", timeUs=");
        A10.append(Arrays.toString(this.A04));
        A10.append(", durationsUs=");
        A10.append(Arrays.toString(this.A02));
        return AnonymousClass8BU.A0q(A10);
    }
}
