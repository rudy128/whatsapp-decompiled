package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.2Pn  reason: invalid class name and case insensitive filesystem */
public class C49192Pn extends A34 {
    public AnonymousClass1FU A00;
    public AnonymousClass1FT A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final C24791Lr A05;
    public final AnonymousClass11C A06;
    public final C18000vb A07;
    public final AnonymousClass1E7 A08;
    public final String A09;

    public C49192Pn(Uri uri, AnonymousClass1FU r3, AnonymousClass1FT r4, C24791Lr r5, AnonymousClass11C r6, C18000vb r7, AnonymousClass1E7 r8, String str, int i, int i2) {
        super(r3, true);
        this.A01 = r4;
        this.A06 = r6;
        this.A07 = r7;
        this.A04 = uri;
        this.A08 = r8;
        this.A00 = r3;
        this.A05 = r5;
        this.A09 = str;
        this.A03 = i;
        this.A02 = i2;
    }

    public /* bridge */ /* synthetic */ void A0D(Object obj) {
        this.A00 = null;
        this.A01 = null;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        InputStream A072;
        int i;
        this.A05.A02(this.A08).delete();
        AnonymousClass11B A0O = this.A06.A0O();
        if (A0O == null) {
            Log.w("profileinfo/cropphoto contentResolver=null");
            return 2131889981;
        }
        try {
            Uri uri = this.A04;
            A072 = A0O.A07(uri);
            if (A072 == null) {
                C17900vP.A0X(uri, "profileinfo/cropphoto/no-input-stream ", AnonymousClass000.A10());
                return 2131889981;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            int i2 = null;
            BitmapFactory.decodeStream(A072, (Rect) null, options);
            int i3 = options.outWidth;
            if (i3 <= 0 || (i = options.outHeight) <= 0) {
                C17900vP.A0X(uri, "profileinfo/cropphoto/not-an-image ", AnonymousClass000.A10());
                i2 = 2131889970;
            } else if (i3 < 192 || i < 192) {
                i2 = 2131755131;
            }
            A072.close();
            return i2;
        } catch (IOException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("profileinfo/cropphoto/ ");
            A10.append(this.A04);
            C17880vN.A1M(A10, e);
            return 2131889981;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Number number = (Number) obj;
        AnonymousClass1FU r6 = this.A00;
        if (r6 != null && this.A01 != null) {
            if (number != null) {
                int intValue = number.intValue();
                if (intValue == 2131755131) {
                    C18000vb r3 = this.A07;
                    Object[] objArr = new Object[1];
                    C17880vN.A1T(objArr, 192, 0);
                    r6.BhR(r3.A0K(objArr, 2131755131, 192));
                    return;
                }
                r6.BhQ(intValue);
                return;
            }
            Uri uri = this.A04;
            Uri fromFile = Uri.fromFile(this.A05.A02(this.A08));
            String obj2 = Bitmap.CompressFormat.JPEG.toString();
            C18070vi.A0p(uri, fromFile, obj2);
            boolean z = false;
            String str = this.A09;
            int i = 1;
            int i2 = 1;
            int i3 = 640;
            if (this.A02 == 1) {
                z = true;
                i = 16;
                i2 = 9;
                i3 = 1138;
            }
            this.A01.startActivityForResult(AnonymousClass1LU.A0N(r6, (Rect) null, uri, fromFile, obj2, str, (String) null, i, i2, i3, 640, 192, 0, 0, 0, z, true, false, z), this.A03);
        }
    }
}
