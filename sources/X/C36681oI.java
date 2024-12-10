package X;

import com.whatsapp.util.Log;

/* renamed from: X.1oI  reason: invalid class name and case insensitive filesystem */
public class C36681oI implements AnonymousClass1GE {
    public C195759tr A00;
    public final C19880zA A01;
    public final C19880zA A02;
    public final C19880zA A03;
    public final C19880zA A04;
    public final AnonymousClass11S A05;
    public final C36671oH A06;
    public final C36641oE A07;
    public final C36651oF A08;
    public final C36661oG A09;
    public final C36631oD A0A;
    public final AnonymousClass1RK A0B;
    public final AnonymousClass1QO A0C;
    public final C36541o4 A0D;
    public final AnonymousClass10I A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final C19880zA A0J;
    public final AnonymousClass1KB A0K;
    public final C36691oJ A0L = new C36691oJ(this);
    public final C26911Ty A0M;
    public final AnonymousClass11P A0N;
    public final C18030ve A0O;
    public final C31071ey A0P;
    public final C36551o5 A0Q;

    public /* synthetic */ void BqQ(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C0B(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C3z(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C6E() {
    }

    public /* synthetic */ void C71(AnonymousClass1F9 r1) {
    }

    public void A00(AnonymousClass1F9 r3) {
        StringBuilder sb = new StringBuilder();
        sb.append("AsyncBannerDataFetcher/registerSubscriptionStateChangeObserver/");
        sb.append(r3.getClass().getSimpleName());
        Log.i(sb.toString());
        this.A0Q.registerObserver(this.A0L);
        r3.getLifecycle().A05(this);
    }

    public void A01(C72063Km r4) {
        C195759tr r0 = this.A00;
        if (r0 != null) {
            r4.Bqj(r0);
        } else {
            this.A0E.CGD(new AnonymousClass9BR(r4, this, 0), new Void[0]);
        }
    }

    public void BrH(AnonymousClass1F9 r3) {
        StringBuilder sb = new StringBuilder();
        sb.append("AsyncBannerDataFetcher/onLifecycleStateChanged/unregisterSubscriptionStateChangeObserver/");
        sb.append(r3.getClass().getSimpleName());
        Log.i(sb.toString());
        this.A0Q.unregisterObserver(this.A0L);
        r3.getLifecycle().A06(this);
    }

    public C36681oI(C19880zA r2, C19880zA r3, C19880zA r4, C19880zA r5, C19880zA r6, AnonymousClass1KB r7, AnonymousClass11S r8, C36671oH r9, C36641oE r10, C36651oF r11, C36661oG r12, C36631oD r13, C26911Ty r14, AnonymousClass11P r15, AnonymousClass1RK r16, C18030ve r17, AnonymousClass1QO r18, C31071ey r19, C36541o4 r20, C36551o5 r21, AnonymousClass10I r22, AnonymousClass00H r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26) {
        this.A0N = r15;
        this.A0O = r17;
        this.A0K = r7;
        this.A05 = r8;
        this.A0E = r22;
        this.A0I = r23;
        this.A0G = r24;
        this.A0H = r25;
        this.A0D = r20;
        this.A04 = r2;
        this.A03 = r3;
        this.A0C = r18;
        this.A0M = r14;
        this.A0B = r16;
        this.A0F = r26;
        this.A0P = r19;
        this.A02 = r4;
        this.A0J = r5;
        this.A0A = r13;
        this.A07 = r10;
        this.A08 = r11;
        this.A09 = r12;
        this.A01 = r6;
        this.A06 = r9;
        this.A0Q = r21;
    }
}
