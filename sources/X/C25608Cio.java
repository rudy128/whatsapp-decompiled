package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.common.jniexecutors.PooledNativeRunnable;
import java.lang.reflect.Array;

/* renamed from: X.Cio  reason: case insensitive filesystem */
public class C25608Cio {
    public int A00;
    public long A01;
    public Object[] A02;
    public final int A03 = Math.max(16, 1);
    public final int A04;
    public final int A05;
    public final E7V A06;
    public final C24547C8s A07;

    public C25608Cio(C24547C8s c8s, E7V e7v) {
        int max = Math.max(16, 0);
        this.A05 = max;
        this.A04 = Math.max(max, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        this.A07 = c8s;
        this.A06 = e7v;
        this.A02 = (Object[]) Array.newInstance(PooledNativeRunnable.class, max);
    }

    public static void A00(C25608Cio cio, int i) {
        Object[] objArr = (Object[]) Array.newInstance(PooledNativeRunnable.class, i);
        Object[] objArr2 = cio.A02;
        System.arraycopy(objArr2, 0, objArr, 0, Math.min(objArr2.length, i));
        cio.A02 = objArr;
        cio.A00 = Math.min(cio.A00, i);
    }
}
