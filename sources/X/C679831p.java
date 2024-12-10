package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.31p  reason: invalid class name and case insensitive filesystem */
public class C679831p implements AnonymousClass18K {
    public long A00;
    public C25847Cn3 A01;
    public C25847Cn3 A02;
    public C25847Cn3 A03;
    public C25847Cn3 A04;
    public C25831Cmk A05;
    public C25831Cmk A06;
    public C25831Cmk A07;
    public C25831Cmk A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public boolean A0B;
    public int A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final AnonymousClass11N A0H;
    public final C19830z4 A0I;
    public final C18030ve A0J;
    public final AnonymousClass18F A0K;
    public final AnonymousClass182 A0L;
    public final AnonymousClass189 A0M;
    public final AnonymousClass185 A0N;
    public final AnonymousClass183 A0O;
    public final AnonymousClass00H A0P;
    public final CountDownLatch A0Q = new CountDownLatch(1);
    public final CountDownLatch A0R = new CountDownLatch(1);
    public final CountDownLatch A0S = new CountDownLatch(1);
    public final CountDownLatch A0T = new CountDownLatch(1);
    public final AnonymousClass18D A0U;
    public final AnonymousClass187 A0V;
    public final AnonymousClass00H A0W;
    public volatile int A0X;
    public volatile boolean A0Y;
    public volatile boolean A0Z;

    public AnonymousClass1Be BDn(AnonymousClass184 r4, C18180vt r5) {
        AnonymousClass18D r1 = this.A0U;
        int i = r4.code;
        if (r5 == null) {
            r5 = r4.samplingRate;
        }
        return new AnonymousClass1Be(r1.A00(r5, i, false));
    }

    public void BHx() {
    }

    public void BdD(Context context, C23031Eg r6, C23041Eh r7, AnonymousClass00H r8, AnonymousClass00H r9, int i, int i2, boolean z) {
        this.A0A = r8;
        this.A09 = r9;
        this.A0Y = z;
        this.A0X = i2;
        this.A0L.A00 = this;
        C18030ve r1 = this.A0J;
        synchronized (r1) {
            r1.A02 = this;
        }
        this.A0O.A00.execute(new AnonymousClass3C1(context, this, i));
        AnonymousClass189 r2 = this.A0M;
        r2.A02.A00.execute(new C146797Qq(r2, r6, 3));
    }

    public void CC3(C18180vt r9, byte[] bArr, int i, int i2) {
        C27077DTb dTb;
        C200710s r0;
        int i3 = i;
        Integer A002 = this.A0U.A00(r9, i, false);
        if (A002 != null) {
            int intValue = A002.intValue();
            if (!this.A0B) {
                byte[] bArr2 = bArr;
                int i4 = i2;
                if (i2 == 0 || i2 == 1) {
                    dTb = new C27077DTb(this, bArr2, i4, i3, intValue, 2);
                    r0 = this.A0O.A01;
                } else {
                    dTb = new C27077DTb(this, bArr2, i4, i3, intValue, 3);
                    r0 = this.A0O.A02;
                }
                r0.execute(dTb);
            }
        }
    }

    public void CC4(AnonymousClass184 r3) {
        CC0(r3, (C18180vt) null, true);
    }

    public void CC6(AnonymousClass184 r2, C18180vt r3) {
        CC0(r2, r3, false);
    }

    public void CC7(AnonymousClass184 r3) {
        CC0(r3, (C18180vt) null, false);
    }

    public void CHJ(boolean z) {
        int nextInt;
        C70813Cp r1 = new C70813Cp(3, (Object) this, z);
        AnonymousClass183 r2 = this.A0O;
        r2.A01.execute(r1);
        C70813Cp r0 = new C70813Cp(1, (Object) this, z);
        C200710s r5 = r2.A02;
        r5.execute(r0);
        if (this.A0X <= 0 || (nextInt = new Random().nextInt(this.A0X) + 5) <= 0) {
            r5.execute(new C70813Cp(2, (Object) this, z));
            return;
        }
        r5.A05(new C146837Qu(this, nextInt, 0, z), C17890vO.A03(nextInt));
    }

    public void CKD(int i) {
        synchronized (this) {
            this.A0X = i;
        }
    }

    private void A01() {
        int i = (this.A0C + 1) % 10;
        this.A0C = i;
        if (i == 0) {
            this.A0N.A0d();
        }
    }

