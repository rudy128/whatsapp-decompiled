package X;

import android.graphics.BitmapFactory;

/* renamed from: X.6mg  reason: invalid class name and case insensitive filesystem */
public class C132376mg {
    public int A00 = 1;
    public BitmapFactory.Options A01;
    public boolean A02;

    public String toString() {
        String str;
        if (this.A00 == 0) {
            str = "Cancel";
        } else {
            str = "Allow";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("thread state = ");
        A10.append(str);
        A10.append(", options = ");
        return C17890vO.A0V(this.A01, A10);
    }
}
