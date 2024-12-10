package X;

import java.util.List;

/* renamed from: X.2ln  reason: invalid class name and case insensitive filesystem */
public final class C59122ln {
    public final AnonymousClass64X A00;
    public final List A01;

    public C59122ln(AnonymousClass64X r2, List list) {
        C18070vi.A0d(list, 2);
        this.A00 = r2;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59122ln) {
                C59122ln r5 = (C59122ln) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaJobEventBundle(mediaUpload2=");
        A10.append(this.A00);
        A10.append(", mediaUploadSlaList=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
