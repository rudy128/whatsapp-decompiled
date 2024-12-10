package X;

import android.text.TextUtils;

public class A79 {
    public final AnonymousClass11S A00;
    public final AnonymousClass11P A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;

    public static boolean A02(C29721cl r3, AnonymousClass206 r4) {
        if (r3 != null) {
            AnonymousClass1BI r1 = r4.A0v.A00;
            if (C22971Dz.A0d(r1) || C22971Dz.A0e(r1)) {
                return true;
            }
            if (C22971Dz.A0O(r1)) {
                return C446824j.A02(r4.A0D(), 4);
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r0.equals(r2) == false) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C166278cd A04(X.C19998A2m r10, X.AnonymousClass206 r11) {
        /*
            r9 = this;
            X.8cd r0 = X.C166278cd.DEFAULT_INSTANCE
            X.Bmt r3 = r0.A0N()
            X.8S3 r3 = (X.AnonymousClass8S3) r3
            X.206 r5 = r11.A0K()
            if (r5 == 0) goto L_0x00a5
            X.205 r0 = r11.A0v
            X.1BI r0 = r0.A00
            if (r0 == 0) goto L_0x001e
            X.205 r4 = r5.A0v
            X.1BI r2 = r4.A00
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0032
        L_0x001e:
            X.205 r4 = r5.A0v
            X.1BI r2 = r4.A00
            java.lang.String r6 = X.C22971Dz.A06(r2)
            X.8cd r1 = X.AnonymousClass8BW.A0L(r3, r6)
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.remoteJid_ = r6
        L_0x0032:
            boolean r0 = r5 instanceof X.AnonymousClass23W
            if (r0 != 0) goto L_0x0131
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x011e
            X.11S r0 = r9.A00
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass11S.A00(r0)
        L_0x0040:
            boolean r0 = r11.A0w()
            if (r0 == 0) goto L_0x0116
            boolean r0 = r5.A0w()
            if (r0 == 0) goto L_0x06ca
            java.lang.String r2 = r2.getRawString()
        L_0x0050:
            X.8cd r1 = X.AnonymousClass8BW.A0L(r3, r2)
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.participant_ = r2
        L_0x005c:
            java.lang.String r2 = r4.A01
            X.8cd r1 = X.AnonymousClass8BW.A0L(r3, r2)
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.stanzaId_ = r2
            X.Bm6 r0 = r3.A00
            X.8cd r0 = (X.C166278cd) r0
            X.8cr r0 = r0.quotedMessage_
            if (r0 != 0) goto L_0x0074
            X.8cr r0 = X.C166418cr.DEFAULT_INSTANCE
        L_0x0074:
            X.Bmt r2 = r0.A0O()
            X.8X8 r2 = (X.AnonymousClass8X8) r2
            X.9n5 r1 = X.C181349Qd.A00(r2)
            r0 = 1
            r1.A05 = r0
            boolean r0 = r10.A05
            r1.A03 = r0
            java.lang.Integer r0 = r10.A03
            r1.A01 = r0
            X.A2m r1 = r1.A00()
            X.00H r0 = r9.A03
            X.AnonymousClass8BV.A1B(r1, r5, r0)
            X.8cd r1 = X.AnonymousClass8BS.A0D(r3)
            X.8cr r0 = X.AnonymousClass8BR.A0e(r2)
            r0.getClass()
            r1.quotedMessage_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
        L_0x00a5:
            boolean r0 = r11.A0s()
            if (r0 == 0) goto L_0x0190
            java.util.List r0 = r11.A0h
            X.C17960vV.A07(r0)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r8 = r0.iterator()
        L_0x00bc:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0157
            java.lang.Object r7 = r8.next()
            X.3Bi r7 = (X.C70503Bi) r7
            X.1BI r1 = r7.A00
            boolean r0 = X.C22971Dz.A0M(r1)
            if (r0 == 0) goto L_0x00d9
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x00d9
            boolean r0 = r10.A08
            if (r0 != 0) goto L_0x00d9
            goto L_0x00bc
        L_0x00d9:
            boolean r0 = X.C22971Dz.A0d(r1)
            if (r0 == 0) goto L_0x00e3
            r6.add(r1)
            goto L_0x00bc
        L_0x00e3:
            X.8Yt r0 = X.C164418Yt.DEFAULT_INSTANCE
            X.Bmt r4 = r0.A0N()
            java.lang.String r2 = X.AnonymousClass8BS.A0d(r4, r1)
            X.Bm6 r1 = r4.A00
            X.8Yt r1 = (X.C164418Yt) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.groupJid_ = r2
            java.lang.String r2 = r7.A01
            if (r2 == 0) goto L_0x010e
            X.Bm6 r1 = X.C17880vN.A0G(r4)
            X.8Yt r1 = (X.C164418Yt) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.groupSubject_ = r2
        L_0x010e:
            X.Bm6 r0 = r4.A0C()
            r5.add(r0)
            goto L_0x00bc
        L_0x0116:
            if (r1 == 0) goto L_0x005c
            java.lang.String r2 = r1.getRawString()
            goto L_0x0050
        L_0x011e:
            X.1BI r1 = r5.A0H()
            if (r1 == 0) goto L_0x012a
            boolean r0 = X.C22971Dz.A0N(r1)
            if (r0 == 0) goto L_0x012b
        L_0x012a:
            r1 = r2
        L_0x012b:
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A00(r1)
            goto L_0x0040
        L_0x0131:
            X.23W r5 = (X.AnonymousClass23W) r5
            java.lang.String r4 = r5.A00
            if (r4 == 0) goto L_0x0144
            X.8cd r2 = X.AnonymousClass8BS.A0D(r3)
            int r1 = r2.bitField0_
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.groupSubject_ = r4
        L_0x0144:
            java.lang.String r4 = r5.A01
            if (r4 == 0) goto L_0x00a5
            X.8cd r2 = X.AnonymousClass8BS.A0D(r3)
            int r1 = r2.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.parentGroupJid_ = r4
            goto L_0x00a5
        L_0x0157:
            X.C17960vV.A07(r6)
            java.util.ArrayList r4 = X.C22971Dz.A0B(r6)
            X.8cd r2 = X.AnonymousClass8BS.A0D(r3)
            X.EE9 r1 = r2.mentionedJid_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0171
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r2.mentionedJid_ = r1
        L_0x0171:
            X.DND.A09(r4, r1)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0190
            X.8cd r2 = X.AnonymousClass8BS.A0D(r3)
            X.EE9 r1 = r2.groupMentions_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x018d
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r2.groupMentions_ = r1
        L_0x018d:
            X.DND.A09(r5, r1)
        L_0x0190:
            int r1 = r11.A09
            r0 = 23
            if (r1 != r0) goto L_0x01a6
            X.9Jb r0 = X.AnonymousClass9Jb.RESHARED_FROM_MENTION
            X.8cd r1 = X.AnonymousClass8BS.A0D(r3)
            int r0 = r0.value
            r1.statusAttributionType_ = r0
            int r0 = r1.bitField1_
            r0 = r0 | 8
            r1.bitField1_ = r0
        L_0x01a6:
            X.36j r0 = X.C63672tV.A02(r11)
            r2 = 1
            if (r0 == 0) goto L_0x01e4
            X.36j r0 = X.C63672tV.A02(r11)
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x01e4
            X.Bm6 r0 = r3.A00
            X.8cd r0 = (X.C166278cd) r0
            X.8Yq r0 = r0.featureEligibilities_
            if (r0 != 0) goto L_0x01bf
            X.8Yq r0 = X.C164388Yq.DEFAULT_INSTANCE
        L_0x01bf:
            X.Bmt r4 = X.AnonymousClass8BS.A07(r0)
            X.Bm6 r1 = r4.A00
            X.8Yq r1 = (X.C164388Yq) r1
            int r0 = X.C164388Yq.CANNOT_BE_RANKED_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.cannotBeReactedTo_ = r2
            X.Bm6 r0 = r4.A0C()
            X.8Yq r0 = (X.C164388Yq) r0
            X.8cd r4 = X.AnonymousClass8BW.A0L(r3, r0)
            r4.featureEligibilities_ = r0
            int r1 = r4.bitField0_
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = r1 | r0
            r4.bitField0_ = r1
        L_0x01e4:
            X.36j r0 = X.C63672tV.A02(r11)
            if (r0 == 0) goto L_0x0221
            X.36j r0 = X.C63672tV.A02(r11)
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0221
            X.Bm6 r0 = r3.A00
            X.8cd r0 = (X.C166278cd) r0
            X.8Yq r0 = r0.featureEligibilities_
            if (r0 != 0) goto L_0x01fc
            X.8Yq r0 = X.C164388Yq.DEFAULT_INSTANCE
        L_0x01fc:
            X.Bmt r4 = X.AnonymousClass8BS.A07(r0)
            X.Bm6 r1 = r4.A00
            X.8Yq r1 = (X.C164388Yq) r1
            int r0 = X.C164388Yq.CANNOT_BE_RANKED_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.cannotBeRanked_ = r2
            X.Bm6 r0 = r4.A0C()
            X.8Yq r0 = (X.C164388Yq) r0
            X.8cd r4 = X.AnonymousClass8BW.A0L(r3, r0)
            r4.featureEligibilities_ = r0
            int r1 = r4.bitField0_
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = r1 | r0
            r4.bitField0_ = r1
        L_0x0221:
            r0 = 1
            boolean r0 = r11.A11(r0)
            if (r0 == 0) goto L_0x031f
            X.8cd r1 = X.AnonymousClass8BS.A0D(r3)
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.isForwarded_ = r2
            int r4 = r11.A06
            X.8cd r1 = X.AnonymousClass8BS.A0D(r3)
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.forwardingScore_ = r4
            X.Ac1 r4 = X.AnonymousClass9RY.A00(r11)
            if (r4 == 0) goto L_0x02d5
            X.Bm6 r0 = r3.A00
            X.8cd r0 = (X.C166278cd) r0
            X.8bG r0 = r0.forwardedNewsletterMessageInfo_
            if (r0 != 0) goto L_0x0253
            X.8bG r0 = X.C165508bG.DEFAULT_INSTANCE
        L_0x0253:
            X.Bmt r5 = r0.A0O()
            X.1ch r0 = r4.A01
            java.lang.String r6 = X.AnonymousClass8BS.A0d(r5, r0)
            X.Bm6 r1 = r5.A00
            X.8bG r1 = (X.C165508bG) r1
            int r0 = X.C165508bG.ACCESSIBILITY_TEXT_FIELD_NUMBER
            r6.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.newsletterJid_ = r6
            int r6 = r4.A00
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.8bG r1 = (X.C165508bG) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.serverMessageId_ = r6
            java.lang.String r6 = r4.A04
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.8bG r1 = (X.C165508bG) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.newsletterName_ = r6
            X.9Id r0 = r4.A02
            if (r0 == 0) goto L_0x02b0
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0367
            if (r1 == r2) goto L_0x0363
            r0 = 2
            if (r1 != r0) goto L_0x06c5
            X.9Jp r0 = X.C179709Jp.LINK_CARD
        L_0x02a0:
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.8bG r1 = (X.C165508bG) r1
            int r0 = r0.value
            r1.contentType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
        L_0x02b0:
            java.lang.String r4 = r4.A03
            if (r4 == 0) goto L_0x02c2
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.8bG r1 = (X.C165508bG) r1
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.accessibilityText_ = r4
        L_0x02c2:
            X.Bm6 r0 = r5.A0C()
            X.8bG r0 = (X.C165508bG) r0
            X.8cd r4 = X.AnonymousClass8BW.A0L(r3, r0)
            r4.forwardedNewsletterMessageInfo_ = r0
            int r1 = r4.bitField0_
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r0
            r4.bitField0_ = r1
        L_0x02d5:
            X.0ve r4 = r9.A02
            r1 = 4513(0x11a1, float:6.324E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x031f
            X.36g r1 = X.AnonymousClass2UY.A00(r11)
            if (r1 == 0) goto L_0x031f
            X.Bm6 r0 = r3.A00
            X.8cd r0 = (X.C166278cd) r0
            X.8XW r0 = r0.businessMessageForwardInfo_
            if (r0 != 0) goto L_0x02f1
            X.8XW r0 = X.AnonymousClass8XW.DEFAULT_INSTANCE
        L_0x02f1:
            X.Bmt r5 = r0.A0O()
            com.whatsapp.jid.UserJid r0 = r1.A01
            java.lang.String r4 = X.AnonymousClass8BS.A0d(r5, r0)
            X.Bm6 r1 = r5.A00
            X.8XW r1 = (X.AnonymousClass8XW) r1
            int r0 = X.AnonymousClass8XW.BUSINESS_OWNER_JID_FIELD_NUMBER
            r4.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.businessOwnerJid_ = r4
            X.Bm6 r0 = r5.A0C()
            X.8XW r0 = (X.AnonymousClass8XW) r0
            X.8cd r4 = X.AnonymousClass8BW.A0L(r3, r0)
            r4.businessMessageForwardInfo_ = r0
            int r1 = r4.bitField0_
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 | r0
            r4.bitField0_ = r1
        L_0x031f:
            r0 = 262144(0x40000, double:1.295163E-318)
            boolean r0 = r11.A11(r0)
            if (r0 == 0) goto L_0x0335
            X.8cd r4 = X.AnonymousClass8BS.A0D(r3)
            int r1 = r4.bitField0_
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 | r0
            r4.bitField0_ = r1
            r4.isSampled_ = r2
        L_0x0335:
            java.lang.Class<X.Abs> r0 = X.C20938Abs.class
            r11.A0M(r0)
            boolean r0 = r11.A0k
            if (r0 != 0) goto L_0x0347
            r0 = 1073741824(0x40000000, double:5.304989477E-315)
            boolean r0 = r11.A11(r0)
            if (r0 == 0) goto L_0x0354
        L_0x0347:
            X.8cd r4 = X.AnonymousClass8BS.A0D(r3)
            int r1 = r4.bitField0_
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 | r0
            r4.bitField0_ = r1
            r4.alwaysShowAdAttribution_ = r2
        L_0x0354:
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x037c
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x037c
            goto L_0x036b
        L_0x0363:
            X.9Jp r0 = X.C179709Jp.UPDATE_CARD
            goto L_0x02a0
        L_0x0367:
            X.9Jp r0 = X.C179709Jp.UPDATE
            goto L_0x02a0
        L_0x036b:
            java.lang.String r0 = X.C19620yd.A0B     // Catch:{ UnsupportedEncodingException -> 0x0376 }
            X.DSQ r0 = X.DSQ.A00     // Catch:{ UnsupportedEncodingException -> 0x0376 }
            java.lang.String r0 = "getBytes"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)     // Catch:{ UnsupportedEncodingException -> 0x0376 }
            throw r0     // Catch:{ UnsupportedEncodingException -> 0x0376 }
        L_0x0376:
            r1 = move-exception
            java.lang.String r0 = "FMessageProtocolSerializers/buildOutgoingMessageContextInfo/error Failed to parse conversion data, exception="
            com.whatsapp.util.Log.e(r0, r1)
        L_0x037c:
            X.Abw r0 = X.AnonymousClass2UZ.A00(r11)
            if (r0 == 0) goto L_0x03a4
            X.Abw r0 = X.AnonymousClass2UZ.A00(r11)
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x03a4
            X.Abw r7 = X.AnonymousClass2UZ.A00(r11)
            X.C17960vV.A07(r7)
            long r0 = java.lang.System.currentTimeMillis()
            X.0ve r6 = r9.A02
            r5 = 11035(0x2b1b, float:1.5463E-41)
            X.0vf r4 = X.C18040vf.A02
            boolean r4 = X.C18020vd.A05(r4, r6, r5)
            r7.A00(r3, r0, r4)
        L_0x03a4:
            java.lang.String r0 = r11.A0d
            boolean r0 = X.AnonymousClass8BR.A1S(r0)
            if (r0 == 0) goto L_0x0417
            java.lang.String r0 = r11.A0d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x03c4
            java.lang.String r5 = r11.A0d
            X.8cd r4 = X.AnonymousClass8BW.A0L(r3, r5)
            int r1 = r4.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r0
            r4.bitField0_ = r1
            r4.entryPointConversionSource_ = r5
        L_0x03c4:
            java.lang.String r0 = r11.A0a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x03db
            java.lang.String r5 = r11.A0a
            X.8cd r4 = X.AnonymousClass8BW.A0L(r3, r5)
            int r1 = r4.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r4.bitField0_ = r1
            r4.entryPointConversionApp_ = r5
        L_0x03db:
            int r5 = r11.A03
            X.8cd r4 = X.AnonymousClass8BS.A0D(r3)
            int r1 = r4.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r0
            r4.bitField0_ = r1
            r4.entryPointConversionDelaySeconds_ = r5
            java.lang.String r0 = r11.A0c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0401
            java.lang.String r5 = r11.A0c
            X.8cd r4 = X.AnonymousClass8BW.A0L(r3, r5)
            int r1 = r4.bitField0_
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r4.bitField0_ = r1
            r4.entryPointConversionExternalSource_ = r5
        L_0x0401:
            java.lang.String r0 = r11.A0b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0417
            java.lang.String r4 = r11.A0b
            X.8cd r1 = X.AnonymousClass8BW.A0L(r3, r4)
            int r0 = r1.bitField1_
            r0 = r0 | 1
            r1.bitField1_ = r0
            r1.entryPointConversionExternalMedium_ = r4
        L_0x0417:
            X.1cl r7 = r10.A02
            boolean r0 = A02(r7, r11)
            if (r0 == 0) goto L_0x048e
            X.C17960vV.A07(r7)
            int r4 = r7.expiration
            X.8cd r1 = X.AnonymousClass8BS.A0D(r3)
            int r0 = r1.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField0_ = r0
            r1.expiration_ = r4
            long r0 = r7.ephemeralSettingTimestamp
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0448
            long r0 = X.C17880vN.A04(r0)
            X.8cd r5 = X.AnonymousClass8BS.A0D(r3)
            int r4 = r5.bitField0_
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            r5.bitField0_ = r4
            r5.ephemeralSettingTimestamp_ = r0
        L_0x0448:
            int r1 = r7.disappearingMessagesInitiator
            if (r1 != 0) goto L_0x06b5
            X.9K8 r1 = X.AnonymousClass9K8.CHANGED_IN_CHAT
        L_0x044e:
            X.8ci r0 = X.C166328ci.DEFAULT_INSTANCE
            X.Bmt r4 = r0.A0N()
            X.8Wz r4 = (X.C163958Wz) r4
            if (r1 == 0) goto L_0x045b
            r4.A0G(r1)
        L_0x045b:
            X.0ve r2 = r9.A02
            r1 = 5309(0x14bd, float:7.44E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x047b
            int r0 = r11.A04
            X.9KQ r0 = X.C196849vk.A01(r0)
            r4.A0H(r0)
            java.lang.Boolean r0 = r11.A0Q
            if (r0 == 0) goto L_0x047b
            boolean r0 = r0.booleanValue()
            r4.A0I(r0)
        L_0x047b:
            X.Bm6 r0 = r4.A0C()
            X.8ci r0 = (X.C166328ci) r0
            X.8cd r2 = X.AnonymousClass8BW.A0L(r3, r0)
            r2.disappearingMode_ = r0
            int r1 = r2.bitField0_
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r2.bitField0_ = r1
        L_0x048e:
            byte[] r1 = r10.A0G
            if (r1 == 0) goto L_0x04af
            X.205 r0 = r11.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C22971Dz.A0O(r0)
            if (r0 == 0) goto L_0x04af
            X.C17960vV.A07(r1)
            X.BmB r2 = X.C17900vP.A03(r3, r1)
            X.Bm6 r1 = r3.A00
            X.8cd r1 = (X.C166278cd) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            r1.ephemeralSharedSecret_ = r2
        L_0x04af:
            X.Abv r0 = X.C60532oB.A00(r11)
            if (r0 == 0) goto L_0x06a7
            X.Abv r6 = X.C60532oB.A00(r11)
            X.Bm6 r0 = r3.A00
            X.8cd r0 = (X.C166278cd) r0
            X.8cZ r0 = r0.externalAdReply_
            if (r0 != 0) goto L_0x04c3
            X.8cZ r0 = X.C166238cZ.DEFAULT_INSTANCE
        L_0x04c3:
            X.Bmt r5 = r0.A0O()
            java.lang.String r2 = r6.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x04e2
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.8cZ r1 = (X.C166238cZ) r1
            int r0 = X.C166238cZ.AD_CONTEXT_PREVIEW_DISMISSED_FIELD_NUMBER
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.title_ = r2
        L_0x04e2:
            java.lang.String r2 = r6.A04
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x04fd
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.8cZ r1 = (X.C166238cZ) r1
            int r0 = X.C166238cZ.AD_CONTEXT_PREVIEW_DISMISSED_FIELD_NUMBER
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.body_ = r2
        L_0x04fd:
            X.9Jo r2 = X.AnonymousClass9Jo.NONE
            int r1 = r6.A02
            r0 = 1
            if (r1 != r0) goto L_0x06ae
            X.9Jo r2 = X.AnonymousClass9Jo.IMAGE
        L_0x0506:
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.8cZ r1 = (X.C166238cZ) r1
            int r0 = X.C166238cZ.AD_CONTEXT_PREVIEW_DISMISSED_FIELD_NUMBER
            int r0 = r2.value
            r1.mediaType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            java.lang.String r2 = r6.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x052c
            X.8cZ r1 = A00(r5, r2)
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.thumbnailUrl_ = r2
        L_0x052c:
            java.lang.String r2 = r6.A08
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0540
            X.8cZ r1 = A00(r5, r2)
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.mediaUrl_ = r2
        L_0x0540:
            byte[] r0 = r6.A0N
            if (r0 == 0) goto L_0x0554
            X.BmB r2 = X.C17900vP.A03(r5, r0)
            X.Bm6 r1 = r5.A00
            X.8cZ r1 = (X.C166238cZ) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.thumbnail_ = r2
        L_0x0554:
            java.lang.String r2 = r6.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0568
            X.8cZ r1 = A00(r5, r2)
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.sourceId_ = r2
        L_0x0568:
            java.lang.String r2 = r6.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x057c
            X.8cZ r1 = A00(r5, r2)
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.sourceType_ = r2
        L_0x057c:
            java.lang.String r2 = r6.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0590
            X.8cZ r1 = A00(r5, r2)
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.sourceUrl_ = r2
        L_0x0590:
            java.lang.String r2 = r6.A06
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x05a4
            X.8cZ r1 = A00(r5, r2)
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
            r1.ctwaClid_ = r2
        L_0x05a4:
            java.lang.String r2 = r6.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x05b8
            X.8cZ r1 = A00(r5, r2)
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            r1.ref_ = r2
        L_0x05b8:
            boolean r2 = r6.A0L
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.8cZ r1 = (X.C166238cZ) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
            r1.renderLargerThumbnail_ = r2
            boolean r2 = r6.A0M
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.8cZ r1 = (X.C166238cZ) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField0_ = r0
            r1.showAdAttribution_ = r2
            boolean r2 = r6.A0J
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.8cZ r1 = (X.C166238cZ) r1
            int r0 = r1.bitField0_
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.bitField0_ = r0
            r1.clickToWhatsappCall_ = r2
            boolean r2 = r6.A0K
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.8cZ r1 = (X.C166238cZ) r1
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            r1.containsAutoReply_ = r2
            boolean r4 = r6.A0H
            X.Bm6 r2 = X.C17880vN.A0G(r5)
            X.8cZ r2 = (X.C166238cZ) r2
            int r1 = r2.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.adContextPreviewDismissed_ = r4
            java.lang.String r4 = r6.A0B
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x061f
            X.8cZ r2 = A00(r5, r4)
            int r1 = r2.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.sourceApp_ = r4
        L_0x061f:
            boolean r4 = r6.A00
            X.Bm6 r2 = X.C17880vN.A0G(r5)
            X.8cZ r2 = (X.C166238cZ) r2
            int r1 = r2.bitField0_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.automatedGreetingMessageShown_ = r4
            java.lang.String r4 = r6.A07
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0645
            X.8cZ r2 = A00(r5, r4)
            int r1 = r2.bitField0_
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.greetingMessageBody_ = r4
        L_0x0645:
            java.lang.String r4 = r6.A05
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x065a
            X.8cZ r2 = A00(r5, r4)
            int r1 = r2.bitField0_
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.ctaPayload_ = r4
        L_0x065a:
            boolean r4 = r6.A0I
            X.Bm6 r2 = X.C17880vN.A0G(r5)
            X.8cZ r2 = (X.C166238cZ) r2
            int r1 = r2.bitField0_
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.disableNudge_ = r4
            java.lang.String r4 = r6.A09
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0680
            X.8cZ r2 = A00(r5, r4)
            int r1 = r2.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.originalImageUrl_ = r4
        L_0x0680:
            java.lang.String r4 = r6.A03
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0695
            X.8cZ r2 = A00(r5, r4)
            int r1 = r2.bitField0_
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.automatedGreetingMessageCtaType_ = r4
        L_0x0695:
            X.Bm6 r0 = r5.A0C()
            X.8cZ r0 = (X.C166238cZ) r0
            X.8cd r1 = X.AnonymousClass8BW.A0L(r3, r0)
            r1.externalAdReply_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.bitField0_ = r0
        L_0x06a7:
            X.Bm6 r0 = r3.A0C()
            X.8cd r0 = (X.C166278cd) r0
            return r0
        L_0x06ae:
            r0 = 2
            if (r1 != r0) goto L_0x0506
            X.9Jo r2 = X.AnonymousClass9Jo.VIDEO
            goto L_0x0506
        L_0x06b5:
            if (r1 != r2) goto L_0x06bb
            X.9K8 r1 = X.AnonymousClass9K8.INITIATED_BY_ME
            goto L_0x044e
        L_0x06bb:
            r0 = 2
            if (r1 != r0) goto L_0x06c2
            X.9K8 r1 = X.AnonymousClass9K8.INITIATED_BY_OTHER
            goto L_0x044e
        L_0x06c2:
            r1 = 0
            goto L_0x044e
        L_0x06c5:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x06ca:
            r0 = 0
            X.1T8 r0 = X.AnonymousClass8BW.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A79.A04(X.A2m, X.206):X.8cd");
    }

    public A79(AnonymousClass11S r1, AnonymousClass11P r2, C18030ve r3, AnonymousClass00H r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }

    public static C166238cZ A00(C23624Bmt bmt, Object obj) {
        bmt.A0E();
        C166238cZ r0 = (C166238cZ) bmt.A00;
        obj.getClass();
        return r0;
    }

    public static C166278cd A01(C23624Bmt bmt, A79 a79, C19998A2m a2m, AnonymousClass206 r4) {
        C166278cd A04 = a79.A04(a2m, r4);
        bmt.A0E();
        return A04;
    }

    public static boolean A03(C29721cl r2, AnonymousClass206 r3, byte[] bArr) {
        if (r3.A0K() != null || r3.A11(1024) || r3.A11(1) || r3.A11(262144)) {
            return true;
        }
        if ((!TextUtils.isEmpty((CharSequence) null) && !TextUtils.isEmpty((CharSequence) null)) || AnonymousClass8BR.A1S(r3.A0d) || r3.A0s() || A02(r2, r3)) {
            return true;
        }
        if (bArr != null && C22971Dz.A0O(r3.A0v.A00)) {
            return true;
        }
        if (AnonymousClass2UZ.A00(r3) != null && AnonymousClass2UZ.A00(r3).A01()) {
            return true;
        }
        if (C63672tV.A02(r3) != null && C63672tV.A02(r3).A07) {
            return true;
        }
        if (C63672tV.A02(r3) == null || !C63672tV.A02(r3).A06) {
            return false;
        }
        return true;
    }
}
