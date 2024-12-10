package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.Window;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.1Zt  reason: invalid class name and case insensitive filesystem */
public abstract class C28281Zt {
    public static int A00(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        try {
            return C19740yt.A00(context, typedValue.resourceId);
        } catch (Resources.NotFoundException unused) {
            return C19740yt.A00(context, i2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, X.01k, android.content.ContextWrapper] */
    public static C003101k A01(Context context) {
        Configuration configuration = new Configuration();
        configuration.uiMode = (new Configuration().uiMode & 48) | 32;
        ? contextWrapper = new ContextWrapper(context);
        contextWrapper.A02 = null;
        contextWrapper.A03(configuration);
        if (context instanceof AnonymousClass1FX) {
            contextWrapper.setTheme(((AnonymousClass1FY) ((AnonymousClass1FX) context)).A00);
        }
        return contextWrapper;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, X.01k, android.content.ContextWrapper] */
    public static C003101k A02(Context context) {
        Configuration configuration = new Configuration();
        configuration.uiMode = (new Configuration().uiMode & -49) | 16;
        ? contextWrapper = new ContextWrapper(context);
        contextWrapper.A02 = null;
        contextWrapper.A03(configuration);
        if (context instanceof AnonymousClass1FX) {
            contextWrapper.setTheme(((AnonymousClass1FY) ((AnonymousClass1FX) context)).A00);
        }
        return contextWrapper;
    }

    public static void A08(Context context, Window window, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            boolean z = !A0B(context);
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.setStatusBarColor(C19740yt.A00(context, i));
            A0A(window, z);
        }
    }

    public static void A09(Window window, int i, int i2) {
        if (window != null) {
            boolean z = true;
            if (i2 != 1 || A0B(window.getContext())) {
                z = false;
            } else if (!AnonymousClass112.A04()) {
                return;
            }
            window.setNavigationBarColor(C19740yt.A00(window.getContext(), i));
            if (Build.VERSION.SDK_INT >= 27) {
                int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
                int i3 = systemUiVisibility & -17;
                if (z) {
                    i3 = systemUiVisibility | 16;
                }
                window.getDecorView().setSystemUiVisibility(i3);
            }
        }
    }

    public static void A0A(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            int i = systemUiVisibility & -8193;
            if (z) {
                i = systemUiVisibility | DefaultCrypto.BUFFER_SIZE;
            }
            window.getDecorView().setSystemUiVisibility(i);
        }
    }

    public static void A03(int i, Dialog dialog) {
        A08(dialog.getContext(), dialog.getWindow(), i);
    }

    public static void A04(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 256 | EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        }
    }

    public static void A05(Activity activity, int i) {
        Window window = activity.getWindow();
        if (window != null) {
            int i2 = window.getAttributes().flags;
            if ((i2 & Integer.MIN_VALUE) == 0) {
                window.addFlags(Integer.MIN_VALUE);
            }
            if ((i2 & 67108864) != 0) {
                window.clearFlags(67108864);
            }
            window.setStatusBarColor(C19740yt.A00(activity, i));
        }
    }

    public static void A06(Activity activity, int i) {
        A08(activity.getBaseContext(), activity.getWindow(), i);
    }

    public static void A07(Activity activity, int i, int i2) {
        A09(activity.getWindow(), i, i2);
    }

    public static boolean A0B(Context context) {
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }
}
