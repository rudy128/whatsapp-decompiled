package X;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;

/* renamed from: X.6vZ  reason: invalid class name and case insensitive filesystem */
public abstract class C137506vZ {
    public static void A00(Toolbar toolbar) {
        String str;
        if (toolbar == null) {
            Log.e("ToolbarUtils/toolbar is null");
            return;
        }
        try {
            Field declaredField = Toolbar.class.getDeclaredField("mTitleTextView");
            declaredField.setAccessible(true);
            AnonymousClass1HF.A0q((View) declaredField.get(toolbar), true);
        } catch (NoSuchFieldException e) {
            e = e;
            str = "ToolbarUtils/NoSuchFieldException";
            Log.e(str, e);
        } catch (IllegalAccessException e2) {
            e = e2;
            str = "ToolbarUtils/IllegalAccessException";
            Log.e(str, e);
        } catch (NullPointerException e3) {
            e = e3;
            str = "ToolbarUtils/NullPointerException";
            Log.e(str, e);
        }
    }

    public static void A01(Toolbar toolbar, C18000vb r3, String str) {
        AnonymousClass3NL.A02(toolbar.getContext(), toolbar, r3, 2131231675);
        Context context = toolbar.getContext();
        C18070vi.A0d(context, 0);
        toolbar.setBackgroundResource(AnonymousClass4Z9.A01(context, false));
        toolbar.A0Q(toolbar.getContext(), 2132083960);
        A00(toolbar);
        toolbar.setTitle((CharSequence) str);
    }
}
