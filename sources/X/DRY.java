package X;

import java.io.Serializable;

public final class DRY implements Serializable {
    public final int bucketDuration = 200;
    public final boolean enableTslog = false;
    public final int memoryBuckets = 1500;
}
