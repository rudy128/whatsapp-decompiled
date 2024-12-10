package X;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.1af  reason: invalid class name and case insensitive filesystem */
public final class C28641af extends C28611ac {
    public void A03(Context context, AnonymousClass11C r10, int i) {
        if (Build.VERSION.SDK_INT < 22) {
            String packageName = context.getPackageName();
            try {
                Uri parse = Uri.parse("content://com.sec.badge/apps");
                AnonymousClass11B A0O = r10.A0O();
                C17960vV.A07(A0O);
                ContentValues contentValues = new ContentValues();
                contentValues.put("package", packageName);
                contentValues.put("class", "com.whatsapp.Main");
                contentValues.put("badgecount", Integer.valueOf(i));
                String[] strArr = {packageName, "com.whatsapp.Main"};
                C18070vi.A0d(parse, 0);
                if (AnonymousClass11B.A00(A0O).update(parse, contentValues, "package=? AND class=?", strArr) == 0) {
                    AnonymousClass11B.A00(A0O).insert(parse, contentValues);
                }
            } catch (Exception e) {
                Log.e("widgetprovider/updatebadge", e);
            }
        } else {
            Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
            intent.putExtra("badge_count", i);
            intent.putExtra("badge_count_package_name", context.getPackageName());
            intent.putExtra("badge_count_class_name", "com.whatsapp.Main");
            context.sendBroadcast(intent);
        }
    }
}
