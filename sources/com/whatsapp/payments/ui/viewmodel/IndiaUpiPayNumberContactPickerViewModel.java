package com.whatsapp.payments.ui.viewmodel;

import X.A7U;
import X.AnonymousClass00H;
import X.AnonymousClass118;
import X.AnonymousClass11P;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1KB;
import X.AnonymousClass1KI;
import X.AnonymousClass3MW;
import X.AnonymousClass8BR;
import X.AnonymousClass90Z;
import X.C132916nr;
import X.C175788zH;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C191339mR;
import X.C196199uc;
import X.C30931ek;
import X.C31061ex;
import java.util.concurrent.TimeUnit;

public final class IndiaUpiPayNumberContactPickerViewModel extends AnonymousClass1J2 {
    public C175788zH A00;
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public final C18030ve A03;
    public final C191339mR A04;
    public final C132916nr A05;
    public final AnonymousClass1KB A06;
    public final AnonymousClass11P A07;
    public final AnonymousClass118 A08;
    public final AnonymousClass1KI A09;
    public final C196199uc A0A;
    public final A7U A0B;
    public final C31061ex A0C;
    public final AnonymousClass90Z A0D;
    public final C30931ek A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;

    public IndiaUpiPayNumberContactPickerViewModel(AnonymousClass1KB r24, AnonymousClass11P r25, AnonymousClass118 r26, AnonymousClass1KI r27, C18030ve r28, C196199uc r29, A7U a7u, C191339mR r31, C31061ex r32, AnonymousClass90Z r33, C30931ek r34, AnonymousClass00H r35, AnonymousClass00H r36) {
        AnonymousClass1KB r14 = r24;
        AnonymousClass11P r13 = r25;
        AnonymousClass118 r12 = r26;
        C18030ve r1 = r28;
        AnonymousClass00H r11 = r35;
        C18070vi.A0w(r13, r1, r14, r12, r11);
        AnonymousClass1KI r15 = r27;
        A7U a7u2 = a7u;
        C191339mR r0 = r31;
        C31061ex r7 = r32;
        C30931ek r5 = r34;
        C18070vi.A0x(r5, a7u2, r0, r7, r15);
        C196199uc r9 = r29;
        AnonymousClass90Z r6 = r33;
        AnonymousClass00H r10 = r36;
        C18070vi.A0r(r9, r10, r6);
        this.A07 = r13;
        this.A03 = r1;
        this.A06 = r14;
        this.A08 = r12;
        this.A0F = r11;
        this.A0E = r5;
        this.A0B = a7u2;
        this.A04 = r0;
        this.A0C = r7;
        this.A09 = r15;
        this.A0A = r9;
        this.A0G = r10;
        this.A0D = r6;
        this.A05 = new C132916nr(r13, TimeUnit.MILLISECONDS, AnonymousClass8BR.A05(this.A03, 11499));
        A7U a7u3 = a7u2;
        C196199uc r17 = r9;
        this.A00 = new C175788zH(r12.A00, r14, r15, C17880vN.A0U(r11), r17, a7u3, AnonymousClass8BR.A0a(r10), r7, r6, r5);
    }
}
