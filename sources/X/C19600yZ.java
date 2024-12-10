package X;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: X.0yZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C19600yZ implements OnSuccessListener {
    public final /* synthetic */ FirebaseMessaging A00;

    public final void onSuccess(Object obj) {
        boolean z;
        C19690yl r3 = (C19690yl) obj;
        if (this.A00.A06.A00() && r3.A03.A00() != null) {
            synchronized (r3) {
                z = r3.A00;
            }
            if (!z) {
                r3.A02(0);
            }
        }
    }

    public /* synthetic */ C19600yZ(FirebaseMessaging firebaseMessaging) {
        this.A00 = firebaseMessaging;
    }
}
