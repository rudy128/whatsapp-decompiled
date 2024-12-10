package com.whatsapp.mediacomposer.ui.bottomsheet;

import X.AnonymousClass00H;
import X.AnonymousClass190;
import X.AnonymousClass1D6;
import X.AnonymousClass1D7;
import X.AnonymousClass1DF;
import X.AnonymousClass72S;
import X.AnonymousClass85N;
import X.C108985cd;
import X.C134766r7;
import X.C152127nP;
import X.C152137nQ;
import X.C18100vl;
import X.C72463Mc;
import java.util.SortedMap;
import java.util.TreeMap;

public final class ImageQualitySettingsBottomSheetFragment extends Hilt_ImageQualitySettingsBottomSheetFragment {
    public AnonymousClass190 A00;
    public AnonymousClass00H A01;
    public final AnonymousClass72S A02;
    public final SortedMap A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(new C152127nP(this));
    public final C18100vl A05 = AnonymousClass1DF.A01(new C152137nQ(this));

    public ImageQualitySettingsBottomSheetFragment(AnonymousClass72S r7, AnonymousClass85N r8, Integer num) {
        super(r8, C72463Mc.A0B(num));
        this.A00 = false;
        this.A02 = r7;
        AnonymousClass1D6[] r3 = new AnonymousClass1D6[2];
        AnonymousClass1D6.A03(2131432414, new C134766r7(0, 2131891933), r3, 0);
        C108985cd.A1G(2131432415, new C134766r7(3, 2131891937), r3);
        TreeMap treeMap = new TreeMap();
        AnonymousClass1D7.A0K(treeMap, r3);
        this.A03 = treeMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r1 == 270) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r5, android.view.View r6) {
        /*
            r4 = this;
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            super.A21(r5, r6)
            X.0vl r0 = r4.A08
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0013
            r4.A2K()
        L_0x0012:
            return
        L_0x0013:
            X.72S r2 = r4.A02     // Catch:{ FileNotFoundException -> 0x0039 }
            int r1 = r2.A02()     // Catch:{ FileNotFoundException -> 0x0039 }
            r0 = 90
            if (r1 == r0) goto L_0x0026
            int r1 = r2.A02()     // Catch:{ FileNotFoundException -> 0x0039 }
            r0 = 270(0x10e, float:3.78E-43)
            r2 = 0
            if (r1 != r0) goto L_0x0027
        L_0x0026:
            r2 = 1
        L_0x0027:
            X.10I r1 = r4.A05     // Catch:{ FileNotFoundException -> 0x0039 }
            if (r1 == 0) goto L_0x0034
            X.7Qu r0 = new X.7Qu     // Catch:{ FileNotFoundException -> 0x0039 }
            r0.<init>(r4, r2)     // Catch:{ FileNotFoundException -> 0x0039 }
            r1.CGF(r0)     // Catch:{ FileNotFoundException -> 0x0039 }
            goto L_0x0048
        L_0x0034:
            X.AnonymousClass3MW.A1G()     // Catch:{ FileNotFoundException -> 0x0039 }
            r0 = 0
            throw r0     // Catch:{ FileNotFoundException -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            X.190 r3 = r4.A00
            if (r3 == 0) goto L_0x0067
            java.lang.String r2 = r0.getMessage()
            r1 = 1
            java.lang.String r0 = "ImageQualitySettingsBottomSheetFragment/getSubtitles/getTargetResolution/FileNotFoundException"
            r3.A0G(r0, r2, r1)
        L_0x0048:
            X.0ve r2 = r4.A04
            if (r2 == 0) goto L_0x006a
            r1 = 4039(0xfc7, float:5.66E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0012
            X.10I r1 = r4.A05
            if (r1 == 0) goto L_0x0064
            r0 = 14
            X.3Br r0 = X.C108945cZ.A0X(r4, r0)
            r1.CGF(r0)
            return
        L_0x0064:
            java.lang.String r0 = "waWorkers"
            goto L_0x006c
        L_0x0067:
            java.lang.String r0 = "crashLogs"
            goto L_0x006c
        L_0x006a:
            java.lang.String r0 = "abProps"
        L_0x006c:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.ui.bottomsheet.ImageQualitySettingsBottomSheetFragment.A21(android.os.Bundle, android.view.View):void");
    }
}
