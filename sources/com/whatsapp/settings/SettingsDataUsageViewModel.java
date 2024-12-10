package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1DT;
import X.AnonymousClass1HQ;
import X.AnonymousClass1J2;
import X.AnonymousClass1KB;
import X.AnonymousClass1L7;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C92244gz;
import android.os.Build;
import android.os.Environment;
import java.io.File;

public class SettingsDataUsageViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0M(AnonymousClass000.A0h());
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass1KB A02;
    public final AnonymousClass1HQ A03;
    public final C18030ve A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass1L7 A07;

    public void A0S() {
        C92244gz r1 = (C92244gz) this.A06.get();
        r1.A03.A01();
        r1.A04.A01();
    }

    public /* synthetic */ void A0T() {
        AnonymousClass1DT r1;
        boolean z;
        if (Build.VERSION.SDK_INT >= 30 && !Environment.isExternalStorageLegacy()) {
            if (C18020vd.A05(C18040vf.A02, this.A04, 1235)) {
                File A0e = C17880vN.A0e(Environment.getExternalStorageDirectory(), "WhatsApp");
                r1 = this.A00;
                z = A0e.exists();
                AnonymousClass3MY.A1M(r1, z);
            }
        }
        r1 = this.A00;
        z = false;
        AnonymousClass3MY.A1M(r1, z);
    }

    public SettingsDataUsageViewModel(AnonymousClass1KB r2, AnonymousClass1HQ r3, AnonymousClass1L7 r4, C18030ve r5, AnonymousClass10I r6, AnonymousClass00H r7) {
        this.A04 = r5;
        this.A02 = r2;
        this.A05 = r6;
        this.A03 = r3;
        this.A07 = r4;
        this.A06 = r7;
    }
}
