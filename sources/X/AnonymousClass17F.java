package X;

import android.os.Build;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;

/* renamed from: X.17F  reason: invalid class name */
public class AnonymousClass17F {
    public final AnonymousClass3DR A00;

    public C19760yx A00() {
        KeyPair generateKeyPair;
        boolean z;
        C190189kW r2 = (C190189kW) this.A00.get();
        if (Build.VERSION.SDK_INT < 23 || r2 == null || (generateKeyPair = r2.A00()) == null) {
            ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("secp256r1");
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(eCGenParameterSpec);
            generateKeyPair = instance.generateKeyPair();
            z = false;
        } else {
            z = true;
        }
        return new C19760yx(generateKeyPair, Boolean.valueOf(z));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.3DR, java.lang.Object] */
    public AnonymousClass17F() {
        C21517AlQ alQ = new C21517AlQ(31);
        ? obj = new Object();
        obj.A00 = new C18150vq((Object) null, new DWJ(alQ, 8));
        this.A00 = obj;
    }
}
