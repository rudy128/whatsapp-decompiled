package X;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.2tJ  reason: invalid class name and case insensitive filesystem */
public final class C63562tJ {
    public static final String[] A08 = {"com.whatsapp", "com.whatsapp.w4b"};
    public static final String[] A09 = {"raw_contact_id", "display_name", "data1", "data2", "data3", "sort_key", "account_type", "starred"};
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C63562tJ r7 = (C63562tJ) obj;
        return this.A01 == r7.A01 && TextUtils.equals(this.A03, r7.A03) && TextUtils.equals(this.A05, r7.A05) && this.A00 == r7.A00 && TextUtils.equals(this.A04, r7.A04) && TextUtils.equals(this.A06, r7.A06) && this.A07 == r7.A07;
    }

    public int hashCode() {
        int i = 0;
        long j = this.A01;
        int i2 = ((((((int) (j >>> 32)) * 31) + ((int) j)) * 31) + this.A00) * 31;
        String str = this.A05;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public static Cursor A00(AnonymousClass11C r5, String str) {
        Log.i("phone/getcursor/query/start");
        AnonymousClass11B A0O = r5.A0O();
        if (A0O == null) {
            Log.w("phone/getcursor/cr null");
            return null;
        }
        Cursor A032 = A0O.A03(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, A09, A01(), (String[]) null, (String) null);
        Log.i("phone/getcursor/query/end");
        StringBuilder A10 = AnonymousClass000.A10();
        if (A032 == null) {
            return A032;
        }
        A10.append(str);
        A10.append('/');
        C17900vP.A0o(A10, A032.getCount());
        return A032;
    }

    public C63562tJ(String str, String str2, String str3, String str4, String str5, int i, long j, boolean z) {
        if (str2 != null) {
            this.A01 = j;
            this.A03 = str;
            this.A05 = str2;
            this.A00 = i;
            this.A04 = str3;
            this.A06 = str4;
            this.A02 = str5;
            this.A07 = z;
            return;
        }
        throw AnonymousClass000.A0s("number must not be null");
    }

    public static String A01() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("(");
        A10.append("account_type");
        A10.append(" IS NULL OR (");
        A10.append("account_type");
        A10.append(" NOT IN (");
        char c = 0;
        while (true) {
            String[] strArr = A08;
            if (c < 1) {
                DatabaseUtils.appendEscapedSQLString(A10, strArr[c]);
                A10.append(",");
                c = 1;
            } else {
                DatabaseUtils.appendEscapedSQLString(A10, strArr[1]);
                C17890vO.A1A(A10, ")))");
                return A10.toString();
            }
        }
    }
}
