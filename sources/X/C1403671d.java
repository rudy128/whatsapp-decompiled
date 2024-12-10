package X;

/* renamed from: X.71d  reason: invalid class name and case insensitive filesystem */
public class C1403671d {
    public final C26301Rp A00;
    public final AnonymousClass11P A01;

    public static void A00(C1403671d r3, String str) {
        C26301Rp.A04(r3.A00, str, String.valueOf(AnonymousClass11P.A01(r3.A01)));
    }

    public static boolean A01(C1403671d r4, String str) {
        Long A0J = r4.A00.A0J(str);
        if (A0J == null || AnonymousClass11P.A01(r4.A01) - A0J.longValue() > 2592000000L) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.6jO, java.lang.Object] */
    public C130426jP A02() {
        ? obj = new Object();
        if (A01(this, "STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME")) {
            obj.A04 = this.A00.A0J("STORAGE_USAGE_MEDIA_SIZE");
        }
        if (A01(this, "STORAGE_USAGE_LARGE_FILES_CACHE_TIME")) {
            C26301Rp r1 = this.A00;
            obj.A03 = r1.A0J("STORAGE_USAGE_LARGE_FILES_MEDIA_SIZE");
            obj.A01 = r1.A0I("STORAGE_USAGE_LARGE_FILES_COUNT");
            obj.A06 = r1.A0L("STORAGE_USAGE_LARGE_FILES_ROW_IDS");
        }
        if (A01(this, "STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME")) {
            C26301Rp r12 = this.A00;
            obj.A02 = r12.A0J("STORAGE_USAGE_FORWARDED_FILES_MEDIA_SIZE");
            obj.A00 = r12.A0I("STORAGE_USAGE_FORWARDED_FILES_COUNT");
            obj.A05 = r12.A0L("STORAGE_USAGE_FORWARDED_FILES_ROW_IDS");
        }
        return new C130426jP(obj);
    }

    public C1403671d(AnonymousClass11P r1, C26301Rp r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
