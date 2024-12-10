package X;

import android.content.Context;
import android.os.ConditionVariable;

public class A1Q {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass1NT A04;
    public final C63632tR A05;
    public final AnonymousClass1R8 A06;
    public final AnonymousClass11P A07;
    public final AnonymousClass118 A08;
    public final C19830z4 A09;
    public final C18000vb A0A;
    public final C175228yM A0B = new C175228yM();
    public final C27431Wb A0C;
    public final C18030ve A0D;
    public final AnonymousClass18K A0E;
    public final AnonymousClass1LD A0F;
    public final AnonymousClass10I A0G;
    public final AnonymousClass19K A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final C27341Vs A0K;
    public final C27411Vz A0L;
    public final AnonymousClass1RW A0M;
    public final AnonymousClass1NM A0N;
    public final AnonymousClass11C A0O;
    public final AnonymousClass1Cd A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass00H A0S;
    public volatile int A0T;

    public static boolean A00(A1Q a1q, boolean z) {
        AnonymousClass11S r1 = a1q.A03;
        r1.A0I();
        if (r1.A00 == null || r1.A0N() || !a1q.A00 || !z || a1q.A0N.A02() || !a1q.A0L.A00.A02()) {
            return false;
        }
        return true;
    }

    public void A01(BCU bcu, C171828sL r24, int i) {
        long j;
        C175228yM r12 = this.A0B;
        r12.registerObserver(bcu);
        int i2 = i;
        if (i == 0) {
            j = 3000;
        } else {
            j = -1;
        }
        Context context = this.A08.A00;
        AnonymousClass11P r10 = this.A07;
        AnonymousClass11S r5 = this.A03;
        AnonymousClass00H r2 = this.A0Q;
        AnonymousClass11C r9 = this.A0O;
        this.A02.CGP(new AnonymousClass3Bx(this, new C177909Bb(context, r5, this.A0K, AnonymousClass8BS.A0A(this.A0I), this.A0M, r9, r10, this, r12, this.A0C, this.A0P, r24, (C57372iy) this.A0R.get(), (AnonymousClass1O1) this.A0S.get(), r2, i2, j), 36));
    }

    public boolean A02() {
        if (!A00(this, this.A0F.A01())) {
            return false;
        }
        C171828sL r2 = new C171828sL();
        r2.A0J = C108955ca.A0m();
        r2.A09 = C17880vN.A0i();
        A01(new ARA((ConditionVariable) null, this, r2), r2, 1);
        return true;
    }

    public A1Q(AnonymousClass1KB r3, AnonymousClass11S r4, C27341Vs r5, AnonymousClass1NT r6, C63632tR r7, C27411Vz r8, AnonymousClass1RW r9, AnonymousClass1R8 r10, AnonymousClass1NM r11, AnonymousClass11C r12, AnonymousClass11P r13, AnonymousClass118 r14, C19830z4 r15, C18000vb r16, C27431Wb r17, AnonymousClass1Cd r18, C18030ve r19, AnonymousClass18K r20, AnonymousClass1LD r21, AnonymousClass10I r22, AnonymousClass19K r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28) {
        this.A08 = r14;
        this.A07 = r13;
        this.A0D = r19;
        this.A02 = r3;
        this.A06 = r10;
        this.A03 = r4;
        this.A0J = r24;
        this.A0G = r22;
        this.A0E = r20;
        this.A0Q = r25;
        this.A0O = r12;
        this.A0A = r16;
        this.A0H = r23;
        this.A04 = r6;
        this.A0K = r5;
        this.A0N = r11;
        this.A05 = r7;
        this.A0C = r17;
        this.A0P = r18;
        this.A09 = r15;
        this.A0L = r8;
        this.A0S = r26;
        this.A0I = r27;
        AnonymousClass1LD r1 = r21;
        this.A0F = r1;
        this.A0R = r28;
        this.A0M = r9;
        r1.registerObserver(new C21053Adj(r13, this));
    }
}
