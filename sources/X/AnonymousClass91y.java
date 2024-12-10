package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.CopyableTextView;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.payments.ui.widget.PayToolbar;
import com.whatsapp.util.Log;

/* renamed from: X.91y  reason: invalid class name */
public abstract class AnonymousClass91y extends C166828e6 implements View.OnClickListener {
    public AnonymousClass1KB A00;
    public C132216mP A01;
    public AnonymousClass181 A02;
    public C18000vb A03;
    public C20284AEs A04;
    public AnonymousClass1D9 A05;
    public AnonymousClass1LU A06;
    public AnonymousClass1QL A07;
    public AnonymousClass1QJ A08;
    public AnonymousClass1QO A09;
    public AnonymousClass1QS A0A;
    public AnonymousClass6MW A0B;
    public C195289t6 A0C;
    public PayToolbar A0D;
    public AnonymousClass10I A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public int A0H;
    public TextView A0I;
    public TextView A0J;
    public CopyableTextView A0K;
    public boolean A0L;
    public final AnonymousClass1QE A0M = AnonymousClass1QE.A00("PaymentMethodDetailsActivity", "payment-settings", "COMMON");
    public final B5R A0N = new C20755AXk(this, 0);

    public static int A0Q(AnonymousClass91y r3, int i) {
        TypedArray typedArray;
        try {
            typedArray = r3.obtainStyledAttributes(i, new int[]{16843071});
        } catch (Resources.NotFoundException e) {
            Log.e(e.getMessage());
            typedArray = null;
        }
        if (typedArray != null) {
            return typedArray.getDimensionPixelOffset(0, -1);
        }
        return -1;
    }

