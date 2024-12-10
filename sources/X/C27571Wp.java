package X;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.1Wp  reason: invalid class name and case insensitive filesystem */
public class C27571Wp extends Fragment {
    private final void A00(C27581Wq r3) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            C18070vi.A0X(activity);
            C27541Wm.A01(activity, r3);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        A00(C27581Wq.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        A00(C27581Wq.ON_DESTROY);
    }

    public void onPause() {
        super.onPause();
        A00(C27581Wq.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        A00(C27581Wq.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        A00(C27581Wq.ON_START);
    }

    public void onStop() {
        super.onStop();
        A00(C27581Wq.ON_STOP);
    }
}
