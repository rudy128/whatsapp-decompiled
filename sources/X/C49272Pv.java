package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.dialogs.ProgressDialogFragment;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2Pv  reason: invalid class name and case insensitive filesystem */
public class C49272Pv extends A34 {
    public AnonymousClass1E7 A00;
    public ProgressDialogFragment A01;
    public Set A02;
    public final DialogFragment A03;
    public final C34591kk A04;
    public final WeakReference A05;
    public final boolean A06;

    public void A0F() {
        AnonymousClass1GP r2 = (AnonymousClass1GP) this.A05.get();
        if (r2 != null) {
            ProgressDialogFragment A002 = ProgressDialogFragment.A00(2131894782, 2131895077);
            this.A01 = A002;
            A002.A2C(r2, "count_progress");
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        int i;
        AnonymousClass1E7 r0 = this.A00;
        if (r0 != null) {
            i = this.A04.A01(AnonymousClass1E7.A00(r0));
        } else {
            C34591kk r02 = this.A04;
            Set set = this.A02;
            i = 0;
            if (set != null) {
                Iterator it = r02.A02().iterator();
                while (it.hasNext()) {
                    if (set.contains(((AnonymousClass206) it.next()).A0v.A00)) {
                        i++;
                    }
                }
            }
        }
        return Integer.valueOf(i);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        DialogFragment dialogFragment;
        Number number = (Number) obj;
        AnonymousClass1GP r4 = (AnonymousClass1GP) this.A05.get();
        if (r4 != null && !r4.A0F) {
            this.A01.A2H();
            AnonymousClass1E7 r0 = this.A00;
            if (r0 != null) {
                dialogFragment = this.A03;
                C43411zl.A01(dialogFragment, r0);
            } else {
                Set set = this.A02;
                dialogFragment = this.A03;
                Bundle A0D = C17880vN.A0D();
                A0D.putStringArrayList("selection_jids", C22971Dz.A0B(set));
                dialogFragment.A1R(A0D);
            }
            Bundle bundle = dialogFragment.A06;
            bundle.putInt("unsent_count", number.intValue());
            bundle.putBoolean("chatContainsStarredMessages", this.A06);
            C17960vV.A07(r4);
            C34001jj r1 = new C34001jj(r4);
            r1.A0B(dialogFragment, (String) null);
            r1.A00(true);
        }
    }

    public C49272Pv(DialogFragment dialogFragment, AnonymousClass1GP r3, C34591kk r4, AnonymousClass1E7 r5, boolean z) {
        this.A05 = new WeakReference(r3);
        this.A04 = r4;
        this.A03 = dialogFragment;
        this.A00 = r5;
        this.A06 = z;
    }

    public C49272Pv(DialogFragment dialogFragment, AnonymousClass1GP r3, C34591kk r4, Set set, boolean z) {
        this.A05 = new WeakReference(r3);
        this.A04 = r4;
        this.A03 = dialogFragment;
        this.A02 = set;
        this.A06 = z;
    }
}
