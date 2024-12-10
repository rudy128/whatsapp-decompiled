package X;

import java.security.KeyPair;

/* renamed from: X.7SA  reason: invalid class name */
public class AnonymousClass7SA implements C18080vj, C22821Di {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public AnonymousClass7SA(C1606789m r1, C144177Gh r2, String str, KeyPair keyPair, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A03 = r2;
            this.A02 = keyPair;
            this.A04 = str;
            this.A01 = r1;
        } else {
            this.A01 = r1;
            this.A03 = r2;
            this.A02 = keyPair;
            this.A04 = str;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0088;
                case 1: goto L_0x002b;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.67u r2 = X.C108955ca.A0S(r12)
            java.lang.Object r5 = r11.A03
            X.7Gh r5 = (X.C144177Gh) r5
            java.lang.Object r7 = r11.A02
            java.security.KeyPair r7 = (java.security.KeyPair) r7
            java.lang.String r6 = r11.A04
            java.lang.Object r4 = r11.A01
            X.89m r4 = (X.C1606789m) r4
            r8 = 1
            X.7SA r3 = new X.7SA
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A00 = r3
            r1 = 33
            X.7SB r0 = new X.7SB
            r0.<init>((X.C1606789m) r4, (int) r1)
            r2.A01 = r0
        L_0x0028:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002b:
            r9 = 0
            X.C18070vi.A0d(r12, r9)
            X.A8k r12 = (X.C20125A8k) r12
            java.lang.String r1 = "xwa2_ent_generate_access_tokens"
            java.lang.Class<com.whatsapp.infra.graphql.generated.www_account_infra.WWWCreateAccessTokenResponseImpl$Xwa2EntGenerateAccessTokens> r0 = com.whatsapp.infra.graphql.generated.www_account_infra.WWWCreateAccessTokenResponseImpl.Xwa2EntGenerateAccessTokens.class
            X.A8k r2 = X.C108985cd.A0I(r12, r0, r1)
            java.lang.String r1 = "encrypted_fbid_and_access_token"
            java.lang.Class<com.whatsapp.infra.graphql.generated.www_account_infra.WWWCreateAccessTokenResponseImpl$Xwa2EntGenerateAccessTokens$EncryptedFbidAndAccessToken> r0 = com.whatsapp.infra.graphql.generated.www_account_infra.WWWCreateAccessTokenResponseImpl.Xwa2EntGenerateAccessTokens.EncryptedFbidAndAccessToken.class
            X.A8k r1 = X.C108985cd.A0I(r2, r0, r1)
            java.lang.Object r5 = r11.A03
            X.7Gh r5 = (X.C144177Gh) r5
            java.lang.String r0 = "key"
            org.json.JSONObject r1 = r1.A00
            java.lang.String r6 = X.C108955ca.A11(r0, r1)
            java.lang.String r0 = "data"
            java.lang.String r4 = X.C108955ca.A11(r0, r1)
            java.lang.String r0 = "tag"
            java.lang.String r3 = X.C108955ca.A11(r0, r1)
            java.lang.String r0 = "nonce"
            java.lang.String r2 = X.C108955ca.A11(r0, r1)
            r1 = 2
            java.lang.Object r0 = r11.A02
            java.security.KeyPair r0 = (java.security.KeyPair) r0
            java.security.PrivateKey r10 = r0.getPrivate()
            X.C18070vi.A0X(r10)
            java.lang.String r8 = r11.A04
            X.C18070vi.A0b(r8)
            java.lang.Object r7 = r11.A01
            X.89m r7 = (X.C1606789m) r7
            X.C18070vi.A0d(r8, r1)
            byte[] r6 = android.util.Base64.decode(r6, r9)
            byte[] r4 = android.util.Base64.decode(r4, r9)
            byte[] r3 = android.util.Base64.decode(r3, r9)
            byte[] r0 = android.util.Base64.decode(r2, r9)
            goto L_0x00ea
        L_0x0088:
            r9 = 0
            X.C18070vi.A0d(r12, r9)
            X.A8k r12 = (X.C20125A8k) r12
            java.lang.String r1 = "xwa2_ent_create_ent"
            java.lang.Class<com.whatsapp.infra.graphql.generated.www_account_infra.WWWCreateUserResponseImpl$Xwa2EntCreateEnt> r0 = com.whatsapp.infra.graphql.generated.www_account_infra.WWWCreateUserResponseImpl.Xwa2EntCreateEnt.class
            X.A8k r2 = X.C108985cd.A0I(r12, r0, r1)
            java.lang.String r1 = "encrypted_fbid_and_access_token"
            java.lang.Class<com.whatsapp.infra.graphql.generated.www_account_infra.WWWCreateUserResponseImpl$Xwa2EntCreateEnt$EncryptedFbidAndAccessToken> r0 = com.whatsapp.infra.graphql.generated.www_account_infra.WWWCreateUserResponseImpl.Xwa2EntCreateEnt.EncryptedFbidAndAccessToken.class
            X.A8k r1 = r2.A09(r0, r1)
            if (r1 != 0) goto L_0x00ab
            java.lang.Object r1 = r11.A01
            X.89m r1 = (X.C1606789m) r1
            java.lang.String r0 = "encryptedFbidAndAccessToken is null"
            X.C108965cb.A1D(r1, r0)
            goto L_0x0028
        L_0x00ab:
            java.lang.Object r5 = r11.A03
            X.7Gh r5 = (X.C144177Gh) r5
            java.lang.String r0 = "key"
            org.json.JSONObject r1 = r1.A00
            java.lang.String r4 = X.C108955ca.A11(r0, r1)
            java.lang.String r0 = "data"
            java.lang.String r3 = X.C108955ca.A11(r0, r1)
            java.lang.String r0 = "tag"
            java.lang.String r2 = X.C108955ca.A11(r0, r1)
            java.lang.String r0 = "nonce"
            java.lang.String r1 = X.C108955ca.A11(r0, r1)
            java.lang.Object r0 = r11.A02
            java.security.KeyPair r0 = (java.security.KeyPair) r0
            java.security.PrivateKey r10 = r0.getPrivate()
            X.C18070vi.A0X(r10)
            java.lang.String r8 = r11.A04
            java.lang.Object r7 = r11.A01
            X.89m r7 = (X.C1606789m) r7
            byte[] r6 = android.util.Base64.decode(r4, r9)
            byte[] r4 = android.util.Base64.decode(r3, r9)
            byte[] r3 = android.util.Base64.decode(r2, r9)
            byte[] r0 = android.util.Base64.decode(r1, r9)
        L_0x00ea:
            X.6h6 r1 = new X.6h6
            r1.<init>(r6, r4, r3, r0)
            X.00H r0 = r5.A00
            java.lang.Object r0 = r0.get()
            X.A0V r0 = (X.A0V) r0
            java.lang.String r1 = r0.A02(r1, r10)
            X.00H r0 = r5.A01
            r0.get()
            org.json.JSONObject r1 = X.C17880vN.A16(r1)
            X.1lW r0 = r5.A02()
            X.732 r0 = X.C137206v5.A00(r0, r8, r1)
            r7.C7I(r0)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7SA.invoke(java.lang.Object):java.lang.Object");
    }
}
