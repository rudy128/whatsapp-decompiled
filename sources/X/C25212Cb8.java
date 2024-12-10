package X;

import java.util.Arrays;

/* renamed from: X.Cb8  reason: case insensitive filesystem */
public final class C25212Cb8 {
    public final String A00;
    public final String A01;
    public final C25221CbH A02;
    public final Object[] A03;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25212Cb8)) {
            return false;
        }
        C25212Cb8 cb8 = (C25212Cb8) obj;
        return this.A01.equals(cb8.A01) && this.A00.equals(cb8.A00) && this.A02.equals(cb8.A02) && Arrays.equals(this.A03, cb8.A03);
    }

    public int hashCode() {
        return ((this.A01.hashCode() ^ Integer.rotateLeft(this.A00.hashCode(), 8)) ^ Integer.rotateLeft(this.A02.hashCode(), 16)) ^ Integer.rotateLeft(Arrays.hashCode(this.A03), 24);
    }

    public String toString() {
        String str = this.A01;
        String str2 = this.A00;
        C25221CbH cbH = this.A02;
        String arrays = Arrays.toString(this.A03);
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append(" : ");
        A11.append(str2);
        A11.append(" ");
        A11.append(cbH);
        return AnonymousClass001.A1H(" ", arrays, A11);
    }

    public C25212Cb8(String str, String str2, C25221CbH cbH, Object... objArr) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = cbH;
        this.A03 = objArr;
    }
}
