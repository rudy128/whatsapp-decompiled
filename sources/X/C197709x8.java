package X;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9x8  reason: invalid class name and case insensitive filesystem */
public final class C197709x8 {
    public final C18090vk A00;

    public C197709x8(C18090vk r1) {
        this.A00 = r1;
    }

    public static final void A00(C188729ht r22, List list) {
        Boolean valueOf;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C188729ht r2 = r22;
            C191209mC r6 = r2.A07;
            C21319Ai4 ai4 = (C21319Ai4) ((AnonymousClass5YR) it.next());
            String str = ai4.A0C;
            if (!(str == null || str.length() == 0)) {
                String str2 = ai4.A0F;
                boolean z = ai4.A0L;
                A6F a6f = r2.A08;
                String A002 = A6F.A00(a6f, C17900vP.A0A(str2, str));
                SharedPreferences sharedPreferences = a6f.A00;
                if (!sharedPreferences.contains(A002) || (valueOf = Boolean.valueOf(sharedPreferences.getBoolean(A002, false))) == null || !valueOf.equals(Boolean.valueOf(z))) {
                    AnonymousClass1OZ r15 = r6.A00;
                    String A0B = r15.A0B();
                    r15.A0N(new C693636x(1), new AnonymousClass9F5(A0B, str2, str, "exposure", C17880vN.A04(System.currentTimeMillis())).BVP(), A0B, 376, 0);
                }
                C17880vN.A1F(sharedPreferences.edit(), A6F.A00(a6f, C17900vP.A0A(str2, str)), z);
            }
        }
    }
}
