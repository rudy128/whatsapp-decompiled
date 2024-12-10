package X;

import com.facebook.android.exoplayer2.util.Util;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

public class D90 implements E8W, E8Y {
    public long A00 = -1;
    public long[] A01;
    public long[] A02;
    public long A03 = -1;
    public final /* synthetic */ C22770BOj A04;

    public E8W BHo() {
        return this;
    }

    public boolean BgN() {
        return true;
    }

    public D90(C22770BOj bOj) {
        this.A04 = bOj;
    }

    public long BR1() {
        CSF csf = this.A04.A00;
        return (csf.A04 * SearchActionVerificationClientService.MS_TO_NS) / ((long) csf.A03);
    }

    public C25155Ca6 BYo(long j) {
        C22770BOj bOj = this.A04;
        int A032 = Util.A03(this.A01, BE8.A0F((long) bOj.A00, j), true);
        long[] jArr = this.A01;
        long j2 = jArr[A032] * SearchActionVerificationClientService.MS_TO_NS;
        long j3 = (long) bOj.A00;
        long j4 = j2 / j3;
        long j5 = this.A00;
        long[] jArr2 = this.A02;
        C25781Cls cls = new C25781Cls(j4, j5 + jArr2[A032]);
        if (j4 >= j || A032 == jArr.length - 1) {
            return new C25155Ca6(cls, cls);
        }
        int i = A032 + 1;
        return new C25155Ca6(cls, new C25781Cls((jArr[i] * SearchActionVerificationClientService.MS_TO_NS) / j3, j5 + jArr2[i]));
    }

    public long CDL(C26036Cqw cqw) {
        long j = this.A03;
        if (j < 0) {
            return -1;
        }
        long j2 = -(j + 2);
        this.A03 = -1;
        return j2;
    }

    public void COF(long j) {
        this.A03 = this.A01[Util.A03(this.A01, j, true)];
    }
}
