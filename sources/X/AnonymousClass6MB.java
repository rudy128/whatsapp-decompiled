package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.6MB  reason: invalid class name */
public final class AnonymousClass6MB extends A34 {
    public final C26521Sl A00;
    public final WeakReference A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6MB(AnonymousClass1F9 r2, AnonymousClass86Q r3, C26521Sl r4) {
        super(r2, true);
        C18070vi.A0d(r4, 3);
        this.A00 = r4;
        this.A01 = AnonymousClass3MW.A0z(r3);
    }

    public /* bridge */ /* synthetic */ void A0D(Object obj) {
        File file;
        AnonymousClass1D6 r3 = (AnonymousClass1D6) obj;
        if (r3 != null && (file = (File) r3.first) != null) {
            Log.i("onCancelled/cancelled with non-null file, deleting file");
            C64062u9.A0Q(file);
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Uri[] uriArr = (Uri[]) objArr;
        C18070vi.A0d(uriArr, 0);
        if (uriArr.length != 1) {
            Log.e("LoadMediaFileAsyncTask/doInBackground expected exactly 1 uri");
            return new AnonymousClass1D6((Object) null, (Object) null);
        }
        try {
            Uri uri = uriArr[0];
            if (uri == null) {
                return new AnonymousClass1D6((Object) null, (Object) null);
            }
            C26521Sl r0 = this.A00;
            File A0j = r0.A0j(uri, false);
            C18070vi.A0X(A0j);
            return AnonymousClass1D6.A01(A0j, C108975cc.A0c(uri, r0));
        } catch (IOException e) {
            Log.e("LoadMediaFileAsyncTask/doInBackground failed to get file from uri", e);
            return new AnonymousClass1D6((Object) null, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass1D6 r4 = (AnonymousClass1D6) obj;
        C18070vi.A0d(r4, 0);
        AnonymousClass86Q r2 = (AnonymousClass86Q) this.A01.get();
        if (r2 != null) {
            r2.Bxj((File) r4.first, (String) r4.second);
        }
    }
}
