package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2pN  reason: invalid class name and case insensitive filesystem */
public class C61252pN {
    public final NativeHolder A00;

    public C61252pN(byte[] bArr) {
        JniBridge.getInstance();
        this.A00 = new C61252pN((NativeHolder) JniBridge.jvidispatchOO(5, bArr)).A00;
    }

    public C61252pN(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }
}
