package X;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.facebook.android.exoplayer2.util.Util;
import java.lang.reflect.Method;

/* renamed from: X.CkV  reason: case insensitive filesystem */
public final class C25700CkV {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public AudioTrack A0G;
    public C25592CiX A0H;
    public Method A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final C24758CIv A0M;
    public final long[] A0N;

    public static long A00(C25700CkV ckV) {
        AudioTrack audioTrack = ckV.A0G;
        C26056CrS.A01(audioTrack);
        long j = ckV.A0F;
        if (j != -9223372036854775807L) {
            return Math.min(ckV.A05, ckV.A0E + BE8.A0F((SystemClock.elapsedRealtime() * 1000) - j, (long) ckV.A02));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long A0C2 = BE7.A0C(audioTrack.getPlaybackHeadPosition());
        if (ckV.A0L) {
            if (playState == 2 && A0C2 == 0) {
                ckV.A0B = ckV.A09;
            }
            A0C2 += ckV.A0B;
        }
        if (Util.A00 <= 29) {
            if (A0C2 == 0) {
                long j2 = ckV.A09;
                if (j2 > 0 && playState == 3) {
                    if (ckV.A06 == -9223372036854775807L) {
                        ckV.A06 = SystemClock.elapsedRealtime();
                    }
                    return j2;
                }
            }
            ckV.A06 = -9223372036854775807L;
        }
        if (ckV.A09 > A0C2) {
            ckV.A0C++;
        }
        ckV.A09 = A0C2;
        return A0C2 + (ckV.A0C << 32);
    }

    public C25700CkV(C24758CIv cIv) {
        this.A0M = cIv;
        try {
            this.A0I = AudioTrack.class.getMethod("getLatency", (Class[]) null);
        } catch (NoSuchMethodException unused) {
        }
        this.A0N = new long[10];
    }

    public boolean A01(long j) {
        if (j > A00(this)) {
            return true;
        }
        if (!this.A0L) {
            return false;
        }
        AudioTrack audioTrack = this.A0G;
        C26056CrS.A01(audioTrack);
        if (audioTrack.getPlayState() == 2 && A00(this) == 0) {
            return true;
        }
        return false;
    }
}
