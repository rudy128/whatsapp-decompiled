package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.8j4  reason: invalid class name and case insensitive filesystem */
public final class C168548j4 extends C172588tf {
    public final AnonymousClass190 A00;
    public final AnonymousClass11S A01;
    public final C26911Ty A02;
    public final C196209ud A03;
    public final A20 A04;
    public final B7I A05;
    public final C167868hu A06;
    public final AnonymousClass11E A07;
    public final C18030ve A08;
    public final C131206ki A09;
    public final C20004A2u A0A;
    public final AnonymousClass4S5 A0B;
    public final C19949A0g A0C;
    public final AnonymousClass1OZ A0D;
    public final C183479Yk A0E;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C168548j4(X.AnonymousClass190 r13, X.AnonymousClass11S r14, X.C26911Ty r15, X.C185579co r16, X.A0W r17, X.C186499eI r18, X.C196209ud r19, X.A20 r20, X.B7I r21, X.C167868hu r22, X.AnonymousClass11E r23, X.C18030ve r24, X.C131206ki r25, X.C19949A0g r26, X.AnonymousClass1OZ r27, X.C20004A2u r28, X.C183479Yk r29, X.C199279zj r30, X.C138476x9 r31, X.AnonymousClass4S5 r32, X.AnonymousClass10I r33) {
        /*
            r12 = this;
            r0 = 1
            r6 = r17
            X.C18070vi.A0d(r6, r0)
            r11 = 3
            r0 = 4
            r5 = r16
            X.C18070vi.A0d(r5, r0)
            r9 = r31
            r8 = r30
            X.C72473Md.A1J(r9, r8)
            r0 = 12
            r3 = r19
            X.C18070vi.A0d(r3, r0)
            r0 = 13
            r2 = r27
            X.C18070vi.A0d(r2, r0)
            r0 = 21
            r1 = r32
            X.C18070vi.A0d(r1, r0)
            r4 = r12
            r10 = r33
            r7 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0 = r21
            r12.A05 = r0
            r0 = r28
            r12.A0A = r0
            r12.A02 = r15
            r12.A00 = r13
            r0 = r20
            r12.A04 = r0
            r12.A03 = r3
            r12.A0D = r2
            r0 = r29
            r12.A0E = r0
            r0 = r23
            r12.A07 = r0
            r0 = r26
            r12.A0C = r0
            r0 = r22
            r12.A06 = r0
            r0 = r24
            r12.A08 = r0
            r12.A01 = r14
            r0 = r25
            r12.A09 = r0
            r12.A0B = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168548j4.<init>(X.190, X.11S, X.1Ty, X.9co, X.A0W, X.9eI, X.9ud, X.A20, X.B7I, X.8hu, X.11E, X.0ve, X.6ki, X.A0g, X.1OZ, X.A2u, X.9Yk, X.9zj, X.6x9, X.4S5, X.10I):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.AN6] */
    public void BrB(IOException iOException) {
        C18070vi.A0d(iOException, 0);
        ? obj = new Object();
        obj.A00 = 3;
        A00(obj, this, iOException, "/onDeliveryFailure", -1, -1, false);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.AN6] */
    public void Bsw(Exception exc) {
        C18070vi.A0d(exc, 0);
        ? obj = new Object();
        obj.A00 = 2;
        A00(obj, this, exc, "/onError", 0, 0, false);
    }

    public static final void A00(AN6 an6, C168548j4 r3, Exception exc, String str, int i, int i2, boolean z) {
        Log.e("GetProductListGraphQLService/onError/response-error");
        r3.A0A.A02("plm_details_view_tag");
        if (!r3.A07(r3.A04.A01, i2, z)) {
            String A0A2 = C17900vP.A0A("GetProductListGraphQLService", str);
            if (exc != null) {
                Log.e(A0A2, exc);
            } else {
                Log.e(A0A2);
            }
            r3.A05.CBu(an6);
            r3.A00.A0G(C17900vP.A0A("GetProductListGraphQLService", str), AnonymousClass001.A1I("error_code=", AnonymousClass000.A10(), i), true);
        }
    }

    public void Brd(UserJid userJid) {
        StringBuilder A0K = C18070vi.A0K(userJid);
        C17890vO.A19(A0K, AnonymousClass8BS.A0g(userJid, "GetProductListGraphQLService/onDirectConnectionError/jid=", A0K));
        this.A0A.A02("plm_details_view_tag");
        AN6.A00(this.A05, 2);
        AnonymousClass190 r3 = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("error_code=");
        r3.A0G("GetProductListGraphQLService/get product list error - direct connection failed", C17880vN.A0t(A10, 422), true);
    }

    public void Bre(UserJid userJid) {
        A05();
    }
}
