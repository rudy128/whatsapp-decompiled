package com.whatsapp.group;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11S;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1IZ;
import X.AnonymousClass1K1;
import X.AnonymousClass1MZ;
import X.AnonymousClass3MY;
import X.AnonymousClass3gf;
import X.C17960vV;
import X.C63312sr;
import X.C72473Md;
import X.C72483Me;
import X.C74803cp;
import X.C91014f0;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public class EditGroupAdminsSelector extends AnonymousClass3gf {
    public AnonymousClass1MZ A00;
    public boolean A01;

    public EditGroupAdminsSelector() {
        this(0);
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            C74803cp.A0t(A0K, r2, r1, this, A0K.A63);
            C74803cp.A0s(A0K, r2, r1, this);
            this.A00 = AnonymousClass3MY.A0V(r2);
        }
    }

    public void A55(ArrayList arrayList) {
        String stringExtra = getIntent().getStringExtra("gid");
        C17960vV.A07(stringExtra);
        AnonymousClass1EC A02 = AnonymousClass1EC.A01.A02(stringExtra);
        if (A02 != null) {
            AnonymousClass1IZ it = this.A00.A08.A0C(A02).A08().iterator();
            while (it.hasNext()) {
                C63312sr r1 = (C63312sr) it.next();
                AnonymousClass11S r0 = this.A02;
                UserJid userJid = r1.A04;
                if (!r0.A0O(userJid) && r1.A01 != 2) {
                    AnonymousClass3MY.A1O(this.A06, userJid, arrayList);
                }
            }
        }
    }

    public EditGroupAdminsSelector(int i) {
        this.A01 = false;
        C91014f0.A00(this, 13);
    }
}
