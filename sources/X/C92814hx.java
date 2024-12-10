package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.4hx  reason: invalid class name and case insensitive filesystem */
public class C92814hx implements BCx {
    public final int A00;
    public final int A01;
    public final Drawable A02;
    public final Drawable A03;
    public final C108315bU A04;
    public final String A05;
    public final String A06;
    public final WeakReference A07;

    public boolean BKx() {
        return false;
    }

    public Integer BVo() {
        return null;
    }

    public ImageView BSp() {
        if (this instanceof AnonymousClass48I) {
            return ((AnonymousClass48I) this).A00;
        }
        WeakReference weakReference = this.A07;
        if (weakReference != null) {
            return (ImageView) weakReference.get();
        }
        return null;
    }

    public int BUR() {
        return this.A00;
    }

    public int BUV() {
        return this.A01;
    }

    public String Bb5() {
        return this.A05;
    }

    public String getId() {
        return this.A06;
    }

    public C92814hx(Drawable drawable, Drawable drawable2, ImageView imageView, C108315bU r5, String str, String str2, int i, int i2) {
        WeakReference weakReference;
        if (imageView != null) {
            weakReference = AnonymousClass3MW.A0z(imageView);
        } else {
            weakReference = null;
        }
        this.A07 = weakReference;
        this.A05 = str;
        this.A06 = str2;
        this.A03 = drawable;
        this.A02 = drawable2;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = r5;
    }
}
