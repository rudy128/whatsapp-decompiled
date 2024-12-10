package X;

import android.content.SharedPreferences;

/* renamed from: X.1iR  reason: invalid class name and case insensitive filesystem */
public final class C33201iR implements C33181iP {
    public final C18030ve A00;

    public void BKL(SharedPreferences sharedPreferences, AnonymousClass2HW r5, AnonymousClass1BI r6) {
        if (C18020vd.A05(C18040vf.A02, this.A00, 2474)) {
            String rawString = r6.getRawString();
            C18070vi.A0d(rawString, 0);
            StringBuilder sb = new StringBuilder();
            sb.append(rawString);
            sb.append("_location");
            String string = sharedPreferences.getString(sb.toString(), (String) null);
            if (string != null && string.length() != 0) {
                r5.A1w = Long.valueOf(C20099A7c.A04(string, 0));
            }
        }
    }

    public C33201iR(C18030ve r1) {
        this.A00 = r1;
    }
}
