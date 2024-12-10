package X;

import android.util.Pair;
import java.util.Locale;

/* renamed from: X.1Mt  reason: invalid class name and case insensitive filesystem */
public abstract class C25071Mt {
    public static Pair A01(String str, String str2, String str3, String str4) {
        Object[] objArr;
        String str5;
        if (str3 != null) {
            objArr = new Object[]{str, str3, str2};
            str5 = "%s_bd_for_%s_%s_trigger";
        } else {
            objArr = new Object[]{str, str2};
            str5 = "%s_bd_for_%s_trigger";
        }
        String lowerCase = String.format(str5, objArr).toLowerCase(Locale.getDefault());
        return new Pair(lowerCase, String.format("CREATE TRIGGER %s BEFORE DELETE ON %s BEGIN DELETE FROM %s WHERE %s; END", new Object[]{lowerCase, str, str2, str4}));
    }

    public static Pair A00(String str) {
        return A01("backups", str, (String) null, "backup_id = old.id");
    }

    public static String A02(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE IF EXISTS ");
        sb.append(str);
        return sb.toString();
    }
}
