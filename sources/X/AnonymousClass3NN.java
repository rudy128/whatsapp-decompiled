package X;

import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.util.Log;

/* renamed from: X.3NN  reason: invalid class name */
public class AnonymousClass3NN extends AsyncTask {
    public final /* synthetic */ CYk A00;
    public final /* synthetic */ AnonymousClass5WW A01;

    public AnonymousClass3NN(CYk cYk, AnonymousClass5WW r2) {
        this.A00 = cYk;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            return this.A00.A00();
        } catch (Exception e) {
            Log.e("Palette", "Exception thrown during async generate", e);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        C76733o2 r5 = ((C91794gG) this.A01).A00;
        C76783oH A0h = C72453Mb.A0h(r5);
        int A002 = C19740yt.A00(r5, 2131099884);
        A0h.setColor(AnonymousClass3MZ.A00(r5));
        C19740yt.A00(r5, AnonymousClass4Z9.A01(r5, false));
        r5.findViewById(2131428343).setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, A002}));
        r5.findViewById(2131436304).setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{855638016, A002}));
    }
}
