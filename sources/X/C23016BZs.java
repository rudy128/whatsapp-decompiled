package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: X.BZs  reason: case insensitive filesystem */
public final class C23016BZs extends C23023BZz {
    public final Bundle A00;

    public final int BUx() {
        return 12451000;
    }

    public C23016BZs(Context context, Looper looper, DI1 di1, C28566E7w e7w, E5C e5c, CTL ctl) {
        super(context, looper, e7w, e5c, ctl, 16);
        Bundle bundle;
        if (di1 == null) {
            bundle = C17880vN.A0D();
        } else {
            bundle = new Bundle(di1.A00);
        }
        this.A00 = bundle;
    }

    public final boolean CFe() {
        CTL ctl = this.A00;
        if (!TextUtils.isEmpty((CharSequence) null)) {
            ctl.A04.get(C24731CHt.A02);
            if (ctl.A05.isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
