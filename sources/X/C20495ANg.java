package X;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

/* renamed from: X.ANg  reason: case insensitive filesystem */
public class C20495ANg implements B7H {
    public C187589g3 A00;
    public final C218617r A01;
    public final C26521Sl A02;
    public final AnonymousClass10I A03;

    public void Bx5(Bitmap bitmap, C20467AMe aMe, boolean z) {
        C21450AkH.A01(this.A03, this, bitmap, 30);
    }

    public C20495ANg(C218617r r1, C26521Sl r2, AnonymousClass10I r3) {
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = r2;
    }

    public static C19760yx A00(Bitmap bitmap, C218617r r5) {
        boolean z;
        FileOutputStream A19;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(UUID.randomUUID());
        File A0a = r5.A0a(AnonymousClass000.A0y(".jpeg", A10));
        try {
            A19 = C108945cZ.A19(A0a);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, A19);
            A19.close();
            z = true;
        } catch (Exception e) {
            C17900vP.A0X(e, "product-details/send-product/save-to-storage/failed: ", AnonymousClass000.A10());
            z = false;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        return AnonymousClass8BR.A0B(Boolean.valueOf(z), A0a);
        throw th;
    }
}
