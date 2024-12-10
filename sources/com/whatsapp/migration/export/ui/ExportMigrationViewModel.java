package com.whatsapp.migration.export.ui;

import X.AnonymousClass000;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.C0L;
import X.C108945cZ;
import X.C130956kH;
import X.C145047Jr;
import X.C17900vP;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C42171xk;
import X.C47882Ki;
import com.whatsapp.util.Log;

public class ExportMigrationViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00 = C108945cZ.A0S();
    public final AnonymousClass1DT A01 = C108945cZ.A0S();
    public final AnonymousClass1DT A02 = C108945cZ.A0S();
    public final C130956kH A03 = new Object();
    public final C47882Ki A04;
    public final C145047Jr A05;

    public void A0S() {
        this.A04.unregisterObserver(this.A05);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.6kH, java.lang.Object] */
    public ExportMigrationViewModel(C18030ve r3, C47882Ki r4) {
        int i;
        this.A04 = r4;
        C145047Jr r0 = new C145047Jr(this);
        this.A05 = r0;
        r4.registerObserver(r0);
        if (C18020vd.A05(C18040vf.A02, r3, 881)) {
            Log.e("ExportMigrationViewModel/disabled: app version for platform migration is not supported");
            i = 4;
        } else {
            i = 0;
        }
        A0T(i);
    }

    public void A0T(int i) {
        C0L c0l;
        C17900vP.A0j("ExportMigrationViewModel/setScreen: ", AnonymousClass000.A10(), i);
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass1DT r2 = this.A02;
        if (!C42171xk.A00(valueOf, r2.A06())) {
            C130956kH r1 = this.A03;
            r1.A0A = 8;
            r1.A00 = 8;
            r1.A03 = 8;
            r1.A06 = 8;
            r1.A04 = 8;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        r1.A08 = 2131892279;
                        r1.A07 = 2131892297;
                        r1.A02 = 2131899268;
                        r1.A03 = 0;
                    } else if (i == 4) {
                        r1.A08 = 2131897377;
                        r1.A07 = 2131892303;
                        r1.A02 = 2131897387;
                        r1.A03 = 0;
                        r1.A05 = 2131892995;
                        r1.A06 = 0;
                        r1.A0A = 8;
                        r1.A01 = 2131233129;
                        c0l = C0L.A07;
                    } else if (i == 5) {
                        r1.A08 = 2131892285;
                        r1.A07 = 2131892284;
                        r1.A06 = 8;
                        r1.A04 = 8;
                    } else {
                        return;
                    }
                    r1.A0A = 8;
                } else {
                    r1.A08 = 2131892295;
                    r1.A07 = 2131892288;
                    r1.A0A = 8;
                    r1.A06 = 0;
                    r1.A05 = 2131898766;
                    r1.A04 = 0;
                }
                r1.A01 = 2131233130;
                c0l = C0L.A09;
            } else {
                r1.A08 = 2131892290;
                r1.A07 = 2131892292;
                r1.A00 = 0;
                r1.A02 = 2131892301;
                r1.A03 = 0;
                r1.A09 = 2131892291;
                r1.A0A = 0;
                r1.A01 = 2131233131;
                c0l = C0L.A0B;
            }
            r1.A0B = c0l;
            C17900vP.A0j("ExportMigrationViewModel/setScreen/post=", AnonymousClass000.A10(), i);
            r2.A0E(valueOf);
        }
    }
}
