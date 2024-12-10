package X;

import android.util.Pair;
import java.io.Serializable;
import java.util.Locale;

/* renamed from: X.DRq  reason: case insensitive filesystem */
public class C27067DRq implements Serializable {
    public static final long serialVersionUID = -4973307892907888099L;
    public final String mAssetUrl;
    public final String mCacheName;
    public final long mCachedRangeEnd;
    public final long mCachedRangeStart;
    public final String mEvictionReason;
    public final boolean mIsSecondPhasePrefetch;
    public final String mKey;
    public final long mLength;
    public final long mNewLength;
    public final long mNewPosition;
    public final C24301Byy mOperation;
    public final long mPosition;
    public final String mPrefetchModule;
    public final String mPrefetchTag;
    public final String mRequestType;
    public final long mRequestedRangeEnd;
    public final long mRequestedRangeStart;
    public final String mSourceModule;
    public final long mTimestamp;

    public C27067DRq(Pair pair, C24301Byy byy, String str, String str2, String str3, String str4, String str5, long j, long j2) {
        long A05;
        this.mOperation = byy;
        this.mCacheName = str;
        this.mSourceModule = str2;
        this.mRequestType = str3;
        this.mKey = str4;
        this.mRequestedRangeStart = j;
        this.mRequestedRangeEnd = j2;
        long j3 = -1;
        if (pair == null) {
            A05 = -1;
        } else {
            A05 = C17880vN.A05(pair.first);
        }
        this.mCachedRangeStart = A05;
        this.mCachedRangeEnd = pair != null ? C17880vN.A05(pair.second) : j3;
        this.mPosition = 0;
        this.mLength = 0;
        this.mNewPosition = 0;
        this.mNewLength = 0;
        this.mEvictionReason = null;
        this.mTimestamp = System.currentTimeMillis();
        this.mAssetUrl = str5;
        this.mPrefetchTag = "unknown";
        this.mPrefetchModule = "unknown";
        this.mIsSecondPhasePrefetch = false;
    }

    public String toString() {
        Locale locale;
        Object[] objArr;
        String str;
        C24301Byy byy = this.mOperation;
        switch (byy.ordinal()) {
            case 0:
            case 1:
                Locale locale2 = Locale.US;
                Object[] objArr2 = new Object[7];
                objArr2[0] = this.mSourceModule;
                objArr2[1] = this.mRequestType;
                objArr2[2] = byy.name();
                objArr2[3] = this.mPrefetchTag;
                objArr2[4] = this.mKey;
                long j = this.mPosition;
                AnonymousClass3MX.A1S(objArr2, 5, j);
                objArr2[6] = Long.valueOf(j + this.mLength);
                return String.format(locale2, "[%s][%s][%s][%s] - %s [%d, %d] - [%s]", objArr2);
            case 2:
                long j2 = this.mPosition;
                long j3 = this.mNewPosition;
                if (j2 == j3) {
                    long j4 = this.mLength;
                    if (j4 == this.mNewLength) {
                        locale = Locale.US;
                        objArr = new Object[3];
                        objArr[0] = this.mKey;
                        AnonymousClass3MX.A1S(objArr, 1, j2);
                        AnonymousClass3MX.A1S(objArr, 2, j2 + j4);
                        str = "[SPAN HIT] - %s [%d, %d]";
                        break;
                    }
                }
                locale = Locale.US;
                objArr = new Object[5];
                objArr[0] = this.mKey;
                AnonymousClass3MX.A1S(objArr, 1, j2);
                AnonymousClass3MX.A1S(objArr, 2, j2 + this.mLength);
                AnonymousClass3MX.A1S(objArr, 3, j3);
                AnonymousClass3MX.A1S(objArr, 4, j3 + this.mNewLength);
                str = "[SPAN_TOUCHED] - %s [%d, %d],[%d,%d]";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                locale = Locale.US;
                objArr = new Object[]{this.mRequestType, byy, Pair.create(Long.valueOf(this.mRequestedRangeStart), Long.valueOf(this.mRequestedRangeEnd)), Pair.create(Long.valueOf(this.mCachedRangeStart), Long.valueOf(this.mCachedRangeEnd))};
                str = "[%s][%s] Requested %s, cached %s";
                break;
            default:
                return "Unknown. Err-roar";
        }
        return String.format(locale, str, objArr);
    }

    public C27067DRq(C24301Byy byy, String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, long j3, long j4) {
        this.mOperation = byy;
        this.mCacheName = str;
        this.mSourceModule = str2;
        this.mRequestType = str3;
        this.mKey = str4;
        this.mPosition = j;
        this.mLength = j2;
        this.mNewPosition = j3;
        this.mNewLength = j4;
        this.mEvictionReason = str6;
        this.mRequestedRangeStart = 0;
        this.mRequestedRangeEnd = 0;
        this.mCachedRangeStart = 0;
        this.mCachedRangeEnd = 0;
        this.mTimestamp = System.currentTimeMillis();
        this.mAssetUrl = str5;
        this.mPrefetchTag = "unknown";
        this.mPrefetchModule = "unknown";
        this.mIsSecondPhasePrefetch = false;
    }
}
