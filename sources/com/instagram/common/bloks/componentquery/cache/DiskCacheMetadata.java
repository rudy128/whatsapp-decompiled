package com.instagram.common.bloks.componentquery.cache;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass8BV;
import X.C18070vi;
import com.instagram.common.bloks.payload.BloksComponentQueryResources;
import java.io.Serializable;

public final class DiskCacheMetadata implements Serializable {
    public final BloksComponentQueryResources resources;
    public final long responseCreatedTimestampMs;
    public final long serialVersionUID = 1;

    public final long component1() {
        return this.responseCreatedTimestampMs;
    }

    public final BloksComponentQueryResources component2() {
        return this.resources;
    }

    public final DiskCacheMetadata copy(long j, BloksComponentQueryResources bloksComponentQueryResources) {
        return new DiskCacheMetadata(j, bloksComponentQueryResources);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiskCacheMetadata) {
                DiskCacheMetadata diskCacheMetadata = (DiskCacheMetadata) obj;
                if (this.responseCreatedTimestampMs != diskCacheMetadata.responseCreatedTimestampMs || !C18070vi.A18(this.resources, diskCacheMetadata.resources)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DiskCacheMetadata copy$default(DiskCacheMetadata diskCacheMetadata, long j, BloksComponentQueryResources bloksComponentQueryResources, int i, Object obj) {
        if ((i & 1) != 0) {
            j = diskCacheMetadata.responseCreatedTimestampMs;
        }
        if ((i & 2) != 0) {
            bloksComponentQueryResources = diskCacheMetadata.resources;
        }
        return new DiskCacheMetadata(j, bloksComponentQueryResources);
    }

    public final BloksComponentQueryResources getResources() {
        return this.resources;
    }

    public final long getResponseCreatedTimestampMs() {
        return this.responseCreatedTimestampMs;
    }

    public int hashCode() {
        return AnonymousClass8BV.A00(this.responseCreatedTimestampMs) + AnonymousClass001.A0k(this.resources);
    }

    public DiskCacheMetadata(long j, BloksComponentQueryResources bloksComponentQueryResources) {
        this.responseCreatedTimestampMs = j;
        this.resources = bloksComponentQueryResources;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DiskCacheMetadata(responseCreatedTimestampMs=");
        A10.append(this.responseCreatedTimestampMs);
        A10.append(", resources=");
        return AnonymousClass001.A1F(this.resources, A10);
    }
}
