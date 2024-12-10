package X;

import android.content.Context;
import android.content.ContextWrapper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* renamed from: X.0vU  reason: invalid class name and case insensitive filesystem */
public final class C17950vU extends ContextWrapper {
    public static final C18060vh A03 = new Object();
    public static volatile C17950vU A04;
    public final C18100vl A00 = new C18110vm(new C71023Dm(this, 0));
    public final C17930vS A01 = new C17920vR(this);
    public volatile boolean A02;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.0vS, X.0vR] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17950vU(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
    }

    public final void A01() {
        this.A02 = true;
    }

    public File getDatabasePath(String str) {
        C18070vi.A0d(str, 0);
        if (this.A02) {
            return ((C199710i) this.A00.getValue()).A04(str);
        }
        File databasePath = this.A01.A00.getDatabasePath(str);
        C18070vi.A0X(databasePath);
        return databasePath;
    }

    public File getDir(String str, int i) {
        C17930vS r0;
        C18070vi.A0d(str, 0);
        if (!this.A02) {
            r0 = this.A01;
        } else {
            C199710i r2 = (C199710i) this.A00.getValue();
            if (!r2.A05()) {
                r0 = r2.A01;
            } else {
                File file = new File(r2.A00.getApplicationInfo().dataDir, C199710i.A01(r2, str));
                if (!file.exists()) {
                    file.mkdirs();
                }
                file.setExecutable(true, true);
                file.setReadable(true, true);
                file.setWritable(true, true);
                return file;
            }
        }
        return r0.A02(str, i);
    }

    public File getFileStreamPath(String str) {
        File A032;
        C17930vS r0;
        C18070vi.A0d(str, 0);
        if (!this.A02) {
            r0 = this.A01;
        } else {
            C199710i r1 = (C199710i) this.A00.getValue();
            if (!r1.A05()) {
                r0 = r1.A01;
            } else {
                A032 = r1.A03();
                return new File(A032, str);
            }
        }
        A032 = r0.A01();
        return new File(A032, str);
    }

    public FileInputStream openFileInput(String str) {
        File A032;
        C18070vi.A0d(str, 0);
        if (!this.A02) {
            FileInputStream openFileInput = this.A01.A00.openFileInput(str);
            C18070vi.A0X(openFileInput);
            return openFileInput;
        }
        C199710i r1 = (C199710i) this.A00.getValue();
        if (!r1.A05()) {
            A032 = r1.A01.A01();
        } else {
            A032 = r1.A03();
        }
        return new FileInputStream(new File(A032, str));
    }

    public FileOutputStream openFileOutput(String str, int i) {
        C17920vR r1;
        File filesDir;
        C18070vi.A0d(str, 0);
        if (!this.A02) {
            r1 = this.A01;
        } else {
            r1 = (C17920vR) this.A00.getValue();
        }
        boolean z = false;
        if ((32768 & i) != 0) {
            z = true;
        }
        if (r1 instanceof C199710i) {
            filesDir = ((C199710i) r1).A03();
        } else {
            filesDir = r1.A00.getFilesDir();
        }
        File file = new File(filesDir, str);
        if (i == 0) {
            file.setExecutable(true, true);
            file.setReadable(true, true);
            file.setWritable(true, true);
        }
        return new FileOutputStream(file, z);
    }

    public static final synchronized void A00(C17950vU r3) {
        synchronized (C17950vU.class) {
            synchronized (A03) {
                A04 = r3;
            }
        }
    }

    public File getCacheDir() {
        C17930vS r0;
        if (!this.A02) {
            r0 = this.A01;
        } else {
            C199710i r2 = (C199710i) this.A00.getValue();
            if (!r2.A05()) {
                r0 = r2.A01;
            } else {
                File file = new File(r2.A00.getApplicationInfo().dataDir, C199710i.A01(r2, "cache"));
                if (file.exists()) {
                    return file;
                }
                file.mkdirs();
                return file;
            }
        }
        return r0.A00();
    }

    public File getFilesDir() {
        if (!this.A02) {
            return this.A01.A01();
        }
        return ((C199710i) this.A00.getValue()).A03();
    }
}
