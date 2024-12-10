package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;

public class DGX implements C28559E7l {
    public static final E4M A00 = new DBK(2);

    public DRN Bhn(Uri uri) {
        return DRN.A00(A00, BitmapFactory.decodeFile(uri.getPath(), new BitmapFactory.Options()));
    }

    public DRN Bhm(Context context, Uri uri, D4A d4a) {
        return Bhn(uri);
    }
}