    public void A4d(boolean z) {
        ((IndiaUpiBankAccountDetailsActivity) this).A4f(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r11 = r14
            super.onCreate(r15)
            boolean r5 = r14 instanceof com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity
            if (r5 == 0) goto L_0x0050
            r6 = 1
            r0 = 2131625314(0x7f0e0562, float:1.8877832E38)
        L_0x000c:
            r14.setContentView((int) r0)
            r0 = 2131434838(0x7f0b1d56, float:1.8491501E38)
            android.view.ViewGroup r3 = X.AnonymousClass3MX.A0F(r14, r0)
            android.view.LayoutInflater r2 = r14.getLayoutInflater()
            r0 = 2131626382(0x7f0e098e, float:1.8879999E38)
            r1 = 0
            android.view.View r0 = r2.inflate(r0, r1)
            r3.addView(r0)
            android.content.Intent r0 = r14.getIntent()
            if (r0 == 0) goto L_0x0045
            android.os.Bundle r0 = X.AnonymousClass3MY.A09(r14)
            if (r0 == 0) goto L_0x0045
            android.os.Bundle r0 = X.AnonymousClass3MY.A09(r14)
            java.lang.String r4 = "extra_bank_account"
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r3 = "extra_bank_account_or_card_credential_id"
            if (r0 != 0) goto L_0x0055
            java.lang.String r0 = X.C108955ca.A0r(r14, r3)
            if (r0 != 0) goto L_0x0055
        L_0x0045:
            X.1QE r1 = r14.A0M
            java.lang.String r0 = "got null bank account; finishing"
            r1.A04(r0)
            r14.finish()
            return
        L_0x0050:
            r6 = 0
            r0 = 2131626381(0x7f0e098d, float:1.8879997E38)
            goto L_0x000c
        L_0x0055:
            if (r6 == 0) goto L_0x0065
            r0 = 2131433485(0x7f0b180d, float:1.8488757E38)
            android.view.View r0 = r14.findViewById(r0)
            com.whatsapp.payments.ui.widget.PayToolbar r0 = (com.whatsapp.payments.ui.widget.PayToolbar) r0
            r14.A0D = r0
            r14.setSupportActionBar(r0)
        L_0x0065:
            if (r5 == 0) goto L_0x0128
            r2 = r11
            com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity r2 = (com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity) r2
            X.1QO r0 = r2.A05
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L_0x007a
            X.1QO r0 = r2.A05
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0128
        L_0x007a:
            X.1KB r8 = r14.A00
            X.10I r13 = r14.A0E
            X.0vb r9 = r14.A03
            X.1QO r10 = r14.A09
            X.00H r0 = r14.A0G
            X.A56 r12 = X.AnonymousClass8BR.A0c(r0)
            X.90o r7 = new X.90o
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x008d:
            r14.A0C = r7
            r7.A00()
            r0 = 2131433577(0x7f0b1869, float:1.8488944E38)
            android.widget.TextView r0 = X.AnonymousClass3MX.A0L(r14, r0)
            r14.A0J = r0
            r0 = 2131433574(0x7f0b1866, float:1.8488938E38)
            android.view.View r0 = r14.findViewById(r0)
            com.whatsapp.CopyableTextView r0 = (com.whatsapp.CopyableTextView) r0
            r14.A0K = r0
            r0 = 2131433575(0x7f0b1867, float:1.848894E38)
            android.widget.TextView r0 = X.AnonymousClass3MX.A0L(r14, r0)
            r14.A0I = r0
            r0 = 2131100602(0x7f0603ba, float:1.781359E38)
            if (r6 != 0) goto L_0x00be
            r2 = 2130971195(0x7f040a3b, float:1.7551122E38)
            r0 = 2131102531(0x7f060b43, float:1.7817503E38)
            int r0 = X.AnonymousClass1YL.A00(r14, r2, r0)
        L_0x00be:
            int r0 = X.C19740yt.A00(r14, r0)
            r14.A0H = r0
            r0 = 2131431406(0x7f0b0fee, float:1.848454E38)
            android.widget.ImageView r2 = X.AnonymousClass3MX.A0I(r14, r0)
            int r0 = r14.A0H
            X.AnonymousClass4aX.A0D(r2, r0)
            r0 = 2131431408(0x7f0b0ff0, float:1.8484544E38)
            android.view.View r0 = r14.findViewById(r0)
            r0.setOnClickListener(r14)
            X.00H r0 = r14.A0F
            X.10T r2 = X.C17880vN.A0V(r0)
            X.B5R r0 = r14.A0N
            r2.registerObserver(r0)
            android.os.Bundle r0 = X.AnonymousClass3MY.A09(r14)
            java.lang.Object r2 = r0.get(r4)
            android.os.Bundle r0 = X.AnonymousClass3MY.A09(r14)
            if (r2 == 0) goto L_0x011d
            java.lang.Object r0 = r0.get(r4)
            X.AEs r0 = (X.C20284AEs) r0
            java.lang.String r1 = r0.A0A
        L_0x00fb:
            r0 = 2131891797(0x7f121655, float:1.9418324E38)
            r14.CNA(r0)
            X.1QS r0 = r14.A0A
            X.A5I r0 = r0.A01()
            X.C17960vV.A07(r1)
            X.Af0 r2 = r0.A02(r1)
            r0 = 15
            X.Aef r1 = new X.Aef
            r1.<init>(r14, r0)
            X.1KB r0 = r14.A00
            java.util.concurrent.Executor r0 = r0.A05
            r2.A0A(r1, r0)
            return
        L_0x011d:
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L_0x00fb
            java.lang.String r1 = X.C108955ca.A0r(r14, r3)
            goto L_0x00fb
        L_0x0128:
            boolean r0 = r14 instanceof com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity
            if (r0 == 0) goto L_0x0141
            android.os.Bundle r0 = X.AnonymousClass3MY.A09(r14)
            java.lang.Object r0 = r0.get(r4)
            X.AEs r0 = (X.C20284AEs) r0
            boolean r0 = X.C20063A5m.A01(r0)
            X.90n r7 = new X.90n
            r7.<init>(r14, r0)
            goto L_0x008d
        L_0x0141:
            X.9t6 r7 = new X.9t6
            r7.<init>(r14)
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91y.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        CharSequence charSequence;
        int i2;
        boolean z = true;
        switch (i) {
            case 200:
                i2 = 2131889336;
                break;
            case 201:
                A56 A0c = AnonymousClass8BR.A0c(this.A0G);
                C20284AEs aEs = this.A04;
                C18070vi.A0d(aEs, 0);
                z = false;
                charSequence = C17880vN.A0q(this, A0c.A03(aEs, true), new Object[1], 0, 2131889335);
                break;
            case 202:
                i2 = 2131889334;
                break;
            default:
                return super.onCreateDialog(i);
        }
        charSequence = C43251zV.A05(this, this.A0D, getString(i2));
        String string = getString(2131895092);
        int i3 = 201;
        if (z) {
            i3 = 200;
        }
        C73203Rj A012 = AnonymousClass4a6.A01(this, 2132083283);
        A012.A0S(charSequence);
        A012.A0T(true);
        A012.A0X(new A9V(this, i3, 5), 2131898766);
        A012.A0L(new A9Z(this, i3, 1, z), string);
        A012.A0G(new A9O(this, i3, 3));
        if (!z) {
            A012.setTitle(getString(2131889336));
        }
        return A012.create();
    }

    public void A4b() {
        AnonymousClass9YM r2;
        AnonymousClass10I r5 = this.A0E;
        AnonymousClass1QS r4 = this.A0A;
        AnonymousClass1QE r3 = this.A0M;
        if (this instanceof IndiaUpiBankAccountDetailsActivity) {
            r2 = new AnonymousClass9YM((IndiaUpiBankAccountDetailsActivity) this);
        } else {
            r2 = null;
        }
        C17890vO.A0u(new AnonymousClass9B9(r4, r3, r2, new C183379Ya(this)), r5);
    }

    public void onStop() {
        C17880vN.A0V(this.A0F).unregisterObserver(this.A0N);
        super.onStop();
    }

    public void A3h(int i) {
        if (i == 2131893663) {
            finish();
        }
    }

    public void A4c(C20284AEs aEs, boolean z) {
        int i;
        CEx();
        if (aEs == null) {
            finish();
            return;
        }
        this.A04 = aEs;
        this.A0L = AnonymousClass000.A1T(aEs.A01, 2);
        AnonymousClass8BR.A1E(this.A0J, C20284AEs.A02(aEs));
        ImageView A0I2 = AnonymousClass3MX.A0I(this, 2131433583);
        if (aEs instanceof AnonymousClass8pK) {
            i = A8e.A00(((AnonymousClass8pK) aEs).A01);
        } else {
            Bitmap A062 = aEs.A06();
            if (A062 != null) {
                A0I2.setImageBitmap(A062);
                this.A0C.A01(aEs, z);
            }
            i = 2131231037;
        }
        A0I2.setImageResource(i);
        this.A0C.A01(aEs, z);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1) {
            Intent A0A2 = C17880vN.A0A();
            int i3 = 0;
            if (intent != null) {
                i3 = intent.getIntExtra("extra_remove_payment_account", 0);
            }
            A0A2.putExtra("extra_remove_payment_account", i3);
            setResult(-1, A0A2);
            finish();
        }
    }

