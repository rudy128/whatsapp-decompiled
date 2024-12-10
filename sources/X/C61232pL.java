package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2pL  reason: invalid class name and case insensitive filesystem */
public class C61232pL {
    public final NativeHolder A00;

    public C61232pL(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }

    public C61232pL(String str, String str2, int i) {
        JniBridge.getInstance();
        this.A00 = new C61232pL((NativeHolder) JniBridge.jvidispatchOIOO(0, (long) i, str, str2)).A00;
    }
}
