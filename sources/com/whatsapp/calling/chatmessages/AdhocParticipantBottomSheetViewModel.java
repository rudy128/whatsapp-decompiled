package com.whatsapp.calling.chatmessages;

import X.A4u;
import X.AnonymousClass000;
import X.AnonymousClass118;
import X.AnonymousClass11S;
import X.AnonymousClass1G4;
import X.AnonymousClass1I8;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass1TB;
import X.AnonymousClass1VP;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4IV;
import X.C178119Bw;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18460wS;
import X.C18600wl;
import X.C24921Me;
import X.C30391dr;
import X.C34071js;
import X.C37361pP;
import X.C41561wd;
import X.C72453Mb;
import X.C83604Fy;
import X.C83614Fz;
import X.C89444cT;
import android.content.Context;

public final class AdhocParticipantBottomSheetViewModel extends AnonymousClass1J2 {
    public C178119Bw A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final AnonymousClass11S A05;
    public final AnonymousClass1VP A06;
    public final A4u A07;
    public final AnonymousClass1M9 A08;
    public final C24921Me A09;
    public final AnonymousClass118 A0A;
    public final AnonymousClass1TB A0B;
    public final C89444cT A0C;
    public final C18600wl A0D;
    public final AnonymousClass1G4 A0E;
    public final AnonymousClass1G4 A0F;
    public final AnonymousClass1G4 A0G;
    public final AnonymousClass1G4 A0H;
    public final AnonymousClass1G4 A0I;
    public final boolean A0J;
    public final C18030ve A0K;

    public final void A0T(Context context, boolean z) {
        int i = this.A03;
        boolean A002 = C83614Fz.A00(i);
        int i2 = 3;
        Integer A0h = AnonymousClass3MY.A0h();
        boolean z2 = z;
        if (A002) {
            this.A06.BiX(A0h, (Integer) null, C72453Mb.A05(z ? 1 : 0), false);
        } else if (AnonymousClass3Ma.A1b(C83604Fy.A00(), i)) {
            AnonymousClass1VP r0 = this.A06;
            if (!z) {
                i2 = 2;
            }
            r0.BiW(i2, A0h);
        }
        C178119Bw r6 = this.A00;
        if (r6 != null) {
            this.A01 = true;
            AnonymousClass3MX.A1Q(new AdhocParticipantBottomSheetViewModel$clickCallButton$1$1(context, this, r6, (C30391dr) null, z2), C41561wd.A00(this));
        }
    }

    public AdhocParticipantBottomSheetViewModel(C37361pP r5, AnonymousClass11S r6, AnonymousClass1VP r7, A4u a4u, AnonymousClass1M9 r9, C24921Me r10, AnonymousClass118 r11, AnonymousClass1TB r12, C18030ve r13, C18600wl r14) {
        C18070vi.A0w(r13, r12, r14, r9, r10);
        C18070vi.A0x(r6, r7, a4u, r11, r5);
        this.A0K = r13;
        this.A0B = r12;
        this.A0D = r14;
        this.A08 = r9;
        this.A09 = r10;
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = a4u;
        this.A0A = r11;
        this.A0C = (C89444cT) r5.A02("call_log_message_key");
        this.A0J = C72453Mb.A1Y((Boolean) r5.A02("is_from_call_log"));
        Number number = (Number) r5.A02("call_from_ui");
        if (number != null) {
            this.A03 = number.intValue();
            this.A04 = C18020vd.A00(C18040vf.A02, r13, 862) - 1;
            this.A0I = C34071js.A00(C18460wS.A00);
            AnonymousClass1I8 r1 = AnonymousClass4IV.A01;
            this.A0G = AnonymousClass3MW.A18(r1);
            this.A0F = AnonymousClass3MW.A18(r1);
            this.A0H = AnonymousClass3MW.A18(0);
            this.A0E = AnonymousClass3MW.A18(r1);
            AnonymousClass3MW.A1X(this.A0D, new AdhocParticipantBottomSheetViewModel$refreshParticipants$1(this, (C30391dr) null), C41561wd.A00(this));
            return;
        }
        throw AnonymousClass000.A0n("callFromUi cannot be null");
    }
}
