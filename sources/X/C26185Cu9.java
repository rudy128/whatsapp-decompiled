package X;

import android.os.SystemClock;
import android.util.Pair;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cu9  reason: case insensitive filesystem */
public class C26185Cu9 {
    public static final int[] A0A;
    public long A00;
    public boolean A01;
    public final long A02;
    public final CAC A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final C25056CVk[] A08;
    public final List A09;

    static {
        int[] iArr = new int[19];
        A0A = iArr;
        iArr[0] = 8000;
        iArr[1] = 0;
        iArr[2] = 500;
        iArr[3] = 2000;
        iArr[4] = 500;
        iArr[5] = 2000;
        iArr[6] = 500;
        iArr[7] = 2000;
        iArr[8] = 8000;
        iArr[9] = 500;
        iArr[10] = 30000;
        iArr[11] = 30000;
        iArr[16] = 1;
        iArr[17] = 1;
        iArr[18] = 1;
    }

    public static int A00(C26185Cu9 cu9, int i) {
        C24294Byr byr;
        C25056CVk cVk;
        C25682CkD ckD;
        long j;
        C25056CVk[] cVkArr = cu9.A08;
        if (cVkArr[i] == null) {
            return A0A[i];
        }
        if (cu9.A01 && cu9.A03 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - cu9.A00 > cu9.A02) {
                long j2 = -1;
                if (cu9.A05) {
                    boolean z = cu9.A06;
                    synchronized (C25682CkD.class) {
                        ckD = C25682CkD.A07;
                        if (ckD == null) {
                            ckD = new C25682CkD(C28617EAp.A00);
                            C25682CkD.A07 = ckD;
                        }
                    }
                    if (z) {
                        j = ckD.A00((AbrContextAwareConfiguration) null).A00;
                    } else {
                        synchronized (ckD) {
                            j = ckD.A02;
                        }
                    }
                    if (j >= 0) {
                        j2 = j;
                    }
                }
                List list = cu9.A04;
                if (j2 >= 0) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            byr = C24294Byr.EXCELLENT;
                            break;
                        }
                        Pair pair = (Pair) it.next();
                        if (j2 < ((long) C108965cb.A00(pair))) {
                            byr = (C24294Byr) pair.first;
                            break;
                        }
                    }
                } else {
                    byr = C24294Byr.UNKNOWN;
                }
                int i2 = 0;
                do {
                    if ((!cu9.A07 || i2 != 1) && (cVk = cVkArr[i2]) != null) {
                        C27057DRc dRc = cVk.A01;
                        if (!dRc.useNetworkQuality || !dRc.useNetworkType) {
                            cVk.A00(byr);
                        } else if (!dRc.useNetworkQualityWifiOnly && byr != C24294Byr.UNKNOWN) {
                            cVk.A00(byr);
                        }
                        if (dRc.useNetworkType) {
                            cVk.A00 = dRc.defaultValue;
                        }
                    }
                    i2++;
                } while (i2 < 19);
                cu9.A00 = elapsedRealtime;
            }
        }
        return cVkArr[i].A00;
    }

    public static C25056CVk A01(C27057DRc dRc) {
        if (dRc != null) {
            return new C25056CVk(dRc);
        }
        return null;
    }

    public C26185Cu9(C27066DRp dRp, CAC cac) {
        C25056CVk[] cVkArr = new C25056CVk[19];
        this.A08 = cVkArr;
        int i = 0;
        this.A01 = false;
        this.A07 = dRp.useLatencyForSegmentConcat;
        this.A05 = dRp.useAccumulatorForBw;
        this.A06 = dRp.useBwBpsForConnectionQuality;
        Pair[] pairArr = new Pair[4];
        C24294Byr byr = C24294Byr.DEGRADED;
        C27057DRc dRc = dRp.latencyBoundMsConfig;
        pairArr[0] = C17890vO.A0E(byr, dRc.degradedValue);
        C24294Byr byr2 = C24294Byr.POOR;
        pairArr[1] = C17890vO.A0E(byr2, dRc.poorValue);
        C24294Byr byr3 = C24294Byr.MODERATE;
        pairArr[2] = C17890vO.A0E(byr3, dRc.moderateValue);
        C24294Byr byr4 = C24294Byr.GOOD;
        this.A09 = Collections.unmodifiableList(AnonymousClass8BR.A15(C17890vO.A0E(byr4, dRc.goodValue), pairArr, 3));
        Pair[] pairArr2 = new Pair[4];
        C27057DRc dRc2 = dRp.qualityMapperBoundMsConfig;
        pairArr2[0] = C17890vO.A0E(byr, dRc2.degradedValue);
        pairArr2[1] = C17890vO.A0E(byr2, dRc2.poorValue);
        pairArr2[2] = C17890vO.A0E(byr3, dRc2.moderateValue);
        this.A04 = Collections.unmodifiableList(AnonymousClass8BR.A15(C17890vO.A0E(byr4, dRc2.goodValue), pairArr2, 3));
        cVkArr[0] = A01(dRp.fetchHttpReadTimeoutMsConfig);
        cVkArr[1] = A01(dRp.concatenatedMsPerLoadConfig);
        cVkArr[2] = A01(dRp.minBufferMsConfig);
        cVkArr[3] = A01(dRp.minRebufferMsConfig);
        cVkArr[4] = A01(dRp.liveMinBufferMsConfig);
        cVkArr[5] = A01(dRp.liveMinRebufferMsConfig);
        cVkArr[12] = A01(dRp.liveAPIMinBufferMsConfig);
        cVkArr[13] = A01(dRp.liveAPIMinRebufferMsConfig);
        cVkArr[14] = A01(dRp.livePremiumMinBufferMsConfig);
        cVkArr[15] = A01(dRp.livePremiumMinRebufferMsConfig);
        cVkArr[6] = A01(dRp.fbstoriesMinBufferMsConfig);
        cVkArr[7] = A01(dRp.fbstoriesMinRebufferMsConfig);
        cVkArr[8] = A01(dRp.fetchCacheSourceHttpConnectTimeoutMsConfig);
        cVkArr[9] = A01(dRp.minMicroRebufferMsConfig);
        cVkArr[10] = A01(dRp.wifiMaxWatermarkMsConfig);
        cVkArr[11] = A01(dRp.cellMaxWatermarkMsConfig);
        cVkArr[16] = A01(dRp.networkAwareDisableSecondPhasePrefetch);
        cVkArr[17] = A01(dRp.networkAwarePrefetchTaskQueueWorkerNum);
        cVkArr[18] = A01(dRp.networkAwareHttpPriorityIncrementalForStreaming);
        while (true) {
            if (this.A08[i] == null) {
                i++;
                if (i >= 19) {
                    break;
                }
            } else {
                this.A01 = true;
                break;
            }
        }
        this.A03 = cac;
        this.A02 = dRp.minDelayToRefreshTigonBitrateMs;
    }

    public C26185Cu9() {
        this(C27066DRp.A01, (CAC) null);
    }
}
