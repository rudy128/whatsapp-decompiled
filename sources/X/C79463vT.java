package X;

import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.3vT  reason: invalid class name and case insensitive filesystem */
public final class C79463vT extends C95124lj {
    public final MyStatusesActivity A00;
    public final C79663vp A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C79463vT(X.C56472hW r2, com.whatsapp.status.playback.MyStatusesActivity r3, X.C79663vp r4) {
        /*
            r1 = this;
            r0 = 1
            X.AnonymousClass3Ma.A1O(r2, r0, r4)
            X.5ZZ[] r0 = new X.AnonymousClass5ZZ[r0]
            X.C95124lj.A00(r2, r3, r0)
            r1.<init>(r0)
            r1.A00 = r3
            r1.A01 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79463vT.<init>(X.2hW, com.whatsapp.status.playback.MyStatusesActivity, X.3vp):void");
    }

    public boolean BKp(int i, Collection collection) {
        C18070vi.A0d(collection, 1);
        if (i == 13) {
            C120936Gs r6 = (C120936Gs) this.A01.A02.get();
            MyStatusesActivity myStatusesActivity = this.A00;
            ArrayList A10 = C17880vN.A10(collection);
            int i2 = 6;
            if (collection.size() > 1) {
                i2 = 7;
            }
            Integer valueOf = Integer.valueOf(i2);
            int i3 = 5;
            if (collection.size() > 1) {
                i3 = 6;
            }
            myStatusesActivity.A4e(valueOf, Integer.valueOf(i3), AnonymousClass00R.A00, A10);
            if (collection.size() <= 15 || ((AnonymousClass72B) r6.A00.get()).A02(false) == AnonymousClass6R1.DISABLED) {
                return true;
            }
            return false;
        } else if (i == 14) {
            this.A01.A01.get();
            this.A00.A4e((Integer) null, (Integer) null, AnonymousClass00R.A0C, C17880vN.A10(collection));
            return true;
        } else if (i == 21) {
            return ((C95084lf) this.A01.A00.get()).A00(this.A00, collection);
        } else {
            if (i != 36) {
                return super.BKp(i, collection);
            }
            this.A01.A03.get();
            MyStatusesActivity myStatusesActivity2 = this.A00;
            ArrayList A102 = C17880vN.A10(collection);
            int i4 = 6;
            if (collection.size() > 1) {
                i4 = 7;
            }
            Integer valueOf2 = Integer.valueOf(i4);
            int i5 = 5;
            if (collection.size() > 1) {
                i5 = 6;
            }
            myStatusesActivity2.A4e(valueOf2, Integer.valueOf(i5), AnonymousClass00R.A01, A102);
            if (collection.size() <= 15) {
                return true;
            }
            return false;
        }
    }
}
