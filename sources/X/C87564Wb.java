package X;

import java.util.Map;

/* renamed from: X.4Wb  reason: invalid class name and case insensitive filesystem */
public abstract class C87564Wb {
    public final C18100vl A00;
    public final Integer[] A01 = new Integer[0];

    public C87564Wb(C87564Wb... r2) {
        this.A00 = AnonymousClass1DF.A01(new AnonymousClass5NM(this, r2));
    }

    public static void A00(AnonymousClass00H r2, Map map, int i) {
        Integer valueOf = Integer.valueOf(i);
        Object obj = r2.get();
        C18070vi.A0X(obj);
        map.put(valueOf, obj);
    }
}
