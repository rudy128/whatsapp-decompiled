package X;

import com.whatsapp.util.Log;
import java.util.Locale;

public class DR3 implements AnonymousClass88Q {
    public final int A00;
    public final Object A01;

    public DR3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BtC(String str, String str2, boolean z) {
        String str3;
        if (this.A00 != 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("InlineVideoPlaybackImplHandler/onPlaybackError=");
            A10.append(str);
            Log.e(C17900vP.A0D(" isTransient=", A10, z));
            DR0.A01((DR0) this.A01);
            return;
        }
        C24149BwF bwF = (C24149BwF) this.A01;
        if (z) {
            str3 = "_transient";
        } else {
            str3 = "_not_transient";
        }
        bwF.A0r.A01 = AnonymousClass001.A1H(str2.toLowerCase(Locale.ROOT), str3, AnonymousClass000.A10());
    }
}
