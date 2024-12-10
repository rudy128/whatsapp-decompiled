package X;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3SV  reason: invalid class name */
public abstract class AnonymousClass3SV extends C73093Oy {
    public int A00;
    public LayoutInflater A01;
    public int A02;

    public View A05(Context context, Cursor cursor, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(this.A01, viewGroup, this.A02);
    }

    @Deprecated
    public AnonymousClass3SV(Context context, int i) {
        C73093Oy.A03(context, this);
        this.A00 = i;
        this.A02 = i;
        this.A01 = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
