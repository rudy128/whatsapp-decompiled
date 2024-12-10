package X;

import com.whatsapp.avatar.prefetch.AvatarPrefetchController;
import com.whatsapp.avatar.prefetch.AvatarPrefetchController$initialize$2;
import com.whatsapp.avatar.prefetch.AvatarPrefetchController$initialize$3;
import com.whatsapp.avatar.prefetch.AvatarPrefetchController$initialize$4;
import com.whatsapp.avatar.prefetch.AvatarPrefetchController$initialize$5;
import com.whatsapp.jid.PhoneUserJid;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.6n5  reason: invalid class name and case insensitive filesystem */
public final class C132586n5 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public final void A00(AnonymousClass01E r12) {
        String rawString;
        if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(this.A00), 9118)) {
            AvatarPrefetchController avatarPrefetchController = (AvatarPrefetchController) this.A02.get();
            synchronized (avatarPrefetchController) {
                if (!avatarPrefetchController.A04) {
                    avatarPrefetchController.A02();
                    avatarPrefetchController.A04 = true;
                    avatarPrefetchController.A00 = C88604aC.A03(avatarPrefetchController.A0B, AnonymousClass4I5.A00(avatarPrefetchController.A0A, new C27183DXs((Object) AnonymousClass3MZ.A0L(new AvatarPrefetchController$initialize$4((C30391dr) null), new C27183DXs((AnonymousClass1OS) new AvatarPrefetchController$initialize$3(avatarPrefetchController, (C30391dr) null), (C23421Fz) new C27183DXs((AnonymousClass1OS) new AvatarPrefetchController$initialize$2(avatarPrefetchController, (C30391dr) null), (C23421Fz) new C27183DXs((Object) avatarPrefetchController, (Object) C26092CsA.A02(avatarPrefetchController.A09.A04), 0), 10), 10)), (Object) new AvatarPrefetchController$initialize$5((C30391dr) null), 5)));
                }
            }
            AnonymousClass7OM r4 = new AnonymousClass7OM(0);
            AnonymousClass1D6[] r2 = new AnonymousClass1D6[2];
            AnonymousClass1D6.A03("logging_surface", "avatar_home", r2, 0);
            C108985cd.A1G("surface_type", "avatar_surface", r2);
            LinkedHashMap A0B = AnonymousClass1D7.A0B(r2);
            C18070vi.A0d(A0B, 0);
            String A0H = C18070vi.A0H(new JSONObject(C108975cc.A0h("params", C108975cc.A0h("server_params", A0B))));
            C133096oA r3 = (C133096oA) this.A01.get();
            WeakReference A0z = AnonymousClass3MW.A0z(r12);
            boolean A0B2 = C28281Zt.A0B(r12);
            PhoneUserJid A002 = AnonymousClass11S.A00((AnonymousClass11S) this.A03.get());
            if (A002 == null || (rawString = A002.getRawString()) == null) {
                throw C17880vN.A0g();
            }
            r3.A00(r4, C124436Yi.A00, "com.bloks.www.avatar.editor.cds.liveeditor.on_prepare_cold_start.prefetch.async", rawString, A0H, A0z, A0B2);
        }
    }

    public C132586n5(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r1;
        this.A03 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }
}
