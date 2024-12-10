package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6ze  reason: invalid class name and case insensitive filesystem */
public class C139916ze {
    public final Map A00 = C17880vN.A11();
    public final Set A01 = C17880vN.A12();
    public final Handler A02 = C17890vO.A0D();

    public void A01(AnonymousClass6Fx r4) {
        synchronized (this) {
            Class<?> cls = r4.getClass();
            C17900vP.A0Y(cls, "FgServiceManager register:", AnonymousClass000.A10());
            this.A00.put(cls, r4);
        }
        A00();
    }

    private void A00() {
        this.A02.post(new C146777Qo((Object) this, 28));
    }

    public boolean A02(Context context, Intent intent, Class cls) {
        C17900vP.A0Y(cls, "FgServiceManager/startService ", AnonymousClass000.A10());
        intent.setClass(context, cls);
        if (Build.VERSION.SDK_INT >= 26) {
            synchronized (this) {
                this.A01.remove(cls);
            }
        }
        return C25081Mu.A00(context, intent);
    }

    public boolean A03(Context context, Class cls) {
        boolean A1W;
        C17900vP.A0Y(cls, "FgServiceManager/stopService ", AnonymousClass000.A10());
        if (Build.VERSION.SDK_INT < 26) {
            return context.stopService(new Intent(context, cls));
        }
        synchronized (this) {
            A1W = AnonymousClass000.A1W(this.A00.get(cls));
            this.A01.add(cls);
        }
        A00();
        return A1W;
    }
}
