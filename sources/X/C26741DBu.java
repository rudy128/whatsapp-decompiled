package X;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.DBu  reason: case insensitive filesystem */
public final class C26741DBu implements C28604E9v {
    public final List A00 = C17880vN.A0z(2);

    public void Btt(Drawable drawable, Throwable th, long j) {
        List list = this.A00;
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                ((C28604E9v) list.get(i)).Btt(drawable, th, j);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public void Bua(Drawable drawable, ECu eCu, long j) {
        List list = this.A00;
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                ((C28604E9v) list.get(i)).Bua(drawable, eCu, j);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public void Bw4(long j, Throwable th) {
        List list = this.A00;
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                ((C28604E9v) list.get(i)).Bw4(j, th);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public void Bw5(ECu eCu, long j) {
        List list = this.A00;
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                ((C28604E9v) list.get(i)).Bw5(eCu, j);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public void C0i(Drawable drawable, long j) {
        List list = this.A00;
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                ((C28604E9v) list.get(i)).C0i(drawable, j);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public void C2u(long j) {
        List list = this.A00;
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                ((C28604E9v) list.get(i)).C2u(j);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public void C7E(long j, Object obj) {
        List list = this.A00;
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                ((C28604E9v) list.get(i)).C7E(j, obj);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }
}
