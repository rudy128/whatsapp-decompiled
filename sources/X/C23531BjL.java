package X;

import android.os.Parcel;

/* renamed from: X.BjL  reason: case insensitive filesystem */
public abstract class C23531BjL extends C22606BFm implements ECN {
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            e(C22606BFm.A00(parcel));
            return true;
        } else if (i == 3) {
            c(C22606BFm.A00(parcel));
            return true;
        } else if (i == 4) {
            d(C22606BFm.A00(parcel));
            return true;
        } else if (i != 5) {
            return false;
        } else {
            b(C22606BFm.A00(parcel));
            return true;
        }
    }

    public C23531BjL() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }
}
