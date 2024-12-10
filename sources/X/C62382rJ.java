package X;

import java.util.Arrays;

/* renamed from: X.2rJ  reason: invalid class name and case insensitive filesystem */
public final class C62382rJ {
    public static final C62382rJ A02 = new C62382rJ(AnonymousClass2R4.REMOVE, new byte[]{2});
    public static final C62382rJ A03 = new C62382rJ(AnonymousClass2R4.SET, new byte[]{1});
    public final AnonymousClass2R4 A00;
    public final byte[] A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62382rJ)) {
            return false;
        }
        C62382rJ r4 = (C62382rJ) obj;
        return Arrays.equals(this.A01, r4.A01) && this.A00 == r4.A00;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + Arrays.hashCode(this.A01);
    }

    public C62382rJ(AnonymousClass2R4 r1, byte[] bArr) {
        this.A01 = bArr;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncdOperation{bytes=");
        String arrays = Arrays.toString(this.A01);
        C18070vi.A0X(arrays);
        A10.append(arrays);
        A10.append(", syncdOperation=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }
}
