package X;

import java.util.Arrays;

/* renamed from: X.2lM  reason: invalid class name and case insensitive filesystem */
public final class C58852lM {
    public final int[] A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58852lM)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C58852lM) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public C58852lM(int[] iArr) {
        this.A00 = iArr;
        C17960vV.A0C(iArr.length <= 5);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EmojiIdList(ids=");
        return C17900vP.A0B(Arrays.toString(this.A00), A10);
    }
}
