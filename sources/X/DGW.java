package X;

import android.content.Context;
import android.net.Uri;

public class DGW implements C28559E7l {
    public DRN Bhn(Uri uri) {
        return A00((Context) null, (D4A) null, C9L.A00(uri.toString()));
    }

    public static DRN A00(Context context, D4A d4a, C25256Cbv cbv) {
        DRN drn;
        if (context != null && !C26141Ct4.A02()) {
            synchronized (C26141Ct4.class) {
                if (C26212Cuq.A04()) {
                    C26212Cuq.A03("ImagePipelineFactory#initialize");
                }
                C26141Ct4.A01(new CUW(new CTF(context)));
                C26212Cuq.A00();
            }
        }
        C26048CrF A00 = C90.A00().A00(cbv, d4a);
        try {
            DRN drn2 = (DRN) C24553C8z.A00(A00);
            A00.A06();
            if (drn2 == null || !(drn2.A05() instanceof BSF)) {
                drn = null;
            } else {
                drn = ((BSF) drn2.A05()).A00();
            }
            drn2.close();
            return drn;
        } catch (Throwable th) {
            throw BE6.A0o("Failed to fetch the bitmap", th);
        }
    }

    public DRN Bhm(Context context, Uri uri, D4A d4a) {
        return A00(context, d4a, C9L.A00(uri.toString()));
    }
}
