package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2pP  reason: invalid class name and case insensitive filesystem */
public class C61272pP {
    public final NativeHolder A00;

    public C61272pP(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public C61272pP(byte[] bArr, byte[] bArr2) {
        JniBridge.getInstance();
        this.A00 = new C61272pP((NativeHolder) JniBridge.jvidispatchOOO(0, bArr, bArr2)).A00;
    }
}
