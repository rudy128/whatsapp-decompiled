package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.184  reason: invalid class name */
public abstract class AnonymousClass184 implements Cloneable {
    public static final AnonymousClass186 Companion = new Object();
    public static final C18180vt DEFAULT_SAMPLING_RATE = new C18180vt(1, 20, 20, false);
    public static final int NOT_ALLOWED_PS_ID = -1;
    public final int bufferChannel;
    public final int code;
    public final int psId;
    public final C18180vt samplingRate;

    public AnonymousClass184(int i, C18180vt r3, int i2, int i3) {
        C18070vi.A0d(r3, 2);
        this.code = i;
        this.samplingRate = r3;
        this.bufferChannel = i2;
        this.psId = i3;
    }

    public static C18180vt A01() {
        return new C18180vt(1, 1, 1, false);
    }

    public static C18180vt A02() {
        return new C18180vt(1, 1, 1, false);
    }

    public static ArrayList A0U(Object obj) {
        return AnonymousClass1ZU.A06(obj);
    }

    public static ArrayList A0V(Object obj, ArrayList arrayList) {
        if (arrayList != null) {
            arrayList.add(obj);
            return arrayList;
        }
        return AnonymousClass1ZU.A06(obj);
    }

    public abstract Map getFieldsMap();

    public abstract void serialize(C107425Zq r1);

    public static C59552mU A00(Object obj, String str, List list) {
        List singletonList = Collections.singletonList(obj);
        C18070vi.A0X(singletonList);
        return new C59552mU(str, ".nonnull", list, singletonList);
    }

    public static void A0W(Object obj, StringBuilder sb) {
        AnonymousClass186.A00(obj, "messageType", sb);
    }

    public static Integer A03(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 1;
    }

    public static Integer A04(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 2;
    }

    public static Integer A05(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 3;
    }

    public static Integer A06(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 4;
    }

    public static Integer A07(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 5;
    }

    public static Integer A08(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 6;
    }

    public static Integer A09(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 7;
    }

    public static Integer A0A(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 8;
    }

    public static Integer A0B(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 9;
    }

    public static Integer A0C(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 10;
    }

    public static Integer A0D(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 11;
    }

    public static Integer A0E(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 12;
    }

    public static Integer A0F(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 13;
    }

    public static Integer A0G(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 14;
    }

    public static Integer A0H(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 15;
    }

    public static Integer A0I(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 16;
    }

    public static Integer A0J(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 17;
    }

    public static Integer A0K(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 18;
    }

    public static Integer A0L(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 19;
    }

    public static Integer A0M(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 20;
    }

    public static Integer A0N(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 21;
    }

    public static Integer A0O(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 22;
    }

    public static Integer A0P(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 23;
    }

    public static Integer A0Q(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return 24;
    }

    public static Object A0R(Map map, int i) {
        map.put(Integer.valueOf(i), (Object) null);
        return null;
    }

    public static String A0S(Object obj, String str, StringBuilder sb) {
        AnonymousClass186.A00(obj, str, sb);
        sb.append("}");
        String obj2 = sb.toString();
        C18070vi.A0X(obj2);
        return obj2;
    }

    public static String A0T(String str, StringBuilder sb) {
        sb.append(str);
        sb.append("}");
        String obj = sb.toString();
        C18070vi.A0X(obj);
        return obj;
    }

    public static void A0X(Map map, int i) {
        map.put(Integer.valueOf(i), (Object) null);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }

    public final C18180vt getSamplingRate() {
        return this.samplingRate;
    }

    public List validate() {
        return C18460wS.A00;
    }
}
