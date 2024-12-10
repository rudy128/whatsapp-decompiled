package X;

import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.IOException;

public class DBK implements E4M {
    public final int A00;

    public DBK(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ void CEE(Object obj) {
        Bitmap bitmap;
        switch (this.A00) {
            case 0:
                try {
                    C26075Crp.A00((Closeable) obj);
                    return;
                } catch (IOException unused) {
                    return;
                }
            case 1:
                bitmap = (Bitmap) obj;
                C18070vi.A0d(bitmap, 0);
                break;
            case 4:
                return;
            default:
                bitmap = (Bitmap) obj;
                break;
        }
        bitmap.recycle();
    }
}
