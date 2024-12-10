package com.whatsapp.blockbusiness.blockreasonlist;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass12L;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1R3;
import X.AnonymousClass3MW;
import X.AnonymousClass8FK;
import X.C136876uY;
import X.C18030ve;
import X.C18070vi;
import X.C33251iW;
import X.C41731wy;
import android.app.Application;

public final class BlockReasonListViewModel extends AnonymousClass8FK {
    public final Application A00;
    public final AnonymousClass1DS A01;
    public final AnonymousClass1DT A02;
    public final AnonymousClass1KB A03;
    public final C33251iW A04;
    public final AnonymousClass1M9 A05;
    public final C136876uY A06;
    public final AnonymousClass11P A07;
    public final AnonymousClass1R3 A08;
    public final C18030ve A09;
    public final AnonymousClass12L A0A;
    public final C41731wy A0B = AnonymousClass3MW.A0o();
    public final AnonymousClass10I A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockReasonListViewModel(Application application, AnonymousClass1KB r4, C33251iW r5, AnonymousClass1M9 r6, C136876uY r7, AnonymousClass11P r8, AnonymousClass1R3 r9, C18030ve r10, AnonymousClass12L r11, AnonymousClass10I r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        super(application);
        C18070vi.A0w(application, r8, r10, r4, r12);
        C18070vi.A0x(r13, r5, r11, r6, r9);
        C18070vi.A0r(r14, r15, r7);
        this.A07 = r8;
        this.A09 = r10;
        this.A03 = r4;
        this.A0C = r12;
        this.A0F = r13;
        this.A04 = r5;
        this.A0A = r11;
        this.A05 = r6;
        this.A08 = r9;
        this.A0E = r14;
        this.A0D = r15;
        this.A06 = r7;
        Application application2 = this.A00;
        C18070vi.A0z(application2, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        this.A00 = application2;
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A02 = A0L;
        this.A01 = A0L;
    }
}
