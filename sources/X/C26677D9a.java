package X;

import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.D9a  reason: case insensitive filesystem */
public class C26677D9a implements E91 {
    public final long[] A00;
    public final C26009CqQ[] A01;

    public long BRP(int i) {
        boolean z = true;
        C26056CrS.A02(AnonymousClass000.A1Q(i));
        long[] jArr = this.A00;
        if (i >= jArr.length) {
            z = false;
        }
        C26056CrS.A02(z);
        return jArr[i];
    }

    public List BPm(long j) {
        C26009CqQ cqQ;
        int A03 = Util.A03(this.A00, j, false);
        if (A03 == -1 || (cqQ = this.A01[A03]) == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(cqQ);
    }

    public int BRQ() {
        return this.A00.length;
    }

    public int BVM(long j) {
        long[] jArr = this.A00;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] != j);
        }
        if (binarySearch >= jArr.length) {
            return -1;
        }
        return binarySearch;
    }

    public C26677D9a(long[] jArr, C26009CqQ[] cqQArr) {
        this.A01 = cqQArr;
        this.A00 = jArr;
    }
}
