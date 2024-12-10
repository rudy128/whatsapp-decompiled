package X;

import android.content.Context;
import java.util.Locale;

/* renamed from: X.2T2  reason: invalid class name */
public abstract class AnonymousClass2T2 {
    public static String A00(Context context, C24921Me r6, C18000vb r7, AnonymousClass1E7 r8) {
        String A0L = r6.A0L(r8);
        if (A0L == null) {
            A0L = "";
        }
        String A0F = r7.A0F(context.getString(2131892103));
        String A0F2 = r7.A0F(A0L);
        String string = context.getString(2131899169);
        Locale A0N = r7.A0N();
        Object[] objArr = new Object[2];
        AnonymousClass001.A1Q(A0F2, A0F, objArr);
        return String.format(A0N, string, objArr);
    }
}
