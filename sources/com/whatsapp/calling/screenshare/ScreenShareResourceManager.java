package com.whatsapp.calling.screenshare;

import X.AnonymousClass3KN;
import X.AnonymousClass7DO;
import X.C18070vi;
import android.media.projection.MediaProjection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public final class ScreenShareResourceManager {
    public final Set listeners;
    public final AtomicReference mediaProjectionHandle = new AtomicReference((Object) null);

    public final void registerListener(AnonymousClass3KN r2) {
        C18070vi.A0d(r2, 0);
        this.listeners.add(r2);
    }

    public final void setMediaProjectionHandle(MediaProjection mediaProjection) {
        C18070vi.A0d(mediaProjection, 0);
        this.mediaProjectionHandle.set(mediaProjection);
        notifyListenersOfMediaProjectionEnabled();
    }

    public final void unregisterListener(AnonymousClass3KN r2) {
        C18070vi.A0d(r2, 0);
        this.listeners.remove(r2);
    }

    private final void notifyListenersOfMediaProjectionDisabled() {
        for (AnonymousClass3KN r0 : this.listeners) {
            ((AnonymousClass7DO) r0).A00.mediaProjectionState.set(0);
        }
    }

    private final void notifyListenersOfMediaProjectionEnabled() {
        for (AnonymousClass3KN r0 : this.listeners) {
            ((AnonymousClass7DO) r0).A00.mediaProjectionState.set(1);
        }
    }

    public final void clearMediaProjectionHandle() {
        this.mediaProjectionHandle.set((Object) null);
        notifyListenersOfMediaProjectionDisabled();
    }

    public final MediaProjection getMediaProjectionHandle() {
        return (MediaProjection) this.mediaProjectionHandle.get();
    }

    public ScreenShareResourceManager() {
        Set synchronizedSet = Collections.synchronizedSet(new HashSet());
        C18070vi.A0X(synchronizedSet);
        this.listeners = synchronizedSet;
    }
}