    private void A02(AnonymousClass184 r4, int i) {
        C70863Cu r1;
        C200710s r0;
        if (!this.A0B) {
            int i2 = r4.bufferChannel;
            if (i2 == 3) {
                int[] iArr = C50812Vw.A00;
                if (iArr[0] != r4.code) {
                    return;
                }
            } else if (i2 == 0 || i2 == 1) {
                r1 = new C70863Cu(this, i, 12, r4);
                r0 = this.A0O.A01;
                r0.execute(r1);
            }
            r1 = new C70863Cu(this, i, 13, r4);
            r0 = this.A0O.A02;
            r0.execute(r1);
        }
    }

    public static void A03(AnonymousClass184 r3, C679831p r4) {
        if (C18020vd.A05(C18040vf.A02, r4.A0V.A00, 8835) && !(r3 instanceof C31151f6)) {
            int i = r3.bufferChannel;
            if (i == 0 || i == 1) {
                for (AnonymousClass184 CC7 : AnonymousClass187.A00(r3, r3.validate())) {
                    r4.CC7(CC7);
                }
            }
        }
    }

    public static void A05(C679831p r6) {
        if (r6.A05.A01() > r6.A02.A04.A00.A04.A02.remaining() && !r6.A02.A07()) {
            if (r6.A02.A04.A05()) {
                r6.A02.A04();
                r6.A0N.A0d();
                r6.A05.A03((Integer) null);
            } else {
                AnonymousClass185 r4 = r6.A0N;
                Long l = r4.A0N;
                Long A0L2 = C17890vO.A0L();
                if (l == null) {
                    r4.A0N = A0L2;
                    l = A0L2;
                }
                Long l2 = r4.A0O;
                if (l2 == null) {
                    r4.A0O = A0L2;
                    l2 = A0L2;
                }
                r4.A0N = A00(l);
                r4.A0O = C17880vN.A0o(l2.longValue(), (long) r6.A05.A01());
                r4.A0d();
                C17900vP.A0g("wamruntime/recordPrivateStatsDroppedEvent: ", "no space in buffer for more events", AnonymousClass000.A10());
                return;
            }
        }
        if (r6.A05.A01() > r6.A02.A01()) {
            Log.e("wamruntime/logPrivateStatsEventInternal: dropping event because it is larger than the buffer itself");
            return;
        }
        C25847Cn3 cn3 = r6.A02;
        C25831Cmk cmk = r6.A05;
        cn3.A05(cmk.A01, cmk.A02);
        r6.A01();
        r6.A02.A03();
        ((C1605688z) r6.A09.get()).CHI(r6.A02, true);
    }

    public static void A06(C679831p r3) {
        if (r3.A06.A01() > r3.A03.A04.A00.A04.A02.remaining() && !r3.A03.A07()) {
            if (r3.A03.A04.A05()) {
                r3.A03.A04();
                r3.A0N.A0d();
                r3.A06.A03((Integer) null);
            } else {
                A09(r3, "no space in buffer for more events");
                return;
            }
        }
        if (r3.A06.A01() > r3.A03.A01()) {
            Log.e("wamruntime/logPrivateStatsEventInternal: dropping event because it is larger than the buffer itself");
            return;
        }
        C25847Cn3 cn3 = r3.A03;
        C25831Cmk cmk = r3.A06;
        cn3.A05(cmk.A01, cmk.A02);
        r3.A0N.A0S = Long.valueOf(r3.A03.A02());
        r3.A01();
        r3.A03.A03();
    }

    public static void A07(C679831p r6) {
        if (r6.A07.A01() > r6.A04.A04.A00.A04.A02.remaining() && !r6.A04.A07()) {
            if (r6.A04.A04.A05()) {
                r6.A04.A04();
                r6.A07.A03((Integer) null);
            } else {
                AnonymousClass185 r4 = r6.A0N;
                Long l = r4.A0P;
                Long A0L2 = C17890vO.A0L();
                if (l == null) {
                    r4.A0P = A0L2;
                    l = A0L2;
                }
                Long l2 = r4.A0Q;
                if (l2 == null) {
                    r4.A0Q = A0L2;
                    l2 = A0L2;
                }
                r4.A0P = A00(l);
                r4.A0Q = C17880vN.A0o(l2.longValue(), (long) r6.A07.A01());
                r4.A0d();
                Log.w("wamruntime/logevent: no room for a new event record");
                return;
            }
        }
        if (r6.A07.A01() > r6.A04.A01()) {
            Log.e("wamruntime/logevent: dropping wam real time event because it is larger than the buffer itself");
            return;
        }
        C25847Cn3 cn3 = r6.A04;
        C25831Cmk cmk = r6.A07;
        cn3.A05(cmk.A01, cmk.A02);
        r6.A0N.A0T = Long.valueOf(r6.A04.A02());
        r6.A01();
        r6.A04.A03();
        ((C1605688z) r6.A0A.get()).CHI(r6.A04, false);
    }

