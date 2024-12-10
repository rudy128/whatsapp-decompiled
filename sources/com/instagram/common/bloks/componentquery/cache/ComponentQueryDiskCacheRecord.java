package com.instagram.common.bloks.componentquery.cache;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C17880vN;
import X.C18070vi;
import X.CC6;
import com.instagram.common.bloks.payload.BloksComponentQueryResources;
import java.io.Serializable;

public final class ComponentQueryDiskCacheRecord implements Serializable {
    public static final CC6 Companion = new Object();
    public final String payload;
    public final BloksComponentQueryResources resources;
    public final long responseTimestampMs;

    public ComponentQueryDiskCacheRecord(String str, long j, BloksComponentQueryResources bloksComponentQueryResources) {
        C18070vi.A0d(str, 1);
        this.payload = str;
        this.responseTimestampMs = j;
        this.resources = bloksComponentQueryResources;
    }

    public static /* synthetic */ ComponentQueryDiskCacheRecord copy$default(ComponentQueryDiskCacheRecord componentQueryDiskCacheRecord, String str, long j, BloksComponentQueryResources bloksComponentQueryResources, int i, Object obj) {
        if ((i & 1) != 0) {
            str = componentQueryDiskCacheRecord.payload;
        }
        if ((i & 2) != 0) {
            j = componentQueryDiskCacheRecord.responseTimestampMs;
        }
        if ((i & 4) != 0) {
            bloksComponentQueryResources = componentQueryDiskCacheRecord.resources;
        }
        return componentQueryDiskCacheRecord.copy(str, j, bloksComponentQueryResources);
    }

    public final String component1() {
        return this.payload;
    }

    public final long component2() {
        return this.responseTimestampMs;
    }

    public final BloksComponentQueryResources component3() {
        return this.resources;
    }

    public final ComponentQueryDiskCacheRecord copy(String str, long j, BloksComponentQueryResources bloksComponentQueryResources) {
        C18070vi.A0d(str, 0);
        return new ComponentQueryDiskCacheRecord(str, j, bloksComponentQueryResources);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ComponentQueryDiskCacheRecord) {
                ComponentQueryDiskCacheRecord componentQueryDiskCacheRecord = (ComponentQueryDiskCacheRecord) obj;
                if (!C18070vi.A18(this.payload, componentQueryDiskCacheRecord.payload) || this.responseTimestampMs != componentQueryDiskCacheRecord.responseTimestampMs || !C18070vi.A18(this.resources, componentQueryDiskCacheRecord.resources)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final BloksComponentQueryResources getResources() {
        return this.resources;
    }

    public final long getResponseTimestampMs() {
        return this.responseTimestampMs;
    }

    public int hashCode() {
        return AnonymousClass001.A0K(this.responseTimestampMs, C17880vN.A03(this.payload)) + AnonymousClass001.A0k(this.resources);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ComponentQueryDiskCacheRecord(payload=");
        A10.append(this.payload);
        A10.append(", responseTimestampMs=");
        A10.append(this.responseTimestampMs);
        A10.append(", resources=");
        return AnonymousClass001.A1F(this.resources, A10);
    }
}
