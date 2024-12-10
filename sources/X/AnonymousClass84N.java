package X;

import java.util.Map;

/* renamed from: X.84N  reason: invalid class name */
public final class AnonymousClass84N extends AnonymousClass11G implements AnonymousClass1OS {
    public static final AnonymousClass84N A00 = new AnonymousClass84N();

    public AnonymousClass84N() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        C18070vi.A0h(entry, entry2);
        return Integer.valueOf(C18070vi.A01(C17880vN.A05(entry2.getValue()), C17880vN.A05(entry.getValue())));
    }
}
