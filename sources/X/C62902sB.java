package X;

import android.util.SparseArray;

/* renamed from: X.2sB  reason: invalid class name and case insensitive filesystem */
public abstract class C62902sB {
    public static final AnonymousClass00O A00;

    static {
        AnonymousClass00O r3 = new AnonymousClass00O(1);
        A00 = r3;
        SparseArray sparseArray = new SparseArray(2);
        sparseArray.append(1, new String[]{"januarja", "februarja", "marca", "aprila", "maja", "junija", "julija", "avgusta", "septembra", "oktobra", "novembra", "decembra"});
        sparseArray.append(2, new String[]{"januarjem", "februarjem", "marcem", "aprilom", "majem", "junijem", "julijem", "avgustom", "septembrom", "oktobrom", "novembrom", "decembrom"});
        r3.put("sl", sparseArray);
    }

    public static String[] A00(C18000vb r3) {
        return new String[]{r3.A08(261), r3.A08(260), r3.A08(264), r3.A08(257), r3.A08(265), r3.A08(263), r3.A08(262), r3.A08(258), r3.A08(268), r3.A08(267), r3.A08(266), r3.A08(259)};
    }

    public static String[] A01(C18000vb r3, int i) {
        String[] strArr;
        SparseArray sparseArray = (SparseArray) A00.get(r3.A05());
        if (sparseArray != null && (strArr = (String[]) sparseArray.get(i)) != null) {
            return strArr;
        }
        return new String[]{r3.A08(249), r3.A08(248), r3.A08(252), r3.A08(245), r3.A08(253), r3.A08(251), r3.A08(250), r3.A08(246), r3.A08(256), r3.A08(255), r3.A08(254), r3.A08(247)};
    }
}
