package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.bizintegrity.smbsuspicious.SMBSuspiciousSenderUrlClickWarningSheet;

/* renamed from: X.3v6  reason: invalid class name */
public final class AnonymousClass3v6 extends C74923d8 {
    public final A5M A00;
    public final AnonymousClass206 A01;
    public final Context A02;
    public final C84644Kh A03;
    public final C18030ve A04;
    public final AnonymousClass10I A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3v6(android.content.Context r10, X.AnonymousClass1L8 r11, X.AnonymousClass1KB r12, X.A5M r13, X.C84644Kh r14, X.AnonymousClass11C r15, X.C18030ve r16, X.AnonymousClass206 r17, X.AnonymousClass10I r18, java.lang.String r19) {
        /*
            r9 = this;
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.A01 = r7
            r9.A04 = r6
            r9.A02 = r10
            r9.A03 = r14
            r9.A00 = r13
            r0 = r18
            r9.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3v6.<init>(android.content.Context, X.1L8, X.1KB, X.A5M, X.4Kh, X.11C, X.0ve, X.206, X.10I, java.lang.String):void");
    }

    public void onClick(View view) {
        C18070vi.A0d(view, 0);
        if (A05()) {
            AnonymousClass1GP A0O = AnonymousClass3MX.A0O((AnonymousClass1FL) AnonymousClass1L9.A01(this.A02, AnonymousClass1FY.class));
            AnonymousClass205 r1 = this.A01.A0v;
            C18070vi.A0W(r1);
            C92904i6 r2 = new C92904i6(view, this, 1);
            Bundle A0D = C17880vN.A0D();
            AnonymousClass4aU.A0A(A0D, r1);
            SMBSuspiciousSenderUrlClickWarningSheet sMBSuspiciousSenderUrlClickWarningSheet = new SMBSuspiciousSenderUrlClickWarningSheet();
            sMBSuspiciousSenderUrlClickWarningSheet.A1R(A0D);
            sMBSuspiciousSenderUrlClickWarningSheet.A05 = r2;
            C20098A7b.A05(sMBSuspiciousSenderUrlClickWarningSheet, A0O, "SMBSuspiciousSenderUrlClickWarningSheet");
            return;
        }
        C98784ri.A00(this.A05, this, 38);
        super.onClick(view);
    }

    public final boolean A05() {
        AnonymousClass206 r1 = this.A01;
        AnonymousClass1BI r3 = r1.A0v.A00;
        if (r3 == null && (r3 = r1.A0H()) == null) {
            return false;
        }
        SharedPreferences A052 = this.A03.A00.A05("smb_suspicious_warning_banner");
        C18070vi.A0X(A052);
        return !A052.getBoolean(r3.getRawString(), false);
    }

    public void A03(Uri uri, View view, String str) {
        this.A00 = A05();
        super.A03(uri, view, str);
    }

    public static final void A00(View view, AnonymousClass3v6 r1) {
        super.onClick(view);
    }
}
