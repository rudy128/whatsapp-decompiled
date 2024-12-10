package X;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;

public class A5B {
    public C1194868i A00;
    public C186099de A01;
    public final C218617r A02;
    public final AnonymousClass181 A03;
    public final AnonymousClass11P A04;
    public final C18030ve A05;
    public final C24371Kb A06;
    public final AnonymousClass1QD A07;
    public final C24421Kg A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass18O A0A;
    public final AnonymousClass118 A0B;

    public static C186099de A00(byte[] bArr, long j) {
        String str;
        long j2;
        try {
            C166418cr A012 = C166418cr.A01(bArr);
            if ((A012.bitField0_ & 64) != 0) {
                C166208cW r2 = A012.documentMessage_;
                if (r2 == null) {
                    r2 = C166208cW.DEFAULT_INSTANCE;
                }
                if ((r2.bitField0_ & 1) != 0) {
                    str = r2.url_;
                    if (TextUtils.isEmpty(str)) {
                        Log.e("dyiReportManager/create-report-info failed : url is empty");
                        return null;
                    } else if (!"https".equalsIgnoreCase(Uri.parse(str).getScheme())) {
                        C17900vP.A0e("dyiReportManager/create-report-info failed : invalid scheme; url =", str, AnonymousClass000.A10());
                        return null;
                    }
                } else {
                    str = null;
                }
                if ((r2.bitField0_ & 16) != 0) {
                    j2 = r2.fileLength_;
                } else {
                    j2 = 0;
                }
                return new C186099de(j2, str, j);
            }
            Log.e("dyiReportManager/create-report-info failed : invalid e2eMessage -> no document message found");
            return null;
        } catch (AnonymousClass1PN e) {
            Log.e("dyiReportManager/create-report-info", e);
            return null;
        }
    }

    public synchronized int A02(String str) {
        SharedPreferences A032;
        String str2;
        A032 = this.A07.A03();
        if ("personal".equals(str)) {
            str2 = "payment_dyi_report_state";
        } else {
            str2 = "business_payment_dyi_report_state";
        }
        return AnonymousClass8BT.A01(A032, str2);
    }

    public synchronized C186099de A03(String str) {
        byte[] A0K;
        String str2;
        String str3;
        if (this.A01 == null && (A0K = C17970vW.A0K(A01(this, str))) != null) {
            AnonymousClass1QD r7 = this.A07;
            SharedPreferences A032 = r7.A03();
            boolean equals = "personal".equals(str);
            if (equals) {
                str2 = "payment_dyi_report_timestamp";
            } else {
                str2 = "business_payment_dyi_report_timestamp";
            }
            long j = A032.getLong(str2, -1);
            SharedPreferences A033 = r7.A03();
            if (equals) {
                str3 = "payment_dyi_report_expiration_timestamp";
            } else {
                str3 = "business_payment_dyi_report_expiration_timestamp";
            }
            A033.getLong(str3, -1);
            this.A01 = A00(A0K, j);
        }
        return this.A01;
    }

    public synchronized void A04(String str) {
        Log.i("dyiReportManager/reset");
        this.A01 = null;
        File A012 = A01(this, str);
        if (A012.exists() && !A012.delete()) {
            Log.e("dyiReportManager/reset/failed-delete-report-info");
        }
        C218617r r2 = this.A02;
        File A0S = r2.A0S(str);
        if (A0S.exists() && !A0S.delete()) {
            Log.e("dyiReportManager/reset/failed-delete-report-file");
        }
        C64062u9.A0H(r2.A0X(str), 0);
        this.A07.A0J(str);
    }

    public static File A01(A5B a5b, String str) {
        String str2;
        File A0t = AnonymousClass8BR.A0t(a5b.A0B);
        if ("personal".equals(str)) {
            str2 = "dyi.info";
        } else {
            str2 = "business_dyi.info";
        }
        return C17880vN.A0e(A0t, str2);
    }

    public A5B(C218617r r1, AnonymousClass18O r2, AnonymousClass181 r3, AnonymousClass11P r4, AnonymousClass118 r5, C18030ve r6, C24371Kb r7, AnonymousClass1QD r8, C24421Kg r9, AnonymousClass00H r10) {
        this.A04 = r4;
        this.A05 = r6;
        this.A0B = r5;
        this.A03 = r3;
        this.A02 = r1;
        this.A0A = r2;
        this.A09 = r10;
        this.A08 = r9;
        this.A07 = r8;
        this.A06 = r7;
    }
}
