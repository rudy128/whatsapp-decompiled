package X;

import com.whatsapp.voipcalling.CallState;

/* renamed from: X.4j5  reason: invalid class name and case insensitive filesystem */
public final class C93504j5 implements C108595bx {
    public final /* synthetic */ C88464Zu A00;

    public AnonymousClass1D6 BMH(C87624Wh r3) {
        int i;
        int i2;
        C18070vi.A0d(r3, 0);
        if (BgP(r3)) {
            i = 2131898220;
            i2 = 2131898219;
        } else {
            i = 2131898222;
            i2 = 2131898221;
        }
        return AnonymousClass1D6.A00(i, i2);
    }

    public boolean Bh5(C87624Wh r5) {
        C18070vi.A0d(r5, 0);
        C88464Zu r3 = this.A00;
        C86534Sa r2 = r5.A00;
        AnonymousClass1DC r1 = r3.A03;
        if ((r2.A0Q || !r2.A0L) && r1.BcY() && !C88464Zu.A02(r5, r3)) {
            return true;
        }
        return false;
    }

    public C93504j5(C88464Zu r1) {
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

    public boolean Bec(C87624Wh r4) {
        C86534Sa A002 = C87624Wh.A00(r4);
        CallState callState = A002.A0B;
        C18070vi.A0W(callState);
        if (!AnonymousClass72U.A01(callState) || callState == CallState.LINK || A002.A0J) {
            return false;
        }
        C134216qE r0 = A002.A07;
        if (r0 == null || !r0.A0L) {
            return true;
        }
        return false;
    }

    public boolean BgP(C87624Wh r4) {
        C134216qE r2;
        C86534Sa A002 = C87624Wh.A00(r4);
        if (!A002.A0Q || (r2 = A002.A07) == null || AnonymousClass000.A1T(r2.A08, 6) || r2.A0L) {
            return false;
        }
        return true;
    }

    public /* synthetic */ int Bo7(C87624Wh r2) {
        return 0;
    }
}
