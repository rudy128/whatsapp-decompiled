package X;

import android.os.PowerManager;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;

/* renamed from: X.2kJ  reason: invalid class name and case insensitive filesystem */
public final class C58202kJ {
    public PowerManager.WakeLock A00;
    public final AnonymousClass11C A01;
    public final AnonymousClass190 A02;
    public final C218617r A03;
    public final C25311Ns A04;
    public final AnonymousClass1NM A05;
    public final AnonymousClass196 A06;
    public final AnonymousClass1ST A07;
    public final C18030ve A08;
    public final AnonymousClass18K A09;
    public final C32041gX A0A;
    public final C25351Nw A0B;
    public final C25291Nq A0C;
    public final WamediaManager A0D;
    public final C136906ub A0E;
    public final C26431Sc A0F;
    public final AnonymousClass1NL A0G;
    public final C26521Sl A0H;
    public final AnonymousClass1SO A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;

    public C58202kJ(AnonymousClass190 r26, C218617r r27, C25311Ns r28, AnonymousClass1NM r29, AnonymousClass11C r30, AnonymousClass196 r31, AnonymousClass1ST r32, C18030ve r33, AnonymousClass18K r34, C32041gX r35, C25351Nw r36, C25291Nq r37, WamediaManager wamediaManager, C136906ub r39, C26431Sc r40, AnonymousClass1NL r41, C26521Sl r42, AnonymousClass1SO r43, AnonymousClass00H r44, AnonymousClass00H r45, AnonymousClass00H r46, AnonymousClass00H r47, AnonymousClass00H r48) {
        C18030ve r17 = r33;
        AnonymousClass18K r16 = r34;
        C136906ub r11 = r39;
        AnonymousClass190 r24 = r26;
        C218617r r23 = r27;
        C18070vi.A0w(r17, r24, r23, r16, r11);
        C26521Sl r8 = r42;
        AnonymousClass00H r6 = r44;
        C25291Nq r15 = r37;
        WamediaManager wamediaManager2 = wamediaManager;
        AnonymousClass11C r20 = r30;
        C18070vi.A0x(r6, r15, r8, r20, wamediaManager2);
        C26431Sc r10 = r40;
        AnonymousClass00H r5 = r45;
        AnonymousClass196 r19 = r31;
        AnonymousClass1ST r18 = r32;
        AnonymousClass1NM r21 = r29;
        C18070vi.A0y(r10, r19, r18, r5, r21);
        AnonymousClass1NL r9 = r41;
        AnonymousClass1SO r7 = r43;
        AnonymousClass00H r4 = r46;
        AnonymousClass00H r3 = r47;
        C18070vi.A0t(r7, r9, r4, r3);
        AnonymousClass00H r2 = r48;
        C32041gX r12 = r35;
        C25351Nw r13 = r36;
        C25311Ns r22 = r28;
        C18070vi.A0u(r13, r22, r12, r2);
        this.A08 = r17;
        this.A02 = r24;
        this.A03 = r23;
        this.A09 = r16;
        this.A0E = r11;
        this.A0L = r6;
        this.A0C = r15;
        this.A0H = r8;
        this.A01 = r20;
        this.A0D = wamediaManager2;
        this.A0F = r10;
        this.A06 = r19;
        this.A07 = r18;
        this.A0K = r5;
        this.A05 = r21;
        this.A0I = r7;
        this.A0G = r9;
        this.A0J = r4;
        this.A0N = r3;
        this.A0B = r13;
        this.A04 = r22;
        this.A0A = r12;
        this.A0M = r2;
    }

    public final C27086DTl A00(CXH cxh) {
        PowerManager.WakeLock wakeLock;
        CXH cxh2 = cxh;
        synchronized (this) {
            if (this.A00 == null) {
                PowerManager A0G2 = this.A01.A0G();
                if (A0G2 != null) {
                    this.A00 = C181789Rv.A00(A0G2, "mediatranscode", 1);
                } else {
                    Log.w("media-transcode-queue/get-transcode-wakelock pm=null");
                }
            }
            wakeLock = this.A00;
        }
        if (cxh2 instanceof C24015Bu1) {
            C18030ve r11 = this.A08;
            AnonymousClass190 r10 = this.A02;
            C218617r r9 = this.A03;
            C26431Sc r6 = this.A0F;
            WamediaManager wamediaManager = this.A0D;
            AnonymousClass196 r4 = this.A06;
            AnonymousClass1SO r3 = this.A0I;
            return new C24019Bu5(wakeLock, r10, r9, r4, this.A07, r11, wamediaManager, (C24015Bu1) cxh2, r6, (CT1) C18070vi.A0E(this.A0N), this.A0G, r3);
        } else if (cxh2 instanceof C24016Bu2) {
            C18030ve r14 = this.A08;
            AnonymousClass190 r13 = this.A02;
            C218617r r12 = this.A03;
            AnonymousClass18K r112 = this.A09;
            C26521Sl r102 = this.A0H;
            C26431Sc r92 = this.A0F;
            WamediaManager wamediaManager2 = this.A0D;
            AnonymousClass196 r5 = this.A06;
            AnonymousClass1ST r42 = this.A07;
            AnonymousClass1NM r32 = this.A05;
            AnonymousClass1SO r2 = this.A0I;
            AnonymousClass1NL r1 = this.A0G;
            C18030ve r18 = r14;
            C218617r r142 = r12;
            return new C24020Bu6(wakeLock, r13, r142, r32, r5, r42, r18, r112, this.A0B, wamediaManager2, (C24016Bu2) cxh2, r92, (CT1) C18070vi.A0E(this.A0N), r1, r102, r2);
        } else if (cxh2 instanceof C24014Bu0) {
            return new C24018Bu4(wakeLock, this.A03, this.A0D, (C24014Bu0) cxh2, this.A0I);
        } else if (cxh2 instanceof AnonymousClass68T) {
            C18030ve r113 = this.A08;
            AnonymousClass190 r103 = this.A02;
            C136906ub r62 = this.A0E;
            C25291Nq r52 = this.A0C;
            return new AnonymousClass68Y(wakeLock, r103, this.A01, (AnonymousClass11Z) C18070vi.A0E(this.A0L), this.A07, r113, this.A0A, this.A0B, r52, (C129076hD) C18070vi.A0E(this.A0J), r62, (AnonymousClass68T) cxh2);
        } else if (cxh2 instanceof AnonymousClass68U) {
            AnonymousClass190 r63 = this.A02;
            C218617r r53 = this.A03;
            AnonymousClass11C r43 = this.A01;
            WamediaManager wamediaManager3 = this.A0D;
            return new AnonymousClass68X(r63, r53, this.A04, r43, wamediaManager3, (C57852jk) C18070vi.A0E(this.A0M), (AnonymousClass68U) cxh2, (C138906xt) C18070vi.A0E(this.A0K));
        } else if (cxh2 instanceof AnonymousClass68S) {
            return new AnonymousClass68W(this.A01, this.A08, (AnonymousClass68S) cxh2, this.A0G);
        } else {
            throw new AssertionError("Unreachable code");
        }
    }
}
