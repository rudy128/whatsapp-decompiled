package X;

import android.view.Window;
import com.facebook.msys.mci.DefaultCrypto;

public class BJq extends BJr {
    public void A04(boolean z) {
        if (z) {
            Window window = this.A00;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            A06(DefaultCrypto.BUFFER_SIZE);
            return;
        }
        A07(DefaultCrypto.BUFFER_SIZE);
    }

    public boolean A05() {
        return AnonymousClass000.A1O(this.A00.getDecorView().getSystemUiVisibility() & DefaultCrypto.BUFFER_SIZE);
    }

    public BJq(Window window, C25474CgT cgT) {
        super(window, cgT);
    }
}
