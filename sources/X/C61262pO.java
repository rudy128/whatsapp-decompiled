package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2pO  reason: invalid class name and case insensitive filesystem */
public class C61262pO {
    public final NativeHolder A00;

    public C61262pO(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public C61262pO(byte[] bArr, long j) {
        JniBridge.getInstance();
        this.A00 = new C61262pO((NativeHolder) JniBridge.jvidispatchOIO(20, j, bArr)).A00;
    }
}
