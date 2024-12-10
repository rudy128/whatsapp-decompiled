package X;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.4GL  reason: invalid class name */
public abstract class AnonymousClass4GL {
    public static final Intent A00(AnonymousClass4PL r2) {
        C18070vi.A0d(r2, 0);
        Bundle bundle = r2.A05;
        if (bundle != null) {
            return (Intent) bundle.getParcelable("sms_invite_intent", Intent.class);
        }
        return null;
    }
}
