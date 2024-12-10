package X;

import android.text.TextUtils;

public class AXQ implements C33661jB, BBW {
    public AnonymousClass1QS A00;
    public C177949Bf A01;
    public C180609Nf A02;
    public B5S A03;
    public final AnonymousClass1FY A04;
    public final C33301ib A05;
    public final C33311ic A06;
    public final C31061ex A07;
    public final C188079gq A08;
    public final B9A A09;
    public final BBY A0A;
    public final AnonymousClass10I A0B;
    public final boolean A0C;
    public final AnonymousClass1QL A0D;
    public final C31051ew A0E;
    public final AnonymousClass1QD A0F;
    public final C33651jA A0G;
    public final BBW A0H;
    public final String A0I;
    public final C48052Kz A0J;
    public final AnonymousClass2L2 A0K;
    public final AnonymousClass1QE A0L = AnonymousClass1QE.A00("PaymentDataPresenter", "payment", "COMMON");

    public synchronized void A01(boolean z) {
        synchronized (this) {
            C177949Bf r1 = this.A01;
            if (r1 != null) {
                r1.A0B(true);
            }
            AnonymousClass1FY r4 = this.A04;
            AnonymousClass10I r9 = this.A0B;
            C177949Bf r3 = new C177949Bf(r4, this.A05, this.A06, this.A00, this.A08, r9, AnonymousClass3MW.A0z(this.A09), AnonymousClass3MW.A0z(this.A0A), this.A0C, z);
            this.A01 = r3;
            r9.CGM(r3, new Void[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        if (r3.A03().getBoolean("payment_account_recoverable", false) != false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(boolean r14, boolean r15) {
        /*
            r13 = this;
            r8 = r13
            boolean r4 = r13.A0C
            if (r4 == 0) goto L_0x0012
            r0 = 5
            X.AXo r1 = new X.AXo
            r1.<init>(r13, r0)
            r13.A03 = r1
            X.2L2 r0 = r13.A0K
            r0.registerObserver(r1)
        L_0x0012:
            X.1QL r3 = r13.A0D
            boolean r0 = r3.A0F()
            if (r0 != 0) goto L_0x0022
            X.1ew r0 = r13.A0E
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x0058
        L_0x0022:
            X.1QD r2 = r13.A0F
            android.content.SharedPreferences r1 = r2.A03()
            java.lang.String r0 = "has_p2mlite_account"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 != 0) goto L_0x0058
            if (r15 != 0) goto L_0x0051
            X.11P r0 = r2.A01
            long r6 = X.AnonymousClass11P.A01(r0)
            android.content.SharedPreferences r5 = r2.A03()
            java.lang.String r2 = "payments_methods_last_sync_time"
            r0 = 0
            long r0 = r5.getLong(r2, r0)
            long r6 = r6 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            r0 = 1
            long r1 = r2.toMillis(r0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0058
        L_0x0051:
            X.10I r1 = r13.A0B
            r0 = 31
            X.C21427Aju.A00(r1, r13, r0)
        L_0x0058:
            boolean r0 = r3.A0F()
            if (r0 != 0) goto L_0x0081
            X.1ew r0 = r13.A0E
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0081
            X.1QD r3 = r13.A0F
            android.content.SharedPreferences r1 = r3.A03()
            java.lang.String r0 = "payment_account_recovered"
            r2 = 0
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x008f
            android.content.SharedPreferences r1 = r3.A03()
            java.lang.String r0 = "payment_account_recoverable"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x008f
        L_0x0081:
            if (r4 == 0) goto L_0x008f
            if (r14 == 0) goto L_0x008f
            X.1jA r7 = r13.A0G
            r9 = 0
            java.lang.String r12 = r13.A0I
            r11 = r9
            r10 = r9
            r7.A01(r8, r9, r10, r11, r12)
        L_0x008f:
            X.2Kz r2 = r13.A0J
            if (r2 == 0) goto L_0x009e
            r1 = 6
            X.8yc r0 = new X.8yc
            r0.<init>(r13, r1)
            r13.A02 = r0
            r2.registerObserver(r0)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AXQ.A02(boolean, boolean):void");
    }

    public void A00() {
        C48052Kz r0;
        C17890vO.A0t(this.A01);
        this.A01 = null;
        B5S b5s = this.A03;
        if (b5s != null) {
            this.A0K.unregisterObserver(b5s);
        }
        C180609Nf r1 = this.A02;
        if (r1 != null && (r0 = this.A0J) != null) {
            r0.unregisterObserver(r1);
        }
    }

    public void C3L(A7B a7b) {
        AnonymousClass8BX.A1C(this.A0L, a7b, "getPaymentMethods/getPaymentTransactions/onRequestError. paymentNetworkError: ", AnonymousClass000.A10());
    }

    public void C3X(A7B a7b) {
        AnonymousClass8BX.A1C(this.A0L, a7b, "getPaymentMethods/getPaymentTransactions/onResponseError. paymentNetworkError: ", AnonymousClass000.A10());
    }

    public void C3Y(C186089dd r11) {
        if (r11 instanceof C176018ze) {
            this.A0L.A04("init/getMethods/onResponseSuccess");
        } else if (r11 instanceof C176028zf) {
            AnonymousClass1QE r2 = this.A0L;
            r2.A04("init/getTransactions/onResponseSuccess");
            C176028zf r112 = (C176028zf) r11;
            ADK adk = r112.A00;
            if (adk == null) {
                r2.A04("unexpected payment transaction result type.");
            } else if (!adk.A01 && !TextUtils.isEmpty(adk.A00)) {
                this.A0G.A01(this, (Integer) null, (Integer) null, r112.A00.A00, this.A0I);
            }
        } else {
            return;
        }
        A01(false);
    }

    public AXQ(AnonymousClass1FY r4, C33301ib r5, C48052Kz r6, AnonymousClass1QL r7, C31051ew r8, C33311ic r9, AnonymousClass1QD r10, AnonymousClass2L2 r11, C31061ex r12, AnonymousClass1QS r13, C33651jA r14, C188079gq r15, BBW bbw, B9A b9a, BBY bby, AnonymousClass10I r19, String str, boolean z) {
        this.A04 = r4;
        this.A0B = r19;
        this.A08 = r15;
        this.A00 = r13;
        this.A0F = r10;
        this.A0D = r7;
        this.A07 = r12;
        this.A0G = r14;
        this.A0E = r8;
        this.A09 = b9a;
        this.A0J = r6;
        this.A0K = r11;
        this.A05 = r5;
        this.A06 = r9;
        this.A0H = bbw;
        this.A0A = bby;
        this.A0I = str;
        this.A0C = z;
    }

    public void Bl5(boolean z) {
        throw AnonymousClass04E.createAndThrow();
    }

    public void C0I(C20284AEs aEs) {
        throw AnonymousClass04E.createAndThrow();
    }
}
