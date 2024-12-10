package X;

import com.whatsapp.funstickers.report.bloks.WaBkFunReportInterpreterExtImpl$onReportSubmitted$1;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.5vN  reason: invalid class name and case insensitive filesystem */
public class C115565vN extends C65802x8 {
    public C128496g7 A00;

    public /* bridge */ /* synthetic */ Object BKe(C199029zJ r7, C25681CkC ckC, String str) {
        if (str.equals("wa.action.genai.stickers.ReportSubmitted")) {
            List list = r7.A00;
            String A0w = C17880vN.A0w(list, 0);
            String A0w2 = C17880vN.A0w(list, 1);
            C128496g7 r2 = this.A00;
            Log.i("WaBkFunReportInterpreterExtImpl/onReportSubmitted");
            if (!(A0w == null || A0w2 == null)) {
                AnonymousClass3MX.A1Q(new WaBkFunReportInterpreterExtImpl$onReportSubmitted$1(r2, A0w, A0w2, (C30391dr) null), r2.A01);
            }
        }
        return null;
    }
}
