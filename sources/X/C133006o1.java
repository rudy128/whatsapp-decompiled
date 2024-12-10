package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.6o1  reason: invalid class name and case insensitive filesystem */
public class C133006o1 {
    public final AnonymousClass1CJ A00;
    public final C25321Nt A01;
    public final AnonymousClass1ST A02;
    public final AnonymousClass1Cd A03;
    public final C1403671d A04;
    public final AnonymousClass1W6 A05;
    public final C32021gV A06;

    public C133006o1(AnonymousClass1CJ r1, C25321Nt r2, AnonymousClass1ST r3, AnonymousClass1Cd r4, C1403671d r5, AnonymousClass1W6 r6, C32021gV r7) {
        this.A00 = r1;
        this.A05 = r6;
        this.A02 = r3;
        this.A06 = r7;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
    }

    public C128726ga A00(C42621yT r16, int i, int i2) {
        Cursor A022;
        r16.A02();
        try {
            C28781at A042 = this.A03.get();
            try {
                int i3 = i2;
                A022 = C31141f5.A02(this.A02, (AnonymousClass1BI) null, i3, 2);
                r16.A02();
                C109335dH r10 = new C109335dH(A022, (C18030ve) null, (AnonymousClass1BI) null, this.A05);
                ArrayList A13 = AnonymousClass000.A13();
                ArrayList A132 = AnonymousClass000.A13();
                int columnIndexOrThrow = A022.getColumnIndexOrThrow("file_size");
                long j = 0;
                if (r10.moveToFirst()) {
                    int i4 = 0;
                    do {
                        r16.A02();
                        AnonymousClass21V A012 = r10.A01();
                        if (A012 == null || !this.A00.A0S(A012.A0v.A00)) {
                            j += A022.getLong(columnIndexOrThrow);
                            if (i4 < i) {
                                AnonymousClass21V A013 = r10.A01();
                                C17960vV.A07(A013);
                                AnonymousClass7H2 A002 = C137216v6.A00(A013, this.A06);
                                A13.add(A002);
                                C17880vN.A1R(A132, A002.A01.A0x);
                            }
                            i4++;
                        }
                    } while (r10.moveToNext());
                }
                int size = A13.size();
                r10.close();
                if (i3 == 2) {
                    C1403671d r5 = this.A04;
                    C26301Rp r102 = r5.A00;
                    C26301Rp.A04(r102, "STORAGE_USAGE_LARGE_FILES_MEDIA_SIZE", String.valueOf(j));
                    C26301Rp.A04(r102, "STORAGE_USAGE_LARGE_FILES_COUNT", String.valueOf(size));
                    C26301Rp.A04(r102, "STORAGE_USAGE_LARGE_FILES_ROW_IDS", TextUtils.join(",", A132));
                    C1403671d.A00(r5, "STORAGE_USAGE_LARGE_FILES_CACHE_TIME");
                } else {
                    C1403671d r52 = this.A04;
                    C26301Rp r103 = r52.A00;
                    C26301Rp.A04(r103, "STORAGE_USAGE_FORWARDED_FILES_MEDIA_SIZE", String.valueOf(j));
                    C26301Rp.A04(r103, "STORAGE_USAGE_FORWARDED_FILES_COUNT", String.valueOf(size));
                    C26301Rp.A04(r103, "STORAGE_USAGE_FORWARDED_FILES_ROW_IDS", TextUtils.join(",", A132));
                    C1403671d.A00(r52, "STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME");
                }
                C128726ga r0 = new C128726ga(A13, size, j);
                A022.close();
                A042.close();
                return r0;
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (AnonymousClass1QC e) {
            throw e;
        } catch (RuntimeException e2) {
            Log.e("StorageUsageDbFetcher/fetchMediaFilesSummary", e2);
            return null;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }
}
