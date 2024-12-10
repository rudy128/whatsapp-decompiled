package X;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;

public class AGS implements C22493B9z {
    public final ContentProviderClient A00;

    public Cursor CD8(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = this.A00;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, (String) null, (CancellationSignal) null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    public void close() {
        ContentProviderClient contentProviderClient = this.A00;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    public AGS(Context context, Uri uri) {
        this.A00 = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }
}
