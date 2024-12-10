package X;

import android.media.MediaCodecInfo;
import android.util.Log;
import java.util.List;

public class D9A implements EBU {
    public C26125Csn BWO() {
        C26125Csn csn;
        List A03 = C26283Cwe.A03("audio/raw", false);
        if (A03.isEmpty() || (csn = (C26125Csn) A03.get(0)) == null) {
            return null;
        }
        return new C26125Csn((MediaCodecInfo.CodecCapabilities) null, csn.A02, (String) null, true, false, true, true, false, false);
    }

    public List BQL(String str, boolean z) {
        List A03 = C26283Cwe.A03(str, z);
        Log.d("MediaCodecSelector", AnonymousClass001.A1E(A03, "default mediacodec order:", AnonymousClass000.A10()));
        return A03;
    }
}
