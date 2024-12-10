package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilSmbPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;
import com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import java.util.List;

/* renamed from: X.91U  reason: invalid class name */
public abstract class AnonymousClass91U extends C166808e3 implements C22577BDx {
    public int A00;
    public int A01 = 6;
    public long A02;
    public C170648qR A03;
    public AnonymousClass12E A04;
    public AnonymousClass118 A05;
    public C25181Nf A06;
    public AnonymousClass122 A07;
    public AnonymousClass1E7 A08;
    public C24751Ln A09;
    public AnonymousClass1NG A0A;
    public AnonymousClass8pI A0B;
    public AEX A0C;
    public AnonymousClass1QG A0D;
    public AnonymousClass1LU A0E;
    public AnonymousClass1BI A0F;
    public AnonymousClass1BI A0G;
    public UserJid A0H;
    public UserJid A0I;
    public UserJid A0J;
    public AnonymousClass1QL A0K;
    public AnonymousClass2PH A0L;
    public AnonymousClass1KG A0M;
    public C31061ex A0N;
    public AnonymousClass1QJ A0O;
    public AnonymousClass1QO A0P;
    public AnonymousClass1QS A0Q;
    public C191529mk A0R;
    public C62542rZ A0S;
    public C33351ig A0T;
    public C19962A0v A0U;
    public C20107A7l A0V;
    public C57952ju A0W;
    public PaymentIncentiveViewModel A0X;
    public AnonymousClass7MX A0Y;
    public C32551hN A0Z;
    public C1418377d A0a;
    public C26631Sw A0b;
    public AnonymousClass00H A0c;
    public AnonymousClass00H A0d;
    public AnonymousClass00H A0e;
    public AnonymousClass00H A0f;
    public AnonymousClass00H A0g;
    public AnonymousClass00H A0h;
    public AnonymousClass00H A0i;
    public Integer A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public List A0u;
    public boolean A0v;
    public boolean A0w = false;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public Bundle A12;

    public static C175838zM A1K(AnonymousClass91S r13) {
        AnonymousClass91S r1 = r13;
        C30931ek r132 = r13.A0A;
        A0B a0b = r1.A09;
        A7U a7u = r1.A0M;
        C31061ex r7 = r1.A0N;
        C195859u1 r8 = r1.A05;
        AZ6 az6 = r1.A0S;
        return new C175838zM(r1, r13.A05, (AnonymousClass1OZ) r13.A0f.get(), a7u, r1.A0N, (C33711jG) r1.A0g.get(), r7, r8, r1, az6, a0b, r1.A0V, r132);
    }

    public static void A1c(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity, C189649ja r3) {
        r3.A00.A0C(3);
        indiaUpiDeviceBindStepActivity.A0F.A00.A0C(3);
    }

    public static Intent A1H(Context context, C19967A1c a1c) {
        Intent intent = new Intent(context, IndiaUpiOnboardingErrorEducationActivity.class);
        if (a1c.A01 != null) {
            intent.putExtra("error_text", a1c.A00(context));
        }
        return intent;
    }

    public static Object A1L(AnonymousClass10E r1, AnonymousClass12E r2, AnonymousClass91U r3) {
        r3.A04 = r2;
        r3.A0A = (AnonymousClass1NG) r1.A22.get();
        return r1.A8G.get();
    }

    public static StringBuilder A1M(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(new AnonymousClass20F(obj.getClass()).BZJ());
        return sb;
    }

    public static void A1P(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, AnonymousClass12E r4, AnonymousClass91T r5) {
        r5.A04 = r4;
        r5.A0A = (AnonymousClass1NG) r2.A22.get();
        r5.A0P = (AnonymousClass1QO) r2.A8G.get();
        r5.A0V = AnonymousClass1K1.A1U(r1);
        r5.A0M = r2.AG9();
        r5.A0T = (C33351ig) r2.A83.get();
        r5.A06 = (C25181Nf) r2.A2o.get();
        r5.A0e = C000200d.A00(r2.AYe);
        r5.A0E = (AnonymousClass1LU) r2.ABd.get();
        r5.A0k = r3.AEf;
        r5.A0W = (AnonymousClass1R2) r2.A8L.get();
        r5.A07 = (AnonymousClass1QR) r2.A8D.get();
        r5.A0X = C000200d.A00(r2.A8C);
        r5.A06 = (C24921Me) r2.ABX.get();
    }

