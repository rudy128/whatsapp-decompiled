package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.19L  reason: invalid class name */
public final class AnonymousClass19L implements C18140vp {
    public final Context A00;
    public final C18030ve A01;

    public /* bridge */ /* synthetic */ Object get() {
        A7W A002 = A7W.A00(this.A00);
        C18070vi.A0X(A002);
        if (C18020vd.A05(C18040vf.A02, this.A01, 9591)) {
            StringBuilder sb = new StringBuilder();
            sb.append("work-manager-log/registering logger, current is ");
            sb.append(A5Z.A00());
            Log.i(sb.toString());
            AnonymousClass297 r0 = new AnonymousClass297();
            synchronized (A5Z.A00) {
                A5Z.A01 = r0;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("work-manager-log/logger registered ");
            sb2.append(A5Z.A00());
            Log.i(sb2.toString());
        }
        return A002;
    }

    public AnonymousClass19L(Context context, C18030ve r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
