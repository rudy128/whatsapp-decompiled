package X;

import com.facebook.ale.p000native.AvatarLiveEditing;
import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import java.util.List;
import java.util.Map;

public final class D8Y implements EAU {
    public final List A00 = AnonymousClass000.A13();
    public final AvatarLiveEditing A01;

    public synchronized void CDu(C28490E3u e3u) {
        this.A00.add(e3u);
    }

    public void CFR(C24315BzC bzC, String str, Map map) {
        this.A01.requestAvatarUpdate(bzC.type, str, map, true);
    }

    public synchronized void CQB(C28490E3u e3u) {
        this.A00.remove(e3u);
    }

    public void BEP(String str) {
        this.A01.cancelAvatarUpdateRequest(str);
    }

    public void BEr() {
        this.A01.clearAvatarCache();
    }

    public LiveEditingRawMemoryPointerHolder BMj() {
        LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder = new LiveEditingRawMemoryPointerHolder();
        this.A01.getAlePointerHolder(liveEditingRawMemoryPointerHolder);
        return liveEditingRawMemoryPointerHolder;
    }

    public void CCF(Integer num, String str, List list, int i) {
        this.A01.prefetchAssets(str, list, i, BE9.A0C(num));
    }

    public void CCG(String str, Map map) {
        this.A01.prefetchAvatar(str, map);
    }

    public void CEo() {
        this.A01.removeNotificationDelegate();
    }

    public void CGh() {
        this.A01.saveCurrentAvatar();
    }

    public void CQT(String str, Map map) {
        this.A01.updateAvatarBodyMorphs(str, map);
    }

    public void CQU(String str, Map map) {
        this.A01.updateAvatarSkeleton(str, map);
    }

    public void CQW(String str, Map map) {
        this.A01.updateBlendWeights(str, map);
    }

    public D8Y(CU0 cu0) {
        C7w c7w = AvatarLiveEditing.Companion;
        this.A01 = new AvatarLiveEditing(cu0, new C26653D8c(this));
    }
}