    public static void A1R(AnonymousClass1K1 r0, AnonymousClass10E r1, AnonymousClass10G r2, BrazilPaymentActivity brazilPaymentActivity, Object obj) {
        brazilPaymentActivity.A0P = (AnonymousClass1QO) obj;
        brazilPaymentActivity.A0V = AnonymousClass1K1.A1U(r0);
        brazilPaymentActivity.A0M = r1.AG9();
        brazilPaymentActivity.A0T = (C33351ig) r1.A83.get();
        brazilPaymentActivity.A06 = (C25181Nf) r1.A2o.get();
        brazilPaymentActivity.A0e = C000200d.A00(r1.AYe);
        brazilPaymentActivity.A0c = (C36401np) r2.A30.get();
        brazilPaymentActivity.A09 = (AnonymousClass1LU) r1.ABd.get();
        brazilPaymentActivity.A03 = (C33251iW) r1.ABA.get();
        brazilPaymentActivity.A05 = (C24921Me) r1.ABX.get();
        brazilPaymentActivity.A06 = (C18000vb) r1.ABz.get();
        brazilPaymentActivity.A0b = (AnonymousClass129) r1.A4I.get();
        brazilPaymentActivity.A0Z = (C30931ek) r1.A81.get();
    }

    public static void A1T(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, AnonymousClass91S r4) {
        r4.A00 = (C18000vb) r2.ABz.get();
        r4.A0A = (C30931ek) r2.A81.get();
        r4.A09 = r2.AGY();
        r4.A01 = (C20752AXh) r3.A2m.get();
        r4.A05 = AnonymousClass1K1.A1N(r1);
        r4.A0E = C000200d.A00(r2.Acr);
        r4.A08 = (A27) r2.A82.get();
        r4.A0D = C000200d.A00(r3.ACP);
        r4.A0C = C000200d.A00(r3.A7t);
        r4.A0B = C000200d.A00(r3.A7s);
    }

    public static void A1U(AnonymousClass10E r1, AnonymousClass10G r2, AnonymousClass1QD r3, BrazilPaymentActivity brazilPaymentActivity) {
        brazilPaymentActivity.A0F = r3;
        brazilPaymentActivity.A0A = (AXR) r2.A6y.get();
        brazilPaymentActivity.A0M = (C191949nS) r2.A77.get();
        brazilPaymentActivity.A0R = (C20037A4g) r2.A71.get();
        brazilPaymentActivity.A0f = C000200d.A00(r2.AD5);
        brazilPaymentActivity.A0Q = (C195929uA) r2.AEU.get();
        brazilPaymentActivity.A0L = (BD4) r2.A0V.get();
        brazilPaymentActivity.A0N = (C191389mW) r1.AaX.get();
        brazilPaymentActivity.A08 = (AnonymousClass1KI) r1.A80.get();
        brazilPaymentActivity.A0e = C000200d.A00(r1.A2n);
        brazilPaymentActivity.A0h = C000200d.A00(r1.A87);
        brazilPaymentActivity.A0g = C000200d.A00(r1.AcC);
        brazilPaymentActivity.A0K = (A27) r1.A82.get();
    }

    public static void A1W(AnonymousClass10E r1, AnonymousClass10G r2, AnonymousClass91T r3) {
        r3.A04 = (C132216mP) r2.A4S.get();
        r3.A0D = (AnonymousClass1D9) r1.A0n.get();
        r3.A0Q = (AnonymousClass1QD) r1.A89.get();
        r3.A0O = (C20080A6g) r1.A5G.get();
        r3.A0M = (A7U) r1.A5E.get();
        r3.A0K = (A12) r2.A6g.get();
        r3.A0S = (AZ6) r1.A5D.get();
        r3.A0N = (AXS) r1.A5F.get();
        r3.A0R = (C170628qP) r1.AcW.get();
        r3.A0V = (AnonymousClass90Z) r2.A2n.get();
        r3.A05 = (AnonymousClass181) r1.AA9.get();
    }

