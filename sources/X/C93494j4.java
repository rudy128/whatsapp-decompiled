package X;

/* renamed from: X.4j4  reason: invalid class name and case insensitive filesystem */
public final class C93494j4 implements C108595bx {
    public final /* synthetic */ C88464Zu A00;

    public AnonymousClass1D6 BMH(C87624Wh r4) {
        int i;
        C18070vi.A0d(r4, 0);
        if (r4.A00.A0Q || r4.A02.A01) {
            i = 2131886793;
        } else {
            i = 2131898224;
            if (BgP(r4)) {
                i = 2131898223;
            }
        }
        return AnonymousClass1D6.A01(Integer.valueOf(i), 0);
    }

    public int BSh(C87624Wh r4) {
        C18070vi.A0d(r4, 0);
        AnonymousClass4U2 r2 = r4.A02;
        if (r2.A01 && r2.A00 == 3) {
            return 2131231721;
        }
        if (!r2.A02 || r2.A00 != 4) {
            return 2131232425;
        }
        return 2131233317;
    }

    public boolean BgP(C87624Wh r4) {
        C18070vi.A0d(r4, 0);
        int i = r4.A02.A00;
        if (i == 1 || i == 3 || i == 4) {
            return true;
        }
        return false;
    }

    public int Bo7(C87624Wh r4) {
        C18070vi.A0d(r4, 0);
        if (BgP(r4)) {
            return r4.A02.A00 != 1 ? 0 : 2131896284;
        }
        return 2131896283;
    }

    public C93494j4(C88464Zu r1) {
        this.A00 = r1;
    }

    public /* synthetic */ AnonymousClass4DG BMR(C87624Wh r2) {
        return null;
    }

    public /* synthetic */ int BaS(C87624Wh r2) {
        return 0;
    }

    public /* synthetic */ C27881Xz BbI(C87624Wh r2) {
        return null;
    }

    public boolean Bec(C87624Wh r4) {
        C134216qE r0 = C87624Wh.A00(r4).A07;
        boolean z = false;
        if (r0 != null && r0.A0F) {
            z = true;
        }
        return !z;
    }

    public boolean Bh5(C87624Wh r2) {
        return true;
    }
}
