package X;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import net.minidev.json.annotate.JsonIgnore;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.Cus  reason: case insensitive filesystem */
public abstract class C26213Cus {
    public static ConcurrentHashMap A00 = AnonymousClass8BR.A17();

    /* JADX WARNING: type inference failed for: r11v2, types: [X.Cqk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v30, types: [X.Cqk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object, X.C5h] */
    public static void A01(Class cls) {
        Class cls2;
        String concat;
        Class<?> cls3;
        int i;
        Method method;
        int i2;
        String str;
        C26250Cvp cvp;
        Method method2;
        Method method3;
        String str2;
        JsonIgnore jsonIgnore;
        JsonIgnore jsonIgnore2;
        Class cls4 = cls;
        Class cls5 = cls4;
        A00.get(cls5);
        Class cls6 = cls5;
        HashMap A11 = C17880vN.A11();
        while (true) {
            cls2 = Object.class;
            if (cls6 == cls2) {
                break;
            }
            for (Field field : cls6.getDeclaredFields()) {
                String name = field.getName();
                if (!A11.containsKey(name)) {
                    ? obj = new Object();
                    obj.A01 = field.getName();
                    int modifiers = field.getModifiers();
                    if ((modifiers & 136) <= 0) {
                        if ((modifiers & 1) > 0) {
                            obj.A02 = field;
                        }
                        String name2 = field.getName();
                        int length = name2.length();
                        char[] cArr = new char[(length + 3)];
                        cArr[0] = 's';
                        cArr[1] = 'e';
                        cArr[2] = 't';
                        char charAt = name2.charAt(0);
                        if (charAt >= 'a' && charAt <= 'z') {
                            charAt = (char) (charAt - 32);
                        }
                        cArr[3] = charAt;
                        for (int i3 = 1; i3 < length; i3++) {
                            cArr[i3 + 3] = name2.charAt(i3);
                        }
                        try {
                            obj.A04 = cls6.getDeclaredMethod(new String(cArr), new Class[]{field.getType()});
                        } catch (Exception unused) {
                        }
                        boolean equals = field.getType().equals(Boolean.TYPE);
                        String name3 = field.getName();
                        if (equals) {
                            int length2 = name3.length();
                            char[] cArr2 = new char[(length2 + 2)];
                            cArr2[0] = 'i';
                            cArr2[1] = 's';
                            char charAt2 = name3.charAt(0);
                            if (charAt2 >= 'a' && charAt2 <= 'z') {
                                charAt2 = (char) (charAt2 - 32);
                            }
                            cArr2[2] = charAt2;
                            for (int i4 = 1; i4 < length2; i4++) {
                                cArr2[i4 + 2] = name3.charAt(i4);
                            }
                            str2 = new String(cArr2);
                        } else {
                            str2 = A00(name3);
                        }
                        try {
                            obj.A03 = cls6.getDeclaredMethod(str2, new Class[0]);
                        } catch (Exception unused2) {
                        }
                        if (obj.A03 == null && equals) {
                            try {
                                obj.A03 = cls6.getDeclaredMethod(A00(field.getName()), new Class[0]);
                            } catch (Exception unused3) {
                            }
                        }
                        if (!(obj.A02 == null && obj.A03 == null && obj.A04 == null)) {
                            Method method4 = obj.A03;
                            if (!(method4 == null || (jsonIgnore2 = (JsonIgnore) method4.getAnnotation(JsonIgnore.class)) == null || !jsonIgnore2.value())) {
                                obj.A03 = null;
                            }
                            Method method5 = obj.A04;
                            if (!(method5 == null || (jsonIgnore = (JsonIgnore) method5.getAnnotation(JsonIgnore.class)) == null || !jsonIgnore.value())) {
                                obj.A04 = null;
                            }
                            if (!(obj.A03 == null && obj.A04 == null && obj.A02 == null)) {
                                obj.A00 = field.getType();
                                obj.A05 = field.getGenericType();
                            }
                        }
                    }
                    if (obj.A02 != null || obj.A03 != null || obj.A04 != null) {
                        A11.put(name, obj);
                    }
                }
            }
            cls6 = cls6.getSuperclass();
        }
        C24467C5h[] c5hArr = (C24467C5h[]) A11.values().toArray(new C24467C5h[A11.size()]);
        String name4 = cls4.getName();
        if (name4.startsWith("java.util.")) {
            StringBuilder A10 = AnonymousClass000.A10();
            C17890vO.A10("net.minidev.asm.", name4, "AccAccess", A10);
            concat = A10.toString();
        } else {
            concat = name4.concat("AccAccess");
        }
        C24231Bxl bxl = new C24231Bxl(cls4.getClassLoader());
        try {
            cls3 = bxl.loadClass(concat);
        } catch (ClassNotFoundException unused4) {
            cls3 = null;
        }
        Class cls7 = cls4;
        LinkedList A14 = AnonymousClass8BR.A14();
        while (!cls7.equals(cls2)) {
            A14.addLast(cls7);
            for (Class addLast : cls7.getInterfaces()) {
                A14.addLast(addLast);
            }
            cls7 = cls7.getSuperclass();
            if (cls7 == null) {
                break;
            }
        }
        A14.addLast(cls2);
        if (cls3 == null) {
            C26217Cuz cuz = new C26217Cuz(cls4, bxl, c5hArr);
            Iterator it = A14.iterator();
            while (it.hasNext()) {
                Iterable<Class> iterable = (Iterable) C197509wo.A01.get(it.next());
                if (iterable != null) {
                    for (Class cls8 : iterable) {
                        if (cls8 != null) {
                            for (Method method6 : cls8.getMethods()) {
                                if ((method6.getModifiers() & 8) != 0) {
                                    Class[] parameterTypes = method6.getParameterTypes();
                                    if (parameterTypes.length == 1 && parameterTypes[0].equals(cls2)) {
                                        Class<?> returnType = method6.getReturnType();
                                        if (!returnType.equals(Void.TYPE)) {
                                            cuz.A04.put(returnType, method6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C25753ClN clN = new C25753ClN();
            C24467C5h[] c5hArr2 = cuz.A06;
            int i5 = 0;
            boolean A1D = C108975cc.A1D(r3, 10);
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Lnet/minidev/asm/BeansAccess<L");
            String str3 = cuz.A03;
            A102.append(str3);
            String A0y = AnonymousClass000.A0y(";>;", A102);
            String str4 = cuz.A01;
            String str5 = C26217Cuz.A07;
            clN.A0D = 50;
            clN.A00 = 33;
            C26280Cwb cwb = clN.A0V;
            cwb.A03 = 50;
            cwb.A05 = str4;
            clN.A0C = C26280Cwb.A03(str4, cwb, 7).A02;
            if (A0y != null) {
                clN.A09 = cwb.A0A(A0y);
            }
            if (str5 == null) {
                i = 0;
            } else {
                i = C26280Cwb.A03(str5, cwb, 7).A02;
            }
            clN.A0B = i;
            C26250Cvp A01 = clN.A01("<init>", "()V", (String) null, (String[]) null, 1);
            A01.A0B(25, 0);
            int i6 = 0;
            A01.A0F(str5, "<init>", "()V", 183, false);
            A01.A07(177);
            A01.A0A(1, 1);
            C25753ClN clN2 = clN;
            C26250Cvp A012 = clN2.A01("set", "(Ljava/lang/Object;ILjava/lang/Object;)V", (String) null, (String[]) null, 1);
            if (r3 != 0) {
                if (r3 > 14) {
                    A012.A0B(21, 2);
                    C26026Cqk[] A03 = A03(r3);
                    ? obj2 = new Object();
                    A012.A0I(obj2, A03, 0, A03.length - 1);
                    int i7 = 0;
                    int i8 = 0;
                    do {
                        C24467C5h c5h = c5hArr2[i7];
                        i6++;
                        A012.A0G(A03[i8]);
                        if (c5h.A02 == null && c5h.A03 == null) {
                            A012.A07(177);
                        } else {
                            C26217Cuz.A00(c5h, cuz, A012);
                        }
                        i7++;
                        i8 = i6;
                    } while (i7 < r3);
                    A012.A0G(obj2);
                } else {
                    C26026Cqk[] A032 = A03(r3);
                    int i9 = 0;
                    int i10 = 0;
                    do {
                        C24467C5h c5h2 = c5hArr2[i9];
                        C26217Cuz.A03(A032[i10], A012, i10);
                        C26217Cuz.A00(c5h2, cuz, A012);
                        A012.A0G(A032[i10]);
                        A012.A0J((Object[]) null, 3, (Object[]) null, 0, 0);
                        i10++;
                        i9++;
                    } while (i9 < r3);
                }
            }
            C26217Cuz.A01(cuz, A012);
            A012.A0A(0, 0);
            C26250Cvp A013 = clN.A01("get", "(Ljava/lang/Object;I)Ljava/lang/Object;", (String) null, (String[]) null, 1);
            int i11 = 192;
            if (r3 == 0) {
                i2 = 0;
                str = null;
                A013.A0J((Object[]) null, 3, (Object[]) null, 0, 0);
            } else if (r3 > 14) {
                A013.A0B(21, 2);
                C26026Cqk[] A033 = A03(r3);
                ? obj3 = new Object();
                A013.A0I(obj3, A033, 0, A033.length - 1);
                int i12 = 0;
                do {
                    C24467C5h c5h3 = c5hArr2[i5];
                    int i13 = i12 + 1;
                    A013.A0G(A033[i12]);
                    i2 = 0;
                    cvp = A013;
                    cvp.A0J((Object[]) null, 3, (Object[]) null, 0, 0);
                    if (c5h3.A02 == null && c5h3.A03 == null) {
                        A013.A07(1);
                    } else {
                        A013.A0B(25, 1);
                        A013.A0C(i11, str3);
                        C26263Cw8 A034 = C26263Cw8.A03(c5h3.A00);
                        if ((c5h3.A04 == null && c5h3.A03 == null) || (method2 = c5h3.A03) == null) {
                            A013.A0D(180, str3, c5h3.A01, A034.A06());
                        } else {
                            A013.A0F(str3, method2.getName(), C26263Cw8.A02(method2), 182, false);
                        }
                        A02(A013, A034);
                    }
                    A013.A07(MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
                    i5++;
                    i12 = i13;
                    i11 = 192;
                } while (i5 < r3);
                A013.A0G(obj3);
                str = null;
                cvp.A0J((Object[]) null, 3, (Object[]) null, 0, 0);
            } else {
                C26026Cqk[] A035 = A03(r3);
                int i14 = 0;
                do {
                    C24467C5h c5h4 = c5hArr2[i14];
                    C26217Cuz.A03(A035[i5], A013, i5);
                    A013.A0B(25, 1);
                    A013.A0C(192, str3);
                    C26263Cw8 A036 = C26263Cw8.A03(c5h4.A00);
                    if ((c5h4.A04 == null && c5h4.A03 == null) || (method = c5h4.A03) == null) {
                        A013.A0D(180, str3, c5h4.A01, A036.A06());
                    } else {
                        A013.A0F(str3, method.getName(), C26263Cw8.A02(method), 182, false);
                    }
                    A02(A013, A036);
                    A013.A07(MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
                    A013.A0G(A035[i5]);
                    i2 = 0;
                    str = null;
                    A013.A0J((Object[]) null, 3, (Object[]) null, 0, 0);
                    i5++;
                    i14++;
                } while (i14 < r3);
            }
            C26217Cuz.A01(cuz, A013);
            A013.A0A(i2, i2);
            int i15 = 153;
            if (!A1D) {
                C26250Cvp A014 = clN.A01("set", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", str, (String[]) null, 1);
                C26026Cqk[] A037 = A03(r3);
                int i16 = 0;
                for (C24467C5h c5h5 : c5hArr2) {
                    A014.A0B(25, 2);
                    A014.A0E(c5h5.A01);
                    C26250Cvp cvp2 = A014;
                    cvp2.A0F("java/lang/String", "equals", "(Ljava/lang/Object;)Z", 182, false);
                    A014.A0H(A037[i16], 153);
                    C26217Cuz.A00(c5h5, cuz, A014);
                    A014.A0G(A037[i16]);
                    cvp2.A0J((Object[]) null, 3, (Object[]) null, 0, 0);
                    i16++;
                }
                C26217Cuz.A02(cuz, A014);
                int i17 = 0;
                A014.A0A(0, 0);
                C26250Cvp A015 = clN2.A01("get", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", (String) null, (String[]) null, 1);
                C26026Cqk[] A038 = A03(r3);
                int i18 = 0;
                while (i17 < r3) {
                    C24467C5h c5h6 = c5hArr2[i17];
                    A015.A0B(25, 2);
                    A015.A0E(c5h6.A01);
                    C26250Cvp cvp3 = A015;
                    cvp3.A0F("java/lang/String", "equals", "(Ljava/lang/Object;)Z", 182, false);
                    A015.A0H(A038[i18], i15);
                    A015.A0B(25, 1);
                    A015.A0C(192, str3);
                    C26263Cw8 A039 = C26263Cw8.A03(c5h6.A00);
                    if ((c5h6.A04 == null && c5h6.A03 == null) || (method3 = c5h6.A03) == null) {
                        A015.A0D(180, str3, c5h6.A01, A039.A06());
                    } else {
                        cvp3.A0F(str3, method3.getName(), C26263Cw8.A02(method3), 182, false);
                    }
                    A02(A015, A039);
                    A015.A07(MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
                    A015.A0G(A038[i18]);
                    cvp3.A0J((Object[]) null, 3, (Object[]) null, 0, 0);
                    i18++;
                    i17++;
                    i15 = 153;
                }
                C26217Cuz.A02(cuz, A015);
                A015.A0A(0, 0);
            }
            C26250Cvp A016 = clN.A01("newInstance", "()Ljava/lang/Object;", (String) null, (String[]) null, 1);
            A016.A0C(187, str3);
            A016.A07(89);
            A016.A0F(str3, "<init>", "()V", 183, false);
            A016.A07(MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
            A016.A0A(2, 1);
            cls3 = cuz.A05.A00(cuz.A00, clN.A02());
        }
        try {
            cls3.newInstance();
            throw AnonymousClass000.A0s("setAccessor");
        } catch (Exception e) {
            throw BE6.A0o(AnonymousClass001.A1H("Error constructing accessor class: ", concat, AnonymousClass000.A10()), e);
        }
    }

    public static void A02(C26250Cvp cvp, C26263Cw8 cw8) {
        boolean z;
        int i;
        String str;
        String str2;
        int i2 = cw8.A00;
        if (i2 != 12) {
            switch (i2) {
                case 1:
                    str = "(Z)Ljava/lang/Boolean;";
                    z = false;
                    i = 184;
                    str2 = "java/lang/Boolean";
                    break;
                case 2:
                    str = "(C)Ljava/lang/Character;";
                    z = false;
                    i = 184;
                    str2 = "java/lang/Character";
                    break;
                case 3:
                    str = "(B)Ljava/lang/Byte;";
                    z = false;
                    i = 184;
                    str2 = "java/lang/Byte";
                    break;
                case 4:
                    str = "(S)Ljava/lang/Short;";
                    z = false;
                    i = 184;
                    str2 = "java/lang/Short";
                    break;
                case 5:
                    str = "(I)Ljava/lang/Integer;";
                    z = false;
                    i = 184;
                    str2 = "java/lang/Integer";
                    break;
                case 6:
                    str = "(F)Ljava/lang/Float;";
                    z = false;
                    i = 184;
                    str2 = "java/lang/Float";
                    break;
                case 7:
                    str = "(J)Ljava/lang/Long;";
                    z = false;
                    i = 184;
                    str2 = "java/lang/Long";
                    break;
                case 8:
                    str = "(D)Ljava/lang/Double;";
                    z = false;
                    i = 184;
                    str2 = "java/lang/Double";
                    break;
                default:
                    return;
            }
            cvp.A0F(str2, "valueOf", str, i, z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.Cqk[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C26026Cqk[] A03(int r3) {
        /*
            X.Cqk[] r2 = new X.C26026Cqk[r3]
            r1 = 0
        L_0x0003:
            if (r1 >= r3) goto L_0x000f
            X.Cqk r0 = new X.Cqk
            r0.<init>()
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0003
        L_0x000f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26213Cus.A03(int):X.Cqk[]");
    }

    public C26213Cus() {
        throw AnonymousClass04E.createAndThrow();
    }

    public static String A00(String str) {
        int length = str.length();
        char[] cArr = new char[(length + 3)];
        cArr[0] = 'g';
        cArr[1] = 'e';
        cArr[2] = 't';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[3] = charAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 3] = str.charAt(i);
        }
        return new String(cArr);
    }
}
