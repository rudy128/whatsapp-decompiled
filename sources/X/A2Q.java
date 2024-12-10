package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class A2Q {
    public static final String[] A0E;
    public final C001200q A00;
    public final C190879lf A01 = new C190879lf();
    public final C20076A6c A02;
    public final Object A03;
    public final Runnable A04;
    public final Map A05;
    public final Map A06;
    public final AtomicBoolean A07 = new AtomicBoolean(false);
    public final String[] A08;
    public final AnonymousClass9ZS A09;
    public final Object A0A;
    public final Map A0B;
    public volatile BDc A0C;
    public volatile boolean A0D;

    public void A01(AnonymousClass9ZR r14) {
        C186359e4 r0;
        boolean z;
        C18070vi.A0d(r14, 0);
        C001200q r1 = this.A00;
        synchronized (r1) {
            r0 = (C186359e4) r1.A01(r14);
        }
        if (r0 != null) {
            C190879lf r11 = this.A01;
            int[] iArr = r0.A02;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            C18070vi.A0d(copyOf, 0);
            synchronized (r11) {
                z = false;
                for (int i : copyOf) {
                    long[] jArr = r11.A01;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        z = true;
                        r11.A00 = true;
                    }
                }
            }
            if (z) {
                A00();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A02(BE3 be3) {
        BE3 be32 = be3;
        C18070vi.A0d(be32, 0);
        SQLiteDatabase sQLiteDatabase = ((AHQ) be32).A00;
        if (!sQLiteDatabase.inTransaction()) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.A02.A09.readLock();
                C18070vi.A0X(readLock);
                readLock.lock();
                try {
                    synchronized (this.A0A) {
                        int[] A002 = this.A01.A00();
                        if (A002 != null) {
                            if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
                                sQLiteDatabase.beginTransactionNonExclusive();
                            } else {
                                sQLiteDatabase.beginTransaction();
                            }
                            try {
                                int length = A002.length;
                                int i = 0;
                                int i2 = 0;
                                while (i < length) {
                                    int i3 = A002[i];
                                    int i4 = i2 + 1;
                                    if (i3 == 1) {
                                        StringBuilder A10 = AnonymousClass000.A10();
                                        A10.append("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
                                        A10.append(i2);
                                        be32.BKj(AnonymousClass000.A0y(", 0)", A10));
                                        String str = this.A08[i2];
                                        String[] strArr = A0E;
                                        int i5 = 0;
                                        while (true) {
                                            String str2 = strArr[i5];
                                            StringBuilder A102 = AnonymousClass000.A10();
                                            A102.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
                                            C18070vi.A0h(str, str2);
                                            StringBuilder A103 = AnonymousClass000.A10();
                                            A103.append("`room_table_modification_trigger_");
                                            A103.append(str);
                                            A103.append('_');
                                            A103.append(str2);
                                            A103.append('`');
                                            AnonymousClass8BS.A1D(A103, A102);
                                            A102.append(" AFTER ");
                                            A102.append(str2);
                                            A102.append(" ON `");
                                            A102.append(str);
                                            A102.append("` BEGIN UPDATE ");
                                            A102.append("room_table_modification_log");
                                            A102.append(" SET ");
                                            A102.append("invalidated");
                                            C17890vO.A18(A102, " = 1");
                                            A102.append("table_id");
                                            A102.append(" = ");
                                            A102.append(i2);
                                            A102.append(" AND ");
                                            A102.append("invalidated");
                                            A102.append(" = 0");
                                            String A0y = AnonymousClass000.A0y("; END", A102);
                                            C18070vi.A0X(A0y);
                                            be32.BKj(A0y);
                                            i5++;
                                            if (i5 >= 3) {
                                                break;
                                            }
                                        }
                                    } else if (i3 == 2) {
                                        String str3 = this.A08[i2];
                                        String[] strArr2 = A0E;
                                        int i6 = 0;
                                        while (true) {
                                            String str4 = strArr2[i6];
                                            StringBuilder A104 = AnonymousClass000.A10();
                                            A104.append("DROP TRIGGER IF EXISTS ");
                                            C18070vi.A0h(str3, str4);
                                            StringBuilder A105 = AnonymousClass000.A10();
                                            A105.append("`room_table_modification_trigger_");
                                            A105.append(str3);
                                            A105.append('_');
                                            A105.append(str4);
                                            A105.append('`');
                                            AnonymousClass8BS.A1D(A105, A104);
                                            be32.BKj(C18070vi.A0H(A104));
                                            i6++;
                                            if (i6 >= 3) {
                                                break;
                                            }
                                        }
                                    }
                                    i++;
                                    i2 = i4;
                                }
                                sQLiteDatabase.setTransactionSuccessful();
                                sQLiteDatabase.endTransaction();
                            } catch (Throwable th) {
                                sQLiteDatabase.endTransaction();
                                throw th;
                            }
                        }
                    }
                } finally {
                    readLock.unlock();
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            }
        }
    }

    public final void A00() {
        C20076A6c a6c = this.A02;
        BE3 be3 = a6c.A0B;
        if (be3 != null && ((AHQ) be3).A00.isOpen()) {
            A02(((AnonymousClass8CH) ((AHV) a6c.A03()).A04.getValue()).A00());
        }
    }

    static {
        String[] A1b = AnonymousClass8BR.A1b();
        A1b[0] = "UPDATE";
        A1b[1] = "DELETE";
        A1b[2] = "INSERT";
        A0E = A1b;
    }

    public A2Q(C20076A6c a6c, Map map, Map map2, String... strArr) {
        this.A02 = a6c;
        this.A0B = map;
        this.A06 = map2;
        int i = 0;
        this.A09 = new AnonymousClass9ZS(a6c);
        this.A00 = new C001200q();
        this.A0A = C17880vN.A0p();
        this.A03 = C17880vN.A0p();
        this.A05 = C17880vN.A13();
        String[] strArr2 = new String[7];
        do {
            String A0i = AnonymousClass8BW.A0i(strArr[i]);
            this.A05.put(A0i, Integer.valueOf(i));
            String A0s = C17880vN.A0s(strArr[i], this.A0B);
            strArr2[i] = A0s != null ? AnonymousClass8BW.A0i(A0s) : A0i;
            i++;
        } while (i < 7);
        this.A08 = strArr2;
        Iterator A15 = AnonymousClass000.A15(this.A0B);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            String A0i2 = AnonymousClass8BW.A0i(AnonymousClass8BR.A10(A16));
            if (this.A05.containsKey(A0i2)) {
                String A0i3 = AnonymousClass8BW.A0i(C17880vN.A0x(A16));
                Map map3 = this.A05;
                map3.put(A0i3, AnonymousClass8BV.A0m(A0i2, map3));
            }
        }
        this.A04 = new C21466AkX((Object) this, 16);
    }
}
