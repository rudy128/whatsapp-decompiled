package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1KL  reason: invalid class name */
public final class AnonymousClass1KL extends AnonymousClass1KK {
    public static final AnonymousClass1KJ A0A;
    public static final AnonymousClass1KJ A0B;
    public static final AnonymousClass1KJ A0C;
    public static final BigDecimal A0D;
    public static final Parcelable.Creator CREATOR = new Object();
    public AnonymousClass1KN A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final AnonymousClass1KN A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1KL(X.AnonymousClass1KN r8, X.AnonymousClass1KN r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, int r15, int r16, int r17) {
        /*
            r7 = this;
            r0 = r7
            r1 = r10
            r2 = r11
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.A01 = r14
            r7.A06 = r10
            r7.A09 = r11
            r7.A03 = r15
            r7.A02 = r5
            r7.A04 = r6
            r7.A07 = r12
            r7.A08 = r13
            r7.A00 = r8
            r7.A05 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KL.<init>(X.1KN, X.1KN, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int):void");
    }

    public String BLa(C18000vb r8, AnonymousClass1KN r9) {
        C18070vi.A0d(r8, 0);
        C18070vi.A0d(r9, 1);
        String str = this.A06;
        BigDecimal bigDecimal = r9.A00;
        String A012 = C20067A5r.A01(r8, str, this.A09, bigDecimal, bigDecimal.scale(), false);
        C18070vi.A0X(A012);
        return A012;
    }

    public String BLb(C18000vb r4, BigDecimal bigDecimal) {
        C18070vi.A0d(r4, 0);
        C18070vi.A0d(bigDecimal, 1);
        String A022 = C20067A5r.A02(r4, this.A06, this.A09, bigDecimal, false);
        C18070vi.A0X(A022);
        return A022;
    }

    public BigDecimal BLk(C18000vb r5, String str) {
        C18070vi.A0d(r5, 0);
        C18070vi.A0d(str, 1);
        String str2 = this.A06;
        HashSet hashSet = C20067A5r.A00;
        A6S a6s = A6S.A02;
        if (!TextUtils.isEmpty(str2)) {
            a6s = new A6S(str2);
        }
        try {
            A4I A012 = A6S.A01(a6s, r5, A6S.A00(a6s.A00), false);
            return new BigDecimal(A012.A07.A00(str.replace(A012.A01, "").replace(A012.A00, "").replace(C19620yd.A08, "").trim()).toString());
        } catch (Exception e) {
            Log.w("Currency parse threw: ", e);
            try {
                return new BigDecimal(str);
            } catch (Exception e2) {
                Log.w("Currency parse fallback threw: ", e2);
                return null;
            }
        }
    }

    public SpannableStringBuilder BPn(Context context, int i) {
        String str;
        C18070vi.A0d(context, 0);
        if (i == 1) {
            str = this.A08;
        } else {
            str = this.A07;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Typeface A002 = C50802Vv.A00(context);
        if (A002 != null) {
            spannableStringBuilder.setSpan(new C22622BGi(A002), 0, this.A07.length(), 0);
        }
        return spannableStringBuilder;
    }

    public String BPp(C18000vb r4) {
        C18070vi.A0d(r4, 0);
        String str = this.A06;
        String str2 = this.A09;
        if (!C20067A5r.A00.contains(str)) {
            A6S a6s = A6S.A02;
            if (!TextUtils.isEmpty(str)) {
                a6s = new A6S(str);
            }
            str2 = a6s.A02(r4);
        }
        C18070vi.A0X(str2);
        return str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AnonymousClass1KL) && super.equals(obj)) {
            AnonymousClass1KL r4 = (AnonymousClass1KL) obj;
            return C18070vi.A18(this.A07, r4.A07) && C18070vi.A18(this.A08, r4.A08) && this.A05.equals(r4.A05) && this.A00.equals(r4.A00);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, android.os.Parcelable$Creator] */
    static {
        BigDecimal bigDecimal = new BigDecimal(1);
        A0D = bigDecimal;
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        C18070vi.A0Z(bigDecimal2);
        A0C = new AnonymousClass1KL("XXX", "XXX", "#", "#", bigDecimal2, bigDecimal2, -1, 10, 1, 0);
        BigDecimal valueOf = BigDecimal.valueOf(5000);
        C18070vi.A0X(valueOf);
        A0B = new AnonymousClass1KL("INR", "₹", "R", "r", valueOf, bigDecimal, 0, 100, 2, 0);
        BigDecimal valueOf2 = BigDecimal.valueOf(1000);
        C18070vi.A0X(valueOf2);
        A0A = new AnonymousClass1KL("BRL", "R$", "B", "b", valueOf2, bigDecimal, 0, 100, 2, 0);
    }

    public JSONObject CPM() {
        JSONObject CPM = super.CPM();
        try {
            CPM.put("currencyIconText", this.A07);
            CPM.put("requestCurrencyIconText", this.A08);
            AnonymousClass1KN r0 = this.A00;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("amount", r0.toString());
            } catch (JSONException e) {
                Log.e("PAY: BasePaymentCurrency toJsonObject threw: ", e);
            }
            CPM.put("maxValue", jSONObject);
            AnonymousClass1KN r02 = this.A05;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("amount", r02.toString());
            } catch (JSONException e2) {
                Log.e("PAY: BasePaymentCurrency toJsonObject threw: ", e2);
            }
            CPM.put("minValue", jSONObject2);
        } catch (JSONException e3) {
            Log.e("PAY: PaymentCurrency toJsonObject threw: ", e3);
        }
        C18070vi.A0b(CPM);
        return CPM;
    }

    public int hashCode() {
        return super.hashCode() + (this.A07.hashCode() * 31) + (this.A08.hashCode() * 31) + (this.A05.hashCode() * 31) + (this.A00.hashCode() * 31);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1KL(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.math.BigDecimal r19, java.math.BigDecimal r20, int r21, int r22, int r23, int r24) {
        /*
            r14 = this;
            r0 = 1
            r6 = r15
            X.C18070vi.A0d(r15, r0)
            r0 = 3
            r7 = r16
            X.C18070vi.A0d(r7, r0)
            r0 = 4
            r8 = r17
            X.C18070vi.A0d(r8, r0)
            r0 = 5
            r9 = r18
            X.C18070vi.A0d(r9, r0)
            r0 = 9
            r3 = r19
            X.C18070vi.A0d(r3, r0)
            r11 = r22
            double r0 = (double) r11
            double r0 = java.lang.Math.log10(r0)
            int r2 = (int) r0
            X.1KN r4 = new X.1KN
            r4.<init>(r3, r2)
            X.1KN r5 = new X.1KN
            r0 = r20
            r5.<init>(r0, r2)
            r3 = r14
            r10 = r21
            r12 = r23
            r13 = r24
            r3.<init>((X.AnonymousClass1KN) r4, (X.AnonymousClass1KN) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (int) r10, (int) r11, (int) r12, (int) r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KL.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, int, int, int, int):void");
    }
}
