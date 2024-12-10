package X;

import android.os.SystemClock;
import android.util.Base64;
import com.whatsapp.fieldstats.privatestats.PrivateStatsWorker;
import com.whatsapp.util.Log;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.whispersystems.curve25519.NativeVOPRFExtension;

/* renamed from: X.2tl  reason: invalid class name and case insensitive filesystem */
public class C63832tl {
    public NativeVOPRFExtension A00;
    public final AnonymousClass18O A01;
    public final C23651Hc A02;
    public final AnonymousClass11P A03;
    public final C27511Wj A04;
    public final C63582tM A05;
    public final AnonymousClass37E A06;
    public final AnonymousClass10I A07;
    public final AnonymousClass19K A08;
    public final C18030ve A09;
    public volatile int A0A = 0;
    public volatile long A0B;
    public volatile long A0C;
    public volatile String A0D;
    public volatile boolean A0E;
    public volatile boolean A0F = false;
    public volatile byte[] A0G;

    public static synchronized void A00(C63832tl r6) {
        synchronized (r6) {
            r6.A0D = null;
            r6.A0G = null;
            r6.A0A = 0;
            r6.A0F = false;
            r6.A0E = false;
            C63582tM r3 = r6.A05;
            C63582tM.A02(r3, "original_token", (String) null);
            C63582tM.A02(r3, "next_original_token", (String) null);
            C63582tM.A01(r3, "base_timestamp", 0);
            C63582tM.A01(r3, "time_to_live", 0);
            C63582tM.A02(r3, "blinding_factor", (String) null);
            r3.A04(-1);
            C63582tM.A02(r3, "shared_secret", (String) null);
            if (C63582tM.A00(r3).getInt("first_token_stage", 0) == 1) {
                r3.A03(0);
            }
        }
    }

    public static synchronized void A02(C63832tl r2, int i) {
        synchronized (r2) {
            if (!r2.A0E) {
                r2.A0E = true;
                C17900vP.A0j("PrivateStatsToken/doCreateFirstToken!!--->about to create 1st token: ", AnonymousClass000.A10(), i);
                r2.A07(false);
            }
        }
    }

    public static synchronized void A03(C63832tl r10, int i, boolean z) {
        synchronized (r10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            r10.A04.A01(i, elapsedRealtime - r10.A0B, elapsedRealtime - r10.A0C, (long) r10.A0A);
            r10.A0E = false;
            C63582tM r2 = r10.A05;
            C63582tM.A02(r2, "blinding_factor", (String) null);
            if (r10.A0F) {
                C63582tM.A02(r2, "next_original_token", (String) null);
            } else {
                C63582tM.A02(r2, "original_token", (String) null);
            }
            r10.A0F = false;
            r10.A0G = null;
            if (!z) {
                r10.A0D = null;
                r10.A0A = 0;
            }
            if (C63582tM.A00(r2).getInt("first_token_stage", 0) == 1) {
                r2.A03(0);
            }
        }
    }

    public synchronized void A06() {
        if (!A04(this) && !this.A0E) {
            C63582tM r9 = this.A05;
            int i = C63582tM.A00(r9).getInt("redeem_count", -1);
            long A002 = AnonymousClass11P.A00(this.A03) - C63582tM.A00(r9).getLong("base_timestamp", 0);
            if (i < 0 || i >= 512 || A002 >= C63582tM.A00(r9).getLong("time_to_live", 0)) {
                this.A0E = true;
                A07(false);
            } else {
                AnonymousClass18O r3 = this.A01;
                int A042 = r3.A04(AnonymousClass18O.A08);
                long A043 = (long) r3.A04(AnonymousClass18O.A07);
                if (i >= A042 || A002 > C63582tM.A00(r9).getLong("time_to_live", 0) - A043) {
                    this.A0E = true;
                    A07(true);
                }
            }
        }
    }

    public static void A01(C63832tl r5, int i) {
        if (r5.A0A < 2) {
            r5.A0A++;
            r5.A07.CGv(new C146747Ql(r5, 23), ((long) r5.A0A) * C20113A7w.A0L * ((long) r5.A0A));
            return;
        }
        C63582tM r2 = r5.A05;
        int i2 = 10;
        if (i == 5) {
            i2 = 9;
        }
        r2.A05(i2);
        A03(r5, i, false);
    }

