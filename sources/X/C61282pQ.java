package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2pQ  reason: invalid class name and case insensitive filesystem */
public class C61282pQ {
    public final NativeHolder A00;

    public C61282pQ(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public C61282pQ(byte[] bArr, long j) {
        JniBridge.getInstance();
        this.A00 = new C61282pQ((NativeHolder) JniBridge.jvidispatchOIO(19, j, bArr)).A00;
    }
}
