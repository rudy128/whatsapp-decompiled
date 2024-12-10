package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;

public final class D99 implements C28610EAe {
    public int A00 = 0;
    public boolean A01;
    public final MediaCodec A02;
    public final C26124Csm A03;
    public final BFS A04;
    public final boolean A05;

    public void BFa(MediaCrypto mediaCrypto, MediaFormat mediaFormat, Surface surface) {
        BFS bfs = this.A04;
        MediaCodec mediaCodec = this.A02;
        bfs.A02(mediaCodec);
        C25304Cd8.A01("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        C25304Cd8.A00();
        C26124Csm csm = this.A03;
        if (!csm.A01) {
            csm.A00 = new C22618BFz(BE7.A0G(csm.A03), csm, 2);
            csm.A01 = true;
        }
    }

    public void CEK(int i) {
        this.A02.releaseOutputBuffer(i, false);
    }

    public void release() {
        try {
            if (this.A00 == 1) {
                C26124Csm csm = this.A03;
                if (csm.A01) {
                    csm.A02();
                    csm.A03.quit();
                }
                csm.A01 = false;
                BFS bfs = this.A04;
                synchronized (bfs.A09) {
                    bfs.A05 = true;
                    bfs.A07.quit();
                    BFS.A00(bfs);
                }
            }
            this.A00 = 2;
            if (!this.A01) {
                this.A02.release();
                this.A01 = true;
            }
        } catch (Throwable th) {
            if (!this.A01) {
                this.A02.release();
                this.A01 = true;
            }
            throw th;
        }
    }

    private void A00() {
        if (this.A05) {
            try {
                C26124Csm.A01(this.A03);
            } catch (InterruptedException e) {
                AnonymousClass8BS.A0x();
                throw new IllegalStateException(e);
            }
        }
    }

    public int BIQ() {
        return this.A02.dequeueInputBuffer(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BIT(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            X.BFS r5 = r9.A04
            java.lang.Object r1 = r5.A09
            monitor-enter(r1)
            long r6 = r5.A00     // Catch:{ all -> 0x006b }
            r2 = 0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0068
            boolean r0 = r5.A05     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0068
            java.lang.IllegalStateException r2 = r5.A04     // Catch:{ all -> 0x006b }
            if (r2 != 0) goto L_0x0064
            android.media.MediaCodec$CodecException r2 = r5.A01     // Catch:{ all -> 0x006b }
            if (r2 != 0) goto L_0x0060
            X.CWq r6 = r5.A08     // Catch:{ all -> 0x006b }
            int r4 = r6.A01     // Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x0068
            int[] r2 = r6.A04     // Catch:{ all -> 0x006b }
            int r0 = r6.A00     // Catch:{ all -> 0x006b }
            r2 = r2[r0]     // Catch:{ all -> 0x006b }
            int r3 = r0 + 1
            int r0 = r6.A03     // Catch:{ all -> 0x006b }
            r3 = r3 & r0
            r6.A00 = r3     // Catch:{ all -> 0x006b }
            int r0 = r4 + -1
            r6.A01 = r0     // Catch:{ all -> 0x006b }
            if (r2 < 0) goto L_0x0033
            goto L_0x0041
        L_0x0033:
            r0 = -2
            if (r2 != r0) goto L_0x0059
            java.util.ArrayDeque r0 = r5.A0B     // Catch:{ all -> 0x006b }
            java.lang.Object r0 = r0.remove()     // Catch:{ all -> 0x006b }
            android.media.MediaFormat r0 = (android.media.MediaFormat) r0     // Catch:{ all -> 0x006b }
            r5.A02 = r0     // Catch:{ all -> 0x006b }
            goto L_0x0059
        L_0x0041:
            android.media.MediaFormat r0 = r5.A02     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x005b
            java.util.ArrayDeque r0 = r5.A0A     // Catch:{ all -> 0x006b }
            java.lang.Object r0 = r0.remove()     // Catch:{ all -> 0x006b }
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch:{ all -> 0x006b }
            int r4 = r0.offset     // Catch:{ all -> 0x006b }
            int r5 = r0.size     // Catch:{ all -> 0x006b }
            long r6 = r0.presentationTimeUs     // Catch:{ all -> 0x006b }
            int r8 = r0.flags     // Catch:{ all -> 0x006b }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ all -> 0x006b }
        L_0x0059:
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            return r2
        L_0x005b:
            java.lang.IllegalStateException r0 = X.BE6.A0k()     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x006b }
        L_0x0060:
            r0 = 0
            r5.A01 = r0     // Catch:{ all -> 0x006b }
            goto L_0x0067
        L_0x0064:
            r0 = 0
            r5.A04 = r0     // Catch:{ all -> 0x006b }
        L_0x0067:
            throw r2     // Catch:{ all -> 0x006b }
        L_0x0068:
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            r2 = -1
            return r2
        L_0x006b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D99.BIT(android.media.MediaCodec$BufferInfo):int");
    }

    public ByteBuffer BT3(int i) {
        return this.A02.getInputBuffer(i);
    }

    public ByteBuffer BVs(int i) {
        return this.A02.getOutputBuffer(i);
    }

    public MediaFormat BVu() {
        MediaFormat mediaFormat;
        BFS bfs = this.A04;
        synchronized (bfs.A09) {
            mediaFormat = bfs.A02;
            if (mediaFormat == null) {
                throw BE6.A0k();
            }
        }
        return mediaFormat;
    }

    public void CDD(int i, int i2, long j, int i3) {
        C26124Csm csm = this.A03;
        Throwable th = (Throwable) csm.A05.getAndSet((Object) null);
        if (th == null) {
            CSI A002 = C26124Csm.A00();
            A002.A01 = i;
            A002.A02 = i2;
            A002.A03 = j;
            A002.A00 = i3;
            BE7.A18(csm.A00, A002, 0);
            return;
        }
        throw th;
    }

    public void CDE(C25016CTs cTs, int i, long j) {
        this.A03.A03(cTs, i, j);
    }

    public void CEI(int i, long j) {
        this.A02.releaseOutputBuffer(i, j);
    }

    public void flush() {
        this.A03.A02();
        MediaCodec mediaCodec = this.A02;
        mediaCodec.flush();
        BFS bfs = this.A04;
        synchronized (bfs.A09) {
            bfs.A00++;
            bfs.A03.post(new C21466AkX((Object) bfs, 39));
        }
        mediaCodec.start();
    }

    public void reset() {
        this.A02.reset();
    }

    public void start() {
        C25304Cd8.A01("startCodec");
        this.A02.start();
        C25304Cd8.A00();
        this.A00 = 1;
    }

    public void stop() {
        this.A02.stop();
    }

    public D99(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.A02 = mediaCodec;
        this.A04 = new BFS(handlerThread);
        this.A03 = new C26124Csm(mediaCodec, handlerThread2);
        this.A05 = z;
    }

    public void CJg(Handler handler, C25044CUy cUy) {
        A00();
        this.A02.setOnFrameRenderedListener(new C26361CyN(this, cUy), handler);
    }

    public void CJp(Surface surface) {
        A00();
        this.A02.setOutputSurface(surface);
    }

    public void CLO(int i) {
        A00();
        this.A02.setVideoScalingMode(i);
    }

    public /* synthetic */ void A01(C25044CUy cUy) {
        cUy.A00();
    }
}