    public static boolean A04(C63832tl r15) {
        C63582tM r7 = r15.A05;
        int A002 = C17890vO.A00(C63582tM.A00(r7), "first_token_stage");
        if (A002 != 2) {
            int A003 = C18020vd.A00(C18040vf.A02, r15.A09, 8042);
            if (A003 <= 30) {
                r7.A03(2);
            } else {
                long j = C63582tM.A00(r7).getLong("first_token_delay_time", 0);
                if (A002 == 1) {
                    if (!r15.A0E) {
                        AnonymousClass11P r5 = r15.A03;
                        if (AnonymousClass11P.A01(r5) / 1000 > j + C63582tM.A00(r7).getLong("first_token_request_timestamp", 0) + 300) {
                            ((A7W) r15.A08.get()).A0A("name.com.whatsapp.privatestats.firsttoken");
                            Log.i("PrivateStatsToken/delayForFirstTokenIfNeeded cancelled the work");
                            A02(r15, 2);
                        } else {
                            AnonymousClass11P.A01(r5);
                            return true;
                        }
                    }
                    return true;
                } else if (A002 == 0) {
                    long nextInt = ((long) new Random().nextInt(A003 - 30)) + 30;
                    C17900vP.A0m("PrivateStatsToken/delayForFirstToken-->delay timesec= ", AnonymousClass000.A10(), nextInt);
                    C63582tM.A01(r7, "first_token_delay_time", nextInt);
                    C63582tM.A01(r7, "first_token_request_timestamp", AnonymousClass11P.A01(r15.A03) / 1000);
                    r7.A03(1);
                    C196269uj r1 = new C196269uj(PrivateStatsWorker.class);
                    r1.A02(nextInt, TimeUnit.SECONDS);
                    ((A7W) r15.A08.get()).A07((C162248Jv) r1.A00(), AnonymousClass00R.A00, "name.com.whatsapp.privatestats.firsttoken");
                    return true;
                }
            }
        }
        return false;
    }

    public int A05() {
        C63582tM r4 = this.A05;
        int i = C63582tM.A00(r4).getInt("first_token_stage", 0);
        if (i == 1) {
            synchronized (this) {
                if (this.A0E) {
                    return 15;
                }
                return 2;
            }
        } else if (i != 0) {
            return C63582tM.A00(r4).getInt("token_not_ready_reason", 0);
        } else {
            return 2;
        }
    }

    public void A07(boolean z) {
        NativeVOPRFExtension nativeVOPRFExtension = this.A00;
        if (nativeVOPRFExtension == null) {
            nativeVOPRFExtension = new NativeVOPRFExtension();
            this.A00 = nativeVOPRFExtension;
        }
        byte[] bArr = new byte[32];
        C56312hG r3 = nativeVOPRFExtension.A00;
        r3.A00(bArr);
        byte[] bArr2 = null;
        int i = 0;
        while (i < 256) {
            bArr2 = new byte[32];
            r3.A00(bArr2);
            bArr2[31] = (byte) (bArr2[31] & 31);
            if (nativeVOPRFExtension.A00(bArr2)) {
                break;
            }
            i++;
        }
        if (i >= 256) {
            Log.w("PrivateStatsToken/generateCredentialToken cannot generate valid blindingFactor");
            this.A05.A05(5);
        } else {
            SystemClock.elapsedRealtime();
            byte[] A022 = nativeVOPRFExtension.A02(bArr, bArr2, 32);
            SystemClock.elapsedRealtime();
            if (A022 == null) {
                Log.e("PrivateStatsToken/generateCredentialToken failed to blind the token");
                this.A05.A05(7);
            } else {
                synchronized (this) {
                    this.A0F = z;
                    this.A0G = A022;
                    if (z) {
                        C63582tM r2 = this.A05;
                        C63582tM.A02(r2, "next_original_token", Base64.encodeToString(bArr, 10));
                        C63582tM.A02(r2, "blinding_factor", Base64.encodeToString(bArr2, 10));
                    } else {
                        C63582tM r4 = this.A05;
                        C63582tM.A02(r4, "original_token", Base64.encodeToString(bArr, 10));
                        C63582tM.A02(r4, "blinding_factor", Base64.encodeToString(bArr2, 10));
                        C63582tM.A02(r4, "shared_secret", (String) null);
                        r4.A04(-1);
                        C63582tM.A01(r4, "base_timestamp", 0);
                        C63582tM.A01(r4, "time_to_live", 0);
                    }
                    this.A0A = 0;
                    this.A0B = SystemClock.elapsedRealtime();
                    this.A0C = this.A0B;
                    if (this.A02.A02()) {
                        this.A0D = this.A06.A00(this.A0G);
                    } else {
                        A01(this, 5);
                    }
                }
                return;
            }
        }
        A03(this, 4, true);
    }

    public C63832tl(AnonymousClass18O r2, C23651Hc r3, AnonymousClass11P r4, C18030ve r5, C27511Wj r6, C63582tM r7, AnonymousClass37E r8, AnonymousClass10I r9, AnonymousClass19K r10) {
        this.A03 = r4;
        this.A07 = r9;
        this.A0E = false;
        this.A01 = r2;
        this.A09 = r5;
        this.A08 = r10;
        this.A02 = r3;
        this.A05 = r7;
        this.A06 = r8;
        this.A04 = r6;
        r8.A00 = this;
    }
}
