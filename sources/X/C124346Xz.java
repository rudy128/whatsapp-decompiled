package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.6Xz  reason: invalid class name and case insensitive filesystem */
public abstract class C124346Xz {
    public static C010105w A00(Activity activity, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, C24921Me r16, AnonymousClass1E7 r17, AnonymousClass1KW r18, ArrayList arrayList, Map map) {
        Resources resources;
        int i;
        String string;
        Resources resources2;
        int i2;
        AnonymousClass1E7 r3 = r17;
        if (map != null && map.size() == 1) {
            r3 = C17880vN.A0O(C17890vO.A0l(map));
            map.clear();
        }
        C24921Me r6 = r16;
        if (map == null || map.isEmpty()) {
            if (r3 == null || !r3.A0F()) {
                if (arrayList == null || arrayList.size() <= 1) {
                    resources = activity.getResources();
                    i = 2131888727;
                    Object[] objArr = new Object[1];
                    AnonymousClass3MX.A1N(r6, r3, objArr, 0);
                    string = resources.getString(i, objArr);
                } else {
                    resources2 = activity.getResources();
                    i2 = 2131755071;
                }
            } else if (arrayList == null || arrayList.size() <= 1) {
                resources = activity.getResources();
                i = 2131890915;
                Object[] objArr2 = new Object[1];
                AnonymousClass3MX.A1N(r6, r3, objArr2, 0);
                string = resources.getString(i, objArr2);
            } else {
                resources2 = activity.getResources();
                i2 = 2131755170;
            }
            int size = arrayList.size();
            Object[] objArr3 = new Object[2];
            C17880vN.A1T(objArr3, arrayList.size(), 0);
            AnonymousClass3MX.A1N(r6, r3, objArr3, 1);
            string = resources2.getQuantityString(i2, size, objArr3);
        } else {
            String A0b = r6.A0b(map.values(), 3, -1, false, true);
            if (arrayList == null || arrayList.size() <= 1) {
                string = AnonymousClass3MW.A0x(activity.getResources(), A0b, new Object[1], 0, 2131888727);
            } else {
                Resources resources3 = activity.getResources();
                int size2 = arrayList.size();
                Object[] objArr4 = new Object[2];
                C17880vN.A1T(objArr4, arrayList.size(), 0);
                objArr4[1] = A0b;
                string = resources3.getQuantityString(2131755071, size2, objArr4);
            }
        }
        C73203Rj A00 = AnonymousClass4a6.A00(activity);
        A00.A0S(C43251zV.A05(activity, r18, string));
        A00.A0T(true);
        A00.A0X(onClickListener2, 2131898766);
        A00.A0Z(onClickListener, 2131899286);
        A00.A0G(onCancelListener);
        return A00.create();
    }
}
