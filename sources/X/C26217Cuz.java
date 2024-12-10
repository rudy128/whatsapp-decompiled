package X;

import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: X.Cuz  reason: case insensitive filesystem */
public class C26217Cuz {
    public static String A07 = C26213Cus.class.getName().replace('.', '/');
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final HashMap A04 = C17880vN.A11();
    public final C24231Bxl A05;
    public final C24467C5h[] A06;

    public static void A03(C26026Cqk cqk, C26250Cvp cvp, int i) {
        cvp.A0B(21, 2);
        if (i == 0) {
            cvp.A0H(cqk, 154);
            return;
        }
        if (i == 1) {
            cvp.A07(4);
        } else if (i == 2) {
            cvp.A07(5);
        } else {
            int i2 = 6;
            if (i != 3) {
                if (i == 4) {
                    i2 = 7;
                } else if (i == 5) {
                    i2 = 8;
                } else if (i >= 6) {
                    cvp.A09(16, i);
                } else {
                    throw AnonymousClass8BR.A0w("non supported negative values");
                }
            }
            cvp.A07(i2);
        }
        cvp.A0H(cqk, 160);
    }

    /* JADX WARNING: type inference failed for: r5v8, types: [X.Cqk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v10, types: [X.Cqk, java.lang.Object] */
    public static void A00(C24467C5h c5h, C26217Cuz cuz, C26250Cvp cvp) {
        String str;
        boolean z;
        int i;
        String str2;
        String str3;
        C26026Cqk cqk;
        C26250Cvp cvp2 = cvp;
        cvp2.A0B(25, 1);
        C26217Cuz cuz2 = cuz;
        String str4 = cuz2.A03;
        cvp2.A0C(192, str4);
        cvp2.A0B(25, 3);
        C24467C5h c5h2 = c5h;
        Class cls = c5h.A00;
        C26263Cw8 A032 = C26263Cw8.A03(cls);
        String replace = cls.getName().replace('.', '/');
        Method method = (Method) cuz2.A04.get(cls);
        if (method != null) {
            cvp2.A0F(method.getDeclaringClass().getName().replace('.', '/'), method.getName(), C26263Cw8.A02(method), 184, false);
        } else {
            if (c5h.A00.isEnum()) {
                ? obj = new Object();
                cvp2.A0H(obj, 198);
                cvp2.A0B(25, 3);
                z = false;
                cvp2.A0F("java/lang/Object", "toString", "()Ljava/lang/String;", 182, false);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("(Ljava/lang/String;)L");
                A10.append(replace);
                str = AnonymousClass000.A0y(";", A10);
                i = 184;
                str3 = "valueOf";
                str2 = replace;
                cqk = obj;
            } else if (cls.equals(String.class)) {
                ? obj2 = new Object();
                cvp2.A0H(obj2, 198);
                cvp2.A0B(25, 3);
                str = "()Ljava/lang/String;";
                z = false;
                i = 182;
                str2 = "java/lang/Object";
                str3 = "toString";
                cqk = obj2;
            } else {
                cvp2.A0C(192, replace);
            }
            cvp2.A0F(str2, str3, str, i, z);
            cvp2.A0B(58, 3);
            cvp2.A0G(cqk);
            boolean z2 = z;
            cvp2.A0J((Object[]) null, 3, (Object[]) null, z2 ? 1 : 0, z ? 1 : 0);
            cvp2.A0B(25, 1);
            cvp2.A0C(192, str4);
            cvp2.A0B(25, 3);
            cvp2.A0C(192, replace);
        }
        Method method2 = c5h2.A04;
        if (method2 == null) {
            cvp2.A0D(181, str4, c5h2.A01, A032.A06());
        } else {
            String A022 = C26263Cw8.A02(method2);
            cvp2.A0F(str4, method2.getName(), A022, 182, false);
        }
        cvp2.A07(177);
    }

    public static void A01(C26217Cuz cuz, C26250Cvp cvp) {
        String replace = NoSuchFieldException.class.getName().replace('.', '/');
        C26250Cvp cvp2 = cvp;
        cvp.A0C(187, replace);
        cvp.A07(89);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("mapping ");
        A10.append(cuz.A02);
        cvp.A0E(AnonymousClass000.A0y(" failed to map field:", A10));
        cvp.A0B(21, 2);
        cvp2.A0F("java/lang/Integer", "toString", "(I)Ljava/lang/String;", 184, false);
        cvp2.A0F("java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", 182, false);
        cvp.A0F(replace, "<init>", "(Ljava/lang/String;)V", 183, false);
        cvp2.A07(191);
    }

    public static void A02(C26217Cuz cuz, C26250Cvp cvp) {
        String replace = NoSuchFieldException.class.getName().replace('.', '/');
        C26250Cvp cvp2 = cvp;
        cvp.A0C(187, replace);
        cvp.A07(89);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("mapping ");
        A10.append(cuz.A02);
        cvp.A0E(AnonymousClass000.A0y(" failed to map field:", A10));
        cvp.A0B(25, 2);
        cvp2.A0F("java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", 182, false);
        cvp.A0F(replace, "<init>", "(Ljava/lang/String;)V", 183, false);
        cvp2.A07(191);
    }

    public C26217Cuz(Class cls, C24231Bxl bxl, C24467C5h[] c5hArr) {
        String concat;
        this.A06 = c5hArr;
        this.A05 = bxl;
        String name = cls.getName();
        this.A02 = name;
        if (name.startsWith("java.")) {
            StringBuilder A10 = AnonymousClass000.A10();
            C17890vO.A10("net.minidev.asm.", name, "AccAccess", A10);
            concat = A10.toString();
        } else {
            concat = name.concat("AccAccess");
        }
        this.A00 = concat;
        this.A01 = concat.replace('.', '/');
        this.A03 = name.replace('.', '/');
    }
}
