package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.List;

public abstract class BP5 extends CPF {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final List A04;

    public BP5(C25200Car car, List list, int i, long j, long j2, long j3, long j4, long j5) {
        super(car, j, j2);
        this.A03 = j3;
        this.A01 = j4;
        this.A04 = list;
        this.A00 = i;
        this.A02 = j5;
    }

    public final long A00(long j) {
        long j2;
        List list = this.A04;
        long j3 = j - this.A03;
        if (list != null) {
            j2 = A01((int) j3).A04 - this.A00;
        } else {
            j2 = j3 * this.A01;
        }
        return Util.A06(j2, SearchActionVerificationClientService.MS_TO_NS, this.A01);
    }

    public CX5 A01(int i) {
        int i2;
        int i3 = i;
        int i4 = this.A00;
        List list = this.A04;
        if (i4 == list.size()) {
            if (i3 >= i4) {
                i3 = i4 - 1;
                Log.w("SegmentTemplate", "index was past bounds of the list, so clamping to final element");
            }
            return (CX5) list.get(i3);
        }
        int A022 = AnonymousClass3MX.A02(list, 1);
        int i5 = i + ((CX5) list.get(0)).A01;
        int i6 = 0;
        while (i6 <= A022) {
            int i7 = (i6 + A022) / 2;
            CX5 cx5 = (CX5) list.get(i7);
            int i8 = cx5.A01;
            int i9 = cx5.A02 + i8;
            if (i9 <= i5) {
                i6 = i7 + 1;
            } else if (i9 > i5 && i7 != 0 && i8 > i5) {
                A022 = i7 - 1;
            } else if (i9 <= i5 || (i7 != 0 && i8 > i5)) {
                throw BE6.A0l("Segment Index out of Segment Timeline bounds");
            } else {
                long j = cx5.A04;
                long j2 = cx5.A03;
                int i10 = cx5.A01;
                int i11 = i5 - i10;
                return new CX5(1, i10, (cx5.A00 - (cx5.A02 - 1)) + i11, j + (j2 * ((long) i11)), j2, cx5.A05);
            }
        }
        Object[] A1a = BE6.A1a();
        C17880vN.A1T(A1a, i5, 0);
        int i12 = -1;
        if (list.size() > 0) {
            i2 = ((CX5) list.get(0)).A01;
        } else {
            i2 = -1;
        }
        C17880vN.A1T(A1a, i2, 1);
        if (list.size() > 0) {
            i12 = ((CX5) list.get(AnonymousClass3MX.A02(list, 1))).A01;
        }
        C17880vN.A1T(A1a, i12, 2);
        C17890vO.A1G(A1a, list.size());
        BE7.A1M("Search Fail; Index: %d, Start relative index: %d, End relative index: %d, Segment Timeline Size: %d", "SegmentTemplate", A1a);
        throw BE6.A0l("Segment Index out of Segment Timeline bounds");
    }
}
