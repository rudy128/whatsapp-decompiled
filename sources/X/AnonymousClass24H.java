package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import java.util.NoSuchElementException;

/* renamed from: X.24H  reason: invalid class name */
public final class AnonymousClass24H extends AnonymousClass212 {
    public int A00;
    public long A01;
    public C49552Qx A02;
    public final byte[] A03;

    public void A1B(Cursor cursor, AnonymousClass1DL r11, HashMap hashMap) {
        C18070vi.A0d(r11, 0);
        C18070vi.A0d(cursor, 1);
        C18070vi.A0d(hashMap, 2);
        super.A1B(cursor, r11, hashMap);
        int A012 = AnonymousClass1Eu.A01(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, hashMap);
        int A013 = AnonymousClass1Eu.A01("extra_guest_count", hashMap);
        int A014 = AnonymousClass1Eu.A01("sender_timestamp", hashMap);
        int i = cursor.getInt(A012);
        long j = cursor.getLong(A014);
        int i2 = C49552Qx.UNKNOWN.value;
        int i3 = C49552Qx.MAYBE.value;
        if (i < i2) {
            i = i2;
        } else if (i > i3) {
            i = i3;
        }
        for (C49552Qx r3 : C49552Qx.values()) {
            if (r3.value == i) {
                this.A02 = r3;
                if (!cursor.isNull(A013)) {
                    this.A00 = cursor.getInt(A013);
                }
                this.A01 = j;
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public AnonymousClass24H(AnonymousClass205 r3, A51 a51, byte[] bArr, long j) {
        super(r3, 93, j);
        this.A01 = this.A01;
        this.A02 = this.A02;
        this.A03 = bArr;
        this.A05 = a51;
    }

    public AnonymousClass24H(AnonymousClass205 r2, long j) {
        super(r2, 93, j);
        this.A03 = null;
    }

    public AnonymousClass24H(AnonymousClass205 r2, C49552Qx r3, A51 a51, int i, long j, long j2) {
        super(r2, 93, j);
        this.A01 = j2;
        this.A02 = r3;
        this.A03 = null;
        this.A00 = i;
        this.A05 = a51;
    }

    public AnonymousClass24H(AnonymousClass205 r2, C49552Qx r3, int i, long j) {
        super(r2, 93, j);
        this.A01 = j;
        this.A02 = r3;
        this.A00 = i;
        this.A03 = null;
    }
}