    public static void A08(C679831p r6, int i, boolean z) {
        if (r6.A08.A01() > r6.A01.A04.A00.A04.A02.remaining() && !r6.A01.A07()) {
            if (r6.A01.A04.A05()) {
                r6.A01.A04();
                ((AnonymousClass18H) r6.A0P.get()).A00(false);
                r6.A08.A03((Integer) null);
            } else {
                r6.A08.A01();
                AnonymousClass185 r5 = r6.A0N;
                Long l = r5.A0J;
                Long A0L2 = C17890vO.A0L();
                if (l == null) {
                    r5.A0J = A0L2;
                    l = A0L2;
                }
                Long l2 = r5.A0K;
                if (l2 == null) {
                    r5.A0K = A0L2;
                    l2 = A0L2;
                }
                r5.A0J = A00(l);
                r5.A0K = C17880vN.A0o(l2.longValue(), (long) r6.A08.A01());
                r5.A0d();
                if (r6.A0Y) {
                    C18100vl r1 = r6.A0K.A00;
                    SharedPreferences A0C2 = C17880vN.A0C(r1);
                    String valueOf = String.valueOf(i);
                    C17880vN.A1C(C17890vO.A0A(r1), valueOf, A0C2.getInt(valueOf, 0) + 1);
                }
                Log.w("wamruntime/recordDroppedEvent");
                return;
            }
        }
        if (r6.A08.A01() > r6.A01.A01()) {
            Log.e("wamruntime/logevent: dropping event because it is larger than the buffer itself");
            return;
        }
        C25847Cn3 cn3 = r6.A01;
        C25831Cmk cmk = r6.A08;
        cn3.A05(cmk.A01, cmk.A02);
        AnonymousClass185 r3 = r6.A0N;
        r3.A0R = Long.valueOf(r6.A01.A02());
        r6.A01();
        C25847Cn3 cn32 = r6.A01;
        if (cn32.A04.A00.A00() == 1 && !z) {
            if (!cn32.A01) {
                r3.A0E = true;
            }
            if (!r3.A0e()) {
                A04(r3, r6, 0, true);
            }
            if (r6.A0Y) {
                AnonymousClass18F r52 = r6.A0K;
                C18100vl r32 = r52.A00;
                List<AnonymousClass184> A062 = AnonymousClass1b2.A06(AnonymousClass1b2.A0C(C1590483a.A00, AnonymousClass1b2.A09(C71933Ix.A00, AnonymousClass1b2.A0C(new AnonymousClass3IO(r52), C29431cG.A0V(C17880vN.A0C(r32).getAll().keySet())))));
                C17900vP.A0J(C17880vN.A0C(r32));
                for (AnonymousClass184 A042 : A062) {
                    A04(A042, r6, 0, true);
                }
            }
        }
    }

    public static void A09(C679831p r5, String str) {
        AnonymousClass185 r4 = r5.A0N;
        Long l = r4.A0L;
        Long A0L2 = C17890vO.A0L();
        if (l == null) {
            r4.A0L = A0L2;
            l = A0L2;
        }
        Long l2 = r4.A0M;
        if (l2 == null) {
            r4.A0M = A0L2;
            l2 = A0L2;
        }
        r4.A0L = A00(l);
        r4.A0M = C17880vN.A0o(l2.longValue(), (long) r5.A06.A01());
        r4.A0d();
        C17900vP.A0g("wamruntime/recordPrivateStatsDroppedEvent: ", str, AnonymousClass000.A10());
    }

