package X;

/* renamed from: X.AfT  reason: case insensitive filesystem */
public class C21158AfT implements C22470B9c {
    public final int A00;

    public C21158AfT(int i) {
        this.A00 = i;
    }

    public final Object BCF(C29621ca r17, C62672rm r18) {
        String str;
        String str2;
        String str3;
        int i;
        C29621ca r3 = r17;
        C62672rm r2 = r18;
        switch (this.A00) {
            case 0:
                int A17 = C18070vi.A17(r3, r2);
                if (!r2.A09(r3, "range")) {
                    return null;
                }
                String[] strArr = new String[A17];
                strArr[0] = "min";
                Class cls = Long.TYPE;
                Long A0L = C17890vO.A0L();
                Long A0j = AnonymousClass8BU.A0j();
                Number number = (Number) r2.A05(r3, cls, A0L, A0j, (Object) null, strArr, false);
                if (number == null) {
                    return null;
                }
                long longValue = number.longValue();
                String[] strArr2 = new String[A17];
                strArr2[0] = "max";
                return new AnonymousClass9DK(r3, (Long) r2.A05(r3, cls, A0L, A0j, (Object) null, strArr2, false), 0, longValue);
            case 1:
                C18070vi.A0d(r3, 0);
                return r3;
            case 2:
                int A172 = C18070vi.A17(r3, r2);
                if (!r2.A09(r3, "secondary_action")) {
                    return null;
                }
                String[] A1U = AnonymousClass8BS.A1U(A172);
                Class<String> cls2 = String.class;
                Long A0i = AnonymousClass8BU.A0i();
                Long A0j2 = AnonymousClass8BU.A0j();
                str = (String) r2.A05(r3, cls2, A0i, A0j2, (Object) null, A1U, false);
                if (str != null) {
                    String[] strArr3 = new String[A172];
                    strArr3[0] = "universal_link";
                    str2 = (String) r2.A05(r3, cls2, A0i, A0j2, (Object) null, strArr3, false);
                    String[] strArr4 = new String[A172];
                    strArr4[0] = "deep_link";
                    str3 = (String) r2.A05(r3, cls2, A0i, A0j2, (Object) null, strArr4, false);
                    i = 2;
                    break;
                } else {
                    return null;
                }
            default:
                i = C18070vi.A17(r3, r2);
                if (!r2.A09(r3, "primary_action")) {
                    return null;
                }
                String[] A1U2 = AnonymousClass8BS.A1U(i);
                Class<String> cls3 = String.class;
                Long A0i2 = AnonymousClass8BU.A0i();
                Long A0j3 = AnonymousClass8BU.A0j();
                str = (String) r2.A05(r3, cls3, A0i2, A0j3, (Object) null, A1U2, false);
                if (str != null) {
                    String[] strArr5 = new String[i];
                    strArr5[0] = "universal_link";
                    str2 = (String) r2.A05(r3, cls3, A0i2, A0j3, (Object) null, strArr5, false);
                    String[] strArr6 = new String[i];
                    strArr6[0] = "deep_link";
                    str3 = (String) r2.A05(r3, cls3, A0i2, A0j3, (Object) null, strArr6, false);
                    break;
                } else {
                    return null;
                }
        }
        return new C178349Ct(r3, str, str2, str3, i);
    }
}
