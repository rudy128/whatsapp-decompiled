package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8pH  reason: invalid class name */
public final class AnonymousClass8pH extends C64502us {
    public static final HashSet A01 = AnonymousClass1AP.A01("vpa", "keys", "vpaName", "balance", "usableBalance", "updatedSenderVpa", "sufficientBalance");
    public static final Parcelable.Creator CREATOR = new Object();
    public Bundle A00 = null;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x016a, code lost:
        r0 = A00(r3, "usable-balance");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x016e, code lost:
        if (r0 == null) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0170, code lost:
        r2.putString("usableBalance", r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass1KI r16, X.C29621ca r17, int r18) {
        /*
            r15 = this;
            r0 = 2
            r3 = r17
            X.C18070vi.A0d(r3, r0)
            java.lang.String r7 = "usableBalance"
            java.lang.String r8 = "usable-balance"
            java.lang.String r10 = "updatedSenderVpaId"
            java.lang.String r11 = "updatedSenderVpa"
            java.lang.String r13 = "sender"
            java.lang.String r12 = "updatedVpaFor"
            java.lang.String r6 = "valid"
            java.lang.String r9 = "vpa-id"
            java.lang.String r4 = "balance"
            java.lang.String r5 = "vpa"
            java.lang.String r0 = "vpa-mismatch"
            switch(r18) {
                case 2: goto L_0x0020;
                case 3: goto L_0x001f;
                case 4: goto L_0x0186;
                case 5: goto L_0x0174;
                case 6: goto L_0x00fe;
                case 7: goto L_0x0099;
                case 8: goto L_0x013f;
                default: goto L_0x001f;
            }
        L_0x001f:
            return
        L_0x0020:
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r0 = "psp"
            java.lang.String r1 = r3.A00
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = "provider-type"
            r4 = 0
            java.lang.String r1 = r3.A0Q(r0, r4)
            java.lang.String r0 = "providerType"
            r2.putString(r0, r1)
            java.lang.String r0 = "sms-gateways"
            java.lang.String r1 = r3.A0Q(r0, r4)
            if (r1 == 0) goto L_0x006a
            int r0 = r1.length()
            if (r0 == 0) goto L_0x006a
            java.util.List r0 = X.C108995ce.A0c(r1)
            java.util.ArrayList r1 = X.C17880vN.A10(r0)
        L_0x0050:
            java.lang.String r0 = "smsGateways"
            r2.putStringArrayList(r0, r1)
            java.lang.String r0 = "sms-prefix"
            java.lang.String r1 = r3.A0Q(r0, r4)
            java.lang.String r0 = "smsPrefix"
            r2.putString(r0, r1)
            java.lang.String r0 = "transaction-prefix"
            java.lang.String r1 = r3.A0Q(r0, r4)
            java.lang.String r0 = "transactionPrefix"
            goto L_0x0194
        L_0x006a:
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            goto L_0x0050
        L_0x006f:
            java.lang.String r0 = "psp-routing"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0197
            java.lang.String r0 = "providers"
            java.lang.String r1 = X.C29621ca.A02(r3, r0)
            if (r1 == 0) goto L_0x0094
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0094
            java.util.List r0 = X.C108995ce.A0c(r1)
            java.util.ArrayList r1 = X.C17880vN.A10(r0)
        L_0x008d:
            java.lang.String r0 = "pspRouting"
            r2.putStringArrayList(r0, r1)
            goto L_0x0197
        L_0x0094:
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            goto L_0x008d
        L_0x0099:
            android.os.Bundle r2 = X.C17880vN.A0D()
            r4 = 0
            java.lang.String r0 = r3.A0Q(r5, r4)
            r2.putString(r5, r0)
            java.lang.String r1 = r3.A0Q(r9, r4)
            java.lang.String r0 = "vpaId"
            r2.putString(r0, r1)
            java.lang.String r0 = "vpa-name"
            java.lang.String r1 = r3.A0Q(r0, r4)
            java.lang.String r0 = "vpaName"
            r2.putString(r0, r1)
            java.lang.String r1 = r3.A0Q(r6, r4)
            java.lang.String r0 = "vpaValid"
            r2.putString(r0, r1)
            java.lang.String r0 = "user"
            java.lang.String r1 = r3.A0Q(r0, r4)
            java.lang.String r0 = "jid"
            r2.putString(r0, r1)
            java.lang.String r1 = "blocked"
            java.lang.String r0 = r3.A0Q(r1, r4)
            r2.putString(r1, r0)
            java.lang.String r1 = "token"
            java.lang.String r0 = r3.A0Q(r1, r4)
            r2.putString(r1, r0)
            java.lang.String r1 = "merchant"
            java.lang.String r0 = r3.A0Q(r1, r4)
            r2.putString(r1, r0)
            java.lang.String r0 = "verified-merchant"
            java.lang.String r1 = r3.A0Q(r0, r4)
            java.lang.String r0 = "verifiedMerchant"
            r2.putString(r0, r1)
            java.lang.String r1 = "mcc"
            java.lang.String r0 = r3.A0Q(r1, r4)
            r2.putString(r1, r0)
            goto L_0x0197
        L_0x00fe:
            r1 = 0
            java.lang.String r14 = r3.A0Q(r0, r1)
            android.os.Bundle r2 = X.C17880vN.A0D()
            if (r14 == 0) goto L_0x0121
            r2.putString(r12, r14)
            boolean r0 = X.AnonymousClass8BU.A1T(r3, r0, r13)
            if (r0 == 0) goto L_0x0197
            java.lang.String r0 = r3.A0Q(r5, r1)
            r2.putString(r11, r0)
            java.lang.String r0 = r3.A0Q(r9, r1)
            r2.putString(r10, r0)
            goto L_0x0197
        L_0x0121:
            java.lang.String r0 = r3.A0Q(r6, r1)
            if (r0 == 0) goto L_0x012a
            r2.putString(r6, r0)
        L_0x012a:
            java.lang.String r0 = A00(r3, r4)
            if (r0 == 0) goto L_0x0133
            r2.putString(r4, r0)
        L_0x0133:
            java.lang.String r0 = "sufficient-balance"
            java.lang.String r1 = r3.A0Q(r0, r1)
            java.lang.String r0 = "sufficientBalance"
            r2.putString(r0, r1)
            goto L_0x016a
        L_0x013f:
            android.os.Bundle r2 = X.C17880vN.A0D()
            r1 = 0
            java.lang.String r6 = r3.A0Q(r0, r1)
            if (r6 == 0) goto L_0x0197
            r2.putString(r12, r6)
            boolean r0 = X.AnonymousClass8BU.A1T(r3, r0, r13)
            if (r0 == 0) goto L_0x0161
            java.lang.String r0 = r3.A0Q(r5, r1)
            r2.putString(r11, r0)
            java.lang.String r0 = r3.A0Q(r9, r1)
            r2.putString(r10, r0)
        L_0x0161:
            java.lang.String r0 = A00(r3, r4)
            if (r0 == 0) goto L_0x016a
            r2.putString(r4, r0)
        L_0x016a:
            java.lang.String r0 = A00(r3, r8)
            if (r0 == 0) goto L_0x0197
            r2.putString(r7, r0)
            goto L_0x0197
        L_0x0174:
            java.lang.String r2 = "keys"
            java.lang.String r1 = X.C29621ca.A02(r3, r2)
            if (r1 == 0) goto L_0x001f
            android.os.Bundle r0 = X.C17880vN.A0D()
            r0.putString(r2, r1)
            r15.A00 = r0
            return
        L_0x0186:
            java.lang.String r0 = "credential-id"
            java.lang.String r1 = X.C29621ca.A02(r3, r0)
            if (r1 == 0) goto L_0x001f
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r0 = "credentialId"
        L_0x0194:
            r2.putString(r0, r1)
        L_0x0197:
            r15.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8pH.A05(X.1KI, X.1ca, int):void");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeBundle(this.A00);
    }

    public static final String A00(C29621ca r6, String str) {
        C29621ca A0K = r6.A0K(str);
        if (A0K == null) {
            return C29621ca.A02(r6, str);
        }
        try {
            C29621ca A0L = A0K.A0L("money");
            return String.valueOf(((double) ((long) A0L.A09("value"))) / ((double) ((long) A0L.A09("offset"))));
        } catch (AnonymousClass1UI unused) {
            Log.e("PAY: IndiaUpiPaymentData parseBalance failure");
            return null;
        }
    }

    public String A04() {
        throw AnonymousClass04E.createAndThrow();
    }

    public void A06(String str) {
        throw AnonymousClass04E.createAndThrow();
    }

    public void A07(List list) {
        throw AnonymousClass04E.createAndThrow();
    }

    public String toString() {
        ArrayList A13 = AnonymousClass000.A13();
        Bundle bundle = this.A00;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                boolean contains = A01.contains(A0v);
                StringBuilder A10 = AnonymousClass000.A10();
                if (!contains) {
                    A10.append(A0v);
                    A10.append('=');
                    A10.append(bundle.get(A0v));
                } else {
                    A10.append(A0v);
                    A10.append("=SCRUBBED");
                }
                C108955ca.A1U(A10, A13);
            }
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append(" [ bundle: {");
        A102.append(C108995ce.A0X(", ", A13));
        return C17890vO.A0c(A102, ']');
    }
}
