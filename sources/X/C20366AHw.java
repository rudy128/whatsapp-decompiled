package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.AHw  reason: case insensitive filesystem */
public final class C20366AHw implements BA4 {
    public final AnonymousClass8JG A00;
    public final C20076A6c A01;
    public final C19955A0m A02;

    public ArrayList BaA(String str) {
        String str2;
        AHX A002 = A3D.A00("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        A002.BDB(1, str);
        C20076A6c a6c = this.A01;
        a6c.A06();
        Cursor A003 = AnonymousClass9OB.A00(a6c, A002, false);
        try {
            ArrayList A0w = AnonymousClass8BV.A0w(A003);
            while (A003.moveToNext()) {
                if (A003.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = A003.getString(0);
                }
                A0w.add(str2);
            }
            return A0w;
        } finally {
            A003.close();
            A002.A00();
        }
    }

    public C20366AHw(C20076A6c a6c) {
        this.A01 = a6c;
        this.A00 = new AnonymousClass8JE(a6c, this, 6);
        this.A02 = new AnonymousClass8JH(a6c, this, 20);
    }

    public void Bdf(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass9ZY r2 = new AnonymousClass9ZY(C17880vN.A0v(it), str);
            C20076A6c a6c = this.A01;
            a6c.A06();
            a6c.A07();
            try {
                this.A00.A03(r2);
                a6c.A08();
            } finally {
                C20076A6c.A02(a6c);
            }
        }
    }
}
