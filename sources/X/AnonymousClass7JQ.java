package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.7JQ  reason: invalid class name */
public final class AnonymousClass7JQ implements AnonymousClass85P {
    public final Uri A00;
    public final File A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7JQ) {
                AnonymousClass7JQ r5 = (AnonymousClass7JQ) obj;
                if (this.A02 != r5.A02 || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A00, AnonymousClass3MX.A03(this.A02)));
    }

    public AnonymousClass7JQ(Uri uri, File file, boolean z) {
        C18070vi.A0k(uri, file);
        this.A02 = z;
        this.A00 = uri;
        this.A01 = file;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ViewCreatedResult(isGif=");
        A10.append(this.A02);
        A10.append(", uri=");
        A10.append(this.A00);
        A10.append(", file=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
