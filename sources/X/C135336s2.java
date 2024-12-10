package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.6s2  reason: invalid class name and case insensitive filesystem */
public final class C135336s2 {
    public final ArrayList A00;
    public final int A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135336s2) {
                C135336s2 r5 = (C135336s2) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, ((C17900vP.A00(this.A02) * 31) + this.A01) * 31);
    }

    public C135336s2(ArrayList arrayList, int i, String str) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = arrayList;
    }

    public String toString() {
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[3];
        objArr[0] = this.A02;
        AnonymousClass000.A1M(objArr, this.A01);
        objArr[2] = this.A00;
        return C108955ca.A12(locale, "ModelMetadata: name=%s version=%d assets=%s", Arrays.copyOf(objArr, 3));
    }
}
