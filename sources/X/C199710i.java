package X;

import java.io.File;
import java.util.Set;

/* renamed from: X.10i  reason: invalid class name and case insensitive filesystem */
public final class C199710i extends C17920vR {
    public final C17950vU A00;
    public final C17930vS A01;
    public final String A02;
    public final Set A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C199710i(C17950vU r2, C17930vS r3, String str, Set set) {
        super(r2);
        C18070vi.A0d(set, 1);
        C18070vi.A0d(r3, 2);
        this.A03 = set;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = str;
    }

    public final boolean A05() {
        boolean z = false;
        String str = this.A02;
        if (str == null || str.length() == 0) {
            z = true;
        }
        return !z;
    }

    private final String A00() {
        String str = this.A02;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("accounts");
        sb.append(File.separatorChar);
        sb.append(str);
        return sb.toString();
    }

    public static final String A01(C199710i r2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(r2.A00());
        sb.append(File.separatorChar);
        sb.append(str);
        return sb.toString();
    }

    public File A02() {
        if (!A05()) {
            return new File(this.A00.getApplicationInfo().dataDir);
        }
        return new File(this.A00.getApplicationInfo().dataDir, A00());
    }

    public File A03() {
        if (!A05()) {
            return this.A01.A01();
        }
        File file = new File(this.A00.getApplicationInfo().dataDir, A01(this, "files"));
        if (file.exists()) {
            return file;
        }
        file.mkdirs();
        return file;
    }

    public File A04(String str) {
        if (!A05() || this.A03.contains(str)) {
            File databasePath = this.A01.A00.getDatabasePath(str);
            C18070vi.A0X(databasePath);
            return databasePath;
        }
        File file = new File(this.A00.getApplicationInfo().dataDir, A01(this, "databases"));
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str);
    }
}
