package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiInterOpHybridActivity;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment;
import com.whatsapp.payments.ui.IndiaWebViewUpiP2mHybridActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import java.util.List;

/* renamed from: X.92u  reason: invalid class name */
public abstract class AnonymousClass92u extends AnonymousClass91R implements C22464B8w {
    public AnonymousClass8pQ A00;
    public A6X A01;
    public AnonymousClass00H A02;

    public static boolean A0d(C20284AEs aEs) {
        AnonymousClass8pS r0 = (AnonymousClass8pS) aEs.A08;
        return r0 != null && Boolean.FALSE.equals(r0.A04.A00);
    }

    public ConfirmPaymentFragment A5g(AnonymousClass8pQ r15, ARR arr, ARR arr2, PaymentBottomSheet paymentBottomSheet) {
        AnonymousClass8pQ r6 = r15;
        ConfirmPaymentFragment A002 = ConfirmPaymentFragment.A00(r6, this.A0J, (ADQ) null, "p2m", this.A0a, 0);
        AZ6 az6 = this.A0S;
        A1F a1f = this.A0I;
        ARR arr3 = arr;
        PaymentBottomSheet paymentBottomSheet2 = paymentBottomSheet;
        A002.A0G = new C20805AZi(this, this.A02, this.A08, r6, arr3, arr2, this.A0J, az6, this, paymentBottomSheet2, a1f);
        A002.A0H = new C20807AZk(r15, arr3, this, paymentBottomSheet2);
        return A002;
    }

    public void A5n(ARR arr, B90 b90, B91 b91, PaymentBottomSheet paymentBottomSheet, Runnable runnable) {
        if (this instanceof AnonymousClass92s) {
            AnonymousClass92s r1 = (AnonymousClass92s) this;
            UserJid userJid = r1.A0F;
            C17960vV.A07(userJid);
            String str = r1.A0C;
            C17960vV.A07(str);
            String str2 = r1.A0D;
            C17960vV.A07(str2);
            AnonymousClass205 r8 = r1.A07;
            long j = r1.A00;
            boolean A1B = AnonymousClass91R.A1B(r1);
            ARR arr2 = arr;
            C195769ts r2 = new C195769ts(arr2, r1.A01, userJid, r1.A06, (C20931Abl) null, r8, r1.A5r(), str, str2, j, A1B);
            r1.A02 = new AYI(b90, b91, r1, paymentBottomSheet, runnable);
            ((C191429ma) r1.A08.get()).A00(r1.A02, new AYK(), r2, "HPP_PAYMENT_LINK", r1.A0F);
        }
    }

