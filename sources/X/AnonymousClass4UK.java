package X;

/* renamed from: X.4UK  reason: invalid class name */
public final class AnonymousClass4UK {
    public final C143887Fe A00;
    public final AnonymousClass4DX A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UK) {
                AnonymousClass4UK r5 = (AnonymousClass4UK) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A0L = (AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A00)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A0L + i;
    }

    public AnonymousClass4UK(C143887Fe r1, AnonymousClass4DX r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PreviewLoadingInfo(state=");
        A10.append(this.A01);
        A10.append(", webPageInfo=");
        A10.append(this.A00);
        A10.append(", host=");
        return C17900vP.A0B(this.A02, A10);
    }
}
