package X;

import android.graphics.Matrix;

/* renamed from: X.Dad  reason: case insensitive filesystem */
public final class C27251Dad extends ThreadLocal {
    public /* bridge */ /* synthetic */ Object get() {
        Object obj = super.get();
        C18070vi.A0b(obj);
        Matrix matrix = (Matrix) obj;
        matrix.reset();
        return matrix;
    }

    public /* bridge */ /* synthetic */ Object initialValue() {
        return C108945cZ.A0J();
    }
}