    public void BiK(C20112A7u a7u, Integer num, Integer num2, String str) {
        C20112A7u a7u2 = a7u;
        Integer num3 = num2;
        String str2 = str;
        if (this instanceof AnonymousClass92s) {
            this.A0S.BiJ(a7u2, num3, str2, this.A0g, this.A0m, this.A0l, num.intValue(), false, true, false);
            return;
        }
        IndiaUpiInterOpHybridActivity indiaUpiInterOpHybridActivity = (IndiaUpiInterOpHybridActivity) this;
        int intValue = num.intValue();
        if (a7u == null) {
            a7u2 = C20112A7u.A02();
        }
        AnonymousClass1BI r0 = indiaUpiInterOpHybridActivity.A0F;
        if (r0 != null) {
            AnonymousClass1PM r1 = indiaUpiInterOpHybridActivity.A00;
            if (r1 != null) {
                C42741yf A012 = r1.A01(C22941Dw.A00(r0));
                if (A012 != null) {
                    a7u2.A07("biz_platform", C17900vP.A08(Integer.valueOf(A78.A00(A012))));
                }
            } else {
                C18070vi.A11("verifiedNameManager");
                throw null;
            }
        }
        indiaUpiInterOpHybridActivity.A0S.BiM(a7u2, num3, str2, indiaUpiInterOpHybridActivity.A0g, intValue);
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A5S(X.C20284AEs r18, X.ARR r19, com.whatsapp.payments.ui.PaymentBottomSheet r20, java.lang.Boolean r21) {
        /*
            r17 = this;
            r0 = r17
            X.00H r1 = r0.A02
            java.lang.Object r6 = r1.get()
            X.A8K r6 = (X.A8K) r6
            X.0ve r8 = r0.A0E
            X.1QD r1 = r0.A0Q
            android.content.SharedPreferences r2 = r1.A03()
            java.lang.String r1 = "pref_p2m_hybrid_last_used_payment_option"
            java.lang.String r5 = X.C17880vN.A0r(r2, r1)
            java.util.List r13 = r0.A5I()
            r1 = 1
            java.util.ArrayList r7 = X.C108955ca.A16(r8, r1)
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            r3 = 10663(0x29a7, float:1.4942E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r1, r8, r3)
            if (r3 == 0) goto L_0x012f
            r3 = 10662(0x29a6, float:1.494E-41)
            java.lang.String r4 = X.C108955ca.A0v(r8, r3)
            java.lang.String r3 = "type"
            java.util.LinkedHashMap r12 = X.A8K.A03(r8, r3)
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            boolean r3 = r12.isEmpty()
            if (r3 != 0) goto L_0x00db
            org.json.JSONObject r16 = X.C17880vN.A16(r4)
            java.util.LinkedHashSet r11 = X.C17880vN.A14()
            r3 = 11004(0x2afc, float:1.542E-41)
            boolean r3 = X.C18020vd.A05(r1, r8, r3)
            r10 = 0
            if (r3 == 0) goto L_0x0088
            if (r13 == 0) goto L_0x0088
            int r14 = r13.size()
            r7 = 0
        L_0x005d:
            if (r7 >= r14) goto L_0x0088
            java.lang.Object r15 = r13.get(r7)
            X.Abi r15 = (X.C20928Abi) r15
            java.lang.String r3 = r15.A01
            java.lang.Object r4 = r12.get(r3)
            X.9tp r4 = (X.C195739tp) r4
            if (r4 == 0) goto L_0x0085
            r3 = 1
            r4.A04 = r3
            r3 = 12235(0x2fcb, float:1.7145E-41)
            boolean r3 = X.C18020vd.A05(r1, r8, r3)
            if (r3 == 0) goto L_0x007d
            X.A8K.A04(r4, r6, r15)
        L_0x007d:
            java.lang.String r3 = r15.A01
            r11.add(r3)
            r9.add(r4)
        L_0x0085:
            int r7 = r7 + 1
            goto L_0x005d
        L_0x0088:
            if (r5 == 0) goto L_0x00a6
            java.lang.String r3 = "android_process_id"
            java.util.LinkedHashMap r3 = X.A8K.A03(r8, r3)
            java.lang.Object r5 = r3.get(r5)
            X.9tp r5 = (X.C195739tp) r5
            if (r5 == 0) goto L_0x00a6
            java.lang.String r4 = r5.A09
            boolean r3 = r11.contains(r4)
            if (r3 != 0) goto L_0x00a6
            r11.add(r4)
            r9.add(r5)
        L_0x00a6:
            java.lang.String r4 = "default_payment_methods"
            r3 = r16
            org.json.JSONArray r8 = r3.getJSONArray(r4)
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            int r5 = r8.length()
        L_0x00b6:
            if (r10 >= r5) goto L_0x00ce
            java.lang.String r4 = r8.getString(r10)
            boolean r3 = r11.contains(r4)
            if (r3 != 0) goto L_0x00cb
            java.lang.Object r3 = r12.get(r4)
            if (r3 == 0) goto L_0x00cb
            r7.add(r3)
        L_0x00cb:
            int r10 = r10 + 1
            goto L_0x00b6
        L_0x00ce:
            r4 = 4
            X.Akm r3 = new X.Akm
            r3.<init>(r0, r6, r4)
            java.util.List r3 = X.C29431cG.A0y(r7, r3)
            r9.addAll(r3)
        L_0x00db:
            java.util.Iterator r5 = r9.iterator()
        L_0x00df:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x010b
            java.lang.Object r3 = r5.next()
            X.9tp r3 = (X.C195739tp) r3
            java.lang.String r8 = r3.A08
            java.lang.String r9 = r3.A05
            java.lang.String r10 = r3.A07
            java.lang.String r11 = r3.A06
            java.lang.String r12 = r3.A03
            java.lang.String r13 = r3.A00
            java.lang.String r14 = r3.A02
            java.lang.String r15 = r3.A01
            r7 = 0
            X.8pQ r6 = new X.8pQ
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.add(r6)
            int r4 = r2.size()
            r3 = 3
            if (r4 != r3) goto L_0x00df
        L_0x010b:
            android.content.res.Resources r4 = r0.getResources()
            r3 = 2131893679(0x7f121daf, float:1.9422141E38)
            java.lang.String r6 = X.AnonymousClass3MY.A0m(r4, r3)
            android.content.res.Resources r4 = r0.getResources()
            r3 = 2131232278(0x7f080616, float:1.808066E38)
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeResource(r4, r3)
            r8 = 0
            java.lang.String r5 = "other"
            X.8pQ r3 = new X.8pQ
            r10 = r8
            r11 = r8
            r12 = r8
            r7 = r5
            r9 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0199
        L_0x012f:
            r3 = 9355(0x248b, float:1.3109E-41)
            boolean r3 = X.C18020vd.A05(r1, r8, r3)
            java.util.List r5 = X.A8K.A03
            if (r3 == 0) goto L_0x0167
            r4 = 3
            X.Akm r3 = new X.Akm
            r3.<init>(r0, r6, r4)
            java.util.List r3 = X.C29431cG.A0y(r5, r3)
            r7.addAll(r3)
        L_0x0146:
            android.content.res.Resources r6 = r0.getResources()
            java.util.ArrayList r5 = X.C29351c6.A0D(r7)
            java.util.Iterator r4 = r7.iterator()
        L_0x0152:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x018d
            java.lang.String r3 = X.C17880vN.A0v(r4)
            X.C18070vi.A0b(r6)
            X.8pQ r3 = X.A8K.A00(r6, r3)
            r5.add(r3)
            goto L_0x0152
        L_0x0167:
            java.util.Iterator r5 = r5.iterator()
        L_0x016b:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x0146
            java.lang.String r4 = X.C17880vN.A0v(r5)
            r3 = 1
            X.C18070vi.A0d(r4, r3)
            android.content.pm.PackageInfo r3 = X.C24211Jh.A02(r0, r4)
            boolean r3 = X.AnonymousClass000.A1W(r3)
            if (r3 == 0) goto L_0x016b
            boolean r3 = X.A8K.A05(r0, r4)
            if (r3 == 0) goto L_0x016b
            r7.add(r4)
            goto L_0x016b
        L_0x018d:
            r2.addAll(r5)
            X.C18070vi.A0b(r6)
            java.lang.String r3 = "other"
            X.8pQ r3 = X.A8K.A00(r6, r3)
        L_0x0199:
            r2.add(r3)
            boolean r8 = r0.A5q()
            r7 = r20
            if (r20 == 0) goto L_0x01ca
            r6 = r7
        L_0x01a5:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.lang.String r10 = "whatsapp"
            r5.add(r10)
            java.util.Iterator r9 = r2.iterator()
        L_0x01b2:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x01d0
            X.AEs r4 = X.AnonymousClass8BR.A0P(r9)
            boolean r3 = r4 instanceof X.AnonymousClass8pQ
            if (r3 == 0) goto L_0x01c8
            X.8pQ r4 = (X.AnonymousClass8pQ) r4
            java.lang.String r3 = r4.A01
        L_0x01c4:
            r5.add(r3)
            goto L_0x01b2
        L_0x01c8:
            r3 = r10
            goto L_0x01c4
        L_0x01ca:
            com.whatsapp.payments.ui.PaymentBottomSheet r6 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r6.<init>()
            goto L_0x01a5
        L_0x01d0:
            boolean r3 = r0 instanceof X.AnonymousClass92s
            if (r3 == 0) goto L_0x02b3
            r4 = r0
            X.92s r4 = (X.AnonymousClass92s) r4
            X.1QO r3 = r4.A0P
            java.util.List r10 = r4.A0F
            X.0ve r9 = r3.A02
            r3 = 6472(0x1948, float:9.069E-42)
            boolean r1 = X.C18020vd.A05(r1, r9, r3)
            if (r1 == 0) goto L_0x02b0
            if (r10 == 0) goto L_0x02b0
            java.util.Iterator r9 = r10.iterator()
        L_0x01eb:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x02b0
            java.lang.Object r3 = r9.next()
            X.ADj r3 = (X.C20251ADj) r3
            X.BDZ r1 = r3.A00
            if (r1 == 0) goto L_0x01eb
            java.lang.String r3 = r3.A01
            java.lang.String r1 = "upi_merchant_configuration"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x01eb
            r1 = 1
        L_0x0206:
            r9 = 0
            if (r1 == 0) goto L_0x0233
            java.util.List r1 = r4.A0F
            r1.getClass()
            java.util.List r1 = r4.A0F
            boolean r1 = X.AnonymousClass000.A1a(r1)
            X.C17960vV.A0C(r1)
            java.util.List r1 = r4.A0F
            java.lang.Object r1 = r1.get(r9)
            X.ADj r1 = (X.C20251ADj) r1
            X.BDZ r1 = r1.A00
            X.Abn r1 = (X.C20933Abn) r1
            r1.getClass()
            X.Abm r1 = r1.A00
            if (r1 == 0) goto L_0x0233
            java.lang.String r1 = r1.A02
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0233
            r9 = 1
        L_0x0233:
            if (r8 == 0) goto L_0x02ab
            java.lang.String r1 = "hpp"
        L_0x0237:
            r5.add(r1)
        L_0x023a:
            java.util.List r12 = r0.A0j
            boolean r11 = r21.booleanValue()
            android.content.Intent r1 = r0.getIntent()
            X.205 r10 = X.AnonymousClass1R2.A03(r1)
            com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment r4 = new com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment
            r4.<init>()
            android.os.Bundle r3 = X.C17880vN.A0D()
            if (r12 != 0) goto L_0x0255
            X.0wS r12 = X.C18460wS.A00
        L_0x0255:
            java.util.ArrayList r12 = X.C17880vN.A10(r12)
            java.lang.String r1 = "arg_native_methods"
            r3.putParcelableArrayList(r1, r12)
            java.util.ArrayList r2 = X.C17880vN.A10(r2)
            java.lang.String r1 = "arg_external_methods"
            r3.putParcelableArrayList(r1, r2)
            java.lang.String r1 = "arg_selected_method"
            r2 = r18
            r3.putParcelable(r1, r2)
            java.lang.String r1 = "arg_hpp_checkout_enabled"
            r3.putBoolean(r1, r8)
            java.lang.String r1 = "arg_is_hpp_checkout_only"
            r3.putBoolean(r1, r11)
            if (r10 == 0) goto L_0x027d
            X.AnonymousClass4aU.A0A(r3, r10)
        L_0x027d:
            java.lang.String r1 = "arg_has_merchant_configuration_payment_link"
            r3.putBoolean(r1, r9)
            r4.A1R(r3)
            X.9dk r1 = new X.9dk
            r1.<init>(r0, r8, r9)
            r4.A0A = r1
            X.9fk r8 = new X.9fk
            r9 = r19
            r10 = r4
            r11 = r0
            r12 = r6
            r13 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            r4.A0B = r8
            if (r20 == 0) goto L_0x02a2
            r7.A2L(r4)
        L_0x029e:
            r0.CEx()
            return
        L_0x02a2:
            r6.A02 = r4
            X.C20098A7b.A00(r6, r0)
            r0.A5Q(r6)
            goto L_0x029e
        L_0x02ab:
            if (r9 == 0) goto L_0x023a
            java.lang.String r1 = "payment_link"
            goto L_0x0237
        L_0x02b0:
            r1 = 0
            goto L_0x0206
        L_0x02b3:
            r9 = 0
            goto L_0x0233
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass92u.A5S(X.AEs, X.ARR, com.whatsapp.payments.ui.PaymentBottomSheet, java.lang.Boolean):void");
    }

    public String A5h() {
        if (!C20061A5k.A02(this.A0H)) {
            return AnonymousClass8BS.A0h(this.A0H);
        }
        AnonymousClass1E7 r0 = this.A08;
        if (r0 == null || TextUtils.isEmpty(r0.A0L())) {
            return BXz();
        }
        return this.A08.A0L();
    }

    public void A5i() {
        String str;
        if (this instanceof IndiaUpiInterOpHybridActivity) {
            IndiaUpiInterOpHybridActivity indiaUpiInterOpHybridActivity = (IndiaUpiInterOpHybridActivity) this;
            AnonymousClass1BI r3 = indiaUpiInterOpHybridActivity.A0F;
            if (r3 != null) {
                String string = indiaUpiInterOpHybridActivity.A0Q.A03().getString("pref_p2m_hybrid_last_used_payment_option", (String) null);
                if (string == null || string.length() == 0) {
                    string = "other";
                }
                Integer A002 = AnonymousClass9RA.A00(string);
                if (A002 != null) {
                    C31041ev r4 = indiaUpiInterOpHybridActivity.A01;
                    if (r4 != null) {
                        String str2 = r3.user;
                        switch (A002.intValue()) {
                            case 1:
                                str = "phonepe";
                                break;
                            case 2:
                                str = "paytm";
                                break;
                            default:
                                str = "gpay";
                                break;
                        }
                        r4.A02(str2, str, "QRC", 1);
                        return;
                    }
                    C18070vi.A11("paymentDailyUsageManager");
                    throw null;
                }
            }
        } else if (!(this instanceof IndiaWebViewUpiP2mHybridActivity)) {
            IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this;
            if (AnonymousClass91R.A1B(indiaUpiCheckOrderDetailsActivity)) {
                indiaUpiCheckOrderDetailsActivity.CNA(2131895077);
                C175708z9 r7 = (C175708z9) indiaUpiCheckOrderDetailsActivity.A0F.get();
                UserJid userJid = indiaUpiCheckOrderDetailsActivity.A0F;
                C17960vV.A07(userJid);
                String str3 = indiaUpiCheckOrderDetailsActivity.A0D;
                C17960vV.A07(str3);
                String str4 = indiaUpiCheckOrderDetailsActivity.A0C;
                C17960vV.A07(str4);
                AnonymousClass9YQ r9 = new AnonymousClass9YQ(indiaUpiCheckOrderDetailsActivity);
                C18070vi.A0n(userJid, str3, str4);
                r7.A07.CGF(new C21438Ak5(r7, userJid, r9, str3, str4, 7));
            } else {
                indiaUpiCheckOrderDetailsActivity.A04.A00(indiaUpiCheckOrderDetailsActivity.A09.A06, new C20873Aap(indiaUpiCheckOrderDetailsActivity, 1), indiaUpiCheckOrderDetailsActivity.A07);
            }
            if (indiaUpiCheckOrderDetailsActivity.A0F != null && indiaUpiCheckOrderDetailsActivity.A0C != null && !AnonymousClass91R.A1B(indiaUpiCheckOrderDetailsActivity)) {
                C21447AkE.A01(indiaUpiCheckOrderDetailsActivity.A05, indiaUpiCheckOrderDetailsActivity, 21);
            }
        }
    }

    public void A5j(AnonymousClass8pQ r10, ARR arr, PaymentBottomSheet paymentBottomSheet) {
        ARR arr2 = arr;
        if (this instanceof AnonymousClass92s) {
            AnonymousClass92s r2 = (AnonymousClass92s) this;
            PaymentBottomSheet paymentBottomSheet2 = paymentBottomSheet;
            if (paymentBottomSheet == null) {
                r2.A5p(true);
            }
            C20823Aa0 aa0 = new C20823Aa0(r10, r2, paymentBottomSheet, 0);
            r2.A5t(arr2, new C20816AZt(r10, arr, r2, 1), new C20819AZw(arr, r2, paymentBottomSheet), aa0, paymentBottomSheet2, new C21432Ajz(r2, paymentBottomSheet, 18));
            return;
        }
        C18070vi.A0d(arr, 0);
        PaymentBottomSheet paymentBottomSheet3 = new PaymentBottomSheet();
        paymentBottomSheet3.A02 = A5g(r10, arr, (ARR) null, paymentBottomSheet3);
        CMl(paymentBottomSheet3);
        A5Q(paymentBottomSheet3);
    }

    public void A5l(C20284AEs aEs, ARR arr, ARR arr2, PaymentBottomSheet paymentBottomSheet) {
        AnonymousClass1KN r0;
        ConfirmPaymentFragment A5H;
        if (aEs instanceof AnonymousClass8pQ) {
            A5H = A5g((AnonymousClass8pQ) aEs, arr, arr2, paymentBottomSheet);
        } else {
            this.A0B = aEs;
            AnonymousClass1KN r2 = arr.A02;
            if (arr2 != null) {
                r0 = arr2.A02;
            } else {
                r0 = null;
            }
            A5H = A5H(r2, r0, (AnonymousClass1KN) null, paymentBottomSheet);
        }
        paymentBottomSheet.A2L(A5H);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.RoundedBottomSheetDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.payments.ui.PaymentCheckoutIncentiveFragment] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        if (r7.A0W.A0o(r7.A0F) == false) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A5m(X.ARR r15) {
        /*
            r14 = this;
            boolean r0 = r14 instanceof com.whatsapp.payments.ui.IndiaUpiInterOpHybridActivity
            if (r0 == 0) goto L_0x000e
            boolean r0 = X.AnonymousClass8BR.A1P(r14)
            if (r0 != 0) goto L_0x000d
            r14.A5N(r14)
        L_0x000d:
            return
        L_0x000e:
            boolean r0 = r14 instanceof com.whatsapp.payments.ui.IndiaWebViewUpiP2mHybridActivity
            r4 = r15
            if (r0 == 0) goto L_0x004a
            r3 = r14
            X.92s r3 = (X.AnonymousClass92s) r3
            r0 = 0
            X.C18070vi.A0d(r15, r0)
            X.AEs r1 = r3.A0B
            if (r1 != 0) goto L_0x0025
            r3.A5N(r3)
            r3.CEx()
            return
        L_0x0025:
            boolean r0 = A0d(r1)
            if (r0 == 0) goto L_0x002f
            r3.A5k(r1)
            return
        L_0x002f:
            r0 = 1
            r3.A5p(r0)
            X.AZz r7 = new X.AZz
            r7.<init>(r3, r0)
            X.AZv r6 = new X.AZv
            r6.<init>(r3, r0)
            r0 = 8
            X.Aju r9 = new X.Aju
            r9.<init>(r3, r0)
            r5 = 0
            r8 = r5
            r3.A5t(r4, r5, r6, r7, r8, r9)
            return
        L_0x004a:
            r7 = r14
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r7 = (com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity) r7
            X.Aa6 r0 = r7.A09
            java.lang.String r0 = r0.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0077
            X.1R2 r1 = r7.A0W
            com.whatsapp.jid.UserJid r0 = r7.A0F
            boolean r0 = r1.A0o(r0)
            if (r0 == 0) goto L_0x0077
            X.7Ik r3 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            X.Aa6 r0 = r7.A09
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = "moneyStringValue"
            X.77e r0 = X.AnonymousClass8BR.A0Y(r3, r2, r1, r0)
            r7.A0G = r0
            com.whatsapp.jid.UserJid r0 = r7.A0F
            r7.A0J = r0
        L_0x0077:
            X.AEs r1 = r7.A0B
            if (r1 != 0) goto L_0x00e3
            X.Aa6 r0 = r7.A09
            java.lang.String r0 = r0.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0090
            X.1R2 r1 = r7.A0W
            com.whatsapp.jid.UserJid r0 = r7.A0F
            boolean r1 = r1.A0o(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0091
        L_0x0090:
            r0 = 0
        L_0x0091:
            r6 = 0
            if (r0 == 0) goto L_0x00df
            r7.overridePendingTransition(r6, r6)
            com.whatsapp.payments.ui.PaymentBottomSheet r4 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r4.<init>()
            X.Aa6 r0 = r7.A09
            java.lang.String r3 = r0.A0A
            X.C18070vi.A0d(r3, r6)
            com.whatsapp.payments.ui.PaymentCheckoutIncentiveFragment r2 = new com.whatsapp.payments.ui.PaymentCheckoutIncentiveFragment
            r2.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "extra_formatted_discount"
            r1.putString(r0, r3)
            r2.A1R(r1)
            X.9jV r0 = new X.9jV
            r0.<init>(r7)
            r2.A00 = r0
            r4.A02 = r2
            java.lang.String r0 = "PaymentCheckoutOrderDiscountFragment"
            r7.CMk(r4, r0)
            r7.A5Q(r4)
            X.AZ6 r5 = r7.A0S
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            java.lang.String r3 = r7.A0g
            X.8zi r2 = X.C176058zi.A00()
            r1 = 0
            java.lang.String r0 = "payment_intro_prompt"
            X.8sO r0 = r5.A07(r4, r1, r0, r3)
            X.AZ6.A01(r0, r2, r5, r6)
        L_0x00db:
            r7.A5p(r6)
            return
        L_0x00df:
            r7.A5N(r7)
            goto L_0x00db
        L_0x00e3:
            boolean r0 = A0d(r1)
            if (r0 == 0) goto L_0x00ed
            r7.A5k(r1)
            return
        L_0x00ed:
            r0 = 1
            r7.A5p(r0)
            r0 = 0
            X.AZz r11 = new X.AZz
            r11.<init>(r7, r0)
            X.AZy r10 = new X.AZy
            r10.<init>(r15, r7)
            r0 = 22
            X.AkE r13 = X.C21447AkE.A00(r7, r0)
            r9 = 0
            r8 = r15
            r12 = r9
            r7.A5t(r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass92u.A5m(X.ARR):void");
    }

    public final void A5o(ARR arr, C20279AEn aEn) {
        AnonymousClass8pQ r11;
        Bitmap bitmap;
        int i;
        ARR arr2 = arr;
        if (this instanceof AnonymousClass92s) {
            AnonymousClass92s r0 = (AnonymousClass92s) this;
            AnonymousClass1QO r5 = r0.A0P;
            String str = r0.A0E;
            List list = r0.A0F;
            if (C18020vd.A05(C18040vf.A02, r5.A02, 11744) && r5.A0N(str, list) && AnonymousClass1QO.A00("upi", list)) {
                A5p(true);
                C21447AkE A002 = C21447AkE.A00(this, 29);
                A5n(arr2, new C20815AZs(arr2, this, 0), new C20818AZv(this, 0), (PaymentBottomSheet) null, A002);
                return;
            }
        }
        String string = this.A0Q.A03().getString("pref_p2m_hybrid_last_used_payment_option", (String) null);
        if (!"WhatsappPay".equals(string) || !this.A0Q.A02("p2p_context").A0D()) {
            if (!TextUtils.isEmpty(string) && this.A0W.A0O(aEn) == AnonymousClass00R.A0N) {
                this.A02.get();
                List list2 = A8K.A03;
                C18070vi.A0d(string, 1);
                if (AnonymousClass000.A1W(C24211Jh.A02(this, string))) {
                    this.A02.get();
                    if (A8K.A05(this, string)) {
                        A8K a8k = (A8K) this.A02.get();
                        List A5I = A5I();
                        C18030ve r3 = a8k.A00;
                        C18040vf r1 = C18040vf.A02;
                        if (C18020vd.A05(r1, r3, 10663)) {
                            C195739tp r112 = (C195739tp) A8K.A03(r3, "android_process_id").get(string);
                            if (r112 != null) {
                                if (C18020vd.A05(r1, r3, 12235) && A5I != null) {
                                    int size = A5I.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        C20928Abi abi = (C20928Abi) A5I.get(i2);
                                        if (abi.A00 != null) {
                                            if (abi.A01.equals(r112.A09)) {
                                                A8K.A04(r112, a8k, abi);
                                            }
                                        }
                                    }
                                }
                                String str2 = r112.A08;
                                String str3 = r112.A05;
                                String str4 = str2;
                                String str5 = str3;
                                r11 = new AnonymousClass8pQ((Bitmap) null, str4, str5, r112.A07, r112.A06, r112.A03, r112.A00, r112.A02, r112.A01);
                            }
                        } else {
                            String A012 = A8K.A01(C108955ca.A0D(this), string);
                            String A022 = A8K.A02(string);
                            if (A012.length() != 0) {
                                Resources A0D = C108955ca.A0D(this);
                                Integer A003 = AnonymousClass9RA.A00(string);
                                if (A003 != null) {
                                    i = C196769vc.A00(A003);
                                } else if ("other".equals(string)) {
                                    i = 2131232278;
                                } else {
                                    bitmap = null;
                                    r11 = new AnonymousClass8pQ(bitmap, string, A012, A022, (String) null, (String) null, (String) null, (String) null, (String) null);
                                }
                                bitmap = BitmapFactory.decodeResource(A0D, i);
                                r11 = new AnonymousClass8pQ(bitmap, string, A012, A022, (String) null, (String) null, (String) null, (String) null, (String) null);
                            }
                        }
                        A5j(r11, arr2, (PaymentBottomSheet) null);
                        return;
                    }
                }
            }
            A5p(false);
            A5S(this.A0B, arr2, (PaymentBottomSheet) null, false);
            return;
        }
        A5m(arr2);
    }

    public void A5p(boolean z) {
        if (this instanceof IndiaUpiInterOpHybridActivity) {
            return;
        }
        if (!(this instanceof IndiaWebViewUpiP2mHybridActivity)) {
            IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this;
            boolean z2 = !indiaUpiCheckOrderDetailsActivity.Bg0();
            if (z) {
                if (!z2) {
                    indiaUpiCheckOrderDetailsActivity.CNA(2131895077);
                }
            } else if (z2) {
                C20828Aa6 aa6 = indiaUpiCheckOrderDetailsActivity.A09;
                aa6.A0E.A0J(new C21427Aju(aa6, 17));
            } else {
                indiaUpiCheckOrderDetailsActivity.CEx();
            }
        } else if (z) {
            CNA(2131895077);
        } else {
            CEx();
        }
    }

    public boolean A5q() {
        if (!(this instanceof AnonymousClass92s)) {
            return false;
        }
        AnonymousClass92s r1 = (AnonymousClass92s) this;
        if (!AnonymousClass91R.A1B(r1)) {
            return false;
        }
        AnonymousClass1QO r0 = r1.A0P;
        UserJid userJid = r1.A0F;
        List list = r1.A0F;
        if (userJid == null) {
            return false;
        }
        C18030ve r3 = r0.A02;
        C18040vf r2 = C18040vf.A02;
        if (!C18020vd.A05(r2, r3, 4709)) {
            return false;
        }
        String A0I = r3.A0I(4806);
        if (!TextUtils.isEmpty(A0I) && AnonymousClass8BW.A0t(A0I).contains(userJid.user)) {
            return false;
        }
        if (!C18020vd.A05(r2, r3, 11744) || (!AnonymousClass1QO.A00("hpp", list))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b7 A[Catch:{ JSONException -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c2 A[Catch:{ JSONException -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cd A[Catch:{ JSONException -> 0x00ff }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r18, int r19, android.content.Intent r20) {
        /*
            r17 = this;
            r0 = 1022(0x3fe, float:1.432E-42)
            r5 = r17
            r3 = r18
            r2 = r19
            r1 = r20
            if (r3 == r0) goto L_0x0010
            super.onActivityResult(r3, r2, r1)
        L_0x000f:
            return
        L_0x0010:
            r0 = -1
            if (r2 != r0) goto L_0x000f
            if (r20 == 0) goto L_0x000f
            java.util.List r0 = X.A8K.A03
            android.os.Bundle r3 = r1.getExtras()
            if (r3 == 0) goto L_0x0095
            java.util.Set r0 = r3.keySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0025:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.String r1 = X.C17880vN.A0v(r2)
            java.lang.String r0 = "Status"
            if (r1 == 0) goto L_0x0025
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r3.getString(r1)
            if (r0 == 0) goto L_0x0095
            java.lang.String r4 = "SUCCESS"
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 == 0) goto L_0x0095
            r5.A5i()
        L_0x004a:
            r3 = 0
            X.A7u[] r0 = new X.C20112A7u[r3]
            r12 = 0
            X.A7u r7 = X.C20112A7u.A03(r0)
            java.lang.String r1 = "transaction_status"
            r7.A07(r1, r4)
            java.lang.String r2 = "referral_screen"
            java.lang.String r0 = r5.A0g
            r7.A07(r2, r0)
            X.8pQ r2 = r5.A00
            if (r2 == 0) goto L_0x0093
            X.AZ6 r0 = r5.A0S
            X.A7u r7 = r0.A08(r2, r7)
            X.8pQ r0 = r5.A00
            if (r0 == 0) goto L_0x0090
            java.lang.String r6 = r0.A01
        L_0x006e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "payment_complete"
            r5.BiK(r7, r2, r12, r0)
            boolean r0 = r5 instanceof X.AnonymousClass92s
            if (r0 == 0) goto L_0x000f
            X.92s r5 = (X.AnonymousClass92s) r5
            X.A6X r2 = r5.A01
            java.lang.String r8 = r5.A0E
            java.util.List r7 = r5.A0F
            X.205 r0 = r5.A07
            X.1BI r9 = r0.A00
            java.lang.String r5 = r5.A0D
            r13 = 38
            r14 = 4
            r15 = 1
            if (r8 == 0) goto L_0x00a3
            goto L_0x0098
        L_0x0090:
            java.lang.String r6 = "whatsapp"
            goto L_0x006e
        L_0x0093:
            r6 = r12
            goto L_0x006e
        L_0x0095:
            java.lang.String r4 = "FAILED"
            goto L_0x004a
        L_0x0098:
            X.1QO r0 = r2.A04     // Catch:{ JSONException -> 0x00ff }
            boolean r0 = r0.A0M(r8)     // Catch:{ JSONException -> 0x00ff }
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = "p2m_lite"
            goto L_0x00ad
        L_0x00a3:
            X.1QO r0 = r2.A04     // Catch:{ JSONException -> 0x00ff }
            boolean r0 = r0.A0O(r7)     // Catch:{ JSONException -> 0x00ff }
            if (r0 == 0) goto L_0x00fb
            java.lang.String r0 = "p2m_checkout_lite"
        L_0x00ad:
            org.json.JSONObject r3 = X.A6X.A02(r2, r0, r3)     // Catch:{ JSONException -> 0x00ff }
            boolean r0 = X.AnonymousClass1EG.A0H(r6)     // Catch:{ JSONException -> 0x00ff }
            if (r0 != 0) goto L_0x00bc
            java.lang.String r0 = "payment_method_choice"
            r3.put(r0, r6)     // Catch:{ JSONException -> 0x00ff }
        L_0x00bc:
            boolean r0 = X.AnonymousClass1EG.A0H(r5)     // Catch:{ JSONException -> 0x00ff }
            if (r0 != 0) goto L_0x00c7
            java.lang.String r0 = "p2m_payment_config_id"
            r3.put(r0, r5)     // Catch:{ JSONException -> 0x00ff }
        L_0x00c7:
            boolean r0 = X.AnonymousClass1EG.A0H(r4)     // Catch:{ JSONException -> 0x00ff }
            if (r0 != 0) goto L_0x00d0
            r3.put(r1, r4)     // Catch:{ JSONException -> 0x00ff }
        L_0x00d0:
            java.lang.String r1 = "message_type"
            java.lang.String r0 = "checkout"
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x00ff }
            X.00H r0 = r2.A08     // Catch:{ JSONException -> 0x00ff }
            java.lang.Object r8 = r0.get()     // Catch:{ JSONException -> 0x00ff }
            X.9lB r8 = (X.C190579lB) r8     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r11 = r3.toString()     // Catch:{ JSONException -> 0x00ff }
            X.1PM r1 = r2.A00     // Catch:{ JSONException -> 0x00ff }
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r9)     // Catch:{ JSONException -> 0x00ff }
            X.1yf r0 = r1.A02(r0)     // Catch:{ JSONException -> 0x00ff }
            int r0 = X.A78.A00(r0)     // Catch:{ JSONException -> 0x00ff }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x00ff }
            r16 = r15
            r8.A00(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ JSONException -> 0x00ff }
            goto L_0x00fe
        L_0x00fb:
            java.lang.String r0 = "p2m_hybrid"
            goto L_0x00ad
        L_0x00fe:
            return
        L_0x00ff:
            java.lang.String r0 = "OrderDetailsMessageLogging/logOrderDetailsTransactionAttemptedAction failed to construct message class attributes"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass92u.onActivityResult(int, int, android.content.Intent):void");
    }

    public void A5k(C20284AEs aEs) {
        IndiaUpiPinPrimerDialogFragment A0M = AnonymousClass8BY.A0M(aEs, this);
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A02 = A0M;
        CMk(paymentBottomSheet, "IndiaUpiPinPrimerDialogFragment");
        A5Q(paymentBottomSheet);
        A5p(false);
    }
}
