package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteStatement;
import com.whatsapp.media.job.DeleteMediaFileJob;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.1Ns  reason: invalid class name and case insensitive filesystem */
public class C25311Ns {
    public final C218617r A00;
    public final AnonymousClass118 A01;
    public final C25301Nr A02;
    public final C25291Nq A03;
    public final C18010vc A04;
    public final C25001Mm A05;
    public final AnonymousClass00H A06 = AnonymousClass12Q.A00(C214315y.class);

    public static boolean A02(C25311Ns r4, File file) {
        try {
            C218617r r2 = r4.A00;
            return r2.A0m(file) || r2.A0l(file) || file.getCanonicalPath().startsWith(r2.A08().A0A.getCanonicalPath());
        } catch (IOException e) {
            Log.e("ReferenceCountedFileManager/isExternalManagedMediaFile ", e);
            return false;
        }
    }

    public static int A00(C25311Ns r9, File file, int i) {
        C41851xA BD0;
        int i2;
        C25301Nr r1 = r9.A02;
        String absolutePath = file.getAbsolutePath();
        boolean z = false;
        if (i >= 0) {
            z = true;
        }
        C17960vV.A0D(z);
        C28791au A052 = r1.A00.A05();
        try {
            BD0 = A052.BD0();
            int A002 = r1.A00(absolutePath);
            if (A002 <= i) {
                ((C28801av) A052).A02.A04("media_refs", "path = ?", "DELETE_MEDIA_REF_SQL", new String[]{absolutePath});
            } else {
                C60042nI A0D = ((C28801av) A052).A02.A0D("UPDATE media_refs SET ref_count = ref_count + ? WHERE path = ?", "UPDATE_MEDIA_REF_SQL");
                SQLiteStatement sQLiteStatement = A0D.A00;
                sQLiteStatement.bindLong(1, (long) (-i));
                sQLiteStatement.bindString(2, absolutePath);
                if (A0D.A00() == 0) {
                    i2 = -1;
                    BD0.A00();
                    BD0.close();
                    A052.close();
                    return i2;
                }
            }
            i2 = A002 - i;
            BD0.A00();
            BD0.close();
            A052.close();
            return i2;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public static void A01(C25311Ns r7, File file, int i, boolean z) {
        C41851xA BD0;
        if (!z) {
            i--;
        }
        C25301Nr r1 = r7.A02;
        String absolutePath = file.getAbsolutePath();
        if (i != 0) {
            boolean z2 = false;
            if (i > 0) {
                z2 = true;
            }
            C17960vV.A0D(z2);
            C28791au A052 = r1.A00.A05();
            try {
                BD0 = A052.BD0();
                C23141Ev r5 = ((C28801av) A052).A02;
                C60042nI A0D = r5.A0D("UPDATE media_refs SET ref_count = ref_count + ? WHERE path = ?", "UPDATE_MEDIA_REF_SQL");
                SQLiteStatement sQLiteStatement = A0D.A00;
                sQLiteStatement.bindLong(1, (long) i);
                sQLiteStatement.bindString(2, absolutePath);
                if (A0D.A00() == 0) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("path", absolutePath);
                    contentValues.put("ref_count", Integer.valueOf(i));
                    r5.A05("media_refs", "INSERT_TABLE_MEDIA_REFS", contentValues);
                }
                BD0.A00();
                BD0.close();
                A052.close();
                return;
            } catch (Throwable th) {
                try {
                    A052.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public File A04(String str, String str2) {
        String str3;
        File A0I = this.A00.A0I();
        this.A06.get();
        if ("application/was".equalsIgnoreCase(str2)) {
            str3 = ".was";
        } else {
            str3 = ".webp";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace('/', '-'));
        sb.append(str3);
        return new File(A0I, sb.toString());
    }

    public C25311Ns(C218617r r2, C25001Mm r3, AnonymousClass118 r4, C25301Nr r5, C25291Nq r6, C18010vc r7) {
        this.A01 = r4;
        this.A00 = r2;
        this.A03 = r6;
        this.A05 = r3;
        this.A02 = r5;
        this.A04 = r7;
    }

    public File A03(String str, String str2) {
        File A042 = A04(str, str2);
        if (!A042.exists()) {
            return null;
        }
        A01(this, A042, 1, true);
        return A042;
    }

    public void A05(File file, int i, int i2, boolean z, boolean z2) {
        if (A02(this, file)) {
            int A002 = A00(this, file, i2);
            if (z && A002 < 0) {
                if (z2) {
                    this.A05.A01(new DeleteMediaFileJob(file, i));
                    return;
                }
                Log.i("ReferenceCountedFileManager/deleteManagedFile actually deleting file");
                C25291Nq r0 = this.A03;
                C64062u9.A0Q(file);
                r0.A0B(file, i);
            }
        }
    }

    public void A06(File file, int i, boolean z) {
        if (A02(this, file)) {
            A01(this, file, i, z);
        }
    }

    public void A07(String str, String str2) {
        File A042 = A04(str, str2);
        if (A00(this, A042, 1) < 0) {
            C64062u9.A0Q(A042);
        }
    }
}
