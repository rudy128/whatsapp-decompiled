package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.ALj  reason: case insensitive filesystem */
public class C20446ALj implements C72033Kj {
    public final int A00;
    public final Object A01;

    public C20446ALj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bom() {
        AnonymousClass990 r1;
        boolean z;
        switch (this.A00) {
            case 0:
                Activity activity = (Activity) this.A01;
                activity.setResult(0);
                Intent A0A = C17880vN.A0A();
                A0A.putExtra("get_collection_error_code", 404);
                activity.setIntent(A0A);
                activity.finish();
                return;
            case 3:
                AnonymousClass1FU r2 = (AnonymousClass1FU) this.A01;
                r2.A3q(AnonymousClass1LU.A00(r2), true);
                return;
            case 4:
                Context context = (Context) this.A01;
                context.startActivity(AnonymousClass1LU.A00(context));
                return;
            case 5:
                r1 = (AnonymousClass990) this.A01;
                z = true;
                break;
            case 6:
                AnonymousClass3MW.A1U(this.A01);
                return;
            case 7:
                r1 = (AnonymousClass990) this.A01;
                z = false;
                break;
            default:
                ((C20039A4i) this.A01).A02();
                return;
        }
        r1.A4d(z);
    }
}
