package X;

import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;

/* renamed from: X.7Ho  reason: invalid class name and case insensitive filesystem */
public final class C144507Ho implements AnonymousClass892 {
    public final /* synthetic */ AnonymousClass66Q A00;
    public final /* synthetic */ String A01;

    public void BuY(File file, String str, byte[] bArr) {
        C18070vi.A0d(str, 0);
        AnonymousClass66Q r3 = this.A00;
        List list = C42011xT.A0I;
        r3.A03 = null;
        if (file == null) {
            C17900vP.A0g("OnlineGifPreviewHolder/file is null for ", str, AnonymousClass000.A10());
        } else if (str.equals(this.A01)) {
            if (bArr != null) {
                r3.A05.setImageBitmap(AnonymousClass204.A0C(new AnonymousClass25O(C32021gV.A0E, (Long) null, 8000, 8000, false), bArr).A02);
            }
            C129706iE r4 = r3.A02;
            if (r4 != null) {
                String absolutePath = file.getAbsolutePath();
                C18070vi.A0X(absolutePath);
                try {
                    DRK drk = r4.A01;
                    if (drk == null) {
                        File A17 = C108945cZ.A17(absolutePath);
                        C25798CmA cmA = DRK.A04;
                        drk = DRK.A01(ParcelFileDescriptor.open(A17, 268435456), false);
                        r4.A01 = drk;
                    }
                    BFF A05 = drk.A05(r4.A02.getContext());
                    r4.A00 = A05;
                    Boolean bool = C17970vW.A03;
                    if (A05 != null) {
                        A05.start();
                    }
                } catch (Throwable th) {
                    Log.e("Gif/loading/exception", th);
                }
                if (C22781De.A03()) {
                    try {
                        r4.A03.setImageDrawable(r4.A00);
                    } catch (Throwable th2) {
                        Log.e("Gif/settingDrawable/exception", th2);
                    }
                } else {
                    ((Handler) r4.A04.getValue()).post(new C21355Aik(r4, 1));
                }
            }
            r3.A05.setVisibility(8);
        }
    }

    public void onFailure(Exception exc) {
        throw AnonymousClass04E.createAndThrow();
    }

    public C144507Ho(AnonymousClass66Q r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
