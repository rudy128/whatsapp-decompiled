package com.whatsapp.report;

import X.AnonymousClass10I;
import X.AnonymousClass1DT;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass7LQ;
import X.AnonymousClass7LR;
import X.AnonymousClass7LS;
import X.AnonymousClass8FK;
import X.C108945cZ;
import X.C126286cU;
import X.C126296cV;
import X.C126306cW;
import X.C126316cX;
import X.C19830z4;
import X.C36191nU;
import X.C36201nV;
import android.app.Application;

public class BusinessActivityReportViewModel extends AnonymousClass8FK {
    public final AnonymousClass1DT A00 = C108945cZ.A0S();
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0M(AnonymousClass3MY.A0f());
    public final AnonymousClass1DT A02 = C108945cZ.A0S();
    public final AnonymousClass1KB A03;
    public final C19830z4 A04;
    public final C36191nU A05;
    public final C36201nV A06;
    public final C126286cU A07;
    public final C126296cV A08;
    public final C126306cW A09;
    public final C126316cX A0A;
    public final AnonymousClass7LQ A0B;
    public final AnonymousClass7LR A0C;
    public final AnonymousClass7LS A0D;
    public final AnonymousClass10I A0E;

    public static void A00(BusinessActivityReportViewModel businessActivityReportViewModel) {
        AnonymousClass3MX.A1K(businessActivityReportViewModel.A02, 0);
        businessActivityReportViewModel.A05.A02();
    }

    public void A0S() {
        this.A0C.A00 = null;
        this.A0B.A00 = null;
        this.A0D.A00 = null;
        this.A06.A00 = null;
    }

    public BusinessActivityReportViewModel(Application application, AnonymousClass1KB r6, C19830z4 r7, C36191nU r8, C36201nV r9, AnonymousClass7LQ r10, AnonymousClass7LR r11, AnonymousClass7LS r12, AnonymousClass10I r13) {
        super(application);
        C126286cU r3 = new C126286cU(this);
        this.A07 = r3;
        C126296cV r2 = new C126296cV(this);
        this.A08 = r2;
        C126306cW r1 = new C126306cW(this);
        this.A09 = r1;
        C126316cX r0 = new C126316cX(this);
        this.A0A = r0;
        this.A03 = r6;
        this.A0E = r13;
        this.A04 = r7;
        this.A05 = r8;
        this.A0C = r11;
        this.A06 = r9;
        this.A0B = r10;
        this.A0D = r12;
        r12.A00 = r3;
        r10.A00 = r1;
        r11.A00 = r2;
        r9.A00 = r0;
    }
}
