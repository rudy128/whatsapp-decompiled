package X;

import android.app.Activity;

/* renamed from: X.7Bm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C142967Bm implements C72033Kj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ String A02;

    public final void Bom() {
        Activity activity = this.A01;
        activity.startActivity(AnonymousClass1LU.A1U(activity.getApplicationContext(), this.A02, (String) null, this.A00));
    }

    public /* synthetic */ C142967Bm(Activity activity, String str, int i) {
        this.A01 = activity;
        this.A02 = str;
        this.A00 = i;
    }
}
