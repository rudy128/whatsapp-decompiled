package X;

import com.whatsapp.voipcalling.CallState;

/* renamed from: X.4jA  reason: invalid class name and case insensitive filesystem */
public final class C93554jA implements C108595bx {
    public final /* synthetic */ C88464Zu A00;

    public boolean Bh5(C87624Wh r2) {
        C18070vi.A0d(r2, 0);
        return false;
    }

    public C93554jA(C88464Zu r1) {
        this.A00 = r1;
    }

    public AnonymousClass1D6 BMH(C87624Wh r3) {
        int i;
        int i2;
        C134216qE r0 = C87624Wh.A00(r3).A07;
        if (r0 == null || !r0.A0L) {
            i = 2131895454;
            i2 = 2131895453;
        } else {
            i = 2131895458;
            i2 = 2131895457;
        }
        return AnonymousClass1D6.A00(i, i2);
    }

    public /* synthetic */ AnonymousClass4DG BMR(C87624Wh r2) {
        return null;
    }

    public int BSh(C87624Wh r2) {
        return 2131233365;
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
        if (callState != CallState.ACTIVE || A002.A0P) {
            return false;
        }
        C18070vi.A0W(callState);
        return true;
    }

    public boolean BgP(C87624Wh r4) {
        C134216qE r0 = C87624Wh.A00(r4).A07;
        if (r0 == null || !r0.A0L) {
            return false;
        }
        return true;
    }

    public /* synthetic */ int Bo7(C87624Wh r2) {
        return 0;
    }
}
