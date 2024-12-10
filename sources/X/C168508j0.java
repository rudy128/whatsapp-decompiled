package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.8j0  reason: invalid class name and case insensitive filesystem */
public final class C168508j0 extends C172588tf {
    public final AnonymousClass11S A00;
    public final C196209ud A01;
    public final C195689tk A02;
    public final BAP A03;
    public final C167818hp A04;
    public final AnonymousClass11E A05;
    public final C18030ve A06;
    public final C131206ki A07;
    public final C20004A2u A08;
    public final AnonymousClass4S5 A09;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C168508j0(X.AnonymousClass11S r17, X.C185579co r18, X.C186499eI r19, X.C196209ud r20, X.C195689tk r21, X.BAP r22, X.C167818hp r23, X.AnonymousClass11E r24, X.C18030ve r25, X.C131206ki r26, X.C20004A2u r27, X.C199279zj r28, X.C138476x9 r29, X.AnonymousClass4S5 r30, X.AnonymousClass10I r31) {
        /*
            r16 = this;
            r0 = 2
            r12 = r28
            X.C18070vi.A0d(r12, r0)
            r15 = 5
            r14 = r31
            r3 = r26
            r7 = r17
            X.C18070vi.A0q(r7, r3, r14)
            r5 = r24
            r4 = r25
            r2 = r27
            r1 = r30
            r6 = r20
            X.C18070vi.A0y(r2, r5, r6, r4, r1)
            r0 = 49479(0xc147, float:6.9335E-41)
            java.lang.Object r10 = X.AnonymousClass12Q.A01(r0)
            X.A0W r10 = (X.A0W) r10
            r8 = r16
            r9 = r18
            r11 = r19
            r13 = r29
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0 = r23
            r8.A04 = r0
            r0 = r21
            r8.A02 = r0
            r0 = r22
            r8.A03 = r0
            r8.A00 = r7
            r8.A07 = r3
            r8.A08 = r2
            r8.A05 = r5
            r8.A01 = r6
            r8.A06 = r4
            r8.A09 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168508j0.<init>(X.11S, X.9co, X.9eI, X.9ud, X.9tk, X.BAP, X.8hp, X.11E, X.0ve, X.6ki, X.A2u, X.9zj, X.6x9, X.4S5, X.10I):void");
    }

    public static final void A00(C168508j0 r1) {
        if (r1.A02.A05 == null) {
            r1.A08.A02("view_collection_details_tag");
        }
    }

    public void Brd(UserJid userJid) {
        Log.e("GetSingleCollectionGraphQLService/sendRequest/direct-connection-error");
        this.A03.Btx(422);
    }

    public void Bre(UserJid userJid) {
        Log.i("GetSingleCollectionGraphQLService/onDirectConnectionSucceeded/retry-request");
        A05();
    }

    public void BrB(IOException iOException) {
        A00(this);
        Log.e("GetSingleCollectionGraphQLService/sendRequest/onDeliveryFailure");
        if (!A07(this.A02.A04, -1, false)) {
            this.A03.Btx(-1);
        }
    }

    public void Bsw(Exception exc) {
        A00(this);
        Log.e("GetSingleCollectionGraphQLService/sendRequest/onError");
        if (!A07(this.A02.A04, 0, false)) {
            this.A03.Btx(0);
        }
    }
}
