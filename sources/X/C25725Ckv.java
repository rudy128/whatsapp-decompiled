package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.Ckv  reason: case insensitive filesystem */
public class C25725Ckv {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C25725Ckv ckv = (C25725Ckv) obj;
            if (this.A02 != ckv.A02 || !this.A01.equals(ckv.A01)) {
                return false;
            }
            String str = this.A00;
            String str2 = ckv.A00;
            return str != null ? str.equals(str2) : str2 == null;
        }
    }

    public C25725Ckv(String str, List list, boolean z) {
        this.A01 = C17880vN.A10(list);
        this.A00 = str;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CaptionsState{availableTextLanguages=");
        A10.append(this.A01);
        A10.append(", selectedTextLanguage='");
        A10.append(this.A00);
        A10.append('\'');
        A10.append(", isEnabled=");
        A10.append(this.A02);
        return C17890vO.A0b(A10);
    }

    public C25725Ckv() {
        this((String) null, Collections.emptyList(), false);
    }
}
