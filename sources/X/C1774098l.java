package X;

import android.content.Context;

/* renamed from: X.98l  reason: invalid class name and case insensitive filesystem */
public final class C1774098l extends C20083A6j {
    public final C193209pi A00;
    public final C19969A1e A01;
    public final C42341y1 A02;
    public final C18030ve A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1774098l(C18030ve r2, C20285AEt aEt, C193209pi r4, C19969A1e a1e, C185129c4 r6, C42341y1 r7) {
        super(aEt, r6);
        C18070vi.A0d(r2, 3);
        this.A03 = r2;
        this.A02 = r7;
        this.A00 = r4;
        this.A01 = a1e;
    }

    public String A0G(Context context) {
        C18070vi.A0d(context, 0);
        if (!C18020vd.A05(C18040vf.A02, this.A03, 4668)) {
            return null;
        }
        return super.A0G(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r2.A04 == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0B() {
        /*
            r7 = this;
            java.lang.String r5 = ""
            java.lang.String r1 = super.A0B()
            boolean r0 = X.AnonymousClass1EG.A0H(r1)
            if (r0 != 0) goto L_0x009a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            X.AEt r2 = r7.A02
            int r1 = r2.A00
            r0 = 7
            if (r1 != r0) goto L_0x001d
            X.ADa r1 = r2.A04
            r0 = 1
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 == 0) goto L_0x0096
            X.ADa r1 = r2.A04
            if (r1 == 0) goto L_0x0094
            java.util.List r0 = r1.A00
        L_0x0026:
            if (r0 == 0) goto L_0x0096
            if (r1 == 0) goto L_0x0091
            java.util.List r0 = r1.A00
        L_0x002c:
            java.util.Iterator r6 = r0.iterator()
        L_0x0030:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0096
            java.lang.Object r2 = r6.next()
            X.AEt r2 = (X.C20285AEt) r2
            X.1y1 r0 = r7.A02
            X.A6j r0 = r0.A00(r2)
            java.lang.String r1 = r0.A0B()
            java.lang.String r0 = "\n"
            X.C20083A6j.A03(r1, r0, r4)
            boolean r0 = r2.A04()
            if (r0 == 0) goto L_0x0030
            X.AEk r0 = r2.A06
            if (r0 == 0) goto L_0x0030
            java.util.List r0 = r0.A03
            java.util.Iterator r3 = r0.iterator()
        L_0x005b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r3.next()
            X.ADl r0 = (X.C20253ADl) r0
            X.AEe r1 = r0.A01
            java.lang.String r0 = r1.A00
            boolean r0 = X.AnonymousClass1EG.A0H(r0)
            if (r0 != 0) goto L_0x005b
            java.lang.String r2 = r1.A00
            org.json.JSONObject r1 = X.C17880vN.A16(r2)     // Catch:{ JSONException -> 0x0081 }
            java.lang.String r0 = "display_text"
            java.lang.String r1 = r1.optString(r0, r5)     // Catch:{ JSONException -> 0x0081 }
            X.C18070vi.A0X(r1)     // Catch:{ JSONException -> 0x0081 }
            goto L_0x008b
        L_0x0081:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CarouselMessageCustomizer/getEmailExportText: Failed to create json object from button params json = "
            X.C17900vP.A0e(r0, r2, r1)
            r1 = r5
        L_0x008b:
            java.lang.String r0 = "\n "
            X.C20083A6j.A03(r1, r0, r4)
            goto L_0x005b
        L_0x0091:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x002c
        L_0x0094:
            r0 = 0
            goto L_0x0026
        L_0x0096:
            java.lang.String r1 = r4.toString()
        L_0x009a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1774098l.A0B():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ec A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(X.C19998A2m r13, X.AnonymousClass206 r14) {
        /*
            r12 = this;
            X.C18070vi.A0h(r13, r14)
            super.A0H(r13, r14)
            boolean r0 = X.C20120A8f.A07(r14)
            if (r0 == 0) goto L_0x0132
            X.21L r14 = (X.AnonymousClass21L) r14
            java.util.List r1 = r14.A17()
            X.8X8 r4 = r13.A00
            X.Bm6 r0 = r4.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8cp r0 = r0.interactiveMessage_
            if (r0 != 0) goto L_0x001e
            X.8cp r0 = X.C166398cp.DEFAULT_INSTANCE
        L_0x001e:
            X.Bmt r3 = r0.A0O()
            X.Bm6 r0 = r3.A00
            X.8cp r0 = (X.C166398cp) r0
            X.8Z2 r0 = r0.A0R()
            X.Bmt r11 = r0.A0O()
            if (r1 == 0) goto L_0x011d
            java.util.Iterator r10 = r1.iterator()
        L_0x0034:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x011d
            X.206 r7 = X.C17880vN.A0Y(r10)
            boolean r2 = r7 instanceof X.AnonymousClass21K
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CarouselMessageCustomizer/buildCardMessage: message type is not supported "
            java.lang.String r0 = X.AnonymousClass001.A1E(r7, r0, r1)
            X.C17960vV.A0G(r2, r0)
            X.8X8 r0 = X.C166418cr.A00()
            X.C18070vi.A0X(r0)
            X.9n5 r1 = X.C181349Qd.A00(r0)
            r0 = 1
            r1.A03 = r0
            X.A2m r6 = r1.A00()
            X.1y1 r1 = r12.A02
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.message.interactive.InteractiveMessage"
            X.C18070vi.A0z(r7, r0)
            r0 = r7
            X.21K r0 = (X.AnonymousClass21K) r0
            X.A6j r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0072
            r0.A0H(r6, r7)
        L_0x0072:
            X.8X8 r0 = r6.A00
            X.Bm6 r0 = r0.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8cp r0 = r0.interactiveMessage_
            if (r0 != 0) goto L_0x007e
            X.8cp r0 = X.C166398cp.DEFAULT_INSTANCE
        L_0x007e:
            X.Bmt r9 = r0.A0O()
            X.8bW r0 = X.AnonymousClass8BW.A0M(r9)
            X.Bmt r5 = r0.A0O()
            X.8X3 r5 = (X.AnonymousClass8X3) r5
            boolean r0 = r7 instanceof X.C438521e
            if (r0 == 0) goto L_0x00f4
            X.9pi r8 = r12.A00
            X.21c r7 = (X.C438321c) r7
            X.Bm6 r2 = r5.A00
            X.8bW r2 = (X.C165638bW) r2
            int r1 = r2.mediaCase_
            r0 = 4
            if (r1 != r0) goto L_0x00f1
            java.lang.Object r0 = r2.media_
            X.Bm6 r0 = (X.C23577Bm6) r0
        L_0x00a1:
            X.Bmt r0 = r0.A0O()
            X.8We r0 = (X.C163748We) r0
            X.8We r0 = r8.A00(r6, r0, r7)
            if (r0 == 0) goto L_0x00b4
            X.8bW r1 = X.AnonymousClass8BX.A0O(r5, r0)
            r0 = 4
        L_0x00b2:
            r1.mediaCase_ = r0
        L_0x00b4:
            r5.A0G()
        L_0x00b7:
            X.Bm6 r1 = X.C17880vN.A0G(r9)
            X.8cp r1 = (X.C166398cp) r1
            X.Bm6 r0 = r5.A0C()
            X.8bW r0 = (X.C165638bW) r0
            r0.getClass()
            r1.header_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.Bm6 r5 = X.C17880vN.A0G(r11)
            X.8Z2 r5 = (X.AnonymousClass8Z2) r5
            X.Bm6 r2 = r9.A0C()
            int r0 = X.AnonymousClass8Z2.CARDS_FIELD_NUMBER
            r2.getClass()
            X.EE9 r1 = r5.cards_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00ec
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r5.cards_ = r1
        L_0x00ec:
            r1.add(r2)
            goto L_0x0034
        L_0x00f1:
            X.8cc r0 = X.C166268cc.DEFAULT_INSTANCE
            goto L_0x00a1
        L_0x00f4:
            boolean r0 = r7 instanceof X.C438121a
            if (r0 == 0) goto L_0x00b7
            X.Bm6 r2 = r5.A00
            X.8bW r2 = (X.C165638bW) r2
            int r1 = r2.mediaCase_
            r0 = 7
            if (r1 != r0) goto L_0x011a
            java.lang.Object r0 = r2.media_
            X.Bm6 r0 = (X.C23577Bm6) r0
        L_0x0105:
            X.Bmt r1 = r0.A0O()
            X.8Ww r1 = (X.C163928Ww) r1
            X.A1e r0 = r12.A01
            X.21W r7 = (X.AnonymousClass21W) r7
            r0.A02(r6, r1, r7)
            if (r1 == 0) goto L_0x00b4
            X.8bW r1 = X.AnonymousClass8BX.A0O(r5, r1)
            r0 = 7
            goto L_0x00b2
        L_0x011a:
            X.8ca r0 = X.C166248ca.DEFAULT_INSTANCE
            goto L_0x0105
        L_0x011d:
            X.Bm6 r1 = X.C17880vN.A0G(r3)
            X.8cp r1 = (X.C166398cp) r1
            X.Bm6 r0 = r11.A0C()
            r0.getClass()
            r1.interactiveMessage_ = r0
            r0 = 7
            r1.interactiveMessageCase_ = r0
            X.AnonymousClass8X8.A06(r3, r4)
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1774098l.A0H(X.A2m, X.206):void");
    }
}
