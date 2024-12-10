package com.whatsapp.contact.picker;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass3MZ;
import X.C000200d;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C74803cp;
import X.C91004ez;
import X.CW0;

public final class ContactsAttachmentSelectorBottomSheet extends ContactsAttachmentSelector {
    public boolean A00;

    public ContactsAttachmentSelectorBottomSheet() {
        this(0);
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            C74803cp.A0t(A0K, r2, r1, this, A0K.A63);
            C74803cp.A0s(A0K, r2, r1, this);
            this.A02 = AnonymousClass3MZ.A0l(r2);
            this.A03 = (CW0) r1.A31.get();
            this.A00 = C72453Mb.A0b(r2);
            this.A04 = C000200d.A00(r1.AD5);
        }
    }

    public ContactsAttachmentSelectorBottomSheet(int i) {
        this.A00 = false;
        C91004ez.A00(this, 22);
    }
}
