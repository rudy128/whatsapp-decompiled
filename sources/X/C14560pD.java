package X;

import java.util.List;

/* renamed from: X.0pD  reason: invalid class name and case insensitive filesystem */
public final class C14560pD extends AnonymousClass11G implements AnonymousClass1OS {
    public static final C14560pD A00 = new C14560pD();

    public C14560pD() {
        super(2);
    }

    public static final List A00(AnonymousClass0OP r5) {
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Float.valueOf(r5.A03.BRr());
        if (r5.A04.getValue() == AnonymousClass0CI.Vertical) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        return AnonymousClass1ZU.A08(objArr);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return A00((AnonymousClass0OP) obj2);
    }
}