    private void A0A(CountDownLatch countDownLatch) {
        C200710s r0;
        if (countDownLatch == this.A0S || countDownLatch == this.A0R) {
            r0 = this.A0O.A02;
        } else {
            r0 = this.A0O.A01;
        }
        r0.A02();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("wamruntime: unexpected thread interrupt (");
            A10.append(e);
            Log.a(AnonymousClass000.A0y(")", A10));
            Thread.currentThread().interrupt();
        }
    }

    public static boolean A0B(C679831p r2) {
        if (!r2.A0D) {
            r2.A0A(r2.A0Q);
            r2.A0M.A00(0);
            r2.A0D = true;
        }
        return r2.A01.A01;
    }

    public static boolean A0C(C679831p r2) {
        if (!r2.A0E) {
            r2.A0A(r2.A0R);
            r2.A0M.A00(3);
            r2.A0E = true;
        }
        return r2.A02.A01;
    }

    public static boolean A0D(C679831p r2) {
        if (!r2.A0F) {
            r2.A0A(r2.A0S);
            r2.A0M.A00(2);
            r2.A0F = true;
        }
        return r2.A03.A01;
    }

    public static boolean A0E(C679831p r2) {
        if (!r2.A0G) {
            r2.A0A(r2.A0T);
            r2.A0M.A00(1);
            r2.A0G = true;
        }
        return r2.A04.A01;
    }

    public void Bio() {
        this.A0O.A01.execute(new C146747Ql(this, 21));
    }

    public void C13() {
        C18030ve r3 = this.A0J;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A00(r2, r3, 7018) != 600 || C18020vd.A05(r2, r3, 9654)) {
            ((C203811x) this.A0W.get()).A00(new C680131s(this));
        }
    }

    public void CC0(AnonymousClass184 r5, C18180vt r6, boolean z) {
        String str;
        AnonymousClass18D r1 = this.A0U;
        int i = r5.code;
        if (r6 == null) {
            r6 = r5.samplingRate;
        }
        Integer A002 = r1.A00(r6, i, z);
        if (A002 != null) {
            A02(r5, A002.intValue());
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("(sampled with weight ");
            A10.append(A002);
            str = AnonymousClass000.A0y(")", A10);
        } else {
            str = "(dropped)";
        }
        if (r5 instanceof WamCall) {
            StringBuilder A11 = AnonymousClass000.A11("wamruntime/printevent");
            A11.append(str);
            C17900vP.A0Y(r5, ": ", A11);
        }
    }

    public void CC8(AnonymousClass184 r5, AnonymousClass1Be r6) {
        Integer num = r6.A00;
        if (num != null) {
            A02(r5, num.intValue());
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("(with weight=");
            A10.append(num);
            String A0y = AnonymousClass000.A0y(")", A10);
            if (r5 instanceof WamCall) {
                StringBuilder A11 = AnonymousClass000.A11("wamruntime/printevent");
                A11.append(A0y);
                C17900vP.A0Y(r5, ": ", A11);
            }
        }
    }

    public void CO1() {
        this.A00 = TimeUnit.SECONDS.toMillis((long) Math.min(300, C18020vd.A00(C18040vf.A02, this.A0J, 7018)));
        C146747Ql r1 = new C146747Ql(this, 19);
        AnonymousClass183 r2 = this.A0O;
        r2.A01.execute(r1);
        r2.A02.execute(new C146747Ql(this, 20));
    }

    public C679831p(AnonymousClass11N r3, C19830z4 r4, C18030ve r5, AnonymousClass18F r6, AnonymousClass18D r7, AnonymousClass182 r8, AnonymousClass189 r9, AnonymousClass185 r10, AnonymousClass183 r11, AnonymousClass187 r12, AnonymousClass00H r13, AnonymousClass00H r14, boolean z) {
        this.A0J = r5;
        this.A0L = r8;
        this.A0O = r11;
        this.A0N = r10;
        this.A0V = r12;
        this.A0M = r9;
        this.A0I = r4;
        this.A0P = r13;
        this.A0U = r7;
        this.A0K = r6;
        this.A0H = r3;
        this.A0W = r14;
        this.A0B = z;
        this.A0Z = false;
    }

    public static Long A00(Number number) {
        return Long.valueOf(number.longValue() + 1);
    }

    public static void A04(AnonymousClass184 r2, C679831p r3, int i, boolean z) {
        if (A0B(r3) && !r3.A0B) {
            r3.A08.A02(r2, i);
            r3.A08.A03((Integer) null);
            A08(r3, r2.code, z);
            AnonymousClass185 r0 = r3.A0N;
            if (r2 == r0) {
                r0.A0J = null;
                r0.A0K = null;
                r0.A0G = null;
                r0.A0L = null;
                r0.A0M = null;
                r0.A0N = null;
                r0.A0O = null;
                r0.A0P = null;
                r0.A0Q = null;
                r0.A06 = null;
                r0.A07 = null;
                r0.A08 = null;
                r0.A09 = null;
                r0.A0A = null;
                r0.A05 = null;
                r0.A04 = null;
                r0.A03 = null;
                r0.A02 = null;
                r0.A0I = null;
                r0.A0H = null;
                r0.A0F = null;
                r0.A0E = null;
                r0.A0D = null;
                r0.A0C = null;
                r0.A0B = null;
                r0.A01 = null;
                r0.A00 = null;
                r0.A0d();
            }
            if (!z) {
                r3.A01.A03();
            }
        }
    }
}
