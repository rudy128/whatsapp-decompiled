package X;

import android.database.Cursor;

/* renamed from: X.1SX  reason: invalid class name */
public class AnonymousClass1SX {
    public final AnonymousClass11P A00;
    public final C25321Nt A01;
    public final AnonymousClass1Q7 A02;
    public final AnonymousClass1Cd A03;
    public final AnonymousClass00H A04;

    public C53802d7 A00(AnonymousClass205 r11) {
        AnonymousClass206 A05;
        Cursor A0A;
        int[] iArr;
        int length;
        if (r11 == null || (A05 = ((AnonymousClass1W6) this.A04.get()).A01.A05(r11)) == null) {
            return null;
        }
        long j = A05.A0x;
        C28781at A042 = this.A03.get();
        try {
            A0A = ((C28801av) A042).A02.A0A("SELECT sidecar, chunk_lengths FROM message_streaming_sidecar WHERE message_row_id = ?", "GET_MESSAGE_STREAMING_SIDECAR_SQL", new String[]{Long.toString(j)});
            if (A0A.moveToLast()) {
                byte[] blob = A0A.getBlob(A0A.getColumnIndexOrThrow("sidecar"));
                byte[] blob2 = A0A.getBlob(A0A.getColumnIndexOrThrow("chunk_lengths"));
                if (blob2 == null || (length = blob2.length) <= 0 || length % 4 != 0) {
                    iArr = null;
                } else {
                    int i = length / 4;
                    iArr = new int[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        int i3 = i2 * 4;
                        iArr[i2] = (blob2[i3 + 3] & 255) | ((blob2[i3] & 255) << 24) | ((blob2[i3 + 1] & 255) << 16) | ((blob2[i3 + 2] & 255) << 8);
                    }
                }
                C53802d7 r0 = new C53802d7(blob, iArr);
                A0A.close();
                A042.close();
                return r0;
            }
            A0A.close();
            A042.close();
            return null;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass1SX(AnonymousClass11P r2, C25321Nt r3, AnonymousClass1Q6 r4, AnonymousClass1Cd r5, AnonymousClass00H r6) {
        this.A00 = r2;
        this.A04 = r6;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4.A01;
    }
}
