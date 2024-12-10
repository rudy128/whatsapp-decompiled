package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2PP  reason: invalid class name */
public final class AnonymousClass2PP extends A34 {
    public final Context A00;
    public final C23651Hc A01;
    public final C219017v A02;

    public AnonymousClass2PP(Context context, C23651Hc r3, C219017v r4) {
        C18070vi.A0d(context, 1);
        C18070vi.A0d(r4, 3);
        this.A00 = context;
        this.A01 = r3;
        this.A02 = r4;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        boolean z = false;
        try {
            if (this.A01.A07) {
                AtomicBoolean atomicBoolean = C219017v.A1B;
                Log.i("MessageHandler/isCaptiveWifi awaiting captive wifi status");
                C219017v.A1A.await();
                boolean z2 = C219017v.A1B.get();
                C17900vP.A0n("MessageHandler/isCaptiveWifi status is ", AnonymousClass000.A10(), z2);
                if (z2) {
                    z = true;
                }
            }
        } catch (InterruptedException unused) {
        }
        return Boolean.valueOf(z);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        if (AnonymousClass000.A1Y(obj)) {
            Context context = this.A00;
            Intent A0A = C17880vN.A0A();
            A0A.setClassName(context.getPackageName(), "com.whatsapp.messaging.CaptivePortalActivity");
            A0A.setFlags(268435456);
            context.startActivity(A0A);
        }
    }
}
