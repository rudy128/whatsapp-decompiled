package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

/* renamed from: X.3NS  reason: invalid class name */
public final class AnonymousClass3NS extends Handler {
    public final Context A00;
    public final AnonymousClass1KW A01;

    public void handleMessage(Message message) {
        AnonymousClass3O9 r5;
        long j;
        C43271zX r8;
        Message obtain;
        C85394Nf r0 = (C85394Nf) message.obj;
        if (r0 != null) {
            r5 = r0.A01;
            r8 = r0.A02;
            j = r0.A00;
        } else {
            r5 = null;
            j = -1;
            r8 = null;
        }
        AnonymousClass1KW r6 = this.A01;
        Resources resources = this.A00.getResources();
        C17960vV.A07(r8);
        Drawable A08 = r6.A08(resources, r8, 0.6f, j);
        if (r5 != null) {
            r5.setTag(A08);
            obtain = Message.obtain(AnonymousClass4aN.A0V, 0, 0, 0, new Pair(Long.valueOf(j), r5));
        } else {
            obtain = Message.obtain(AnonymousClass4aN.A0V, 1, 0, 0, new Pair(Long.valueOf(j), A08));
        }
        obtain.sendToTarget();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3NS(Context context, Looper looper, AnonymousClass1KW r4) {
        super(looper);
        C17960vV.A07(looper);
        this.A00 = context.getApplicationContext();
        this.A01 = r4;
    }
}
