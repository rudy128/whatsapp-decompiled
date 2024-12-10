package X;

/* renamed from: X.6zV  reason: invalid class name and case insensitive filesystem */
public final class C139826zV {
    public final Integer A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C139826zV) {
                C139826zV r5 = (C139826zV) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A03 = AnonymousClass3MX.A03(this.A01);
        Integer num = this.A00;
        return A03 + C72453Mb.A0E(num, A00(num));
    }

    public C139826zV(Integer num, boolean z) {
        this.A01 = z;
        this.A00 = num;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CANCEL";
            case 2:
                return "DELETE";
            case 3:
                return "DONE";
            default:
                return "NONE";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MusicEditorState(isDialogVisible=");
        A10.append(this.A01);
        A10.append(", lastAction=");
        return C17900vP.A0B(A00(this.A00), A10);
    }
}
