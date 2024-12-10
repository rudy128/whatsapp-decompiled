package com.whatsapp.inappsupport.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass3MW;
import X.AnonymousClass41e;
import X.C111175ia;
import X.C1185063s;
import X.C18070vi;
import X.C187029f9;
import X.C35541mP;
import X.C41731wy;
import X.C819541f;
import X.C819641g;
import com.whatsapp.util.Log;

public final class SupportBkLayoutViewModel extends C111175ia {
    public String A00;
    public String A01 = "";
    public final C41731wy A02 = AnonymousClass3MW.A0o();
    public final AnonymousClass00H A03;

    public boolean A0V(C187029f9 r6) {
        String str;
        String A1H;
        int i = r6.A00;
        if (i != 1) {
            if (i == 3) {
                str = "NULL_LAYOUT";
            } else if (i == 4) {
                str = "UNEXPECTED_ERROR";
            } else if (i == 6) {
                str = "UNKNOWN";
            } else if (i != 7) {
                A00(2, "UNKNOWN");
                this.A02.A0F(C819641g.A00);
                A1H = "SupportBkLayoutViewModel/handleError: Error status unknown";
            } else {
                A00(1, (String) null);
                Log.e("SupportBkLayoutViewModel/handleError: layout network");
                this.A02.A0F(C819541f.A00);
                return false;
            }
            A00(2, str);
            this.A02.A0F(AnonymousClass41e.A00);
            A1H = AnonymousClass001.A1H("SupportBkLayoutViewModel/handleError: layout fetch error. Status: ", str, AnonymousClass000.A10());
        } else {
            str = "REQUEST_FAILED";
            A00(2, str);
            this.A02.A0F(AnonymousClass41e.A00);
            A1H = AnonymousClass001.A1H("SupportBkLayoutViewModel/handleError: layout fetch error. Status: ", str, AnonymousClass000.A10());
        }
        Log.e(A1H);
        return false;
    }

    private final void A00(int i, String str) {
        C35541mP r4 = (C35541mP) this.A03.get();
        String str2 = this.A01;
        String str3 = this.A00;
        C1185063s r1 = new C1185063s();
        r1.A01 = Integer.valueOf(i);
        r1.A02 = str2;
        if (str != null) {
            r1.A05 = str;
        }
        if (str3 != null) {
            r1.A03 = str3;
        }
        r4.A00.CC4(r1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SupportBkLayoutViewModel(AnonymousClass00H r2, AnonymousClass00H r3) {
        super(r2);
        C18070vi.A0j(r2, r3);
        this.A03 = r3;
    }
}
