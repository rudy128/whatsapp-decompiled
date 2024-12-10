package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

/* renamed from: X.5qe  reason: invalid class name and case insensitive filesystem */
public final class C114365qe extends C110745gz {
    public final C1420978d A00 = new C1420978d((Object) this, 23);
    public final C22821Di A01;
    public final /* synthetic */ WDSBottomSheetDialogFragment A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C114365qe(Context context, WDSBottomSheetDialogFragment wDSBottomSheetDialogFragment, AnonymousClass1JH r5, int i) {
        super(context, i);
        this.A02 = wDSBottomSheetDialogFragment;
        C18070vi.A0b(context);
        this.A01 = (C22821Di) r5;
    }

    public void onBackPressed() {
        if (!this.A02.A2J()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        View findViewById;
        super.onCreate(bundle);
        if (this.A01 != null && (findViewById = findViewById(2131429948)) != null) {
            findViewById.addOnLayoutChangeListener(this.A00);
        }
    }

    public void onStart() {
        super.onStart();
        WDSBottomSheetDialogFragment.A0I(this, this.A02);
    }
}
