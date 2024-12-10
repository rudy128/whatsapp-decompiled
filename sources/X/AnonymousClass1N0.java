package X;

import android.graphics.Bitmap;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.1N0  reason: invalid class name */
public class AnonymousClass1N0 extends C002100z {
    public C32081gb A00;
    public final /* synthetic */ C25131Mz A01;

    public void A09(boolean z, Object obj, Object obj2, Object obj3) {
        C32081gb r0;
        synchronized (this) {
            r0 = this.A00;
        }
        if (r0 != null) {
            r0.Bsh(z, obj, obj2, obj3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1N0(C25131Mz r1, int i) {
        super(i);
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ int A03(Object obj) {
        C25131Mz r0 = this.A01;
        Object obj2 = ((C43001z5) obj).A01;
        if (r0 instanceof C32071ga) {
            return ((Bitmap) obj2).getByteCount() / EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        }
        return 1;
    }
}
