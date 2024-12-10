package X;

import android.os.Handler;
import java.util.AbstractMap;

public class CXG {
    public boolean A00;
    public boolean A01;
    public final long A02;
    public final Handler A03 = C17890vO.A0D();
    public final CR0 A04;
    public final Runnable A05;
    public final boolean A06;

    public void A00() {
        this.A00 = true;
        this.A03.removeCallbacks(this.A05);
        CR0 cr0 = this.A04;
        DOZ doz = (DOZ) cr0.A03.get();
        if (doz != null) {
            String str = cr0.A02;
            C18070vi.A0b(str);
            ((AbstractMap) doz.A01(2131428185)).remove(str);
        }
    }

    public CXG(CR0 cr0, long j, boolean z) {
        this.A02 = j;
        this.A06 = z;
        this.A00 = false;
        this.A01 = true;
        this.A04 = cr0;
        this.A05 = new C27080DTf((Object) this, 34);
    }
}
