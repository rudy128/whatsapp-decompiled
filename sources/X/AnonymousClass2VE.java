package X;

import java.util.Map;

/* renamed from: X.2VE  reason: invalid class name */
public abstract class AnonymousClass2VE {
    public static final void A00(Object obj, AnonymousClass20E r5) {
        boolean isInstance;
        C18070vi.A0d(r5, 0);
        Class cls = ((AnonymousClass20F) r5).A00;
        Class cls2 = cls;
        Map map = AnonymousClass20F.A02;
        C18070vi.A0z(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Number number = (Number) map.get(cls);
        if (number != null) {
            isInstance = C41681wt.A09(obj, number.intValue());
        } else {
            if (cls.isPrimitive()) {
                cls2 = AnonymousClass20W.A01(new AnonymousClass20F(cls));
            }
            isInstance = cls2.isInstance(obj);
        }
        if (isInstance) {
            C18070vi.A0z(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Value cannot be cast to ");
        throw new ClassCastException(AnonymousClass000.A0y(C60662oP.A00(cls), A10));
    }
}
