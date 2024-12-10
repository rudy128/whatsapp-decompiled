package com.whatsapp.conversation.conversationrow.message;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DT;
import X.AnonymousClass1E7;
import X.AnonymousClass1M9;
import X.AnonymousClass1MQ;
import X.AnonymousClass1PW;
import X.AnonymousClass1WX;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass8FK;
import X.C18000vb;
import X.C19880zA;
import X.C22971Dz;
import X.C24921Me;
import X.C41731wy;
import X.C42751yg;
import android.app.Application;

public class MessageDetailsViewModel extends AnonymousClass8FK {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final C19880zA A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass1M9 A03;
    public final C24921Me A04;
    public final C18000vb A05;
    public final AnonymousClass1WX A06;
    public final AnonymousClass10I A07;
    public final C19880zA A08;
    public final C19880zA A09;
    public final C19880zA A0A;
    public final AnonymousClass1MQ A0B;
    public final C41731wy A0C = AnonymousClass3MW.A0o();
    public final C41731wy A0D = AnonymousClass3MW.A0o();
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;

    public static String A00(MessageDetailsViewModel messageDetailsViewModel, AnonymousClass1E7 r6, AnonymousClass1BI r7) {
        C24921Me r4 = messageDetailsViewModel.A04;
        int A0B2 = r4.A0B(r7);
        C42751yg A0F2 = r4.A0F(r6, A0B2, false, true);
        if (((AnonymousClass1CJ) messageDetailsViewModel.A0E.get()).A0R(r7)) {
            return AnonymousClass3MW.A0Z(messageDetailsViewModel.A0F).A06(r6, r7, A0F2.A00, A0B2);
        }
        return r4.A0G(r6, A0F2.A00, A0B2).A01;
    }

    public boolean A0T(AnonymousClass206 r3) {
        AnonymousClass1BI r1 = r3.A0v.A00;
        if (C22971Dz.A0e(r1) || C22971Dz.A0N(r1)) {
            return true;
        }
        C19880zA r12 = this.A01;
        if (!r12.A07() || !((AnonymousClass1PW) r12.A03()).A0B(r3)) {
            return false;
        }
        return true;
    }

    public MessageDetailsViewModel(Application application, C19880zA r3, C19880zA r4, C19880zA r5, C19880zA r6, AnonymousClass11S r7, AnonymousClass1M9 r8, C24921Me r9, C18000vb r10, AnonymousClass1WX r11, AnonymousClass1MQ r12, AnonymousClass10I r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass00H r16) {
        super(application);
        this.A02 = r7;
        this.A07 = r13;
        this.A0E = r14;
        this.A01 = r3;
        this.A0B = r12;
        this.A03 = r8;
        this.A05 = r10;
        this.A06 = r11;
        this.A04 = r9;
        this.A0F = r15;
        this.A08 = r4;
        this.A0G = r16;
        this.A0A = r5;
        this.A09 = r6;
    }
}
