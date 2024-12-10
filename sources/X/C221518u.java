package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.18u  reason: invalid class name and case insensitive filesystem */
public class C221518u extends C221418t implements C221318s {
    public final Context A00;

    public /* bridge */ /* synthetic */ C220518k BKQ() {
        C220518k BSz = this.A00.BSz();
        BSz.A00.add(this.A00);
        BSz.A01.add(this);
        return BSz;
    }

    public void BKt(Object obj) {
        C220518k r3 = (C220518k) obj;
        r3.A00();
        List list = r3.A00;
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
            return;
        }
        throw new IllegalStateException();
    }

    public C221518u(Context context, AnonymousClass114 r2) {
        super(r2);
        this.A00 = context;
    }

    public Context BSy() {
        return this.A00;
    }
}
