package com.whatsapp.email;

import X.A9B;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass4Yv;
import X.AnonymousClass5HP;
import X.AnonymousClass5HQ;
import X.AnonymousClass5NT;
import X.C000200d;
import X.C161528Fl;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C18460wS;
import X.C196159uY;
import X.C28931bI;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C89554ce;
import X.C89934dG;
import X.C91014f0;
import X.C91644g1;
import X.C95844mt;
import X.C99244sV;
import X.C99274sY;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

public final class UpdateEmailActivity extends AnonymousClass1FY {
    public int A00;
    public int A01;
    public WaEditText A02;
    public C28931bI A03;
    public WDSButton A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public String A0A;
    public List A0B;
    public View A0C;
    public C28931bI A0D;
    public boolean A0E;
    public final C18100vl A0F;

    public UpdateEmailActivity() {
        this(0);
        this.A0F = C99274sY.A00(new AnonymousClass5HQ(this), new AnonymousClass5HP(this), new AnonymousClass5NT(this), AnonymousClass3MW.A15(C161528Fl.class));
        this.A0B = C18460wS.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        X.C73203Rj.A08(r3, r4, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0084, code lost:
        r3.A0D(r0);
        r3.A0T(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        return r3.create();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        return super.onCreateDialog(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r5) {
        /*
            r4 = this;
            r1 = 0
            switch(r5) {
                case 1: goto L_0x007d;
                case 2: goto L_0x0057;
                case 3: goto L_0x004a;
                case 4: goto L_0x0020;
                case 5: goto L_0x0042;
                case 6: goto L_0x0009;
                default: goto L_0x0004;
            }
        L_0x0004:
            android.app.Dialog r0 = super.onCreateDialog(r5)
            return r0
        L_0x0009:
            java.util.List r3 = r4.A0B
            r0 = 25
            X.4sV r2 = X.C99244sV.A00(r4, r0)
            r1 = 14
            X.4sM r0 = new X.4sM
            r0.<init>(r4, r1)
            X.05w r0 = X.AnonymousClass4HQ.A00(r4, r3, r0, r2)
            r0.show()
            goto L_0x0004
        L_0x0020:
            com.whatsapp.WaEditText r0 = r4.A02
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "emailInput"
        L_0x0026:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x002b:
            r0.setEnabled(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r4.A04
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "nextButton"
            goto L_0x0026
        L_0x0035:
            r0.setEnabled(r1)
            X.3Rj r3 = X.C73203Rj.A01(r4)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 41
            goto L_0x0053
        L_0x0042:
            X.3Rj r3 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131889717(0x7f120e35, float:1.9414105E38)
            goto L_0x0084
        L_0x004a:
            X.3Rj r3 = X.C73203Rj.A02(r4)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 42
        L_0x0053:
            X.C73203Rj.A08(r3, r4, r0, r1)
            goto L_0x008a
        L_0x0057:
            X.3Rj r3 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131889690(0x7f120e1a, float:1.941405E38)
            r3.A0E(r0)
            r0 = 2131889644(0x7f120dec, float:1.9413957E38)
            r3.A0D(r0)
            r1 = 2131895092(0x7f122334, float:1.9425007E38)
            r0 = 39
            X.C73203Rj.A08(r3, r4, r0, r1)
            r2 = 2131898766(0x7f12318e, float:1.943246E38)
            r1 = 40
            X.4bA r0 = new X.4bA
            r0.<init>(r4, r1)
            r3.A0X(r0, r2)
            goto L_0x008a
        L_0x007d:
            X.3Rj r3 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131889674(0x7f120e0a, float:1.9414018E38)
        L_0x0084:
            r3.A0D(r0)
            r3.A0T(r1)
        L_0x008a:
            X.05w r0 = r3.create()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.email.UpdateEmailActivity.onCreateDialog(int):android.app.Dialog");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        if (this.A01 == 1) {
            menu.add(0, 1, 0, 2131889692);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public static final int A03(UpdateEmailActivity updateEmailActivity) {
        int i = updateEmailActivity.A01;
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 2;
        }
        return 1;
    }

    public static final void A0Q(UpdateEmailActivity updateEmailActivity) {
        C28931bI r0 = updateEmailActivity.A03;
        if (r0 != null) {
            ((TextView) AnonymousClass3MX.A0D(r0)).setText(2131891443);
            C28931bI r1 = updateEmailActivity.A03;
            if (r1 != null) {
                r1.A04(0);
                return;
            }
        }
        C18070vi.A11("invalidEmailViewStub");
        throw null;
    }

    public void A2y() {
        if (!this.A0E) {
            this.A0E = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A05 = C000200d.A00(A0K.A07);
            this.A06 = C000200d.A00(r1.A9X);
            this.A07 = C000200d.A00(r2.AKr);
            this.A08 = AnonymousClass3MZ.A14(r2);
            this.A09 = AnonymousClass3MW.A0s(r2);
        }
    }

    public final AnonymousClass00H A4b() {
        AnonymousClass00H r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emailVerificationLogger");
        throw null;
    }

    public static final void A0V(UpdateEmailActivity updateEmailActivity, String str) {
        if (str.length() > 0) {
            if (!Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
                Log.i("UpdateEmailActivity/executeSetEmailRequest/invalid email");
                C72453Mb.A0k(updateEmailActivity).A00(updateEmailActivity.A0A, "INVALID_EMAIL", updateEmailActivity.A00, A03(updateEmailActivity), 2, 2);
                A0Q(updateEmailActivity);
                return;
            } else if (str.equals(updateEmailActivity.A0A.A0o()) && updateEmailActivity.A01 != 2) {
                Log.i("UpdateEmailActivity/executeSetEmailRequest/same email");
                C72453Mb.A0k(updateEmailActivity).A00(updateEmailActivity.A0A, "SAME_EMAIL", updateEmailActivity.A00, A03(updateEmailActivity), 2, 2);
                C28931bI r0 = updateEmailActivity.A03;
                if (r0 != null) {
                    ((TextView) AnonymousClass3MX.A0D(r0)).setText(2131895373);
                    C28931bI r1 = updateEmailActivity.A03;
                    if (r1 != null) {
                        r1.A04(0);
                        return;
                    }
                }
                C18070vi.A11("invalidEmailViewStub");
                throw null;
            }
        }
        AnonymousClass4Yv.A01(updateEmailActivity, 1);
        AnonymousClass00H r02 = updateEmailActivity.A07;
        if (r02 != null) {
            ((C196159uY) r02.get()).A03(new C95844mt(0, str, updateEmailActivity), str, false);
        } else {
            C18070vi.A11("emailVerificationXmppMethods");
            throw null;
        }
    }

    public void onBackPressed() {
        Intent A1O;
        C72453Mb.A0k(this).A00(this.A0A, (String) null, this.A00, A03(this), 7, 3);
        int i = this.A00;
        AnonymousClass00H r0 = this.A09;
        if (r0 != null) {
            r0.get();
            if (i == 3) {
                A1O = AnonymousClass1LU.A1m(this, false).addFlags(67108864);
            } else {
                A1O = AnonymousClass1LU.A1O(this, this.A0A, this.A00);
            }
            C18070vi.A0b(A1O);
            this.A01.A08(this, A1O);
            finish();
            return;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public void onCreate(Bundle bundle) {
        int i;
        String A0o;
        super.onCreate(bundle);
        setContentView(2131627259);
        C72473Md.A18(this);
        this.A04 = AnonymousClass3MW.A0q(this.A00, 2131436538);
        this.A02 = (WaEditText) AnonymousClass1HF.A06(this.A00, 2131436539);
        this.A0C = AnonymousClass1HF.A06(this.A00, 2131436535);
        this.A03 = C28931bI.A00(this.A00, 2131431778);
        this.A0D = C28931bI.A00(this.A00, 2131436536);
        this.A01 = getIntent().getIntExtra("state", 0);
        this.A00 = getIntent().getIntExtra("entrypoint", 0);
        this.A0A = C72453Mb.A0v(this);
        C72453Mb.A0k(this).A00(this.A0A, (String) null, this.A00, A03(this), 8, 3);
        int i2 = this.A01;
        if (i2 != 1) {
            i = 2131889701;
            if (i2 != 2) {
                i = 2131889652;
            }
        } else {
            i = 2131889661;
        }
        setTitle(i);
        if (!(this.A01 == 0 || (A0o = this.A0A.A0o()) == null || A0o.length() == 0)) {
            WaEditText waEditText = this.A02;
            if (waEditText != null) {
                waEditText.setText(this.A0A.A0o());
                WDSButton wDSButton = this.A04;
                if (wDSButton == null) {
                    C18070vi.A11("nextButton");
                    throw null;
                }
                wDSButton.setEnabled(true);
            }
            C18070vi.A11("emailInput");
            throw null;
        }
        if (!A9B.A0V(getResources())) {
            WaEditText waEditText2 = this.A02;
            if (waEditText2 != null) {
                waEditText2.A0I(false);
            }
            C18070vi.A11("emailInput");
            throw null;
        }
        WaEditText waEditText3 = this.A02;
        if (waEditText3 != null) {
            C89554ce.A00(waEditText3, this, 1);
            WDSButton wDSButton2 = this.A04;
            if (wDSButton2 == null) {
                C18070vi.A11("nextButton");
                throw null;
            }
            C89934dG.A00(wDSButton2, this, 8);
            C18100vl r3 = this.A0F;
            C91644g1.A00(this, ((C161528Fl) r3.getValue()).A00, C99244sV.A00(this, 24), 29);
            int A002 = C18020vd.A00(C18040vf.A02, this.A0E, 12537);
            if (A002 > 0 && !C17880vN.A1W(C72453Mb.A0M(this), "pref_email_hints_shown")) {
                ((C161528Fl) r3.getValue()).A0T(this, A002);
                return;
            }
            return;
        }
        C18070vi.A11("emailInput");
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A0B2 = C72453Mb.A0B(menuItem);
        if (A0B2 == 1) {
            AnonymousClass4Yv.A01(this, 2);
            return true;
        } else if (A0B2 != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }

    public UpdateEmailActivity(int i) {
        this.A0E = false;
        C91014f0.A00(this, 1);
    }
}
