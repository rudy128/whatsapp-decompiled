package X;

import android.database.Cursor;
import java.io.Closeable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.Akw  reason: case insensitive filesystem */
public class C21487Akw implements Iterator, Closeable {
    public final Cursor A00;
    public final B80 A01;

    public void close() {
        this.A00.close();
    }

    public boolean hasNext() {
        Cursor cursor = this.A00;
        if (cursor.isLast() || cursor.isAfterLast()) {
            return false;
        }
        return true;
    }

    public Object next() {
        Cursor cursor = this.A00;
        if (cursor.moveToNext()) {
            return this.A01.CB6(cursor);
        }
        throw new NoSuchElementException();
    }

    public C21487Akw(Cursor cursor, B80 b80) {
        this.A00 = new AnonymousClass8CF(cursor);
        this.A01 = b80;
    }

    public void remove() {
        throw C17880vN.A0y();
    }
}
