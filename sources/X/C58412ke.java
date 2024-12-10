package X;

import java.util.HashMap;

/* renamed from: X.2ke  reason: invalid class name and case insensitive filesystem */
public class C58412ke {
    public final C62612rg A00;
    public final HashMap A01;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C58412ke)) {
            return false;
        }
        C58412ke r4 = (C58412ke) obj;
        return this.A00.equals(r4.A00) && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0O(this.A00, 159) * 53);
    }

    public C58412ke(C62612rg r1, HashMap hashMap) {
        this.A00 = r1;
        this.A01 = hashMap;
    }
}
