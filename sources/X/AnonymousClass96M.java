package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;

/* renamed from: X.96M  reason: invalid class name */
public class AnonymousClass96M extends C161568Fz {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A03 = AnonymousClass3MW.A0L();
    public final C192839p4 A04;
    public final C191619mt A05;
    public final A5B A06;
    public final AnonymousClass10I A07;
    public final String A08;
    public final boolean A09;
    public final AnonymousClass1KB A0A;
    public final String A0B;

    public AnonymousClass96M(AnonymousClass1KB r8, AnonymousClass11P r9, C192839p4 r10, C191619mt r11, A54 a54, A5B a5b, A5H a5h, A4K a4k, C195929uA r16, AnonymousClass10I r17, String str, String str2, boolean z) {
        super(r9, a54, a5h, a4k, r16);
        this.A0A = r8;
        this.A07 = r17;
        this.A06 = a5b;
        this.A0B = str;
        this.A04 = r10;
        this.A05 = r11;
        this.A08 = str2;
        this.A09 = z;
    }

    public static void A00(AZ2 az2, C191419mZ r5, AnonymousClass96M r6, C29621ca r7, String str) {
        C191419mZ r1 = r5;
        try {
            C29621ca r2 = r7;
            String str2 = str;
            r6.A04.A01(r1, r2, str2, r6.A08, AZ2.A00(az2, AnonymousClass8BR.A1Z(r6.A0B)));
        } catch (Exception unused) {
            Log.e("DyiViewModel/request-report/sendDyiReportRequestWithPassword");
            r1.A00(A7B.A00());
        }
    }

    public static void A03(AnonymousClass96M r3, int i) {
        if (!r3.A0A.A0N()) {
            Log.i("DyiViewModel/check-internet :: no internet connection aborting the action");
            r3.A03.A0E(AnonymousClass8BR.A0B(Integer.valueOf(i), new A7B(7)));
        }
    }

    public void A0S() {
        Log.i("DyiViewModel/on-cleared");
        A5B a5b = this.A06;
        String str = this.A08;
        if (a5b.A02(str) == 3) {
            synchronized (a5b) {
                C1194868i r1 = a5b.A00;
                if (r1 != null) {
                    AnonymousClass7RU.A01(r1, false);
                }
                a5b.A07.A0F(2, str);
            }
        }
    }

    public void A0W(C191419mZ r16, C29621ca r17, String str) {
        String str2;
        Log.i("DyiViewModel/request-report");
        A03(this, 0);
        A5B a5b = this.A06;
        long A012 = AnonymousClass11P.A01(this.A06);
        String str3 = this.A08;
        synchronized (a5b) {
            Log.i("dyiReportManager/on-report-requested");
            SharedPreferences.Editor A072 = AnonymousClass8BU.A07(a5b.A07);
            if ("personal".equals(str3)) {
                str2 = "payment_dyi_report_timestamp";
            } else {
                str2 = "business_payment_dyi_report_timestamp";
            }
            C17880vN.A1D(A072, str2, A012);
        }
        AnonymousClass3MX.A1K(this.A02, 1);
        C191419mZ r7 = r16;
        C29621ca r5 = r17;
        String str4 = str;
        if (this.A09) {
            AZ2 A013 = this.A04.A01("FB", "DYI-REPORT");
            if (A013 != null) {
                A00(A013, r7, this, r5, str4);
            } else {
                this.A05.A00(new C20777AYg(r5, this, r7, str4, 2), "FB");
            }
        } else if (str3.equals("business")) {
            this.A04.A01(r7, (C29621ca) null, str4, "business", (byte[]) null);
        } else if (!str3.equals("personal")) {
            Log.e("PAY: DyiReportViewModel/requestReport - this account type is not supported");
        } else {
            C192839p4 r9 = this.A04;
            C17960vV.A07(r5);
            r9.A01(r7, r5, str4, "personal", (byte[]) null);
        }
    }
}
