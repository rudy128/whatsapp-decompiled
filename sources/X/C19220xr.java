package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.0xr  reason: invalid class name and case insensitive filesystem */
public final class C19220xr extends C19210xq {
    public boolean equals(Object obj) {
        return obj == this || (obj instanceof C19210xq);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(10485760);
        sb.append(", loadBatchSize=");
        sb.append(200);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(SearchActionVerificationClientService.NOTIFICATION_ID);
        sb.append(", eventCleanUpAge=");
        sb.append(604800000);
        sb.append(", maxBlobByteSizePerRow=");
        sb.append(81920);
        sb.append("}");
        return sb.toString();
    }

    public int hashCode() {
        return ((((((((1000003 ^ ((int) (10485760 ^ (10485760 >>> 32)))) * 1000003) ^ 200) * 1000003) ^ SearchActionVerificationClientService.NOTIFICATION_ID) * 1000003) ^ ((int) (604800000 ^ (604800000 >>> 32)))) * 1000003) ^ 81920;
    }
}
