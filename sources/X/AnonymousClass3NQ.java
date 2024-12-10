package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import java.lang.ref.SoftReference;

/* renamed from: X.3NQ  reason: invalid class name */
public final class AnonymousClass3NQ extends Handler {
    public void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj != null) {
            Pair pair = (Pair) obj;
            Number number = (Number) pair.first;
            long longValue = number.longValue();
            Object obj2 = pair.second;
            if (obj2 instanceof Drawable) {
                AnonymousClass4aN.A0Z.put(number, new SoftReference(obj2));
                return;
            }
            AnonymousClass3O9 r4 = (AnonymousClass3O9) obj2;
            Drawable drawable = (Drawable) r4.getTag();
            AnonymousClass4aN.A0Z.put(Long.valueOf(longValue), new SoftReference(drawable));
            if (r4.A00 == longValue) {
                r4.A01 = drawable;
                r4.invalidate();
            }
        }
    }
}
