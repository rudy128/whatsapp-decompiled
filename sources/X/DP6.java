package X;

import android.media.MediaCodec;
import android.util.Pair;
import java.util.Iterator;
import java.util.List;

public final class DP6 implements C72143Ku {
    public final C19830z4 A00;
    public final C18030ve A01;

    public void C0w(C171888sR r15) {
        int i;
        C18070vi.A0d(r15, 0);
        Pair[] pairArr = new Pair[4];
        pairArr[0] = C108945cZ.A0N("video/av01", "av1");
        pairArr[1] = C108945cZ.A0N("video/avc", "avc");
        pairArr[2] = C108945cZ.A0N("video/hevc", "hevc");
        A00(C18070vi.A0O(C108945cZ.A0N("video/x-vnd.on2.vp9", "vp9"), pairArr, 3), true);
        Pair[] pairArr2 = new Pair[4];
        pairArr2[0] = C108945cZ.A0N("video/av01", "av1");
        pairArr2[1] = C108945cZ.A0N("video/avc", "avc");
        pairArr2[2] = C108945cZ.A0N("video/hevc", "hevc");
        r15.A1u = A00(C18070vi.A0O(C108945cZ.A0N("video/x-vnd.on2.vp9", "vp9"), pairArr2, 3), false);
        int A002 = DPW.A0V.A00();
        if (A002 == 1) {
            i = 0;
        } else if (A002 != 2) {
            i = 3;
        } else {
            i = 2;
        }
        r15.A0f = i;
        if (C18020vd.A05(C18040vf.A02, this.A01, 8033)) {
            r15.A0m = Integer.valueOf(this.A00.A0F());
        }
    }

    public DP6(C19830z4 r1, C18030ve r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public static final String A00(List list, boolean z) {
        boolean z2;
        MediaCodec mediaCodec;
        StringBuilder A10 = AnonymousClass000.A10();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Object obj = pair.first;
            C18070vi.A0W(obj);
            String str = (String) obj;
            if (z) {
                C18070vi.A0d(str, 0);
                try {
                    mediaCodec = MediaCodec.createEncoderByType(str);
                    C18070vi.A0X(mediaCodec);
                } catch (Throwable unused) {
                    z2 = false;
                }
            } else {
                C18070vi.A0d(str, 0);
                mediaCodec = MediaCodec.createDecoderByType(str);
                C18070vi.A0X(mediaCodec);
            }
            mediaCodec.release();
            z2 = true;
            if (z2) {
                if (A10.length() > 0) {
                    A10.append(", ");
                }
                A10.append((String) pair.second);
            }
        }
        return C18070vi.A0H(A10);
    }
}
