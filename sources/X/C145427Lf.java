package X;

import android.os.Bundle;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.7Lf  reason: invalid class name and case insensitive filesystem */
public class C145427Lf implements C1601987n {
    public final int A00;
    public final Object A01;

    public C145427Lf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C3m(String str, int i) {
        C139676zG r2;
        boolean z;
        int i2;
        AnonymousClass205 r3;
        String str2 = str;
        if (this.A00 != 0) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A01;
            AnonymousClass00H r0 = mediaViewFragment.A1W;
            if (i == 2) {
                ((C192489oU) r0.get()).A01(2);
                Bundle bundle = mediaViewFragment.A06;
                if (mediaViewFragment.A11 != null && bundle != null && str != null) {
                    r3 = AnonymousClass4aU.A03(bundle, "");
                    r2 = mediaViewFragment.A11;
                    i2 = 3;
                    z = false;
                } else {
                    return;
                }
            } else {
                ((C192489oU) r0.get()).A01(3);
                return;
            }
        } else {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A01;
            if (str != null && !mediaComposerActivity.Bed() && i == 2 && (r2 = mediaComposerActivity.A0q) != null) {
                z = false;
                i2 = 3;
                r3 = null;
            } else {
                return;
            }
        }
        r2.A02(r3, str2, i2, z, z);
    }
}
