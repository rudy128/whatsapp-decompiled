package X;

import android.content.Context;

public class DB9 implements E4K {
    public final int A00;
    public final Object A01;

    public DB9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ Object get() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            return obj;
        }
        Context context = ((CTD) obj).A00;
        C26208Cuj.A01(context);
        return context.getApplicationContext().getCacheDir();
    }
}
