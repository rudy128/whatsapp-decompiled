package X;

import com.whatsapp.report.ReportActivity;

/* renamed from: X.7Lt  reason: invalid class name and case insensitive filesystem */
public final class C145567Lt implements C1602187p {
    public final /* synthetic */ ReportActivity A00;
    public final /* synthetic */ Integer A01;

    public C145567Lt(ReportActivity reportActivity, Integer num) {
        this.A00 = reportActivity;
        this.A01 = num;
    }

    public void BIN() {
        ReportActivity reportActivity = this.A00;
        Integer num = this.A01;
        if (reportActivity.A05.A0N()) {
            if (reportActivity.A0C != null) {
                reportActivity.A0C = null;
            }
            AnonymousClass1KB r3 = reportActivity.A05;
            C18070vi.A0W(r3);
            AnonymousClass11P r4 = reportActivity.A05;
            C18070vi.A0W(r4);
            AnonymousClass6ME r1 = new AnonymousClass6ME(reportActivity, r3, r4, reportActivity, num);
            reportActivity.A0C = r1;
            C17890vO.A0u(r1, reportActivity.A05);
        }
    }
}
