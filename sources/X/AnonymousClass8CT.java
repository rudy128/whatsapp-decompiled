package X;

import android.os.AsyncTask;

/* renamed from: X.8CT  reason: invalid class name */
public final class AnonymousClass8CT extends AsyncTask {
    public final /* synthetic */ C161078Bi A00;

    public AnonymousClass8CT(C161078Bi r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        while (true) {
            C161078Bi r2 = this.A00;
            C22492B9y A06 = r2.A06();
            if (A06 == null) {
                return null;
            }
            r2.A08(A06.getIntent());
            A06.BFM();
        }
    }

    public /* bridge */ /* synthetic */ void onCancelled(Object obj) {
        this.A00.A07();
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.A00.A07();
    }
}
