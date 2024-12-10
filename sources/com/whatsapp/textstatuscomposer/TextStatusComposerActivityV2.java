package com.whatsapp.textstatuscomposer;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass6VM;
import X.C108955ca;
import X.C108965cb;
import X.C109005cf;
import X.C123496Ur;
import X.C1423379b;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C24641Lc;
import X.C25932Cow;
import X.C30361do;
import X.C58752lC;
import android.os.Bundle;

public final class TextStatusComposerActivityV2 extends AnonymousClass1FY {
    public C24641Lc A00;
    public C58752lC A01;
    public AnonymousClass00H A02;
    public boolean A03;

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0c(A0A, r1, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A02 = AnonymousClass3MX.A11(A0A);
            this.A00 = C108965cb.A0X(A0A);
            this.A01 = (C58752lC) A0A.AAC.get();
        }
    }

    public void A3K() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            C18100vl r02 = C30361do.A0C;
            ((C30361do) C18070vi.A0E(r0)).A02((AnonymousClass1BI) null, 34);
            return;
        }
        C18070vi.A11("navigationTimeSpentManager");
        throw null;
    }

    public TextStatusComposerActivityV2(int i) {
        this.A03 = false;
        C1423379b.A00(this, 6);
    }

    public void A3I() {
        super.A3I();
        if (C18020vd.A05(C18040vf.A02, this.A0E, 7905)) {
            C58752lC r0 = this.A01;
            if (r0 != null) {
                r0.A00();
            } else {
                C18070vi.A11("statusDistributeSenderKeyRequester");
                throw null;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass6VM.A00(getWindow(), true);
        C24641Lc r0 = this.A00;
        if (r0 != null) {
            if (C18020vd.A05(C18040vf.A02, r0.A01, 9162)) {
                C123496Ur r1 = new C25932Cow(AnonymousClass3MZ.A0F(this), getWindow()).A00;
                r1.A00();
                r1.A02(1);
            }
            setContentView(2131624117);
            return;
        }
        C18070vi.A11("statusConfig");
        throw null;
    }

    public TextStatusComposerActivityV2() {
        this(0);
    }
}
