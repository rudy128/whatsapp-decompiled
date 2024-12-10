package X;

import android.app.Activity;

/* renamed from: X.2xz  reason: invalid class name and case insensitive filesystem */
public final class C66322xz implements C72073Kn {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C37551pj A01;
    public final /* synthetic */ boolean A02;

    public C66322xz(Activity activity, C37551pj r2, boolean z) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = z;
    }

    public void C3p(boolean z) {
        if (!z) {
            C37551pj r2 = this.A01;
            C17880vN.A1B(C19830z4.A00(r2.A07), "block_list_receive_time");
            Activity activity = this.A00;
            if (!activity.isFinishing()) {
                AnonymousClass1KB r22 = r2.A00;
                int i = 2131897292;
                if (this.A02) {
                    i = 2131887201;
                }
                r22.A0F((AnonymousClass1FR) null, activity.getString(i));
            }
        }
    }
}
