package X;

import android.os.Handler;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class DGN implements C28612EAg {
    public final WeakReference A00;

    public void Bnr(D49 d49, String str, String str2, String str3, String str4, long j, boolean z) {
        D49 d492 = d49;
        C0s(d49);
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            C26378Cye.A06(A002, "onCancelled", BE6.A1Z());
            A002.A0E.C9v(BE8.A0N(A002), d492, str, str2, str3, str4, j, z);
            A002.A02.A00("onCancelled");
        }
    }

    public void C6S(D49 d49, String str, String str2, String str3, String str4, long j) {
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            A002.A0A = false;
            D49 d492 = d49;
            C26378Cye.A04(A002, d492, false);
            C26378Cye.A06(A002, "onStartedPlaying", new Object[0]);
            A002.A0E.CA4(BE8.A0N(A002), d492, str, (String) null, str2, str3, str4, j, false, false);
            A002.A02.A00("onStartedPlaying");
        }
    }

    public static C26378Cye A00(DGN dgn) {
        return (C26378Cye) dgn.A00.get();
    }

    public static Integer A01(String str) {
        if (str.equals("UNKNOWN")) {
            return AnonymousClass00R.A00;
        }
        if (str.equals("DASH")) {
            return AnonymousClass00R.A01;
        }
        if (str.equals("DASH_LIVE")) {
            return AnonymousClass00R.A0C;
        }
        if (str.equals("PROGRESSIVE_DOWNLOAD")) {
            return AnonymousClass00R.A0N;
        }
        if (str.equals("RTC_LIVE")) {
            return AnonymousClass00R.A0Y;
        }
        if (str.equals("HLS")) {
            return AnonymousClass00R.A0j;
        }
        throw AnonymousClass000.A0k(str);
    }

    public DGN(C26378Cye cye) {
        this.A00 = AnonymousClass3MW.A0z(cye);
    }

    public void Bmr(D49 d49, D40 d40, boolean z) {
        long j;
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            D49 d492 = d49;
            C26378Cye.A04(A002, d49, false);
            C26378Cye.A06(A002, "onBufferingStarted", new Object[0]);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean A19 = C108975cc.A19(((elapsedRealtime - A002.A0Q) > ((long) A002.A05.stallFromSeekThresholdMs) ? 1 : ((elapsedRealtime - A002.A0Q) == ((long) A002.A05.stallFromSeekThresholdMs) ? 0 : -1)));
            long j2 = A002.A01;
            if (j2 != -1) {
                j = elapsedRealtime - j2;
            } else {
                j = -1;
            }
            A002.A0E.C6I(d40, d492, A002.A06, j, z, A19);
        }
    }

    public void Bms(D49 d49, boolean z) {
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            C26378Cye.A04(A002, d49, z);
        }
    }

    public void BpR(D49 d49, String str, boolean z) {
        Integer num;
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            D49 d492 = d49;
            C26378Cye.A04(A002, d49, false);
            C26378Cye.A06(A002, "onCompletion", new Object[0]);
            CA0 A0A = A002.A0A();
            String str2 = d49.A0N;
            if (str2 != null) {
                num = A01(str2);
            } else {
                num = AnonymousClass00R.A00;
            }
            C26378Cye.A03(A002, d49);
            A002.A0E.C9x(A0A, BE8.A0N(A002), d492, num, str, z, A002.A0R);
        }
    }

    public void Bqd(List list) {
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            C26378Cye.A06(A002, "onCues", BE6.A1Z());
            A002.A0E.Bqd(list);
        }
    }

    public void Br2(String str, boolean z, long j) {
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            AtomicInteger atomicInteger = C26378Cye.A0T;
            Object[] A1b = AnonymousClass000.A1b(str, 3);
            AnonymousClass8BR.A1L(A1b, 1, z);
            AnonymousClass3MX.A1S(A1b, 2, j);
            C26378Cye.A06(A002, "onDecoderInitialized name: %s, isVideo %s, duration: %d", A1b);
            A002.A0E.Br2(str, z, j);
        }
    }

    public void BsN() {
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            C26378Cye.A06(A002, "onDrawnToSurface", BE6.A1Z());
            A002.A0E.BsN();
        }
    }

    public void Bsa(String str, String str2) {
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            AtomicInteger atomicInteger = C26378Cye.A0T;
            A002.A0E.C9y(str, str2);
        }
    }

    public void Bt3(String str, String str2, String str3, String str4, String str5, String str6) {
        CA0 ca0;
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            C0Q A003 = C0Q.A00(str);
            C0S A004 = C0S.A00(str2);
            C26378Cye.A06(A002, "onError", new Object[0]);
            String str7 = str3;
            String str8 = str4;
            String str9 = str5;
            if (A004 == C0S.A15) {
                Handler handler = A002.A0C;
                String[] strArr = new String[5];
                strArr[0] = A003.name();
                strArr[1] = "RESPONSE_CODE_410";
                AnonymousClass001.A1R(str7, str8, strArr);
                strArr[4] = str5;
                C108955ca.A1F(handler, strArr, 17);
                return;
            }
            if (A002.A05.logStallOnPauseOnError) {
                ca0 = A002.A0A();
            } else {
                ca0 = null;
            }
            DGH dgh = A002.A0E;
            D49 A0E = C108965cb.A0E(A002);
            dgh.C0l(ca0, new C25951CpJ(A004, A003, str7, str8), BE8.A0N(A002), A0E, str9, str6);
            A002.A02.A00("onError");
        }
    }

    public void BtM(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            C0Q A003 = C0Q.A00(str);
            C0S A004 = C0S.A00(str2);
            AtomicInteger atomicInteger = C26378Cye.A0T;
            long A09 = A002.A09();
            String str8 = str6;
            C26378Cye.A06(A002, "onErrorRecoveryAttempt reason: %s", AnonymousClass8BV.A1b(str8));
            A002.A0E.BtN(new C25951CpJ(A004, A003, str3, str4), str5, str8, str7, A09);
        }
    }

    public void Bwm(boolean z) {
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            C26378Cye.A06(A002, "onLiveBroadcastInterruptStatusChanged", BE6.A1Z());
            A002.A0E.Bwm(z);
        }
    }

    public void Bwn(D40 d40) {
        int i;
        DGH dgh;
        boolean z;
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            AtomicInteger atomicInteger = C26378Cye.A0T;
            C26378Cye cye = A002.A0D.A0B;
            AtomicReference atomicReference = cye.A0J;
            synchronized (atomicReference) {
                D40 d402 = (D40) atomicReference.get();
                TreeMap treeMap = cye.A0I;
                if (treeMap.isEmpty() || (i = d40.A00) != d402.A00) {
                    Long valueOf = Long.valueOf(d40.A09);
                    i = d40.A00;
                    C17890vO.A0z(valueOf, treeMap, i);
                }
                if (d402.A09 <= d40.A09) {
                    atomicReference.set(d40);
                }
                int i2 = cye.A05.staleManifestThreshold;
                int i3 = d402.A00;
                if (i3 < i2 && i >= i2) {
                    dgh = cye.A0E;
                    z = true;
                } else if (i3 >= i2 && i < i2) {
                    dgh = cye.A0E;
                    z = false;
                }
                dgh.C7A(z);
            }
        }
    }

    public void Bz4(byte[] bArr) {
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            C26378Cye.A06(A002, "onNewPCMBuffer", BE6.A1Z());
            A002.A0E.Bz4(bArr);
        }
    }

    public void C0C(D49 d49, String str, String str2, String str3, long j, boolean z) {
        long j2;
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            AtomicInteger atomicInteger = C26378Cye.A0T;
            C27066DRp dRp = A002.A05;
            D49 d492 = d49;
            if (dRp.logPausedSeekPositionBeforeSettingState) {
                j2 = d492.A00();
            } else {
                j2 = 0;
            }
            C26378Cye.A04(A002, d492, false);
            if (!dRp.logPausedSeekPositionBeforeSettingState) {
                j2 = d492.A00();
            }
            C26378Cye.A06(A002, "onPaused", BE6.A1Z());
            A002.A0E.C9z(A002.A0A(), BE8.A0N(A002), d492, A01(d492.A0N), str, str2, str3, j2, j, z);
            A002.A02.A00("onPaused");
            A002.A0A = false;
        }
    }

    public void C0j() {
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            C26378Cye.A06(A002, "onPlaybackAboutToFinish", BE6.A1Z());
            A002.A0E.C0j();
        }
    }

    public void C0m(float f) {
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            C26378Cye.A06(A002, "onPlaybackSpeedChanged", BE6.A1Z());
            A002.A0E.C0n(C108965cb.A0E(A002), f, A002.A09());
        }
    }

    public void C0s(D49 d49) {
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            C26378Cye.A04(A002, d49, false);
        }
    }

    public void C1b(D49 d49, String str) {
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            C26378Cye.A04(A002, d49, false);
            C26378Cye.A06(A002, "onPrepared", new Object[0]);
            A002.A0E.C1b(d49, str);
            A002.A02.A00("onPrepared");
        }
    }

    public void C2w(boolean z) {
        String str;
        C26378Cye A002 = A00(this);
        if (A002 != null && AnonymousClass000.A1O((A002.A0N > 0 ? 1 : (A002.A0N == 0 ? 0 : -1)))) {
            Object[] A1a = AnonymousClass3MW.A1a();
            if (z) {
                str = "evicted";
            } else {
                str = "released";
            }
            A1a[0] = str;
            C26378Cye.A06(A002, "Service player was %s", A1a);
            C108955ca.A1F(A002.A0C, Boolean.valueOf(z), 12);
        }
    }

    public void C4t(D49 d49, long j) {
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            C26378Cye.A04(A002, d49, false);
            C26378Cye.A06(A002, "onSeeking", new Object[0]);
            A002.A0E.C4s(j);
        }
    }

    public void C5I(long j) {
        C26378Cye A002 = A00(this);
        if (A002 == null) {
            return;
        }
        if (A002.A05.enableBackgroundServicePlayerReuse) {
            BE6.A1D(A002, "setRebindServicePlayerListener");
            Handler handler = A002.A0C;
            handler.sendMessage(handler.obtainMessage(32));
            return;
        }
        BE6.A1D(A002, "setRebindServicePlayerListener: message not sent to internal player");
    }

    public void C78() {
        CA0 ca0;
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            C26378Cye.A06(A002, "onStopped", BE6.A1Z());
            C25238CbZ cbZ = A002.A0D.A05;
            if (cbZ == null || !"WA_BOT".equals(cbZ.A05)) {
                ca0 = null;
            } else {
                ca0 = A002.A0A();
            }
            A002.A0E.C79(ca0);
        }
    }

    public void C8i(List list) {
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            C26378Cye.A06(A002, "onWarn", BE6.A1Z());
            A002.A0E.C8i(list);
        }
    }

    public void CA2(float f, int i, int i2, int i3) {
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            AtomicInteger atomicInteger = C26378Cye.A0T;
            Object[] A1b = AnonymousClass3MW.A1b();
            BEA.A1U(A1b, i, i2);
            C26378Cye.A06(A002, "onVideoSizeChanged: w=%d, h=%d", A1b);
            A002.A0E.CA2(f, i, i2, i3);
        }
    }

    public void CAR(String str, String str2, String str3) {
        C26378Cye A002 = A00(this);
        if (A002 != null) {
            C0Q A003 = C0Q.A00(str);
            C0S A004 = C0S.A00(str2);
            C26378Cye.A06(A002, "onWarn", BE6.A1Z());
            A002.A0E.CAQ(new C25951CpJ(A004, A003, str3));
        }
    }
}
