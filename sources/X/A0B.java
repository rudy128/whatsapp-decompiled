package X;

import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import java.util.List;

public final class A0B {
    public final AnonymousClass1LA A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass11C A02;
    public final C219217x A03;
    public final AZ6 A04;
    public final C18030ve A05;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r3 > 10) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.AnonymousClass1LA r7, X.AZ6 r8, java.lang.String r9, java.lang.String r10) {
        /*
            r0 = 1
            X.C18070vi.A0d(r8, r0)
            r6 = 0
            if (r9 == 0) goto L_0x005d
            int r0 = r9.length()
            if (r0 == 0) goto L_0x005d
            java.lang.String r1 = X.C63942tw.A04(r9)
            java.lang.String r5 = X.C63942tw.A04(r10)
            java.lang.String r0 = X.C20056A5f.A02(r5)
            java.lang.String r4 = X.C63942tw.A03(r7, r0, r1)
            int r3 = r4.length()
            r0 = 12
            java.lang.String r2 = "91"
            r1 = 0
            if (r3 == r0) goto L_0x0037
            boolean r0 = X.AnonymousClass1YE.A0A(r4, r2, r6)
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "incorrect_country_prefix_validation"
            r8.BiL(r1, r0, r1, r6)
        L_0x0033:
            r0 = 10
            if (r3 <= r0) goto L_0x0042
        L_0x0037:
            boolean r0 = X.AnonymousClass1YE.A0A(r4, r2, r6)
            if (r0 == 0) goto L_0x0042
            boolean r0 = android.text.TextUtils.equals(r4, r5)
            return r0
        L_0x0042:
            if (r5 == 0) goto L_0x0058
            X.1wr r0 = new X.1wr
            r0.<init>((java.lang.String) r2)
            java.lang.String r1 = ""
            java.util.regex.Pattern r0 = r0.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r5)
            java.lang.String r1 = r0.replaceFirst(r1)
            X.C18070vi.A0X(r1)
        L_0x0058:
            boolean r0 = android.text.TextUtils.equals(r4, r1)
            return r0
        L_0x005d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0B.A00(X.1LA, X.AZ6, java.lang.String, java.lang.String):boolean");
    }

    public final String A01() {
        SubscriptionManager A0J;
        List<SubscriptionInfo> activeSubscriptionInfoList;
        if (!C18020vd.A05(C18040vf.A02, this.A05, 10223)) {
            return null;
        }
        Integer num = null;
        if (!this.A03.A0I() || Build.VERSION.SDK_INT < 22 || (A0J = this.A02.A0J()) == null || (activeSubscriptionInfoList = A0J.getActiveSubscriptionInfoList()) == null) {
            return null;
        }
        if (activeSubscriptionInfoList.size() == 1) {
            num = Integer.valueOf(((SubscriptionInfo) C108955ca.A0p(activeSubscriptionInfoList)).getSubscriptionId());
        } else {
            String A052 = AnonymousClass17K.A05(AnonymousClass11S.A00(this.A01));
            for (SubscriptionInfo next : activeSubscriptionInfoList) {
                if (A00(this.A00, this.A04, next.getNumber(), A052)) {
                    num = Integer.valueOf(next.getSubscriptionId());
                }
            }
        }
        if (num != null) {
            return num.toString();
        }
        return null;
    }

    public A0B(AnonymousClass1LA r2, AnonymousClass11S r3, AnonymousClass11C r4, C219217x r5, C18030ve r6, AZ6 az6) {
        C18070vi.A0w(r6, r3, r4, r2, r5);
        C18070vi.A0d(az6, 6);
        this.A05 = r6;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = r5;
        this.A04 = az6;
    }
}
