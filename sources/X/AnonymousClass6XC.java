package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

/* renamed from: X.6XC  reason: invalid class name */
public abstract class AnonymousClass6XC {
    public static final C135416sA A00(Fragment fragment) {
        C1418177b r4;
        Bundle A15 = fragment.A15();
        Parcelable parcelable = A15.getParcelable("argPrompt");
        if (parcelable instanceof C1418177b) {
            r4 = (C1418177b) parcelable;
        } else {
            r4 = null;
        }
        int i = A15.getInt("argDisclosureId", -1);
        int i2 = A15.getInt("argPromptIndex", -1);
        if (r4 == null || i == -1 || i2 == -1) {
            return null;
        }
        return new C135416sA(r4, i, i2);
    }
}
