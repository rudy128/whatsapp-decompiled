package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;

/* renamed from: X.1cb  reason: invalid class name and case insensitive filesystem */
public final class C29631cb {
    public final C18030ve A00;
    public final C200710s A01;

    public C29631cb(C18030ve r3, AnonymousClass10I r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        this.A00 = r3;
        this.A01 = new C200710s(r4, false);
    }

    public static final void A00(Context context) {
        try {
            context.startService(new Intent(context, MessageService.class).setAction("com.whatsapp.messaging.MessageService.START"));
            Log.i("messageservice/startService success");
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT >= 26) {
                e.getMessage();
                return;
            }
            throw e;
        }
    }

    public static final void A01(Context context, C29641cc r3) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                context.startService(new Intent(context, MessageService.class).setAction("com.whatsapp.messaging.MessageService.START"));
                Log.i("messageservice/startOnForeground success");
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("messageservice/startOnForeground failed:");
                sb.append(e.getMessage());
                Log.e(sb.toString());
                Log.i("Scheduling job to restore chat connection");
                r3.A02.CGN(new C146777Qo((Object) r3, 30));
            }
        }
    }

    public static final void A02(C29631cb r3, Runnable runnable) {
        if (C18020vd.A05(C18040vf.A01, r3.A00, 12065)) {
            r3.A01.execute(runnable);
        } else {
            runnable.run();
        }
    }
}
