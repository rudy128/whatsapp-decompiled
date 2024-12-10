package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.NoSuchElementException;

/* renamed from: X.9yy  reason: invalid class name and case insensitive filesystem */
public final class C198829yy {
    public static final C20320AGc A00(Context context, AHz aHz, C22566BDb bDb, CXY cxy, Integer num) {
        SparseArray sparseArray;
        Context context2 = context;
        if (context instanceof Activity) {
            ((Activity) context2).getWindow().getDecorView().setTag(2131436043, "app_root_window");
        }
        AHz aHz2 = aHz;
        SparseArray sparseArray2 = aHz.A00;
        Integer num2 = null;
        if (sparseArray2 == null || (sparseArray = sparseArray2.clone()) == null) {
            sparseArray = new SparseArray(3);
        }
        sparseArray.put(2131428150, aHz.A05);
        sparseArray.put(2131428192, bDb);
        C22403B6g b6g = aHz.A01;
        if (b6g != null) {
            num2 = Integer.valueOf(b6g.BYg());
        }
        sparseArray.put(2131428193, num2);
        C20320AGc aGc = new C20320AGc(context2, sparseArray, aHz2, cxy, num);
        bDb.getLifecycle().A05(aGc);
        return aGc;
    }

    public final C20320AGc A01(Context context, Bundle bundle, C22566BDb bDb, CXY cxy) {
        String str;
        int i;
        try {
            int i2 = bundle.getInt("bloks_screen_navigation_state", 0);
            for (Integer num : AnonymousClass00R.A00(3)) {
                switch (num.intValue()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i == i2) {
                    return A00(context, AHz.A0A.A00(bundle), bDb, cxy, num);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (C179979Kq e) {
            Bundle bundle2 = bundle.getBundle("key_screen_container_props_bundle");
            if (bundle2 != null) {
                str = bundle2.getString("key_app_id");
            } else {
                str = null;
            }
            C25913CoX.A00((DOZ) null, "ScreenContainerDelegate", AnonymousClass001.A1H("Failed to properly initialize screen props for screen with appId: ", str, AnonymousClass000.A10()), e);
            throw e;
        }
    }
}
