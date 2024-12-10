package com.whatsapp.qrcode.contactqr;

import X.A3C;
import X.AGE;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1LA;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aX;
import X.AnonymousClass6h0;
import X.AnonymousClass8BU;
import X.C000200d;
import X.C107625aK;
import X.C108985cd;
import X.C132996o0;
import X.C137116uw;
import X.C1775098y;
import X.C17880vN;
import X.C20446ALj;
import X.C25161Nd;
import X.C26521Sl;
import X.C30801eX;
import X.C31041ev;
import X.C32971i3;
import X.C37511pf;
import X.C63662tU;
import X.C63932tv;
import X.C678831f;
import X.C72453Mb;
import android.view.Menu;
import android.view.MenuItem;

public class ContactQrActivity extends C1775098y implements C107625aK {
    public boolean A00;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r3 = r2.A00;
            C63932tv.A01(r2, r3, this);
            C63662tU.A00(r2, r3, this, r3.A5A);
            this.A0H = AnonymousClass3Ma.A0g(r2);
            this.A0I = AnonymousClass3MY.A0Z(r2);
            this.A0U = C000200d.A00(r3.A00);
            this.A04 = C108985cd.A0N(r2);
            this.A07 = AnonymousClass10E.A4z(r2);
            this.A0T = (C26521Sl) r2.A69.get();
            this.A0A = AnonymousClass3MZ.A0g(r2);
            this.A0V = C000200d.A00(r2.A3B);
            this.A0L = AnonymousClass3MZ.A0z(r2);
            this.A0B = (C678831f) r3.A10.get();
            this.A03 = (AnonymousClass1LA) r2.AeS.get();
            this.A0W = C000200d.A00(r2.A6N);
            this.A0E = AnonymousClass10E.A6Q(r2);
            this.A0G = (C32971i3) r2.AJn.get();
            this.A09 = AnonymousClass3MZ.A0f(r2);
            this.A0D = AnonymousClass3Ma.A0b(r2);
            this.A0C = (C25161Nd) r2.A2v.get();
            this.A0K = AnonymousClass3Ma.A0q(r2);
            this.A0R = (C132996o0) A002.A5d.get();
            this.A0J = AnonymousClass8BU.A0L(r3);
            this.A0M = (C31041ev) r2.AcR.get();
            this.A08 = (C37511pf) r2.AX7.get();
            this.A0F = (C30801eX) r2.AL8.get();
            this.A06 = (AnonymousClass6h0) r3.A7K.get();
            this.A0X = C000200d.A00(r2.ABc);
            this.A0O = AnonymousClass1K1.A1b(A002);
        }
    }

    public ContactQrActivity(int i) {
        this.A00 = false;
        AGE.A00(this, 21);
    }

    public void A4b() {
        super.A4b();
        if (getResources().getBoolean(2131034125)) {
            setRequestedOrientation(1);
        }
        this.A0Y = C17880vN.A0r(C72453Mb.A0M(this), "contact_qr_code");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = menu.add(0, 2131432543, 0, 2131888842).setIcon(AnonymousClass4aX.A02(this, 2131232294, 2131102547));
        icon.setShowAsAction(2);
        A3C.A02(icon, getString(2131888842));
        A3C.A02(menu.add(0, 2131432542, 0, 2131888831), getString(2131888831));
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131432543) {
            A4c();
            return true;
        } else if (menuItem.getItemId() != 2131432542) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A3x(new C20446ALj(this, 5), new C20446ALj(this, 6), 2131888837, 2131888835, 2131888834, 2131888832);
            return true;
        }
    }

    public ContactQrActivity() {
        this(0);
    }
}
