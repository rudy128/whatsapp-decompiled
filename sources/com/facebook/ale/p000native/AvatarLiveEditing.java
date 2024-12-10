package com.facebook.ale.p000native;

import X.AnonymousClass00R;
import X.AnonymousClass1A8;
import X.BE9;
import X.C18070vi;
import X.C7w;
import X.CU0;
import X.E0W;
import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ale.native.AvatarLiveEditing  reason: invalid package */
public final class AvatarLiveEditing {
    public static final C7w Companion = new Object();
    public final HybridData mHybridData;

    private final native HybridData initHybrid(String str, String str2, String str3, int i, String str4, TigonServiceHolder tigonServiceHolder, TigonServiceHolder tigonServiceHolder2, String str5, String str6, AvatarLiveEditingNotificationDelegate avatarLiveEditingNotificationDelegate, AvatarLiveEditingNetworkInterface avatarLiveEditingNetworkInterface, int i2, int i3, int i4, int i5, int i6);

    public final native void cancelAvatarUpdateRequest(String str);

    public final native void clearAvatarCache();

    public final native void getAlePointerHolder(LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder);

    public final native void prefetchAssets(String str, List list, int i, int i2);

    public final native void prefetchAvatar(String str, Map map);

    public final native void removeNotificationDelegate();

    public final native void requestAvatarUpdate(int i, String str, Map map, boolean z);

    public final native void saveCurrentAvatar();

    public final native void updateAvatarBodyMorphs(String str, Map map);

    public final native void updateAvatarSkeleton(String str, Map map);

    public final native void updateBlendWeights(String str, Map map);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C7w, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("ale");
        AnonymousClass1A8.A06("jniperflogger");
    }

    public AvatarLiveEditing(CU0 cu0, AvatarLiveEditingNotificationDelegate avatarLiveEditingNotificationDelegate) {
        int i;
        AvatarLiveEditingNetworkInterface avatarLiveEditingNetworkInterface;
        CU0 cu02 = cu0;
        AvatarLiveEditingNotificationDelegate avatarLiveEditingNotificationDelegate2 = avatarLiveEditingNotificationDelegate;
        C18070vi.A0j(cu02, avatarLiveEditingNotificationDelegate2);
        String str = cu02.A09;
        String str2 = cu02.A0A;
        Integer num = cu02.A02;
        if (1 - (num == null ? AnonymousClass00R.A01 : num).intValue() != 0) {
            i = 1;
        } else {
            i = 0;
        }
        String str3 = cu02.A07;
        if (str3 != null) {
            String str4 = cu02.A08;
            E0W e0w = cu02.A00;
            if (e0w != null) {
                avatarLiveEditingNetworkInterface = new AvatarLiveEditingNetworkInterface(e0w);
            } else {
                avatarLiveEditingNetworkInterface = null;
            }
            this.mHybridData = initHybrid((String) null, str, str2, i, str3, (TigonServiceHolder) null, (TigonServiceHolder) null, str4, (String) null, avatarLiveEditingNotificationDelegate2, avatarLiveEditingNetworkInterface, BE9.A0C(cu02.A01), BE9.A0C(cu02.A04), BE9.A0C(cu02.A06), BE9.A0C(cu02.A03), BE9.A0C(cu02.A05));
            return;
        }
        C18070vi.A11("cacheDirectoryUri");
        throw null;
    }

    public static /* synthetic */ void prefetchAssets$default(AvatarLiveEditing avatarLiveEditing, String str, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        avatarLiveEditing.prefetchAssets(str, list, i, i2);
    }

    public static /* synthetic */ void requestAvatarUpdate$default(AvatarLiveEditing avatarLiveEditing, int i, String str, Map map, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        avatarLiveEditing.requestAvatarUpdate(i, str, map, z);
    }
}
