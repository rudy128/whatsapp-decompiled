package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.8j3  reason: invalid class name and case insensitive filesystem */
public final class C168538j3 extends C172588tf {
    public final AnonymousClass11S A00;
    public final C26911Ty A01;
    public final C20114A7x A02;
    public final C196209ud A03;
    public final BAQ A04;
    public final C167848hs A05;
    public final AnonymousClass11E A06;
    public final C195469tO A07;
    public final C18030ve A08;
    public final C131206ki A09;
    public final C20004A2u A0A;
    public final AnonymousClass4S5 A0B;
    public final CatalogManager A0C;
    public final C19949A0g A0D;
    public final AnonymousClass1OZ A0E;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C168538j3(X.AnonymousClass11S r15, X.C26911Ty r16, X.C20114A7x r17, com.whatsapp.biz.catalog.manager.CatalogManager r18, X.C185579co r19, X.A0W r20, X.C186499eI r21, X.C196209ud r22, X.BAQ r23, X.C167848hs r24, X.AnonymousClass11E r25, X.C195469tO r26, X.C18030ve r27, X.C131206ki r28, X.C19949A0g r29, X.AnonymousClass1OZ r30, X.C20004A2u r31, X.C199279zj r32, X.C138476x9 r33, X.AnonymousClass4S5 r34, X.AnonymousClass10I r35) {
        /*
            r14 = this;
            r0 = 1
            r8 = r20
            X.C18070vi.A0d(r8, r0)
            r13 = 2
            r0 = 4
            r7 = r19
            X.C18070vi.A0d(r7, r0)
            r11 = r33
            r10 = r32
            X.C72473Md.A1J(r11, r10)
            r4 = r18
            r5 = r17
            X.AnonymousClass8BW.A1H(r4, r5)
            r2 = r30
            r3 = r22
            X.AnonymousClass8BW.A1I(r3, r2)
            r0 = 21
            r1 = r34
            X.C18070vi.A0d(r1, r0)
            r6 = r14
            r12 = r35
            r9 = r21
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r14.A00 = r15
            r0 = r31
            r14.A0A = r0
            r0 = r16
            r14.A01 = r0
            r14.A0C = r4
            r14.A02 = r5
            r0 = r26
            r14.A07 = r0
            r14.A03 = r3
            r14.A0E = r2
            r0 = r25
            r14.A06 = r0
            r0 = r29
            r14.A0D = r0
            r0 = r23
            r14.A04 = r0
            r0 = r24
            r14.A05 = r0
            r0 = r27
            r14.A08 = r0
            r0 = r28
            r14.A09 = r0
            r14.A0B = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168538j3.<init>(X.11S, X.1Ty, X.A7x, com.whatsapp.biz.catalog.manager.CatalogManager, X.9co, X.A0W, X.9eI, X.9ud, X.BAQ, X.8hs, X.11E, X.9tO, X.0ve, X.6ki, X.A0g, X.1OZ, X.A2u, X.9zj, X.6x9, X.4S5, X.10I):void");
    }

    public void BrB(IOException iOException) {
        C18070vi.A0d(iOException, 0);
        A00(this, iOException, "/onDeliveryFailure", 0, -1, false);
    }

    public void Brd(UserJid userJid) {
        StringBuilder A19 = AnonymousClass3MZ.A19(userJid, 0);
        C17890vO.A19(A19, AnonymousClass8BS.A0g(userJid, "GetProductGraphQLService/direct-connection-error/jid=", A19));
        this.A04.Bu8(this.A07, 0);
    }

    public void Bsw(Exception exc) {
        C18070vi.A0d(exc, 0);
        A00(this, exc, "/onError", 0, 0, false);
    }

    public static final void A00(C168538j3 r2, Exception exc, String str, int i, int i2, boolean z) {
        Log.e("GetProductGraphQLService/onError/response-error");
        r2.A0A.A02("view_product_tag");
        C195469tO r1 = r2.A07;
        if (!r2.A07(r1.A01, i2, z)) {
            String A0A2 = C17900vP.A0A("GetProductGraphQLService", str);
            if (exc != null) {
                Log.e(A0A2, exc);
            } else {
                Log.e(A0A2);
            }
            r2.A04.Bu8(r1, i);
        }
    }

    public void Bre(UserJid userJid) {
        A05();
    }
}
