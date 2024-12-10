package X;

import com.whatsapp.infra.graphql.generated.avatars.SelectedOrDefaultPoseQueryResponseImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.718  reason: invalid class name */
public final class AnonymousClass718 {
    public final AnonymousClass00H A00;
    public final C18600wl A01;
    public final AnonymousClass00H A02;

    public static final C135856ss A00(SelectedOrDefaultPoseQueryResponseImpl.FetchWAAvatar fetchWAAvatar, AnonymousClass718 r12) {
        AnonymousClass1IX r1;
        r12.A01(fetchWAAvatar, "missing envelope (fetch__WAAvatar)");
        if (fetchWAAvatar == null) {
            return null;
        }
        C20125A8k A09 = fetchWAAvatar.A09(SelectedOrDefaultPoseQueryResponseImpl.FetchWAAvatar.WaSelectedOrDefaultPose.class, "wa_selected_or_default_pose");
        r12.A01(A09, "missing waSelectedOrDefaultPose");
        if (A09 == null) {
            return null;
        }
        C20125A8k A092 = A09.A09(SelectedOrDefaultPoseQueryResponseImpl.FetchWAAvatar.WaSelectedOrDefaultPose.Sticker.class, "sticker");
        r12.A01(A092, "missing sticker");
        if (A092 == null) {
            return null;
        }
        String A0F = A092.A0F("url");
        r12.A01(A0F, "missing sticker url");
        if (A0F == null) {
            return null;
        }
        C20125A8k A093 = A09.A09(SelectedOrDefaultPoseQueryResponseImpl.FetchWAAvatar.WaSelectedOrDefaultPose.Background.class, "background");
        r12.A01(A093, "missing background");
        if (A093 == null) {
            return null;
        }
        String A0F2 = A093.A0F("url");
        r12.A01(A0F2, "missing backgroundUrl");
        if (A0F2 == null) {
            return null;
        }
        C20125A8k A094 = A092.A09(SelectedOrDefaultPoseQueryResponseImpl.FetchWAAvatar.WaSelectedOrDefaultPose.Sticker.Metadata.class, "metadata");
        if (A094 != null) {
            r1 = C108955ca.A0J(A094, SelectedOrDefaultPoseQueryResponseImpl.FetchWAAvatar.WaSelectedOrDefaultPose.Sticker.Metadata.ChildAnimationStickers.class, "child_animation_stickers");
            C18070vi.A0X(r1);
        } else {
            r1 = null;
        }
        r12.A01(r1, "missing childAnimationStickers");
        if (r1 == null) {
            return null;
        }
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = r1.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C20125A8k a8k = (C20125A8k) next;
            if (!(a8k.A0F("animation_type") == null || a8k.A0F("url") == null || C18070vi.A18(a8k.A0F("url"), "missing"))) {
                A13.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(A13));
        Iterator it2 = A13.iterator();
        while (it2.hasNext()) {
            C20125A8k A0V = C108945cZ.A0V(it2);
            linkedHashMap.put(A0V.A0F("animation_type"), A0V.A0F("url"));
        }
        Object obj = linkedHashMap.get("active");
        r12.A01(obj, "missing active anim");
        String str = (String) obj;
        if (str == null) {
            return null;
        }
        Object obj2 = linkedHashMap.get("passive");
        r12.A01(obj2, "missing passive anim");
        String str2 = (String) obj2;
        if (str2 == null) {
            return null;
        }
        return new C135856ss(new C135436sC(A0F, A092.A0F("accessibility_label"), A092.A0F("picd_handle_hash")), new C135436sC(A0F2, A093.A0F("accessibility_label"), A093.A0F("picd_handle_hash")), str2, str);
    }

    private final void A01(Object obj, String str) {
        if (obj == null) {
            C108945cZ.A0p(this.A02).A02(6, "malformed_default_pose_json_response", str);
        }
    }

    public AnonymousClass718(AnonymousClass00H r1, AnonymousClass00H r2, C18600wl r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }
}
