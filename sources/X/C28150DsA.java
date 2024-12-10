package X;

import java.util.Map;

/* renamed from: X.DsA  reason: case insensitive filesystem */
public final class C28150DsA extends AnonymousClass11G implements C22821Di {
    public static final C28150DsA A00 = new C28150DsA();

    public C28150DsA() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder A0K = C18070vi.A0K(entry);
        BE8.A1E(A0K, C17880vN.A0x(entry));
        return C17890vO.A0V(entry.getValue(), A0K);
    }
}
