package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.8iz  reason: invalid class name and case insensitive filesystem */
public final class C168498iz extends C172588tf {
    public final C183879Zy A00;
    public final C193509qD A01;
    public final C196209ud A02;
    public final AnonymousClass11E A03;
    public final AnonymousClass4S5 A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C168498iz(X.C183879Zy r12, X.C193509qD r13, X.C185579co r14, X.A0W r15, X.C186499eI r16, X.C196209ud r17, X.AnonymousClass11E r18, X.C199279zj r19, X.C138476x9 r20, X.AnonymousClass4S5 r21, X.AnonymousClass10I r22) {
        /*
            r11 = this;
            r0 = 1
            r4 = r14
            r5 = r15
            r8 = r20
            X.C72473Md.A1M(r15, r14, r8, r0)
            r7 = r19
            r2 = r17
            X.C18070vi.A0l(r7, r2)
            r10 = 8
            r0 = 11
            r1 = r21
            X.C18070vi.A0d(r1, r0)
            r3 = r11
            r6 = r16
            r9 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r11.A02 = r2
            r0 = r18
            r11.A03 = r0
            r11.A01 = r13
            r11.A00 = r12
            r11.A04 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168498iz.<init>(X.9Zy, X.9qD, X.9co, X.A0W, X.9eI, X.9ud, X.11E, X.9zj, X.6x9, X.4S5, X.10I):void");
    }

    public void BrB(IOException iOException) {
        C18070vi.A0d(iOException, 0);
        Log.e("GetCatalogPromotionsGraphQLService/onDeliveryFailure", iOException);
        if (!A07(this.A01.A00, -1, false)) {
            A00(this, -1);
        }
    }

    public void Bsw(Exception exc) {
        C18070vi.A0d(exc, 0);
        Log.e("GetCatalogPromotionsGraphQLService/onError", exc);
        if (!A07(this.A01.A00, 0, false)) {
            A00(this, 0);
        }
    }

    public static final void A00(C168498iz r4, int i) {
        C183879Zy r1 = r4.A00;
        C193509qD r42 = r4.A01;
        C18070vi.A0d(r42, 0);
        ((AnonymousClass1KB) r1.A01.A0N.getValue()).A0J(new C21470Akb((Object) r1.A00, i, 20, (Object) r42));
    }

    public void Brd(UserJid userJid) {
        A00(this, 422);
    }

    public void Bre(UserJid userJid) {
        A05();
    }
}
