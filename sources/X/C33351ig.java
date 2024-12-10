package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1ig  reason: invalid class name and case insensitive filesystem */
public class C33351ig {
    public static final Object A0H = new Object();
    public int A00 = 0;
    public A03 A01;
    public final AnonymousClass11P A02;
    public final C18000vb A03;
    public final AnonymousClass1KI A04;
    public final AnonymousClass1QD A05;
    public final C33361ih A06;
    public final AnonymousClass1KB A07;
    public final AnonymousClass1M9 A08;
    public final AnonymousClass12E A09;
    public final AnonymousClass118 A0A;
    public final C24751Ln A0B;
    public final C18030ve A0C;
    public final C31061ex A0D;
    public final AnonymousClass1QS A0E;
    public final AnonymousClass10I A0F;
    public final AnonymousClass00H A0G;

    public void A07(C190719lP r19, boolean z) {
        C198769ys A012;
        C190719lP r3 = r19;
        try {
            C62212r1 A002 = A00();
            if (A002 != null) {
                long j = A002.A01;
                if (j > 0) {
                    C33361ih r5 = this.A06;
                    r5.A01.clear();
                    r5.A03();
                    if (z || (A012 = r5.A01(j)) == null || !A002.equals(A012.A08) || !this.A03.A0N().toString().equals(A012.A0D)) {
                        C55022f5 r9 = new C55022f5(this.A07, this.A0A, (C33711jG) this.A0G.get(), this.A0D);
                        String obj = this.A03.A0N().toString();
                        C191119m3 r8 = new C191119m3(r3, this, A002, obj);
                        C31061ex r12 = r9.A03;
                        String A062 = r12.A06();
                        AnonymousClass9F6 r10 = new AnonymousClass9F6(j, A062, obj);
                        r12.A0H(new C175488yn(r9.A01.A00, r9.A02, r9.A00, r8, r9, r10, 5), (C29621ca) r10.A00, A062, C20113A7w.A0L);
                        return;
                    } else if (r19 != null) {
                        r3.A00(A02());
                        return;
                    } else {
                        return;
                    }
                }
            }
            this.A06.A02();
            if (r19 != null) {
                r3.A00((C198769ys) null);
            }
        } catch (JSONException e) {
            Log.e("PAY: PaymentIncentiveManager/getIncentiveOfferInfo : ", e);
            this.A06.A02();
            if (r19 != null) {
                Log.e("PAY: PaymentIncentiveManager/syncIncentiveData/refreshGetIncentiveOfferInfo failed");
                r3.A00.Bsl();
            }
        }
    }

    public synchronized void A09(boolean z) {
        if (this.A00 == 1) {
            Log.i("PAY: PaymentIncentiveManager/syncIncentiveData iq requests have yet to be fulfilled, aborting this iq call");
        } else {
            this.A00 = 1;
            A07(new C190719lP(new C689035d(this), this, z), false);
        }
    }

    private C62212r1 A00() {
        String A012 = C18020vd.A01(C18040vf.A02, this.A0C, 782);
        if (A012 == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(A012);
        return new C62212r1(jSONObject.getInt("update_count"), jSONObject.getLong("offer_id"));
    }

    public A03 A03() {
        A03 a03;
        synchronized (A0H) {
            a03 = this.A01;
        }
        return a03;
    }

    public void A04() {
        synchronized (A0H) {
            this.A01 = null;
            AnonymousClass1QD r2 = this.A05;
            if (!TextUtils.isEmpty(r2.A03().getString("payment_incentive_user_claim_info", (String) null))) {
                r2.A0K((String) null);
            }
        }
    }

    public void A06(AnonymousClass9YA r16, long j) {
        C55022f5 r7 = new C55022f5(this.A07, this.A0A, (C33711jG) this.A0G.get(), this.A0D);
        long j2 = j;
        C186129dh r6 = new C186129dh(r16, this, j2);
        r7.A03.A0I(new C175428yh(r7.A01.A00, r7.A02, r7.A00, r6, r7, 18), new C29621ca("account", new AnonymousClass1MD[]{new AnonymousClass1MD("action", "get-offer-eligibility"), new AnonymousClass1MD("offer_id", j2)}), "get", C20113A7w.A0L);
    }

    public void A08(C29621ca r15, long j) {
        try {
            long j2 = j;
            A03 a03 = new A03(r15, j2, AnonymousClass11P.A01(this.A02));
            synchronized (A0H) {
                C198769ys A012 = this.A06.A01(j2);
                if (A012 != null && A012.A01 > 0) {
                    int i = 0;
                    if (((long) (a03.A00 + a03.A01)) >= A012.A05) {
                        i = 1;
                    }
                    A012.A01 = i;
                }
                this.A01 = a03;
                this.A05.A0K(a03.A00());
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("processSuccessfulGetClaimStatus: Error while parsing: ");
            sb.append(e);
            Log.e(sb.toString());
            A04();
        }
    }

    public C33351ig(AnonymousClass1KB r4, AnonymousClass1M9 r5, AnonymousClass12E r6, AnonymousClass11P r7, AnonymousClass118 r8, C18000vb r9, C24751Ln r10, AnonymousClass1KI r11, C18030ve r12, AnonymousClass1QD r13, C31061ex r14, AnonymousClass1QS r15, AnonymousClass10I r16, AnonymousClass00H r17) {
        this.A02 = r7;
        this.A0C = r12;
        this.A07 = r4;
        this.A0A = r8;
        this.A0F = r16;
        this.A03 = r9;
        this.A08 = r5;
        this.A0E = r15;
        this.A0B = r10;
        this.A09 = r6;
        this.A05 = r13;
        this.A0D = r14;
        this.A04 = r11;
        this.A0G = r17;
        C33361ih r0 = new C33361ih(r7, r13);
        this.A06 = r0;
        r0.A03();
        String string = this.A05.A03().getString("payment_incentive_user_claim_info", (String) null);
        if (!TextUtils.isEmpty(string)) {
            try {
                synchronized (A0H) {
                    this.A01 = new A03(string);
                }
            } catch (JSONException unused) {
                A04();
            }
        }
    }

    public C19962A0v A01() {
        C198769ys A022 = A02();
        A03 A032 = A03();
        if (A022 == null || !(A032 == null || A032.A03 == A022.A08.A01)) {
            A04();
        }
        return new C19962A0v(A022, A03());
    }

    public C198769ys A02() {
        try {
            C62212r1 A002 = A00();
            if (A002 == null || A002.A00 <= 0) {
                return null;
            }
            C33361ih r3 = this.A06;
            long j = A002.A01;
            C198769ys A012 = r3.A01(j);
            if (A012 != null) {
                return A012;
            }
            r3.A01.clear();
            r3.A03();
            return r3.A01(j);
        } catch (JSONException unused) {
            return null;
        }
    }

    public void A05(int i, int i2) {
        try {
            C198769ys A022 = A02();
            C62212r1 A002 = A00();
            if (A022 != null && A002 != null) {
                if (i >= 0) {
                    A022.A00 = 1;
                }
                if (i2 >= 0) {
                    A022.A01 = i2;
                }
                this.A06.A04(A022, A002.A01);
            }
        } catch (Exception e) {
            Log.e("PAY: PaymentIncentiveManager/processUiOfferDetails : Error while parsing ", e);
        }
    }
}
