package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.D8f  reason: case insensitive filesystem */
public class C26656D8f implements EAG {
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C25215CbB A07;

    public C26656D8f(C25215CbB cbB, int i, int i2, int i3, int i4, int i5) {
        A00(i3, 0, "bufferForPlaybackMs", "0");
        A00(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        A00(i, i3, "minBufferMs", "bufferForPlaybackMs");
        A00(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        A00(i2, i, "maxBufferMs", "minBufferMs");
        A00(0, 0, "backBufferDurationMs", "0");
        this.A07 = cbB;
        this.A06 = Util.A04((long) i);
        this.A05 = Util.A04((long) i2);
        this.A04 = Util.A04((long) i3);
        this.A03 = Util.A04((long) i4);
        this.A02 = i5;
        this.A00 = i5 == -1 ? 13107200 : i5;
    }

    public void C1Z() {
        A01(false);
    }

    public void C2x() {
        A01(true);
    }

    public void C78() {
        A01(true);
    }

    public void CJt(long j, long j2) {
    }

    private void A01(boolean z) {
        int i = this.A02;
        if (i == -1) {
            i = 13107200;
        }
        this.A00 = i;
        this.A01 = false;
        if (z) {
            C25215CbB cbB = this.A07;
            synchronized (cbB) {
                cbB.A02(0);
            }
        }
    }

    public C25215CbB BMx() {
        return this.A07;
    }

    public long BNH() {
        return 0;
    }

    public void C94(C26539D3a d3a, ECg[] eCgArr, C28650ECj[] eCjArr) {
        int i = this.A02;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < eCgArr.length; i3++) {
                if (eCjArr[i3] != null) {
                    int i4 = eCgArr[i3].A0B;
                    int i5 = 13107200;
                    if (i4 != 1) {
                        i5 = 131072000;
                        if (i4 != 2) {
                            i5 = A7Y.A0F;
                        }
                    }
                    i2 += i5;
                }
            }
            i = Math.max(13107200, i2);
        }
        this.A00 = i;
        this.A07.A02(i);
    }

    public boolean CG3() {
        return false;
    }

    public boolean CLn(float f, long j, long j2, boolean z) {
        boolean z2 = true;
        boolean A1C = C108975cc.A1C(this.A07.A00(), this.A00);
        long j3 = this.A06;
        if (f > 1.0f) {
            if (f != 1.0f) {
                j3 = Math.round(((double) j3) * ((double) f));
            }
            j3 = Math.min(j3, this.A05);
        }
        if (j < Math.max(j3, 500000)) {
            if (A1C) {
                z2 = false;
            }
            this.A01 = z2;
            if (!z2 && j < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= this.A05 || A1C) {
            this.A01 = false;
        }
        return this.A01;
    }

    public boolean CMR(float f, long j, boolean z, boolean z2) {
        long j2;
        if (f != 1.0f) {
            j = Math.round(((double) j) / ((double) f));
        }
        if (z) {
            j2 = this.A03;
        } else {
            j2 = this.A04;
        }
        if (j2 <= 0 || j >= j2 || this.A07.A00() >= this.A00) {
            return true;
        }
        return false;
    }

    public static void A00(int i, int i2, String str, String str2) {
        boolean A1C = C108975cc.A1C(i, i2);
        String A1H = AnonymousClass001.A1H(" cannot be less than ", str2, AnonymousClass000.A11(str));
        if (!A1C) {
            throw BE8.A0W(A1H);
        }
    }

    public C26656D8f() {
        this(new C25215CbB(65536), 50000, 50000, 2500, 5000, -1);
    }
}
