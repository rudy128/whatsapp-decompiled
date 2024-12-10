package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Bd  reason: invalid class name */
public class AnonymousClass1Bd {
    public int A00 = -1;
    public int A01 = 1;
    public AnonymousClass1Be A02 = AnonymousClass1Be.A01;
    public C18180vt A03;
    public C222119a A04;
    public C62002qd A05;
    public C53702cx A06;
    public Long A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public final AnonymousClass190 A0B;
    public final AnonymousClass118 A0C;
    public final C18000vb A0D;
    public final C18030ve A0E;
    public final AnonymousClass18K A0F;
    public final C17910vQ A0G = C17910vQ.A04;
    public final AnonymousClass1Bc A0H;
    public final C18180vt A0I = new C18180vt(10, 1000, 25000, false);
    public final C18180vt A0J = new C18180vt(100, SearchActionVerificationClientService.NOTIFICATION_ID, 250000, false);
    public final C18180vt A0K = new C18180vt(100, SearchActionVerificationClientService.NOTIFICATION_ID, 250000, false);
    public final AnonymousClass10I A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final Handler A0O = new Handler(Looper.getMainLooper());
    public final AnonymousClass11P A0P;
    public final C18180vt A0Q;
    public final C18180vt A0R;
    public final C18180vt A0S;
    public final C17940vT A0T;
    public final AnonymousClass19V A0U;
    public final AnonymousClass19Y A0V;
    public final AnonymousClass19T A0W;
    public final AnonymousClass198 A0X;

    private void A01(int i, String str) {
        C18180vt r0;
        C22912BUx bUx;
        Long l;
        C26238Cvb cvb;
        String str2;
        int i2 = i;
        this.A00 = i;
        this.A08 = str;
        C17910vQ r3 = this.A0G;
        if (i != 24772609) {
            r3.A01 = SystemClock.elapsedRealtime();
            r3.A02 = SystemClock.uptimeMillis();
            r3.A03 = SystemClock.elapsedRealtimeNanos();
            switch (i) {
                case 24772610:
                    str2 = "lukewarm";
                    break;
                default:
                    str2 = "warm";
                    break;
            }
            A02(-1, str2);
        } else {
            A02(r3.A03, "cold");
            this.A04.A07.markerPoint(703928054, "attachBaseContext", r3.A00, TimeUnit.NANOSECONDS);
        }
        AnonymousClass1Be BDn = this.A0F.BDn(new AnonymousClass1Bg(), this.A03);
        this.A02 = BDn;
        if (BDn.A00 != null) {
            int A002 = C18020vd.A00(C18040vf.A02, this.A0E, 4216);
            AnonymousClass1CP r1 = (AnonymousClass1CP) this.A0M.get();
            if (A002 < 0) {
                AnonymousClass1CP.A00(r1, "app-startup", false);
            } else {
                AnonymousClass1CP.A00(r1, "app-startup", true);
            }
        }
        if (this.A04 != null) {
            if (C18020vd.A05(C18040vf.A02, this.A0E, 6084)) {
                C222119a r02 = this.A04;
                r02.A07.Bit(new C22531Bi(this), r02.A05.A06);
            }
        }
        switch (i) {
            case 24772609:
                r0 = this.A0I;
                break;
            case 24772610:
                r0 = this.A0K;
                break;
            default:
                r0 = this.A0J;
                break;
        }
        boolean A003 = r0.A00();
        this.A0A = A003;
        if (A003) {
            if (C18020vd.A05(C18040vf.A02, this.A0E, 11667)) {
                C25443Cfs.A00(this.A0C.A00, this.A0X, i);
                if (C25443Cfs.A00 == 2 && (bUx = C25443Cfs.A01) != null) {
                    MultiBufferLogger A012 = bUx.A01();
                    this.A06 = new C53702cx(A012);
                    AnonymousClass10E r12 = ((AnonymousClass19W) this.A0U).A00.A00;
                    this.A05 = new C62002qd(A012, (AnonymousClass11C) r12.AAp.get(), (C18010vc) r12.A9s.get());
                    C53702cx r4 = this.A06;
                    if (C25443Cfs.A00 != 2 || (cvb = C26238Cvb.A0A) == null || cvb.A04.get() == 0) {
                        l = null;
                    } else {
                        long nextInt = (((long) r4.A01.nextInt(Integer.MAX_VALUE)) << 16) & 281474976645120L;
                        r4.A00.writeStandardEntry(7, 46, 0, 0, i2, 0, nextInt | 562949953421312L);
                        l = Long.valueOf(nextInt);
                    }
                    this.A07 = l;
                }
            }
        }
    }

    private void A00() {
        C222119a r2 = this.A04;
        if (r2 == null) {
            AnonymousClass11P r1 = this.A0P;
            AnonymousClass118 r22 = this.A0C;
            AnonymousClass10I r9 = this.A0L;
            AnonymousClass18K r4 = this.A0F;
            AnonymousClass198 r8 = this.A0X;
            AnonymousClass19T r7 = this.A0W;
            C222119a r0 = new C222119a(r1, r22, this.A0E, r4, this.A0U, this.A0V, r7, r8, r9, "StartupTracker", 703928054);
            this.A04 = r0;
            r0.A05.A04 = true;
            return;
        }
        r2.A0B("is_object_already_create", true, true);
    }

