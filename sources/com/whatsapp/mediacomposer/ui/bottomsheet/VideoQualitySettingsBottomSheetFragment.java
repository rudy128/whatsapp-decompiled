package com.whatsapp.mediacomposer.ui.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.AnonymousClass1D7;
import X.AnonymousClass1DF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass85N;
import X.C108985cd;
import X.C134766r7;
import X.C134776r8;
import X.C152157nS;
import X.C152167nT;
import X.C17880vN;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C26431Sc;
import X.C72453Mb;
import X.C72463Mc;
import X.C88584aA;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.radio.RadioButtonWithSubtitle;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public final class VideoQualitySettingsBottomSheetFragment extends Hilt_VideoQualitySettingsBottomSheetFragment {
    public C26431Sc A00;
    public final Map A01;
    public final SortedMap A02;
    public final C18100vl A03 = AnonymousClass1DF.A01(new C152157nS(this));
    public final C18100vl A04 = AnonymousClass1DF.A01(new C152167nT(this));

    public VideoQualitySettingsBottomSheetFragment(AnonymousClass85N r7, Integer num, Map map) {
        super(r7, C72463Mc.A0B(num));
        this.A00 = false;
        this.A01 = map;
        AnonymousClass1D6[] r3 = new AnonymousClass1D6[2];
        AnonymousClass1D6.A03(2131432414, new C134766r7(0, 2131891933), r3, 0);
        C108985cd.A1G(2131432415, new C134766r7(3, 2131891937), r3);
        TreeMap treeMap = new TreeMap();
        AnonymousClass1D7.A0K(treeMap, r3);
        this.A02 = treeMap;
    }

    public void A21(Bundle bundle, View view) {
        RadioButtonWithSubtitle radioButtonWithSubtitle;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        if (C72453Mb.A1a(this.A08)) {
            A2K();
            return;
        }
        Iterator A15 = AnonymousClass000.A15(this.A02);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Number number = (Number) A16.getKey();
            Map map = this.A01;
            C134776r8 r0 = (C134776r8) AnonymousClass000.A0w(map, ((C134766r7) A16.getValue()).A00);
            if (r0 == null) {
                Object A0w = AnonymousClass000.A0w(map, 0);
                if (A0w != null) {
                    r0 = (C134776r8) A0w;
                } else {
                    throw C17880vN.A0g();
                }
            }
            AnonymousClass1D6 r8 = r0.A01;
            long j = r0.A00;
            View view2 = this.A0B;
            if (!(view2 == null || (radioButtonWithSubtitle = (RadioButtonWithSubtitle) view2.findViewById(AnonymousClass3MY.A03(number))) == null)) {
                Object[] A1b = AnonymousClass3MW.A1b();
                A1b[0] = r8.second;
                String A162 = AnonymousClass3MX.A16(this, r8.first, A1b, 1, 2131891938);
                C18000vb r02 = this.A03;
                if (r02 != null) {
                    String A022 = C88584aA.A02(r02, j);
                    if (A162 == null || A022 == null) {
                        radioButtonWithSubtitle.setSubTitle(A022);
                    } else {
                        radioButtonWithSubtitle.setSubTitle(AnonymousClass3MX.A16(this, A022, AnonymousClass3MX.A1b(A162, 0), 1, 2131891932));
                    }
                } else {
                    AnonymousClass3MW.A1M();
                    throw null;
                }
            }
        }
    }
}
