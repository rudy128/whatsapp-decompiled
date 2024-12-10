package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

public final class BFS extends MediaCodec.Callback {
    public long A00;
    public MediaCodec.CodecException A01;
    public MediaFormat A02;
    public Handler A03;
    public IllegalStateException A04;
    public boolean A05;
    public MediaFormat A06;
    public final HandlerThread A07;
    public final C25081CWq A08;
    public final Object A09 = C17880vN.A0p();
    public final ArrayDeque A0A;
    public final ArrayDeque A0B;
    public final C25081CWq A0C;

    public static void A00(BFS bfs) {
        ArrayDeque arrayDeque = bfs.A0B;
        if (!arrayDeque.isEmpty()) {
            bfs.A06 = (MediaFormat) arrayDeque.getLast();
        }
        C25081CWq cWq = bfs.A0C;
        cWq.A00 = 0;
        cWq.A02 = -1;
        cWq.A01 = 0;
        C25081CWq cWq2 = bfs.A08;
        cWq2.A00 = 0;
        cWq2.A02 = -1;
        cWq2.A01 = 0;
        bfs.A0A.clear();
        arrayDeque.clear();
    }

    public static /* synthetic */ void A01(BFS bfs) {
        synchronized (bfs.A09) {
            if (!bfs.A05) {
                long j = bfs.A00 - 1;
                bfs.A00 = j;
                if (j <= 0) {
                    if (j < 0) {
                        bfs.A04 = BE6.A0k();
                    } else {
                        A00(bfs);
                    }
                }
            }
        }
    }

    public void A02(MediaCodec mediaCodec) {
        C26056CrS.A03(AnonymousClass000.A1X(this.A03));
        Handler handler = new Handler(BE7.A0G(this.A07));
        mediaCodec.setCallback(this, handler);
        this.A03 = handler;
    }

    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.A09) {
            this.A01 = codecException;
        }
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.A09) {
            this.A0C.A00(i);
        }
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.A09) {
            MediaFormat mediaFormat = this.A06;
            if (mediaFormat != null) {
                this.A08.A00(-2);
                this.A0B.add(mediaFormat);
                this.A06 = null;
            }
            this.A08.A00(i);
            this.A0A.add(bufferInfo);
        }
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.A09) {
            this.A08.A00(-2);
            this.A0B.add(mediaFormat);
            this.A06 = null;
        }
    }

    public BFS(HandlerThread handlerThread) {
        this.A07 = handlerThread;
        this.A0C = new C25081CWq();
        this.A08 = new C25081CWq();
        this.A0A = new ArrayDeque();
        this.A0B = new ArrayDeque();
    }
}
