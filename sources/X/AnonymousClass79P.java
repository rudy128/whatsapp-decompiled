package X;

import android.content.SharedPreferences;
import android.widget.CompoundButton;
import com.whatsapp.report.ReportActivity;

/* renamed from: X.79P  reason: invalid class name */
public final /* synthetic */ class AnonymousClass79P implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ReportActivity A00;
    public final /* synthetic */ Integer A01;

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        ReportActivity reportActivity = this.A00;
        Integer num = this.A01;
        C18070vi.A0d(num, 1);
        int intValue = num.intValue();
        SharedPreferences A0M = C72453Mb.A0M(reportActivity);
        if (intValue != 2) {
            str = "automatic_account_report_enabled";
        } else {
            str = "automatic_channel_report_enabled";
        }
        boolean z2 = false;
        if (A0M.getBoolean(str, false) != z) {
            if (z) {
                C143877Fd A03 = ReportActivity.A03(reportActivity, num);
                if (A03 == null || A03.A07() == AnonymousClass00R.A00) {
                    z2 = !ReportActivity.A0q(reportActivity, num);
                }
                AnonymousClass00H r0 = reportActivity.A0G;
                if (r0 != null) {
                    AnonymousClass6q2 r6 = (AnonymousClass6q2) r0.get();
                    SharedPreferences.Editor A002 = C19830z4.A00(r6.A00);
                    if (intValue != 1) {
                        str4 = "automatic_channel_report_enabled";
                    } else {
                        str4 = "automatic_account_report_enabled";
                    }
                    C17880vN.A1F(A002, str4, true);
                    if (z2) {
                        r6.A00(num);
                    }
                }
                str2 = "autoReportScheduler";
                C18070vi.A11(str2);
                throw null;
            }
            AnonymousClass00H r02 = reportActivity.A0G;
            if (r02 != null) {
                SharedPreferences.Editor A003 = C19830z4.A00(((AnonymousClass6q2) r02.get()).A00);
                if (intValue != 1) {
                    str3 = "automatic_channel_report_enabled";
                } else {
                    str3 = "automatic_account_report_enabled";
                }
                C17880vN.A1F(A003, str3, false);
            }
            str2 = "autoReportScheduler";
            C18070vi.A11(str2);
            throw null;
            AnonymousClass00H r03 = reportActivity.A0F;
            if (r03 != null) {
                C126266cS r2 = (C126266cS) r03.get();
                AnonymousClass62D r1 = new AnonymousClass62D();
                r1.A00 = Boolean.valueOf(z);
                int i = 1;
                if (intValue != 1) {
                    i = 2;
                }
                r1.A01 = Integer.valueOf(i);
                r2.A00.CC7(r1);
                return;
            }
            str2 = "accountReportLogger";
            C18070vi.A11(str2);
            throw null;
        }
    }

    public /* synthetic */ AnonymousClass79P(ReportActivity reportActivity, Integer num) {
        this.A00 = reportActivity;
        this.A01 = num;
    }
}
