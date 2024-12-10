package X;

import com.whatsapp.voipcalling.CallState;

/* renamed from: X.4j9  reason: invalid class name and case insensitive filesystem */
public final class C93544j9 implements C108595bx {
    public final /* synthetic */ C88464Zu A00;

    public AnonymousClass1D6 BMH(C87624Wh r3) {
        int i;
        int i2;
        C18070vi.A0d(r3, 0);
        if (BgP(r3)) {
            i = 2131898227;
            i2 = 2131898226;
        } else {
            i = 2131898207;
            i2 = 2131898206;
        }
        return AnonymousClass1D6.A00(i, i2);
    }

    public boolean Bh5(C87624Wh r2) {
        return true;
    }

    public int Bo7(C87624Wh r3) {
        C18070vi.A0d(r3, 0);
        if (BgP(r3)) {
            return 2131892238;
        }
        return 2131892239;
    }

    public C93544j9(C88464Zu r1) {
        this.A00 = r1;
    }

    public /* synthetic */ AnonymousClass4DG BMR(C87624Wh r2) {
        return null;
    }

    public /* synthetic */ int BSh(C87624Wh r2) {
        return 0;
    }

    public /* synthetic */ int BaS(C87624Wh r2) {
        return 0;
    }

    public /* synthetic */ C27881Xz BbI(C87624Wh r2) {
        return null;
    }

    public boolean Bec(C87624Wh r3) {
        CallState callState = C87624Wh.A00(r3).A0B;
        C18070vi.A0W(callState);
        return !AnonymousClass000.A1Z(callState, CallState.LINK);
    }

    public boolean BgP(C87624Wh r2) {
        C134216qE r0 = C87624Wh.A00(r2).A07;
        if (r0 != null) {
            return r0.A0I;
        }
        return false;
    }
}
