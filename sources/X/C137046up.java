package X;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;

/* renamed from: X.6up  reason: invalid class name and case insensitive filesystem */
public abstract class C137046up {
    public static RemoteInput A00(C129536hx r3) {
        RemoteInput.Builder addExtras = new RemoteInput.Builder(r3.A02).setLabel(r3.A01).setChoices(r3.A04).setAllowFreeFormInput(true).addExtras(r3.A00);
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator it = r3.A03.iterator();
            while (it.hasNext()) {
                AnonymousClass6VB.A00(addExtras, C17880vN.A0v(it));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            AnonymousClass6VC.A00(addExtras);
        }
        return addExtras.build();
    }

    public static Bundle A01(Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }
}
