package X;

import android.os.Bundle;

public final class BYQ extends C25264Cc5 {
    public final void A00(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            A02((Object) null);
        } else {
            A01(new C1U("Invalid response to one way request", (Throwable) null));
        }
    }
}
