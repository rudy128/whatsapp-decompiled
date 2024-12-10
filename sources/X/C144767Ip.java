package X;

import com.whatsapp.report.activity.banreport.BanReportViewModel;

/* renamed from: X.7Ip  reason: invalid class name and case insensitive filesystem */
public class C144767Ip implements BC9 {
    public final int A00;
    public final Object A01;

    public C144767Ip(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BsC(boolean z) {
        C26981Ug r2;
        int i;
        int i2 = this.A00;
        Object obj = this.A01;
        switch (i2) {
            case 0:
                AnonymousClass3MX.A1J(((BanReportViewModel) obj).A02, 1);
                return;
            case 1:
                r2 = ((C1195368n) obj).A02;
                i = 34;
                break;
            default:
                r2 = ((C1195568p) obj).A02;
                i = 0;
                break;
        }
        if (!z) {
            i = 13;
        }
        r2.BrF(new C1409173o(i));
    }

    public void BsD(C1409173o r4, C136996uk r5) {
        C26981Ug r0;
        switch (this.A00) {
            case 0:
                AnonymousClass3MX.A1J(((BanReportViewModel) this.A01).A02, C72453Mb.A03(r4.A03() ? 1 : 0));
                return;
            case 1:
                r0 = ((C1195368n) this.A01).A02;
                break;
            default:
                r0 = ((C1195568p) this.A01).A02;
                break;
        }
        r0.BrF(r4);
    }

    public /* synthetic */ void BsA(long j) {
    }
}
