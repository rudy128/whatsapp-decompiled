package X;

import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.CUb  reason: case insensitive filesystem */
public final /* synthetic */ class C25025CUb {
    public final int A00(Object obj) {
        String str = ((C26125Csn) obj).A02;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (Util.A00 >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }
}
