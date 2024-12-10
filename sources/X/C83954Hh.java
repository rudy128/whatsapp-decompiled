package X;

import android.app.Activity;
import android.content.res.Resources;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.4Hh  reason: invalid class name and case insensitive filesystem */
public abstract class C83954Hh {
    public static final C010105w A00(Activity activity, AnonymousClass1KB r14, C33251iW r15, AnonymousClass1KW r16, C126466cm r17, Set set) {
        Set set2 = set;
        if (set2.isEmpty()) {
            Log.e("dialog/delete no statuses");
            return null;
        }
        Activity activity2 = activity;
        Resources resources = activity.getResources();
        int size = set2.size();
        Object[] objArr = new Object[1];
        C17880vN.A1T(objArr, set2.size(), 0);
        String quantityString = resources.getQuantityString(2131755088, size, objArr);
        C18070vi.A0X(quantityString);
        Resources resources2 = activity.getResources();
        C73203Rj A00 = AnonymousClass4a6.A00(activity);
        A00.A0T(true);
        A00.A0S(C43251zV.A05(activity, r16, quantityString));
        A00.setPositiveButton(2131898874, new AnonymousClass4b6(activity2, resources2, r14, r15, r17, set2, 2));
        A00.setNegativeButton(2131898766, new C88814ar(activity2, 21));
        A00.A0G(new C88794an(activity2, 11));
        return A00.create();
    }
}
