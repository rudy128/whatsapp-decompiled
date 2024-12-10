package X;

import java.io.File;

/* renamed from: X.3x4  reason: invalid class name and case insensitive filesystem */
public final class C80393x4 extends AnonymousClass4EQ {
    public final File A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C80393x4) {
                C80393x4 r5 = (C80393x4) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0L(this.A00), this.A01);
    }

    public C80393x4(File file, boolean z) {
        this.A00 = file;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DownloadableThumbnailFileListItem(file=");
        A10.append(this.A00);
        A10.append(", selected=");
        return C17900vP.A0F(A10, this.A01);
    }
}
