package X;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.4s9  reason: invalid class name and case insensitive filesystem */
public class C99034s9 implements Iterator, C18450wR {
    public int A00;
    public final int A01;
    public final Object A02;

    public C99034s9(Object obj, int i) {
        this.A01 = i;
        this.A02 = obj;
    }

    public boolean hasNext() {
        int i;
        int i2;
        switch (this.A01) {
            case 0:
                i = this.A00;
                i2 = ((Menu) this.A02).size();
                break;
            case 1:
                i = this.A00;
                i2 = ((ViewGroup) this.A02).getChildCount();
                break;
            case 2:
                return ((Iterator) this.A02).hasNext();
            default:
                if (this.A00 <= 0 || !((Iterator) this.A02).hasNext()) {
                    return false;
                }
                return true;
        }
        if (i < i2) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object next() {
        switch (this.A01) {
            case 0:
                int i = this.A00;
                this.A00 = i + 1;
                MenuItem item = ((Menu) this.A02).getItem(i);
                if (item != null) {
                    return item;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                int i2 = this.A00;
                this.A00 = i2 + 1;
                View childAt = ((ViewGroup) this.A02).getChildAt(i2);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 2:
                int i3 = this.A00;
                this.A00 = i3 + 1;
                if (i3 >= 0) {
                    return new C194139rE(i3, ((Iterator) this.A02).next());
                }
                AnonymousClass1ZU.A0B();
                throw null;
            default:
                int i4 = this.A00;
                if (i4 != 0) {
                    this.A00 = i4 - 1;
                    return ((Iterator) this.A02).next();
                }
                throw new NoSuchElementException();
        }
    }

    public void remove() {
        switch (this.A01) {
            case 0:
                Menu menu = (Menu) this.A02;
                int i = this.A00 - 1;
                this.A00 = i;
                MenuItem item = menu.getItem(i);
                if (item != null) {
                    menu.removeItem(item.getItemId());
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                int i2 = this.A00 - 1;
                this.A00 = i2;
                ((ViewGroup) this.A02).removeViewAt(i2);
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C99034s9(C99414sm r2) {
        this.A01 = 2;
        this.A02 = r2.A00.iterator();
    }

    public C99034s9(C99444sp r2) {
        this.A01 = 3;
        this.A00 = r2.A00;
        this.A02 = r2.A01.iterator();
    }
}
