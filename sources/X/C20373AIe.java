package X;

import com.facebook.cameracore.ardelivery.xplatcache.stash.StashARDFileCache;
import com.facebook.stash.core.FileStash;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.AIe  reason: case insensitive filesystem */
public final class C20373AIe implements B4X {
    public StashARDFileCache A00;
    public final long A01;
    public final FileStash A02;
    public final AtomicReference A03;

    public C20373AIe(FileStash fileStash, AtomicReference atomicReference, long j) {
        this.A02 = fileStash;
        this.A03 = atomicReference;
        this.A01 = j;
    }
}
