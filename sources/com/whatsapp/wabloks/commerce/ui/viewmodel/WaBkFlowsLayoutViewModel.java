package com.whatsapp.wabloks.commerce.ui.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass11E;
import X.AnonymousClass1D6;
import X.AnonymousClass3MW;
import X.C108965cb;
import X.C111175ia;
import X.C135556sO;
import X.C137476vW;
import X.C172408tN;
import X.C18030ve;
import X.C18070vi;
import X.C24521Kq;
import X.C29431cG;
import X.C41731wy;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class WaBkFlowsLayoutViewModel extends C111175ia {
    public final AnonymousClass11E A00;
    public final C18030ve A01;
    public final C41731wy A02 = AnonymousClass3MW.A0o();
    public final AnonymousClass00H A03;
    public final C41731wy A04 = AnonymousClass3MW.A0o();
    public final C41731wy A05 = AnonymousClass3MW.A0o();
    public final C41731wy A06 = AnonymousClass3MW.A0o();
    public final C41731wy A07 = AnonymousClass3MW.A0o();
    public final C41731wy A08 = AnonymousClass3MW.A0o();

    public final void A0W(C172408tN r5, String str, String str2, String str3, boolean z) {
        int i;
        Map map;
        Set keySet;
        C41731wy r3;
        C41731wy r32;
        Object r0;
        Map map2;
        Collection values;
        if (str2 == null || str2.length() == 0) {
            String str4 = null;
            if (str != null) {
                r32 = this.A07;
                r0 = AnonymousClass1D6.A01(str, "extensions-invalid-flow-token-error");
            } else {
                if (!(r5 == null || (map2 = r5.A00) == null || (values = map2.values()) == null || C137476vW.A00(values))) {
                    str4 = C29431cG.A0X(values).toString();
                }
                if (!this.A00.A09()) {
                    i = 2131890447;
                    str3 = "extensions-no-network-error";
                } else if (r5 == null || (map = r5.A00) == null || (keySet = map.keySet()) == null || !C108965cb.A1b(keySet, 2498058)) {
                    i = 2131890448;
                } else {
                    i = 2131890449;
                    str3 = "extensions-timeout-error";
                }
                this.A03.get();
                C24521Kq r02 = C24521Kq.$redex_init_class;
                if (z) {
                    r3 = this.A02;
                } else {
                    r3 = this.A06;
                }
                r0 = new C135556sO(i, str3, str4);
            }
        } else {
            if (z) {
                r32 = this.A08;
            } else {
                r32 = this.A05;
            }
            r0 = AnonymousClass1D6.A01(str2, str3);
        }
        r32.A0F(r0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaBkFlowsLayoutViewModel(AnonymousClass11E r2, C18030ve r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        super(r4);
        C18070vi.A0s(r4, r2, r5, r3);
        this.A00 = r2;
        this.A03 = r5;
        this.A01 = r3;
    }
}
