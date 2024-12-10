package X;

import java.util.Map;

/* renamed from: X.9vA  reason: invalid class name and case insensitive filesystem */
public abstract class C196499vA {
    public static final C20256ADo A00(C20245ADd aDd, C20245ADd aDd2, Map map) {
        C18070vi.A0d(aDd, 1);
        C20256ADo aDo = (C20256ADo) map.get(AnonymousClass1D6.A01(aDd, aDd2));
        if (aDo != null) {
            return aDo;
        }
        if (aDd2 != null) {
            return (C20256ADo) map.get(AnonymousClass1D6.A01(aDd2, aDd));
        }
        return null;
    }

    public static final C20245ADd A01(AnonymousClass77B r3, int i) {
        return new C20245ADd(r3.A00, ((AD8) r3.A01.get(i)).A00());
    }
}
