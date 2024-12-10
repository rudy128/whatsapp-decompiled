package com.facebook.cameracore.ardelivery.xplatcache.stash;

import X.AnonymousClass000;
import X.AnonymousClass1A8;
import X.C18070vi;
import X.C180829Oc;
import android.os.Looper;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCacheEntry;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileInMemoryStatus;
import com.facebook.jni.HybridData;
import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.Map;
import java.util.Set;

public final class StashARDFileCache extends ARDFileCache {
    public static final C180829Oc Companion = new Object();
    public final FileStash stash;

    public static final native HybridData initHybrid(long j, FileStash fileStash);

    public void commit(String str) {
    }

    public ARDFileCacheEntry getCacheEntry(String str) {
        C18070vi.A0d(str, 0);
        File file = this.stash.getFile(str);
        if (file != null) {
            return new ARDFileCacheEntry(file.getAbsolutePath());
        }
        return null;
    }

    public ARDFileCacheEntry getCacheEntryWithoutPromotion(String str) {
        C18070vi.A0d(str, 0);
        if (!this.stash.hasKey(str)) {
            return null;
        }
        return new ARDFileCacheEntry(this.stash.getFilePath(str).getAbsolutePath());
    }

    public ARDFileCacheEntry insertAndLock(String str) {
        C18070vi.A0d(str, 0);
        return new ARDFileCacheEntry(this.stash.insertFile(str).getAbsolutePath());
    }

    public ARDFileInMemoryStatus memContains(String str) {
        C18070vi.A0d(str, 0);
        if (this.stash.hasKey(str)) {
            return ARDFileInMemoryStatus.IN_CACHE;
        }
        return ARDFileInMemoryStatus.NOT_IN_CACHE;
    }

    public boolean remove(String str) {
        C18070vi.A0d(str, 0);
        return this.stash.remove(str);
    }

    public void unlock(String str) {
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.9Oc] */
    static {
        AnonymousClass1A8.A06("ardcache-stash");
    }

    public void clear() {
        this.stash.removeAll();
    }

    public void flush() {
        throw new UnsupportedOperationException("flush() is not supported in Stash");
    }

    public Map.Entry[] getAllMetas() {
        throw new UnsupportedOperationException("getAllMetas() is not supported in Stash");
    }

    public long getSize() {
        return this.stash.getSizeBytes();
    }

    public boolean updateExtra(String str, byte[] bArr) {
        throw new UnsupportedOperationException("updateExtra() is not supported in Stash");
    }

    public StashARDFileCache(long j, FileStash fileStash) {
        this.stash = fileStash;
        this.mHybridData = initHybrid(j, fileStash);
    }

    public Set getAllKeys() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            Set allKeys = this.stash.getAllKeys();
            C18070vi.A0X(allKeys);
            return allKeys;
        }
        throw AnonymousClass000.A0n("StashARDFileCache.getAllKeys() shouldn't be called on the main thread.");
    }
}
