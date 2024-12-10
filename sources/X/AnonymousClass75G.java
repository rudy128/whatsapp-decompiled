package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.75G  reason: invalid class name */
public final /* synthetic */ class AnonymousClass75G implements DialogInterface.OnShowListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C110745gz A01;
    public final /* synthetic */ AnonymousClass6ZI A02;
    public final /* synthetic */ C18090vk A03;

    /* JADX WARNING: type inference failed for: r9v0, types: [X.1Dh, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.Object, X.4rD] */
    public final void onShow(DialogInterface dialogInterface) {
        C110745gz r4 = this.A01;
        C18090vk r8 = this.A03;
        AnonymousClass6ZI r7 = this.A02;
        Activity activity = this.A00;
        C18070vi.A0d(r4, 0);
        View findViewById = r4.findViewById(2131429948);
        ? obj = new Object();
        if (findViewById != null) {
            BottomSheetBehavior A022 = BottomSheetBehavior.A02(findViewById);
            C18070vi.A0X(A022);
            A022.A0h = false;
            A022.A0V(-1);
            A022.A0d(true);
            ? obj2 = new Object();
            obj2.element = -1;
            A022.A0a(new C114305qU(activity, A022, r7, r8, obj, obj2));
            A022.A0W(3);
        }
    }

    public /* synthetic */ AnonymousClass75G(Activity activity, C110745gz r2, AnonymousClass6ZI r3, C18090vk r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = activity;
    }
}
