package X;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

/* renamed from: X.BdX  reason: case insensitive filesystem */
public abstract class C23221BdX extends C25821CmY implements SafeParcelable {
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            if (this != obj) {
                if (getClass().isInstance(obj)) {
                    C25821CmY cmY = (C25821CmY) obj;
                    Iterator A0l = C17890vO.A0l(A05());
                    while (A0l.hasNext()) {
                        C23196Bcq bcq = (C23196Bcq) A0l.next();
                        boolean A06 = A06(bcq);
                        boolean A062 = cmY.A06(bcq);
                        if (A06) {
                            if (A062 && C25332Cdd.A01(A04(bcq), cmY.A04(bcq))) {
                            }
                        } else if (A062) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Iterator A0l = C17890vO.A0l(A05());
        int i = 0;
        while (A0l.hasNext()) {
            C23196Bcq bcq = (C23196Bcq) A0l.next();
            if (A06(bcq)) {
                Object A04 = A04(bcq);
                C18210vx.A00(A04);
                i = AnonymousClass000.A0O(A04, i * 31);
            }
        }
        return i;
    }
}
