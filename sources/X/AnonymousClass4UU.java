package X;

import java.util.Collection;

/* renamed from: X.4UU  reason: invalid class name */
public final class AnonymousClass4UU {
    public final Integer A00;
    public final String A01;
    public final Collection A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UU) {
                AnonymousClass4UU r5 = (AnonymousClass4UU) obj;
                if (this.A03 != r5.A03 || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A0N = AnonymousClass000.A0N(this.A02, (AnonymousClass3MX.A03(this.A03) + AnonymousClass001.A0k(this.A00)) * 31);
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A0N + i;
    }

    public AnonymousClass4UU(Integer num, String str, Collection collection, boolean z) {
        this.A03 = z;
        this.A00 = num;
        this.A02 = collection;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VoipContactPickerUiState(isVideo=");
        A10.append(this.A03);
        A10.append(", customMultiSelectLimit=");
        A10.append(this.A00);
        A10.append(", jidsToExclude=");
        A10.append(this.A02);
        A10.append(", callLinkToken=");
        return C17900vP.A0B(this.A01, A10);
    }
}
