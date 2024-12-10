package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;

public class D96 implements C28492E3x {
    public final C24843CMl A00;

    public C28610EAe BH9(String str, boolean z) {
        C24843CMl cMl = this.A00;
        if (z && str.equals("meta.dav1d.av1.decoder")) {
            try {
                C28610EAe eAe = (C28610EAe) BEA.A0d(Class.forName("exoplayer2.av1.src.Dav1dMediaCodecAdapter"));
                if (eAe != null) {
                    return eAe;
                }
            } catch (Exception e) {
                Object[] A1b = AnonymousClass3MX.A1b("exoplayer2.av1.src.Dav1dMediaCodecAdapter", 0);
                BE6.A1M(e, A1b, 1);
                Log.w("CodecSuppierImpl", String.format("Exception when trying to instantiate %s: %s", A1b));
            }
        }
        if (!cMl.A00 || !z || Util.A00 < 23) {
            return new D98(str);
        }
        return new D97(cMl.A01).A02(str);
    }

    public D96(boolean z, boolean z2) {
        this.A00 = new C24843CMl(z, z2);
    }
}
