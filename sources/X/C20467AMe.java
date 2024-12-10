package X;

import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.AMe  reason: case insensitive filesystem */
public abstract class C20467AMe implements BCx {
    public List A00;
    public boolean A01;
    public final B7F A02;
    public final B7G A03;
    public final B7H A04;
    public final String A05;
    public final WeakReference A06;

    public boolean A00() {
        Object obj;
        if (!(this instanceof C168558j5)) {
            C168568j6 r4 = (C168568j6) this;
            ImageView BSp = r4.BSp();
            if (BSp == null) {
                return !r4.A01;
            }
            String str = (String) BSp.getTag(2131431533);
            int A0M = AnonymousClass000.A0M(BSp.getTag(2131431539));
            if (r4.A01 || !str.equals(r4.A05)) {
                return false;
            }
            if (A0M == r4.A00 || A0M == 1) {
                return true;
            }
            return false;
        } else if (BSp() != null) {
            ImageView BSp2 = BSp();
            if (BSp2 != null) {
                obj = BSp2.getTag(2131431533);
            } else {
                obj = null;
            }
            if (this.A01 || !C18070vi.A18(this.A05, obj)) {
                return false;
            }
            return true;
        } else if (!this.A01) {
            return true;
        } else {
            return false;
        }
    }

    public ImageView BSp() {
        return (ImageView) this.A06.get();
    }

    public C20467AMe(ImageView imageView, B7F b7f, B7G b7g, B7H b7h, String str) {
        this.A05 = str;
        this.A04 = b7h;
        this.A02 = b7f;
        this.A03 = b7g;
        this.A06 = AnonymousClass3MW.A0z(imageView);
    }

    public Integer BVo() {
        return C17880vN.A0l();
    }
}
