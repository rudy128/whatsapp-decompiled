package X;

import android.text.Layout;

/* renamed from: X.CGd  reason: case insensitive filesystem */
public abstract class C24691CGd {
    public static final Layout.Alignment A00;
    public static final Layout.Alignment A01;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (C18070vi.A18(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (C18070vi.A18(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        A00 = alignment;
        A01 = alignment2;
    }
}
