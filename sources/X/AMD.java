package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.AlarmService;
import com.whatsapp.util.Log;

public final class AMD implements AnonymousClass191 {
    public final Context A00;
    public final C25081Mu A01;

    public AMD(Context context, C25081Mu r3) {
        C18070vi.A0d(r3, 2);
        this.A00 = context;
        this.A01 = r3;
    }

    public /* synthetic */ void Blg() {
    }

    public void Blf() {
        Context context = this.A00;
        Class<AlarmService> cls = AlarmService.class;
        try {
            this.A01.A01(context, new Intent("com.whatsapp.action.SETUP", (Uri) null, context, cls), cls, 3);
        } catch (IllegalArgumentException e) {
            Log.e("AlarmService/start-failed-with-exception", e);
        }
    }

    public void Ba9() {
    }
}
