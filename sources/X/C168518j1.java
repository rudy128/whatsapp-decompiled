package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.8j1  reason: invalid class name and case insensitive filesystem */
public final class C168518j1 extends C172588tf {
    public final AnonymousClass11S A00;
    public final C20114A7x A01;
    public final C192019nc A02;
    public final C196209ud A03;
    public final C195539tV A04;
    public final C167878hv A05;
    public final AnonymousClass11E A06;
    public final C18030ve A07;
    public final C131206ki A08;
    public final C20004A2u A09;
    public final AnonymousClass4S5 A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C168518j1(X.AnonymousClass11S r18, X.C20114A7x r19, X.C192019nc r20, X.C185579co r21, X.C186499eI r22, X.C196209ud r23, X.C195539tV r24, X.C167878hv r25, X.AnonymousClass11E r26, X.C18030ve r27, X.C131206ki r28, X.C20004A2u r29, X.C199279zj r30, X.C138476x9 r31, X.AnonymousClass4S5 r32, X.AnonymousClass10I r33) {
        /*
            r17 = this;
            r16 = 4
            r0 = 5
            r7 = r18
            X.C18070vi.A0d(r7, r0)
            r3 = r28
            r15 = r33
            r8 = r19
            X.C18070vi.A0q(r8, r3, r15)
            r5 = r26
            r4 = r27
            r2 = r29
            r13 = r30
            r6 = r23
            X.C18070vi.A0y(r13, r2, r6, r5, r4)
            r0 = 16
            r1 = r32
            X.C18070vi.A0d(r1, r0)
            r0 = 49479(0xc147, float:6.9335E-41)
            java.lang.Object r11 = X.AnonymousClass12Q.A01(r0)
            X.A0W r11 = (X.A0W) r11
            r9 = r17
            r10 = r21
            r12 = r22
            r14 = r31
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r0 = r25
            r9.A05 = r0
            r0 = r24
            r9.A04 = r0
            r0 = r20
            r9.A02 = r0
            r9.A00 = r7
            r9.A01 = r8
            r9.A08 = r3
            r9.A09 = r2
            r9.A03 = r6
            r9.A06 = r5
            r9.A07 = r4
            r9.A0A = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168518j1.<init>(X.11S, X.A7x, X.9nc, X.9co, X.9eI, X.9ud, X.9tV, X.8hv, X.11E, X.0ve, X.6ki, X.A2u, X.9zj, X.6x9, X.4S5, X.10I):void");
    }

    public static final void A00(C168518j1 r1) {
        C222119a A002;
        if (r1.A04.A06 == null && (A002 = C20004A2u.A00(r1.A09, "catalog_collections_view_tag")) != null) {
            A002.A06("datasource_collections");
        }
    }

    public void BrB(IOException iOException) {
        A00(this);
        Log.e("GetCollectionsGraphQLService/onDeliveryFailure");
        C195539tV r3 = this.A04;
        if (!A07(r3.A05, -1, false)) {
            this.A02.A01(r3, -1);
        }
    }

    public void Brd(UserJid userJid) {
        StringBuilder A0K = C18070vi.A0K(userJid);
        C17890vO.A19(A0K, AnonymousClass8BS.A0g(userJid, "GetCollectionsGraphQLService/onDirectConnectionError, jid = ", A0K));
        this.A02.A01(this.A04, 422);
    }

    public void Bre(UserJid userJid) {
        A05();
    }

    public void Bsw(Exception exc) {
        A00(this);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GetCollectionsGraphQLService/onError/error - ");
        A10.append(0);
        C17890vO.A0w(A10);
        C195539tV r1 = this.A04;
        if (!A07(r1.A05, 0, false)) {
            this.A02.A01(r1, 0);
        }
    }
}
