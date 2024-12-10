package X;

import android.content.Context;
import android.os.Looper;

/* renamed from: X.BZo  reason: case insensitive filesystem */
public final class C23013BZo extends C23023BZz {
    public final DI3 A00;

    public final int BUx() {
        return 12800000;
    }

    public C23013BZo(Context context, Looper looper, DI3 di3, EDW edw, EDX edx, CTL ctl) {
        super(context, looper, edw, edx, ctl, 68);
        Boolean valueOf = Boolean.valueOf((di3 == null ? DI3.A02 : di3).A00);
        byte[] bArr = new byte[16];
        CF2.A00.nextBytes(bArr);
        this.A00 = new DI3(AnonymousClass8BT.A0x(bArr), valueOf);
    }
}
