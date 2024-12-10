package X;

import com.whatsapp.util.Log;

public final class ASQ implements B83, B85, C436820m {
    public void BDb(C19998A2m a2m, AnonymousClass206 r8) {
        C179719Jq r2;
        C18070vi.A0h(r8, a2m);
        Class<AnonymousClass249> cls = AnonymousClass249.class;
        if (!(r8 instanceof AnonymousClass249)) {
            String A0U = C17890vO.A0U(r8);
            String name = cls.getName();
            String str = "".toString();
            throw AnonymousClass206.A02(r8, name, A0U, C17890vO.A0W(str), str);
        }
        AnonymousClass2S8 r5 = ((AnonymousClass249) r8).A00;
        if (r5 != null) {
            AnonymousClass8X8 r3 = a2m.A00;
            C165218am r0 = ((C166418cr) r3.A00).bcallMessage_;
            if (r0 == null) {
                r0 = C165218am.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r0.A0O();
            int i = r5.A00;
            if (i == 1) {
                r2 = C179719Jq.AUDIO;
            } else if (i != 2) {
                r2 = C179719Jq.UNKNOWN;
            } else {
                r2 = C179719Jq.VIDEO;
            }
            C165218am r1 = (C165218am) C17880vN.A0G(A0O);
            int i2 = C165218am.CAPTION_FIELD_NUMBER;
            r1.mediaType_ = r2.value;
            r1.bitField0_ |= 2;
            String str2 = r5.A03;
            C165218am r12 = (C165218am) C17880vN.A0G(A0O);
            r12.bitField0_ |= 1;
            r12.sessionId_ = str2;
            C23581BmB A03 = C17900vP.A03(A0O, r5.A04);
            C165218am r13 = (C165218am) A0O.A00;
            r13.bitField0_ |= 4;
            r13.masterKey_ = A03;
            String str3 = r5.A02;
            if (str3 != null) {
                C165218am r14 = (C165218am) C17880vN.A0G(A0O);
                r14.bitField0_ |= 8;
                r14.caption_ = str3;
            }
            C165218am r02 = (C165218am) A0O.A0C();
            C166418cr A0J = AnonymousClass8BV.A0J(r3, r02);
            A0J.bcallMessage_ = r02;
            A0J.bitField1_ |= 67108864;
            return;
        }
        Log.e("FMessageBCallProtobuf/session is null");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.2S8] */
    /* JADX WARNING: type inference failed for: r0v13, types: [X.249, X.206] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 CBG(X.C20077A6d r8) {
        /*
            r7 = this;
            X.8cr r2 = X.C20077A6d.A01(r8)
            int r1 = r2.bitField1_
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0071
            X.8am r2 = r2.bcallMessage_
            if (r2 != 0) goto L_0x0011
            X.8am r2 = X.C165218am.DEFAULT_INSTANCE
        L_0x0011:
            int r0 = r2.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0068
            java.lang.String r6 = r2.sessionId_
            X.C18070vi.A0X(r6)
            int r1 = r2.mediaType_
            if (r1 == 0) goto L_0x0065
            r0 = 1
            if (r1 == r0) goto L_0x0062
            r0 = 2
            if (r1 != r0) goto L_0x0065
            X.9Jq r0 = X.C179719Jq.VIDEO
        L_0x0028:
            int r0 = r0.ordinal()
            r4 = 1
            if (r0 == r4) goto L_0x0033
            r4 = 2
            if (r0 == r4) goto L_0x0033
            r4 = 0
        L_0x0033:
            X.DSQ r0 = r2.masterKey_
            byte[] r3 = X.AnonymousClass8BS.A1P(r0)
            java.lang.String r2 = r2.caption_
            r0 = -1
            X.2S8 r5 = new X.2S8
            r5.<init>()
            r5.A03 = r6
            r5.A00 = r4
            r5.A02 = r2
            r5.A01 = r0
            int r0 = r3.length
            byte[] r0 = java.util.Arrays.copyOf(r3, r0)
            X.C18070vi.A0X(r0)
            r5.A04 = r0
            X.205 r4 = r8.A0A
            long r2 = r8.A03
            r1 = 91
            X.249 r0 = new X.249
            r0.<init>(r4, r1, r2)
            r0.A00 = r5
            return r0
        L_0x0062:
            X.9Jq r0 = X.C179719Jq.AUDIO
            goto L_0x0028
        L_0x0065:
            X.9Jq r0 = X.C179719Jq.UNKNOWN
            goto L_0x0028
        L_0x0068:
            r1 = 11
            java.lang.String r0 = "bcall message doesn't have master key"
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r1)
            throw r0
        L_0x0071:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ASQ.CBG(X.A6d):X.206");
    }
}
