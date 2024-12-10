package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import com.whatsapp.bloks.components.BkCdsBottomSheetFragment;
import java.util.List;

/* renamed from: X.A7f  reason: case insensitive filesystem */
public final class C20101A7f {
    public static final C20101A7f A00 = new Object();

    public static final Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return A00(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final Object A01(Context context) {
        C20101A7f a7f = A00;
        List A03 = A03(A00(context));
        if (A03 == null || A03.isEmpty()) {
            return null;
        }
        return a7f.A02(A03);
    }

    private final Object A02(List list) {
        int i;
        Class<BkCdsBottomSheetFragment> cls = BkCdsBottomSheetFragment.class;
        int A01 = AnonymousClass3MX.A01(list);
        if (A01 < 0) {
            return null;
        }
        do {
            i = A01 - 1;
            Fragment fragment = (Fragment) list.get(A01);
            if (cls.isInstance(fragment)) {
                return cls.cast(fragment);
            }
            List A04 = fragment.A1E().A0U.A04();
            C18070vi.A0X(A04);
            Object A02 = A02(A04);
            if (A02 != null) {
                return A02;
            }
            A01 = i;
        } while (i >= 0);
        return null;
    }

    public static final List A03(Activity activity) {
        if (activity instanceof AnonymousClass1FL) {
            return AnonymousClass3MX.A0O((AnonymousClass1FL) activity).A0U.A04();
        }
        return null;
    }
}
