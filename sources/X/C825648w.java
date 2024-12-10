package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.48w  reason: invalid class name and case insensitive filesystem */
public class C825648w extends A34 {
    public final C26521Sl A00;
    public final WeakReference A01;

    public C825648w(AnonymousClass1F9 r2, AnonymousClass4O1 r3, C26521Sl r4) {
        super(r2, true);
        this.A00 = r4;
        this.A01 = AnonymousClass3MW.A0z(r3);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        try {
            Bitmap A0h = this.A00.A0h(Uri.fromFile(((File[]) objArr)[0]), 100, 100);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            A0h.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            A0h.recycle();
            return byteArray;
        } catch (Exception e) {
            Log.e("create-product-reply/", e);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        byte[] bArr = (byte[]) obj;
        AnonymousClass4O1 r0 = (AnonymousClass4O1) this.A01.get();
        if (r0 != null) {
            AnonymousClass3VQ r4 = r0.A03;
            C20287AEv aEv = r0.A01;
            AnonymousClass4PL r8 = r0.A02;
            C62572rc r9 = r0.A00;
            try {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("product_inquiry:");
                String A0y = AnonymousClass000.A0y(aEv.A0H, A10);
                UserJid userJid = r8.A0C;
                AnonymousClass22Q r2 = new AnonymousClass22Q(new AnonymousClass205(userJid, A0y, false), AnonymousClass11P.A01(r4.A0i));
                r2.A02 = r9;
                r2.A0p(bArr);
                aEv.A00(r2);
                if (userJid != null) {
                    r2.A01 = userJid;
                }
                r4.A0b(r2);
            } catch (Exception e) {
                Log.e("create-product-reply/", e);
            }
            if (bArr == null) {
                Log.i("create-product-reply/creating product reply without media");
                AnonymousClass210 r3 = new AnonymousClass210(r4.A0x.A01(r8.A0C, false), AnonymousClass11P.A01(r4.A0i));
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append('*');
                String A0y2 = AnonymousClass000.A0y(aEv.A08, A102);
                String str = aEv.A0E;
                if (!AnonymousClass1EG.A0H(str)) {
                    A0y2 = AnonymousClass001.A1H("*\n", str, AnonymousClass000.A11(A0y2));
                }
                r3.A0i(A0y2);
                r4.A0b(r3);
            }
        }
    }
}
