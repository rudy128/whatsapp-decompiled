package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class A0C {
    public static final String A06 = String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY, %s TEXT NOT NULL, %s INTEGER DEFAULT 0);", new Object[]{"queue", "_id", "item", "encrypted"});
    public final Context A00;
    public final AnonymousClass9WO A01;
    public final ReentrantReadWriteLock A02 = new ReentrantReadWriteLock();
    public final AnonymousClass8CG A03;
    public final AnonymousClass9P1 A04;
    public final C181949Sl A05;

    /* JADX WARNING: type inference failed for: r0v1, types: [android.database.sqlite.SQLiteOpenHelper, X.8CG] */
    public A0C(Context context, AnonymousClass9P1 r6, AnonymousClass9WO r7, C181949Sl r8) {
        this.A03 = new SQLiteOpenHelper(context, AnonymousClass001.A1H("_jobqueue-", "WhatsAppJobManager", AnonymousClass000.A10()), (SQLiteDatabase.CursorFactory) null, 1);
        this.A00 = context;
        this.A04 = r6;
        this.A05 = r8;
        this.A01 = r7;
    }

    public void A00(long j) {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A02;
            reentrantReadWriteLock.readLock().lock();
            this.A03.getWritableDatabase().delete("queue", "_id = ?", C17900vP.A0t(j));
            reentrantReadWriteLock.readLock().unlock();
        } catch (Throwable th) {
            this.A02.readLock().unlock();
            throw th;
        }
    }
}
