package X;

import java.io.File;

/* renamed from: X.Cb3  reason: case insensitive filesystem */
public final class C25209Cb3 {
    public final C25550Cho A00;
    public final C441822l A01;
    public final File A02;
    public final AnonymousClass1OS A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25209Cb3) {
                C25209Cb3 cb3 = (C25209Cb3) obj;
                if (!C18070vi.A18(this.A01, cb3.A01) || !C18070vi.A18(this.A02, cb3.A02) || !C18070vi.A18(this.A00, cb3.A00) || !C18070vi.A18(this.A03, cb3.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A03, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A01))));
    }

    public C25209Cb3(C25550Cho cho, C441822l r2, File file, AnonymousClass1OS r4) {
        this.A01 = r2;
        this.A02 = file;
        this.A00 = cho;
        this.A03 = r4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PttTranscriptionRequest(message=");
        A10.append(this.A01);
        A10.append(", input=");
        A10.append(this.A02);
        A10.append(", locale=");
        A10.append(this.A00);
        A10.append(", onTimingReceived=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