    public static void A1X(AnonymousClass10E r1, BrazilPaymentActivity brazilPaymentActivity) {
        brazilPaymentActivity.A07 = (AnonymousClass1QR) r1.A8D.get();
        brazilPaymentActivity.A0D = (C20074A6a) r1.AFz.get();
    }

    public static void A1Y(AnonymousClass10E r0, AnonymousClass91T r1) {
        r1.A0C = (AnonymousClass18K) r0.A9B.get();
    }

    public static void A1b(AnonymousClass91T r1) {
        r1.A0N.A0K();
        r1.CEx();
        r1.CNA(2131894072);
    }

    public PaymentView A4b() {
        if (!(this instanceof AnonymousClass91T)) {
            return ((BrazilPaymentActivity) this).A0W;
        }
        AnonymousClass91T r1 = (AnonymousClass91T) this;
        if (r1 instanceof AnonymousClass91R) {
            return ((AnonymousClass91R) r1).A0J;
        }
        return null;
    }

    public AnonymousClass210 A4c(String str, List list) {
        AnonymousClass206 r5;
        UserJid userJid;
        C32551hN r3 = this.A0Z;
        AnonymousClass1BI A002 = this.A0A.A00(this.A0G);
        C17960vV.A07(A002);
        C21320Ai5 ai5 = new C21320Ai5();
        long j = this.A02;
        if (j != 0) {
            r5 = AnonymousClass1W2.A02(this.A0d, j);
        } else {
            r5 = null;
        }
        AnonymousClass210 A003 = r3.A00(A002, r5, ai5, str, list, 0);
        if (C22971Dz.A0e(this.A0G) && (userJid = this.A0J) != null) {
            A003.A0d(userJid);
        }
        return A003;
    }

    public void A4d() {
        if (this instanceof BrazilSmbPaymentActivity) {
            BrazilSmbPaymentActivity brazilSmbPaymentActivity = (BrazilSmbPaymentActivity) this;
            AnonymousClass1BI r1 = brazilSmbPaymentActivity.A0G;
            if (r1 != null) {
                Intent A1w = brazilSmbPaymentActivity.A00.A1w(brazilSmbPaymentActivity, r1, 0);
                C18070vi.A0X(A1w);
                A1w.putExtra("show_keyboard", false);
                A1w.putExtra("start_t", SystemClock.uptimeMillis());
                ((AnonymousClass4RV) brazilSmbPaymentActivity.A0c.get()).A00(A1w, "BrazilSmbPaymentActivity", ((C25431Oe) brazilSmbPaymentActivity.A01.get()).A03());
                brazilSmbPaymentActivity.A3q(A1w, false);
            }
            brazilSmbPaymentActivity.finish();
            return;
        }
        AnonymousClass1BI r12 = this.A0G;
        if (!(r12 == null && (r12 = this.A0H) == null)) {
            Intent A1w2 = this.A0E.A1w(this, r12, 0);
            A1w2.putExtra("show_keyboard", false);
            A1w2.putExtra("start_t", SystemClock.uptimeMillis());
            ((AnonymousClass4RV) this.A0c.get()).A00(A1w2, "BasePaymentsActivity", ((C25431Oe) this.A0i.get()).A03());
            A3q(A1w2, false);
        }
        finish();
    }

