package X;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4X4  reason: invalid class name */
public final class AnonymousClass4X4 {
    public long A00;
    public AnonymousClass4L1 A01;
    public AnonymousClass1EC A02;
    public final AnonymousClass190 A03;
    public final AnonymousClass11S A04;
    public final AnonymousClass1M9 A05;
    public final C25111Mx A06;
    public final C24791Lr A07;
    public final AnonymousClass11P A08;
    public final AnonymousClass1PS A09;
    public final C18030ve A0A;
    public final C57672jS A0B;
    public final AnonymousClass126 A0C;
    public final C39501tB A0D;
    public final AnonymousClass4QG A0E;
    public final AnonymousClass1OZ A0F;
    public final C27071Up A0G;
    public final Map A0H = Collections.synchronizedMap(C17880vN.A11());
    public final AtomicInteger A0I;
    public final AnonymousClass1GC A0J;
    public final AnonymousClass1KB A0K;
    public final C36331ni A0L;

    public AnonymousClass4X4(AnonymousClass1F9 r18, AnonymousClass190 r19, AnonymousClass1KB r20, AnonymousClass11S r21, AnonymousClass4L1 r22, AnonymousClass1M9 r23, C25111Mx r24, C24791Lr r25, AnonymousClass11P r26, AnonymousClass1PS r27, C18030ve r28, C57672jS r29, AnonymousClass126 r30, C39501tB r31, AnonymousClass4QG r32, AnonymousClass1OZ r33, C27071Up r34, C36331ni r35) {
        AnonymousClass11P r10 = r26;
        C18030ve r0 = r28;
        AnonymousClass11S r14 = r21;
        AnonymousClass190 r16 = r19;
        AnonymousClass1KB r15 = r20;
        C18070vi.A0w(r10, r0, r15, r16, r14);
        AnonymousClass126 r7 = r30;
        AnonymousClass1OZ r4 = r33;
        C36331ni r2 = r35;
        AnonymousClass1M9 r13 = r23;
        C25111Mx r12 = r24;
        C18070vi.A0x(r4, r13, r7, r12, r2);
        C57672jS r8 = r29;
        C39501tB r6 = r31;
        AnonymousClass4QG r5 = r32;
        C27071Up r3 = r34;
        C24791Lr r11 = r25;
        C18070vi.A0y(r11, r3, r6, r8, r5);
        AnonymousClass1PS r9 = r27;
        C18070vi.A0d(r9, 16);
        this.A08 = r10;
        this.A0A = r0;
        this.A0K = r15;
        this.A03 = r16;
        this.A04 = r14;
        this.A0F = r4;
        this.A05 = r13;
        this.A0C = r7;
        this.A06 = r12;
        this.A0L = r2;
        this.A07 = r11;
        this.A0G = r3;
        this.A0D = r6;
        this.A0B = r8;
        this.A0E = r5;
        this.A09 = r9;
        this.A01 = r22;
        boolean z = false;
        this.A0I = new AtomicInteger(0);
        C17960vV.A02();
        C17960vV.A0D(((C23391Fw) r18.getLifecycle()).A02 != C23401Fx.DESTROYED ? true : z);
        C91424ff r210 = new C91424ff(this, 1);
        this.A0J = r210;
        r18.getLifecycle().A05(r210);
    }

    public static final void A00(AnonymousClass4X4 r5, int i) {
        if (i == 0) {
            r5.A0L.A00(11, AnonymousClass11P.A01(r5.A08) - r5.A00);
            AnonymousClass1EC r2 = r5.A02;
            if (r2 != null) {
                Map map = r5.A0H;
                C18070vi.A0W(map);
                if (!map.isEmpty()) {
                    C98804rk.A00(r5.A0K, r5, r2, 29);
                }
            }
        }
    }
}
