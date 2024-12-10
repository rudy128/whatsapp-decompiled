package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.22E  reason: invalid class name */
public class AnonymousClass22E extends AnonymousClass212 {
    public long A00;
    public List A01;
    public byte[] A02;
    @Deprecated
    public byte[] A03;
    @Deprecated
    public byte[] A04;
    @Deprecated
    public byte[] A05;
    public final List A06;

    public AnonymousClass22E(AnonymousClass205 r2, long j) {
        super(r2, 67, j);
        this.A06 = new ArrayList();
    }

    public void A1B(Cursor cursor, AnonymousClass1DL r4, HashMap hashMap) {
        super.A1B(cursor, r4, hashMap);
        this.A00 = cursor.getLong(AnonymousClass1Eu.A01("sender_timestamp", hashMap));
    }

    public AnonymousClass22E(AnonymousClass205 r3, A51 a51, List list, long j, long j2, long j3) {
        super(r3, 67, j);
        this.A05 = a51;
        this.A04 = null;
        this.A02 = j2;
        ArrayList arrayList = new ArrayList();
        this.A06 = arrayList;
        arrayList.addAll(list);
        this.A00 = j3;
    }

    public AnonymousClass22E(long j, AnonymousClass205 r5, A51 a51, List list, long j2, long j3) {
        super(r5, 67, j);
        this.A05 = a51;
        this.A04 = null;
        this.A02 = j2;
        this.A06 = new ArrayList();
        this.A01 = list;
        this.A00 = j3;
    }
}
