package X;

import android.content.Context;
import android.media.MediaCodec;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: X.DHd  reason: case insensitive filesystem */
public class C26872DHd implements EAX {
    public final Context A00;
    public final MediaCodec.BufferInfo A01;
    public final E7q A02;
    public final C25820CmX A03;
    public final EAM A04;
    public final CUT A05;
    public final ByteBuffer A06;
    public final ExecutorService A07;
    public final boolean A08;
    public final boolean A09;
    public final byte[] A0A = new byte[7];
    public volatile CL2 A0B;
    public volatile boolean A0C;
    public volatile Future A0D;

    public void BBA(MediaEffect mediaEffect) {
    }

    public void BBq(int i) {
    }

    public void BJ1(long j) {
    }

    public void CEh(MediaEffect mediaEffect) {
    }

    public void CF6() {
    }

    public void CFD(long j) {
    }

    public void CNe(C25674Ck5 ck5, int i) {
        if (!this.A0C || !this.A05.A08.A01()) {
            C24322BzJ bzJ = C24322BzJ.AUDIO;
            this.A0D = this.A07.submit(new C27124DVl(ck5, this, i, 0, C25327CdY.A00(this.A00, this.A02, bzJ, this.A05)));
        }
    }

    public void cancel() {
        this.A0C = true;
        if (this.A0D != null) {
            if (!this.A0D.isDone() && !this.A05.A08.A01()) {
                this.A0D.cancel(true);
            }
            try {
                this.A0D.get();
            } catch (Throwable unused) {
            }
        }
        release();
    }

    public boolean BeK() {
        if (this.A0D == null || !this.A0D.isDone()) {
            return false;
        }
        this.A0D.get();
        return true;
    }

    public boolean CNM() {
        DH2 A002 = this.A0B.A00.A00(5000);
        if (A002 == null) {
            return false;
        }
        A002.CI8(0, 0, 4);
        this.A0B.A00.A03(A002);
        return true;
    }

    public void CRz() {
        if (this.A0D != null) {
            this.A0D.get();
        }
    }

    public void flush() {
        C25265Cc6 cc6 = this.A0B.A00;
        StringBuilder sb = cc6.A07;
        sb.append("flushB,");
        cc6.A04.flush();
        sb.append("flushE,");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Cjg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.Cjg, java.lang.Object] */
    public void release() {
        ? obj = new Object();
        try {
            CL2 cl2 = this.A0B;
            ? obj2 = new Object();
            BVu.A00(obj2, cl2.A00, 9);
            Throwable th = obj2.A01;
            if (th != null) {
                throw th;
            }
        } catch (Throwable th2) {
            C25650Cjg.A00(obj, th2);
        }
        Throwable th3 = obj.A01;
        if (th3 != null) {
            throw th3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r1 != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26872DHd(android.content.Context r3, X.E7q r4, X.C25820CmX r5, X.C28564E7r r6, X.C24864CNh r7, X.CUT r8, java.lang.String r9, java.util.concurrent.ExecutorService r10) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 7
            byte[] r0 = new byte[r0]
            r2.A0A = r0
            r2.A03 = r5
            r2.A05 = r8
            r2.A07 = r10
            r2.A02 = r4
            r2.A00 = r3
            boolean r1 = r6.CLg()
            r2.A08 = r1
            java.lang.String r0 = ".aac"
            boolean r0 = r9.endsWith(r0)
            r2.A09 = r0
            if (r0 != 0) goto L_0x0025
            r0 = 0
            if (r1 == 0) goto L_0x0032
        L_0x0025:
            r0 = 1048576(0x100000, float:1.469368E-39)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r2.A06 = r0
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo
            r0.<init>()
        L_0x0032:
            r2.A01 = r0
            X.EAM r0 = r6.BHa(r7)
            r2.A04 = r0
            r0.BFZ(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26872DHd.<init>(android.content.Context, X.E7q, X.CmX, X.E7r, X.CNh, X.CUT, java.lang.String, java.util.concurrent.ExecutorService):void");
    }
}
