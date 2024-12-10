package X;

import android.content.DialogInterface;

/* renamed from: X.74w  reason: invalid class name and case insensitive filesystem */
public class C1412474w implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C1412474w(AnonymousClass75M r1, int i, int i2) {
        this.A00 = i2;
        this.A02 = r1;
        this.A01 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 != 0) {
            AnonymousClass75M r4 = (AnonymousClass75M) this.A02;
            int i2 = this.A01;
            AnonymousClass4Yv.A00(r4.A0P, i2);
            C19830z4 r0 = r4.A1A;
            if (i2 == 3) {
                r0.A24(false);
                AnonymousClass75M.A0F(r4, true);
                return;
            }
            C17880vN.A1F(C19830z4.A00(r0), "nearby_location_new_user", false);
            Runnable runnable = r4.A0Y;
            C17960vV.A07(runnable);
            runnable.run();
            return;
        }
        AnonymousClass75M r2 = (AnonymousClass75M) this.A02;
        AnonymousClass4Yv.A00(r2.A0P, this.A01);
        if (r2.A0X == AnonymousClass00R.A0N) {
            AnonymousClass75M.A07(r2);
        }
    }
}
