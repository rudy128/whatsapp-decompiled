package X;

import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ctv  reason: case insensitive filesystem */
public final class C26177Ctv {
    public static final C26177Ctv A00 = new Object();
    public static final char[] A01 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final String A00(String str, Map map) {
        CFv.A00.getValue();
        StringBuilder A10 = AnonymousClass000.A10();
        if (A10.length() > 0) {
            A10.deleteCharAt(A10.length() - 1);
        }
        String A0H = C18070vi.A0H(A10);
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append(":");
        C26177Ctv ctv = A00;
        StringBuilder A102 = AnonymousClass000.A10();
        ctv.A01(map, A102);
        C17890vO.A10(C18070vi.A0H(A102), ":", "4a8a6a30659ce032132e4419bd9a779d6c626ff94a5d708eb753e8e100bbd3eb", A11);
        A11.append(":");
        A11.append("");
        if (A0H.length() > 0) {
            A11.append(":");
            A11.append(A0H);
        }
        String A0H2 = C18070vi.A0H(A11);
        MessageDigest instance = MessageDigest.getInstance("SHA-1");
        C18070vi.A0X(instance);
        instance.update(C108975cc.A1O(A0H2));
        byte[] digest = instance.digest();
        C18070vi.A0X(digest);
        char[] cArr = new char[40];
        int length = digest.length;
        for (int i = 0; i < length; i++) {
            byte b = digest[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = A01;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    private final void A01(Object obj, StringBuilder sb) {
        if (obj == null) {
            return;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof String) || (obj instanceof Enum)) {
            sb.append(obj);
        } else if (obj instanceof List) {
            for (Object A012 : C29431cG.A0t((Iterable) obj)) {
                A00.A01(A012, sb);
            }
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            C18070vi.A0d(map, 0);
            Iterator A0i = C17890vO.A0i(new TreeMap(map));
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                C26177Ctv ctv = A00;
                ctv.A01(A16.getKey(), sb);
                ctv.A01(A16.getValue(), sb);
            }
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            BE9.A1G(obj, "Unexpected object value type ", A10);
            throw AnonymousClass000.A0j(A10);
        }
    }

    public static final boolean A02(CO9 co9, long j, long j2) {
        long j3 = co9.A00;
        C24285Byi byi = co9.A01;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(j);
        long millis2 = timeUnit.toMillis(j);
        if (j3 >= 0 && millis2 > 0 && j3 + millis2 > j2) {
            return true;
        }
        if (byi == C24285Byi.PARALLEL_FETCH && millis == 0 && j2 - j3 < timeUnit.toMillis(5)) {
            return true;
        }
        return false;
    }
}
