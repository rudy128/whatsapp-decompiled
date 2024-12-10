package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.compliance.Hilt_IndiaConfirmLegalNameBottomSheetFragment;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.92s  reason: invalid class name */
public abstract class AnonymousClass92s extends AnonymousClass92u {
    public long A00;
    public AES A01;
    public BBC A02;
    public A2C A03;
    public C189699jf A04;
    public C55042f7 A05;
    public C20266ADy A06;
    public AnonymousClass205 A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public List A0F;
    public List A0G;
    public AtomicBoolean A0H = C108965cb.A0w();
    public boolean A0I;
    public boolean A0J;

    public static void A0c(A7B a7b, B90 b90, AnonymousClass92s r11, PaymentBottomSheet paymentBottomSheet) {
        PaymentBottomSheet paymentBottomSheet2;
        if (a7b.A00 == 10755) {
            C20112A7u A032 = C20112A7u.A03(new C20112A7u[0]);
            A032.A06("payments_error_code", a7b.A00);
            A032.A07("payments_error_text", a7b.A07);
            r11.A3t(new C20447ALk(A032, r11, 1), 2131893474, 2131893473, 2131899286);
            r11.BiK(A032, 0, (Integer) null, "sanction_check_error_dialog");
            return;
        }
        if (paymentBottomSheet != null) {
            paymentBottomSheet2 = paymentBottomSheet;
        } else {
            paymentBottomSheet2 = new PaymentBottomSheet();
        }
        if (a7b.A00 == 10752) {
            String str = r11.A0g;
            String str2 = r11.A0m;
            String str3 = r11.A0l;
            Hilt_IndiaConfirmLegalNameBottomSheetFragment hilt_IndiaConfirmLegalNameBottomSheetFragment = new Hilt_IndiaConfirmLegalNameBottomSheetFragment();
            Bundle A0D2 = C17880vN.A0D();
            A0D2.putString("extra_payment_config_id", str);
            A0D2.putString("extra_order_type", str2);
            A0D2.putString("extra_referral_screen", str3);
            hilt_IndiaConfirmLegalNameBottomSheetFragment.A1R(A0D2);
            hilt_IndiaConfirmLegalNameBottomSheetFragment.A0A = new C20838AaG(b90, r11, paymentBottomSheet2, paymentBottomSheet);
            if (paymentBottomSheet != null) {
                AnonymousClass1GP A1E = paymentBottomSheet.A1E();
                int A0K = A1E.A0K();
                for (int i = 0; i < A0K; i++) {
                    A1E.A0b();
                }
                paymentBottomSheet.A2L(hilt_IndiaConfirmLegalNameBottomSheetFragment);
            } else {
                paymentBottomSheet2.A02 = hilt_IndiaConfirmLegalNameBottomSheetFragment;
                C20098A7b.A00(paymentBottomSheet2, r11);
                r11.A5Q(paymentBottomSheet2);
            }
            r11.BiK((C20112A7u) null, 0, (Integer) null, "enter_name");
        }
    }

    public void A3h(int i) {
        if (this.A0H.get()) {
            A4o();
            this.A0H.set(false);
            return;
        }
        super.A3h(i);
    }

    public String A5s(A7B a7b) {
        int i;
        String A012;
        if (a7b != null) {
            if (C18020vd.A05(C18040vf.A02, this.A0E, 6712)) {
                String A0I2 = this.A0E.A0I(7336);
                if ((TextUtils.isEmpty(A0I2) || A0I2.contains(Integer.toString(a7b.A00))) && (A012 = this.A08.A01(a7b.A00)) != null) {
                    return A012;
                }
            }
            int i2 = a7b.A00;
            Integer A022 = C20110A7s.A02(i2);
            if (A022 != null) {
                i = A022.intValue();
            } else {
                Object[] A1a = AnonymousClass3MW.A1a();
                AnonymousClass000.A1L(A1a, i2);
                return getString(2131893440, A1a);
            }
        } else {
            i = 2131893867;
        }
        return getString(i);
    }

