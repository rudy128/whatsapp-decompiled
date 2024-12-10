package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.1Mu  reason: invalid class name and case insensitive filesystem */
public class C25081Mu {
    public final AnonymousClass12L A00;
    public final C200710s A01;

    public static boolean A00(Context context, Intent intent) {
        try {
            C19740yt.A09(context, intent);
            return true;
        } catch (IllegalStateException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to start foreground service ");
            sb.append(intent.getComponent());
            Log.w(sb.toString(), e);
            return false;
        }
    }

    public void A01(Context context, Intent intent, Class cls, int i) {
        C146607Px r3 = new C146607Px(cls, context, intent, i, 8);
        if (C22781De.A03()) {
            if (C18020vd.A05(C18040vf.A01, this.A00.A00, 12065)) {
                this.A01.execute(r3);
                return;
            }
        }
        r3.run();
    }

    public C25081Mu(AnonymousClass12L r3, AnonymousClass10I r4) {
        this.A00 = r3;
        this.A01 = new C200710s(r4, true);
    }
}
