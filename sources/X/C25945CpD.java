package X;

import android.util.Log;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.CpD  reason: case insensitive filesystem */
public class C25945CpD {
    public boolean A00 = false;
    public final ConcurrentLinkedQueue A01 = new ConcurrentLinkedQueue();
    public final /* synthetic */ C26119Csh A02;

    public C25945CpD(C26119Csh csh) {
        this.A02 = csh;
    }

    public static C28610EAe A00(String str, boolean z) {
        if (z && str.equals("meta.dav1d.av1.decoder")) {
            try {
                return (C28610EAe) BEA.A0d(Class.forName("exoplayer2.av1.src.Dav1dMediaCodecAdapter"));
            } catch (Exception e) {
                Object[] A1b = AnonymousClass3MX.A1b("exoplayer2.av1.src.Dav1dMediaCodecAdapter", 0);
                BE6.A1M(e, A1b, 1);
                Log.w("MediaCodecPoolOptimized", String.format("Exception when trying to instantiate %s: %s", A1b));
            }
        }
        return new D98(str);
    }

    public static void A01(C28610EAe eAe, C25945CpD cpD, String str) {
        Set set;
        C26119Csh csh = cpD.A02;
        synchronized (csh.A03) {
            set = (Set) csh.A03.get(str);
        }
        if (set != null) {
            synchronized (set) {
                if (set.remove(eAe)) {
                    csh.A00--;
                }
            }
        }
    }
}
