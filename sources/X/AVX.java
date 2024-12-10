package X;

import com.whatsapp.util.Log;
import java.io.File;

public class AVX implements BC9 {
    public final /* synthetic */ A5B A00;
    public final /* synthetic */ C189659jb A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ void BsA(long j) {
    }

    public AVX(A5B a5b, C189659jb r2, String str) {
        this.A00 = a5b;
        this.A02 = str;
        this.A01 = r2;
    }

    public void BsC(boolean z) {
        C17900vP.A0n("dyiReportManager/download-report/on-download-canceled transferred -> ", AnonymousClass000.A10(), z);
        if (!z) {
            A5B a5b = this.A00;
            C218617r r0 = a5b.A02;
            String str = this.A02;
            File A0S = r0.A0S(str);
            if (A0S.exists() && !A0S.delete()) {
                Log.e("dyiReportManager/reset/failed-delete-report-file");
            }
            a5b.A07.A0F(2, str);
        }
    }

    public void BsD(C1409173o r5, C136996uk r6) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("dyiReportManager/download-report/on-download-canceled success -> ");
        boolean A03 = r5.A03();
        C17900vP.A0r(A10, A03);
        if (A03) {
            A5B a5b = this.A00;
            String str = this.A02;
            synchronized (a5b) {
                a5b.A07.A0F(4, str);
            }
            C189659jb r1 = this.A01;
            Log.i("DyiViewModel/download-report/on-success");
            AnonymousClass96M r0 = r1.A00;
            AnonymousClass3MX.A1K(r0.A02, r0.A06.A02(r0.A08));
            return;
        }
        this.A01.A00();
        this.A00.A07.A0F(2, this.A02);
    }
}
