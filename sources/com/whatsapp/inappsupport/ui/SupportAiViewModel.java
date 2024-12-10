package com.whatsapp.inappsupport.ui;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass121;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1KB;
import X.AnonymousClass1NN;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C132636nD;
import X.C146447Pd;
import X.C146507Pj;
import X.C1607089p;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C25231Nk;
import X.C35541mP;
import X.C41731wy;
import X.C81473zI;
import X.C95444mF;
import com.whatsapp.util.Log;

public final class SupportAiViewModel extends AnonymousClass1J2 implements C1607089p {
    public AnonymousClass1BI A00;
    public boolean A01;
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A03 = AnonymousClass3MW.A0L();
    public final AnonymousClass1KB A04;
    public final AnonymousClass1CJ A05;
    public final C25231Nk A06 = new C95444mF(this, 16);
    public final AnonymousClass1NN A07;
    public final AnonymousClass121 A08;
    public final C132636nD A09;
    public final C41731wy A0A = AnonymousClass3MW.A0o();
    public final C41731wy A0B = AnonymousClass3MW.A0o();
    public final AnonymousClass10I A0C;
    public final AnonymousClass00H A0D;
    public final C18030ve A0E;
    public final AnonymousClass00H A0F;

    public static final boolean A00(SupportAiViewModel supportAiViewModel, boolean z) {
        AnonymousClass1BI r1;
        if (supportAiViewModel.A01) {
            return true;
        }
        boolean A052 = C18020vd.A05(C18040vf.A02, supportAiViewModel.A0E, 819);
        if (!A052 || (r1 = supportAiViewModel.A00) == null || !supportAiViewModel.A05.A0P(r1)) {
            if (z || !A052 || supportAiViewModel.A00 == null) {
                Log.i("SupportAiViewModel/openChatOrShowTicketHaveCreatedDialog - showing dialog");
                AnonymousClass3MY.A1L(supportAiViewModel.A03, false);
                supportAiViewModel.A0B.A0F((Object) null);
            }
            return supportAiViewModel.A01;
        }
        Log.i("SupportAiViewModel/openChatOrShowTicketCreatedDialog - opening chat");
        AnonymousClass3MY.A1L(supportAiViewModel.A03, false);
        AnonymousClass1BI r12 = supportAiViewModel.A00;
        if (r12 != null) {
            supportAiViewModel.A02.A0F(r12);
        }
        supportAiViewModel.A01 = true;
        return supportAiViewModel.A01;
    }

    public void BoT() {
        Log.i("SupportAiViewModel/onChatSupportTicketCreationDeliveryFailure");
        AnonymousClass3MY.A1L(this.A03, false);
        this.A0A.A0F((Object) null);
        C81473zI r2 = new C81473zI();
        r2.A00 = 20;
        r2.A01 = 2L;
        r2.A03 = "No internet";
        ((C35541mP) this.A0F.get()).A00.CC4(r2);
    }

    public void BoU(int i, String str) {
        Log.i("SupportAiViewModel/onChatSupportTicketCreationError");
        AnonymousClass3MY.A1L(this.A03, false);
        this.A0A.A0F((Object) null);
        C81473zI r1 = new C81473zI();
        r1.A00 = 20;
        r1.A01 = C17880vN.A0n(i);
        r1.A03 = str;
        ((C35541mP) this.A0F.get()).A00.CC4(r1);
    }

    public void BoV(AnonymousClass1BI r7) {
        AnonymousClass1BI r3;
        Log.i("SupportAiViewModel/onChatSupportTicketCreationSuccess");
        this.A00 = r7;
        boolean z = false;
        this.A01 = false;
        if (r7 != null && this.A05.A0P(r7)) {
            if (!C18020vd.A05(C18040vf.A02, this.A0E, 10126) && (r3 = this.A00) != null) {
                this.A0C.CGF(new C146507Pj(this, r3, 19));
            }
        }
        AnonymousClass1NN r4 = this.A07;
        C25231Nk r32 = this.A06;
        r4.registerObserver(r32);
        int A002 = C18020vd.A00(C18040vf.A02, this.A0E, 974);
        int i = 0;
        if (0 < A002) {
            i = A002;
        } else {
            z = true;
        }
        if (!A00(this, z)) {
            this.A04.A0K(new C146447Pd(this, 11), (long) i);
        } else {
            r4.unregisterObserver(r32);
        }
        ((C35541mP) C18070vi.A0E(this.A0F)).A02(19, (String) null);
    }

    public SupportAiViewModel(AnonymousClass1KB r3, AnonymousClass1CJ r4, AnonymousClass1NN r5, AnonymousClass121 r6, C18030ve r7, C132636nD r8, AnonymousClass10I r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        C18070vi.A0w(r3, r5, r8, r7, r4);
        C18070vi.A0q(r10, r9, r6);
        C18070vi.A0d(r11, 9);
        this.A04 = r3;
        this.A07 = r5;
        this.A09 = r8;
        this.A0E = r7;
        this.A05 = r4;
        this.A0D = r10;
        this.A0C = r9;
        this.A08 = r6;
        this.A0F = r11;
    }
}
