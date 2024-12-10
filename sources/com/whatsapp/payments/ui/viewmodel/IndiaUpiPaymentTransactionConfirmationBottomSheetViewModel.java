package com.whatsapp.payments.ui.viewmodel;

import X.A0B;
import X.A7U;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass1J2;
import X.AnonymousClass1KB;
import X.AnonymousClass1KI;
import X.AnonymousClass1KJ;
import X.AnonymousClass1KL;
import X.AnonymousClass1KN;
import X.AnonymousClass1OZ;
import X.AnonymousClass1QE;
import X.AnonymousClass1QR;
import X.AnonymousClass90Z;
import X.C1418477e;
import X.C170318pf;
import X.C175758zE;
import X.C175788zH;
import X.C18030ve;
import X.C186909ex;
import X.C196199uc;
import X.C30931ek;
import X.C31061ex;
import X.C33711jG;

public class IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel extends AnonymousClass1J2 {
    public AnonymousClass11S A00;
    public AnonymousClass11P A01;
    public AnonymousClass118 A02;
    public AnonymousClass1KN A03;
    public C18030ve A04;
    public C1418477e A05;
    public C1418477e A06;
    public C1418477e A07;
    public C170318pf A08;
    public AnonymousClass1QE A09 = AnonymousClass1QE.A00("IndiaUpiPaymentTransactionConfirmationViewModel", "payment", "IN");
    public A0B A0A;
    public AnonymousClass10I A0B;
    public final AnonymousClass1QR A0C;
    public final AnonymousClass1KJ A0D;
    public final A7U A0E;
    public final C175758zE A0F;
    public final C175788zH A0G;
    public final C186909ex A0H;

    public void A0S() {
        C186909ex r0 = this.A0H;
        r0.A03.unregisterObserver(r0.A02);
    }

    public IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel(AnonymousClass1KB r16, AnonymousClass11S r17, AnonymousClass11P r18, AnonymousClass118 r19, AnonymousClass1QR r20, AnonymousClass1KI r21, C18030ve r22, AnonymousClass1OZ r23, C196199uc r24, A7U a7u, C33711jG r26, C31061ex r27, A0B a0b, C186909ex r29, AnonymousClass90Z r30, C30931ek r31, AnonymousClass10I r32) {
        AnonymousClass11P r10 = r18;
        this.A01 = r10;
        C18030ve r11 = r22;
        this.A04 = r11;
        AnonymousClass118 r1 = r19;
        this.A02 = r1;
        this.A00 = r17;
        this.A0B = r32;
        this.A0A = a0b;
        this.A0C = r20;
        A7U a7u2 = a7u;
        this.A0E = a7u2;
        this.A0H = r29;
        C31061ex r8 = r27;
        AnonymousClass1OZ r4 = r23;
        this.A0F = new C175758zE(r10, r11, r4, a7u2, r8);
        this.A0D = AnonymousClass1KL.A0B;
        AnonymousClass1KB r2 = r16;
        AnonymousClass1KI r3 = r21;
        C196199uc r5 = r24;
        this.A0G = new C175788zH(r1.A00, r2, r3, r4, r5, a7u2, r26, r8, r30, r31);
    }
}