    public void A5t(ARR arr, B90 b90, B91 b91, B92 b92, PaymentBottomSheet paymentBottomSheet, Runnable runnable) {
        C20931Abl abl;
        List list;
        if (!this.A0I) {
            UserJid userJid = this.A0F;
            C17960vV.A07(userJid);
            String str = this.A0C;
            C17960vV.A07(str);
            String str2 = this.A0D;
            C17960vV.A07(str2);
            AnonymousClass205 r9 = this.A07;
            long j = this.A00;
            boolean A1B = AnonymousClass91R.A1B(this);
            Integer A5r = A5r();
            AES aes = this.A01;
            C20266ADy aDy = this.A06;
            if (A5r() == AnonymousClass00R.A0C && (list = this.A0F) != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C20251ADj aDj = (C20251ADj) it.next();
                    BDZ bdz = aDj.A00;
                    if (bdz != null) {
                        String str3 = aDj.A01;
                        if (str3.equals("upi_merchant_vpa")) {
                            abl = ((C20930Abk) bdz).A01;
                            break;
                        } else if (str3.equals("upi_intent_link")) {
                            abl = ((C20929Abj) bdz).A01;
                            break;
                        }
                    }
                }
                ARR arr2 = arr;
                C195769ts r3 = new C195769ts(arr2, aes, userJid, aDy, abl, r9, A5r, str, str2, j, A1B);
                B91 b912 = b91;
                B92 b922 = b92;
                ARR arr3 = arr2;
                this.A02 = new AYJ(arr3, b90, b912, b922, this, paymentBottomSheet, runnable);
                ((C191429ma) this.A08.get()).A00(this.A02, new AYM(arr3, b912, b922, this, r3), r3, "UPI", this.A0F);
            }
            abl = null;
            ARR arr22 = arr;
            C195769ts r32 = new C195769ts(arr22, aes, userJid, aDy, abl, r9, A5r, str, str2, j, A1B);
            B91 b9122 = b91;
            B92 b9222 = b92;
            ARR arr32 = arr22;
            this.A02 = new AYJ(arr32, b90, b9122, b9222, this, paymentBottomSheet, runnable);
            ((C191429ma) this.A08.get()).A00(this.A02, new AYM(arr32, b9122, b9222, this, r32), r32, "UPI", this.A0F);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        int i4;
        if (i == 1008 || i == 1015) {
            A5K();
        } else if (i != 1024) {
            super.onActivityResult(i, i2, intent);
        } else {
            if (i2 == -1) {
                A5i();
                i3 = 1;
                i4 = 5;
            } else {
                i3 = 1;
                i4 = 3;
            }
            BiK((C20112A7u) null, i3, Integer.valueOf(i4), "in_app_browser_checkout");
        }
    }

    public static void A0V(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, AnonymousClass92s r4) {
        r4.A01 = (A6X) r2.Abm.get();
        r4.A02 = C000200d.A00(r3.ACK);
        r4.A08 = C000200d.A00(r1.A5L);
        r4.A03 = (A2C) r3.AEZ.get();
        r4.A09 = C000200d.A00(r2.Acp);
        r4.A04 = r2.AHL();
        r4.A05 = AnonymousClass1K1.A1W(r1);
    }

    public Integer A5r() {
        if (AnonymousClass91R.A1B(this)) {
            return AnonymousClass00R.A01;
        }
        if (this.A0P.A0P(this.A0F)) {
            return AnonymousClass00R.A0C;
        }
        return AnonymousClass00R.A00;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0C = getIntent().getStringExtra("extra_order_id");
        this.A00 = C108975cc.A06(getIntent(), "extra_order_expiry_ts_in_sec");
        this.A0E = getIntent().getStringExtra("extra_payment_type");
        this.A0D = getIntent().getStringExtra("extra_payment_config_id");
        this.A0F = getIntent().getParcelableArrayListExtra("extra_payment_settings");
        this.A0G = getIntent().getParcelableArrayListExtra("extra_preferred_payment_methods");
        this.A0I = getIntent().getBooleanExtra("extra_checkout_lite_enabled", false);
        this.A01 = (AES) getIntent().getParcelableExtra("extra_order_shipping_info");
        this.A06 = (C20266ADy) getIntent().getParcelableExtra("extra_order_coupon_info");
        this.A0J = getIntent().getBooleanExtra("extra_is_template_message", false);
        this.A0o = true;
        if (this.A0H != null || !AnonymousClass8BR.A1P(this)) {
            CEx();
            return;
        }
        C177749Ak r1 = new C177749Ak(this);
        this.A0H = r1;
        AnonymousClass3MW.A1T(r1, this.A05, 0);
    }

    public void onResume() {
        super.onResume();
        if (AnonymousClass8BR.A1P(this) && !this.A04.A07.contains("upi-get-challenge") && this.A0N.A0E().A00 == null) {
            this.A0i.A06("onResume getChallenge");
            CNA(2131895077);
            this.A04.A01("upi-get-challenge");
            A53();
        }
    }
}
