package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.8iy  reason: invalid class name and case insensitive filesystem */
public final class C168488iy extends C172588tf {
    public boolean A00;
    public final C195149ss A01;
    public final C196209ud A02;
    public final B7E A03;
    public final AnonymousClass11E A04;
    public final AnonymousClass4S5 A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C168488iy(X.C195149ss r11, X.C185579co r12, X.A0W r13, X.C186499eI r14, X.C196209ud r15, X.B7E r16, X.AnonymousClass11E r17, X.C199279zj r18, X.C138476x9 r19, X.AnonymousClass4S5 r20, X.AnonymousClass10I r21) {
        /*
            r10 = this;
            r0 = 1
            r3 = r12
            r4 = r13
            r7 = r19
            X.C72473Md.A1M(r13, r12, r7, r0)
            r9 = 6
            r6 = r18
            X.AnonymousClass8BU.A1H(r6, r9, r15)
            r0 = 11
            r1 = r20
            X.C18070vi.A0d(r1, r0)
            r2 = r10
            r5 = r14
            r8 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.A02 = r15
            r0 = r17
            r10.A04 = r0
            r0 = r16
            r10.A03 = r0
            r10.A01 = r11
            r10.A05 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168488iy.<init>(X.9ss, X.9co, X.A0W, X.9eI, X.9ud, X.B7E, X.11E, X.9zj, X.6x9, X.4S5, X.10I):void");
    }

    public void BrB(IOException iOException) {
        C18070vi.A0d(iOException, 0);
        Log.e("GetCategoriesGraphQLService/onDeliveryFailure", iOException);
        if (this.A00) {
            try {
                C195149ss r1 = this.A01;
                if (!A07(r1.A02, -1, false)) {
                    this.A03.Btm(r1, -1);
                }
            } catch (Exception unused) {
                this.A03.Btm(this.A01, 0);
            }
        } else {
            this.A00 = true;
            A05();
        }
    }

    public void Bsw(Exception exc) {
        C18070vi.A0d(exc, 0);
        Log.e("GetCategoriesGraphQLService/onError", exc);
        try {
            C195149ss r1 = this.A01;
            if (!A07(r1.A02, 0, false)) {
                this.A03.Btm(r1, 0);
            }
        } catch (Exception unused) {
            this.A03.Btm(this.A01, 0);
        }
    }

    public void Brd(UserJid userJid) {
        this.A03.Btm(this.A01, 422);
    }

    public void Bre(UserJid userJid) {
        A05();
    }
}
