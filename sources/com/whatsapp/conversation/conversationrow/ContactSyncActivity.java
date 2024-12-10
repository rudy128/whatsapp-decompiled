package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4VU;
import X.AnonymousClass700;
import X.AnonymousClass9BS;
import X.C000200d;
import X.C108255bO;
import X.C17880vN;
import X.C17960vV;
import X.C20098A7b;
import X.C22540BBx;
import X.C22941Dw;
import X.C60442o2;
import X.C62602rf;
import X.C678831f;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C91004ez;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;

public class ContactSyncActivity extends AnonymousClass1FY implements C22540BBx, C108255bO {
    public AnonymousClass700 A00;
    public C678831f A01;
    public AnonymousClass00H A02;
    public AnonymousClass9BS A03;
    public UserJid A04;
    public boolean A05;

    public ContactSyncActivity() {
        this(0);
    }

    public void BrZ(int i) {
    }

    public void Bra(int i) {
    }

    public void Brb(int i) {
        if (i == 1 || i == 2) {
            finish();
        }
    }

    public void C2M() {
        this.A03 = null;
        CEx();
    }

    public void C8C(C62602rf r5) {
        String str;
        int i;
        this.A03 = null;
        CEx();
        if (r5 != null) {
            if (r5.A00()) {
                finish();
                AnonymousClass700 r3 = this.A00;
                Intent A06 = AnonymousClass3MY.A06(this, r3.A08, this.A04);
                C60442o2.A00(A06, r3.A06, "ShareContactUtil");
                startActivity(A06);
                return;
            } else if (r5.A00 == 0) {
                str = getString(2131896262);
                i = 1;
                AnonymousClass4VU r1 = new AnonymousClass4VU(i);
                r1.A02(str);
                r1.A05(false);
                r1.A04(getString(2131899286));
                C20098A7b.A03(r1.A00(), getSupportFragmentManager(), (String) null);
            }
        }
        str = getString(2131896261);
        i = 2;
        AnonymousClass4VU r12 = new AnonymousClass4VU(i);
        r12.A02(str);
        r12.A05(false);
        r12.A04(getString(2131899286));
        C20098A7b.A03(r12.A00(), getSupportFragmentManager(), (String) null);
    }

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A02 = C000200d.A00(A0L.A6N);
            this.A01 = (C678831f) r1.A10.get();
            this.A00 = (AnonymousClass700) r1.AH6.get();
        }
    }

    public void C8D() {
        A44(getString(2131891797));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UserJid A022 = C22941Dw.A02(getIntent().getStringExtra("user_jid"));
        C17960vV.A07(A022);
        this.A04 = A022;
        if (!AnonymousClass3MW.A1Y(this)) {
            AnonymousClass4VU r1 = new AnonymousClass4VU(1);
            r1.A02(getString(2131896262));
            r1.A05(false);
            r1.A04(getString(2131899286));
            C72453Mb.A1I(r1.A00(), this);
            return;
        }
        AnonymousClass9BS r0 = this.A03;
        if (r0 != null) {
            r0.A0B(true);
        }
        AnonymousClass9BS r12 = new AnonymousClass9BS(this.A01, this, this.A04, C17880vN.A0U(this.A02));
        this.A03 = r12;
        AnonymousClass3MW.A1T(r12, this.A05, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass9BS r1 = this.A03;
        if (r1 != null) {
            r1.A0B(true);
            this.A03 = null;
        }
    }

    public ContactSyncActivity(int i) {
        this.A05 = false;
        C91004ez.A00(this, 25);
    }
}
