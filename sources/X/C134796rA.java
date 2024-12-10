package X;

import java.util.List;

/* renamed from: X.6rA  reason: invalid class name and case insensitive filesystem */
public final class C134796rA {
    public final String A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134796rA) {
                C134796rA r5 = (C134796rA) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + C17900vP.A00(this.A00);
    }

    public C134796rA(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SettingFetchResult(options=");
        A10.append(this.A01);
        A10.append(", defaultVoiceIdentifier=");
        return C17900vP.A0B(this.A00, A10);
    }
}
