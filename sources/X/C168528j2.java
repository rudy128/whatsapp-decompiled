package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.8j2  reason: invalid class name and case insensitive filesystem */
public final class C168528j2 extends C172588tf {
    public final AnonymousClass190 A00;
    public final AnonymousClass11S A01;
    public final C26911Ty A02;
    public final C20114A7x A03;
    public final C196209ud A04;
    public final BAM A05;
    public final C167888hw A06;
    public final AnonymousClass11E A07;
    public final C188519hY A08;
    public final C18030ve A09;
    public final C131206ki A0A;
    public final C20004A2u A0B;
    public final AnonymousClass4S5 A0C;
    public final C19949A0g A0D;
    public final AnonymousClass1OZ A0E;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C168528j2(X.AnonymousClass190 r14, X.AnonymousClass11S r15, X.C26911Ty r16, X.C20114A7x r17, X.C185579co r18, X.A0W r19, X.C186499eI r20, X.C196209ud r21, X.BAM r22, X.C167888hw r23, X.AnonymousClass11E r24, X.C188519hY r25, X.C18030ve r26, X.C131206ki r27, X.C19949A0g r28, X.AnonymousClass1OZ r29, X.C20004A2u r30, X.C199279zj r31, X.C138476x9 r32, X.AnonymousClass4S5 r33, X.AnonymousClass10I r34) {
        /*
            r13 = this;
            r12 = 1
            r10 = r32
            r7 = r19
            r6 = r18
            X.C72473Md.A1M(r7, r6, r10, r12)
            r0 = 6
            r9 = r31
            r3 = r17
            X.C108975cc.A10(r9, r0, r3)
            r0 = 14
            r4 = r21
            X.C18070vi.A0d(r4, r0)
            r0 = 16
            r2 = r29
            X.C18070vi.A0d(r2, r0)
            r0 = 21
            r1 = r33
            X.C18070vi.A0d(r1, r0)
            r5 = r13
            r11 = r34
            r8 = r20
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.A01 = r15
            r0 = r22
            r13.A05 = r0
            r13.A00 = r14
            r0 = r30
            r13.A0B = r0
            r0 = r16
            r13.A02 = r0
            r13.A03 = r3
            r0 = r24
            r13.A07 = r0
            r13.A04 = r4
            r0 = r25
            r13.A08 = r0
            r13.A0E = r2
            r0 = r28
            r13.A0D = r0
            r0 = r23
            r13.A06 = r0
            r0 = r26
            r13.A09 = r0
            r0 = r27
            r13.A0A = r0
            r13.A0C = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168528j2.<init>(X.190, X.11S, X.1Ty, X.A7x, X.9co, X.A0W, X.9eI, X.9ud, X.BAM, X.8hw, X.11E, X.9hY, X.0ve, X.6ki, X.A0g, X.1OZ, X.A2u, X.9zj, X.6x9, X.4S5, X.10I):void");
    }

    public void BrB(IOException iOException) {
        C18070vi.A0d(iOException, 0);
        A00(this, iOException, "/delivery-error", -1, -1, false, true);
    }

    public void Bsw(Exception exc) {
        C18070vi.A0d(exc, 0);
        A00(this, exc, "/onError", 0, 0, false, false);
    }

    public static final void A00(C168528j2 r3, Exception exc, String str, int i, int i2, boolean z, boolean z2) {
        C222119a A002;
        Log.e("GetProductCatalogGraphQLService/onError/response-error");
        C188519hY r2 = r3.A08;
        if (r2.A09 == null && (A002 = C20004A2u.A00(r3.A0B, "catalog_collections_view_tag")) != null) {
            A002.A06("datasource_catalog");
        }
        if (!r3.A07(r2.A08, i, z)) {
            String A0A2 = C17900vP.A0A("GetProductCatalogGraphQLService", str);
            if (exc != null) {
                Log.e(A0A2, exc);
            } else {
                Log.e(A0A2);
            }
            r3.A05.Btn(r2, i2);
            if (!z2) {
                r3.A00.A0G(C17900vP.A0A("GetProductCatalogGraphQLService", str), AnonymousClass001.A1I("error_code=", AnonymousClass000.A10(), i2), true);
            }
        }
    }

    public void Brd(UserJid userJid) {
        C17900vP.A0X(userJid, "GetProductCatalogGraphQLServicesendGetBizProductCatalog/direct-connection-error/jid=", C18070vi.A0K(userJid));
        this.A05.Btn(this.A08, 422);
    }

    public void Bre(UserJid userJid) {
        A05();
    }
}
