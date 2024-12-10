package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.05s  reason: invalid class name */
public class AnonymousClass05s extends C005302h {
    public static Intent A00(String str) {
        C18070vi.A0d(str, 1);
        Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
        C18070vi.A0X(type);
        return type;
    }

    public /* bridge */ /* synthetic */ Object A05(Intent intent, int i) {
        if (i != -1 || intent == null) {
            return null;
        }
        return intent.getData();
    }

    public /* bridge */ /* synthetic */ Intent A03(Context context, Object obj) {
        return A00((String) obj);
    }

    public /* bridge */ /* synthetic */ C03160Gv A04(Context context, Object obj) {
        return null;
    }
}
