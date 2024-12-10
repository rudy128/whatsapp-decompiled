package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.A8t  reason: case insensitive filesystem */
public abstract class C20133A8t {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A04(X.C166248ca r4) {
        /*
            int r1 = r4.bitField0_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            r3 = 0
            if (r0 == 0) goto L_0x002d
            int r1 = r4.gifAttribution_
            if (r1 == 0) goto L_0x0031
            r0 = 1
            if (r1 == r0) goto L_0x002e
            r0 = 2
            if (r1 != r0) goto L_0x0031
            X.9Jz r2 = X.C179809Jz.TENOR
        L_0x0018:
            int r1 = r2.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0034
            r0 = 2
            if (r1 == r0) goto L_0x0034
            if (r1 == r3) goto L_0x002d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageUtil/getGifAttribution/error: Unexpected gif attribution="
            X.C17900vP.A0X(r2, r0, r1)
        L_0x002d:
            return r3
        L_0x002e:
            X.9Jz r2 = X.C179809Jz.GIPHY
            goto L_0x0018
        L_0x0031:
            X.9Jz r2 = X.C179809Jz.NONE
            goto L_0x0018
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20133A8t.A04(X.8ca):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.whatsapp.SerializablePoint[]} */
    /* JADX WARNING: type inference failed for: r0v5, types: [com.whatsapp.InteractiveAnnotation, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v1, types: [com.whatsapp.SerializableLocation, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v20, types: [com.whatsapp.InteractiveAnnotation, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v21, types: [com.whatsapp.InteractiveAnnotation, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v27, types: [com.whatsapp.SerializablePoint, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.InteractiveAnnotation A06(X.C165618bU r13) {
        /*
            X.EE9 r0 = r13.polygonVertices_
            int r0 = r0.size()
            com.whatsapp.SerializablePoint[] r5 = new com.whatsapp.SerializablePoint[r0]
            r6 = 0
        L_0x0009:
            X.EE9 r0 = r13.polygonVertices_
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x003b
            X.EE9 r0 = r13.polygonVertices_
            java.lang.Object r2 = r0.get(r6)
            X.8as r2 = (X.C165278as) r2
            int r1 = r2.bitField0_
            r0 = r1 & 1
            if (r0 != 0) goto L_0x0035
            r0 = r1 & 2
            if (r0 != 0) goto L_0x0035
            double r3 = r2.x_
            double r1 = r2.y_
            com.whatsapp.SerializablePoint r0 = new com.whatsapp.SerializablePoint
            r0.<init>()
            r0.x = r3
            r0.y = r1
            r5[r6] = r0
            int r6 = r6 + 1
            goto L_0x0009
        L_0x0035:
            java.lang.String r0 = "MessageUtils/buildE2eMessage/info contains deprecated point"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = 0
        L_0x003b:
            r0 = 0
            if (r5 == 0) goto L_0x00b6
            int r4 = r13.actionCase_
            if (r4 == 0) goto L_0x00e1
            r1 = 2
            if (r4 == r1) goto L_0x00dd
            r1 = 3
            if (r4 == r1) goto L_0x00d9
            r1 = 6
            if (r4 == r1) goto L_0x00d5
            r1 = 7
            if (r4 == r1) goto L_0x00d1
            r1 = 0
        L_0x004f:
            boolean r3 = r13.shouldSkipConfirmation_
            int r2 = r1.intValue()
            r1 = 0
            if (r2 == r1) goto L_0x0114
            r6 = 1
            if (r2 == r6) goto L_0x00ba
            r1 = 2
            if (r2 != r1) goto L_0x00fe
            int r1 = r13.bitField0_
            r1 = r1 & 32
            if (r1 == 0) goto L_0x00fe
            X.8Yr r1 = r13.embeddedContent_
            r6 = r1
            if (r1 != 0) goto L_0x006b
            X.8Yr r1 = X.C164398Yr.DEFAULT_INSTANCE
        L_0x006b:
            int r1 = r1.contentCase_
            r2 = 2
            if (r1 != r2) goto L_0x00e5
            if (r6 != 0) goto L_0x0074
            X.8Yr r6 = X.C164398Yr.DEFAULT_INSTANCE
        L_0x0074:
            int r1 = r6.contentCase_
            if (r1 != r2) goto L_0x00b7
            java.lang.Object r2 = r6.content_
            X.8cB r2 = (X.C165998cB) r2
        L_0x007c:
            r1 = 0
            X.C18070vi.A0d(r2, r1)
            java.lang.String r3 = r2.musicContentMediaId_
            java.lang.String r4 = r2.songId_
            java.lang.String r5 = r2.author_
            java.lang.String r6 = r2.title_
            java.lang.String r7 = r2.artworkDirectPath_
            X.DSQ r1 = r2.artworkSha256_
            byte[] r9 = r1.A06()
            X.DSQ r1 = r2.artworkEncSha256_
            byte[] r10 = r1.A06()
            X.DSQ r1 = r2.artworkMediaKey_
            byte[] r11 = r1.A06()
            java.lang.String r8 = r2.artistAttribution_
            X.DSQ r1 = r2.countryBlocklist_
            byte[] r12 = r1.A06()
            boolean r13 = r2.isExplicit_
            X.77U r2 = new X.77U
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = r2.A00()
            if (r1 == 0) goto L_0x00b6
            com.whatsapp.InteractiveAnnotation r0 = new com.whatsapp.InteractiveAnnotation
            r0.<init>(r2)
        L_0x00b6:
            return r0
        L_0x00b7:
            X.8cB r2 = X.C165998cB.DEFAULT_INSTANCE
            goto L_0x007c
        L_0x00ba:
            r1 = 3
            if (r4 != r1) goto L_0x00b6
            java.lang.Object r4 = r13.action_
            X.8bG r4 = (X.C165508bG) r4
            java.lang.String r2 = r4.newsletterJid_
            X.25J r1 = X.C29681ch.A03
            X.1ch r9 = r1.A01(r2)
            if (r9 != 0) goto L_0x0130
            java.lang.String r1 = "MessageUtils/getForwardedNewsletterMessageInfo/error invalid newsletter jid"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            return r0
        L_0x00d1:
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            goto L_0x004f
        L_0x00d5:
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            goto L_0x004f
        L_0x00d9:
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            goto L_0x004f
        L_0x00dd:
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            goto L_0x004f
        L_0x00e1:
            java.lang.Integer r1 = X.AnonymousClass00R.A0Y
            goto L_0x004f
        L_0x00e5:
            if (r6 != 0) goto L_0x00e9
            X.8Yr r6 = X.C164398Yr.DEFAULT_INSTANCE
        L_0x00e9:
            X.97L r4 = new X.97L
            r4.<init>(r6)
            com.whatsapp.InteractiveAnnotation r0 = new com.whatsapp.InteractiveAnnotation
            r0.<init>()
            r1 = -1
            r0.interactiveAnnotationId = r1
            r0.polygonVertices = r5
            r0.skipConfirmation = r3
            r0.data = r4
            return r0
        L_0x00fe:
            byte[] r3 = r13.A0M()
            r1 = -1
            com.whatsapp.InteractiveAnnotation r0 = new com.whatsapp.InteractiveAnnotation
            r0.<init>()
            r0.interactiveAnnotationId = r1
            r0.polygonVertices = r5
            r0.data = r3
            X.2Qq r1 = X.C49482Qq.FUTURE_PROOF
            r0.type = r1
            return r0
        L_0x0114:
            r0 = 2
            if (r4 != r0) goto L_0x012d
            java.lang.Object r0 = r13.action_
            X.8Zx r0 = (X.C164718Zx) r0
        L_0x011b:
            double r6 = r0.degreesLatitude_
            double r1 = r0.degreesLongitude_
            java.lang.String r0 = r0.name_
            com.whatsapp.SerializableLocation r8 = new com.whatsapp.SerializableLocation
            r8.<init>()
            r8.latitude = r6
            r8.longitude = r1
            r8.name = r0
            goto L_0x0151
        L_0x012d:
            X.8Zx r0 = X.C164718Zx.DEFAULT_INSTANCE
            goto L_0x011b
        L_0x0130:
            int r13 = r4.serverMessageId_
            java.lang.String r11 = r4.newsletterName_
            int r1 = r4.contentType_
            if (r1 == r6) goto L_0x0164
            r0 = 2
            if (r1 == r0) goto L_0x0161
            r0 = 3
            if (r1 != r0) goto L_0x0164
            X.9Jp r0 = X.C179709Jp.LINK_CARD
        L_0x0140:
            int r0 = r0.value
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.9Id r10 = X.AnonymousClass9RX.A00(r0)
            java.lang.String r12 = r4.accessibilityText_
            X.Ac1 r8 = new X.Ac1
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x0151:
            com.whatsapp.InteractiveAnnotation r0 = new com.whatsapp.InteractiveAnnotation
            r0.<init>()
            r1 = -1
            r0.interactiveAnnotationId = r1
            r0.polygonVertices = r5
            r0.skipConfirmation = r3
            r0.data = r8
            return r0
        L_0x0161:
            X.9Jp r0 = X.C179709Jp.UPDATE_CARD
            goto L_0x0140
        L_0x0164:
            X.9Jp r0 = X.C179709Jp.UPDATE
            goto L_0x0140
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20133A8t.A06(X.8bU):com.whatsapp.InteractiveAnnotation");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02ad, code lost:
        if (r0 != null) goto L_0x017b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A07(X.C62572rc r12) {
        /*
            com.whatsapp.InteractiveAnnotation[] r7 = r12.A0b
            if (r7 == 0) goto L_0x02b6
            int r6 = r7.length
            if (r6 == 0) goto L_0x02b6
            java.util.ArrayList r5 = X.C17880vN.A0z(r6)
            r4 = 0
        L_0x000c:
            r8 = r7[r4]
            X.8bU r0 = X.C165618bU.DEFAULT_INSTANCE
            X.Bmt r3 = r0.A0N()
            r10 = 0
        L_0x0015:
            com.whatsapp.SerializablePoint[] r1 = r8.polygonVertices
            int r0 = r1.length
            if (r10 >= r0) goto L_0x006c
            r0 = r1[r10]
            if (r0 == 0) goto L_0x0069
            X.8as r0 = X.C165278as.DEFAULT_INSTANCE
            X.Bmt r11 = r0.A0N()
            com.whatsapp.SerializablePoint[] r0 = r8.polygonVertices
            r0 = r0[r10]
            double r0 = r0.x
            X.Bm6 r9 = X.C17880vN.A0G(r11)
            X.8as r9 = (X.C165278as) r9
            int r2 = r9.bitField0_
            r2 = r2 | 4
            r9.bitField0_ = r2
            r9.x_ = r0
            com.whatsapp.SerializablePoint[] r0 = r8.polygonVertices
            r0 = r0[r10]
            double r0 = r0.y
            X.Bm6 r9 = X.C17880vN.A0G(r11)
            X.8as r9 = (X.C165278as) r9
            int r2 = r9.bitField0_
            r2 = r2 | 8
            r9.bitField0_ = r2
            r9.y_ = r0
            X.Bm6 r9 = X.AnonymousClass8BS.A09(r11, r3)
            X.Bm6 r2 = r3.A00
            X.8bU r2 = (X.C165618bU) r2
            r9.getClass()
            X.EE9 r1 = r2.polygonVertices_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0066
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r2.polygonVertices_ = r1
        L_0x0066:
            r1.add(r9)
        L_0x0069:
            int r10 = r10 + 1
            goto L_0x0015
        L_0x006c:
            boolean r0 = r8.skipConfirmation
            if (r0 == 0) goto L_0x007f
            X.Bm6 r2 = X.C17880vN.A0G(r3)
            X.8bU r2 = (X.C165618bU) r2
            r1 = 1
            int r0 = r2.bitField0_
            r0 = r0 | 16
            r2.bitField0_ = r0
            r2.shouldSkipConfirmation_ = r1
        L_0x007f:
            java.lang.Object r9 = r8.data
            boolean r0 = r9 instanceof com.whatsapp.SerializableLocation
            if (r0 == 0) goto L_0x00de
            com.whatsapp.SerializableLocation r9 = (com.whatsapp.SerializableLocation) r9
            X.8Zx r0 = X.C164718Zx.DEFAULT_INSTANCE
            X.Bmt r10 = r0.A0N()
            double r0 = r9.latitude
            X.Bm6 r8 = X.C17880vN.A0G(r10)
            X.8Zx r8 = (X.C164718Zx) r8
            int r2 = r8.bitField0_
            r2 = r2 | 1
            r8.bitField0_ = r2
            r8.degreesLatitude_ = r0
            double r0 = r9.longitude
            X.Bm6 r8 = X.C17880vN.A0G(r10)
            X.8Zx r8 = (X.C164718Zx) r8
            int r2 = r8.bitField0_
            r2 = r2 | 2
            r8.bitField0_ = r2
            r8.degreesLongitude_ = r0
            java.lang.String r2 = r9.name
            X.Bm6 r1 = X.C17880vN.A0G(r10)
            X.8Zx r1 = (X.C164718Zx) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.name_ = r2
            X.Bm6 r1 = X.C17880vN.A0G(r3)
            X.8bU r1 = (X.C165618bU) r1
            X.Bm6 r0 = r10.A0C()
            r0.getClass()
            r1.action_ = r0
            r0 = 2
        L_0x00d0:
            r1.actionCase_ = r0
        L_0x00d2:
            X.Bm6 r0 = r3.A0C()
            r5.add(r0)
            int r4 = r4 + 1
            if (r4 < r6) goto L_0x000c
            return r5
        L_0x00de:
            boolean r0 = r9 instanceof X.C20947Ac1
            if (r0 == 0) goto L_0x0170
            X.Ac1 r9 = (X.C20947Ac1) r9
            X.8bG r0 = X.C165508bG.DEFAULT_INSTANCE
            X.Bmt r8 = r0.A0N()
            X.1ch r0 = r9.A01
            java.lang.String r2 = r0.getObfuscatedString()
            X.Bm6 r1 = X.C17880vN.A0G(r8)
            X.8bG r1 = (X.C165508bG) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.newsletterJid_ = r2
            java.lang.String r2 = r9.A04
            X.Bm6 r1 = X.C17880vN.A0G(r8)
            X.8bG r1 = (X.C165508bG) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.newsletterName_ = r2
            int r2 = r9.A00
            if (r2 <= 0) goto L_0x0123
            X.Bm6 r1 = X.C17880vN.A0G(r8)
            X.8bG r1 = (X.C165508bG) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.serverMessageId_ = r2
        L_0x0123:
            X.9Id r0 = r9.A02
            if (r0 == 0) goto L_0x0146
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x016d
            r0 = 1
            if (r1 == r0) goto L_0x016a
            r0 = 2
            if (r1 != r0) goto L_0x02b1
            X.9Jp r0 = X.C179709Jp.LINK_CARD
        L_0x0136:
            X.Bm6 r1 = X.C17880vN.A0G(r8)
            X.8bG r1 = (X.C165508bG) r1
            int r0 = r0.value
            r1.contentType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
        L_0x0146:
            java.lang.String r2 = r9.A03
            if (r2 == 0) goto L_0x0158
            X.Bm6 r1 = X.C17880vN.A0G(r8)
            X.8bG r1 = (X.C165508bG) r1
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.accessibilityText_ = r2
        L_0x0158:
            X.Bm6 r1 = X.C17880vN.A0G(r3)
            X.8bU r1 = (X.C165618bU) r1
            X.Bm6 r0 = r8.A0C()
            r0.getClass()
            r1.action_ = r0
            r0 = 3
            goto L_0x00d0
        L_0x016a:
            X.9Jp r0 = X.C179709Jp.UPDATE_CARD
            goto L_0x0136
        L_0x016d:
            X.9Jp r0 = X.C179709Jp.UPDATE
            goto L_0x0136
        L_0x0170:
            boolean r0 = r9 instanceof X.AnonymousClass97M
            if (r0 == 0) goto L_0x019b
            r0 = r9
            X.97M r0 = (X.AnonymousClass97M) r0
            X.8Yr r0 = r0.A00
            if (r0 == 0) goto L_0x019b
        L_0x017b:
            X.Bm6 r1 = X.C17880vN.A0G(r3)
            X.8bU r1 = (X.C165618bU) r1
            r1.embeddedContent_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            X.Bm6 r2 = X.C17880vN.A0G(r3)
            X.8bU r2 = (X.C165618bU) r2
            r1 = 1
            r0 = 6
            r2.actionCase_ = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.action_ = r0
            goto L_0x00d2
        L_0x019b:
            boolean r0 = r9 instanceof X.AnonymousClass77U
            if (r0 == 0) goto L_0x00d2
            X.77U r9 = (X.AnonymousClass77U) r9
            boolean r0 = r9.A00()
            if (r0 != 0) goto L_0x01ae
            java.lang.String r0 = "EmbeddedMusic/toProto missing expected fields"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00d2
        L_0x01ae:
            X.8Yr r0 = X.C164398Yr.DEFAULT_INSTANCE
            X.Bmt r8 = r0.A0N()
            X.8cB r0 = X.C165998cB.DEFAULT_INSTANCE
            X.Bmt r10 = r0.A0N()
            java.lang.String r2 = r9.A03
            java.lang.String r11 = ""
            if (r2 != 0) goto L_0x01c1
            r2 = r11
        L_0x01c1:
            X.Bm6 r1 = X.C17880vN.A0G(r10)
            X.8cB r1 = (X.C165998cB) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.musicContentMediaId_ = r2
            java.lang.String r2 = r9.A04
            if (r2 != 0) goto L_0x01d4
            r2 = r11
        L_0x01d4:
            X.Bm6 r1 = X.C17880vN.A0G(r10)
            X.8cB r1 = (X.C165998cB) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.songId_ = r2
            java.lang.String r2 = r9.A02
            if (r2 != 0) goto L_0x01e7
            r2 = r11
        L_0x01e7:
            X.Bm6 r1 = X.C17880vN.A0G(r10)
            X.8cB r1 = (X.C165998cB) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.author_ = r2
            java.lang.String r2 = r9.A05
            if (r2 != 0) goto L_0x01fa
            r2 = r11
        L_0x01fa:
            X.Bm6 r1 = X.C17880vN.A0G(r10)
            X.8cB r1 = (X.C165998cB) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.title_ = r2
            java.lang.String r2 = r9.A01
            if (r2 != 0) goto L_0x020d
            r2 = r11
        L_0x020d:
            X.Bm6 r1 = X.C17880vN.A0G(r10)
            X.8cB r1 = (X.C165998cB) r1
            int r0 = r1.bitField0_
            r0 = r0 | 16
            r1.bitField0_ = r0
            r1.artworkDirectPath_ = r2
            byte[] r0 = r9.A09
            r2 = 0
            if (r0 != 0) goto L_0x0222
            byte[] r0 = new byte[r2]
        L_0x0222:
            X.BmB r12 = X.AnonymousClass8BU.A0A(r10, r0, r2)
            X.Bm6 r1 = r10.A00
            X.8cB r1 = (X.C165998cB) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.artworkSha256_ = r12
            byte[] r0 = r9.A07
            if (r0 != 0) goto L_0x0238
            byte[] r0 = new byte[r2]
        L_0x0238:
            X.BmB r12 = X.AnonymousClass8BU.A0A(r10, r0, r2)
            X.Bm6 r1 = r10.A00
            X.8cB r1 = (X.C165998cB) r1
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.artworkEncSha256_ = r12
            byte[] r0 = r9.A08
            if (r0 != 0) goto L_0x024e
            byte[] r0 = new byte[r2]
        L_0x024e:
            X.BmB r12 = X.AnonymousClass8BU.A0A(r10, r0, r2)
            X.Bm6 r1 = r10.A00
            X.8cB r1 = (X.C165998cB) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
            r1.artworkMediaKey_ = r12
            java.lang.String r0 = r9.A00
            if (r0 == 0) goto L_0x0263
            r11 = r0
        L_0x0263:
            X.Bm6 r1 = X.C17880vN.A0G(r10)
            X.8cB r1 = (X.C165998cB) r1
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.artistAttribution_ = r11
            byte[] r0 = r9.A0A
            if (r0 != 0) goto L_0x0277
            byte[] r0 = new byte[r2]
        L_0x0277:
            X.BmB r2 = X.AnonymousClass8BU.A0A(r10, r0, r2)
            X.Bm6 r1 = r10.A00
            X.8cB r1 = (X.C165998cB) r1
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.countryBlocklist_ = r2
            boolean r2 = r9.A06
            X.Bm6 r1 = X.C17880vN.A0G(r10)
            X.8cB r1 = (X.C165998cB) r1
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            r1.isExplicit_ = r2
            X.Bm6 r0 = X.AnonymousClass8BS.A09(r10, r8)
            X.Bm6 r1 = r8.A00
            X.8Yr r1 = (X.C164398Yr) r1
            r0.getClass()
            r1.content_ = r0
            r0 = 2
            r1.contentCase_ = r0
            X.Bm6 r0 = r8.A0C()
            X.8Yr r0 = (X.C164398Yr) r0
            if (r0 == 0) goto L_0x00d2
            goto L_0x017b
        L_0x02b1:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x02b6:
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20133A8t.A07(X.2rc):java.util.ArrayList");
    }

    public static void A09(C18030ve r2, AnonymousClass8X8 r3) {
        if (C18020vd.A05(C18040vf.A01, r2, 7772)) {
            C166418cr A0M = AnonymousClass8BS.A0M(r3);
            int i = C166418cr.ALBUM_MESSAGE_FIELD_NUMBER;
            A0M.messageContextInfo_ = null;
            A0M.bitField0_ &= -67108865;
        }
    }

    public static boolean A0A(AnonymousClass206 r2) {
        int i = r2.A0u;
        if (i == 11 || i == 31 || i == 95 || i == 96 || i == 98) {
            return true;
        }
        return false;
    }

    public static boolean A0B(AnonymousClass206 r1) {
        if (r1 == null || (r1 instanceof AnonymousClass23U) || (r1 instanceof C439721q)) {
            return true;
        }
        return false;
    }

    public static boolean A0C(AnonymousClass206 r4, long j, boolean z) {
        AnonymousClass205 r1 = r4.A0v;
        if (!C22971Dz.A0a(r1.A00)) {
            Log.e("BaseMessageUtils/isSeenStatusMessage/message is not a status message");
        } else if (z && !r1.A02) {
            int A0D = r4.A0D();
            if (A0D < 16 || A0D > 18) {
                return false;
            }
            return true;
        } else if (r4.A0y <= j) {
            return true;
        }
        return false;
    }

    public static boolean A0E(C63362sw r2) {
        if (!C22971Dz.A0e(r2.A0Z) || r2.A09 != null || r2.A08 == null || !"text".equals(r2.A0R) || r2.A00 != 1) {
            return false;
        }
        return true;
    }

    public static boolean A0F(C63362sw r2) {
        if (!C22971Dz.A0a(r2.A0Z) || r2.A09 != null || r2.A08 == null || !"text".equals(r2.A0R) || r2.A00 != 1) {
            return false;
        }
        return true;
    }

    public static Pair A05(DeviceJid deviceJid, Jid jid, Jid jid2) {
        if (C22971Dz.A0e(jid) || C22971Dz.A0N(jid)) {
            if (deviceJid != null) {
                jid2 = deviceJid;
            }
        } else if (C22971Dz.A0N(jid2)) {
            if (deviceJid != null) {
                jid = deviceJid;
            }
            Jid jid3 = jid2;
            jid2 = jid;
            jid = jid3;
        } else if (deviceJid != null) {
            jid = deviceJid;
        }
        return C108945cZ.A0N(jid, jid2);
    }

    public static void A08(C62572rc r3, List list) {
        LinkedList A14 = AnonymousClass8BR.A14();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InteractiveAnnotation A06 = A06((C165618bU) it.next());
            if (A06 != null) {
                A14.add(A06);
            }
        }
        if (!A14.isEmpty()) {
            r3.A0b = (InteractiveAnnotation[]) A14.toArray(new InteractiveAnnotation[0]);
        }
    }

    public static boolean A0D(AnonymousClass205 r5, String str) {
        StringBuilder A10;
        String str2;
        if (TextUtils.isEmpty(str)) {
            A10 = AnonymousClass000.A10();
            A10.append("MessageUtil/isValidMediaUrl/error empty media url received. message.key=");
        } else {
            Uri parse = Uri.parse(str);
            if (!"https".equalsIgnoreCase(parse.getScheme())) {
                A10 = AnonymousClass000.A10();
                str2 = "MessageUtil/isValidMediaUrl/error invalid scheme on received media url; url=";
            } else if (!TextUtils.isEmpty(parse.getHost()) && parse.getHost().endsWith(".whatsapp.net")) {
                return true;
            } else {
                A10 = AnonymousClass000.A10();
                str2 = "MessageUtil/isValidMediaUrl/error invalid host on received media url; url=";
            }
            C17890vO.A10(str2, str, "; message.key=", A10);
        }
        AnonymousClass8BW.A1N(r5, A10);
        return false;
    }
}
