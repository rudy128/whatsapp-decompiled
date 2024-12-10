package X;

import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.2T4  reason: invalid class name */
public abstract class AnonymousClass2T4 {
    public static Integer A00(AnonymousClass11C r2, C219217x r3) {
        Integer num = null;
        if (r3.A02("android.permission.READ_CONTACTS") != 0) {
            Log.i("phonebook/getCount/permission_denied");
        } else {
            Cursor A00 = C63562tJ.A00(r2, "phonebook/get_count/");
            if (A00 != null) {
                try {
                    num = Integer.valueOf(A00.getCount());
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                    throw th;
                }
            }
            if (A00 != null) {
                A00.close();
                return num;
            }
        }
        return num;
    }
}
