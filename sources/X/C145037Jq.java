package X;

import android.content.Context;
import com.whatsapp.migration.export.service.MessagesExporterService;
import com.whatsapp.util.Log;

/* renamed from: X.7Jq  reason: invalid class name and case insensitive filesystem */
public class C145037Jq implements C22561BCu {
    public final /* synthetic */ MessagesExporterService A00;

    public C145037Jq(MessagesExporterService messagesExporterService) {
        this.A00 = messagesExporterService;
    }

    public void Bno() {
        MessagesExporterService messagesExporterService = this.A00;
        C1403771e r4 = messagesExporterService.A01;
        Log.i("MessagesExporterNotificationManager/onCancellationComplete()");
        C1403771e.A01(r4, AnonymousClass3MW.A05(r4.A00).getString(2131890241), (String) null, -1, true);
        Log.i("xpm-export-service-onCancellationCompleted/sent export cancellation complete logging");
        messagesExporterService.stopSelf();
    }

    public void Bnp() {
        C1403771e r4 = this.A00.A01;
        Log.i("MessagesExporterNotificationManager/onCancelling()");
        C1403771e.A01(r4, AnonymousClass3MW.A05(r4.A00).getString(2131890240), (String) null, -1, false);
    }

    public void Btc() {
        Log.i("xpm-export-service-onComplete/success");
        C1403771e r4 = this.A00.A01;
        Log.i("MessagesExporterNotificationManager/onComplete()");
        C1403771e.A01(r4, AnonymousClass3MW.A05(r4.A00).getString(2131890242), (String) null, -1, true);
        Log.i("xpm-export-service-onComplete/sent export complete logging");
    }

    public void Bte() {
        this.A00.A01.A02(0);
    }

    public void Btd(int i) {
        C17900vP.A0j("xpm-export-service-onProgress; progress=", AnonymousClass000.A10(), i);
        this.A00.A01.A02(i);
    }

    public void onError(int i) {
        C17900vP.A0j("xpm-export-service-onError/errorCode = ", AnonymousClass000.A10(), i);
        C1403771e r4 = this.A00.A01;
        Context context = r4.A00.A00;
        C1403771e.A01(r4, context.getResources().getString(2131890243), context.getResources().getString(2131890244), -1, true);
    }
}
