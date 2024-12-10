package com.whatsapp.payments.ui;

import X.A1K;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1QS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3NL;
import X.AnonymousClass4SL;
import X.AnonymousClass8BR;
import X.AnonymousClass8FO;
import X.AnonymousClass8pI;
import X.C17880vN;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C21432Ajz;
import X.C24751Ln;
import X.C30361do;
import X.C77633qr;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class PaymentInvitePickerActivity extends C77633qr {
    public C24751Ln A00;
    public AnonymousClass1QS A01;
    public AnonymousClass00H A02;
    public AnonymousClass8FO A03;

    public int A4f() {
        return Integer.MAX_VALUE;
    }

    public int A4g() {
        return 1;
    }

    public void A4s() {
        String str;
        ArrayList A10 = C17880vN.A10(A4p());
        Intent intent = getIntent();
        if (intent != null) {
            str = intent.getStringExtra("referral_screen");
        } else {
            str = null;
        }
        A1K a1k = new A1K(this, this, this.A05, this.A00, this.A01, this.A03, (Runnable) null, new C21432Ajz(this, A10, 39), false, false);
        C17960vV.A0C(a1k.A02());
        if (a1k.A00.A06().BWj() != null) {
            A1K.A00(a1k, str, A10, false);
        }
    }

    public void A3K() {
        boolean A05 = C18020vd.A05(C18040vf.A02, this.A0E, 7019);
        C30361do A0u = AnonymousClass3MX.A0u(this.A02);
        if (A05) {
            A0u.A02((AnonymousClass1BI) null, 78);
        } else {
            A0u.A01();
        }
    }

    public Drawable A4j() {
        return AnonymousClass3NL.A00(this, this.A0F, 2131231900);
    }

    public int A4c() {
        return 2131893907;
    }

    public int A4d() {
        return 2131893920;
    }

    public int A4e() {
        return 2131755318;
    }

    public int A4i() {
        return 2131899268;
    }

    public void A4y(AnonymousClass4SL r3, AnonymousClass1E7 r4) {
        super.A4y(r3, r4);
        TextEmojiLabel textEmojiLabel = r3.A03;
        textEmojiLabel.setVisibility(0);
        textEmojiLabel.setText(2131893921);
    }

    public void A55(ArrayList arrayList) {
        ArrayList A13 = AnonymousClass000.A13();
        super.A55(A13);
        if (this.A01.A06().BWj() != null) {
            ArrayList A0D = AnonymousClass8BR.A0R(this.A01).A0D(new int[]{2}, 3);
            HashMap A11 = C17880vN.A11();
            Iterator it = A0D.iterator();
            while (it.hasNext()) {
                AnonymousClass8pI r1 = (AnonymousClass8pI) it.next();
                A11.put(r1.A03, r1);
            }
            Iterator it2 = A13.iterator();
            while (it2.hasNext()) {
                AnonymousClass1E7 A0O = C17880vN.A0O(it2);
                Object obj = A11.get(A0O.A0J);
                if (!AnonymousClass3MW.A0V(this.A0J).A0P(AnonymousClass3MZ.A0x(A0O)) && obj != null) {
                    arrayList.add(A0O);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.hasExtra("extra_multi_invite_picker_title")) {
            setTitle(intent.getIntExtra("extra_multi_invite_picker_title", 2131893907));
        }
        this.A03 = (AnonymousClass8FO) AnonymousClass3MW.A0N(this).A00(AnonymousClass8FO.class);
    }
}
