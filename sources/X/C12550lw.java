package X;

import java.util.List;

/* renamed from: X.0lw  reason: invalid class name and case insensitive filesystem */
public final class C12550lw extends AnonymousClass11G implements C22821Di {
    public static final C12550lw A00 = new C12550lw();

    public C12550lw() {
        super(1);
    }

    public static final AnonymousClass0OP A00(List list) {
        AnonymousClass0CI r2;
        C16680sp r0 = AnonymousClass0OP.A05;
        Object obj = list.get(1);
        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.Boolean");
        if (AnonymousClass000.A1Y(obj)) {
            r2 = AnonymousClass0CI.Vertical;
        } else {
            r2 = AnonymousClass0CI.Horizontal;
        }
        Object obj2 = list.get(0);
        C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new AnonymousClass0OP(r2, AnonymousClass000.A04(obj2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return A00((List) obj);
    }
}
