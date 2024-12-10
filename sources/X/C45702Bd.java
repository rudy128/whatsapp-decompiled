package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.whatsapp.util.Log;

/* renamed from: X.2Bd  reason: invalid class name and case insensitive filesystem */
public abstract class C45702Bd extends AnonymousClass290 {
    public C34001jj A00 = null;
    public Fragment A01 = null;
    public final C001100p A02 = new C001100p();
    public final C001100p A03 = new C001100p();
    public final AnonymousClass1GP A04;

    public abstract long A0M(int i);

    public abstract Fragment A0N(int i);

    public Parcelable A0B() {
        Bundle bundle;
        C001100p r7 = this.A03;
        int i = 0;
        if (r7.A00() > 0) {
            bundle = C17880vN.A0D();
            long[] jArr = new long[r7.A00()];
            for (int i2 = 0; i2 < r7.A00(); i2++) {
                long A022 = r7.A02(i2);
                jArr[i2] = A022;
                bundle.putParcelable(Long.toString(A022), (C26550D3n) r7.A04(i2));
            }
            bundle.putLongArray("states", jArr);
        } else {
            bundle = null;
        }
        while (true) {
            C001100p r1 = this.A02;
            if (i >= r1.A00()) {
                return bundle;
            }
            Fragment fragment = (Fragment) r1.A04(i);
            if (fragment != null && fragment.A1b()) {
                if (bundle == null) {
                    bundle = C17880vN.A0D();
                }
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("f");
                this.A04.A0e(bundle, fragment, C17880vN.A0u(A10, r1.A02(i)));
            }
            i++;
        }
    }

    public void A0D(ViewGroup viewGroup) {
        try {
            C34001jj r0 = this.A00;
            if (r0 != null) {
                r0.A04();
                this.A00 = null;
            }
        } catch (IllegalStateException e) {
            Log.e("UpdatableFragmentPagerAdapter/finishUpdate", e);
        }
    }

    public C45702Bd(AnonymousClass1GP r2) {
        this.A04 = r2;
    }

    public void A0O(ViewGroup viewGroup, Fragment fragment, int i) {
        long j;
        int A0I = A0I(fragment);
        C001100p r7 = this.A02;
        int i2 = 0;
        if (r7.A01) {
            int i3 = r7.A00;
            long[] jArr = r7.A02;
            Object[] objArr = r7.A03;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != C008103q.A00) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            r7.A01 = false;
            r7.A00 = i4;
        }
        int i6 = r7.A00;
        while (true) {
            if (i2 >= i6) {
                break;
            } else if (r7.A03[i2] != fragment) {
                i2++;
            } else if (i2 != -1) {
                j = r7.A02(i2);
                Object[] objArr2 = r7.A03;
                Object obj2 = objArr2[i2];
                Object obj3 = C008103q.A00;
                if (obj2 != obj3) {
                    objArr2[i2] = obj3;
                    r7.A01 = true;
                }
            }
        }
        j = -1;
        if (!fragment.A1b() || A0I == -2) {
            this.A03.A08(j);
        } else {
            this.A03.A0A(j, this.A04.A0N(fragment));
        }
        C34001jj r1 = this.A00;
        if (r1 == null) {
            r1 = new C34001jj(this.A04);
            this.A00 = r1;
        }
        r1.A07(fragment);
    }
}
