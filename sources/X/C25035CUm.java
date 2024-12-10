package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.CUm  reason: case insensitive filesystem */
public final class C25035CUm {
    public final synchronized int A00() {
        int i;
        i = DPW.A0U;
        if (i == 0) {
            if (C39761tb.A04()) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("VideoTranscoder/istranscodesupported/unsupported model ");
                A10.append(Build.MANUFACTURER);
                A10.append('-');
                C17890vO.A1B(A10, Build.MODEL);
                i = 2;
            } else {
                try {
                    MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                    C18070vi.A0X(codecInfos);
                    ArrayList<MediaCodecInfo> A13 = AnonymousClass000.A13();
                    for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                        if (mediaCodecInfo.isEncoder() && C39761tb.A0F(mediaCodecInfo.getName())) {
                            A13.add(mediaCodecInfo);
                        }
                    }
                    for (MediaCodecInfo mediaCodecInfo2 : A13) {
                        String[] supportedTypes = mediaCodecInfo2.getSupportedTypes();
                        C18070vi.A0X(supportedTypes);
                        if (C200410p.A0U("video/avc", supportedTypes)) {
                            StringBuilder A102 = AnonymousClass000.A10();
                            A102.append("VideoTranscoder/istranscodesupported/found ");
                            C17890vO.A1A(A102, mediaCodecInfo2.getName());
                            i = 1;
                            DPW.A0U = 1;
                            break;
                        }
                    }
                } catch (Exception unused) {
                }
                Log.w("VideoTranscoder/istranscodesupported/no encoder found");
                i = 3;
            }
            DPW.A0U = i;
        }
        return i;
    }
}
