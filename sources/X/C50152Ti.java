package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.2Ti  reason: invalid class name and case insensitive filesystem */
public abstract class C50152Ti {
    public static void A00(Context context, String str) {
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(context.getPackageName(), "com.whatsapp.Main");
        A0A.setAction("android.intent.action.MAIN");
        A0A.addCategory("android.intent.category.LAUNCHER");
        A0A.addFlags(268435456);
        A0A.addFlags(2097152);
        Intent A0A2 = C17880vN.A0A();
        A0A2.putExtra("android.intent.extra.shortcut.INTENT", A0A);
        A0A2.putExtra("duplicate", false);
        A0A2.putExtra("android.intent.extra.shortcut.NAME", str);
        A0A2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context, 2131951618));
        A0A2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        context.sendBroadcast(A0A2);
    }
}
