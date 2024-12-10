package X;

import android.os.BaseBundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* renamed from: X.2wM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C65392wM implements Continuation {
    public final /* synthetic */ C19490yI A00;

    public final Object then(Task task) {
        BaseBundle baseBundle = (BaseBundle) task.getResult(IOException.class);
        if (baseBundle != null) {
            String string = baseBundle.getString("registration_id");
            if (string != null || (string = baseBundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = baseBundle.getString("error");
            if ("RST".equals(string2)) {
                throw C17880vN.A0f("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw C17880vN.A0f(string2);
            } else {
                Log.w("FirebaseMessaging", AnonymousClass001.A1E(baseBundle, "Unexpected response: ", AnonymousClass000.A10()), new Throwable());
                throw C17880vN.A0f("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw C17880vN.A0f("SERVICE_NOT_AVAILABLE");
        }
    }

    public /* synthetic */ C65392wM(C19490yI r1) {
        this.A00 = r1;
    }
}
