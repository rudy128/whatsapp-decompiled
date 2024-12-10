package X;

import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;

/* renamed from: X.D9d  reason: case insensitive filesystem */
public class C26680D9d implements C28409E0a {
    public static final C25101CXu A05 = new C25101CXu(new C25108CYc(new C24916CPk()));
    public int A00 = 0;
    public C26731DBi A01;
    public final C25682CkD A02;
    public final AbrContextAwareConfiguration A03;
    public final CAC A04;

    public C26680D9d(AbrContextAwareConfiguration abrContextAwareConfiguration, CAC cac) {
        C25682CkD ckD;
        C28617EAp eAp = C28617EAp.A00;
        this.A01 = new C26731DBi(this, eAp, this, abrContextAwareConfiguration.abrSetting.shouldCountFirstChunkOnly);
        synchronized (C25682CkD.class) {
            ckD = C25682CkD.A07;
            if (ckD == null) {
                ckD = new C25682CkD(eAp);
                C25682CkD.A07 = ckD;
            }
        }
        this.A02 = ckD;
        this.A04 = cac;
        this.A03 = abrContextAwareConfiguration;
    }
}
