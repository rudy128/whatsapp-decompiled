package X;

import android.content.Context;
import android.content.IntentFilter;
import com.whatsapp.util.Log;
import java.util.Iterator;

public final class AMF implements AnonymousClass191 {
    public final AnonymousClass00H A00;
    public final Context A01;
    public final C29831cw A02;
    public final C161108Bt A03 = new C161108Bt(this);

    public /* synthetic */ void Blg() {
    }

    public AMF(Context context, C29831cw r3, AnonymousClass00H r4) {
        C18070vi.A0k(r3, r4);
        this.A01 = context;
        this.A02 = r3;
        this.A00 = r4;
    }

    public void Ba9() {
    }

    public void Blf() {
        if (!AnonymousClass112.A02()) {
            Log.w("BackgroundRestrictionManager; init on unsupported OS version.");
            return;
        }
        this.A02.A01(this.A01, this.A03, new IntentFilter("android.net.conn.RESTRICT_BACKGROUND_CHANGED"), true);
        Iterator A0m = AnonymousClass8BX.A0m(this.A00);
        while (A0m.hasNext()) {
            AQ7 aq7 = (AQ7) A0m.next();
            C21446AkD.A00(aq7.A02, aq7, 39);
        }
    }
}
