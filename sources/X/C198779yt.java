package X;

import com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager;
import java.util.Map;

/* renamed from: X.9yt  reason: invalid class name and case insensitive filesystem */
public final class C198779yt {
    public final AnonymousClass1KB A00;
    public final WfsNativeAuthManager A01;
    public final AnonymousClass11P A02;
    public final C19830z4 A03;
    public final AnonymousClass1P3 A04;
    public final AnonymousClass19F A05;
    public final C139576z4 A06;
    public final A98 A07;
    public final AnonymousClass10I A08;
    public final C58592kw A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final Map A0F;
    public final C18600wl A0G;
    public final C18600wl A0H;
    public final AnonymousClass1OX A0I;

    public C198779yt(AnonymousClass1KB r20, WfsNativeAuthManager wfsNativeAuthManager, AnonymousClass11P r22, C19830z4 r23, AnonymousClass1P3 r24, AnonymousClass19F r25, C139576z4 r26, A98 a98, AnonymousClass10I r28, C58592kw r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, Map map, C18600wl r36, C18600wl r37, AnonymousClass1OX r38) {
        AnonymousClass10I r0 = r28;
        C18070vi.A0d(r0, 1);
        AnonymousClass00H r10 = r30;
        A98 a982 = a98;
        AnonymousClass1KB r18 = r20;
        C72473Md.A1M(r18, a982, r10, 2);
        AnonymousClass00H r9 = r31;
        AnonymousClass1P3 r15 = r24;
        AnonymousClass19F r14 = r25;
        AnonymousClass11P r17 = r22;
        C19830z4 r16 = r23;
        C18070vi.A0x(r15, r17, r14, r16, r9);
        Map map2 = map;
        C18600wl r4 = r36;
        AnonymousClass1OX r2 = r38;
        AnonymousClass00H r8 = r32;
        C139576z4 r13 = r26;
        C18070vi.A0y(map2, r8, r13, r2, r4);
        AnonymousClass00H r6 = r34;
        C18600wl r3 = r37;
        C58592kw r11 = r29;
        AnonymousClass00H r7 = r33;
        C18070vi.A0t(r7, r6, r3, r11);
        this.A08 = r0;
        this.A00 = r18;
        this.A01 = wfsNativeAuthManager;
        this.A07 = a982;
        this.A0B = r10;
        this.A04 = r15;
        this.A02 = r17;
        this.A05 = r14;
        this.A03 = r16;
        this.A0A = r9;
        this.A0F = map2;
        this.A0C = r8;
        this.A06 = r13;
        this.A0I = r2;
        this.A0H = r4;
        this.A0D = r7;
        this.A0E = r6;
        this.A0G = r3;
        this.A09 = r11;
    }

    public static final void A00(BAU bau, C198779yt r4, Exception exc) {
        C31081ez.A03("WfsManager launchWfsFlow error", exc);
        r4.A00.CGP(new C21446AkD(bau, 7));
    }
}
