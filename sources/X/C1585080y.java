package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.report.BusinessActivityReportViewModel;
import com.whatsapp.report.ReportActivity;

/* renamed from: X.80y  reason: invalid class name and case insensitive filesystem */
public final class C1585080y extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ReportActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1585080y(ReportActivity reportActivity) {
        super(1);
        this.this$0 = reportActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        long j2;
        C18000vb r5;
        C19830z4 r4;
        String A09;
        long j3;
        long j4;
        C1417276s A01;
        int A0M = AnonymousClass000.A0M(obj);
        ReportActivity reportActivity = this.this$0;
        BusinessActivityReportViewModel businessActivityReportViewModel = reportActivity.A07;
        if (businessActivityReportViewModel == null || (A01 = businessActivityReportViewModel.A05.A01()) == null) {
            j = -1;
        } else {
            j = A01.A02;
        }
        C136946uf r14 = reportActivity.A09;
        if (r14 != null) {
            if (A0M == 0) {
                r14.A01(new C146767Qn(reportActivity, 26), 2131893438);
            } else if (A0M != 1) {
                long j5 = 0;
                if (A0M == 2) {
                    C146767Qn r15 = new C146767Qn(reportActivity, 29);
                    BusinessActivityReportViewModel businessActivityReportViewModel2 = reportActivity.A07;
                    if (businessActivityReportViewModel2 != null) {
                        j2 = businessActivityReportViewModel2.A04.A0W("business_activity_report_timestamp");
                    } else {
                        j2 = 0;
                    }
                    BusinessActivityReportViewModel businessActivityReportViewModel3 = reportActivity.A07;
                    if (businessActivityReportViewModel3 != null) {
                        j5 = C17890vO.A0B(businessActivityReportViewModel3.A04).getLong("business_activity_report_expiration_timestamp", 0);
                    }
                    r14.A02(r15, 2131893434, j, j2, j5, false, false);
                } else if (A0M == 3) {
                    BusinessActivityReportViewModel businessActivityReportViewModel4 = reportActivity.A07;
                    if (businessActivityReportViewModel4 != null) {
                        View view = r14.A06;
                        view.setEnabled(false);
                        view.setOnClickListener((View.OnClickListener) null);
                        ImageView imageView = r14.A0A;
                        imageView.setImageResource(2131232262);
                        Context context = r14.A04;
                        AnonymousClass4aX.A0D(imageView, AnonymousClass3Ma.A00(context, 2130969993, 2131101078));
                        TextView textView = r14.A0C;
                        textView.setText(2131890644);
                        C72463Mc.A0y(context, textView, 2130969993, 2131101078);
                        TextView textView2 = r14.A0B;
                        C72463Mc.A0y(context, textView2, 2130969993, 2131101078);
                        textView2.setVisibility(0);
                        C36191nU r12 = businessActivityReportViewModel4.A05;
                        if (r12.A01() != null) {
                            Object[] A1b = AnonymousClass3MW.A1b();
                            AnonymousClass11Y r13 = AnonymousClass11X.A00;
                            r5 = r14.A0D;
                            r4 = businessActivityReportViewModel4.A04;
                            A1b[0] = r13.A09(r5, r4.A0W("business_activity_report_timestamp"));
                            C1417276s A012 = r12.A01();
                            if (A012 != null) {
                                j3 = A012.A02;
                            } else {
                                j3 = 0;
                            }
                            A09 = C17880vN.A0q(context, C88584aA.A02(r5, j3), A1b, 1, 2131890650);
                        } else {
                            AnonymousClass11Y r10 = AnonymousClass11X.A00;
                            r5 = r14.A0D;
                            r4 = businessActivityReportViewModel4.A04;
                            A09 = r10.A09(r5, r4.A0W("business_activity_report_timestamp"));
                        }
                        textView2.setText(A09);
                        r14.A07.setVisibility(8);
                        r14.A05.setVisibility(0);
                        r14.A04(AnonymousClass3Ma.A10(context, AnonymousClass6XO.A00(r5, 1, C17890vO.A0B(r4).getLong("business_activity_report_expiration_timestamp", 0)), new Object[1], 0, 2131890648));
                        r14.A09.setVisibility(8);
                        r14.A08.setVisibility(8);
                    }
                } else if (A0M == 4) {
                    C146767Qn r7 = new C146767Qn(reportActivity, 30);
                    BusinessActivityReportViewModel businessActivityReportViewModel5 = reportActivity.A07;
                    if (businessActivityReportViewModel5 != null) {
                        j4 = businessActivityReportViewModel5.A04.A0W("business_activity_report_timestamp");
                    } else {
                        j4 = 0;
                    }
                    BusinessActivityReportViewModel businessActivityReportViewModel6 = reportActivity.A07;
                    if (businessActivityReportViewModel6 != null) {
                        j5 = C17890vO.A0B(businessActivityReportViewModel6.A04).getLong("business_activity_report_expiration_timestamp", 0);
                    }
                    r14.A03(r7, j, j4, j5);
                }
            } else {
                r14.A05(C18070vi.A0F(reportActivity, 2131893437), C18070vi.A0F(reportActivity, 2131893436));
            }
        }
        return C27621Wu.A00;
    }
}
