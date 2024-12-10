package com.whatsapp.stickers.info.bottomsheet;

import X.AnonymousClass00H;
import X.AnonymousClass1E7;
import X.AnonymousClass1J2;
import X.AnonymousClass1SB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass7RQ;
import X.C122606Ra;
import X.C136636u8;
import X.C1418377d;
import X.C18030ve;
import X.C18070vi;
import X.C18600wl;
import X.C25311Ns;
import X.C26811To;
import X.C33251iW;
import X.C41731wy;

public final class StickerInfoViewModel extends AnonymousClass1J2 {
    public AnonymousClass1E7 A00;
    public boolean A01;
    public boolean A02;
    public final C25311Ns A03;
    public final C33251iW A04;
    public final C26811To A05;
    public final C18030ve A06;
    public final AnonymousClass1SB A07;
    public final C41731wy A08 = AnonymousClass3MW.A0o();
    public final C41731wy A09 = AnonymousClass3MW.A0o();
    public final C41731wy A0A = AnonymousClass3MW.A0o();
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final C18600wl A0N;
    public final AnonymousClass00H A0O;

    public StickerInfoViewModel(C25311Ns r22, C33251iW r23, C26811To r24, C18030ve r25, AnonymousClass1SB r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35, AnonymousClass00H r36, AnonymousClass00H r37, AnonymousClass00H r38, AnonymousClass00H r39, C18600wl r40) {
        AnonymousClass00H r11 = r30;
        C18030ve r18 = r25;
        AnonymousClass00H r16 = r27;
        AnonymousClass00H r13 = r28;
        AnonymousClass00H r12 = r29;
        C18070vi.A0w(r18, r16, r13, r12, r11);
        AnonymousClass00H r14 = r31;
        AnonymousClass00H r10 = r32;
        AnonymousClass00H r9 = r33;
        AnonymousClass00H r8 = r34;
        AnonymousClass1SB r17 = r26;
        C18070vi.A0x(r14, r10, r17, r9, r8);
        AnonymousClass00H r7 = r35;
        AnonymousClass00H r6 = r36;
        AnonymousClass00H r5 = r37;
        AnonymousClass00H r4 = r38;
        C18600wl r2 = r40;
        C18070vi.A0y(r7, r6, r2, r5, r4);
        AnonymousClass00H r3 = r39;
        C25311Ns r20 = r22;
        C33251iW r19 = r23;
        C26811To r15 = r24;
        C18070vi.A0t(r15, r19, r20, r3);
        this.A06 = r18;
        this.A0E = r16;
        this.A0F = r13;
        this.A0M = r12;
        this.A0J = r11;
        this.A0O = r14;
        this.A0C = r10;
        this.A07 = r17;
        this.A0D = r9;
        this.A0K = r8;
        this.A0H = r7;
        this.A0B = r6;
        this.A0N = r2;
        this.A0I = r5;
        this.A0G = r4;
        this.A05 = r15;
        this.A04 = r19;
        this.A03 = r20;
        this.A0L = r3;
    }

    public final void A0T(C1418377d r3, C136636u8 r4, C122606Ra r5) {
        if (r5 != C122606Ra.TRAY_RECENT) {
            if (r4.A09) {
                this.A07.A0J(C18070vi.A0M(r3));
            }
        } else if (r4.A0C) {
            AnonymousClass7RQ.A02(AnonymousClass3MX.A0x(this.A0O), this, r3, 34);
        }
    }

    public static final int A00(C122606Ra r0) {
        switch (r0.ordinal()) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
            case 5:
                return 1;
            case 6:
                return 14;
            case 7:
                return 9;
            case 8:
                return 8;
            default:
                return -1;
        }
    }
}