    public void onClick(View view) {
        String str;
        if (view.getId() == 2131429860) {
            if (!this.A0L) {
                CNA(2131895077);
                if (this instanceof C1763291s) {
                    C1763291s r4 = (C1763291s) this;
                    r4.A4f(new AXP((BDG) null, (BD4) null, r4, 0), r4.A04.A0A, (String) null);
                    return;
                }
                IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) this;
                if (indiaUpiBankAccountDetailsActivity.A05.A0S()) {
                    Intent A0B2 = AnonymousClass8BX.A0B(indiaUpiBankAccountDetailsActivity);
                    A0B2.putExtra("extra_payments_entry_type", 7);
                    AnonymousClass8BU.A13(A0B2, indiaUpiBankAccountDetailsActivity, "extra_referral_screen", "payment_bank_account_details");
                    return;
                }
                indiaUpiBankAccountDetailsActivity.CNA(2131895077);
                indiaUpiBankAccountDetailsActivity.A0B.COK();
                AXP axp = new AXP(indiaUpiBankAccountDetailsActivity.A03, indiaUpiBankAccountDetailsActivity.A0B, indiaUpiBankAccountDetailsActivity, 15);
                AnonymousClass8pS A0N2 = AnonymousClass8BU.A0N(indiaUpiBankAccountDetailsActivity.A0P, indiaUpiBankAccountDetailsActivity.A00.A08, "onMakeDefaultPaymentMethod Unable to get IndiaUpiMethodData");
                C175818zK r5 = indiaUpiBankAccountDetailsActivity.A0A;
                C1418477e r6 = A0N2.A08;
                String str2 = A0N2.A0E;
                C1418477e r7 = A0N2.A05;
                String str3 = indiaUpiBankAccountDetailsActivity.A00.A0A;
                if (C20061A5k.A02(r6)) {
                    r5.A06.A02(r5.A00, (C196259ui) null, new AYE(r7, axp, r5, str3, true, false));
                } else {
                    r5.A01(r6, r7, axp, str2, str3, true, false);
                }
            }
        } else if (view.getId() == 2131431408) {
            AnonymousClass10I r1 = this.A0E;
            AnonymousClass6MW r0 = this.A0B;
            if (r0 != null && r0.A09() == 1) {
                this.A0B.A0B(false);
            }
            Bundle A0D2 = C17880vN.A0D();
            A0D2.putString("com.whatsapp.support.DescribeProblemActivity.from", "payments:account-details");
            C170278pb r2 = this.A04.A08;
            if (r2 != null) {
                if ((r2 instanceof AnonymousClass8pJ) || (r2 instanceof AnonymousClass8pX)) {
                    str = null;
                } else if (r2 instanceof AnonymousClass8pY) {
                    str = ((AnonymousClass8pY) r2).A0B;
                } else {
                    str = ((AnonymousClass8pW) r2).A04;
                }
                A0D2.putString("com.whatsapp.support.DescribeProblemActivity.paymentBankPhone", str);
            }
            AnonymousClass1LU r12 = this.A06;
            AnonymousClass181 r72 = this.A02;
            AnonymousClass18O r62 = this.A06;
            AnonymousClass6MW r22 = new AnonymousClass6MW(A0D2, this, this.A01, r62, r72, this.A03, this.A04, (AW0) null, this.A05, r12, this.A08, "payments:account-details");
            this.A0B = r22;
            C17890vO.A0u(r22, r1);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 2131432616, 0, getString(2131895133));
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else if (menuItem.getItemId() != 2131432616) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A4b();
            return true;
        }
    }
}
