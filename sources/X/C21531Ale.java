package X;

/* renamed from: X.Ale  reason: case insensitive filesystem */
public class C21531Ale implements C18080vj, C22821Di {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C21531Ale(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        if (r3 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x027a, code lost:
        if (r12.equals("unserviceable_location") == false) goto L_0x027c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0247;
                case 1: goto L_0x0158;
                case 2: goto L_0x0140;
                case 3: goto L_0x008f;
                case 4: goto L_0x0023;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.67u r4 = X.C108955ca.A0S(r12)
            java.lang.Object r3 = r11.A02
            java.lang.Object r2 = r11.A01
            X.B9U r2 = (X.B9U) r2
            r1 = 4
            X.Ale r0 = new X.Ale
            r0.<init>(r2, r3, r1)
            r4.A00 = r0
            r0 = 45
            X.Ali r1 = new X.Ali
            r1.<init>((X.B9U) r2, (int) r0)
        L_0x001e:
            r4.A01 = r1
        L_0x0020:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0023:
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            X.A8k r12 = (X.C20125A8k) r12
            java.lang.String r1 = "xwa2_fetch_wa_users"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.UsyncQueryResponseImpl$Xwa2FetchWaUsers> r0 = com.whatsapp.infra.graphql.generated.usync.UsyncQueryResponseImpl.Xwa2FetchWaUsers.class
            X.1IX r0 = r12.A0A(r0, r1)
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = X.C29431cG.A0c(r0)
            X.A8k r0 = (X.C20125A8k) r0
            if (r0 == 0) goto L_0x008d
            org.json.JSONObject r0 = r0.A00
            X.C18070vi.A0W(r0)
            com.whatsapp.infra.graphql.generated.usync.UsernameFieldsImpl r2 = new com.whatsapp.infra.graphql.generated.usync.UsernameFieldsImpl
            r2.<init>(r0)
            java.lang.String r1 = "username_info"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.UsernameFieldsImpl$UsernameInfo> r0 = com.whatsapp.infra.graphql.generated.usync.UsernameFieldsImpl.UsernameInfo.class
            X.A8k r0 = r2.A09(r0, r1)
            if (r0 == 0) goto L_0x008d
            org.json.JSONObject r2 = r0.A00
            int r1 = X.AnonymousClass8BT.A03(r2)
            r0 = 785443910(0x2ed0ec46, float:9.5007155E-11)
            if (r1 != r0) goto L_0x008d
            com.whatsapp.infra.graphql.generated.usync.UsernameFieldsImpl$UsernameInfo$InlineXWA2Username r3 = new com.whatsapp.infra.graphql.generated.usync.UsernameFieldsImpl$UsernameInfo$InlineXWA2Username
            r3.<init>(r2)
        L_0x005f:
            java.lang.String r1 = ""
            if (r3 == 0) goto L_0x006b
            java.lang.String r0 = "username"
            java.lang.String r2 = r3.A0F(r0)
            if (r2 != 0) goto L_0x006e
        L_0x006b:
            r2 = r1
            if (r3 == 0) goto L_0x0077
        L_0x006e:
            java.lang.String r0 = "pin"
            java.lang.String r0 = r3.A0F(r0)
            if (r0 == 0) goto L_0x0077
            r1 = r0
        L_0x0077:
            java.lang.Object r0 = r11.A02
            X.Ae8 r0 = (X.C21078Ae8) r0
            X.4bI r0 = r0.A00
            r0.A02(r1)
            java.lang.Object r1 = r11.A01
            X.B9U r1 = (X.B9U) r1
            X.9AN r0 = new X.9AN
            r0.<init>(r2)
            r1.C3i(r0)
            goto L_0x0020
        L_0x008d:
            r3 = 0
            goto L_0x005f
        L_0x008f:
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            X.A8k r12 = (X.C20125A8k) r12
            java.lang.String r4 = "xwa2_username_check"
            java.lang.Class<com.whatsapp.infra.graphql.generated.username.UsernameCheckResponseImpl$Xwa2UsernameCheck> r3 = com.whatsapp.infra.graphql.generated.username.UsernameCheckResponseImpl.Xwa2UsernameCheck.class
            X.A8k r2 = X.C108985cd.A0I(r12, r3, r4)
            com.whatsapp.infra.graphql.generated.username.enums.GraphQLXWA2UsernameCheckResult r1 = com.whatsapp.infra.graphql.generated.username.enums.GraphQLXWA2UsernameCheckResult.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "result"
            java.lang.Enum r1 = r2.A0D(r1, r0)
            X.C18070vi.A0X(r1)
            com.whatsapp.infra.graphql.generated.username.enums.GraphQLXWA2UsernameCheckResult r0 = com.whatsapp.infra.graphql.generated.username.enums.GraphQLXWA2UsernameCheckResult.SUCCESS
            if (r1 != r0) goto L_0x011e
            java.lang.Object r3 = r11.A01
            com.whatsapp.profile.viewmodel.UsernameSetViewModel r3 = (com.whatsapp.profile.viewmodel.UsernameSetViewModel) r3
            X.A1S r2 = X.A1S.A00
        L_0x00b2:
            X.1OB r0 = r3.A01
            if (r0 == 0) goto L_0x00cb
            boolean r1 = r0.isCancelled()
            r0 = 1
            if (r1 != r0) goto L_0x00cb
        L_0x00bd:
            java.lang.Object r2 = r11.A02
            X.67u r2 = (X.C1193567u) r2
            r1 = 5
            X.Alc r0 = new X.Alc
            r0.<init>(r1)
            r2.A01 = r0
            goto L_0x0020
        L_0x00cb:
            X.A1S r0 = X.A1S.A00
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 == 0) goto L_0x00f4
            X.0vl r0 = r3.A0A
            X.1G4 r1 = X.AnonymousClass3MW.A17(r0)
            X.9I3 r0 = X.AnonymousClass9I3.ENABLED
            r1.setValue(r0)
            X.0vl r0 = r3.A09
            X.1G4 r1 = X.AnonymousClass3MW.A17(r0)
            X.9IB r0 = X.AnonymousClass9IB.AVAILABLE
            r1.setValue(r0)
            X.0vl r0 = r3.A0B
            X.1G4 r2 = X.AnonymousClass3MW.A17(r0)
            r0 = 0
        L_0x00f0:
            r2.setValue(r0)
            goto L_0x00bd
        L_0x00f4:
            boolean r0 = r2 instanceof X.C193249pm
            if (r0 == 0) goto L_0x02a9
            X.0vl r0 = r3.A0A
            X.1G4 r1 = X.AnonymousClass3MW.A17(r0)
            X.9I3 r0 = X.AnonymousClass9I3.DISABLED
            r1.setValue(r0)
            X.0vl r0 = r3.A09
            X.1G4 r1 = X.AnonymousClass3MW.A17(r0)
            X.9IB r0 = X.AnonymousClass9IB.ERROR
            r1.setValue(r0)
            X.0vl r0 = r3.A0B
            X.1G4 r2 = X.AnonymousClass3MW.A17(r0)
            X.118 r1 = r3.A03
            r0 = 2131895785(0x7f1225e9, float:1.9426413E38)
            java.lang.String r0 = X.C18070vi.A0G(r1, r0)
            goto L_0x00f0
        L_0x011e:
            com.whatsapp.infra.graphql.generated.username.enums.GraphQLXWA2UsernameCheckResult r0 = com.whatsapp.infra.graphql.generated.username.enums.GraphQLXWA2UsernameCheckResult.INVALID
            if (r1 != r0) goto L_0x00bd
            X.A8k r1 = X.C108985cd.A0I(r12, r3, r4)
            java.lang.String r0 = "suggestions"
            X.1IX r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x013d
            java.util.List r0 = X.C29431cG.A0t(r0)
        L_0x0132:
            java.lang.Object r3 = r11.A01
            com.whatsapp.profile.viewmodel.UsernameSetViewModel r3 = (com.whatsapp.profile.viewmodel.UsernameSetViewModel) r3
            X.9pm r2 = new X.9pm
            r2.<init>(r0)
            goto L_0x00b2
        L_0x013d:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x0132
        L_0x0140:
            X.67u r4 = X.C108955ca.A0S(r12)
            java.lang.Object r3 = r11.A02
            java.lang.Object r2 = r11.A01
            r1 = 1
            X.Ale r0 = new X.Ale
            r0.<init>(r2, r3, r1)
            r4.A00 = r0
            r0 = 3
            X.Alc r1 = new X.Alc
            r1.<init>(r0)
            goto L_0x001e
        L_0x0158:
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            java.lang.Object r8 = r11.A02
            X.9et r8 = (X.C186869et) r8
            X.A8k r12 = (X.C20125A8k) r12
            java.lang.String r1 = "xwa2_ohai_configurations"
            java.lang.Class<com.whatsapp.infra.graphql.generated.ohai.OhaiKeyConfigQueryResponseImpl$Xwa2OhaiConfigurations> r0 = com.whatsapp.infra.graphql.generated.ohai.OhaiKeyConfigQueryResponseImpl.Xwa2OhaiConfigurations.class
            X.A8k r2 = r12.A09(r0, r1)
            if (r2 == 0) goto L_0x0240
            java.lang.String r1 = "ohai_configs"
            java.lang.Class<com.whatsapp.infra.graphql.generated.ohai.OhaiKeyConfigQueryResponseImpl$Xwa2OhaiConfigurations$OhaiConfigs> r0 = com.whatsapp.infra.graphql.generated.ohai.OhaiKeyConfigQueryResponseImpl.Xwa2OhaiConfigurations.OhaiConfigs.class
            X.1IX r1 = X.C108955ca.A0J(r2, r0, r1)
            X.C18070vi.A0X(r1)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0240
            java.util.Iterator r9 = r1.iterator()
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02ae
            java.lang.Object r7 = r9.next()
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01bd
            r0 = r7
            X.A8k r0 = (X.C20125A8k) r0
            java.lang.String r6 = "expiration_date"
            java.lang.String r0 = r0.A0F(r6)
            if (r0 == 0) goto L_0x023c
            long r4 = java.lang.Long.parseLong(r0)
        L_0x01a0:
            java.lang.Object r3 = r9.next()
            r0 = r3
            X.A8k r0 = (X.C20125A8k) r0
            java.lang.String r0 = r0.A0F(r6)
            if (r0 == 0) goto L_0x0238
            long r1 = java.lang.Long.parseLong(r0)
        L_0x01b1:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b7
            r7 = r3
            r4 = r1
        L_0x01b7:
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto L_0x01a0
        L_0x01bd:
            X.A8k r7 = (X.C20125A8k) r7
            X.0vl r0 = r8.A03
            android.content.SharedPreferences$Editor r2 = X.C17890vO.A0A(r0)
            java.lang.String r1 = "id"
            java.lang.String r9 = "key_id"
            org.json.JSONObject r4 = r7.A00
            int r0 = r4.optInt(r9)
            android.content.SharedPreferences$Editor r2 = r2.putInt(r1, r0)
            java.lang.String r1 = "kem"
            java.lang.String r8 = "kem_id"
            int r0 = r4.optInt(r8)
            android.content.SharedPreferences$Editor r2 = r2.putInt(r1, r0)
            java.lang.String r1 = "kdf"
            java.lang.String r5 = "kdf_id"
            int r0 = r4.optInt(r5)
            android.content.SharedPreferences$Editor r2 = r2.putInt(r1, r0)
            java.lang.String r1 = "aead"
            java.lang.String r3 = "aead_id"
            int r0 = r4.optInt(r3)
            android.content.SharedPreferences$Editor r1 = r2.putInt(r1, r0)
            java.lang.String r6 = "public_key"
            java.lang.String r0 = r7.A0F(r6)
            android.content.SharedPreferences$Editor r2 = r1.putString(r6, r0)
            java.lang.String r1 = "expiration_date"
            java.lang.String r0 = r7.A0F(r1)
            X.C17880vN.A1E(r2, r1, r0)
            java.lang.String r1 = r7.A0F(r6)
            if (r1 == 0) goto L_0x0020
            X.9zo r0 = X.C199329zo.A03
            byte[] r10 = X.C20094A6x.A03(r1, r0)
            int r0 = r4.optInt(r9)
            short r6 = (short) r0
            int r0 = r4.optInt(r8)
            short r7 = (short) r0
            int r0 = r4.optInt(r5)
            short r8 = (short) r0
            int r0 = r4.optInt(r3)
            short r9 = (short) r0
            com.whatsapp.ohai.PublicKeyConfig r5 = new com.whatsapp.ohai.PublicKeyConfig
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r0 = r11.A01
            X.1Di r0 = (X.C22821Di) r0
            r0.invoke(r5)
            goto L_0x0020
        L_0x0238:
            r1 = -9223372036854775808
            goto L_0x01b1
        L_0x023c:
            r4 = -9223372036854775808
            goto L_0x01a0
        L_0x0240:
            java.lang.String r0 = "OhaiKeyConfigManager/getKeyConfigFromMex unexpected null or empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0020
        L_0x0247:
            java.lang.Object r2 = r11.A01
            com.whatsapp.biz.product.view.activity.ProductDetailActivity r2 = (com.whatsapp.biz.product.view.activity.ProductDetailActivity) r2
            java.lang.Object r3 = r11.A02
            X.AEW r3 = (X.AEW) r3
            java.lang.String r12 = (java.lang.String) r12
            r0 = 2
            X.C18070vi.A0d(r12, r0)
            r2.CEx()
            int r0 = r12.length()
            if (r0 == 0) goto L_0x0020
            int r1 = r12.hashCode()
            r0 = -1930003499(0xffffffff8cf67bd5, float:-3.797683E-31)
            if (r1 == r0) goto L_0x0298
            r0 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            if (r1 == r0) goto L_0x0284
            r0 = 688255102(0x2905f07e, float:2.9740526E-14)
            if (r1 != r0) goto L_0x027c
            java.lang.String r0 = "unserviceable_location"
            boolean r0 = r12.equals(r0)
            r1 = 2131897355(0x7f122c0b, float:1.9429597E38)
            if (r0 != 0) goto L_0x027f
        L_0x027c:
            r1 = 2131896261(0x7f1227c5, float:1.9427378E38)
        L_0x027f:
            r2.BhQ(r1)
            goto L_0x0020
        L_0x0284:
            java.lang.String r0 = "success"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x027c
            com.whatsapp.biz.product.view.activity.ProductDetailActivity.A03(r2, r3)
            com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet r0 = r2.A01
            if (r0 == 0) goto L_0x0020
            r0.A2M()
            goto L_0x0020
        L_0x0298:
            java.lang.String r0 = "invalid_postcode"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x027c
            com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet r0 = r2.A01
            if (r0 == 0) goto L_0x0020
            r0.A2N()
            goto L_0x0020
        L_0x02a9:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x02ae:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21531Ale.invoke(java.lang.Object):java.lang.Object");
    }
}
