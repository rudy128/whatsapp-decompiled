package X;

import com.whatsapp.report.BusinessActivityReportViewModel;
import com.whatsapp.report.ReportActivity;
import com.whatsapp.util.Log;

/* renamed from: X.7Lu  reason: invalid class name and case insensitive filesystem */
public final class C145577Lu implements C1602287q {
    public final /* synthetic */ ReportActivity A00;

    public C145577Lu(ReportActivity reportActivity) {
        this.A00 = reportActivity;
    }

    public void CLd() {
        BusinessActivityReportViewModel businessActivityReportViewModel = this.A00.A07;
        if (businessActivityReportViewModel != null) {
            Log.i("BusinessActivityReportViewModel/export-report");
            businessActivityReportViewModel.A0E.CGF(new C146767Qn(businessActivityReportViewModel, 24));
        }
    }
}
