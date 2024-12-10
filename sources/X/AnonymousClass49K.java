package X;

import android.content.Intent;
import android.graphics.Bitmap;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;

@Deprecated
/* renamed from: X.49K  reason: invalid class name */
public class AnonymousClass49K extends A34 {
    public final C218617r A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11S A02;
    public final String A03;
    public final WeakReference A04;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        FileOutputStream fileOutputStream;
        Bitmap bitmap = ((Bitmap[]) objArr)[0];
        C17960vV.A07(bitmap);
        File A0a = this.A00.A0a("shared_qr_code.png");
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(A0a);
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, fileOutputStream);
                AnonymousClass1EY.A02(fileOutputStream);
                bitmap.recycle();
                return A0a;
            } catch (FileNotFoundException e) {
                e = e;
                try {
                    Log.e("CreateSharedQrCardImageAsyncTask/shareFailed", e);
                    AnonymousClass1EY.A02(fileOutputStream);
                    bitmap.recycle();
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    AnonymousClass1EY.A02(fileOutputStream2);
                    bitmap.recycle();
                    throw th;
                }
            }
        } catch (FileNotFoundException e2) {
            e = e2;
            fileOutputStream = null;
            Log.e("CreateSharedQrCardImageAsyncTask/shareFailed", e);
            AnonymousClass1EY.A02(fileOutputStream);
            bitmap.recycle();
            return null;
        } catch (Throwable th2) {
            th = th2;
            AnonymousClass1EY.A02(fileOutputStream2);
            bitmap.recycle();
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        File file = (File) obj;
        AnonymousClass1FU r5 = (AnonymousClass1FU) this.A04.get();
        if (r5 != null) {
            r5.CEx();
            if (file == null) {
                this.A01.A08(2131896086, 0);
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            Object[] A1b = AnonymousClass3MW.A1b();
            AnonymousClass11S r1 = this.A02;
            A1b[0] = r1.A0D();
            intent.putExtra("android.intent.extra.SUBJECT", C17880vN.A0q(r5, AnonymousClass17K.A02(AnonymousClass3MZ.A0Q(r1)), A1b, 1, 2131888825));
            intent.putExtra("android.intent.extra.TEXT", this.A03);
            C72483Me.A0g(intent, r5, file);
        }
    }

    public AnonymousClass49K(AnonymousClass1FU r2, C218617r r3, AnonymousClass1KB r4, AnonymousClass11S r5, String str) {
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r3;
        this.A04 = AnonymousClass3MW.A0z(r2);
        this.A03 = str;
    }
}
