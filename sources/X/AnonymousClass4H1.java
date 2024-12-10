package X;

import android.os.Bundle;
import com.whatsapp.lists.ListsManagerFragment;

/* renamed from: X.4H1  reason: invalid class name */
public abstract class AnonymousClass4H1 {
    public static final ListsManagerFragment A00(Integer num, boolean z) {
        ListsManagerFragment listsManagerFragment = new ListsManagerFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("arg_skip_contacts", z);
        C72463Mc.A10(A0D, num);
        listsManagerFragment.A1R(A0D);
        return listsManagerFragment;
    }
}
