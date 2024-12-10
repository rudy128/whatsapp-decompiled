package com.whatsapp.loginfailure;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4SB;
import X.AnonymousClass7RA;
import X.C177659Ab;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C22881Do;
import X.C27881Xz;
import X.C33841jT;
import X.C36401np;
import X.C36531o3;
import X.C72473Md;
import X.C72483Me;
import X.C75083dy;
import X.C91014f0;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public final class PCRLogoutMessageActivity extends C75083dy {
    public C36531o3 A00;
    public AnonymousClass1LU A01;
    public AnonymousClass4SB A02;
    public C36401np A03;
    public boolean A04;

    public PCRLogoutMessageActivity() {
        this(0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131626444);
        WDSTextLayout wDSTextLayout = (WDSTextLayout) C18070vi.A05(this.A00, 2131436101);
        AnonymousClass3MY.A10(this, wDSTextLayout, 2131894254);
        C36401np r3 = this.A03;
        if (r3 != null) {
            wDSTextLayout.setDescriptionText(r3.A06(this, new AnonymousClass7RA((Object) this, 16), getString(2131894253), "pcr_help", 2131101293));
            AnonymousClass3Ma.A1I(AnonymousClass3Ma.A0E(wDSTextLayout, 2131429927), this.A0E);
            AnonymousClass3MY.A0z(this, wDSTextLayout, 2131894252);
            wDSTextLayout.setPrimaryButtonClickListener(new C177659Ab(this, 4));
            wDSTextLayout.setSecondaryButtonText(getString(2131894255));
            wDSTextLayout.setSecondaryButtonClickListener(new C177659Ab(this, 5));
            WDSButton A0q = AnonymousClass3MW.A0q(wDSTextLayout, 2131434059);
            C27881Xz r1 = C27881Xz.OUTLINE;
            A0q.setVariant(r1);
            AnonymousClass3MW.A0q(wDSTextLayout, 2131435001).setVariant(r1);
            return;
        }
        AnonymousClass3MW.A1E();
        throw null;
    }

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = (C33841jT) A0L.A9T.get();
            this.A00 = AnonymousClass3Ma.A0T(A0L);
            this.A03 = AnonymousClass3MY.A0e(r1);
            this.A02 = (AnonymousClass4SB) A0L.Ade.get();
            this.A01 = AnonymousClass3MY.A0Z(A0L);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }

    public void onResume() {
        String str;
        super.onResume();
        AnonymousClass4SB r5 = this.A02;
        if (r5 != null) {
            long A032 = C17890vO.A03(C18020vd.A00(C18040vf.A02, r5.A02, 11711));
            long j = C17890vO.A0B(r5.A01).getLong("pcr_error_code_time", 0);
            if (j > 0 && r5.A00.A05() > A032 + j) {
                C22881Do r2 = r5.A03;
                if (r2.A01 && r2.A00 == 1) {
                    AnonymousClass3MZ.A1U(r5.A04, r5, 23);
                }
                if (this.A01 != null) {
                    Intent A0A = C17880vN.A0A();
                    A0A.setClassName(getPackageName(), "com.whatsapp.loginfailure.LogoutMessageActivity");
                    startActivity(A0A);
                    finish();
                    return;
                }
                str = "waIntents";
            } else if (j == 0) {
                r5.A01();
                return;
            } else {
                return;
            }
        } else {
            str = "postCompromiseRecoveryManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public PCRLogoutMessageActivity(int i) {
        this.A04 = false;
        C91014f0.A00(this, 43);
    }
}
