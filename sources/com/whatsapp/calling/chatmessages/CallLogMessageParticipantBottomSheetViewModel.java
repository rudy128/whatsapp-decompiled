package com.whatsapp.calling.chatmessages;

import X.A4u;
import X.AnonymousClass00H;
import X.AnonymousClass118;
import X.AnonymousClass11S;
import X.AnonymousClass126;
import X.AnonymousClass1G4;
import X.AnonymousClass1I8;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1TB;
import X.AnonymousClass1VP;
import X.AnonymousClass3MW;
import X.AnonymousClass4IV;
import X.C178119Bw;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18460wS;
import X.C18600wl;
import X.C24901Mc;
import X.C24921Me;
import X.C30391dr;
import X.C34071js;
import X.C37361pP;
import X.C41561wd;
import X.C89444cT;

public final class CallLogMessageParticipantBottomSheetViewModel extends AnonymousClass1J2 {
    public C178119Bw A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass11S A05;
    public final AnonymousClass1VP A06;
    public final A4u A07;
    public final AnonymousClass1M9 A08;
    public final C24921Me A09;
    public final AnonymousClass118 A0A;
    public final C18000vb A0B;
    public final AnonymousClass1TB A0C;
    public final AnonymousClass1MZ A0D;
    public final C18030ve A0E;
    public final AnonymousClass126 A0F;
    public final C24901Mc A0G;
    public final C89444cT A0H;
    public final AnonymousClass00H A0I;
    public final C18600wl A0J;
    public final C18600wl A0K;
    public final AnonymousClass1G4 A0L;
    public final AnonymousClass1G4 A0M;
    public final AnonymousClass1G4 A0N;
    public final AnonymousClass1G4 A0O;
    public final AnonymousClass1G4 A0P;
    public final AnonymousClass1G4 A0Q = C34071js.A00(C18460wS.A00);

    public CallLogMessageParticipantBottomSheetViewModel(C37361pP r20, AnonymousClass11S r21, AnonymousClass1VP r22, A4u a4u, AnonymousClass1M9 r24, C24921Me r25, AnonymousClass118 r26, C18000vb r27, AnonymousClass1TB r28, AnonymousClass1MZ r29, C18030ve r30, AnonymousClass126 r31, C24901Mc r32, AnonymousClass00H r33, C18600wl r34, C18600wl r35) {
        C18030ve r8 = r30;
        C18070vi.A0d(r8, 1);
        C18600wl r4 = r34;
        C18600wl r3 = r35;
        AnonymousClass1TB r10 = r28;
        C18070vi.A0p(r10, r4, r3);
        AnonymousClass1M9 r15 = r24;
        C18070vi.A0d(r15, 5);
        C24901Mc r6 = r32;
        C24921Me r13 = r25;
        AnonymousClass11S r17 = r21;
        AnonymousClass1VP r16 = r22;
        A4u a4u2 = a4u;
        C18070vi.A0x(r13, r17, r16, a4u2, r6);
        AnonymousClass126 r7 = r31;
        AnonymousClass00H r5 = r33;
        C18000vb r11 = r27;
        AnonymousClass1MZ r9 = r29;
        AnonymousClass118 r12 = r26;
        C18070vi.A0y(r7, r9, r12, r11, r5);
        C37361pP r18 = r20;
        C18070vi.A0d(r18, 16);
        this.A0E = r8;
        this.A0C = r10;
        this.A0J = r4;
        this.A0K = r3;
        this.A08 = r15;
        this.A09 = r13;
        this.A05 = r17;
        this.A06 = r16;
        this.A07 = a4u2;
        this.A0G = r6;
        this.A0F = r7;
        this.A0D = r9;
        this.A0A = r12;
        this.A0B = r11;
        this.A0I = r5;
        this.A0H = (C89444cT) r18.A02("call_log_message_key");
        AnonymousClass1I8 r36 = AnonymousClass4IV.A01;
        this.A0L = AnonymousClass3MW.A18(r36);
        this.A0M = AnonymousClass3MW.A18(true);
        this.A0P = AnonymousClass3MW.A18(r36);
        this.A0O = AnonymousClass3MW.A18(r36);
        this.A0N = AnonymousClass3MW.A18(r36);
        AnonymousClass3MW.A1X(this.A0J, new CallLogMessageParticipantBottomSheetViewModel$refreshParticipants$1(this, (C30391dr) null), C41561wd.A00(this));
    }
}
