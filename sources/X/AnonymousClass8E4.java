package X;

import android.graphics.Bitmap;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.8E4  reason: invalid class name */
public class AnonymousClass8E4 extends C002100z {
    public final /* synthetic */ A5O A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8E4(A5O a5o, int i) {
        super(i);
        this.A00 = a5o;
    }

    public /* bridge */ /* synthetic */ int A03(Object obj) {
        return ((Bitmap) obj).getByteCount() / EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
    }

    public /* bridge */ /* synthetic */ void A09(boolean z, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Bitmap bitmap = (Bitmap) obj2;
        A5O a5o = this.A00;
        Bitmap bitmap2 = A5O.A07;
        synchronized (a5o.A02) {
            if (z) {
                if (a5o.A00) {
                    a5o.A03.A01(bitmap.getWidth(), bitmap.getHeight(), str);
                }
            }
        }
    }
}
