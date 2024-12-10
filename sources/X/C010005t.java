package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.05t  reason: invalid class name and case insensitive filesystem */
public class C010005t extends C005302h {
    public static Intent A00(String[] strArr) {
        C18070vi.A0d(strArr, 1);
        Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
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
        return A00((String[]) obj);
    }

    public /* bridge */ /* synthetic */ C03160Gv A04(Context context, Object obj) {
        return null;
    }
}
