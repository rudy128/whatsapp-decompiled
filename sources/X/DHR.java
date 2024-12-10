package X;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class DHR implements EAb {
    public final /* synthetic */ DHU A00;

    public void BB9(MediaEffect mediaEffect) {
    }

    public void BBq(int i) {
    }

    public void CCO(Context context, C25092CXd cXd, C25752ClM clM, CZT czt) {
    }

    public void CEg(MediaEffect mediaEffect) {
    }

    public void CF5() {
    }

    public void CFD(long j) {
    }

    public void flush() {
    }

    public DHR(DHU dhu) {
        this.A00 = dhu;
    }

    public void BJ1(long j) {
        DHU dhu = this.A00;
        DH2 dh2 = dhu.A01;
        if (dh2 != null) {
            dh2.A00.presentationTimeUs = j;
            dhu.A05.offer(dh2);
            dhu.A01 = null;
        }
    }

    public String BRF() {
        return "VideoTranscoderPassThrough";
    }

    public MediaFormat BVu() {
        try {
            BE9.A1L(this.A00.A03);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MediaFormat mediaFormat = this.A00.A00;
        C26159CtX.A01(mediaFormat);
        return mediaFormat;
    }

    public void CEJ(DH2 dh2) {
        LinkedBlockingQueue linkedBlockingQueue;
        if (dh2.A02 >= 0 && (linkedBlockingQueue = this.A00.A04) != null) {
            linkedBlockingQueue.offer(dh2);
        }
    }

    public void CNL() {
        DH2 dh2 = new DH2(0, (ByteBuffer) null, new MediaCodec.BufferInfo());
        dh2.CI8(0, 0, 4);
        this.A00.A05.offer(dh2);
    }

    public void finish() {
        this.A00.A05.clear();
    }

    public DH2 BIS() {
        DHU dhu = this.A00;
        if (dhu.A08) {
            dhu.A08 = false;
            DH2 dh2 = new DH2(-1, (ByteBuffer) null, new MediaCodec.BufferInfo());
            dh2.A01 = true;
            return dh2;
        }
        if (!dhu.A07) {
            dhu.A07 = true;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1048576);
            ArrayList arrayList = dhu.A02;
            if (arrayList == null) {
                arrayList = AnonymousClass000.A13();
                dhu.A02 = arrayList;
            }
            arrayList.add(allocateDirect);
            DH2 dh22 = new DH2(0, allocateDirect, new MediaCodec.BufferInfo());
            MediaFormat mediaFormat = dhu.A00;
            C26159CtX.A01(mediaFormat);
            if (CAN.A00(mediaFormat, dh22)) {
                return dh22;
            }
        }
        return (DH2) dhu.A05.poll(250000, TimeUnit.MICROSECONDS);
    }

    public int BVy() {
        MediaFormat BVu = BVu();
        String str = "rotation-degrees";
        if (!BVu.containsKey(str)) {
            str = "rotation";
            if (!BVu.containsKey(str)) {
                return 0;
            }
        }
        return BVu.getInteger(str);
    }
}
