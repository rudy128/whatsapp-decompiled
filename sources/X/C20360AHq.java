package X;

import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: X.AHq  reason: case insensitive filesystem */
public final class C20360AHq implements C22400B6d {
    public final AnonymousClass8JG A00;
    public final C20076A6c A01;

    public ArrayList BQV(String str) {
        String str2;
        AHX A02 = A3D.A02("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", str);
        C20076A6c a6c = this.A01;
        a6c.A06();
        Cursor A002 = AnonymousClass9OB.A00(a6c, A02, false);
        try {
            ArrayList A0w = AnonymousClass8BV.A0w(A002);
            while (A002.moveToNext()) {
                if (A002.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = A002.getString(0);
                }
                A0w.add(str2);
            }
            return A0w;
        } finally {
            A002.close();
            A02.A00();
        }
    }

    public C20360AHq(C20076A6c a6c) {
        this.A01 = a6c;
        this.A00 = new AnonymousClass8JE(a6c, this, 0);
    }
}
