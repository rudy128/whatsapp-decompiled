package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.01S  reason: invalid class name */
public final class AnonymousClass01S extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass01C this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass01S(AnonymousClass01C r2) {
        super(0);
        this.this$0 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass01C r2) {
        /*
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.AnonymousClass01S.super.onBackPressed()     // Catch:{ IllegalStateException -> 0x0008, NullPointerException -> 0x0010 }
            return
        L_0x0008:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "Can not perform this action after onSaveInstanceState"
            goto L_0x0017
        L_0x0010:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference"
        L_0x0017:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x001e
            throw r2
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01S.A00(X.01C):void");
    }

    public static final void A02(AnonymousClass01C r1, AnonymousClass02V r2) {
        C18070vi.A0d(r1, 0);
        C18070vi.A0d(r2, 1);
        r1.A0H(r2);
    }

    /* renamed from: A04 */
    public final AnonymousClass02V invoke() {
        AnonymousClass02V r3 = new AnonymousClass02V(new AnonymousClass02U(this.this$0));
        AnonymousClass01C r2 = this.this$0;
        if (Build.VERSION.SDK_INT >= 33) {
            if (!C18070vi.A18(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new AnonymousClass0ZD(r2, r3));
            } else {
                r2.A0H(r3);
                return r3;
            }
        }
        return r3;
    }
}
