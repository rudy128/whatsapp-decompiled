package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Ctm  reason: case insensitive filesystem */
public abstract class C26170Ctm {
    public static final Rect A00 = new Rect(-1000, -1000, 1000, 1000);

    public static CSR A00(Camera.Parameters parameters, String str, String str2) {
        String str3 = str;
        String str4 = parameters.get(str);
        ArrayList A02 = A02(str2);
        SparseArray A0Q = BE6.A0Q();
        ArrayList A0g = C108975cc.A0g(A02);
        Iterator it = A02.iterator();
        int i = -1;
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            try {
                String str5 = A0v;
                if (A0v.startsWith("ISO")) {
                    str5 = A0v.substring(3);
                }
                int parseInt = Integer.parseInt(str5);
                Integer valueOf = Integer.valueOf(parseInt);
                A0Q.put(parseInt, A0v);
                A0g.add(valueOf);
                if (A0v.equals(str4)) {
                    i = parseInt;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return new CSR(A0Q, str3, str4, A0g, i);
    }

    public static ArrayList A03(String str) {
        if (str == null || str.isEmpty() || str.charAt(0) != '(' || str.charAt(str.length() - 1) != ')') {
            Log.e("ParametersHelper", AnonymousClass001.A1H("Invalid area string=", str, AnonymousClass000.A10()));
        } else if (!str.equals("(0,0,0,0,0)") && !str.equals("(0, 0, 0, 0, 0)")) {
            ArrayList A13 = AnonymousClass000.A13();
            int i = 0;
            do {
                int indexOf = str.indexOf(41, i);
                String substring = str.substring(i, indexOf + 1);
                Camera.Area area = null;
                if (substring == null || substring.isEmpty() || substring.charAt(0) != '(' || substring.charAt(substring.length() - 1) != ')') {
                    Log.e("ParametersHelper", C17900vP.A0A("Invalid area string=", substring));
                } else {
                    Rect A07 = AnonymousClass3MW.A07();
                    try {
                        int indexOf2 = substring.indexOf(44);
                        A07.left = BE9.A0G(substring, 1, indexOf2);
                        int i2 = indexOf2 + 1;
                        int indexOf3 = substring.indexOf(44, i2);
                        A07.top = BE9.A0G(substring, i2, indexOf3);
                        int i3 = indexOf3 + 1;
                        int indexOf4 = substring.indexOf(44, i3);
                        A07.right = BE9.A0G(substring, i3, indexOf4);
                        int i4 = indexOf4 + 1;
                        int indexOf5 = substring.indexOf(44, i4);
                        A07.bottom = BE9.A0G(substring, i4, indexOf5);
                        int i5 = indexOf5 + 1;
                        int indexOf6 = substring.indexOf(44, i5);
                        if (indexOf6 == -1) {
                            indexOf6 = substring.indexOf(41, i5);
                        }
                        area = new Camera.Area(A07, BE9.A0G(substring, i5, indexOf6));
                    } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
                        Log.e("ParametersHelper", C17900vP.A0A("Invalid area string=", substring), e);
                    }
                }
                if (area != null) {
                    A13.add(area);
                }
                i = str.indexOf(40, indexOf);
            } while (i != -1);
            if (!A13.isEmpty()) {
                if (A13.size() == 1) {
                    Camera.Area area2 = (Camera.Area) A13.get(0);
                    Rect rect = area2.rect;
                    C28111Yx.A02(rect);
                    if (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == 0 && area2.weight == 0) {
                        return null;
                    }
                    return A13;
                }
                return A13;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r0 >= r1) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A01(android.graphics.Rect r6) {
        /*
            android.graphics.Rect r5 = A00
            boolean r0 = r6.intersect(r5)
            if (r0 != 0) goto L_0x0028
            boolean r0 = r5.contains(r6)
            if (r0 != 0) goto L_0x0028
            int r1 = r6.right
            int r4 = r5.left
            r3 = 0
            if (r1 > r4) goto L_0x003e
            int r1 = r6.left
        L_0x0017:
            int r4 = r4 - r1
        L_0x0018:
            int r2 = r6.bottom
            int r1 = r5.top
            if (r2 > r1) goto L_0x0037
            int r2 = r6.top
        L_0x0020:
            int r3 = r1 - r2
        L_0x0022:
            r6.offset(r4, r3)
            r6.intersect(r5)
        L_0x0028:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            r1 = 1000(0x3e8, float:1.401E-42)
            android.hardware.Camera$Area r0 = new android.hardware.Camera$Area
            r0.<init>(r6, r1)
            r2.add(r0)
            return r2
        L_0x0037:
            int r0 = r6.top
            int r1 = r5.bottom
            if (r0 < r1) goto L_0x0022
            goto L_0x0020
        L_0x003e:
            int r0 = r6.left
            int r4 = r5.right
            if (r0 >= r4) goto L_0x0017
            r4 = 0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26170Ctm.A01(android.graphics.Rect):java.util.ArrayList");
    }

    public static ArrayList A02(String str) {
        if (TextUtils.isEmpty(str)) {
            return AnonymousClass000.A13();
        }
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(',');
        simpleStringSplitter.setString(str);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator<String> it = simpleStringSplitter.iterator();
        while (it.hasNext()) {
            BE7.A1R(A13, it);
        }
        return A13;
    }
}
