package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.2pM  reason: invalid class name and case insensitive filesystem */
public class C61242pM {
    public final NativeHolder A00;

    public C61242pM(String str) {
        JniBridge.getInstance();
        this.A00 = new C61242pM((NativeHolder) JniBridge.jvidispatchOO(3, str)).A00;
    }

    public C61242pM(NativeHolder nativeHolder) {
        this.A00 = nativeHolder;
    }
}
