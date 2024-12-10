package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9t3  reason: invalid class name and case insensitive filesystem */
public class C195259t3 {
    public Map A00;
    public final C189459jH A01;
    public final AnonymousClass190 A02;
    public final C170208ou A03;
    public final AA6 A04 = new AA6(this);

    public synchronized String A00(String str) {
        String A0s;
        Throwable th;
        Map map = this.A00;
        HashMap hashMap = map;
        if (map == null) {
            HashMap A11 = C17880vN.A11();
            C28781at A002 = this.A01.A00.A00();
            try {
                Cursor A0A = ((C28801av) A002).A02.A0A("SELECT key, value FROM properties", "XPM_GET_ALL_PROPERTIES", (String[]) null);
                A002.close();
                try {
                    if (A0A.moveToFirst()) {
                        int columnIndexOrThrow = A0A.getColumnIndexOrThrow("key");
                        int columnIndexOrThrow2 = A0A.getColumnIndexOrThrow("value");
                        do {
                            A11.put(A0A.getString(columnIndexOrThrow), A0A.getString(columnIndexOrThrow2));
                        } while (A0A.moveToNext());
                    }
                    A0A.close();
                    this.A00 = A11;
                    hashMap = A11;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
            } catch (Throwable th3) {
                th = th3;
                A002.close();
                throw th;
            }
        }
        A0s = C17880vN.A0s(str, hashMap);
        if (A0s == null) {
            return null;
        }
        return A0s;
    }

    public synchronized void A01(String str, String str2) {
        C41851xA BD0;
        C22561Ci r5 = this.A03.A01;
        C192439oO r0 = this.A01.A00;
        C28791au A012 = r0.A01();
        try {
            C41851xA BD02 = A012.BD0();
            try {
                C28791au A013 = r0.A01();
                try {
                    BD0 = A013.BD0();
                    C23141Ev r3 = ((C28801av) A013).A02;
                    r3.A04("properties", "key = ?", "XPM_DELETE_PROPERTY", C108975cc.A1b(str));
                    if (str2 != null) {
                        ContentValues A08 = C17880vN.A08();
                        A08.put("key", str);
                        A08.put("value", str2);
                        r3.A06("properties", "XPM_SET_PROPERTY", A08);
                    }
                    BD0.A00();
                    BD0.close();
                    A013.close();
                    AA6 aa6 = this.A04;
                    Object A0p = C17880vN.A0p();
                    Object obj = r5.A02.get();
                    C17960vV.A07(obj);
                    ((HashMap) obj).put(A0p, aa6);
                    BD02.A00();
                    Map map = this.A00;
                    if (map != null) {
                        if (str2 != null) {
                            map.put(str, str2);
                        } else {
                            map.remove(str);
                        }
                    }
                    BD02.close();
                    A012.close();
                } catch (Throwable th) {
                    A013.close();
                    throw th;
                }
            } catch (Throwable th2) {
                BD02.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A012.close();
            } catch (Throwable th4) {
                AnonymousClass0DT.A00(th3, th4);
            }
            throw th3;
        }
        return;
        throw th;
    }

    public boolean A02(String str) {
        String A002 = A00(str);
        if (A002 != null) {
            String A0n = AnonymousClass8BS.A0n(A002);
            if (A0n.equals("true")) {
                return true;
            }
            if (!A0n.equals("false")) {
                AnonymousClass190 r2 = this.A02;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Malformed boolean: ");
                A10.append(str);
                r2.A0G("xpm-file-prefetcher-properties", AnonymousClass001.A1H("=", A002, A10), false);
            }
        }
        return false;
    }

    public C195259t3(AnonymousClass190 r2, C170208ou r3, C189459jH r4) {
        this.A02 = r2;
        this.A01 = r4;
        this.A03 = r3;
    }
}
