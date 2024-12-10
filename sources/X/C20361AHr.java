package X;

import android.database.Cursor;

/* renamed from: X.AHr  reason: case insensitive filesystem */
public final class C20361AHr implements BA2 {
    public final AnonymousClass8JG A00;
    public final C20076A6c A01;

    public Long BUG(String str) {
        AHX A002 = A3D.A00("SELECT long_value FROM Preference where `key`=?", 1);
        A002.BDB(1, str);
        C20076A6c a6c = this.A01;
        a6c.A06();
        Long l = null;
        Cursor A003 = AnonymousClass9OB.A00(a6c, A002, false);
        try {
            if (A003.moveToFirst() && !A003.isNull(0)) {
                l = C17890vO.A0M(A003, 0);
            }
            return l;
        } finally {
            A003.close();
            A002.A00();
        }
    }

    public void Bdd(C193269po r3) {
        C20076A6c a6c = this.A01;
        a6c.A06();
        a6c.A07();
        try {
            this.A00.A03(r3);
            a6c.A08();
        } finally {
            C20076A6c.A02(a6c);
        }
    }

    public C20361AHr(C20076A6c a6c) {
        this.A01 = a6c;
        this.A00 = new AnonymousClass8JE(a6c, this, 1);
    }
}
