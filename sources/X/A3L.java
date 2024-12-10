package X;

import com.whatsapp.util.Log;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public abstract class A3L {
    public static Date A00(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.set(1, i);
        instance.set(2, i2);
        instance.set(5, i3);
        instance.set(11, 0);
        AnonymousClass8BV.A1Q(instance, 12, 0);
        instance.set(14, 0);
        return instance.getTime();
    }

    public static Date A01(String str) {
        C17960vV.A06(str);
        try {
            return AnonymousClass8BS.A0q("dd/MM/yyyy").parse(str);
        } catch (ParseException e) {
            Log.e("Couldn't parse the date", e);
            return null;
        }
    }

    public static int[] A02(String str) {
        Date A01 = A01(str);
        int[] iArr = {-1, -1, -1};
        if (A01 == null) {
            return iArr;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(A01);
        return new int[]{AnonymousClass8BT.A02(instance), instance.get(2), instance.get(1)};
    }
}
