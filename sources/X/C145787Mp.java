package X;

import com.whatsapp.camera.mode.CameraModeTabLayout;

/* renamed from: X.7Mp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C145787Mp implements AnonymousClass88D {
    public final /* synthetic */ CameraModeTabLayout A00;

    public final void C8M(int i, Integer num) {
        CameraModeTabLayout cameraModeTabLayout = this.A00;
        C136836uU A08 = cameraModeTabLayout.A08(i);
        if (A08 != null) {
            if (num == null || num.intValue() != i) {
                int i2 = 1;
                boolean A18 = C18070vi.A18(A08.A06, 1);
                C20050A4v a4v = (C20050A4v) cameraModeTabLayout.getMediaSharingUserJourneyLogger().get();
                if (cameraModeTabLayout.A03) {
                    i2 = 6;
                }
                int i3 = 17;
                int i4 = 36;
                if (A18) {
                    i3 = 18;
                    i4 = 35;
                }
                C108955ca.A1Q(a4v, i4, i2, i3);
            }
            C1594884s r2 = cameraModeTabLayout.A01;
            if (r2 != null) {
                Object obj = A08.A06;
                C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.Int");
                ((AnonymousClass7DU) r2).A00.A0p(AnonymousClass000.A0M(obj));
            }
            cameraModeTabLayout.A03 = false;
        }
    }

    public /* synthetic */ C145787Mp(CameraModeTabLayout cameraModeTabLayout) {
        this.A00 = cameraModeTabLayout;
    }
}
