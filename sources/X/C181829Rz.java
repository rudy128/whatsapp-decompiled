package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.whatsapp.wabloks.ui.screenquery.WaBloksScreenQueryFragment;

/* renamed from: X.9Rz  reason: invalid class name and case insensitive filesystem */
public abstract class C181829Rz {
    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.wabloks.ui.screenquery.WaBloksScreenQueryFragment, androidx.fragment.app.Fragment] */
    public static final WaBloksScreenQueryFragment A00(Bundle bundle) {
        ? fragment = new Fragment();
        if (bundle.getBundle("BloksSurfaceProps") == null) {
            C25913CoX.A02("WaBloksScreenQueryFragment", AnonymousClass000.A0n("BloksSurfaceProps is missing from newInstance."));
        }
        fragment.A1R(bundle);
        fragment.A02 = AHz.A0A.A00(bundle).A06;
        return fragment;
    }
}
