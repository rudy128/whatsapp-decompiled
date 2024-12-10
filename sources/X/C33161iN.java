package X;

import android.content.SharedPreferences;

/* renamed from: X.1iN  reason: invalid class name and case insensitive filesystem */
public final class C33161iN implements C33141iL {
    public final C18030ve A00;

    public void CDb(SharedPreferences sharedPreferences, AnonymousClass1BI r7, AnonymousClass206 r8, C59642me r9) {
        if (C18020vd.A05(C18040vf.A02, this.A00, 2474)) {
            boolean z = r8 instanceof AnonymousClass219;
            if ((r8 instanceof AnonymousClass218) && !z && r9.A00) {
                String rawString = r7.getRawString();
                C18070vi.A0d(rawString, 0);
                StringBuilder sb = new StringBuilder();
                sb.append(rawString);
                sb.append("_location");
                String obj = sb.toString();
                String str = "0";
                String string = sharedPreferences.getString(obj, str);
                if (string != null) {
                    str = string;
                }
                sharedPreferences.edit().putString(obj, String.valueOf(C20099A7c.A04(str, 0) + 1)).apply();
            }
        }
    }

    public C33161iN(C18030ve r1) {
        this.A00 = r1;
    }
}
