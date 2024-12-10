package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.report.BusinessActivityReportViewModel;
import com.whatsapp.report.ReportActivity;

/* renamed from: X.7Ls  reason: invalid class name and case insensitive filesystem */
public final class C145557Ls implements C1602187p {
    public final /* synthetic */ ReportActivity A00;

    public C145557Ls(ReportActivity reportActivity) {
        this.A00 = reportActivity;
    }

    public void BIN() {
        boolean z;
        BusinessActivityReportViewModel businessActivityReportViewModel = this.A00.A07;
        if (businessActivityReportViewModel != null && businessActivityReportViewModel.A03.A0N()) {
            AnonymousClass3MX.A1J(businessActivityReportViewModel.A01, 1);
            AnonymousClass7LQ r7 = businessActivityReportViewModel.A0B;
            if (r7.A02.A09()) {
                AnonymousClass00H r0 = r7.A03;
                String A0T = C17890vO.A0T(r0);
                AnonymousClass1OZ A0U = C17880vN.A0U(r0);
                AnonymousClass1MD[] r3 = new AnonymousClass1MD[1];
                boolean A1W = C17890vO.A1W("action", "delete", r3);
                C29621ca r4 = new C29621ca("p2b", r3);
                AnonymousClass1MD[] r32 = new AnonymousClass1MD[6];
                C17880vN.A1I(C173438v4.A00, "to", r32, A1W ? 1 : 0);
                C17880vN.A1Q("from", AnonymousClass11S.A01(r7.A01).getRawString(), r32, 1);
                C17890vO.A12("xmlns", "w:biz:p2b_report", r32);
                r32[3] = new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
                r32[4] = new AnonymousClass1MD("smax_id", "31");
                r32[5] = new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0T);
                A0U.A0J(r7, new C29621ca(r4, "iq", r32), A0T, 266, 32000);
                z = true;
            } else {
                z = false;
            }
            C17900vP.A0n("app/sendDeleteReport success:", AnonymousClass000.A10(), z);
        }
    }
}
