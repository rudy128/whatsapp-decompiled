package X;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6M1  reason: invalid class name */
public class AnonymousClass6M1 extends A34 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Context A03;
    public final AnonymousClass1V7 A04;
    public final C27191Vc A05;
    public final List A06;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            AnonymousClass1E7 A0O = C17880vN.A0O(it);
            Context context = this.A03;
            if (context != null) {
                if (this.A05.A04(context, A0O, "CallNotificationBuilder.doInBackground", (float) this.A00, this.A01, true) == null) {
                }
            }
            return false;
        }
        return AnonymousClass000.A0i();
    }

    public AnonymousClass6M1(Context context, AnonymousClass1V7 r2, C27191Vc r3, List list, int i, int i2, int i3) {
        this.A03 = context;
        this.A06 = list;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A04 = r2;
        C17960vV.A07(r3);
        this.A05 = r3;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        if (AnonymousClass000.A1Y(obj)) {
            Bundle A0D = C17880vN.A0D();
            A0D.putInt("notification_type", this.A02);
            this.A04.A00(new A69("refresh_notification", A0D));
        }
    }
}
