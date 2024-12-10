package X;

public class A0O {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:225:0x037f, code lost:
        if (r43 != null) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0656, code lost:
        if (r2.renderLargerThumbnail_ == false) goto L_0x0658;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0662, code lost:
        if (r2.showAdAttribution_ == false) goto L_0x0664;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x066e, code lost:
        if (r2.containsAutoReply_ == false) goto L_0x0670;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x067a, code lost:
        if (r2.clickToWhatsappCall_ == false) goto L_0x067c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x04af  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0630  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0652  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x065e  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x066a  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0676  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x06e1  */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x0739  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C20077A6d r41, X.C166278cd r42, X.C166048cG r43, X.AnonymousClass206 r44) {
        /*
            r40 = this;
            r0 = r40
            X.00H r1 = r0.A00
            r39 = r1
            r5 = r43
            r1 = r44
            if (r43 == 0) goto L_0x02e5
            int r2 = r5.bitField0_
            r2 = r2 & 64
            if (r2 == 0) goto L_0x02e5
            X.8cN r4 = r5.botMetadata_
            if (r4 != 0) goto L_0x0018
            X.8cN r4 = X.C166118cN.DEFAULT_INSTANCE
        L_0x0018:
            X.0vd r3 = X.C17880vN.A0P(r39)
            X.0vf r7 = X.C18040vf.A01
            r2 = 11551(0x2d1f, float:1.6186E-41)
            boolean r2 = X.C18020vd.A05(r7, r3, r2)
            if (r2 == 0) goto L_0x003c
            int r2 = r4.bitField0_
            r2 = r2 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x003c
            X.8Zv r2 = r4.memoryMetadata_
            if (r2 != 0) goto L_0x0032
            X.8Zv r2 = X.C164698Zv.DEFAULT_INSTANCE
        L_0x0032:
            X.Ac5 r3 = new X.Ac5
            r3.<init>(r2)
            java.lang.Class<X.Ac5> r2 = X.C20951Ac5.class
            X.AnonymousClass206.A05(r1, r3, r2)
        L_0x003c:
            int r2 = r4.bitField0_
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0052
            X.8bE r2 = r4.avatarMetadata_
            if (r2 != 0) goto L_0x0048
            X.8bE r2 = X.C165488bE.DEFAULT_INSTANCE
        L_0x0048:
            X.Ac0 r3 = new X.Ac0
            r3.<init>(r2)
            java.lang.Class<X.Ac0> r2 = X.C20946Ac0.class
            X.AnonymousClass206.A05(r1, r3, r2)
        L_0x0052:
            int r2 = r4.bitField0_
            r2 = r2 & 4
            if (r2 == 0) goto L_0x00dc
            X.8cA r8 = r4.pluginMetadata_
            if (r8 != 0) goto L_0x005e
            X.8cA r8 = X.C165988cA.DEFAULT_INSTANCE
        L_0x005e:
            r10 = 1
            X.C18070vi.A0d(r8, r10)
            int r6 = r8.bitField0_
            r2 = r6 & 1
            if (r2 == 0) goto L_0x0214
            int r3 = r8.provider_
            if (r3 == r10) goto L_0x0210
            r2 = 2
            if (r3 == r2) goto L_0x020c
            r2 = 3
            if (r3 != r2) goto L_0x0210
            X.9Jn r2 = X.C179699Jn.SUPPORT
        L_0x0074:
            int r3 = r2.ordinal()
            r2 = 0
            if (r3 == r2) goto L_0x0208
            if (r3 == r10) goto L_0x0204
            X.9Ic r14 = X.C179479Ic.SUPPORT
        L_0x007f:
            r2 = r6 & 512(0x200, float:7.175E-43)
            boolean r2 = X.AnonymousClass000.A1O(r2)
            r9 = 0
            r13 = 0
            if (r2 == 0) goto L_0x01e6
            int r3 = r8.parentPluginType_
            if (r3 == r10) goto L_0x01e2
            r2 = 2
            if (r3 != r2) goto L_0x01e2
            X.9Ja r2 = X.AnonymousClass9Ja.SEARCH
        L_0x0092:
            int r2 = r2.ordinal()
            if (r2 == r9) goto L_0x01de
            X.9Ij r13 = X.C179539Ij.PARENT_SEARCH
        L_0x009a:
            r2 = r6 & 4
            boolean r2 = X.AnonymousClass000.A1O(r2)
            r12 = 0
            if (r2 == 0) goto L_0x01db
            java.lang.String r11 = r8.thumbnailCdnUrl_
        L_0x00a5:
            r2 = r6 & 8
            if (r2 == 0) goto L_0x01d8
            java.lang.String r10 = r8.profilePhotoCdnUrl_
        L_0x00ab:
            r2 = r6 & 16
            if (r2 == 0) goto L_0x01d5
            java.lang.String r9 = r8.searchProviderUrl_
        L_0x00b1:
            r2 = r6 & 32
            if (r2 == 0) goto L_0x01d2
            int r2 = r8.referenceIndex_
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
        L_0x00bb:
            r2 = r6 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x01cf
            java.lang.String r2 = r8.searchQuery_
        L_0x00c1:
            r3 = r6 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x00c7
            java.lang.String r12 = r8.faviconCdnUrl_
        L_0x00c7:
            X.36i r3 = new X.36i
            r19 = r2
            r20 = r12
            r12 = r3
            r16 = r11
            r17 = r10
            r18 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Class<X.36i> r2 = X.C692136i.class
            X.AnonymousClass206.A05(r1, r3, r2)
        L_0x00dc:
            int r2 = r4.bitField0_
            r2 = r2 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0119
            X.8Ym r10 = r4.modelMetadata_
            if (r10 != 0) goto L_0x00e8
            X.8Ym r10 = X.C164348Ym.DEFAULT_INSTANCE
        L_0x00e8:
            r9 = 1
            r8 = 0
            X.C18070vi.A0d(r10, r9)
            int r3 = r10.modelType_
            if (r3 == r9) goto L_0x01cb
            r2 = 2
            if (r3 != r2) goto L_0x01cb
            X.9JY r2 = X.AnonymousClass9JY.LLAMA_PROD_PREMIUM
        L_0x00f6:
            int r2 = r2.ordinal()
            if (r2 == r8) goto L_0x01c7
            X.9IU r6 = X.AnonymousClass9IU.LLAMA_PROD_PREMIUM
        L_0x00fe:
            int r3 = r10.premiumModelStatus_
            if (r3 == r9) goto L_0x01c3
            r2 = 2
            if (r3 != r2) goto L_0x01c3
            X.9JZ r2 = X.AnonymousClass9JZ.QUOTA_EXCEED_LIMIT
        L_0x0107:
            int r2 = r2.ordinal()
            if (r2 == r8) goto L_0x01bf
            java.lang.Integer r2 = X.AnonymousClass00R.A01
        L_0x010f:
            X.Aby r3 = new X.Aby
            r3.<init>(r6, r2)
            java.lang.Class<X.Aby> r2 = X.C20944Aby.class
            X.AnonymousClass206.A05(r1, r3, r2)
        L_0x0119:
            int r2 = r4.bitField0_
            r2 = r2 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x012f
            X.8XU r2 = r4.imagineMetadata_
            if (r2 != 0) goto L_0x0125
            X.8XU r2 = X.AnonymousClass8XU.DEFAULT_INSTANCE
        L_0x0125:
            X.Ac4 r3 = new X.Ac4
            r3.<init>(r2)
            java.lang.Class<X.Ac4> r2 = X.C20950Ac4.class
            X.AnonymousClass206.A05(r1, r3, r2)
        L_0x012f:
            int r2 = r4.bitField0_
            r2 = r2 & 8
            if (r2 == 0) goto L_0x0230
            X.8aj r10 = r4.suggestedPromptMetadata_
            if (r10 != 0) goto L_0x013b
            X.8aj r10 = X.C165188aj.DEFAULT_INSTANCE
        L_0x013b:
            java.lang.Class<X.Ac9> r2 = X.C20955Ac9.class
            X.25F r8 = X.C18070vi.A09(r1, r2)
            r2 = 1
            X.C18070vi.A0d(r10, r2)
            X.EE9 r3 = r10.suggestedPrompts_
            if (r3 != 0) goto L_0x019d
            r6 = 0
        L_0x014a:
            int r3 = r10.bitField0_
            boolean r2 = X.AnonymousClass8BW.A1Q(r3)
            r9 = 0
            if (r2 == 0) goto L_0x019b
            int r2 = r10.selectedPromptIndex_
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
        L_0x0159:
            r2 = r3 & 2
            if (r2 == 0) goto L_0x0217
            X.8XE r2 = r10.promptSuggestions_
            if (r2 != 0) goto L_0x0163
            X.8XE r2 = X.AnonymousClass8XE.DEFAULT_INSTANCE
        L_0x0163:
            X.C18070vi.A0X(r2)
            X.EE9 r3 = r2.suggestions_
            X.C18070vi.A0X(r3)
            r2 = 25
            java.util.List r11 = X.C29431cG.A0v(r3, r2)
            int r2 = X.C200510q.A00(r11)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r2)
            java.util.Iterator r13 = r11.iterator()
        L_0x017e:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0218
            java.lang.Object r12 = r13.next()
            X.8Yn r12 = (X.C164358Yn) r12
            java.lang.String r11 = r12.prompt_
            X.C18070vi.A0X(r11)
            r2 = 500(0x1f4, float:7.0E-43)
            java.lang.String r11 = X.C29361c9.A0Q(r11, r2)
            java.lang.String r2 = r12.promptId_
            r3.put(r11, r2)
            goto L_0x017e
        L_0x019b:
            r14 = r9
            goto L_0x0159
        L_0x019d:
            r2 = 25
            java.util.List r2 = X.C29431cG.A0v(r3, r2)
            java.util.ArrayList r6 = X.C29351c6.A0D(r2)
            java.util.Iterator r9 = r2.iterator()
        L_0x01ab:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x014a
            java.lang.String r3 = X.C17880vN.A0v(r9)
            r2 = 500(0x1f4, float:7.0E-43)
            java.lang.String r2 = X.C29361c9.A0Q(r3, r2)
            r6.add(r2)
            goto L_0x01ab
        L_0x01bf:
            java.lang.Integer r2 = X.AnonymousClass00R.A00
            goto L_0x010f
        L_0x01c3:
            X.9JZ r2 = X.AnonymousClass9JZ.AVAILABLE
            goto L_0x0107
        L_0x01c7:
            X.9IU r6 = X.AnonymousClass9IU.LLAMA_PROD
            goto L_0x00fe
        L_0x01cb:
            X.9JY r2 = X.AnonymousClass9JY.LLAMA_PROD
            goto L_0x00f6
        L_0x01cf:
            r2 = r12
            goto L_0x00c1
        L_0x01d2:
            r15 = r12
            goto L_0x00bb
        L_0x01d5:
            r9 = r12
            goto L_0x00b1
        L_0x01d8:
            r10 = r12
            goto L_0x00ab
        L_0x01db:
            r11 = r12
            goto L_0x00a5
        L_0x01de:
            X.9Ij r13 = X.C179539Ij.PARENT_REELS
            goto L_0x009a
        L_0x01e2:
            X.9Ja r2 = X.AnonymousClass9Ja.REELS
            goto L_0x0092
        L_0x01e6:
            r2 = r6 & 2
            if (r2 == 0) goto L_0x009a
            int r3 = r8.pluginType_
            if (r3 == r10) goto L_0x01fd
            r2 = 2
            if (r3 != r2) goto L_0x01fd
            X.9Ja r2 = X.AnonymousClass9Ja.SEARCH
        L_0x01f3:
            int r2 = r2.ordinal()
            if (r2 == r9) goto L_0x0200
            X.9Ij r13 = X.C179539Ij.SEARCH
            goto L_0x009a
        L_0x01fd:
            X.9Ja r2 = X.AnonymousClass9Ja.REELS
            goto L_0x01f3
        L_0x0200:
            X.9Ij r13 = X.C179539Ij.REELS
            goto L_0x009a
        L_0x0204:
            X.9Ic r14 = X.C179479Ic.GOOGLE
            goto L_0x007f
        L_0x0208:
            X.9Ic r14 = X.C179479Ic.BING
            goto L_0x007f
        L_0x020c:
            X.9Jn r2 = X.C179699Jn.GOOGLE
            goto L_0x0074
        L_0x0210:
            X.9Jn r2 = X.C179699Jn.BING
            goto L_0x0074
        L_0x0214:
            r14 = 0
            goto L_0x007f
        L_0x0217:
            r3 = r9
        L_0x0218:
            int r2 = r10.bitField0_
            r2 = r2 & 4
            if (r2 == 0) goto L_0x0220
            java.lang.String r9 = r10.selectedPromptId_
        L_0x0220:
            r18 = 0
            X.Ac9 r2 = new X.Ac9
            r13 = r2
            r15 = r9
            r16 = r6
            r17 = r3
            r13.<init>(r14, r15, r16, r17, r18)
            r8.A02(r2)
        L_0x0230:
            X.0vd r3 = X.C17880vN.A0P(r39)
            r2 = 10817(0x2a41, float:1.5158E-41)
            boolean r2 = X.C18020vd.A05(r7, r3, r2)
            if (r2 == 0) goto L_0x0254
            int r2 = r4.bitField0_
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0254
            java.lang.String r6 = r4.messageDisclaimerText_
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L_0x0254
            X.36e r3 = new X.36e
            r3.<init>(r6)
            java.lang.Class<X.36e> r2 = X.C691736e.class
            X.AnonymousClass206.A05(r1, r3, r2)
        L_0x0254:
            X.0vd r3 = X.C17880vN.A0P(r39)
            r2 = 12663(0x3177, float:1.7745E-41)
            boolean r2 = X.C18020vd.A05(r7, r3, r2)
            if (r2 == 0) goto L_0x02cf
            int r2 = r4.bitField0_
            r2 = r2 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x02cf
            X.8XF r2 = r4.renderingMetadata_
            if (r2 != 0) goto L_0x026e
            X.8XF r2 = X.AnonymousClass8XF.DEFAULT_INSTANCE
            if (r2 == 0) goto L_0x02cf
        L_0x026e:
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            X.EE9 r3 = r2.keywords_
            X.C18070vi.A0b(r3)
            r2 = 10
            int r2 = X.C108955ca.A08(r3, r2)
            java.util.List r2 = X.C29431cG.A0v(r3, r2)
            java.util.Iterator r10 = r2.iterator()
        L_0x0285:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x02c5
            java.lang.Object r3 = r10.next()
            X.8Yo r3 = (X.C164368Yo) r3
            java.lang.String r2 = r3.value_
            X.C18070vi.A0X(r2)
            java.lang.String r8 = X.C108975cc.A0d(r2)
            X.EE9 r3 = r3.associatedPrompts_
            if (r3 != 0) goto L_0x02a4
            X.0wS r7 = X.C18460wS.A00
        L_0x02a0:
            X.AnonymousClass1D6.A02(r8, r7, r9)
            goto L_0x0285
        L_0x02a4:
            r2 = 5
            java.util.List r2 = X.C29431cG.A0v(r3, r2)
            java.util.ArrayList r7 = X.C29351c6.A0D(r2)
            java.util.Iterator r6 = r2.iterator()
        L_0x02b1:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x02a0
            java.lang.String r3 = X.C17880vN.A0v(r6)
            r2 = 500(0x1f4, float:7.0E-43)
            java.lang.String r2 = X.C29361c9.A0Q(r3, r2)
            r7.add(r2)
            goto L_0x02b1
        L_0x02c5:
            X.36f r3 = new X.36f
            r3.<init>(r9)
            java.lang.Class<X.36f> r2 = X.C691836f.class
            X.AnonymousClass206.A05(r1, r3, r2)
        L_0x02cf:
            int r2 = r4.bitField0_
            r2 = r2 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x02e5
            X.8XV r2 = r4.progressIndicatorMetadata_
            if (r2 != 0) goto L_0x02db
            X.8XV r2 = X.AnonymousClass8XV.DEFAULT_INSTANCE
        L_0x02db:
            X.Ac7 r3 = new X.Ac7
            r3.<init>(r2)
            java.lang.Class<X.Ac7> r2 = X.C20953Ac7.class
            X.AnonymousClass206.A05(r1, r3, r2)
        L_0x02e5:
            r6 = r41
            boolean r2 = r6.A0L
            if (r2 != 0) goto L_0x037f
            if (r43 == 0) goto L_0x036d
            int r2 = r5.bitField0_
            r2 = r2 & 4
            if (r2 == 0) goto L_0x036d
            X.00H r2 = r0.A08
            java.lang.Object r8 = r2.get()
            X.1W9 r8 = (X.AnonymousClass1W9) r8
            X.00H r2 = r0.A07
            int r7 = X.C62242r5.A00(r1, r2)
            int r2 = r5.bitField0_
            r2 = r2 & 4
            if (r2 == 0) goto L_0x035c
            X.DSQ r2 = r5.messageSecret_
            byte[] r4 = r2.A06()
            int r3 = r4.length
            r2 = 32
            if (r3 != r2) goto L_0x03e4
            r1.A1D = r4
        L_0x0314:
            int r2 = r5.bitField0_
            r2 = r2 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0435
            X.0vd r3 = X.C17880vN.A0P(r39)
            r2 = 8783(0x224f, float:1.2308E-41)
            X.0vf r11 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r11, r3, r2)
            if (r2 == 0) goto L_0x0435
            X.8aJ r9 = r5.messageAssociation_
            if (r9 != 0) goto L_0x032e
            X.8aJ r9 = X.C164938aJ.DEFAULT_INSTANCE
        L_0x032e:
            int r2 = r9.bitField0_
            r2 = r2 & 2
            if (r2 == 0) goto L_0x03dd
            int r2 = r9.associationType_
            X.6Rv r8 = X.C122766Rv.A00(r2)
            if (r8 != 0) goto L_0x033e
            X.6Rv r8 = X.C122766Rv.FUTURE
        L_0x033e:
            java.util.Map r2 = X.C137736vw.A00
            java.util.LinkedHashMap r7 = X.C17880vN.A13()
            java.util.Iterator r4 = X.AnonymousClass000.A15(r2)
        L_0x0348:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0382
            java.util.Map$Entry r3 = X.AnonymousClass000.A16(r4)
            java.lang.Object r2 = r3.getValue()
            if (r2 != r8) goto L_0x0348
            X.C108985cd.A1R(r7, r3)
            goto L_0x0348
        L_0x035c:
            boolean r2 = X.C60612oK.A00(r1)
            if (r2 == 0) goto L_0x0314
            r0 = 0
            r8.A02(r0, r7)
            r0 = 66
            X.1hd r0 = X.AnonymousClass8BR.A0o(r0)
            throw r0
        L_0x036d:
            boolean r2 = X.C60612oK.A00(r1)
            if (r2 == 0) goto L_0x037f
            int r3 = r1.A0u
            r2 = 92
            if (r3 != r2) goto L_0x099e
            boolean r2 = X.AnonymousClass8BV.A1R(r1)
            if (r2 == 0) goto L_0x099e
        L_0x037f:
            if (r43 == 0) goto L_0x0435
            goto L_0x0314
        L_0x0382:
            java.util.Set r2 = r7.keySet()
            java.lang.Object r10 = X.C29431cG.A0a(r2)
            X.6RT r10 = (X.AnonymousClass6RT) r10
            X.8cq r8 = r9.parentMessageKey_
            if (r8 != 0) goto L_0x0392
            X.8cq r8 = X.C166408cq.DEFAULT_INSTANCE
        L_0x0392:
            X.1BI r7 = r6.A05
            X.00H r2 = r0.A05
            java.lang.Object r4 = r2.get()
            X.11S r4 = (X.AnonymousClass11S) r4
            X.205 r3 = r1.A0v
            boolean r2 = r3.A02
            if (r2 != 0) goto L_0x03db
            if (r7 == 0) goto L_0x03db
        L_0x03a4:
            r2 = 0
            X.A51 r9 = X.AnonymousClass9AT.A00(r4, r7, r8, r3, r2)
            r3 = -1
            if (r10 == 0) goto L_0x03c9
            X.6RT r2 = X.AnonymousClass6RT.FUTURE
            if (r10 == r2) goto L_0x03c9
            boolean r2 = r1 instanceof X.AnonymousClass23U
            if (r2 != 0) goto L_0x03c9
            boolean r2 = r1 instanceof X.AnonymousClass210
            if (r2 == 0) goto L_0x03ef
            X.6RT r2 = X.AnonymousClass6RT.STATUS_TAPPABLE_MESSAGE
            if (r10 != r2) goto L_0x03ef
            X.0vd r7 = X.C17880vN.A0P(r39)
            r2 = 11852(0x2e4c, float:1.6608E-41)
            boolean r2 = X.C18020vd.A05(r11, r7, r2)
            if (r2 != 0) goto L_0x03ef
        L_0x03c9:
            java.lang.String r0 = "MessageContextInfoDeserializer/applyMessageAssociation/unknown message association type/storing FP message"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.6RT r0 = X.AnonymousClass6RT.FUTURE
            X.36t r1 = new X.36t
            r1.<init>(r0, r9, r3)
            X.8t1 r0 = new X.8t1
            r0.<init>(r1)
            throw r0
        L_0x03db:
            r7 = 0
            goto L_0x03a4
        L_0x03dd:
            r0 = 11
            X.1hd r0 = X.AnonymousClass8BR.A0o(r0)
            throw r0
        L_0x03e4:
            r0 = 1
            r8.A02(r0, r7)
            r0 = 67
            X.1hd r0 = X.AnonymousClass8BR.A0o(r0)
            throw r0
        L_0x03ef:
            X.00H r2 = r0.A06
            java.lang.Object r8 = r2.get()
            X.1RU r8 = (X.AnonymousClass1RU) r8
            X.1RV r8 = (X.AnonymousClass1RV) r8
            X.00H r2 = r8.A00
            X.0vd r7 = X.C17880vN.A0P(r2)
            r2 = 8783(0x224f, float:1.2308E-41)
            boolean r2 = X.C18020vd.A05(r11, r7, r2)
            if (r2 == 0) goto L_0x0427
            X.00H r2 = r8.A04
            java.util.Iterator r8 = X.AnonymousClass8BX.A0m(r2)
        L_0x040d:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0470
            java.lang.Object r7 = r8.next()
            r2 = r7
            X.3MB r2 = (X.AnonymousClass3MB) r2
            X.6RT r2 = r2.BNA()
            if (r2 != r10) goto L_0x040d
        L_0x0420:
            X.3MB r7 = (X.AnonymousClass3MB) r7
            if (r7 == 0) goto L_0x0427
            r7.CRh(r6, r5, r1)
        L_0x0427:
            X.36t r2 = new X.36t
            r2.<init>(r10, r9, r3)
            X.C60512o9.A01(r1, r2)
            r2 = 67108864(0x4000000, double:3.31561842E-316)
            r1.A0b(r2)
        L_0x0435:
            X.00H r2 = r0.A0C
            java.lang.Object r3 = r2.get()
            X.1MB r3 = (X.AnonymousClass1MB) r3
            X.205 r2 = r1.A0v
            X.1BI r4 = r2.A00
            boolean r2 = r3.A03(r4)
            if (r2 == 0) goto L_0x04b5
            X.0vd r3 = X.C17880vN.A0P(r39)
            r2 = 10107(0x277b, float:1.4163E-41)
            X.0vf r7 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r7, r3, r2)
            if (r2 != 0) goto L_0x0461
            X.0vd r3 = X.C17880vN.A0P(r39)
            r2 = 9942(0x26d6, float:1.3932E-41)
            boolean r2 = X.C18020vd.A05(r7, r3, r2)
            if (r2 == 0) goto L_0x04b5
        L_0x0461:
            if (r43 == 0) goto L_0x04b5
            int r2 = r5.bitField0_
            r2 = r2 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x04b5
            java.lang.String r2 = r5.supportPayload_
            r9 = 0
            X.C18070vi.A0d(r2, r9)
            goto L_0x0472
        L_0x0470:
            r7 = 0
            goto L_0x0420
        L_0x0472:
            org.json.JSONObject r10 = X.C17880vN.A16(r2)     // Catch:{ JSONException -> 0x049d }
            java.lang.String r2 = "version"
            int r3 = r10.getInt(r2)     // Catch:{ JSONException -> 0x049d }
            r2 = 1
            if (r3 != r2) goto L_0x04a3
            java.lang.String r2 = "is_ai_message"
            boolean r8 = r10.optBoolean(r2)     // Catch:{ JSONException -> 0x049d }
            java.lang.String r2 = "should_show_system_message"
            boolean r7 = r10.optBoolean(r2)     // Catch:{ JSONException -> 0x049d }
            java.lang.String r2 = "should_upload_client_logs"
            boolean r5 = r10.optBoolean(r2)     // Catch:{ JSONException -> 0x049d }
            java.lang.String r2 = "ticket_id"
            java.lang.String r2 = r10.optString(r2)     // Catch:{ JSONException -> 0x049d }
            X.2mc r3 = new X.2mc     // Catch:{ JSONException -> 0x049d }
            r3.<init>(r2, r8, r7, r5)     // Catch:{ JSONException -> 0x049d }
            goto L_0x04a9
        L_0x049d:
            r3 = move-exception
            java.lang.String r2 = "SupportProtobuf: error reading support payload protobuf"
            com.whatsapp.util.Log.e(r2, r3)
        L_0x04a3:
            r2 = 0
            X.2mc r3 = new X.2mc
            r3.<init>(r2, r9, r9, r9)
        L_0x04a9:
            r1.A0P = r3
            boolean r2 = r3.A01
            if (r2 == 0) goto L_0x04b5
            r2 = 268435456(0x10000000, double:1.32624737E-315)
            r1.A0b(r2)
        L_0x04b5:
            r5 = r42
            if (r42 == 0) goto L_0x099d
            X.205 r7 = r6.A0A
            boolean r6 = r6.A0J
            int r3 = r5.bitField0_
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r3 = r3 & r2
            if (r3 == 0) goto L_0x04ce
            boolean r2 = r5.isSampled_
            if (r2 == 0) goto L_0x04ce
            r2 = 262144(0x40000, double:1.295163E-318)
            r1.A0b(r2)
        L_0x04ce:
            int r2 = r5.bitField0_
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x057e
            boolean r2 = r5.isForwarded_
            if (r2 == 0) goto L_0x057e
            r2 = 1
            r1.A0b(r2)
            int r8 = r5.bitField0_
            r2 = r8 & 128(0x80, float:1.794E-43)
            boolean r2 = X.AnonymousClass000.A1O(r2)
            r3 = 1
            if (r2 == 0) goto L_0x04ee
            int r2 = r5.forwardingScore_
            int r3 = java.lang.Math.max(r3, r2)
        L_0x04ee:
            r1.A06 = r3
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r8 = r8 & r2
            boolean r2 = X.AnonymousClass000.A1O(r8)
            r8 = 0
            if (r2 == 0) goto L_0x0559
            X.8bG r11 = r5.forwardedNewsletterMessageInfo_
            if (r11 != 0) goto L_0x0500
            X.8bG r11 = X.C165508bG.DEFAULT_INSTANCE
        L_0x0500:
            int r2 = r11.bitField0_
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0559
            java.lang.String r3 = r11.newsletterJid_
            X.25J r2 = X.C29681ch.A03
            X.1ch r13 = r2.A01(r3)
            int r12 = r11.bitField0_
            r2 = r12 & 4
            if (r2 == 0) goto L_0x074b
            java.lang.String r10 = r11.newsletterName_
        L_0x0516:
            if (r13 == 0) goto L_0x0559
            int r3 = r10.length()
            r2 = 100
            if (r3 > r2) goto L_0x0559
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0748
            int r9 = r11.serverMessageId_
        L_0x0526:
            r2 = r12 & 8
            if (r2 == 0) goto L_0x0745
            int r3 = r11.contentType_
            r2 = 1
            if (r3 == r2) goto L_0x0741
            r2 = 2
            if (r3 == r2) goto L_0x073d
            r2 = 3
            if (r3 != r2) goto L_0x0741
            X.9Jp r2 = X.C179709Jp.LINK_CARD
        L_0x0537:
            int r3 = r2.ordinal()
            r2 = 0
            if (r3 == r2) goto L_0x0739
            r2 = 1
            if (r3 == r2) goto L_0x0735
            X.9Id r14 = X.AnonymousClass9Id.LINK_CARD
        L_0x0543:
            r2 = r12 & 16
            if (r2 == 0) goto L_0x0732
            java.lang.String r2 = r11.accessibilityText_
        L_0x0549:
            X.Ac1 r3 = new X.Ac1
            r12 = r3
            r15 = r10
            r16 = r2
            r17 = r9
            r12.<init>(r13, r14, r15, r16, r17)
            java.lang.Class<X.Ac1> r2 = X.C20947Ac1.class
            X.AnonymousClass206.A05(r1, r3, r2)
        L_0x0559:
            int r3 = r5.bitField0_
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r3 = r3 & r2
            if (r3 == 0) goto L_0x057e
            X.8XW r3 = r5.businessMessageForwardInfo_
            if (r3 != 0) goto L_0x0566
            X.8XW r3 = X.AnonymousClass8XW.DEFAULT_INSTANCE
        L_0x0566:
            int r2 = r3.bitField0_
            r2 = r2 & 1
            if (r2 == 0) goto L_0x057e
            java.lang.String r2 = r3.businessOwnerJid_
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A02(r2)
            if (r2 == 0) goto L_0x057e
            X.36g r3 = new X.36g
            r3.<init>(r8, r2)
            java.lang.Class<X.36g> r2 = X.C691936g.class
            X.AnonymousClass206.A05(r1, r3, r2)
        L_0x057e:
            int r2 = r5.bitField0_
            r2 = r2 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x060c
            int r2 = r5.expiration_
            r1.A0Z(r2)
            int r2 = r5.bitField0_
            r2 = r2 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x05a3
            X.1BI r2 = r7.A00
            boolean r2 = X.C22971Dz.A0Y(r2)
            if (r2 == 0) goto L_0x05a3
            long r2 = r5.ephemeralSettingTimestamp_
            r8 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r8
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.A0h(r2)
        L_0x05a3:
            X.8ci r2 = r5.disappearingMode_
            if (r2 != 0) goto L_0x05a9
            X.8ci r2 = X.C166328ci.DEFAULT_INSTANCE
        L_0x05a9:
            X.9K8 r2 = r2.A0R()
            int r2 = r2.value
            r1.A00 = r2
            X.0vd r8 = X.C17880vN.A0P(r39)
            r3 = 5309(0x14bd, float:7.44E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r8, r3)
            if (r2 == 0) goto L_0x060c
            X.8ci r2 = r5.disappearingMode_
            r3 = r2
            if (r2 != 0) goto L_0x05c6
            X.8ci r2 = X.C166328ci.DEFAULT_INSTANCE
        L_0x05c6:
            int r2 = r2.trigger_
            X.9KQ r2 = X.AnonymousClass9KQ.A00(r2)
            if (r2 != 0) goto L_0x05d0
            X.9KQ r2 = X.AnonymousClass9KQ.UNKNOWN
        L_0x05d0:
            int r11 = X.C196849vk.A00(r2)
            r1.A04 = r11
            if (r3 != 0) goto L_0x05da
            X.8ci r3 = X.C166328ci.DEFAULT_INSTANCE
        L_0x05da:
            boolean r3 = r3.initiatedByMe_
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r12 = 0
            r10 = 0
            r9 = 1
            if (r2 == 0) goto L_0x05f7
            boolean r2 = X.C22971Dz.A0e(r4)
            if (r2 != 0) goto L_0x0701
            boolean r2 = r7.A02
            boolean r2 = X.AnonymousClass000.A1T(r3, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.A0Q = r2
        L_0x05f7:
            int r2 = r1.A04
            if (r2 != 0) goto L_0x060c
            int r3 = r1.A00
            if (r3 == 0) goto L_0x06fb
            r2 = 2
            if (r3 == r9) goto L_0x06f3
            if (r3 != r2) goto L_0x060c
            r1.A04 = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
        L_0x060a:
            r1.A0Q = r2
        L_0x060c:
            int r2 = r5.bitField0_
            r2 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x06bd
            X.8cZ r2 = r5.externalAdReply_
            if (r2 != 0) goto L_0x0618
            X.8cZ r2 = X.C166238cZ.DEFAULT_INSTANCE
        L_0x0618:
            java.lang.String r3 = r2.title_
            r38 = r3
            java.lang.String r3 = r2.body_
            r37 = r3
            int r7 = r2.mediaType_
            if (r7 == 0) goto L_0x06ef
            r3 = 1
            if (r7 == r3) goto L_0x06eb
            r3 = 2
            if (r7 != r3) goto L_0x06ef
            X.9Jo r7 = X.AnonymousClass9Jo.VIDEO
        L_0x062c:
            X.9Jo r3 = X.AnonymousClass9Jo.IMAGE
            if (r7 != r3) goto L_0x06e1
            r24 = 1
        L_0x0632:
            java.lang.String r3 = r2.thumbnailUrl_
            r36 = r3
            java.lang.String r3 = r2.mediaUrl_
            r35 = r3
            X.DSQ r3 = r2.thumbnail_
            byte[] r22 = r3.A06()
            java.lang.String r3 = r2.sourceType_
            r34 = r3
            java.lang.String r3 = r2.sourceId_
            r33 = r3
            java.lang.String r3 = r2.sourceUrl_
            r32 = r3
            int r7 = r2.bitField0_
            r3 = r7 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0658
            boolean r3 = r2.renderLargerThumbnail_
            r25 = 1
            if (r3 != 0) goto L_0x065a
        L_0x0658:
            r25 = 0
        L_0x065a:
            r3 = r7 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0664
            boolean r3 = r2.showAdAttribution_
            r26 = 1
            if (r3 != 0) goto L_0x0666
        L_0x0664:
            r26 = 0
        L_0x0666:
            r3 = r7 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0670
            boolean r3 = r2.containsAutoReply_
            r27 = 1
            if (r3 != 0) goto L_0x0672
        L_0x0670:
            r27 = 0
        L_0x0672:
            r3 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x067c
            boolean r3 = r2.clickToWhatsappCall_
            r28 = 1
            if (r3 != 0) goto L_0x067e
        L_0x067c:
            r28 = 0
        L_0x067e:
            java.lang.String r15 = r2.ctwaClid_
            java.lang.String r14 = r2.ref_
            boolean r13 = r2.adContextPreviewDismissed_
            java.lang.String r12 = r2.sourceApp_
            boolean r11 = r2.automatedGreetingMessageShown_
            java.lang.String r10 = r2.greetingMessageBody_
            java.lang.String r9 = r2.ctaPayload_
            boolean r8 = r2.disableNudge_
            java.lang.String r7 = r2.originalImageUrl_
            java.lang.String r3 = r2.automatedGreetingMessageCtaType_
            r23 = 0
            X.Abv r2 = new X.Abv
            r16 = r14
            r17 = r12
            r18 = r10
            r19 = r9
            r20 = r7
            r21 = r3
            r29 = r13
            r30 = r11
            r31 = r8
            r7 = r2
            r8 = r38
            r9 = r37
            r10 = r36
            r11 = r35
            r12 = r34
            r13 = r33
            r14 = r32
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.C60532oB.A01(r2, r1)
        L_0x06bd:
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            X.EE9 r2 = r5.mentionedJid_
            java.util.ArrayList r2 = X.C22971Dz.A0A(r3, r2)
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r9 = r2.iterator()
        L_0x06cd:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x074f
            X.1BI r7 = X.C17880vN.A0Q(r9)
            r3 = 0
            X.3Bi r2 = new X.3Bi
            r2.<init>(r7, r3)
            r8.add(r2)
            goto L_0x06cd
        L_0x06e1:
            X.9Jo r3 = X.AnonymousClass9Jo.VIDEO
            r24 = 0
            if (r7 != r3) goto L_0x0632
            r24 = 2
            goto L_0x0632
        L_0x06eb:
            X.9Jo r7 = X.AnonymousClass9Jo.IMAGE
            goto L_0x062c
        L_0x06ef:
            X.9Jo r7 = X.AnonymousClass9Jo.NONE
            goto L_0x062c
        L_0x06f3:
            r1.A04 = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            goto L_0x060a
        L_0x06fb:
            r1.A04 = r9
            r1.A0Q = r10
            goto L_0x060c
        L_0x0701:
            boolean r2 = r4 instanceof com.whatsapp.jid.GroupJid
            if (r2 == 0) goto L_0x05f7
            X.00H r2 = r0.A02
            java.lang.Object r2 = r2.get()
            X.1CJ r2 = (X.AnonymousClass1CJ) r2
            X.1ci r8 = r2.A0A(r4)
            if (r8 == 0) goto L_0x05f7
            X.2lr r2 = r8.A0d
            if (r2 == 0) goto L_0x05f7
            java.lang.Boolean r7 = r2.A01
            r1.A0Q = r7
            int r3 = r2.A00
            r2 = 5
            if (r3 != r2) goto L_0x05f7
            if (r11 == 0) goto L_0x05f7
            r8.A0L(r7, r11)
            X.00H r2 = r0.A03
            java.lang.Object r2 = r2.get()
            X.2if r2 = (X.C57182if) r2
            r2.A00(r8)
            goto L_0x05f7
        L_0x0732:
            r2 = r8
            goto L_0x0549
        L_0x0735:
            X.9Id r14 = X.AnonymousClass9Id.UPDATE_CARD
            goto L_0x0543
        L_0x0739:
            X.9Id r14 = X.AnonymousClass9Id.UPDATE
            goto L_0x0543
        L_0x073d:
            X.9Jp r2 = X.C179709Jp.UPDATE_CARD
            goto L_0x0537
        L_0x0741:
            X.9Jp r2 = X.C179709Jp.UPDATE
            goto L_0x0537
        L_0x0745:
            r14 = r8
            goto L_0x0543
        L_0x0748:
            r9 = -1
            goto L_0x0526
        L_0x074b:
            java.lang.String r10 = ""
            goto L_0x0516
        L_0x074f:
            X.EE9 r2 = r5.groupMentions_
            java.util.Iterator r9 = r2.iterator()
        L_0x0755:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x077e
            java.lang.Object r3 = r9.next()
            X.8Yt r3 = (X.C164418Yt) r3
            r2 = 0
            X.C18070vi.A0d(r3, r2)
            X.1Dv r2 = X.AnonymousClass1BI.A00
            java.lang.String r2 = r3.groupJid_
            X.1BI r7 = X.C22931Dv.A01(r2)
            java.lang.String r3 = r3.groupSubject_
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r3 = X.AnonymousClass1EG.A0E(r3, r2)
            X.3Bi r2 = new X.3Bi
            r2.<init>(r7, r3)
            r8.add(r2)
            goto L_0x0755
        L_0x077e:
            r1.A0l(r8)
            X.00H r2 = r0.A01
            java.lang.Object r2 = r2.get()
            X.1PW r2 = (X.AnonymousClass1PW) r2
            com.whatsapp.jid.UserJid r2 = r2.A03(r8)
            boolean r2 = X.AnonymousClass000.A1W(r2)
            r1.A0n(r2)
            if (r6 == 0) goto L_0x099d
            java.lang.String r3 = r5.remoteJid_
            X.1nh r2 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r8 = r2.A03(r3)
            int r6 = r5.bitField0_
            r2 = r6 & 4
            if (r2 != 0) goto L_0x07b7
            r2 = 0
            r6 = r6 & 8
            if (r6 == 0) goto L_0x07b7
            if (r8 == 0) goto L_0x07b7
            java.lang.String r7 = r5.groupSubject_
            java.lang.String r6 = r5.parentGroupJid_
            X.23W r2 = X.C181589Rb.A00(r8, r7, r6, r2)
            r1.A0f(r2)
        L_0x07b7:
            int r2 = r5.bitField0_
            r2 = r2 & 8
            if (r2 == 0) goto L_0x0807
            java.lang.String r2 = r5.remoteJid_
            X.1BI r7 = X.AnonymousClass3MX.A0l(r2)
        L_0x07c3:
            boolean r2 = r1.A0w()
            r6 = 0
            if (r2 == 0) goto L_0x0805
            X.25J r2 = X.C29681ch.A03
            boolean r2 = r4 instanceof X.C29681ch
            if (r2 == 0) goto L_0x0803
            r8 = r4
        L_0x07d1:
            int r2 = r5.bitField0_
            r2 = r2 & 2
            if (r2 == 0) goto L_0x07f3
            java.lang.String r3 = r5.participant_
            X.1E0 r2 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r2 = r2.A06(r3)
            if (r2 != 0) goto L_0x07f0
            r4 = r6
        L_0x07e2:
            int r3 = r5.bitField0_
            r2 = r3 & 4
            if (r2 == 0) goto L_0x0893
            boolean r2 = r1.A0w()
            if (r2 != 0) goto L_0x0809
            r8 = r4
            goto L_0x0809
        L_0x07f0:
            com.whatsapp.jid.UserJid r4 = r2.userJid
            goto L_0x07e2
        L_0x07f3:
            X.1BI r2 = r1.A0H()
            if (r2 != 0) goto L_0x07fe
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A00(r4)
            goto L_0x07e2
        L_0x07fe:
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A00(r2)
            goto L_0x07e2
        L_0x0803:
            r8 = 0
            goto L_0x07d1
        L_0x0805:
            r8 = r6
            goto L_0x07d1
        L_0x0807:
            r7 = r4
            goto L_0x07c3
        L_0x0809:
            X.00H r2 = r0.A05     // Catch:{ 11T | 1hc -> 0x08c2 }
            java.lang.Object r2 = r2.get()     // Catch:{ 11T | 1hc -> 0x08c2 }
            X.11S r2 = (X.AnonymousClass11S) r2     // Catch:{ 11T | 1hc -> 0x08c2 }
            boolean r4 = r2.A0O(r8)     // Catch:{ 11T | 1hc -> 0x08c2 }
            X.8cr r11 = r5.quotedMessage_     // Catch:{ 11T | 1hc -> 0x08c2 }
            if (r11 != 0) goto L_0x081b
            X.8cr r11 = X.C166418cr.DEFAULT_INSTANCE     // Catch:{ 11T | 1hc -> 0x08c2 }
        L_0x081b:
            java.lang.String r2 = r5.stanzaId_     // Catch:{ 11T | 1hc -> 0x08c2 }
            X.205 r10 = X.AnonymousClass205.A01(r7, r2, r4)     // Catch:{ 11T | 1hc -> 0x08c2 }
            java.lang.Object r12 = r39.get()     // Catch:{ 11T | 1hc -> 0x08c2 }
            X.0ve r12 = (X.C18030ve) r12     // Catch:{ 11T | 1hc -> 0x08c2 }
            X.00H r2 = r0.A09     // Catch:{ 11T | 1hc -> 0x08c2 }
            java.lang.Object r9 = r2.get()     // Catch:{ 11T | 1hc -> 0x08c2 }
            X.1l7 r9 = (X.C34811l7) r9     // Catch:{ 11T | 1hc -> 0x08c2 }
            X.00H r2 = r0.A02     // Catch:{ 11T | 1hc -> 0x08c2 }
            java.lang.Object r3 = r2.get()     // Catch:{ 11T | 1hc -> 0x08c2 }
            X.1CJ r3 = (X.AnonymousClass1CJ) r3     // Catch:{ 11T | 1hc -> 0x08c2 }
            X.1BI r2 = r10.A00     // Catch:{ 11T | 1hc -> 0x08c2 }
            boolean r2 = X.C20102A7g.A04(r9, r3, r12, r2, r11)     // Catch:{ 11T | 1hc -> 0x08c2 }
            if (r2 != 0) goto L_0x088c
            r2 = 0
            X.9p8 r3 = X.C196699vU.A00(r11, r10, r2)     // Catch:{ 11T | 1hc -> 0x08c2 }
            r3.A02 = r8     // Catch:{ 11T | 1hc -> 0x08c2 }
            r2 = 1
            r3.A0D = r2     // Catch:{ 11T | 1hc -> 0x08c2 }
            X.A6d r2 = r3.A00()     // Catch:{ 11T | 1hc -> 0x08c2 }
            X.00H r0 = r0.A04     // Catch:{ 11T | 1hc -> 0x08c2 }
            X.206 r2 = X.AnonymousClass8BV.A0K(r2, r0)     // Catch:{ 11T | 1hc -> 0x08c2 }
            if (r8 == r7) goto L_0x0864
            boolean r0 = r1.A0w()     // Catch:{ 11T | 1hc -> 0x08c2 }
            if (r0 == 0) goto L_0x0864
            java.lang.String r0 = "user jid and remote jid don't match in newsletter"
            X.11T r2 = new X.11T     // Catch:{ 11T | 1hc -> 0x08c2 }
            r2.<init>((java.lang.String) r0)     // Catch:{ 11T | 1hc -> 0x08c2 }
        L_0x0863:
            throw r2     // Catch:{ 11T | 1hc -> 0x08c2 }
        L_0x0864:
            if (r4 != 0) goto L_0x0874
            if (r8 == 0) goto L_0x0869
            goto L_0x0871
        L_0x0869:
            java.lang.String r0 = "null jid not from me"
            X.11T r2 = new X.11T     // Catch:{ 11T | 1hc -> 0x08c2 }
            r2.<init>((java.lang.String) r0)     // Catch:{ 11T | 1hc -> 0x08c2 }
            goto L_0x0863
        L_0x0871:
            r2.A0d(r8)     // Catch:{ 11T | 1hc -> 0x08c2 }
        L_0x0874:
            int r0 = r2.A0u     // Catch:{ 11T | 1hc -> 0x08c2 }
            if (r0 != 0) goto L_0x0884
            java.lang.String r0 = r2.A0P()     // Catch:{ 11T | 1hc -> 0x08c2 }
            if (r0 != 0) goto L_0x0884
            java.lang.String r0 = X.AnonymousClass25B.A01(r2)     // Catch:{ 11T | 1hc -> 0x08c2 }
            if (r0 == 0) goto L_0x08c8
        L_0x0884:
            r0 = 2
            r2.A14(r0)     // Catch:{ 11T | 1hc -> 0x08c2 }
            r1.A0f(r2)     // Catch:{ 11T | 1hc -> 0x08c2 }
            goto L_0x08c8
        L_0x088c:
            r0 = 18
            X.1hd r0 = X.AnonymousClass8BR.A0o(r0)     // Catch:{ 11T | 1hc -> 0x08c2 }
            throw r0     // Catch:{ 11T | 1hc -> 0x08c2 }
        L_0x0893:
            r2 = r3 & 1
            if (r2 == 0) goto L_0x08c8
            java.lang.String r2 = r5.stanzaId_
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x08c8
            X.00H r0 = r0.A05
            java.lang.Object r0 = r0.get()
            X.11S r0 = (X.AnonymousClass11S) r0
            boolean r2 = r0.A0O(r4)
            java.lang.String r0 = r5.stanzaId_
            X.205 r7 = X.AnonymousClass205.A01(r7, r0, r2)
            r3 = 0
            r0 = 98
            X.23x r2 = new X.23x
            r2.<init>(r7, r0, r3)
            r0 = 2
            r2.A14(r0)
            r1.A0f(r2)
            goto L_0x08c8
        L_0x08c2:
            r2 = move-exception
            java.lang.String r0 = "MessageUtils/buildContextInfo/setupQuotedMessage/error quoted message was malformed, exception="
            com.whatsapp.util.Log.w(r0, r2)
        L_0x08c8:
            X.0vd r2 = X.C17880vN.A0P(r39)
            r0 = 508(0x1fc, float:7.12E-43)
            r2.A0N(r0)
            boolean r0 = r5.alwaysShowAdAttribution_
            if (r0 == 0) goto L_0x08dd
            r1.A0k = r0
            r2 = 1073741824(0x40000000, double:5.304989477E-315)
            r1.A0b(r2)
        L_0x08dd:
            X.0vd r2 = X.C17880vN.A0P(r39)
            r0 = 5869(0x16ed, float:8.224E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r2, r0)
            if (r0 == 0) goto L_0x0948
            int r2 = r5.bitField0_
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0948
            r0 = 64
            r1.A0V(r0)
            X.8Zw r9 = r5.dataSharingContext_
            if (r9 != 0) goto L_0x08fd
            X.8Zw r9 = X.C164708Zw.DEFAULT_INSTANCE
        L_0x08fd:
            int r0 = r9.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0948
            X.EE9 r0 = r9.parameters_
            java.util.Iterator r10 = r0.iterator()
            r7 = r6
        L_0x090a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x093c
            java.lang.Object r8 = r10.next()
            X.8bF r8 = (X.C165498bF) r8
            int r4 = r8.bitField0_
            r0 = r4 & 1
            if (r0 == 0) goto L_0x090a
            java.lang.String r2 = r8.key_
            java.lang.String r0 = "data_sharing_encrypted_token_disclosed"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x092d
            r0 = r4 & 2
            if (r0 == 0) goto L_0x092d
            java.lang.String r6 = r8.stringData_
            goto L_0x090a
        L_0x092d:
            java.lang.String r0 = "data_sharing_encrypted_token_undisclosed"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x090a
            r0 = r4 & 2
            if (r0 == 0) goto L_0x090a
            java.lang.String r7 = r8.stringData_
            goto L_0x090a
        L_0x093c:
            boolean r0 = r9.showMmDisclosure_
            X.AcA r2 = new X.AcA
            r2.<init>(r6, r7, r0)
            java.lang.Class<X.AcA> r0 = X.C20956AcA.class
            X.AnonymousClass206.A05(r1, r2, r0)
        L_0x0948:
            int r2 = r5.bitField0_
            r0 = 1073741824(0x40000000, float:2.0)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0978
            X.8Yq r0 = r5.featureEligibilities_
            r4 = r0
            if (r0 != 0) goto L_0x0956
            X.8Yq r0 = X.C164388Yq.DEFAULT_INSTANCE
        L_0x0956:
            boolean r0 = r0.cannotBeReactedTo_
            if (r0 == 0) goto L_0x0969
            X.36j r2 = X.C63672tV.A01(r1)
            X.8Yq r0 = r5.featureEligibilities_
            r4 = r0
            if (r0 != 0) goto L_0x0965
            X.8Yq r0 = X.C164388Yq.DEFAULT_INSTANCE
        L_0x0965:
            boolean r0 = r0.cannotBeReactedTo_
            r2.A07 = r0
        L_0x0969:
            if (r4 != 0) goto L_0x096d
            X.8Yq r4 = X.C164388Yq.DEFAULT_INSTANCE
        L_0x096d:
            boolean r0 = r4.cannotBeRanked_
            if (r0 == 0) goto L_0x0978
            X.36j r2 = X.C63672tV.A01(r1)
            r0 = 1
            r2.A06 = r0
        L_0x0978:
            int r2 = r5.statusAttributionType_
            if (r2 == 0) goto L_0x099a
            r0 = 1
            if (r2 != r0) goto L_0x099a
            X.9Jb r2 = X.AnonymousClass9Jb.RESHARED_FROM_MENTION
        L_0x0981:
            X.9Jb r0 = X.AnonymousClass9Jb.RESHARED_FROM_MENTION
            if (r2 != r0) goto L_0x099d
            X.0vd r2 = X.C17880vN.A0P(r39)
            r0 = 12727(0x31b7, float:1.7834E-41)
            boolean r0 = X.C18020vd.A05(r3, r2, r0)
            if (r0 == 0) goto L_0x099d
            X.36j r1 = X.C63672tV.A01(r1)
            X.6RJ r0 = X.AnonymousClass6RJ.RESHARED_FROM_STATUS_MENTION
            r1.A02 = r0
            return
        L_0x099a:
            X.9Jb r2 = X.AnonymousClass9Jb.NONE
            goto L_0x0981
        L_0x099d:
            return
        L_0x099e:
            X.00H r2 = r0.A0A
            java.lang.Object r4 = r2.get()
            X.18K r4 = (X.AnonymousClass18K) r4
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "MessageContextInfoDeserializer"
            r3.append(r2)
            java.lang.String r2 = "/applyMessageSecret"
            java.lang.String r2 = X.AnonymousClass000.A0y(r2, r3)
            X.00H r0 = r0.A07
            int r0 = X.C62242r5.A00(r1, r0)
            X.AnonymousClass1W9.A01(r4, r2, r0)
            r0 = 66
            X.1hd r0 = X.AnonymousClass8BR.A0o(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0O.A01(X.A6d, X.8cd, X.8cG, X.206):void");
    }

    public A0O(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        this.A00 = r1;
        this.A05 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A0A = r6;
        this.A09 = r7;
        this.A07 = r8;
        this.A08 = r9;
        this.A04 = r10;
        this.A0B = r11;
        this.A06 = r12;
        this.A0C = r13;
    }

    /* JADX WARNING: Removed duplicated region for block: B:240:0x0296  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C166278cd A00(X.C18030ve r6, X.C166418cr r7) {
        /*
            X.8cr r3 = X.C196709vV.A01(r6, r7)
            int r1 = r3.bitField0_
            r0 = r1 & 8
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0022
            X.8Zz r1 = r3.contactMessage_
            if (r1 != 0) goto L_0x0015
            X.8Zz r1 = X.C164738Zz.DEFAULT_INSTANCE
        L_0x0015:
            int r0 = r1.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
        L_0x001d:
            if (r2 != 0) goto L_0x0021
            X.8cd r2 = X.C166278cd.DEFAULT_INSTANCE
        L_0x0021:
            return r2
        L_0x0022:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0035
            X.8cE r1 = r3.locationMessage_
            if (r1 != 0) goto L_0x002c
            X.8cE r1 = X.C166028cE.DEFAULT_INSTANCE
        L_0x002c:
            int r0 = r1.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x0035:
            int r0 = r3.bitField0_
            r4 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r4
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 == 0) goto L_0x004f
            X.8c8 r1 = r3.liveLocationMessage_
            if (r1 != 0) goto L_0x0046
            X.8c8 r1 = X.C165968c8.DEFAULT_INSTANCE
        L_0x0046:
            int r0 = r1.bitField0_
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x004f:
            r0 = r1 & 32
            if (r0 != 0) goto L_0x02e0
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0066
            X.8cc r1 = r3.imageMessage_
            if (r1 != 0) goto L_0x005d
            X.8cc r1 = X.C166268cc.DEFAULT_INSTANCE
        L_0x005d:
            int r0 = r1.bitField0_
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x0066:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0079
            X.8cP r1 = r3.audioMessage_
            if (r1 != 0) goto L_0x0070
            X.8cP r1 = X.C166138cP.DEFAULT_INSTANCE
        L_0x0070:
            int r0 = r1.bitField0_
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x0079:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x008c
            X.8ca r1 = r3.videoMessage_
        L_0x007f:
            if (r1 != 0) goto L_0x0083
            X.8ca r1 = X.C166248ca.DEFAULT_INSTANCE
        L_0x0083:
            int r0 = r1.bitField0_
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x008c:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x009e
            X.8cW r1 = r3.documentMessage_
            if (r1 != 0) goto L_0x0096
            X.8cW r1 = X.C166208cW.DEFAULT_INSTANCE
        L_0x0096:
            int r0 = r1.bitField0_
            r0 = r0 & r4
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x009e:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x00b2
            X.8a0 r1 = r3.contactsArrayMessage_
            if (r1 != 0) goto L_0x00a8
            X.8a0 r1 = X.C164748a0.DEFAULT_INSTANCE
        L_0x00a8:
            int r0 = r1.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x00b2:
            int r4 = r3.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r4 = r4 & r0
            boolean r0 = X.AnonymousClass000.A1O(r4)
            if (r0 != 0) goto L_0x0106
            int r4 = r3.bitField2_
            r0 = r4 & 16
            if (r0 == 0) goto L_0x00d3
            X.8cY r1 = r3.stickerPackMessage_
            if (r1 != 0) goto L_0x00c9
            X.8cY r1 = X.C166228cY.DEFAULT_INSTANCE
        L_0x00c9:
            int r0 = r1.bitField0_
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x00d3:
            int r5 = r3.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r5 = r5 & r0
            boolean r0 = X.AnonymousClass000.A1O(r5)
            if (r0 == 0) goto L_0x0116
            X.8aI r1 = r3.sendPaymentMessage_
            if (r1 != 0) goto L_0x00e5
            X.8aI r1 = X.C164928aI.DEFAULT_INSTANCE
        L_0x00e5:
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0021
            X.8cr r3 = r1.noteMessage_
        L_0x00ed:
            if (r3 != 0) goto L_0x00f1
            X.8cr r3 = X.C166418cr.DEFAULT_INSTANCE
        L_0x00f1:
            int r0 = r3.bitField0_
            r0 = r0 & 32
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 != 0) goto L_0x02e0
            int r1 = r3.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            if (r0 == 0) goto L_0x0021
        L_0x0106:
            X.8cX r1 = r3.stickerMessage_
            if (r1 != 0) goto L_0x010c
            X.8cX r1 = X.C166218cX.DEFAULT_INSTANCE
        L_0x010c:
            int r0 = r1.bitField0_
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x0116:
            int r5 = r3.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r5 = r5 & r0
            boolean r0 = X.AnonymousClass000.A1O(r5)
            if (r0 == 0) goto L_0x0130
            X.8bp r1 = r3.requestPaymentMessage_
            if (r1 != 0) goto L_0x0127
            X.8bp r1 = X.C165828bp.DEFAULT_INSTANCE
        L_0x0127:
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0021
            X.8cr r3 = r1.noteMessage_
            goto L_0x00ed
        L_0x0130:
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0145
            X.8bb r1 = r3.productMessage_
            if (r1 != 0) goto L_0x013b
            X.8bb r1 = X.C165688bb.DEFAULT_INSTANCE
        L_0x013b:
            int r0 = r1.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x0145:
            r0 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x015a
            X.8bu r1 = r3.groupInviteMessage_
            if (r1 != 0) goto L_0x0150
            X.8bu r1 = X.C165878bu.DEFAULT_INSTANCE
        L_0x0150:
            int r0 = r1.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x015a:
            int r5 = r3.bitField1_
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0171
            X.8bZ r1 = r3.newsletterAdminInviteMessage_
            if (r1 != 0) goto L_0x0167
            X.8bZ r1 = X.C165668bZ.DEFAULT_INSTANCE
        L_0x0167:
            int r0 = r1.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x0171:
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0186
            X.8bK r1 = r3.templateButtonReplyMessage_
            if (r1 != 0) goto L_0x017c
            X.8bK r1 = X.AnonymousClass8bK.DEFAULT_INSTANCE
        L_0x017c:
            int r0 = r1.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x0186:
            r0 = r5 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0021
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x019f
            X.8cL r1 = r3.orderMessage_
            if (r1 != 0) goto L_0x0195
            X.8cL r1 = X.C166098cL.DEFAULT_INSTANCE
        L_0x0195:
            int r0 = r1.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x019f:
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x01b4
            X.8bJ r1 = r3.listResponseMessage_
            if (r1 != 0) goto L_0x01aa
            X.8bJ r1 = X.C165538bJ.DEFAULT_INSTANCE
        L_0x01aa:
            int r0 = r1.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x01b4:
            r0 = r5 & 1
            if (r0 == 0) goto L_0x01c8
            X.8bs r1 = r3.buttonsMessage_
            if (r1 != 0) goto L_0x01be
            X.8bs r1 = X.C165858bs.DEFAULT_INSTANCE
        L_0x01be:
            int r0 = r1.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x01c8:
            r0 = r5 & 2
            if (r0 == 0) goto L_0x01dc
            X.8b6 r1 = r3.buttonsResponseMessage_
            if (r1 != 0) goto L_0x01d2
            X.8b6 r1 = X.C165408b6.DEFAULT_INSTANCE
        L_0x01d2:
            int r0 = r1.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x01dc:
            int r1 = r3.bitField0_
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            if (r0 == 0) goto L_0x01f7
            X.8cl r1 = r3.listMessage_
            if (r1 != 0) goto L_0x01ed
            X.8cl r1 = X.C166358cl.DEFAULT_INSTANCE
        L_0x01ed:
            int r0 = r1.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x01f7:
            r0 = r5 & 8
            if (r0 == 0) goto L_0x020b
            X.8cp r1 = r3.interactiveMessage_
            if (r1 != 0) goto L_0x0201
            X.8cp r1 = X.C166398cp.DEFAULT_INSTANCE
        L_0x0201:
            int r0 = r1.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x020b:
            r0 = r5 & 64
            if (r0 == 0) goto L_0x021f
            X.8bx r1 = r3.pollCreationMessage_
        L_0x0211:
            if (r1 != 0) goto L_0x0215
            X.8bx r1 = X.C165908bx.DEFAULT_INSTANCE
        L_0x0215:
            int r0 = r1.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x021f:
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0228
            X.8bx r1 = r3.pollCreationMessageV2_
            goto L_0x0211
        L_0x0228:
            r0 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0230
            X.8bx r1 = r3.pollCreationMessageV3_
            goto L_0x0211
        L_0x0230:
            r0 = r5 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0244
            X.8Xo r1 = r3.requestPhoneNumberMessage_
            if (r1 != 0) goto L_0x023a
            X.8Xo r1 = X.C164108Xo.DEFAULT_INSTANCE
        L_0x023a:
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x0244:
            r0 = 2097152(0x200000, float:2.938736E-39)
            r5 = r5 & r0
            if (r5 == 0) goto L_0x024d
            X.8ca r1 = r3.ptvMessage_
            goto L_0x007f
        L_0x024d:
            r0 = r4 & 4
            if (r0 == 0) goto L_0x0261
            X.8al r1 = r3.albumMessage_
            if (r1 != 0) goto L_0x0257
            X.8al r1 = X.C165208al.DEFAULT_INSTANCE
        L_0x0257:
            int r0 = r1.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x0261:
            boolean r0 = r3.A0R()
            if (r0 == 0) goto L_0x0277
            X.8ck r1 = r3.templateMessage_
            if (r1 != 0) goto L_0x026d
            X.8ck r1 = X.C166348ck.DEFAULT_INSTANCE
        L_0x026d:
            int r0 = r1.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x0277:
            int r0 = r3.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r0 == 0) goto L_0x029d
            X.8cm r0 = r3.protocolMessage_
            r1 = r0
            if (r0 != 0) goto L_0x0288
            X.8cm r0 = X.C166368cm.DEFAULT_INSTANCE
        L_0x0288:
            int r0 = r0.bitField0_
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x029d
            if (r1 != 0) goto L_0x0292
            X.8cm r1 = X.C166368cm.DEFAULT_INSTANCE
        L_0x0292:
            X.8cr r0 = r1.editedMessage_
        L_0x0294:
            if (r0 != 0) goto L_0x0298
            X.8cr r0 = X.C166418cr.DEFAULT_INSTANCE
        L_0x0298:
            X.8cd r0 = A00(r6, r0)
            return r0
        L_0x029d:
            int r1 = r3.bitField1_
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            if (r0 == 0) goto L_0x02b8
            X.8c4 r1 = r3.eventMessage_
            if (r1 != 0) goto L_0x02ae
            X.8c4 r1 = X.AnonymousClass8c4.DEFAULT_INSTANCE
        L_0x02ae:
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x02b8:
            int r1 = r3.bitField1_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            if (r0 == 0) goto L_0x02cc
            X.8Xc r0 = r3.groupMentionedMessage_
            if (r0 != 0) goto L_0x02c9
            X.8Xc r0 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x02c9:
            X.8cr r0 = r0.message_
            goto L_0x0294
        L_0x02cc:
            r0 = r4 & 64
            if (r0 == 0) goto L_0x0021
            X.8aF r1 = r3.pollResultSnapshotMessage_
            if (r1 != 0) goto L_0x02d6
            X.8aF r1 = X.C164898aF.DEFAULT_INSTANCE
        L_0x02d6:
            int r0 = r1.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        L_0x02e0:
            X.8cb r1 = r3.extendedTextMessage_
            if (r1 != 0) goto L_0x02e6
            X.8cb r1 = X.C166258cb.DEFAULT_INSTANCE
        L_0x02e6:
            int r0 = r1.bitField0_
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0021
            X.8cd r2 = r1.contextInfo_
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0O.A00(X.0ve, X.8cr):X.8cd");
    }
}
