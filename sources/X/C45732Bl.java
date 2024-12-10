package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.2Bl  reason: invalid class name and case insensitive filesystem */
public final class C45732Bl extends C195879u4 {
    public final C19880zA A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45732Bl(Context context, C19880zA r3) {
        super(context);
        C18070vi.A0d(r3, 2);
        this.A00 = r3;
    }

    public void A04() {
    }

    public boolean A06(Intent intent) {
        C18070vi.A0d(intent, 0);
        return false;
    }

    public void A05(Intent intent) {
        this.A00.A03();
        throw AnonymousClass000.A0s("clearAwayMessagesTable");
    }
}
