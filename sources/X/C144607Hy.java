package X;

import android.util.Base64;
import com.whatsapp.report.activity.banreport.BanReportViewModel;
import java.io.IOException;

/* renamed from: X.7Hy  reason: invalid class name and case insensitive filesystem */
public class C144607Hy implements C1606989o {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BanReportViewModel A01;

    public C144607Hy(BanReportViewModel banReportViewModel, int i) {
        this.A01 = banReportViewModel;
        this.A00 = i;
    }

    public void BE5(C138506xC r24) {
        Object obj;
        C138506xC r0 = r24;
        AnonymousClass161 r1 = r0.A03;
        int i = r0.A00;
        Integer A0h = C17880vN.A0h();
        if (i == 0 && (obj = r1.A00) != null) {
            C127706en r3 = (C127706en) obj;
            String str = r3.A01;
            if ("AVAILABLE".equals(str)) {
                C130406jN r4 = r3.A00;
                if (r4 != null) {
                    BanReportViewModel banReportViewModel = this.A01;
                    banReportViewModel.A06.A0A(new C144767Ip(banReportViewModel, 0), C26551So.A0B, (AnonymousClass1TI) null, (AnonymousClass1TI) null, r4.A03, r4.A04, r4.A02, r4.A06, r4.A01, (String) null, Base64.decode(r4.A05, 2), 2, 1, 10, 2, (long) r4.A00);
                    return;
                }
            } else {
                boolean equals = "PENDING".equals(str);
                BanReportViewModel banReportViewModel2 = this.A01;
                if (equals) {
                    int i2 = this.A00 + 1;
                    C17890vO.A0D().postDelayed(new AnonymousClass7RM((Object) banReportViewModel2, i2, 38), ((long) i2) * 5000);
                    return;
                }
                C125446b5 r02 = banReportViewModel2.A03;
                String str2 = banReportViewModel2.A00;
                AnonymousClass10E r12 = r02.A00.A00;
                AnonymousClass181 A0H = C108965cb.A0H(r12);
                C19830z4 A0c = AnonymousClass3Ma.A0c(r12);
                AnonymousClass00H A14 = C108945cZ.A14(r12);
                AnonymousClass11W r7 = (AnonymousClass11W) r12.ABB.get();
                C18030ve A8r = AnonymousClass10E.A8r(r12);
                C18070vi.A0w(A0H, A0c, A14, r7, A8r);
                new AnonymousClass67Y(A0H, A0c, A8r, r7, A14, str2, C147127Rx.A00(35), C147127Rx.A00(36), 4437862976280045L).CBv(new AnonymousClass7I7(this, 10));
                return;
            }
        }
        this.A01.A02.A0E(A0h);
    }

    public void BrB(IOException iOException) {
        AnonymousClass3MX.A1K(this.A01.A02, 1);
    }

    public void Bsw(Exception exc) {
        AnonymousClass3MX.A1K(this.A01.A02, 1);
    }
}
