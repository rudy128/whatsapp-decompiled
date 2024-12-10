package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.4kO  reason: invalid class name and case insensitive filesystem */
public class C94294kO implements C72093Kp {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C94294kO(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final void CC1() {
        if (this.A00 != 0) {
            Context context = (Context) this.A01;
            Intent intent = (Intent) this.A02;
            try {
                context.startActivity(intent, (Bundle) this.A03);
            } catch (IllegalArgumentException unused) {
                context.startActivity(intent, (Bundle) null);
            }
        } else {
            ((C75423hT) this.A01).A01.startActivity((Intent) this.A02, (Bundle) this.A03);
        }
    }
}
