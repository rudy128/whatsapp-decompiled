package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterInput;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.A8r  reason: case insensitive filesystem */
public final class C20131A8r {
    public final AnonymousClass1M9 A00;
    public final C24671Lf A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass1CJ A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass190 A09;
    public final AnonymousClass1KB A0A;
    public final C24751Ln A0B;
    public final C18030ve A0C;
    public final AnonymousClass00H A0D;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C194509rq A06(X.C46162Dk r10, X.C197879xQ r11, boolean r12) {
        /*
            r4 = 0
            if (r12 == 0) goto L_0x005e
            if (r10 == 0) goto L_0x0063
            long r0 = r10.A0I
        L_0x0007:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x000b:
            r2 = -1
            if (r0 == 0) goto L_0x005b
            long r8 = r0.longValue()
        L_0x0013:
            if (r12 == 0) goto L_0x0054
            if (r10 == 0) goto L_0x0059
            java.lang.String r7 = r10.A0V
        L_0x0019:
            if (r11 != 0) goto L_0x0022
            r5 = r8
        L_0x001c:
            X.9rq r4 = new X.9rq
            r4.<init>(r5, r7, r8)
            return r4
        L_0x0022:
            java.lang.String r1 = r11.A00
            if (r1 != 0) goto L_0x002e
            java.lang.String r0 = r11.A01
            if (r0 != 0) goto L_0x002e
            r5 = r8
        L_0x002b:
            r7 = r4
            r8 = r2
            goto L_0x001c
        L_0x002e:
            java.lang.String r0 = r11.A01
            if (r0 == 0) goto L_0x004e
            java.lang.Long r0 = X.AnonymousClass1YD.A04(r0)
            if (r0 == 0) goto L_0x004e
            long r5 = r0.longValue()
        L_0x003c:
            if (r1 != 0) goto L_0x003f
            r1 = r7
        L_0x003f:
            r4 = r1
            if (r1 == 0) goto L_0x002b
            int r0 = r1.length()
            if (r0 == 0) goto L_0x002b
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0051
            r2 = r8
            goto L_0x002b
        L_0x004e:
            r5 = -1
            goto L_0x003c
        L_0x0051:
            r2 = 0
            goto L_0x002b
        L_0x0054:
            if (r10 == 0) goto L_0x0059
            java.lang.String r7 = r10.A0U
            goto L_0x0019
        L_0x0059:
            r7 = r4
            goto L_0x0019
        L_0x005b:
            r8 = -1
            goto L_0x0013
        L_0x005e:
            if (r10 == 0) goto L_0x0063
            long r0 = r10.A0J
            goto L_0x0007
        L_0x0063:
            r0 = r4
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20131A8r.A06(X.2Dk, X.9xQ, boolean):X.9rq");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01bc, code lost:
        if (r11 == null) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c2, code lost:
        if (r11 != null) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C46162Dk A0B(com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields r60) {
        /*
            r59 = this;
            r10 = 0
            X.25J r0 = X.C29681ch.A03
            r0 = r60
            X.A8k r0 = (X.C20125A8k) r0
            java.lang.String r0 = X.C20125A8k.A08(r0)
            X.1ch r5 = X.AnonymousClass25J.A00(r0)
            r3 = r59
            X.1CJ r9 = r3.A03
            X.1ci r0 = r9.A0A(r5)
            X.1ci r2 = A01(r0, r3)
            boolean r0 = r2 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x01f9
            X.2Dk r2 = (X.C46162Dk) r2
        L_0x0021:
            r7 = -1
            r37 = 0
            if (r2 == 0) goto L_0x01f5
            long r0 = r2.A0D
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x01f5
        L_0x002d:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r60.BaL()
            if (r0 == 0) goto L_0x01f1
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Picture r0 = r0.BX7()
        L_0x0037:
            r1 = 1
            X.9xQ r0 = A07(r0, r10)
            X.9rq r1 = A06(r2, r0, r1)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r60.BaL()
            if (r0 == 0) goto L_0x01ee
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Preview r0 = r0.BXR()
            if (r0 == 0) goto L_0x01ee
            X.9xQ r0 = A08(r0)
        L_0x0050:
            X.9rq r6 = A06(r2, r0, r10)
            X.00H r0 = r3.A06
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.9mi r0 = (X.C191509mi) r0
            r28 = 0
            r0.A00(r2, r5, r1, r6)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r60.BaL()
            if (r0 == 0) goto L_0x01ea
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Name r14 = r0.BVC()
        L_0x006b:
            if (r2 == 0) goto L_0x01ce
            X.1ci r4 = r2.A0L
        L_0x006f:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r60.BaL()
            if (r0 == 0) goto L_0x01b8
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings r11 = r0.BZ6()
            if (r11 == 0) goto L_0x01ba
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r0 = r11.BXs()
            if (r0 == 0) goto L_0x01ba
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue r18 = r0.BbA()
        L_0x0085:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r0 = r11.BXs()
            if (r0 == 0) goto L_0x01c0
            X.1IX r19 = r0.BNT()
        L_0x008f:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r0 = r11.BXs()
            if (r0 == 0) goto L_0x01c6
            java.lang.String r0 = r0.BRE()
            if (r0 == 0) goto L_0x01c6
            long r16 = java.lang.Long.parseLong(r0)
        L_0x009f:
            if (r2 == 0) goto L_0x01b4
            long r12 = r2.A0D
        L_0x00a3:
            if (r14 == 0) goto L_0x01ae
            java.lang.String r32 = r14.BaG()
            java.lang.String r0 = r14.getId()
            if (r0 == 0) goto L_0x01b0
            long r44 = java.lang.Long.parseLong(r0)
        L_0x00b3:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r60.BaL()
            if (r0 == 0) goto L_0x01aa
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Description r0 = r0.BQW()
            if (r0 == 0) goto L_0x01aa
            java.lang.String r33 = r0.BaG()
        L_0x00c3:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r60.BaL()
            if (r0 == 0) goto L_0x00d9
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Description r0 = r0.BQW()
            if (r0 == 0) goto L_0x00d9
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x00d9
            long r7 = java.lang.Long.parseLong(r0)
        L_0x00d9:
            java.lang.String r0 = r1.A02
            r21 = r0
            long r0 = r1.A01
            r50 = r0
            java.lang.String r0 = r6.A02
            r20 = r0
            long r14 = r6.A01
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r60.BaL()
            if (r0 == 0) goto L_0x01a2
            java.lang.String r0 = r0.BPf()
            if (r0 == 0) goto L_0x01a2
            long r52 = X.AnonymousClass8BW.A08(r0)
        L_0x00f7:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r60.BaL()
            if (r0 == 0) goto L_0x019e
            java.lang.String r36 = r0.BSE()
        L_0x0101:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r60.BaL()
            if (r0 == 0) goto L_0x010b
            java.lang.String r37 = r0.BTE()
        L_0x010b:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r6 = r60.BaL()
            r0 = -1
            long r54 = A00(r6, r3, r0)
            if (r2 == 0) goto L_0x019a
            X.9Ig r11 = r2.A02
        L_0x0119:
            X.9IR r24 = X.AnonymousClass9IR.PUBLIC
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r60.BaL()
            if (r0 == 0) goto L_0x0197
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState r0 = r0.BbN()
            if (r0 == 0) goto L_0x0197
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 != r0) goto L_0x0197
            X.9IW r26 = X.AnonymousClass9IW.VERIFIED
        L_0x0130:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r60.BaL()
            if (r0 == 0) goto L_0x0194
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource r0 = r0.BbO()
        L_0x013a:
            X.9IZ r23 = A05(r0)
            X.9Ia r25 = X.C179459Ia.NOT_ENFORCED
            if (r2 == 0) goto L_0x0191
            boolean r6 = r2.A0B
            int r1 = r2.A01
        L_0x0146:
            X.9Ih r22 = A04(r18)
            java.lang.Long r30 = java.lang.Long.valueOf(r16)
            java.util.ArrayList r38 = X.AnonymousClass000.A13()
            java.lang.Integer r29 = X.AnonymousClass00R.A00
            r41 = 1
            X.1Om r39 = X.C25511Om.A00
            X.9Ib r27 = X.C179469Ib.NOT_SET
            X.2Dk r0 = new X.2Dk
            r58 = r10
            r31 = r28
            r34 = r21
            r35 = r20
            r40 = r1
            r42 = r12
            r46 = r7
            r48 = r50
            r50 = r14
            r56 = r6
            r57 = r10
            r18 = r0
            r20 = r4
            r21 = r11
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44, r46, r48, r50, r52, r54, r56, r57, r58)
            r0.A0N(r2)
            r9.A0K(r0, r5)
            if (r2 == 0) goto L_0x0190
            X.00H r1 = r3.A07
            X.1i5 r2 = X.AnonymousClass8BR.A0M(r1)
            java.util.List r1 = X.C18070vi.A0M(r0)
            r2.A0A(r1)
        L_0x0190:
            return r0
        L_0x0191:
            r6 = 1
            r1 = 0
            goto L_0x0146
        L_0x0194:
            r0 = r28
            goto L_0x013a
        L_0x0197:
            X.9IW r26 = X.AnonymousClass9IW.NOT_VERIFIED
            goto L_0x0130
        L_0x019a:
            X.9Ig r11 = X.C179509Ig.GUEST
            goto L_0x0119
        L_0x019e:
            r36 = r37
            goto L_0x0101
        L_0x01a2:
            X.11P r0 = r3.A02
            long r52 = X.AnonymousClass11P.A01(r0)
            goto L_0x00f7
        L_0x01aa:
            r33 = r37
            goto L_0x00c3
        L_0x01ae:
            r32 = r37
        L_0x01b0:
            r44 = -1
            goto L_0x00b3
        L_0x01b4:
            r12 = -1
            goto L_0x00a3
        L_0x01b8:
            r11 = r37
        L_0x01ba:
            r18 = r37
            if (r11 == 0) goto L_0x01c0
            goto L_0x0085
        L_0x01c0:
            r19 = r37
            if (r11 == 0) goto L_0x01c6
            goto L_0x008f
        L_0x01c6:
            X.11P r0 = r3.A02
            long r16 = X.AnonymousClass11P.A01(r0)
            goto L_0x009f
        L_0x01ce:
            X.00H r0 = r3.A07
            r0.get()
            if (r14 == 0) goto L_0x01e7
            java.lang.String r0 = r14.BaG()
        L_0x01d9:
            X.1ci r4 = new X.1ci
            r4.<init>((X.AnonymousClass1BI) r5)
            r4.A0Y = r7
            r4.A0k = r0
            r0 = 4
            r4.A03 = r0
            goto L_0x006f
        L_0x01e7:
            r0 = r37
            goto L_0x01d9
        L_0x01ea:
            r14 = r37
            goto L_0x006b
        L_0x01ee:
            r0 = 0
            goto L_0x0050
        L_0x01f1:
            r0 = r37
            goto L_0x0037
        L_0x01f5:
            r2 = r37
            goto L_0x002d
        L_0x01f9:
            r2 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20131A8r.A0B(com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields):X.2Dk");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01fd, code lost:
        if (r0 != null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0203, code lost:
        if (r0 != null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0209, code lost:
        if (r0 == null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x020f, code lost:
        if (r6 != null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0215, code lost:
        if (r6 != null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (((X.C46162Dk) r3).A0C == false) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0174  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C46162Dk A0D(com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields r58, X.C29681ch r59, boolean r60) {
        /*
            r57 = this;
            r10 = 0
            r11 = r59
            X.C18070vi.A0d(r11, r10)
            r9 = 1
            r13 = r58
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r13.BaL()
            r1 = r57
            X.1CJ r8 = r1.A03
            X.1ci r2 = X.AnonymousClass1CJ.A00(r8, r11)
            X.1ci r7 = A01(r2, r1)
            boolean r2 = r7 instanceof X.C46162Dk
            r6 = 0
            if (r2 == 0) goto L_0x0031
            X.2Dk r7 = (X.C46162Dk) r7
            if (r7 == 0) goto L_0x0032
            long r2 = r7.A0D
            r14 = 0
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x0032
            r0 = r60
            X.2Dk r16 = A03(r7, r13, r11, r1, r0)
            return r16
        L_0x0031:
            r7 = r6
        L_0x0032:
            X.00H r2 = r1.A07
            X.1i5 r3 = X.AnonymousClass8BR.A0M(r2)
            if (r0 == 0) goto L_0x0227
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Name r2 = r0.BVC()
            if (r2 == 0) goto L_0x0227
            java.lang.String r2 = r2.BaG()
        L_0x0044:
            X.1D6 r2 = r3.A06(r11, r2)
            java.lang.Object r12 = r2.first
            X.1ci r12 = (X.C29691ci) r12
            java.lang.Object r2 = r2.second
            long r40 = X.C17880vN.A05(r2)
            X.1ci r3 = X.AnonymousClass1CJ.A00(r8, r11)
            boolean r2 = r3 instanceof X.C46162Dk
            if (r2 == 0) goto L_0x0062
            X.2Dk r3 = (X.C46162Dk) r3
            boolean r2 = r3.A0C
            r55 = 1
            if (r2 != 0) goto L_0x0064
        L_0x0062:
            r55 = 0
        L_0x0064:
            if (r0 == 0) goto L_0x0224
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Picture r2 = r0.BX7()
        L_0x006a:
            X.9xQ r2 = A07(r2, r10)
            r34 = r6
            r26 = r6
            X.9rq r5 = A06(r6, r2, r9)
            if (r0 == 0) goto L_0x0221
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Preview r2 = r0.BXR()
            if (r2 == 0) goto L_0x0221
            X.9xQ r2 = A08(r2)
        L_0x0082:
            X.9rq r4 = A06(r6, r2, r10)
            X.00H r2 = r1.A06
            java.lang.Object r2 = X.C18070vi.A0E(r2)
            X.9mi r2 = (X.C191509mi) r2
            r2.A00(r7, r11, r5, r4)
            r44 = -1
            if (r7 == 0) goto L_0x00a2
            long r2 = r7.A0D
            int r11 = (r2 > r44 ? 1 : (r2 == r44 ? 0 : -1))
            if (r11 != 0) goto L_0x00a2
            X.1BI r2 = r7.A08()
            r8.A0L(r2)
        L_0x00a2:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r2 = r13.BaL()
            if (r2 == 0) goto L_0x020d
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings r6 = r2.BZ6()
            if (r6 == 0) goto L_0x020d
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r2 = r6.BXs()
            if (r2 == 0) goto L_0x020d
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue r16 = r2.BbA()
        L_0x00b8:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r2 = r6.BXs()
            if (r2 == 0) goto L_0x0213
            X.1IX r17 = r2.BNT()
        L_0x00c2:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r2 = r6.BXs()
            if (r2 == 0) goto L_0x0219
            java.lang.String r2 = r2.BRE()
            if (r2 == 0) goto L_0x0219
            long r14 = java.lang.Long.parseLong(r2)
        L_0x00d2:
            if (r0 == 0) goto L_0x01fb
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Name r2 = r0.BVC()
            if (r2 == 0) goto L_0x01fb
            java.lang.String r30 = r2.BaG()
        L_0x00de:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Name r2 = r0.BVC()
            if (r2 == 0) goto L_0x0201
            java.lang.String r2 = r2.getId()
            if (r2 == 0) goto L_0x0201
            long r42 = java.lang.Long.parseLong(r2)
        L_0x00ee:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Description r2 = r0.BQW()
            if (r2 == 0) goto L_0x0207
            java.lang.String r31 = r2.BaG()
        L_0x00f8:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Description r2 = r0.BQW()
            if (r2 == 0) goto L_0x0108
            java.lang.String r2 = r2.getId()
            if (r2 == 0) goto L_0x0108
            long r44 = java.lang.Long.parseLong(r2)
        L_0x0108:
            java.lang.String r11 = r5.A02
            long r6 = r5.A01
            java.lang.String r8 = r4.A02
            long r4 = r4.A01
            X.9IR r22 = X.AnonymousClass9IR.PUBLIC
            if (r0 == 0) goto L_0x01ef
            java.lang.String r2 = r0.BPf()
            if (r2 == 0) goto L_0x01ef
            long r50 = X.AnonymousClass8BW.A08(r2)
        L_0x011e:
            java.lang.String r34 = r0.BSE()
            java.lang.String r35 = r0.BTE()
        L_0x0126:
            r2 = -1
            long r52 = A00(r0, r1, r2)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ViewerMetadata r1 = r13.Bbe()
            if (r1 == 0) goto L_0x01eb
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole r1 = r1.BYO()
        L_0x0136:
            X.9Ig r19 = A02(r1)
            if (r0 == 0) goto L_0x01e3
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState r1 = r0.BbN()
            if (r1 == 0) goto L_0x01e3
            int r1 = r1.ordinal()
            if (r1 != r9) goto L_0x01e3
            X.9IW r24 = X.AnonymousClass9IW.VERIFIED
        L_0x014a:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource r1 = r0.BbO()
        L_0x014e:
            X.9IZ r21 = A05(r1)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ViewerMetadata r1 = r13.Bbe()
            if (r1 == 0) goto L_0x01df
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting r2 = r1.BV8()
        L_0x015c:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting r1 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting.ON
            boolean r54 = X.AnonymousClass000.A1Z(r2, r1)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r1 = r13.BZb()
            if (r1 == 0) goto L_0x01dc
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r1 = r1.Baq()
            if (r1 == 0) goto L_0x01dc
            int r1 = r1.ordinal()
            if (r1 == r9) goto L_0x01d9
            r2 = 2
            if (r1 == r2) goto L_0x01d6
            r2 = 3
            if (r1 != r2) goto L_0x01dc
            X.9Ia r23 = X.C179459Ia.GEOSUSPENDED
        L_0x017c:
            X.9Ih r20 = A04(r16)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ViewerMetadata r1 = r13.Bbe()
            if (r1 == 0) goto L_0x01d3
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterWamoSubStatus r1 = r1.Bbl()
            if (r1 == 0) goto L_0x01d3
            int r1 = r1.ordinal()
            if (r1 == r9) goto L_0x01d0
            r2 = 2
            if (r1 != r2) goto L_0x01d3
            X.9Ib r25 = X.C179469Ib.INACTIVE
        L_0x0197:
            if (r0 == 0) goto L_0x01cd
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl$ThreadMetadata$WamoSub r0 = r0.Bbk()
            if (r0 == 0) goto L_0x01cd
            java.lang.String r1 = "plan_id"
            java.lang.String r0 = r0.A0F(r1)
            if (r0 == 0) goto L_0x01cd
            java.lang.Long r29 = X.C108965cb.A0m(r0)
        L_0x01ab:
            java.lang.Long r28 = java.lang.Long.valueOf(r14)
            java.util.ArrayList r36 = X.AnonymousClass000.A13()
            java.lang.Integer r27 = X.AnonymousClass00R.A00
            X.1Om r37 = X.C25511Om.A00
            X.2Dk r16 = new X.2Dk
            r56 = r10
            r32 = r11
            r33 = r8
            r38 = r10
            r39 = r9
            r46 = r6
            r48 = r4
            r18 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42, r44, r46, r48, r50, r52, r54, r55, r56)
            return r16
        L_0x01cd:
            r29 = r26
            goto L_0x01ab
        L_0x01d0:
            X.9Ib r25 = X.C179469Ib.ACTIVE
            goto L_0x0197
        L_0x01d3:
            X.9Ib r25 = X.C179469Ib.NOT_SET
            goto L_0x0197
        L_0x01d6:
            X.9Ia r23 = X.C179459Ia.SUSPENDED
            goto L_0x017c
        L_0x01d9:
            X.9Ia r23 = X.C179459Ia.NOT_ENFORCED
            goto L_0x017c
        L_0x01dc:
            X.9Ia r23 = X.C179459Ia.NOT_ENFORCED
            goto L_0x017c
        L_0x01df:
            r2 = r26
            goto L_0x015c
        L_0x01e3:
            X.9IW r24 = X.AnonymousClass9IW.NOT_VERIFIED
            if (r0 != 0) goto L_0x014a
            r1 = r26
            goto L_0x014e
        L_0x01eb:
            r1 = r26
            goto L_0x0136
        L_0x01ef:
            X.11P r2 = r1.A02
            long r50 = X.AnonymousClass11P.A01(r2)
            if (r0 != 0) goto L_0x011e
            r35 = r34
            goto L_0x0126
        L_0x01fb:
            r30 = r34
            if (r0 == 0) goto L_0x0201
            goto L_0x00de
        L_0x0201:
            r42 = -1
            if (r0 == 0) goto L_0x0207
            goto L_0x00ee
        L_0x0207:
            r31 = r34
            if (r0 == 0) goto L_0x0108
            goto L_0x00f8
        L_0x020d:
            r16 = r34
            if (r6 == 0) goto L_0x0213
            goto L_0x00b8
        L_0x0213:
            r17 = r34
            if (r6 == 0) goto L_0x0219
            goto L_0x00c2
        L_0x0219:
            X.11P r2 = r1.A02
            long r14 = X.AnonymousClass11P.A01(r2)
            goto L_0x00d2
        L_0x0221:
            r2 = 0
            goto L_0x0082
        L_0x0224:
            r2 = r6
            goto L_0x006a
        L_0x0227:
            r2 = r6
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20131A8r.A0D(com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields, X.1ch, boolean):X.2Dk");
    }

    public final NewsletterMetadataQueryImpl$Builder A0E(C46162Dk r5, XWA2NewsletterInput xWA2NewsletterInput, C198699yl r7) {
        boolean z;
        C18070vi.A0d(r7, 1);
        boolean z2 = false;
        if (r5 != null) {
            z = AnonymousClass000.A1Z(r5.A02, C179509Ig.GUEST);
        } else {
            z = false;
        }
        if (r7.A0B && !z) {
            z2 = true;
        }
        NewsletterMetadataQueryImpl$Builder A0F = A0F(xWA2NewsletterInput, r7);
        A0F.A00.A06("fetch_viewer_metadata", Boolean.valueOf(z2));
        return A0F;
    }

    public final NewsletterMetadataQueryImpl$Builder A0F(XWA2NewsletterInput xWA2NewsletterInput, C198699yl r7) {
        C18070vi.A0d(r7, 0);
        NewsletterMetadataQueryImpl$Builder newsletterMetadataQueryImpl$Builder = new NewsletterMetadataQueryImpl$Builder();
        A7K a7k = newsletterMetadataQueryImpl$Builder.A00;
        a7k.A04(xWA2NewsletterInput, "input");
        newsletterMetadataQueryImpl$Builder.A01 = true;
        a7k.A06("fetch_image", Boolean.valueOf(r7.A00));
        a7k.A06("fetch_preview", Boolean.valueOf(r7.A01));
        a7k.A06("fetch_viewer_metadata", Boolean.valueOf(r7.A0B));
        a7k.A06("fetch_state", Boolean.valueOf(r7.A08));
        a7k.A06("fetch_name", Boolean.valueOf(r7.A06));
        a7k.A06("fetch_creation_time", Boolean.valueOf(r7.A02));
        a7k.A06("fetch_description", Boolean.valueOf(r7.A03));
        a7k.A06("fetch_invite", Boolean.valueOf(r7.A05));
        a7k.A06("fetch_handle", Boolean.valueOf(r7.A04));
        a7k.A06("fetch_subscribers_count", Boolean.valueOf(r7.A09));
        a7k.A06("fetch_verification", Boolean.valueOf(r7.A0A));
        a7k.A06("fetch_settings", Boolean.valueOf(r7.A07));
        this.A05.get();
        a7k.A06("fetch_wamo_sub", false);
        return newsletterMetadataQueryImpl$Builder;
    }

    public final void A0H(AnonymousClass1BI r4) {
        ((AnonymousClass1Q1) this.A0D.get()).A03(r4, false);
        this.A0A.A0J(new C21458AkP(this, r4, 26));
    }

    public static final long A00(NewsletterMetadataFields.ThreadMetadata threadMetadata, C20131A8r a8r, long j) {
        String BZp;
        if (C18020vd.A05(C18040vf.A02, a8r.A0C, 12191)) {
            if (threadMetadata != null) {
                BZp = threadMetadata.BRt();
            }
            return j;
        }
        if (threadMetadata != null) {
            BZp = threadMetadata.BZp();
        }
        return j;
        if (BZp != null) {
            long parseLong = Long.parseLong(BZp);
            if (Long.valueOf(parseLong) != null) {
                return parseLong;
            }
        }
        return j;
    }

    public static final C29691ci A01(C29691ci r4, C20131A8r a8r) {
        if (r4 == null) {
            return null;
        }
        if (!(r4 instanceof C46162Dk)) {
            AnonymousClass190 r3 = a8r.A09;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Expected type NewsletterInfo but found type ");
            AnonymousClass8BW.A1M(r4, A10);
            r3.A0G("NewsletterGraphqlUtils/ChatsCache entry is not NewsletterInfo", A10.toString(), true);
        }
        return r4;
    }

    public static final C179509Ig A02(GraphQLXWA2NewsletterRole graphQLXWA2NewsletterRole) {
        if (graphQLXWA2NewsletterRole != null) {
            int ordinal = graphQLXWA2NewsletterRole.ordinal();
            if (ordinal == 3) {
                return C179509Ig.SUBSCRIBED;
            }
            if (ordinal == 2) {
                return C179509Ig.ADMIN;
            }
            if (ordinal == 1) {
                return C179509Ig.OWNER;
            }
        }
        return C179509Ig.GUEST;
    }

    public static final C179519Ih A04(GraphQLXWA2NewsletterReactionCodesSettingValue graphQLXWA2NewsletterReactionCodesSettingValue) {
        if (graphQLXWA2NewsletterReactionCodesSettingValue != null) {
            int ordinal = graphQLXWA2NewsletterReactionCodesSettingValue.ordinal();
            if (ordinal == 1) {
                return C179519Ih.ALL;
            }
            if (ordinal != 2) {
                if (ordinal == 4) {
                    return C179519Ih.NONE;
                }
                if (ordinal == 3) {
                    return C179519Ih.BLOCKLIST;
                }
            }
        }
        return C179519Ih.DEFAULT;
    }

    public static final AnonymousClass9IZ A05(GraphQLXWA2NewsletterVerifySource graphQLXWA2NewsletterVerifySource) {
        int ordinal;
        if (!(graphQLXWA2NewsletterVerifySource == null || (ordinal = graphQLXWA2NewsletterVerifySource.ordinal()) == 0)) {
            if (ordinal == 1) {
                return AnonymousClass9IZ.META_VERIFIED_SUBSCRIPTION;
            }
            if (ordinal == 2) {
                return AnonymousClass9IZ.LEGACY_MANUAL_REVIEW;
            }
        }
        return AnonymousClass9IZ.UNKNOWN_VERIFICATION_SOURCE;
    }

    public static final C197879xQ A07(NewsletterMetadataFields.ThreadMetadata.Picture picture, boolean z) {
        if (picture != null) {
            String BQg = picture.BQg();
            if (!(BQg == null || BQg.length() == 0)) {
                String id = picture.getId();
                picture.Bat();
                picture.Bb6();
                return new C197879xQ(id, picture.BQg());
            }
        } else if (!z) {
            return null;
        }
        return new C197879xQ((String) null, (String) null);
    }

    public static final boolean A09(NewsletterMutationResponseFragmentImpl newsletterMutationResponseFragmentImpl) {
        Enum enumR;
        C20125A8k A092;
        if (newsletterMutationResponseFragmentImpl == null || (A092 = newsletterMutationResponseFragmentImpl.A09(NewsletterMutationResponseFragmentImpl.NewsletterState.class, "newsletter_state")) == null) {
            enumR = null;
        } else {
            enumR = A092.A0D(GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }
        return AnonymousClass000.A1Z(enumR, GraphQLXWA2NewsletterStateType.ACTIVE);
    }

    public final C46162Dk A0A(NewsletterMetadataFields newsletterMetadataFields) {
        C46162Dk r0;
        C197879xQ r3;
        NewsletterMetadataFields.ThreadMetadata.Name name;
        C29691ci r4;
        long j;
        String str;
        long A012;
        String str2;
        C179509Ig r9;
        AnonymousClass9IW r23;
        boolean z;
        GraphQLXWA2NewsletterVerifyState BbN;
        String BPf;
        NewsletterMetadataFields.ThreadMetadata.Preview BXR;
        AnonymousClass25J r02 = C29681ch.A03;
        C29681ch A002 = AnonymousClass25J.A00(C20125A8k.A08((C20125A8k) newsletterMetadataFields));
        AnonymousClass1CJ r10 = this.A03;
        C29691ci A013 = A01(r10.A0A(A002), this);
        if (A013 instanceof C46162Dk) {
            r0 = (C46162Dk) A013;
        } else {
            r0 = null;
        }
        long j2 = -1;
        GraphQLXWA2NewsletterVerifySource graphQLXWA2NewsletterVerifySource = null;
        if (r0 == null || r0.A0D == -1) {
            r0 = null;
        }
        NewsletterMetadataFields.ThreadMetadata BaL = newsletterMetadataFields.BaL();
        if (BaL == null || (BXR = BaL.BXR()) == null) {
            r3 = null;
        } else {
            r3 = A08(BXR);
        }
        String str3 = null;
        C194509rq A062 = A06((C46162Dk) null, r3, true);
        ((C191509mi) C18070vi.A0E(this.A06)).A00(r0, A002, A062, A062);
        NewsletterMetadataFields.ThreadMetadata BaL2 = newsletterMetadataFields.BaL();
        if (BaL2 != null) {
            name = BaL2.BVC();
        } else {
            name = null;
        }
        if (r0 != null) {
            r4 = r0.A0L;
            j = r0.A0D;
        } else {
            this.A07.get();
            if (name != null) {
                str3 = name.BaG();
            }
            r4 = new C29691ci((AnonymousClass1BI) A002);
            r4.A0Y = -1;
            r4.A0k = str3;
            r4.A03 = 4;
            j = -1;
        }
        if (name != null) {
            str = name.BaG();
            String id = name.getId();
            if (id != null) {
                j2 = Long.parseLong(id);
            }
        } else {
            str = null;
        }
        String str4 = A062.A02;
        long j3 = A062.A01;
        NewsletterMetadataFields.ThreadMetadata BaL3 = newsletterMetadataFields.BaL();
        if (BaL3 == null || (BPf = BaL3.BPf()) == null) {
            A012 = AnonymousClass11P.A01(this.A02);
        } else {
            A012 = AnonymousClass8BW.A08(BPf);
        }
        NewsletterMetadataFields.ThreadMetadata BaL4 = newsletterMetadataFields.BaL();
        if (BaL4 != null) {
            str2 = BaL4.BTE();
        } else {
            str2 = null;
        }
        long A003 = A00(newsletterMetadataFields.BaL(), this, -1);
        if (r0 != null) {
            r9 = r0.A02;
        } else {
            r9 = C179509Ig.GUEST;
        }
        AnonymousClass9IR r21 = AnonymousClass9IR.PUBLIC;
        NewsletterMetadataFields.ThreadMetadata BaL5 = newsletterMetadataFields.BaL();
        if (BaL5 == null || (BbN = BaL5.BbN()) == null || BbN.ordinal() != 1) {
            r23 = AnonymousClass9IW.NOT_VERIFIED;
        } else {
            r23 = AnonymousClass9IW.VERIFIED;
        }
        NewsletterMetadataFields.ThreadMetadata BaL6 = newsletterMetadataFields.BaL();
        if (BaL6 != null) {
            graphQLXWA2NewsletterVerifySource = BaL6.BbO();
        }
        AnonymousClass9IZ A052 = A05(graphQLXWA2NewsletterVerifySource);
        C179459Ia r22 = C179459Ia.NOT_ENFORCED;
        if (r0 != null) {
            z = r0.A0B;
        } else {
            z = true;
        }
        C29691ci r17 = r4;
        C179509Ig r18 = r9;
        C46162Dk r15 = new C46162Dk((AnonymousClass1IX) null, r17, r18, C179519Ih.DEFAULT, A052, r21, r22, r23, C179469Ib.NOT_SET, (AnonymousClass206) null, AnonymousClass00R.A00, (Long) null, (Long) null, str, (String) null, (String) null, str4, (String) null, str2, AnonymousClass000.A13(), C25511Om.A00, 0, 1, j, j2, 0, 0, j3, A012, A003, z, false, false);
        r15.A0N(r0);
        r10.A0K(r15, A002);
        if (r0 != null) {
            AnonymousClass8BR.A0M(this.A07).A0A(C18070vi.A0M(r15));
        }
        return r15;
    }

    public final C46162Dk A0C(NewsletterMetadataFields newsletterMetadataFields, C29681ch r5) {
        C46162Dk r2;
        C29691ci A012 = A01(this.A03.A0A(r5), this);
        if (!(A012 instanceof C46162Dk) || (r2 = (C46162Dk) A012) == null) {
            return null;
        }
        return A03(r2, newsletterMetadataFields, r5, this, false);
    }

    public final UserJid A0G(UserJid userJid) {
        PhoneUserJid phoneUserJid;
        AnonymousClass1E1 A0A2;
        if (!(userJid instanceof PhoneUserJid) || (phoneUserJid = (PhoneUserJid) userJid) == null || (A0A2 = this.A0B.A0A(phoneUserJid)) == null) {
            return userJid;
        }
        return A0A2;
    }

    public C20131A8r(AnonymousClass190 r2, AnonymousClass1KB r3, AnonymousClass1M9 r4, C24671Lf r5, AnonymousClass11P r6, AnonymousClass1CJ r7, C24751Ln r8, C18030ve r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        C18070vi.A0w(r6, r9, r3, r2, r7);
        C18070vi.A0x(r10, r4, r11, r5, r12);
        C18070vi.A0r(r13, r8, r14);
        C18070vi.A0d(r15, 14);
        this.A02 = r6;
        this.A0C = r9;
        this.A0A = r3;
        this.A09 = r2;
        this.A03 = r7;
        this.A0D = r10;
        this.A00 = r4;
        this.A07 = r11;
        this.A01 = r5;
        this.A05 = r12;
        this.A06 = r13;
        this.A0B = r8;
        this.A04 = r14;
        this.A08 = r15;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0184, code lost:
        if (r8 == null) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01a0, code lost:
        if (r22 != null) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01a6, code lost:
        if (r8 != null) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01a8, code lost:
        r0 = r8.BQW();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01ac, code lost:
        if (r0 == null) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01ae, code lost:
        r0 = r0.getId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01b2, code lost:
        if (r0 == null) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01b4, code lost:
        r20 = java.lang.Long.parseLong(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01b8, code lost:
        r63 = A00(r8, r9, r6.A0G);
        r33 = X.AnonymousClass9IR.PUBLIC;
        r0 = r65.Bbe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01c4, code lost:
        if (r0 == null) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01c6, code lost:
        r0 = r0.BYO();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01ca, code lost:
        if (r0 == null) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01cc, code lost:
        r19 = A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01d0, code lost:
        if (r8 == null) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01d2, code lost:
        r0 = r8.BbN();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01d6, code lost:
        if (r0 == null) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01dc, code lost:
        if (r0.ordinal() != 1) goto L_0x02d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01de, code lost:
        r18 = X.AnonymousClass9IW.VERIFIED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01e0, code lost:
        r0 = r8.BbO();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01e4, code lost:
        if (r0 == null) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01e6, code lost:
        r17 = A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01ea, code lost:
        r0 = r65.Bbe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01ee, code lost:
        if (r0 == null) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01f0, code lost:
        r1 = r0.BV8();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01f4, code lost:
        if (r1 == null) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01f8, code lost:
        if (r1 == com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting.A01) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01fa, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01fb, code lost:
        if (r8 == null) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01fd, code lost:
        r14 = r8.BTE();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0201, code lost:
        if (r14 != null) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0203, code lost:
        r14 = r6.A0S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0205, code lost:
        if (r8 == null) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0207, code lost:
        r9 = r8.BSE();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x020b, code lost:
        if (r9 != null) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x020d, code lost:
        r9 = r6.A0R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x020f, code lost:
        r44 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0213, code lost:
        if (r11 != null) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0215, code lost:
        r11 = X.C179519Ih.DEFAULT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0217, code lost:
        r0 = r65.Bbe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x021b, code lost:
        if (r0 == null) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x021d, code lost:
        r0 = r0.Bbl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0221, code lost:
        if (r0 == null) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0223, code lost:
        r1 = r0.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0228, code lost:
        if (r1 == 1) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x022b, code lost:
        if (r1 == 2) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x022d, code lost:
        r8 = X.C179469Ib.NOT_SET;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x022f, code lost:
        r0 = r65.BaL();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0233, code lost:
        if (r0 == null) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0239, code lost:
        if (r0.Bbk() == null) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x023b, code lost:
        r0 = r65.BaL();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x023f, code lost:
        if (r0 == null) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0241, code lost:
        r1 = r0.Bbk();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0245, code lost:
        if (r1 == null) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0247, code lost:
        r0 = r1.A0F("plan_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x024d, code lost:
        if (r0 == null) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x024f, code lost:
        r12 = X.C108965cb.A0m(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0253, code lost:
        r39 = java.lang.Long.valueOf(r27);
        r53 = r6.A0D;
        r34 = r6.A0E;
        r32 = r6.A0W;
        r31 = r6.A0C;
        r30 = r6.A0O;
        r29 = r6.A00;
        r10 = r6.A09;
        r28 = r6.A07;
        X.C18070vi.A0d(r19, 14);
        X.C18070vi.A0d(r17, 17);
        X.C18070vi.A0d(r10, 29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02c5, code lost:
        return new X.C46162Dk(r26, r6, r19, r11, r17, r33, r13, r18, r8, r28, r30, r39, r12, r25, r22, r43, r44, r9, r14, r32, r10, r7, r29, r53, r23, r20, r2, r15, r34, r63, r5, r31, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02c6, code lost:
        r12 = r6.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02c9, code lost:
        r8 = X.C179469Ib.INACTIVE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02cd, code lost:
        r8 = X.C179469Ib.ACTIVE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02d1, code lost:
        r8 = r6.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02d5, code lost:
        r5 = r6.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02d9, code lost:
        r18 = X.AnonymousClass9IW.NOT_VERIFIED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02dd, code lost:
        r18 = r6.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02e1, code lost:
        if (r8 == null) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02e5, code lost:
        r17 = r6.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02eb, code lost:
        r19 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02f1, code lost:
        r20 = r6.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x02fb, code lost:
        if (r8 != null) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c7, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C46162Dk A03(X.C46162Dk r64, com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields r65, X.C29681ch r66, X.C20131A8r r67, boolean r68) {
        /*
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r65.BaL()
            r12 = 0
            if (r0 == 0) goto L_0x006a
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Picture r0 = r0.BX7()
        L_0x000b:
            r2 = r68
            X.9xQ r0 = A07(r0, r2)
            r5 = 1
            r6 = r64
            X.9rq r7 = A06(r6, r0, r5)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r65.BaL()
            if (r0 == 0) goto L_0x0060
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Preview r1 = r0.BXR()
            if (r1 == 0) goto L_0x0060
            java.lang.String r0 = r1.BQg()
            if (r0 == 0) goto L_0x0064
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0064
            X.9xQ r0 = A08(r1)
        L_0x0034:
            r4 = 0
            X.9rq r10 = A06(r6, r0, r4)
            r9 = r67
            X.00H r0 = r9.A06
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.9mi r0 = (X.C191509mi) r0
            r11 = r12
            r1 = r66
            r0.A00(r6, r1, r7, r10)
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x00ce
            r6.A0A = r4
            X.00H r0 = r9.A08
            java.lang.Object r0 = r0.get()
            X.2lA r0 = (X.C58732lA) r0
            X.00H r0 = r0.A03
            java.lang.Object r13 = r0.get()
            X.1hF r13 = (X.C32471hF) r13
            goto L_0x006c
        L_0x0060:
            if (r68 != 0) goto L_0x0064
            r0 = 0
            goto L_0x0034
        L_0x0064:
            X.8yB r0 = new X.8yB
            r0.<init>(r12, r12)
            goto L_0x0034
        L_0x006a:
            r0 = r12
            goto L_0x000b
        L_0x006c:
            X.1Cd r0 = r13.A03     // Catch:{ SQLiteException -> 0x00c8 }
            X.1au r2 = r0.A05()     // Catch:{ SQLiteException -> 0x00c8 }
            java.lang.String[] r8 = X.C17880vN.A1Z()     // Catch:{ all -> 0x00c1 }
            X.1LW r0 = r13.A00     // Catch:{ all -> 0x00c1 }
            X.AnonymousClass1LW.A03(r0, r1, r8, r4)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "133"
            r8[r5] = r0     // Catch:{ all -> 0x00c1 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00c1 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = "SELECT m._id FROM message AS m LEFT JOIN message_system AS ms  ON m._id = ms.message_row_id  WHERE chat_row_id = ?  AND action_type = ?"
            java.lang.String r0 = "SELECT_DELETE_SYSTEM_MESSAGE"
            android.database.Cursor r3 = r3.A0A(r1, r0, r8)     // Catch:{ all -> 0x00c1 }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x00b3
            java.lang.String r0 = "_id"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x00ba }
            if (r0 < 0) goto L_0x00b3
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x00ba }
            X.00H r8 = r13.A05     // Catch:{ all -> 0x00ba }
            X.206 r8 = X.AnonymousClass1W2.A02(r8, r0)     // Catch:{ all -> 0x00ba }
            boolean r0 = r8 instanceof X.C436420i     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x00b3
            X.121 r1 = r13.A02     // Catch:{ all -> 0x00ba }
            java.util.List r0 = X.C18070vi.A0M(r8)     // Catch:{ all -> 0x00ba }
            X.122 r1 = (X.AnonymousClass122) r1     // Catch:{ all -> 0x00ba }
            r1.A0V(r0, r4)     // Catch:{ all -> 0x00ba }
        L_0x00b3:
            r3.close()     // Catch:{ all -> 0x00c1 }
            r2.close()     // Catch:{ SQLiteException -> 0x00c8 }
            goto L_0x00ce
        L_0x00ba:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x00c1 }
            throw r0     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ SQLiteException -> 0x00c8 }
            throw r0     // Catch:{ SQLiteException -> 0x00c8 }
        L_0x00c8:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageStore/deleteNewsletterDeleteSystemMessage"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00ce:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r65.BaL()
            if (r0 == 0) goto L_0x0339
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings r1 = r0.BZ6()
            if (r1 == 0) goto L_0x033a
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r0 = r1.BXs()
            if (r0 == 0) goto L_0x0336
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue r0 = r0.BbA()
        L_0x00e4:
            X.9Ih r11 = A04(r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r0 = r1.BXs()
            if (r0 == 0) goto L_0x033a
            X.1IX r26 = r0.BNT()
        L_0x00f2:
            if (r11 == 0) goto L_0x0332
            if (r1 == 0) goto L_0x032a
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r0 = r1.BXs()
            if (r0 == 0) goto L_0x032a
            java.lang.String r0 = r0.BRE()
            if (r0 == 0) goto L_0x032a
            long r27 = java.lang.Long.parseLong(r0)
        L_0x0106:
            java.lang.Long r0 = r6.A0P
            if (r0 == 0) goto L_0x011a
            long r1 = r0.longValue()
            int r0 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r0 <= 0) goto L_0x011a
            X.9Ih r11 = r6.A03
            X.1IX r0 = r6.A0K
            r26 = r0
            r27 = r1
        L_0x011a:
            long r15 = r10.A01
            long r2 = r7.A01
            int r0 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0326
            java.lang.String r0 = r7.A02
            r43 = r0
        L_0x0126:
            int r0 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x012c
            r2 = -1
        L_0x012c:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r0 = r65.BZb()
            if (r0 == 0) goto L_0x0322
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = r0.Baq()
            if (r0 == 0) goto L_0x0322
            int r1 = r0.ordinal()
            if (r1 == r5) goto L_0x031e
            r0 = 2
            if (r1 == r0) goto L_0x031a
            r0 = 3
            if (r1 != r0) goto L_0x0322
            X.9Ia r13 = X.C179459Ia.GEOSUSPENDED
        L_0x0146:
            int r1 = r13.ordinal()
            if (r1 == r5) goto L_0x030a
            r0 = 2
            if (r1 == r0) goto L_0x02ff
            if (r1 != r4) goto L_0x033e
            X.00H r0 = r9.A04
            java.lang.Object r8 = r0.get()
            X.4Rq r8 = (X.C86444Rq) r8
            int r1 = r6.A01
            r0 = 3
            int r0 = r5 << r0
            r7 = r0 ^ -1
            r7 = r7 & r1
            X.00H r0 = r8.A01
            X.1i5 r1 = X.AnonymousClass8BR.A0M(r0)
            X.1ch r0 = r6.A0M()
            r1.A08(r0, r7)
        L_0x016e:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r8 = r65.BaL()
            if (r8 == 0) goto L_0x0180
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Name r0 = r8.BVC()
            if (r0 == 0) goto L_0x0180
            java.lang.String r25 = r0.BaG()
            if (r25 != 0) goto L_0x0186
        L_0x0180:
            java.lang.String r0 = r6.A0T
            r25 = r0
            if (r8 == 0) goto L_0x02f7
        L_0x0186:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Name r0 = r8.BVC()
            if (r0 == 0) goto L_0x02f7
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x02f7
            long r23 = java.lang.Long.parseLong(r0)
        L_0x0196:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Description r0 = r8.BQW()
            if (r0 == 0) goto L_0x01a2
            java.lang.String r22 = r0.BaG()
            if (r22 != 0) goto L_0x01a8
        L_0x01a2:
            java.lang.String r0 = r6.A0Q
            r22 = r0
            if (r8 == 0) goto L_0x02f1
        L_0x01a8:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Description r0 = r8.BQW()
            if (r0 == 0) goto L_0x02f1
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x02f1
            long r20 = java.lang.Long.parseLong(r0)
        L_0x01b8:
            long r0 = r6.A0G
            long r63 = A00(r8, r9, r0)
            X.9IR r33 = X.AnonymousClass9IR.PUBLIC
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ViewerMetadata r0 = r65.Bbe()
            if (r0 == 0) goto L_0x02eb
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole r0 = r0.BYO()
            if (r0 == 0) goto L_0x02eb
            X.9Ig r19 = A02(r0)
        L_0x01d0:
            if (r8 == 0) goto L_0x02dd
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState r0 = r8.BbN()
            if (r0 == 0) goto L_0x02dd
            int r0 = r0.ordinal()
            if (r0 != r5) goto L_0x02d9
            X.9IW r18 = X.AnonymousClass9IW.VERIFIED
        L_0x01e0:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource r0 = r8.BbO()
            if (r0 == 0) goto L_0x02e5
            X.9IZ r17 = A05(r0)
        L_0x01ea:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ViewerMetadata r0 = r65.Bbe()
            if (r0 == 0) goto L_0x02d5
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting r1 = r0.BV8()
            if (r1 == 0) goto L_0x02d5
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting.ON
            if (r1 == r0) goto L_0x01fb
            r5 = 0
        L_0x01fb:
            if (r8 == 0) goto L_0x0203
            java.lang.String r14 = r8.BTE()
            if (r14 != 0) goto L_0x0207
        L_0x0203:
            java.lang.String r14 = r6.A0S
            if (r8 == 0) goto L_0x020d
        L_0x0207:
            java.lang.String r9 = r8.BSE()
            if (r9 != 0) goto L_0x020f
        L_0x020d:
            java.lang.String r9 = r6.A0R
        L_0x020f:
            java.lang.String r0 = r10.A02
            r44 = r0
            if (r11 != 0) goto L_0x0217
            X.9Ih r11 = X.C179519Ih.DEFAULT
        L_0x0217:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ViewerMetadata r0 = r65.Bbe()
            if (r0 == 0) goto L_0x02d1
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterWamoSubStatus r0 = r0.Bbl()
            if (r0 == 0) goto L_0x02d1
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x02cd
            r0 = 2
            if (r1 == r0) goto L_0x02c9
            X.9Ib r8 = X.C179469Ib.NOT_SET
        L_0x022f:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r65.BaL()
            if (r0 == 0) goto L_0x02c6
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl$ThreadMetadata$WamoSub r0 = r0.Bbk()
            if (r0 == 0) goto L_0x02c6
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r65.BaL()
            if (r0 == 0) goto L_0x0253
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl$ThreadMetadata$WamoSub r1 = r0.Bbk()
            if (r1 == 0) goto L_0x0253
            java.lang.String r0 = "plan_id"
            java.lang.String r0 = r1.A0F(r0)
            if (r0 == 0) goto L_0x0253
            java.lang.Long r12 = X.C108965cb.A0m(r0)
        L_0x0253:
            java.lang.Long r39 = java.lang.Long.valueOf(r27)
            long r0 = r6.A0D
            r53 = r0
            long r0 = r6.A0E
            r34 = r0
            java.util.List r0 = r6.A0W
            r32 = r0
            boolean r0 = r6.A0C
            r31 = r0
            java.lang.Integer r0 = r6.A0O
            r30 = r0
            int r0 = r6.A00
            r29 = r0
            java.util.Set r10 = r6.A09
            X.206 r0 = r6.A07
            r28 = r0
            r1 = 14
            r0 = r19
            X.C18070vi.A0d(r0, r1)
            r1 = 17
            r0 = r17
            X.C18070vi.A0d(r0, r1)
            r0 = 29
            X.C18070vi.A0d(r10, r0)
            X.2Dk r27 = new X.2Dk
            r36 = r8
            r37 = r28
            r38 = r30
            r40 = r12
            r41 = r25
            r42 = r22
            r45 = r9
            r46 = r14
            r47 = r32
            r48 = r10
            r49 = r7
            r50 = r29
            r51 = r53
            r53 = r23
            r55 = r20
            r57 = r2
            r59 = r15
            r61 = r34
            r65 = r5
            r66 = r31
            r67 = r4
            r28 = r26
            r29 = r6
            r30 = r19
            r31 = r11
            r32 = r17
            r34 = r13
            r35 = r18
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r53, r55, r57, r59, r61, r63, r65, r66, r67)
            return r27
        L_0x02c6:
            java.lang.Long r12 = r6.A08
            goto L_0x0253
        L_0x02c9:
            X.9Ib r8 = X.C179469Ib.INACTIVE
            goto L_0x022f
        L_0x02cd:
            X.9Ib r8 = X.C179469Ib.ACTIVE
            goto L_0x022f
        L_0x02d1:
            X.9Ib r8 = r6.A06
            goto L_0x022f
        L_0x02d5:
            boolean r5 = r6.A0B
            goto L_0x01fb
        L_0x02d9:
            X.9IW r18 = X.AnonymousClass9IW.NOT_VERIFIED
            goto L_0x01e0
        L_0x02dd:
            X.9IW r0 = r6.A05
            r18 = r0
            if (r8 == 0) goto L_0x02e5
            goto L_0x01e0
        L_0x02e5:
            X.9IZ r0 = r6.A0M
            r17 = r0
            goto L_0x01ea
        L_0x02eb:
            X.9Ig r0 = r6.A02
            r19 = r0
            goto L_0x01d0
        L_0x02f1:
            long r0 = r6.A0F
            r20 = r0
            goto L_0x01b8
        L_0x02f7:
            long r0 = r6.A0H
            r23 = r0
            if (r8 == 0) goto L_0x01a2
            goto L_0x0196
        L_0x02ff:
            X.00H r0 = r9.A04
            java.lang.Object r1 = r0.get()
            X.4Rq r1 = (X.C86444Rq) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x0314
        L_0x030a:
            X.00H r0 = r9.A04
            java.lang.Object r1 = r0.get()
            X.4Rq r1 = (X.C86444Rq) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
        L_0x0314:
            int r7 = r1.A00(r6, r0)
            goto L_0x016e
        L_0x031a:
            X.9Ia r13 = X.C179459Ia.SUSPENDED
            goto L_0x0146
        L_0x031e:
            X.9Ia r13 = X.C179459Ia.NOT_ENFORCED
            goto L_0x0146
        L_0x0322:
            X.9Ia r13 = r6.A04
            goto L_0x0146
        L_0x0326:
            r43 = r12
            goto L_0x0126
        L_0x032a:
            X.11P r0 = r9.A02
            long r27 = X.AnonymousClass11P.A01(r0)
            goto L_0x0106
        L_0x0332:
            r27 = 1
            goto L_0x0106
        L_0x0336:
            r0 = r12
            goto L_0x00e4
        L_0x0339:
            r1 = r12
        L_0x033a:
            r26 = r12
            goto L_0x00f2
        L_0x033e:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20131A8r.A03(X.2Dk, com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields, X.1ch, X.A8r, boolean):X.2Dk");
    }

    public static C197879xQ A08(NewsletterMetadataFields.ThreadMetadata.Preview preview) {
        String id = preview.getId();
        preview.Bau();
        preview.Bb7();
        return new C197879xQ(id, preview.BQg());
    }

    public final void A0I(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI A082 = ((C29691ci) it.next()).A08();
            C18070vi.A0X(A082);
            A0H(A082);
        }
    }
}
