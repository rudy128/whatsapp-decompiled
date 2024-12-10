package X;

import android.app.Activity;
import com.whatsapp.util.Log;
import java.lang.ref.Reference;

/* renamed from: X.7ON  reason: invalid class name */
public class AnonymousClass7ON implements C1603488c {
    public final int A00;
    public final Object A01;

    public AnonymousClass7ON(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BpJ(AnonymousClass6U4 r4) {
        StringBuilder A10;
        Exception exc;
        AnonymousClass1FU r2;
        switch (this.A00) {
            case 0:
                if (r4.equals(AnonymousClass6N8.A00)) {
                    AnonymousClass3MW.A1U(this.A01);
                    return;
                }
                String A1E = AnonymousClass001.A1E(r4, "AuthenticityActivity - Bloks fails to load with: ", AnonymousClass000.A10());
                if (r4 instanceof AnonymousClass6N5) {
                    A10 = AnonymousClass000.A10();
                    A10.append("AuthenticityActivity - Bloks fails to load with BloksLayoutDataError exception: ");
                    exc = ((AnonymousClass6N5) r4).A00.A02;
                } else if (r4 instanceof AnonymousClass6N6) {
                    A10 = AnonymousClass000.A10();
                    A10.append("AuthenticityActivity - Bloks fails to load with unknown error: ");
                    exc = ((AnonymousClass6N6) r4).A00;
                } else {
                    if (r4 instanceof AnonymousClass6N7) {
                        A1E = "AuthenticityActivity - Bloks fails to load with ActivityNoLongerActiveError";
                    }
                    Log.e(A1E);
                    return;
                }
                A1E = C17890vO.A0V(exc, A10);
                Log.e(A1E);
                return;
            case 1:
                AnonymousClass01E r22 = (AnonymousClass01E) ((Reference) this.A01).get();
                if (r22 == null || r22.isDestroyed() || r22.isFinishing()) {
                    r22 = null;
                }
                if ((r22 instanceof AnonymousClass1FU) && (r2 = (AnonymousClass1FU) r22) != null) {
                    r2.CEx();
                    return;
                }
                return;
            default:
                Log.i("BloksCDSBottomSheetActivity - Completed async action");
                Activity activity = (Activity) this.A01;
                activity.runOnUiThread(new AnonymousClass7RN(r4, activity, 25));
                return;
        }
    }
}
