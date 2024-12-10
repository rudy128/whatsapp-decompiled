package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class DHO implements EAS {
    public boolean A00;
    public final /* synthetic */ DHU A01;

    public String BQK() {
        return null;
    }

    public boolean CMT() {
        return false;
    }

    public void CQV(int i, Bitmap bitmap) {
    }

    public void flush() {
    }

    public DHO(DHU dhu) {
        this.A01 = dhu;
    }

    public long BI8(long j) {
        DHU dhu = this.A01;
        if (dhu.A01 != null) {
            LinkedBlockingQueue linkedBlockingQueue = dhu.A04;
            C26159CtX.A01(linkedBlockingQueue);
            linkedBlockingQueue.offer(dhu.A01);
            dhu.A01 = null;
        }
        DH2 dh2 = (DH2) dhu.A06.poll();
        dhu.A01 = dh2;
        if (dh2 != null) {
            MediaCodec.BufferInfo bufferInfo = dh2.A00;
            if ((bufferInfo.flags & 4) == 0) {
                return bufferInfo.presentationTimeUs;
            }
            this.A00 = true;
            LinkedBlockingQueue linkedBlockingQueue2 = dhu.A04;
            C26159CtX.A01(linkedBlockingQueue2);
            linkedBlockingQueue2.offer(dhu.A01);
            dhu.A01 = null;
        }
        return -1;
    }

    public DH2 BIR(long j) {
        LinkedBlockingQueue linkedBlockingQueue = this.A01.A04;
        C26159CtX.A01(linkedBlockingQueue);
        return (DH2) linkedBlockingQueue.poll(j, TimeUnit.MICROSECONDS);
    }

    public long BQJ() {
        DH2 dh2 = this.A01.A01;
        if (dh2 == null) {
            return -1;
        }
        return dh2.A00.presentationTimeUs;
    }

    public String BQM() {
        return "VideoTranscoderPassThrough";
    }

    public boolean Bgl() {
        return this.A00;
    }

    public void CCN(MediaFormat mediaFormat, CZT czt, List list, int i, boolean z) {
        DHU dhu = this.A01;
        dhu.A00 = mediaFormat;
        dhu.A03.countDown();
        int i2 = 0;
        do {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1048576);
            ArrayList arrayList = dhu.A02;
            if (arrayList == null) {
                arrayList = AnonymousClass000.A13();
                dhu.A02 = arrayList;
            }
            arrayList.add(allocateDirect);
            DH2 dh2 = new DH2(0, allocateDirect, new MediaCodec.BufferInfo());
            LinkedBlockingQueue linkedBlockingQueue = dhu.A04;
            C26159CtX.A01(linkedBlockingQueue);
            linkedBlockingQueue.offer(dh2);
            i2++;
        } while (i2 < 5);
    }

    public void CDC(DH2 dh2) {
        this.A01.A06.offer(dh2);
    }

    public void finish() {
        DHU dhu = this.A01;
        ArrayList arrayList = dhu.A02;
        if (arrayList != null) {
            arrayList.clear();
        }
        LinkedBlockingQueue linkedBlockingQueue = dhu.A04;
        C26159CtX.A01(linkedBlockingQueue);
        linkedBlockingQueue.clear();
        dhu.A06.clear();
        dhu.A04 = null;
    }
}
