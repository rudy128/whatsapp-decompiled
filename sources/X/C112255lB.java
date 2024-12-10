package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;
import java.util.Set;

/* renamed from: X.5lB  reason: invalid class name and case insensitive filesystem */
public class C112255lB extends C38391rD {
    public C160878Ah A00;
    public final Context A01;
    public final AnonymousClass1KB A02;
    public final C125696bX A03;
    public final AnonymousClass7DY A04;
    public final C136166tN A05;
    public final C20050A4v A06;
    public final C200710s A07;
    public final C200710s A08;
    public final List A09;
    public final Set A0A;
    public final boolean A0B;

    private AnonymousClass8B2 A00(int i) {
        C160878Ah r2 = this.A00;
        if (r2 == null) {
            return null;
        }
        if (this.A03.A00.A15.A04) {
            List list = this.A09;
            if (i < list.size()) {
                return (AnonymousClass8B2) list.get(i);
            }
            r2 = this.A00;
            i -= list.size();
        }
        return r2.BUY(i);
    }

    public int A0Q() {
        int count;
        C160878Ah r0 = this.A00;
        int i = 0;
        if (r0 == null) {
            count = 0;
        } else {
            count = r0.getCount();
        }
        if (this.A03.A00.A15.A04) {
            i = this.A09.size();
        }
        return count + i;
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r3) {
        C1188465m r1 = ((C113645nQ) r3).A03;
        r1.setImageDrawable((Drawable) null);
        r1.A06 = null;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r7, int i) {
        int i2;
        C113645nQ r72 = (C113645nQ) r7;
        AnonymousClass8B2 A002 = A00(i);
        C1188465m r3 = r72.A03;
        r3.setMediaItem(A002);
        r3.A06 = null;
        r3.setId(2131436123);
        C136166tN r5 = r72.A02;
        r5.A01((AnonymousClass891) r3.getTag());
        if (A002 != null) {
            AnonymousClass3MW.A1R(r3);
            AnonymousClass1Xr.A04(r3, A002.BLl().toString());
            AnonymousClass7HV r2 = new AnonymousClass7HV(r72, A002, 0);
            r3.setTag(r2);
            r5.A02(r2, new C144407He(r72, A002, r2, r72.A05));
            if (r72.A04.contains(r3.getUri())) {
                r3.A09((Integer) null);
                return;
            }
        } else {
            r3.setScaleType(ImageView.ScaleType.CENTER);
            AnonymousClass1Xr.A04(r3, (String) null);
            r3.setBackgroundColor(r72.A00);
            r3.setImageDrawable((Drawable) null);
        }
        r3.A07();
        if (A002 == null && this.A00 != null) {
            if (this.A03.A00.A15.A04) {
                i2 = this.A09.size();
            } else {
                i2 = 0;
            }
            int i3 = i - i2;
            if (i3 >= 0) {
                this.A08.execute(new AnonymousClass7RP(this, i3, 37));
            }
        }
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C1188365l r3 = new C1188365l(this.A01, this);
        r3.setSelector((Drawable) null);
        boolean z = this.A0B;
        if (!z) {
            r3.setSelectable(true);
        }
        Set set = this.A0A;
        return new C113645nQ(this.A04, this.A05, r3, this.A06, set, z);
    }

    public C112255lB(Context context, AnonymousClass1KB r4, C125696bX r5, AnonymousClass7DY r6, C136166tN r7, C20050A4v a4v, AnonymousClass10I r9, List list, Set set, boolean z) {
        this.A02 = r4;
        this.A01 = context;
        this.A0A = set;
        this.A09 = list;
        this.A05 = r7;
        this.A03 = r5;
        this.A04 = r6;
        this.A08 = C200710s.A00(r9);
        this.A07 = new C200710s(r9, true);
        this.A06 = a4v;
        this.A0B = z;
        A0K(true);
    }

    public long A0M(int i) {
        AnonymousClass8B2 A002 = A00(i);
        if (A002 == null) {
            return 0;
        }
        return (long) AnonymousClass000.A0y("-gallery_thumb", C17890vO.A0f(A002.BLl())).hashCode();
    }
}