    private void A02(long j, String str) {
        C222119a r4 = this.A04;
        if (r4 != null) {
            if (j > 0) {
                r4.A0D("StartupTracker", j);
            } else {
                r4.A07.markerEnd(r4.A05.A06, 4);
                r4.A0D("StartupTracker", -1);
            }
            this.A04.A0A("startup_type", str, true);
        }
    }

    public void A05(View view, Runnable runnable, String str, int i) {
        C29531cR r3 = new C29531cR(this, runnable, str, i);
        Handler handler = this.A0O;
        C18070vi.A0d(view, 0);
        C18070vi.A0d(handler, 2);
        view.getViewTreeObserver().addOnPreDrawListener(new C29541cS(handler, view, r3));
    }

    public void A06(View view, Runnable runnable, String str, int i) {
        if (this.A00 != -1) {
            A0B(str, "onRestart", "_start");
        } else if (!this.A09) {
            this.A09 = true;
            A00();
            A05(view, runnable, str, i);
            this.A01 = 2;
            this.A03 = this.A0R;
            A01(24772611, str);
        }
    }

    public void A07(String str) {
        C26238Cvb cvb;
        int i = this.A00;
        if (i != -1) {
            if (this.A0A && C25443Cfs.A00 == 2 && (cvb = C26238Cvb.A0A) != null) {
                C26238Cvb.A03(cvb, C25546Chj.A02, 0, 2, (long) i);
            }
            if (this.A04 != null) {
                if (C18020vd.A05(C18040vf.A02, this.A0E, 1807)) {
                    this.A04.A0A("abort_reason", str, true);
                }
            }
            C222119a r3 = this.A04;
            if (r3 != null) {
                r3.A0A("locale", this.A0D.A06(), true);
                this.A04.A0C(105);
            }
            if (this.A02.A00 != null) {
                ((AnonymousClass1CP) this.A0M.get()).A01("app-startup");
            }
            this.A00 = -1;
            this.A08 = null;
            this.A0A = false;
            this.A07 = null;
        }
    }

    public void A08(String str) {
        C222119a r0 = this.A04;
        if (r0 != null) {
            r0.A06(str);
        }
    }

    public void A09(String str) {
        C222119a r0 = this.A04;
        if (r0 != null) {
            r0.A07(str);
        }
    }

    public void A0A(String str) {
        if (this.A00 == -1) {
            if (!this.A09) {
                this.A09 = true;
                A00();
                this.A01 = 3;
                this.A03 = this.A0S;
                A01(24772610, str);
            } else {
                return;
            }
        }
        A0B(str, "onCreate", "_start");
    }

    public void A0B(String str, String str2, String str3) {
        Long l;
        int i = this.A00;
        if (i != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(str3);
            String obj2 = sb2.toString();
            if (this.A0A && (l = this.A07) != null) {
                C53702cx r0 = this.A06;
                long longValue = l.longValue();
                MultiBufferLogger multiBufferLogger = r0.A00;
                multiBufferLogger.writeBytesEntry(1, 83, multiBufferLogger.writeStandardEntry(7, 50, 0, 0, i, 0, longValue), obj2);
            }
        }
    }

    public void A0C(boolean z) {
        C222119a r1 = this.A04;
        if (r1 != null) {
            r1.A0B("decompress_libraries", z, true);
        }
    }

    public AnonymousClass1Bd(AnonymousClass190 r7, AnonymousClass11P r8, AnonymousClass118 r9, C18000vb r10, C18030ve r11, AnonymousClass18K r12, AnonymousClass1Bc r13, C17940vT r14, AnonymousClass19V r15, AnonymousClass19Y r16, AnonymousClass19T r17, AnonymousClass198 r18, AnonymousClass10I r19, AnonymousClass00H r20, AnonymousClass00H r21) {
        this.A0P = r8;
        this.A0E = r11;
        this.A0B = r7;
        this.A0C = r9;
        this.A0L = r19;
        this.A0F = r12;
        this.A0D = r10;
        this.A0H = r13;
        this.A0X = r18;
        this.A0T = r14;
        this.A0N = r21;
        this.A0U = r15;
        this.A0M = r20;
        this.A0W = r17;
        this.A0V = r16;
        this.A0Q = new C18180vt(200, 1000);
        this.A0S = new C18180vt(2000, SearchActionVerificationClientService.NOTIFICATION_ID);
        this.A0R = new C18180vt(2000, SearchActionVerificationClientService.NOTIFICATION_ID);
    }

    public void A03() {
        Method method = AnonymousClass1CH.A03;
        Trace.beginSection("wa_startup_complete");
        Trace.endSection();
        C222119a r1 = this.A04;
        if (r1 != null) {
            r1.A06("render");
            C222119a r3 = this.A04;
            if (r3 != null) {
                r3.A0A("locale", this.A0D.A06(), true);
                this.A04.A0C(2);
            }
        }
    }

    public void A04() {
        if (!AnonymousClass1Bf.A00()) {
            A00();
            this.A0O.post(new C448925e(this, 1));
            this.A03 = this.A0Q;
            this.A01 = 1;
            A01(24772609, "AppInit");
        }
    }
}
