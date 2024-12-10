package X;

import java.util.ArrayList;

/* renamed from: X.Bsg  reason: case insensitive filesystem */
public final class C23946Bsg extends C4S {
    public final ArrayList A00;
    public final DPM A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23946Bsg) {
                C23946Bsg bsg = (C23946Bsg) obj;
                if (!C18070vi.A18(this.A01, bsg.A01) || !C18070vi.A18(this.A00, bsg.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public C23946Bsg(DPM dpm, ArrayList arrayList) {
        this.A01 = dpm;
        this.A00 = arrayList;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FieldErrors(wireType=");
        A10.append(this.A01);
        A10.append(", errors=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
