package X;

import android.content.ContentResolver;
import android.graphics.Rect;
import java.util.concurrent.Executor;

/* renamed from: X.BSn  reason: case insensitive filesystem */
public class C22859BSn extends DDG implements ECv {
    public static final Rect A01 = new Rect(0, 0, 96, 96);
    public static final Rect A02 = new Rect(0, 0, 512, 384);
    public final ContentResolver A00;

    public C22859BSn(ContentResolver contentResolver, C25052CVg cVg, Executor executor) {
        super(cVg, executor);
        this.A00 = contentResolver;
    }
}
