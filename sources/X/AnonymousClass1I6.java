package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.1I6  reason: invalid class name */
public final class AnonymousClass1I6 {
    public final Context A00;
    public final AnonymousClass12L A01;
    public final C18100vl A02 = new C18110vm(AnonymousClass1I7.A00);

    public AnonymousClass1I6(Context context, AnonymousClass12L r4) {
        C18070vi.A0d(r4, 2);
        this.A00 = context;
        this.A01 = r4;
    }

    public final boolean A00(String str) {
        if (!C18020vd.A05(C18040vf.A01, this.A01.A00, 11447)) {
            return this.A00.getPackageManager().hasSystemFeature(str);
        }
        C18100vl r3 = this.A02;
        if (((Map) r3.getValue()).containsKey(str)) {
            Boolean bool = (Boolean) ((Map) r3.getValue()).get(str);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        boolean hasSystemFeature = this.A00.getPackageManager().hasSystemFeature(str);
        ((Map) r3.getValue()).put(str, Boolean.valueOf(hasSystemFeature));
        return hasSystemFeature;
    }
}