    public void A4e(Bundle bundle) {
        AnonymousClass1E7 r0;
        AnonymousClass8pI A002;
        if (!(this instanceof AnonymousClass91T)) {
            BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) this;
            brazilPaymentActivity.setContentView(2131626885);
            if (!(brazilPaymentActivity instanceof BrazilOrderDetailsActivity) && brazilPaymentActivity.A0l) {
                brazilPaymentActivity.setSupportActionBar(AnonymousClass3Ma.A0G(brazilPaymentActivity));
            }
            C003401n supportActionBar = brazilPaymentActivity.getSupportActionBar();
            if (supportActionBar != null) {
                Context context = brazilPaymentActivity.A02;
                int i = 2131892489;
                if (brazilPaymentActivity.A0y) {
                    i = 2131894017;
                }
                supportActionBar.A0S(context.getString(i));
                supportActionBar.A0W(true);
                if (!brazilPaymentActivity.A0y) {
                    supportActionBar.A0J(0.0f);
                }
            }
            Intent intent = brazilPaymentActivity.getIntent();
            String stringExtra = intent.getStringExtra("referral_screen");
            brazilPaymentActivity.A0j = stringExtra;
            if (TextUtils.isEmpty(stringExtra)) {
                brazilPaymentActivity.A0j = intent.getStringExtra("extra_referral_screen");
            }
            if (TextUtils.isEmpty(brazilPaymentActivity.A0j)) {
                brazilPaymentActivity.A0j = "new_payment";
            }
            C25181Nf r2 = brazilPaymentActivity.A06;
            UserJid userJid = brazilPaymentActivity.A0J;
            C17960vV.A07(userJid);
            brazilPaymentActivity.A08 = r2.A01(userJid);
            brazilPaymentActivity.A05.CGF(new C21426Ajt(brazilPaymentActivity, 20));
            if (brazilPaymentActivity.A0P.A0E()) {
                UserJid userJid2 = brazilPaymentActivity.A0J;
                if (brazilPaymentActivity.A0P.A0D() && (A002 = C62862s7.A00(brazilPaymentActivity.A09, AnonymousClass8BR.A0R(brazilPaymentActivity.A0Q), userJid2)) != null && A002.A00 < AnonymousClass8BS.A01(brazilPaymentActivity)) {
                    C17890vO.A0t(brazilPaymentActivity.A0L);
                    AnonymousClass2PH r22 = new AnonymousClass2PH(brazilPaymentActivity.A04, brazilPaymentActivity.A09, userJid2, brazilPaymentActivity.A0Q);
                    brazilPaymentActivity.A0L = r22;
                    C17890vO.A0u(r22, brazilPaymentActivity.A05);
                }
            }
            if (AnonymousClass8BS.A1M(brazilPaymentActivity.A0E)) {
                if (!C18020vd.A05(C18040vf.A02, brazilPaymentActivity.A0E, 979)) {
                    brazilPaymentActivity.A01 |= 1;
                    brazilPaymentActivity.A4i(brazilPaymentActivity.A0J);
                }
            }
            if (!brazilPaymentActivity.A0P.A09() || (r0 = brazilPaymentActivity.A08) == null || !r0.A0C()) {
                BrazilPaymentActivity.A11(brazilPaymentActivity, false);
                return;
            }
            brazilPaymentActivity.A01 |= 2;
            brazilPaymentActivity.CNA(2131895077);
            brazilPaymentActivity.A0U.BL1((ARR) null, brazilPaymentActivity.A0J, new AYT(brazilPaymentActivity, 0), 1, (String) null, true);
        }
    }

    public void A4f(Bundle bundle) {
        Intent A072 = AnonymousClass8BR.A07(this, PaymentGroupParticipantPickerActivity.class);
        AnonymousClass1BI r0 = this.A0G;
        C17960vV.A07(r0);
        A072.putExtra("extra_jid", r0.getRawString());
        if (bundle != null) {
            A072.putExtras(bundle);
        }
        startActivity(A072);
        finish();
    }

    public void A4h(AnonymousClass8pG r4) {
        PaymentIncentiveViewModel paymentIncentiveViewModel;
        C198179xu r0;
        C19962A0v a0v;
        C198769ys r02;
        if (AnonymousClass8BS.A1M(this.A0E) && (paymentIncentiveViewModel = this.A0X) != null && (r0 = (C198179xu) paymentIncentiveViewModel.A02.A06()) != null && (a0v = (C19962A0v) r0.A01) != null && (r02 = a0v.A01) != null) {
            r4.A01 = new ADR(String.valueOf(r02.A08.A01), (String) null, (String) null, (String) null);
        }
    }

    public void A4i(UserJid userJid) {
        if (this.A0X == null) {
            PaymentIncentiveViewModel A0M2 = AnonymousClass8BX.A0M(this);
            this.A0X = A0M2;
            if (A0M2 != null) {
                C20336AGs.A00(this, A0M2.A00, 30);
                C20336AGs.A00(this, this.A0X.A02, 31);
            }
        }
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A0X;
        if (paymentIncentiveViewModel != null) {
            paymentIncentiveViewModel.A07.CGF(new C70813Cp(paymentIncentiveViewModel, false));
            PaymentIncentiveViewModel paymentIncentiveViewModel2 = this.A0X;
            C21433Ak0.A00(paymentIncentiveViewModel2.A07, paymentIncentiveViewModel2, userJid, 4);
        }
    }

    public void A4j(BD4 bd4, C19962A0v a0v) {
        BD4 bd42 = bd4;
        if (this instanceof BrazilPaymentActivity) {
            BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) this;
            C20087A6p.A02(C20087A6p.A01(brazilPaymentActivity.A05, (AnonymousClass1KN) null, a0v, brazilPaymentActivity.A0m), bd42, 50, "new_payment", (String) null, 2);
            return;
        }
        C20087A6p.A02(C20087A6p.A00(this.A05, (AnonymousClass1KN) null, a0v, (String) null, true), bd42, 50, "new_payment", (String) null, 2);
    }

    public void A4k(BD4 bd4, C19962A0v a0v) {
        BD4 bd42 = bd4;
        if (this instanceof BrazilPaymentActivity) {
            BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) this;
            C20087A6p.A02(C20087A6p.A01(brazilPaymentActivity.A05, (AnonymousClass1KN) null, a0v, brazilPaymentActivity.A0m), bd42, 47, "new_payment", (String) null, 1);
            return;
        }
        A1a(this, bd4, a0v, 47);
    }

    public void C0a(PickerSearchDialogFragment pickerSearchDialogFragment) {
        this.A0Y.A02(pickerSearchDialogFragment);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A0J = C22941Dw.A02(intent.getStringExtra("extra_receiver_jid"));
            A4e(this.A12);
        } else if (i2 == 0 && this.A0J == null) {
            finish();
        }
    }

    public static Parcelable A1I(Activity activity) {
        return activity.getIntent().getParcelableExtra("extra_bank_account");
    }

    public static C003401n A1J(AnonymousClass91T r2) {
        r2.A4r(2131232759, 2131434837);
        return r2.getSupportActionBar();
    }

    public static void A1N(View view, C20284AEs aEs) {
        Bitmap A062 = aEs.A06();
        ImageView imageView = (ImageView) AnonymousClass1HF.A06(view, 2131434213);
        if (A062 != null) {
            imageView.setImageBitmap(A062);
        } else {
            imageView.setImageResource(2131231037);
        }
    }

    public static void A1O(TextView textView, IndiaUpiBankAccountAddedLandingActivity indiaUpiBankAccountAddedLandingActivity, int i) {
        textView.setText(i);
        indiaUpiBankAccountAddedLandingActivity.A02.setText(2131886939);
    }

    public static void A1Q(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, AnonymousClass91U r4, C18140vp r5) {
        r4.A0K = (AnonymousClass1QL) r5.get();
        r4.A0i = C000200d.A00(r2.A4Z);
        r4.A0h = C000200d.A00(r2.A86);
        r4.A0W = AnonymousClass1K1.A1V(r1);
        r4.A0N = (C31061ex) r2.A8E.get();
        r4.A0b = (C26631Sw) r2.AAO.get();
        r4.A0O = (AnonymousClass1QJ) r2.A8F.get();
        r4.A0g = C000200d.A00(r2.A84);
        r4.A0S = r2.AGE();
        r4.A05 = (AnonymousClass118) r2.ABY.get();
        r4.A0E = (AnonymousClass1LU) r2.ABd.get();
        r4.A0D = r2.ACi();
        r4.A0c = C000200d.A00(r2.A2B);
        r4.A03 = (C170648qR) r3.A6h.get();
    }

    public static void A1S(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, BrazilPaymentActivity brazilPaymentActivity, C18140vp r5) {
        brazilPaymentActivity.A0P = (A5H) r5.get();
        brazilPaymentActivity.A0J = (A54) r2.Acu.get();
        brazilPaymentActivity.A0I = (AnonymousClass72F) r2.AcL.get();
        brazilPaymentActivity.A0i = C000200d.A00(r2.A8C);
        brazilPaymentActivity.A0H = (C132646nG) r2.AcI.get();
        brazilPaymentActivity.A0S = (A5Y) r3.A7B.get();
        brazilPaymentActivity.A0O = (AnonymousClass90Y) r3.A79.get();
        brazilPaymentActivity.A0V = AnonymousClass1K1.A1T(r1);
        brazilPaymentActivity.A0X = (A5F) r3.A6z.get();
        brazilPaymentActivity.A0Y = (C192469oR) r3.A72.get();
        brazilPaymentActivity.A0d = C000200d.A00(r2.ABe);
        brazilPaymentActivity.A0G = (C191079lz) r3.A75.get();
        brazilPaymentActivity.A0C = AnonymousClass1K1.A1M(r1);
    }

    public static void A1V(AnonymousClass10E r1, AnonymousClass10G r2, AnonymousClass91U r3) {
        r3.A0R = (C191529mk) r2.AEk.get();
        r3.A0f = C000200d.A00(r1.A6N);
        r3.A0Q = (AnonymousClass1QS) r1.A8J.get();
        r3.A07 = (AnonymousClass122) r1.A2y.get();
        r3.A0d = C000200d.A00(r1.A3w);
        r3.A09 = (C24751Ln) r1.ABe.get();
        r3.A0Z = AnonymousClass10E.AIT(r1);
    }

    public static void A1Z(AnonymousClass10G r1, AnonymousClass91K r2) {
        r2.A01 = (C1764594h) r1.ACM.get();
        r2.A00 = new C23631Ha(new Object());
    }

    public static void A1a(AnonymousClass1FY r5, BD4 bd4, C19962A0v a0v, int i) {
        C20087A6p.A02(C20087A6p.A00(r5.A05, (AnonymousClass1KN) null, a0v, (String) null, true), bd4, Integer.valueOf(i), "new_payment", (String) null, 1);
    }

    public void A4g(AnonymousClass1KN r14) {
        AnonymousClass206 r10;
        PaymentView A4b = A4b();
        if (A4b != null) {
            PaymentView A4b2 = A4b();
            if (A4b2 == null || A4b2.getStickerIfSelected() == null) {
                C21435Ak2.A00(this.A05, this, A4b, r14, 33);
                A4d();
                return;
            }
            CNA(2131895077);
            C62542rZ r6 = this.A0S;
            C17960vV.A05(A4b);
            C1418377d stickerIfSelected = A4b.getStickerIfSelected();
            C17960vV.A07(stickerIfSelected);
            AnonymousClass1BI r8 = this.A0G;
            C17960vV.A07(r8);
            UserJid userJid = this.A0J;
            long j = this.A02;
            if (j != 0) {
                r10 = AnonymousClass1W2.A02(this.A0d, j);
            } else {
                r10 = null;
            }
            r6.A01(A4b.getPaymentBackground(), r8, userJid, r10, stickerIfSelected, A4b.getStickerSendOrigin()).A0A(new C21117Ael(A4b, r14, this, 2), this.A05.A05);
        }
    }

    public void A4l(String str) {
        int i;
        PaymentView A4b = A4b();
        if (A4b != null) {
            TextView A0E2 = C17880vN.A0E(A4b, 2131431152);
            if (C17880vN.A1W(A4b.A0h.A03(), "payment_incentive_tooltip_viewed") || A0E2 == null || str == null) {
                i = 8;
            } else {
                A0E2.setText(str);
                i = 0;
            }
            A0E2.setVisibility(i);
            int i2 = this.A01;
            A4b.A01 = i2;
            FrameLayout frameLayout = A4b.A05;
            if (i2 != 0) {
                frameLayout.setVisibility(8);
                return;
            }
            frameLayout.setVisibility(0);
            C17880vN.A1F(AnonymousClass8BU.A07(A4b.A0h), "payment_incentive_tooltip_viewed", true);
        }
    }

    public void CMj(DialogFragment dialogFragment) {
        CMl(dialogFragment);
    }

    public void onCreate(Bundle bundle) {
        C57312is r1;
        BD1 A002;
        Integer num;
        super.onCreate(bundle);
        this.A12 = bundle;
        if (getIntent() != null) {
            this.A00 = getIntent().getIntExtra("extra_conversation_message_type", 0);
            String stringExtra = getIntent().getStringExtra("extra_jid");
            C22931Dv r3 = AnonymousClass1BI.A00;
            this.A0G = r3.A02(stringExtra);
            this.A0F = r3.A02(getIntent().getStringExtra("extra_chat_jid"));
            String stringExtra2 = getIntent().getStringExtra("extra_receiver_jid");
            C22941Dw r4 = UserJid.Companion;
            this.A0J = r4.A04(stringExtra2);
            this.A0H = r4.A04(getIntent().getStringExtra("extra_interop_receiver_jid"));
            getIntent().getStringExtra("extra_tpp_transaction_request_id");
            this.A02 = C108975cc.A06(getIntent(), "extra_quoted_msg_row_id");
            this.A0o = getIntent().getStringExtra("extra_payment_preset_amount");
            this.A0s = getIntent().getStringExtra("extra_transaction_id");
            this.A0q = getIntent().getStringExtra("extra_payment_preset_min_amount");
            this.A0p = getIntent().getStringExtra("extra_payment_preset_max_amount");
            this.A0r = getIntent().getStringExtra("extra_request_message_key");
            this.A0y = getIntent().getBooleanExtra("extra_is_pay_money_only", true);
            this.A0n = getIntent().getStringExtra("extra_payment_note");
            this.A0C = (AEX) getIntent().getParcelableExtra("extra_payment_background");
            this.A0a = (C1418377d) getIntent().getParcelableExtra("extra_payment_sticker");
            int intExtra = getIntent().getIntExtra("extra_payment_sticker_send_origin", -1);
            if (intExtra != -1) {
                num = Integer.valueOf(intExtra);
            } else {
                num = null;
            }
            this.A0j = num;
            this.A0u = AnonymousClass4aJ.A03(getIntent().getStringExtra("extra_mentioned_jids"));
            this.A0I = r4.A04(getIntent().getStringExtra("extra_inviter_jid"));
            String stringExtra3 = getIntent().getStringExtra("extra_transaction_type");
            if (stringExtra3 == null) {
                stringExtra3 = "p2p";
            }
            this.A0t = stringExtra3;
            this.A0x = getIntent().getBooleanExtra("extra_transaction_is_merchant", false);
            this.A0z = getIntent().getBooleanExtra("extra_transaction_is_valid_merchant", false);
            this.A0m = getIntent().getStringExtra("extra_order_type");
            this.A0l = getIntent().getStringExtra("extra_payment_config_id");
            this.A0k = getIntent().getStringExtra("extra_external_payment_source");
            this.A0v = getIntent().getBooleanExtra("extra_is_interop_add_payment_method", false);
            this.A10 = getIntent().getBooleanExtra("extra_scan_qr_onboarding_only", false);
        }
        String str = null;
        if (this.A0O.A02() != null) {
            r1 = this.A0Q.A04(this.A0O.A02().A03);
        } else {
            r1 = null;
        }
        AnonymousClass1KJ A012 = this.A0O.A01();
        if (A012 != null) {
            str = AnonymousClass8BS.A0j(A012);
        }
        if (r1 != null && (A002 = r1.A00(str)) != null && A002.CLt()) {
            C170648qR r32 = this.A03;
            if (!r32.A0C() || !r32.A0D()) {
                r32.A0B((BCV) null, "payment_view", true);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass2PH r1 = this.A0L;
        if (r1 != null) {
            r1.A0B(true);
            this.A0L = null;
        }
    }
}
