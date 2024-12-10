package X;

import android.media.AudioTrack;

/* renamed from: X.CiX  reason: case insensitive filesystem */
public final class C25592CiX {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final CSE A05;

    public static void A00(C25592CiX ciX, int i) {
        ciX.A00 = i;
        long j = 5000;
        if (i == 0) {
            ciX.A03 = 0;
            ciX.A01 = -1;
            ciX.A02 = C17880vN.A04(System.nanoTime());
        } else if (i != 1) {
            j = (i == 2 || i == 3) ? 10000000 : 500000;
        }
        ciX.A04 = j;
    }

    public C25592CiX(AudioTrack audioTrack) {
        this.A05 = new CSE(audioTrack);
        A00(this, 0);
    }
}
