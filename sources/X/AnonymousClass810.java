package X;

import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.report.ReportActivity;

/* renamed from: X.810  reason: invalid class name */
public final class AnonymousClass810 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ReportActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass810(ReportActivity reportActivity) {
        super(1);
        this.this$0 = reportActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1KB r1;
        int i;
        Number number = (Number) obj;
        this.this$0.CEx();
        if (number != null) {
            int intValue = number.intValue();
            if (intValue == 2) {
                r1 = this.this$0.A05;
                i = 2131890646;
            } else if (intValue == 3) {
                r1 = this.this$0.A05;
                i = 2131890645;
            } else if (intValue == 1) {
                this.this$0.CNB(0, 2131895077);
            } else if (intValue == 4) {
                r1 = this.this$0.A05;
                i = 2131896261;
            } else if (intValue == 5) {
                this.this$0.CMk(new WaDialogFragment(), (String) null);
            }
            r1.A08(i, 0);
        }
        return C27621Wu.A00;
    }
}
