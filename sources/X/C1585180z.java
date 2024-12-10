package X;

import android.content.Intent;
import com.whatsapp.contentprovider.MediaProvider;
import com.whatsapp.report.ReportActivity;

/* renamed from: X.80z  reason: invalid class name and case insensitive filesystem */
public final class C1585180z extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ReportActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1585180z(ReportActivity reportActivity) {
        super(1);
        this.this$0 = reportActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C18070vi.A0d(str, 0);
        ReportActivity reportActivity = this.this$0;
        Intent A0G = C108945cZ.A0G("android.intent.action.SEND");
        A0G.setType("application/zip");
        C109005cf.A0L(reportActivity, A0G, MediaProvider.A05("business_activity_report", str));
        return C27621Wu.A00;
    }
}
