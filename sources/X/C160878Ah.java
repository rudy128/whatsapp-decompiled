package X;

import android.database.ContentObserver;
import java.util.HashMap;

/* renamed from: X.8Ah  reason: invalid class name and case insensitive filesystem */
public interface C160878Ah {
    HashMap BNm();

    AnonymousClass8B2 BUY(int i);

    AnonymousClass8B2 CCk(int i);

    void CFP();

    void close();

    int getCount();

    boolean isEmpty();

    void registerContentObserver(ContentObserver contentObserver);

    void unregisterContentObserver(ContentObserver contentObserver);
}
