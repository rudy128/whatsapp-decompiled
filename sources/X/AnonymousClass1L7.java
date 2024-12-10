package X;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.UserManager;
import java.io.File;

/* renamed from: X.1L7  reason: invalid class name */
public class AnonymousClass1L7 {
    public boolean A00;
    public final AnonymousClass118 A01;
    public final AnonymousClass00H A02 = new C18150vq((Object) null, new C70943Dc(this, 3));
    public final C219217x A03;
    public final C19830z4 A04;
    public final AnonymousClass1L5 A05;

    private File A00() {
        String str;
        AnonymousClass00H r5 = this.A02;
        File file = (File) r5.get();
        if (!this.A00) {
            return file;
        }
        AnonymousClass1L5 r3 = this.A05;
        AnonymousClass1L6 r2 = r3.A00;
        if (r2 != null) {
            C62562rb A0C = ((C64012u4) r2.A00.get()).A0C(((AnonymousClass10b) r2.A01.get()).A00());
            if (A0C != null && A0C.A09) {
                return file;
            }
            File file2 = (File) r5.get();
            C18070vi.A0d(file2, 0);
            AnonymousClass10b r0 = r3.A01;
            if (r0 != null) {
                String A002 = r0.A00();
                if (A002 == null || A002.length() == 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                String absolutePath = file2.getAbsolutePath();
                C18070vi.A0X(absolutePath);
                StringBuilder sb = new StringBuilder();
                sb.append("accounts");
                sb.append(File.separatorChar);
                sb.append(A002);
                return new File(AnonymousClass1YF.A0K(sb.toString(), absolutePath));
            }
            str = "activeAccountFileHandler";
        } else {
            str = "multiAccountExternalStorageBridge";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static boolean A02() {
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            return false;
        }
        if (!UserManager.supportsMultipleUsers() || Build.VERSION.PREVIEW_SDK_INT > 0 || i >= 30) {
            return true;
        }
        return false;
    }

    public File A03() {
        return new File((File) this.A02.get(), "Backups");
    }

    public File A04() {
        return new File((File) this.A02.get(), "Databases");
    }

    public File A07(File file) {
        String substring;
        if (file == null) {
            return null;
        }
        if (!file.isAbsolute()) {
            substring = file.getPath();
        } else {
            int indexOf = file.getAbsolutePath().indexOf("Media/WhatsApp ");
            if (A0D(file) || indexOf <= 0) {
                return file;
            }
            substring = file.getAbsolutePath().substring(indexOf);
        }
        return A08(substring);
    }

    public File A08(String str) {
        File file;
        if (str.contains("Media/WhatsApp ")) {
            file = A00();
        } else {
            file = (File) this.A02.get();
        }
        return new File(file, str);
    }

    public String A0A(String str) {
        File file = (File) this.A02.get();
        if (this.A00 && str.contains("Media/WhatsApp ")) {
            file = A00();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        sb.append("/");
        return str.replace(sb.toString(), "");
    }

    public void A0B(String str) {
        C19830z4.A00(this.A04).putString("external_storage_type", str).commit();
    }

    public boolean A0C() {
        return "scoped".equals(((SharedPreferences) this.A04.A00.get()).getString("external_storage_type", (String) null));
    }

    public AnonymousClass1L7(AnonymousClass118 r4, C219217x r5, C19830z4 r6, AnonymousClass1L5 r7) {
        this.A01 = r4;
        this.A04 = r6;
        this.A03 = r5;
        this.A05 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003c, code lost:
        if ("legacy".equals(r6) == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A01(X.AnonymousClass1L7 r7) {
        /*
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = "WhatsApp"
            java.io.File r5 = new java.io.File
            r5.<init>(r1, r0)
            X.0z4 r0 = r7.A04
            X.00H r0 = r0.A00
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "external_storage_type"
            r0 = 0
            java.lang.String r6 = r2.getString(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "externaldir/saved storage is "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = A02()
            java.lang.String r4 = "legacy"
            if (r0 != 0) goto L_0x0042
            boolean r0 = r4.equals(r6)
            if (r0 != 0) goto L_0x0041
        L_0x003e:
            r7.A0B(r4)
        L_0x0041:
            return r5
        L_0x0042:
            java.io.File r3 = r7.A06()
            if (r3 != 0) goto L_0x004e
            java.lang.String r0 = "externaldir/scoped dir is supported, but isn't provided by the system"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r5
        L_0x004e:
            java.lang.String r2 = "scoped"
            boolean r0 = r2.equals(r6)
            if (r0 != 0) goto L_0x006a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L_0x006b
            boolean r0 = X.AnonymousClass2TB.A00()
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "externaldir/switching to scoped since os disabled legacy storage"
        L_0x0064:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r7.A0B(r2)
        L_0x006a:
            return r3
        L_0x006b:
            X.17x r0 = r7.A03
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x007c
            boolean r0 = r5.exists()
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = "externaldir/no legacy root so switching to scoped"
            goto L_0x0064
        L_0x007c:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L_0x003e
            if (r6 != 0) goto L_0x003e
            java.lang.String r0 = "externaldir/it is a new installation so switching to scoped"
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1L7.A01(X.1L7):java.io.File");
    }

    public File A05() {
        return new File(A00(), "Media");
    }

    public File A06() {
        File[] externalMediaDirs;
        File file;
        String str;
        if (!A02() || (externalMediaDirs = this.A01.A00.getExternalMediaDirs()) == null || externalMediaDirs.length <= 0 || (file = externalMediaDirs[0]) == null) {
            return null;
        }
        File file2 = new File(file, "WhatsApp");
        AnonymousClass1L5 r1 = this.A05;
        C199210d r0 = r1.A02;
        if (r0 != null) {
            if (r0.A00().A05()) {
                AnonymousClass1L6 r02 = r1.A00;
                if (r02 == null) {
                    str = "multiAccountExternalStorageBridge";
                } else if (((C64012u4) r02.A00.get()).A0K()) {
                    this.A00 = true;
                    AnonymousClass10b r03 = r1.A01;
                    if (r03 != null) {
                        String A002 = r03.A00();
                        if (A002 == null || A002.length() == 0) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("accounts");
                        sb.append(File.separatorChar);
                        sb.append(A002);
                        return new File(file2, sb.toString());
                    }
                    str = "activeAccountFileHandler";
                }
            }
            return file2;
        }
        str = "multiAccountFileSystemManager";
        C18070vi.A11(str);
        throw null;
    }

    public String A09(File file) {
        if (file.isAbsolute()) {
            return A0A(file.getAbsolutePath());
        }
        return file.getPath();
    }

    public boolean A0D(File file) {
        if (file.getAbsolutePath().startsWith(((File) this.A02.get()).getAbsolutePath()) || file.getAbsolutePath().startsWith(A05().getAbsolutePath())) {
            return true;
        }
        return false;
    }
}
