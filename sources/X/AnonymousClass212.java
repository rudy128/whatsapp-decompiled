package X;

import android.database.Cursor;
import java.util.HashMap;

/* renamed from: X.212  reason: invalid class name */
public abstract class AnonymousClass212 extends AnonymousClass206 {
    public int A00 = 0;
    public long A01;
    public long A02;
    public long A03;
    public A51 A04;
    public A51 A05;
    public int A06;

    public void A14(int i) {
        C17960vV.A0F(false, "Cannot change storage type for add on messages");
    }

    private void A0A() {
        if ((this instanceof AnonymousClass22C) && this.A00 != 2) {
            int i = this.A06;
            if (i != 0) {
                long j = this.A03;
                if (j != 0) {
                    this.A01 = j + (((long) i) * 1000);
                    return;
                }
            }
            this.A01 = 0;
        }
    }

    public int A17() {
        if (this instanceof AnonymousClass22C) {
            return this.A06;
        }
        return 0;
    }

    public AnonymousClass205 A18() {
        A51 a51 = this.A05;
        if (a51 == null) {
            return null;
        }
        return a51.A01;
    }

    public void A19(int i) {
        if ((this instanceof AnonymousClass22C) && i >= 0) {
            this.A06 = i;
            A0A();
        }
    }

    public void A1A(long j) {
        if (this.A03 <= 0) {
            this.A03 = j;
            A0A();
        }
    }

    public void A1B(Cursor cursor, AnonymousClass1DL r16, HashMap hashMap) {
        long j;
        int i;
        HashMap hashMap2 = hashMap;
        int A012 = AnonymousClass1Eu.A01("_id", hashMap2);
        int A013 = AnonymousClass1Eu.A01("sender_jid_row_id", hashMap2);
        int A014 = AnonymousClass1Eu.A01("parent_message_row_id", hashMap2);
        int A015 = AnonymousClass1Eu.A01("status", hashMap2);
        int A016 = AnonymousClass1Eu.A01("server_timestamp", hashMap2);
        int A017 = AnonymousClass1Eu.A01("expiry_duration_in_secs", hashMap2);
        int A018 = AnonymousClass1Eu.A01("expiry_type", hashMap2);
        int A019 = AnonymousClass1Eu.A01("expiry_timestamp", hashMap2);
        long j2 = cursor.getLong(A012);
        long j3 = cursor.getLong(A013);
        long j4 = cursor.getLong(A014);
        int i2 = cursor.getInt(A015);
        if (cursor.isNull(A016)) {
            j = 0;
        } else {
            j = cursor.getLong(A016);
        }
        int i3 = 0;
        if (cursor.isNull(A017)) {
            i = 0;
        } else {
            i = cursor.getInt(A017);
        }
        if (!cursor.isNull(A018)) {
            i3 = cursor.getInt(A018);
        } else if (i > 0) {
            i3 = 1;
        }
        this.A0x = j2;
        this.A0y = j2;
        A0d((AnonymousClass1BI) r16.A0E(AnonymousClass1BI.class, j3));
        this.A02 = j4;
        A0a(i2);
        A1A(j);
        this.A00 = i3;
        long j5 = cursor.getLong(A019);
        if (this instanceof AnonymousClass22C) {
            this.A01 = j5;
        }
        A19(i);
    }

    public boolean A1C() {
        if ((this instanceof C444923q) || (this instanceof AnonymousClass227) || (this instanceof AnonymousClass22E)) {
            return true;
        }
        if ((this instanceof AnonymousClass22C) || (this instanceof AnonymousClass22A)) {
            return false;
        }
        if ((this instanceof AnonymousClass24H) || (this instanceof AnonymousClass213)) {
            return true;
        }
        return false;
    }

    public boolean A1D(AnonymousClass11P r7) {
        if (this instanceof AnonymousClass22C) {
            long j = this.A01;
            if (j <= 0 || j >= AnonymousClass11P.A01(r7)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass212(AnonymousClass205 r2, int i, long j) {
        super(r2, i, j);
    }
}
