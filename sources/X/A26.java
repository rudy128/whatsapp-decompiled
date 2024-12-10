package X;

import java.io.File;

public final class A26 {
    public Long A00;
    public final int A01;
    public final long A02;
    public final File A03;
    public final Long A04;
    public final String A05;

    public A26(String str, int i) {
        this((File) null, (Long) null, str, i, 0);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A26) {
                A26 a26 = (A26) obj;
                if (!C18070vi.A18(this.A05, a26.A05) || this.A01 != a26.A01 || this.A02 != a26.A02 || !C18070vi.A18(this.A04, a26.A04) || !C18070vi.A18(this.A03, a26.A03) || !C18070vi.A18(this.A00, a26.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass001.A0K(this.A02, (C17880vN.A03(this.A05) + this.A01) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + C17880vN.A02(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BackupProducerResult(name=");
        A10.append(this.A05);
        A10.append(", status=");
        A10.append(this.A01);
        A10.append(", totalSizeInBytes=");
        A10.append(this.A02);
        A10.append(", mediaSizeInBytes=");
        A10.append(this.A04);
        A10.append(", file=");
        A10.append(this.A03);
        A10.append(", durationMs=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public A26(File file, Long l, String str, int i, long j) {
        this.A05 = str;
        this.A01 = i;
        this.A02 = j;
        this.A04 = l;
        this.A03 = file;
        this.A00 = null;
    }
}
