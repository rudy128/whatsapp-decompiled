package com.facebook.cameracore.mediapipeline.services.avatars;

import X.AnonymousClass1A8;
import X.C24531C8c;
import com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper;
import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import com.facebook.jni.HybridData;
import java.util.Map;

public final class AvatarsNativeInputDelegate {
    public static final C24531C8c Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    public final native void loadAnimationFromFile(String str, String str2);

    public final native void loadAvatarFromMemory(String str, String str2, GltfMemoryPointerWrapper gltfMemoryPointerWrapper);

    public final native void loadColorRampFromMemory(String str, String str2, LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder);

    public final native void setAle(LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder);

    public final native void setFixedElapsedTimeForAnimation(float f);

    public final native void updateBlendWeightsForPrimitive(LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder);

    public final native void updateSliderValues(Map map);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C8c, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("avatarsdataprovider");
    }
}
