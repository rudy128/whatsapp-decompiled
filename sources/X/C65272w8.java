package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.facebook.msys.mci.DefaultUUID;
import com.facebook.msys.util.Provider;

/* renamed from: X.2w8  reason: invalid class name and case insensitive filesystem */
public class C65272w8 implements Provider {
    public final int A00;
    public final Object A01;

    public C65272w8(AnonymousClass1DA r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ Object get() {
        if (this.A00 != 0) {
            return DefaultUUID.mUUID;
        }
        return DefaultCrypto.mCrypto;
    }
}
