package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

/* renamed from: X.6Lr  reason: invalid class name and case insensitive filesystem */
public class C121836Lr extends A34 {
    public Exception A00;
    public final C218617r A01;
    public final AnonymousClass892 A02;
    public final String A03;
    public final String A04;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        String str;
        FileOutputStream fileOutputStream;
        try {
            URL url = new URL(this.A04);
            url.openConnection().connect();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
            try {
                C218617r r3 = this.A01;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(C26511Sk.A0K());
                String str2 = this.A03;
                if (str2.equals("image/gif")) {
                    str = ".gif";
                } else if (str2.equals("video/mp4")) {
                    str = ".mp4";
                } else {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("Unexpected info type (");
                    A102.append(str2);
                    throw AnonymousClass000.A0o(")", A102);
                }
                File A0a = r3.A0a(AnonymousClass000.A0y(str, A10));
                fileOutputStream = new FileOutputStream(A0a.getAbsolutePath());
                byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                for (int read = bufferedInputStream.read(bArr); read != -1; read = bufferedInputStream.read(bArr)) {
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                bufferedInputStream.close();
                return A0a;
            } catch (Throwable th) {
                bufferedInputStream.close();
                throw th;
            }
            throw th;
        } catch (IOException e) {
            this.A00 = e;
            Log.e((Throwable) e);
            return null;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        File file = (File) obj;
        if (file != null) {
            this.A02.BuY(file, this.A04, (byte[]) null);
            return;
        }
        Exception exc = this.A00;
        if (exc != null) {
            this.A02.onFailure(exc);
        }
    }

    public C121836Lr(C218617r r1, AnonymousClass892 r2, String str, String str2) {
        this.A01 = r1;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = r2;
    }
}
