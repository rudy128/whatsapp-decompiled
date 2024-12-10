package X;

import com.whatsapp.report.ReportActivity;

/* renamed from: X.7LH  reason: invalid class name */
public final class AnonymousClass7LH implements B9K {
    public final /* synthetic */ C143877Fd A00;
    public final /* synthetic */ ReportActivity A01;

    public AnonymousClass7LH(C143877Fd r1, ReportActivity reportActivity) {
        this.A00 = r1;
        this.A01 = reportActivity;
    }

    public void CGB(int i) {
        C17900vP.A0i("send-delete-gdpr-report/failed/error ", AnonymousClass000.A10(), i);
        if (i == 404) {
            this.A00.A0A();
            return;
        }
        ReportActivity reportActivity = this.A01;
        C146767Qn.A00(reportActivity.A05, reportActivity, 27);
    }
}
