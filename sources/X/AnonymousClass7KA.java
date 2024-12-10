package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.7KA  reason: invalid class name */
public final class AnonymousClass7KA implements AnonymousClass89E {
    public final String A00;
    public final /* synthetic */ C132806nc A01;

    public /* synthetic */ void Bt7(Integer num) {
    }

    public AnonymousClass7KA(C132806nc r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public void C7X(byte[] bArr) {
        ImageView imageView;
        Bitmap A0E;
        C132806nc r2 = this.A01;
        Map map = r2.A03;
        synchronized (map) {
            String str = this.A00;
            WeakReference weakReference = (WeakReference) map.get(str);
            if (!(weakReference == null || (imageView = (ImageView) weakReference.get()) == null || !C18070vi.A18(imageView.getTag(-1641051461), str) || (A0E = C72473Md.A0E(bArr)) == null)) {
                r2.A00.A00(new C21458AkP(imageView, A0E, 15));
            }
        }
    }
}
