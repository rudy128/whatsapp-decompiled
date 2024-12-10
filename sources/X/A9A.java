package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.util.Iterator;
import java.util.List;

public final class A9A {
    public final C18030ve A00;
    public final AnonymousClass190 A01;

    public static final C195419tJ A03(C165618bU r2) {
        C195419tJ r1;
        C195419tJ r12;
        C18070vi.A0d(r2, 0);
        if ((r2.bitField0_ & 32) == 0) {
            return null;
        }
        C164398Yr r22 = r2.embeddedContent_;
        if (r22 == null) {
            r22 = C164398Yr.DEFAULT_INSTANCE;
        }
        C18070vi.A0X(r22);
        if (r22.contentCase_ == 1) {
            C164408Ys r23 = (C164408Ys) r22.content_;
            C18070vi.A0X(r23);
            if ((r23.bitField0_ & 2) != 0) {
                C166418cr r0 = r23.message_;
                if (r0 == null) {
                    r0 = C166418cr.DEFAULT_INSTANCE;
                }
                C18070vi.A0X(r0);
                r12 = A0M(A0L(r0), "message");
            } else {
                r12 = null;
            }
            r1 = A0M(r12, "embedded_message");
        } else {
            r1 = null;
        }
        return A0M(r1, "embedded_content");
    }

    public static final C195419tJ A09(C166268cc r6) {
        C195419tJ r4 = null;
        if (AnonymousClass000.A1O(r6.bitField0_ & 2)) {
            String str = r6.mimetype_;
            C18070vi.A0X(str);
            String[] strArr = new String[4];
            strArr[0] = "image/jpeg";
            strArr[1] = "image/png";
            strArr[2] = "image/gif";
            C195419tJ A0Q = A0Q(str, C18070vi.A0O("image/webp", strArr, 3));
            if (A0Q != null) {
                return A0Q;
            }
        }
        if (AnonymousClass000.A1O(r6.bitField0_ & 8)) {
            DSQ dsq = r6.fileSha256_;
            C18070vi.A0X(dsq);
            C195419tJ A012 = A01(dsq, "file_sha256", 14, 32);
            if (A012 != null) {
                return A012;
            }
        }
        if ((r6.bitField0_ & 256) != 0) {
            DSQ dsq2 = r6.fileEncSha256_;
            C18070vi.A0X(dsq2);
            C195419tJ A013 = A01(dsq2, "file_enc_sha256", 14, 32);
            if (A013 != null) {
                return A013;
            }
        }
        if ((r6.bitField0_ & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            C166278cd r0 = r6.contextInfo_;
            if (r0 == null) {
                r0 = C166278cd.DEFAULT_INSTANCE;
            }
            C195419tJ A02 = A02(r0);
            if (A02 != null) {
                return A02;
            }
        }
        if ((r6.bitField0_ & 2097152) != 0) {
            DSQ dsq3 = r6.thumbnailSha256_;
            C18070vi.A0X(dsq3);
            C195419tJ A014 = A01(dsq3, "thumbnail_sha256", 14, 32);
            if (A014 != null) {
                return A014;
            }
        }
        if ((r6.bitField0_ & 4194304) != 0) {
            DSQ dsq4 = r6.thumbnailEncSha256_;
            C18070vi.A0X(dsq4);
            C195419tJ A015 = A01(dsq4, "thumbnail_enc_sha256", 14, 32);
            if (A015 != null) {
                return A015;
            }
        }
        Iterator A0r = AnonymousClass8BS.A0r(r6.annotations_);
        while (true) {
            if (!A0r.hasNext()) {
                break;
            }
            C165618bU r02 = (C165618bU) A0r.next();
            C18070vi.A0b(r02);
            C195419tJ A03 = A03(r02);
            if (A03 != null) {
                r4 = A03;
                break;
            }
        }
        return A0M(r4, "annotations");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r0 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        if (r0 != null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ac, code lost:
        if (r0 == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c7, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C195419tJ A0A(X.C166398cp r6) {
        /*
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            int r0 = r6.bitField0_
            boolean r0 = X.AnonymousClass8BW.A1Q(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0079
            X.8bW r3 = r6.header_
            if (r3 != 0) goto L_0x0013
            X.8bW r3 = X.C165638bW.DEFAULT_INSTANCE
        L_0x0013:
            X.C18070vi.A0X(r3)
            int r4 = r3.mediaCase_
            r1 = 3
            boolean r0 = X.AnonymousClass000.A1T(r4, r1)
            r2 = 0
            if (r0 == 0) goto L_0x002c
            if (r4 != r1) goto L_0x00c3
            java.lang.Object r0 = r3.media_
            X.8cW r0 = (X.C166208cW) r0
        L_0x0026:
            X.9tJ r0 = A04(r0)
            if (r0 != 0) goto L_0x00c1
        L_0x002c:
            int r1 = r3.mediaCase_
            r0 = 4
            if (r1 != r0) goto L_0x003b
            java.lang.Object r0 = r3.media_
            X.8cc r0 = (X.C166268cc) r0
            X.9tJ r0 = A08(r0)
            if (r0 != 0) goto L_0x00c1
        L_0x003b:
            int r1 = r3.mediaCase_
            r0 = 7
            if (r1 != r0) goto L_0x004a
            java.lang.Object r0 = r3.media_
            X.8ca r0 = (X.C166248ca) r0
            X.9tJ r0 = A0J(r0)
            if (r0 != 0) goto L_0x00c1
        L_0x004a:
            int r1 = r3.mediaCase_
            r0 = 8
            if (r1 != r0) goto L_0x005a
            java.lang.Object r0 = r3.media_
            X.8cE r0 = (X.C166028cE) r0
            X.9tJ r0 = A0B(r0)
            if (r0 != 0) goto L_0x00c1
        L_0x005a:
            int r1 = r3.mediaCase_
            r0 = 9
            if (r1 != r0) goto L_0x0071
            java.lang.Object r0 = r3.media_
            X.8bb r0 = (X.C165688bb) r0
            X.C18070vi.A0X(r0)
            X.9tJ r1 = A0F(r0)
            java.lang.String r0 = "product_message"
            X.9tJ r2 = A0M(r1, r0)
        L_0x0071:
            java.lang.String r0 = "header"
            X.9tJ r0 = A0M(r2, r0)
            if (r0 != 0) goto L_0x00c7
        L_0x0079:
            int r1 = r6.interactiveMessageCase_
            r0 = 7
            if (r1 != r0) goto L_0x00ae
            X.8Z2 r0 = r6.A0R()
            X.C18070vi.A0X(r0)
            X.EE9 r0 = r0.cards_
            java.util.Iterator r2 = X.AnonymousClass8BS.A0r(r0)
        L_0x008b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r0 = r2.next()
            X.8cp r0 = (X.C166398cp) r0
            X.C18070vi.A0b(r0)
            X.9tJ r1 = A0A(r0)
            if (r1 == 0) goto L_0x008b
        L_0x00a0:
            java.lang.String r0 = "cards"
            X.9tJ r1 = A0M(r1, r0)
            java.lang.String r0 = "carousel_message"
            X.9tJ r0 = A0M(r1, r0)
            if (r0 != 0) goto L_0x00c7
        L_0x00ae:
            int r0 = r6.bitField0_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00be
            X.8cd r0 = r6.contextInfo_
            if (r0 != 0) goto L_0x00ba
            X.8cd r0 = X.C166278cd.DEFAULT_INSTANCE
        L_0x00ba:
            X.9tJ r5 = A02(r0)
        L_0x00be:
            return r5
        L_0x00bf:
            r1 = 0
            goto L_0x00a0
        L_0x00c1:
            r2 = r0
            goto L_0x0071
        L_0x00c3:
            X.8cW r0 = X.C166208cW.DEFAULT_INSTANCE
            goto L_0x0026
        L_0x00c7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A9A.A0A(X.8cp):X.9tJ");
    }

    public static final C195419tJ A0D(AnonymousClass8ZD r5) {
        C18070vi.A0d(r5, 0);
        C195419tJ A0N = A0N("option_name", 11, AnonymousClass8BW.A1Q(r5.bitField0_));
        if (A0N != null) {
            return A0N;
        }
        String str = r5.optionName_;
        C18070vi.A0X(str);
        C195419tJ A0O = A0O(str, "option_name");
        if (A0O != null) {
            return A0O;
        }
        String str2 = r5.optionName_;
        C18070vi.A0X(str2);
        return A0P(str2, "option_name", 11, 2500);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r0 == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        if (r0 == null) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C195419tJ A0F(X.C165688bb r4) {
        /*
            r3 = 0
            int r0 = r4.bitField0_
            boolean r0 = X.AnonymousClass8BW.A1Q(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0034
            X.8cF r1 = r4.product_
            if (r1 != 0) goto L_0x0010
            X.8cF r1 = X.C166038cF.DEFAULT_INSTANCE
        L_0x0010:
            X.C18070vi.A0X(r1)
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0087
            X.8cc r0 = r1.productImage_
            if (r0 != 0) goto L_0x001f
            X.8cc r0 = X.C166268cc.DEFAULT_INSTANCE
        L_0x001f:
            X.C18070vi.A0X(r0)
            X.9tJ r1 = A09(r0)
            java.lang.String r0 = "product_image"
            X.9tJ r1 = A0M(r1, r0)
        L_0x002c:
            java.lang.String r0 = "product"
            X.9tJ r0 = A0M(r1, r0)
            if (r0 != 0) goto L_0x0089
        L_0x0034:
            int r0 = r4.bitField0_
            r0 = r0 & 2
            boolean r1 = X.AnonymousClass000.A1O(r0)
            java.lang.String r0 = "business_owner_jid"
            X.9tJ r0 = A0N(r0, r3, r1)
            if (r0 != 0) goto L_0x0089
            int r0 = r4.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0074
            X.8aG r1 = r4.catalog_
            if (r1 != 0) goto L_0x0050
            X.8aG r1 = X.C164908aG.DEFAULT_INSTANCE
        L_0x0050:
            X.C18070vi.A0X(r1)
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0085
            X.8cc r0 = r1.catalogImage_
            if (r0 != 0) goto L_0x005f
            X.8cc r0 = X.C166268cc.DEFAULT_INSTANCE
        L_0x005f:
            X.C18070vi.A0X(r0)
            X.9tJ r1 = A09(r0)
            java.lang.String r0 = "catalog_image"
            X.9tJ r1 = A0M(r1, r0)
        L_0x006c:
            java.lang.String r0 = "catalog"
            X.9tJ r0 = A0M(r1, r0)
            if (r0 != 0) goto L_0x0089
        L_0x0074:
            int r0 = r4.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0084
            X.8cd r0 = r4.contextInfo_
            if (r0 != 0) goto L_0x0080
            X.8cd r0 = X.C166278cd.DEFAULT_INSTANCE
        L_0x0080:
            X.9tJ r2 = A02(r0)
        L_0x0084:
            return r2
        L_0x0085:
            r1 = 0
            goto L_0x006c
        L_0x0087:
            r1 = 0
            goto L_0x002c
        L_0x0089:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A9A.A0F(X.8bb):X.9tJ");
    }

    public static final C195419tJ A0K(C166248ca r6) {
        C195419tJ A002;
        C195419tJ A0N = A0N("mimetype", 17, AnonymousClass000.A1O(r6.bitField0_ & 2));
        if (A0N != null) {
            return A0N;
        }
        String str = r6.mimetype_;
        C18070vi.A0X(str);
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "video/mp4";
        C195419tJ A0Q = A0Q(str, C18070vi.A0O("video/x.looping_mp4", A1Z, 1));
        if (A0Q != null) {
            return A0Q;
        }
        C195419tJ A0N2 = A0N("file_sha256", 14, AnonymousClass000.A1O(r6.bitField0_ & 4));
        if (A0N2 != null) {
            return A0N2;
        }
        DSQ dsq = r6.fileSha256_;
        C18070vi.A0X(dsq);
        C195419tJ A012 = A01(dsq, "file_sha256", 14, 32);
        if (A012 != null) {
            return A012;
        }
        C195419tJ r4 = null;
        if (AnonymousClass000.A1O(r6.bitField0_ & 8) && (A002 = A00(r6.fileLength_)) != null) {
            return A002;
        }
        if ((r6.bitField0_ & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            DSQ dsq2 = r6.fileEncSha256_;
            C18070vi.A0X(dsq2);
            C195419tJ A013 = A01(dsq2, "file_enc_sha256", 14, 32);
            if (A013 != null) {
                return A013;
            }
        }
        if ((r6.bitField0_ & 16384) != 0) {
            C166278cd r0 = r6.contextInfo_;
            if (r0 == null) {
                r0 = C166278cd.DEFAULT_INSTANCE;
            }
            C195419tJ A02 = A02(r0);
            if (A02 != null) {
                return A02;
            }
        }
        Iterator A0r = AnonymousClass8BS.A0r(r6.annotations_);
        while (true) {
            if (!A0r.hasNext()) {
                break;
            }
            C165618bU r02 = (C165618bU) A0r.next();
            C18070vi.A0b(r02);
            C195419tJ A03 = A03(r02);
            if (A03 != null) {
                r4 = A03;
                break;
            }
        }
        return A0M(r4, "annotations");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01dd, code lost:
        if (r11 == null) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0259, code lost:
        if (r1 != null) goto L_0x0cc8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02ba, code lost:
        if (r1 == null) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02d5, code lost:
        if (r1 == null) goto L_0x02d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x030b, code lost:
        if (r1 == null) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0337, code lost:
        if (r1 == null) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r1 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0372, code lost:
        if (r1 != null) goto L_0x0cc8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x038d, code lost:
        if (r1 == null) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x03ad, code lost:
        if (r1 == null) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x03d5, code lost:
        if (r1 == null) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x03fd, code lost:
        if (r1 == null) goto L_0x03ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0419, code lost:
        if (r1 == null) goto L_0x041b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        if (r1 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x044e, code lost:
        if (r1 == null) goto L_0x0450;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0487, code lost:
        if (r1 != null) goto L_0x0cc8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x04cf, code lost:
        if (((long) r1.size()) > 0) goto L_0x04d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0504, code lost:
        if (r1 != null) goto L_0x0cc8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x051d, code lost:
        if (r1 == null) goto L_0x051f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0545, code lost:
        if (r1 == null) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x057d, code lost:
        if (X.AnonymousClass8BR.A1T(X.C17880vN.A0n(r1.BVW()), 0L) != false) goto L_0x057f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x05a0, code lost:
        if (r1 != null) goto L_0x0cc8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x05bd, code lost:
        if (r1 == null) goto L_0x05bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x05f2, code lost:
        if (((long) r1.size()) > 0) goto L_0x05f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x05f7, code lost:
        if (r4.headerCase_ != 2) goto L_0x0603;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x05f9, code lost:
        r11 = A04((X.C166208cW) r4.header_);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0601, code lost:
        if (r11 != null) goto L_0x0b84;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0606, code lost:
        if (r4.headerCase_ != 3) goto L_0x0612;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0608, code lost:
        r11 = A08((X.C166268cc) r4.header_);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0610, code lost:
        if (r11 != null) goto L_0x0b84;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0615, code lost:
        if (r4.headerCase_ != 4) goto L_0x0621;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0617, code lost:
        r11 = A0J((X.C166248ca) r4.header_);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x061f, code lost:
        if (r11 != null) goto L_0x0b84;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0624, code lost:
        if (r4.headerCase_ != 5) goto L_0x0630;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0626, code lost:
        r11 = A0B((X.C166028cE) r4.header_);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x062e, code lost:
        if (r11 != null) goto L_0x0b84;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0634, code lost:
        if ((r4.bitField0_ & 128) == 0) goto L_0x0640;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0636, code lost:
        r1 = r4.contextInfo_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0638, code lost:
        if (r1 != null) goto L_0x063c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x063a, code lost:
        r1 = X.C166278cd.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x063c, code lost:
        r3 = A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0646, code lost:
        if (r1 == null) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007b, code lost:
        if (r1 == null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x066d, code lost:
        if (r1 == null) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0688, code lost:
        if (r1 == null) goto L_0x068a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x06b4, code lost:
        if (r1 == null) goto L_0x06b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x06f7, code lost:
        if (r1 != null) goto L_0x0cc8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0712, code lost:
        if (r1 == null) goto L_0x0714;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0790, code lost:
        if (r1 == null) goto L_0x0792;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r1 == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x07a8, code lost:
        if (r1 == null) goto L_0x07aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x07cf, code lost:
        if (r1 == null) goto L_0x07d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x07e7, code lost:
        if (r1 == null) goto L_0x07e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x082c, code lost:
        if (r1 == null) goto L_0x082e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0848, code lost:
        if (r1 == null) goto L_0x084a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0860, code lost:
        if (r1 == null) goto L_0x0862;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x087d, code lost:
        if (r1 == null) goto L_0x087f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x08b2, code lost:
        if (r1 == null) goto L_0x08b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x08cf, code lost:
        if (r1 == null) goto L_0x08d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x08eb, code lost:
        if (r1 == null) goto L_0x08ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0907, code lost:
        if (r1 == null) goto L_0x0909;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0924, code lost:
        if (r1 == null) goto L_0x0926;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x094c, code lost:
        if (r1 == null) goto L_0x094e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0969, code lost:
        if (r1 == null) goto L_0x096b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x099b, code lost:
        if (r1 != null) goto L_0x0cc8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:614:0x09cc, code lost:
        if (r1 == null) goto L_0x09ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:627:0x09f4, code lost:
        if (r1 == null) goto L_0x09f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:640:0x0a1b, code lost:
        if (r1 == null) goto L_0x0a1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:647:0x0a33, code lost:
        if (r1 == null) goto L_0x0a35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:0x0a5a, code lost:
        if (r1 == null) goto L_0x0a5c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:0x0a72, code lost:
        if (r1 == null) goto L_0x0a74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0117, code lost:
        if (r7 == null) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x0a99, code lost:
        if (r1 == null) goto L_0x0a9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:687:0x0ab1, code lost:
        if (r1 == null) goto L_0x0ab3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:0x0ac9, code lost:
        if (r1 == null) goto L_0x0acb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r1 == null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:701:0x0ae1, code lost:
        if (r1 == null) goto L_0x0ae3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:708:0x0af9, code lost:
        if (r1 == null) goto L_0x0afb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:743:0x0b72, code lost:
        if (X.C72463Mc.A1Y(java.lang.Boolean.valueOf(r1.isForwarded_)) != false) goto L_0x05f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012f, code lost:
        if (r1 == null) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:779:0x0c4b, code lost:
        if (r11 == null) goto L_0x0c4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:809:0x0cc8, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0141, code lost:
        if (r1 == null) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0184, code lost:
        if ((r1.bitField0_ & 4) != 0) goto L_0x0186;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C195419tJ A0L(X.C166418cr r17) {
        /*
            r1 = 0
            r0 = r17
            X.C18070vi.A0d(r0, r1)
            int r1 = r0.bitField0_
            r1 = r1 & 4
            boolean r1 = X.AnonymousClass000.A1O(r1)
            r12 = 0
            if (r1 == 0) goto L_0x001d
            X.8cc r1 = r0.imageMessage_
            if (r1 != 0) goto L_0x0017
            X.8cc r1 = X.C166268cc.DEFAULT_INSTANCE
        L_0x0017:
            X.9tJ r1 = A08(r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x001d:
            int r1 = r0.bitField0_
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0044
            X.8Zz r2 = r0.contactMessage_
            if (r2 != 0) goto L_0x0029
            X.8Zz r2 = X.C164738Zz.DEFAULT_INSTANCE
        L_0x0029:
            X.C18070vi.A0X(r2)
            int r1 = r2.bitField0_
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0cc3
            X.8cd r1 = r2.contextInfo_
            if (r1 != 0) goto L_0x0038
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x0038:
            X.9tJ r2 = A02(r1)
        L_0x003c:
            java.lang.String r1 = "contact_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0044:
            int r1 = r0.bitField0_
            r1 = r1 & 16
            if (r1 == 0) goto L_0x0056
            X.8cE r1 = r0.locationMessage_
            if (r1 != 0) goto L_0x0050
            X.8cE r1 = X.C166028cE.DEFAULT_INSTANCE
        L_0x0050:
            X.9tJ r1 = A0B(r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0056:
            int r1 = r0.bitField0_
            r1 = r1 & 32
            if (r1 == 0) goto L_0x007d
            X.8cb r2 = r0.extendedTextMessage_
            if (r2 != 0) goto L_0x0062
            X.8cb r2 = X.C166258cb.DEFAULT_INSTANCE
        L_0x0062:
            X.C18070vi.A0X(r2)
            int r1 = r2.bitField0_
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0cc0
            X.8cd r1 = r2.contextInfo_
            if (r1 != 0) goto L_0x0071
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x0071:
            X.9tJ r2 = A02(r1)
        L_0x0075:
            java.lang.String r1 = "extended_text_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x007d:
            int r1 = r0.bitField0_
            r1 = r1 & 64
            if (r1 == 0) goto L_0x008f
            X.8cW r1 = r0.documentMessage_
            if (r1 != 0) goto L_0x0089
            X.8cW r1 = X.C166208cW.DEFAULT_INSTANCE
        L_0x0089:
            X.9tJ r1 = A04(r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x008f:
            int r1 = r0.bitField0_
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0131
            X.8cP r5 = r0.audioMessage_
            if (r5 != 0) goto L_0x009b
            X.8cP r5 = X.C166138cP.DEFAULT_INSTANCE
        L_0x009b:
            X.C18070vi.A0X(r5)
            r6 = 0
            int r1 = r5.bitField0_
            r1 = r1 & 2
            boolean r3 = X.AnonymousClass000.A1O(r1)
            java.lang.String r2 = "mimetype"
            r1 = 17
            X.9tJ r7 = A0N(r2, r1, r3)
            if (r7 != 0) goto L_0x0129
            java.lang.String r4 = r5.mimetype_
            X.C18070vi.A0X(r4)
            r1 = 5
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.String r1 = "audio/aac"
            r3[r6] = r1
            r2 = 1
            java.lang.String r1 = "audio/mp4"
            r3[r2] = r1
            r2 = 2
            java.lang.String r1 = "audio/amr"
            r3[r2] = r1
            r2 = 3
            java.lang.String r1 = "audio/mpeg"
            r3[r2] = r1
            r2 = 4
            java.lang.String r1 = "audio/ogg; codecs=opus"
            java.util.List r1 = X.C18070vi.A0O(r1, r3, r2)
            X.9tJ r7 = A0Q(r4, r1)
            if (r7 != 0) goto L_0x0129
            int r1 = r5.bitField0_
            r1 = r1 & 4
            boolean r1 = X.AnonymousClass000.A1O(r1)
            java.lang.String r2 = "file_sha256"
            r6 = 14
            X.9tJ r7 = A0N(r2, r6, r1)
            if (r7 != 0) goto L_0x0129
            X.DSQ r1 = r5.fileSha256_
            X.C18070vi.A0X(r1)
            r3 = 32
            X.9tJ r7 = A01(r1, r2, r6, r3)
            if (r7 != 0) goto L_0x0129
            int r1 = r5.bitField0_
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0106
            long r1 = r5.fileLength_
            X.9tJ r7 = A00(r1)
            if (r7 != 0) goto L_0x0129
        L_0x0106:
            int r1 = r5.bitField0_
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0119
            X.DSQ r2 = r5.fileEncSha256_
            X.C18070vi.A0X(r2)
            java.lang.String r1 = "file_enc_sha256"
            X.9tJ r7 = A01(r2, r1, r6, r3)
            if (r7 != 0) goto L_0x0129
        L_0x0119:
            int r1 = r5.bitField0_
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0cbd
            X.8cd r1 = r5.contextInfo_
            if (r1 != 0) goto L_0x0125
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x0125:
            X.9tJ r7 = A02(r1)
        L_0x0129:
            java.lang.String r1 = "audio_message"
            X.9tJ r1 = A0M(r7, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0131:
            int r1 = r0.bitField0_
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0143
            X.8ca r1 = r0.videoMessage_
            if (r1 != 0) goto L_0x013d
            X.8ca r1 = X.C166248ca.DEFAULT_INSTANCE
        L_0x013d:
            X.9tJ r1 = A0J(r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0143:
            int r1 = r0.bitField0_
            r1 = r1 & 2048(0x800, float:2.87E-42)
            boolean r1 = X.AnonymousClass000.A1O(r1)
            if (r1 == 0) goto L_0x025b
            X.8cm r5 = X.AnonymousClass8BS.A0I(r0)
            X.C18070vi.A0X(r5)
            r4 = 0
            int r1 = r5.bitField0_
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0237
            r3 = 0
            X.9Kc r1 = r5.A0R()
            r6 = 0
            int r1 = r1.BVW()
            java.lang.Long r1 = X.C17880vN.A0n(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            boolean r1 = X.AnonymousClass8BR.A1T(r1, r2)
            if (r1 != 0) goto L_0x0186
            int r1 = r5.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0230
            X.8cq r1 = r5.key_
            if (r1 != 0) goto L_0x0180
            X.8cq r1 = X.C166408cq.DEFAULT_INSTANCE
        L_0x0180:
            int r1 = r1.bitField0_
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0230
        L_0x0186:
            X.9Kc r6 = r5.A0R()
            r1 = 3
            java.lang.Long[] r7 = new java.lang.Long[r1]
            r7[r4] = r2
            r1 = 14
            X.C17890vO.A1M(r7, r1)
            r1 = 25
            X.C17890vO.A1N(r7, r1)
            java.util.List r2 = java.util.Arrays.asList(r7)
            X.C18070vi.A0X(r2)
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x023e
            java.util.Iterator r7 = r2.iterator()
        L_0x01aa:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x023e
            long r1 = X.C17890vO.A07(r7)
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            int r1 = r6.value
            java.lang.Long r1 = X.C17880vN.A0n(r1)
            boolean r1 = X.C18070vi.A18(r2, r1)
            if (r1 == 0) goto L_0x01aa
        L_0x01c4:
            int r1 = r5.bitField0_
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x01df
            X.8cr r1 = r5.editedMessage_
            if (r1 != 0) goto L_0x01d0
            X.8cr r1 = X.C166418cr.DEFAULT_INSTANCE
        L_0x01d0:
            X.C18070vi.A0X(r1)
            X.9tJ r2 = A0L(r1)     // Catch:{ all -> 0x0cc6 }
            java.lang.String r1 = "edited_message"
            X.9tJ r11 = A0M(r2, r1)
            if (r11 != 0) goto L_0x0252
        L_0x01df:
            int r1 = r5.bitField0_
            r1 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0253
            X.8aD r1 = r5.peerDataOperationRequestResponseMessage_
            if (r1 != 0) goto L_0x01eb
            X.8aD r1 = X.C164878aD.DEFAULT_INSTANCE
        L_0x01eb:
            X.C18070vi.A0X(r1)
            X.EE9 r1 = r1.peerDataOperationResult_
            java.util.Iterator r3 = X.AnonymousClass8BS.A0r(r1)
        L_0x01f4:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x022e
            java.lang.Object r2 = r3.next()
            X.8bo r2 = (X.C165818bo) r2
            X.C18070vi.A0b(r2)
            X.C18070vi.A0d(r2, r4)
            int r1 = r2.bitField0_
            r1 = r1 & 2
            if (r1 == 0) goto L_0x01f4
            X.8cX r1 = r2.stickerMessage_
            if (r1 != 0) goto L_0x0212
            X.8cX r1 = X.C166218cX.DEFAULT_INSTANCE
        L_0x0212:
            X.C18070vi.A0X(r1)
            X.9tJ r2 = A0G(r1)
            java.lang.String r1 = "sticker_message"
            X.9tJ r2 = A0M(r2, r1)
            if (r2 == 0) goto L_0x01f4
        L_0x0221:
            java.lang.String r1 = "peer_data_operation_result"
            X.9tJ r2 = A0M(r2, r1)
            java.lang.String r1 = "peer_data_operation_request_response_message"
            X.9tJ r3 = A0M(r2, r1)
            goto L_0x0253
        L_0x022e:
            r2 = 0
            goto L_0x0221
        L_0x0230:
            java.lang.String r13 = "E2E.Message.ProtocolMessage"
            java.lang.String r15 = "type != 0 || (has(key) && has(key.id))"
            java.lang.String r16 = "key must be present if type == REVOKE"
            goto L_0x024a
        L_0x0237:
            java.lang.String r13 = "E2E.Message.ProtocolMessage"
            java.lang.String r15 = "has(type)"
            java.lang.String r16 = "type is required"
            goto L_0x024a
        L_0x023e:
            int r1 = r5.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x01c4
            java.lang.String r13 = "E2E.Message.ProtocolMessage"
            java.lang.String r15 = "(type in [0, 14, 25]) || !has(key)"
            java.lang.String r16 = "key must not be present if type not in [REVOKE, MESSAGE_EDIT, STATUS_MENTION_MESSAGE]"
        L_0x024a:
            r17 = 11
            X.9tJ r11 = new X.9tJ
            r14 = r12
            r11.<init>(r12, r13, r14, r15, r16, r17)
        L_0x0252:
            r3 = r11
        L_0x0253:
            java.lang.String r1 = "protocol_message"
            X.9tJ r1 = A0M(r3, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x025b:
            int r1 = r0.bitField0_
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x02bc
            X.8a0 r5 = r0.contactsArrayMessage_
            if (r5 != 0) goto L_0x0267
            X.8a0 r5 = X.C164748a0.DEFAULT_INSTANCE
        L_0x0267:
            X.C18070vi.A0X(r5)
            X.EE9 r1 = r5.contacts_
            X.C18070vi.A0X(r1)
            java.lang.String r4 = "contacts"
            X.9tJ r2 = A0R(r4, r1)
            if (r2 != 0) goto L_0x02b4
            X.EE9 r1 = r5.contacts_
            java.util.Iterator r3 = X.AnonymousClass8BS.A0r(r1)
        L_0x027d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0cba
            java.lang.Object r2 = r3.next()
            X.8Zz r2 = (X.C164738Zz) r2
            X.C72453Mb.A1R(r2)
            int r1 = r2.bitField0_
            r1 = r1 & 4
            if (r1 == 0) goto L_0x027d
            X.8cd r1 = r2.contextInfo_
            if (r1 != 0) goto L_0x0298
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x0298:
            X.9tJ r1 = A02(r1)
            if (r1 == 0) goto L_0x027d
        L_0x029e:
            X.9tJ r2 = A0M(r1, r4)
            if (r2 != 0) goto L_0x02b4
            int r1 = r5.bitField0_
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0cb7
            X.8cd r1 = r5.contextInfo_
            if (r1 != 0) goto L_0x02b0
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x02b0:
            X.9tJ r2 = A02(r1)
        L_0x02b4:
            java.lang.String r1 = "contacts_array_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x02bc:
            int r1 = r0.bitField0_
            r1 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x02d7
            X.8c5 r1 = r0.highlyStructuredMessage_
            if (r1 != 0) goto L_0x02c8
            X.8c5 r1 = X.C165948c5.DEFAULT_INSTANCE
        L_0x02c8:
            X.C18070vi.A0X(r1)
            X.9tJ r2 = A07(r1)
            java.lang.String r1 = "highly_structured_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x02d7:
            int r2 = r0.bitField0_
            r1 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r1
            boolean r1 = X.AnonymousClass000.A1O(r2)
            if (r1 == 0) goto L_0x030d
            X.8aI r2 = r0.sendPaymentMessage_
            if (r2 != 0) goto L_0x02e9
            X.8aI r2 = X.C164928aI.DEFAULT_INSTANCE
        L_0x02e9:
            X.C18070vi.A0X(r2)
            int r1 = r2.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0cb4
            X.8cr r1 = r2.noteMessage_
            if (r1 != 0) goto L_0x02f8
            X.8cr r1 = X.C166418cr.DEFAULT_INSTANCE
        L_0x02f8:
            X.C18070vi.A0X(r1)
            X.9tJ r2 = A0L(r1)
            java.lang.String r1 = "note_message"
            X.9tJ r2 = A0M(r2, r1)
        L_0x0305:
            java.lang.String r1 = "send_payment_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x030d:
            int r2 = r0.bitField0_
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 & r1
            boolean r1 = X.AnonymousClass000.A1O(r2)
            if (r1 == 0) goto L_0x0339
            X.8c8 r2 = r0.liveLocationMessage_
            if (r2 != 0) goto L_0x031e
            X.8c8 r2 = X.C165968c8.DEFAULT_INSTANCE
        L_0x031e:
            X.C18070vi.A0X(r2)
            int r1 = r2.bitField0_
            r1 = r1 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0cb1
            X.8cd r1 = r2.contextInfo_
            if (r1 != 0) goto L_0x032d
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x032d:
            X.9tJ r2 = A02(r1)
        L_0x0331:
            java.lang.String r1 = "live_location_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0339:
            int r2 = r0.bitField0_
            r1 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 & r1
            boolean r1 = X.AnonymousClass000.A1O(r2)
            if (r1 == 0) goto L_0x0374
            X.8bp r3 = r0.requestPaymentMessage_
            if (r3 != 0) goto L_0x034a
            X.8bp r3 = X.C165828bp.DEFAULT_INSTANCE
        L_0x034a:
            X.C18070vi.A0X(r3)
            int r1 = r3.bitField0_
            boolean r1 = X.AnonymousClass8BW.A1Q(r1)
            r11 = 0
            if (r1 == 0) goto L_0x0c87
            X.8cr r1 = r3.noteMessage_
            if (r1 != 0) goto L_0x035c
            X.8cr r1 = X.C166418cr.DEFAULT_INSTANCE
        L_0x035c:
            X.C18070vi.A0X(r1)
            X.9tJ r2 = A0L(r1)
            java.lang.String r1 = "note_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 == 0) goto L_0x0c87
            r11 = r1
        L_0x036c:
            java.lang.String r1 = "request_payment_message"
            X.9tJ r1 = A0M(r11, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0374:
            boolean r1 = r0.A0R()
            if (r1 == 0) goto L_0x038f
            X.8ck r1 = r0.templateMessage_
            if (r1 != 0) goto L_0x0380
            X.8ck r1 = X.C166348ck.DEFAULT_INSTANCE
        L_0x0380:
            X.C18070vi.A0X(r1)
            X.9tJ r2 = A0I(r1)
            java.lang.String r1 = "template_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x038f:
            int r2 = r0.bitField0_
            r1 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 & r1
            boolean r1 = X.AnonymousClass000.A1O(r2)
            if (r1 == 0) goto L_0x03af
            X.8cX r1 = r0.stickerMessage_
            if (r1 != 0) goto L_0x03a0
            X.8cX r1 = X.C166218cX.DEFAULT_INSTANCE
        L_0x03a0:
            X.C18070vi.A0X(r1)
            X.9tJ r2 = A0G(r1)
            java.lang.String r1 = "sticker_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x03af:
            int r2 = r0.bitField0_
            r1 = 4194304(0x400000, float:5.877472E-39)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x03d7
            X.8bu r2 = r0.groupInviteMessage_
            if (r2 != 0) goto L_0x03bc
            X.8bu r2 = X.C165878bu.DEFAULT_INSTANCE
        L_0x03bc:
            X.C18070vi.A0X(r2)
            int r1 = r2.bitField0_
            r1 = r1 & 64
            if (r1 == 0) goto L_0x0c84
            X.8cd r1 = r2.contextInfo_
            if (r1 != 0) goto L_0x03cb
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x03cb:
            X.9tJ r2 = A02(r1)
        L_0x03cf:
            java.lang.String r1 = "group_invite_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x03d7:
            int r2 = r0.bitField0_
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x03ff
            X.8bK r2 = r0.templateButtonReplyMessage_
            if (r2 != 0) goto L_0x03e4
            X.8bK r2 = X.AnonymousClass8bK.DEFAULT_INSTANCE
        L_0x03e4:
            X.C18070vi.A0X(r2)
            int r1 = r2.bitField0_
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0c81
            X.8cd r1 = r2.contextInfo_
            if (r1 != 0) goto L_0x03f3
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x03f3:
            X.9tJ r2 = A02(r1)
        L_0x03f7:
            java.lang.String r1 = "template_button_reply_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x03ff:
            int r2 = r0.bitField0_
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x041b
            X.8bb r1 = r0.productMessage_
            if (r1 != 0) goto L_0x040c
            X.8bb r1 = X.C165688bb.DEFAULT_INSTANCE
        L_0x040c:
            X.C18070vi.A0X(r1)
            X.9tJ r2 = A0F(r1)
            java.lang.String r1 = "product_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x041b:
            int r2 = r0.bitField0_
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r2 = r2 & r1
            boolean r1 = X.AnonymousClass000.A1O(r2)
            if (r1 == 0) goto L_0x0450
            X.8a1 r3 = r0.deviceSentMessage_
            if (r3 != 0) goto L_0x042c
            X.8a1 r3 = X.C164758a1.DEFAULT_INSTANCE
        L_0x042c:
            X.C18070vi.A0X(r3)
            java.lang.String r2 = "message"
            int r1 = r3.bitField0_
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0c7e
            X.8cr r1 = r3.message_
            if (r1 != 0) goto L_0x043d
            X.8cr r1 = X.C166418cr.DEFAULT_INSTANCE
        L_0x043d:
            X.C18070vi.A0X(r1)
            X.9tJ r1 = A0L(r1)
            X.9tJ r2 = A0M(r1, r2)
        L_0x0448:
            java.lang.String r1 = "device_sent_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0450:
            int r2 = r0.bitField0_
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 & r1
            boolean r1 = X.AnonymousClass000.A1O(r2)
            if (r1 == 0) goto L_0x0489
            X.8cG r7 = r0.messageContextInfo_
            if (r7 != 0) goto L_0x0461
            X.8cG r7 = X.C166048cG.DEFAULT_INSTANCE
        L_0x0461:
            X.C18070vi.A0X(r7)
            int r1 = r7.bitField0_
            r1 = r1 & 4
            boolean r1 = X.AnonymousClass000.A1O(r1)
            r6 = 67
            r3 = 32
            r5 = 0
            if (r1 == 0) goto L_0x0c6b
            X.DSQ r2 = r7.messageSecret_
            X.C18070vi.A0X(r2)
            java.lang.String r1 = "message_secret"
            X.9tJ r1 = A01(r2, r1, r6, r3)
            if (r1 == 0) goto L_0x0c6b
            r5 = r1
        L_0x0481:
            java.lang.String r1 = "message_context_info"
            X.9tJ r1 = A0M(r5, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0489:
            int r2 = r0.bitField0_
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r2 = r2 & r1
            boolean r1 = X.AnonymousClass000.A1O(r2)
            if (r1 == 0) goto L_0x0506
            X.8cl r4 = r0.listMessage_
            if (r4 != 0) goto L_0x049a
            X.8cl r4 = X.C166358cl.DEFAULT_INSTANCE
        L_0x049a:
            X.C18070vi.A0X(r4)
            X.9Ju r1 = r4.A0R()
            r5 = 1
            int r1 = r1.BVW()
            java.lang.Long r2 = X.C17880vN.A0n(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            boolean r1 = X.AnonymousClass8BR.A1T(r2, r1)
            r3 = 0
            if (r1 != 0) goto L_0x04d1
            java.lang.String r1 = r4.buttonText_
            int r1 = X.AnonymousClass8BS.A00(r1)
            r7 = 0
            long r5 = (long) r1
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0c63
            X.EE9 r1 = r4.sections_
            X.C18070vi.A0X(r1)
            int r1 = r1.size()
            long r5 = (long) r1
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0c63
        L_0x04d1:
            X.9Ju r1 = r4.A0R()
            r5 = 2
            int r1 = r1.BVW()
            java.lang.Long r2 = X.C17880vN.A0n(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            boolean r1 = X.AnonymousClass8BR.A1T(r2, r1)
            if (r1 != 0) goto L_0x0ba2
            int r1 = r4.bitField0_
            r1 = r1 & 16
            if (r1 != 0) goto L_0x0ba2
            java.lang.String r13 = "E2E.Message.ListMessage"
            java.lang.String r15 = "list_type != 2 || has(product_list_info)"
            java.lang.String r16 = "PRODUCT_LIST must have product_list_info"
        L_0x04f5:
            r17 = 11
            X.9tJ r11 = new X.9tJ
            r14 = r12
            r11.<init>(r12, r13, r14, r15, r16, r17)
        L_0x04fd:
            r3 = r11
        L_0x04fe:
            java.lang.String r1 = "list_message"
            X.9tJ r1 = A0M(r3, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0506:
            int r2 = r0.bitField0_
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x051f
            X.8Xc r1 = r0.viewOnceMessage_
            if (r1 != 0) goto L_0x0513
            X.8Xc r1 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x0513:
            X.9tJ r2 = A06(r1)
            java.lang.String r1 = "view_once_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x051f:
            int r2 = r0.bitField0_
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x0547
            X.8cL r2 = r0.orderMessage_
            if (r2 != 0) goto L_0x052c
            X.8cL r2 = X.C166098cL.DEFAULT_INSTANCE
        L_0x052c:
            X.C18070vi.A0X(r2)
            int r1 = r2.bitField0_
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0b9f
            X.8cd r1 = r2.contextInfo_
            if (r1 != 0) goto L_0x053b
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x053b:
            X.9tJ r2 = A02(r1)
        L_0x053f:
            java.lang.String r1 = "order_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0547:
            int r2 = r0.bitField0_
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x05a2
            X.8bJ r4 = r0.listResponseMessage_
            if (r4 != 0) goto L_0x0554
            X.8bJ r4 = X.C165538bJ.DEFAULT_INSTANCE
        L_0x0554:
            X.C18070vi.A0X(r4)
            int r1 = r4.bitField0_
            r1 = r1 & 2
            boolean r1 = X.AnonymousClass000.A1O(r1)
            r11 = 0
            r5 = 0
            if (r1 == 0) goto L_0x057f
            int r2 = r4.listType_
            if (r2 == 0) goto L_0x0b9b
            r1 = 1
            if (r2 == r1) goto L_0x0b97
            X.9Jf r1 = X.AnonymousClass9Jf.UNKNOWN
        L_0x056d:
            int r1 = r1.BVW()
            java.lang.Long r2 = X.C17880vN.A0n(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            boolean r1 = X.AnonymousClass8BR.A1T(r2, r1)
            if (r1 == 0) goto L_0x0b87
        L_0x057f:
            java.lang.String r1 = r4.title_
            int r1 = X.AnonymousClass8BS.A00(r1)
            long r2 = (long) r1
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0b87
            int r1 = r4.bitField0_
            r1 = r1 & 8
            if (r1 == 0) goto L_0x059a
            X.8cd r1 = r4.contextInfo_
            if (r1 != 0) goto L_0x0596
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x0596:
            X.9tJ r11 = A02(r1)
        L_0x059a:
            java.lang.String r1 = "list_response_message"
            X.9tJ r1 = A0M(r11, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x05a2:
            int r2 = r0.bitField0_
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r1
            boolean r1 = X.AnonymousClass000.A1O(r2)
            if (r1 == 0) goto L_0x05bf
            X.8Xc r1 = r0.ephemeralMessage_
            if (r1 != 0) goto L_0x05b3
            X.8Xc r1 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x05b3:
            X.9tJ r2 = A06(r1)
            java.lang.String r1 = "ephemeral_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x05bf:
            int r1 = r0.bitField1_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0648
            X.8bs r4 = r0.buttonsMessage_
            if (r4 != 0) goto L_0x05cb
            X.8bs r4 = X.C165858bs.DEFAULT_INSTANCE
        L_0x05cb:
            X.C18070vi.A0X(r4)
            int r1 = r4.bitField0_
            r1 = r1 & 32
            boolean r1 = X.AnonymousClass000.A1O(r1)
            r3 = 0
            if (r1 == 0) goto L_0x0b5c
            java.lang.String r1 = r4.contentText_
            int r1 = X.AnonymousClass8BS.A00(r1)
            r7 = 0
            long r5 = (long) r1
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0b5c
            X.EE9 r1 = r4.buttons_
            X.C18070vi.A0X(r1)
            int r1 = r1.size()
            long r5 = (long) r1
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0b5c
        L_0x05f4:
            int r2 = r4.headerCase_
            r1 = 2
            if (r2 != r1) goto L_0x0603
            java.lang.Object r1 = r4.header_
            X.8cW r1 = (X.C166208cW) r1
            X.9tJ r11 = A04(r1)
            if (r11 != 0) goto L_0x0b84
        L_0x0603:
            int r2 = r4.headerCase_
            r1 = 3
            if (r2 != r1) goto L_0x0612
            java.lang.Object r1 = r4.header_
            X.8cc r1 = (X.C166268cc) r1
            X.9tJ r11 = A08(r1)
            if (r11 != 0) goto L_0x0b84
        L_0x0612:
            int r2 = r4.headerCase_
            r1 = 4
            if (r2 != r1) goto L_0x0621
            java.lang.Object r1 = r4.header_
            X.8ca r1 = (X.C166248ca) r1
            X.9tJ r11 = A0J(r1)
            if (r11 != 0) goto L_0x0b84
        L_0x0621:
            int r2 = r4.headerCase_
            r1 = 5
            if (r2 != r1) goto L_0x0630
            java.lang.Object r1 = r4.header_
            X.8cE r1 = (X.C166028cE) r1
            X.9tJ r11 = A0B(r1)
            if (r11 != 0) goto L_0x0b84
        L_0x0630:
            int r1 = r4.bitField0_
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0640
            X.8cd r1 = r4.contextInfo_
            if (r1 != 0) goto L_0x063c
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x063c:
            X.9tJ r3 = A02(r1)
        L_0x0640:
            java.lang.String r1 = "buttons_message"
            X.9tJ r1 = A0M(r3, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0648:
            int r1 = r0.bitField1_
            r1 = r1 & 2
            if (r1 == 0) goto L_0x066f
            X.8b6 r2 = r0.buttonsResponseMessage_
            if (r2 != 0) goto L_0x0654
            X.8b6 r2 = X.C165408b6.DEFAULT_INSTANCE
        L_0x0654:
            X.C18070vi.A0X(r2)
            int r1 = r2.bitField0_
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0b59
            X.8cd r1 = r2.contextInfo_
            if (r1 != 0) goto L_0x0663
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x0663:
            X.9tJ r2 = A02(r1)
        L_0x0667:
            java.lang.String r1 = "buttons_response_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x066f:
            int r1 = r0.bitField1_
            r1 = r1 & 8
            if (r1 == 0) goto L_0x068a
            X.8cp r1 = r0.interactiveMessage_
            if (r1 != 0) goto L_0x067b
            X.8cp r1 = X.C166398cp.DEFAULT_INSTANCE
        L_0x067b:
            X.C18070vi.A0X(r1)
            X.9tJ r2 = A0A(r1)
            java.lang.String r1 = "interactive_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x068a:
            int r1 = r0.bitField1_
            r1 = r1 & 16
            if (r1 == 0) goto L_0x06b6
            X.8aq r2 = r0.reactionMessage_
            if (r2 != 0) goto L_0x0696
            X.8aq r2 = X.C165258aq.DEFAULT_INSTANCE
        L_0x0696:
            X.C18070vi.A0X(r2)
            int r1 = r2.bitField0_
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0b56
            java.lang.String r5 = r2.text_
            X.C18070vi.A0X(r5)
            java.lang.String r4 = "text"
            r3 = 68
            r1 = 30
            X.9tJ r2 = A0P(r5, r4, r3, r1)
        L_0x06ae:
            java.lang.String r1 = "reaction_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x06b6:
            int r1 = r0.bitField1_
            r1 = r1 & 32
            if (r1 == 0) goto L_0x06f9
            X.8ag r4 = r0.interactiveResponseMessage_
            if (r4 != 0) goto L_0x06c2
            X.8ag r4 = X.C165158ag.DEFAULT_INSTANCE
        L_0x06c2:
            X.C18070vi.A0X(r4)
            int r1 = r4.bitField0_
            boolean r1 = X.AnonymousClass8BW.A1Q(r1)
            r3 = 0
            if (r1 == 0) goto L_0x0b44
            X.8Z4 r2 = r4.body_
            if (r2 != 0) goto L_0x06d4
            X.8Z4 r2 = X.AnonymousClass8Z4.DEFAULT_INSTANCE
        L_0x06d4:
            X.C18070vi.A0X(r2)
            int r1 = r2.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0b41
            java.lang.String r2 = r2.text_
            X.C18070vi.A0X(r2)
            java.lang.String r1 = "text"
            X.9tJ r2 = A0O(r2, r1)
        L_0x06e8:
            java.lang.String r1 = "body"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 == 0) goto L_0x0b44
            r3 = r1
        L_0x06f1:
            java.lang.String r1 = "interactive_response_message"
            X.9tJ r1 = A0M(r3, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x06f9:
            int r1 = r0.bitField1_
            r1 = r1 & 64
            if (r1 == 0) goto L_0x0714
            X.8bx r1 = r0.pollCreationMessage_
            if (r1 != 0) goto L_0x0705
            X.8bx r1 = X.C165908bx.DEFAULT_INSTANCE
        L_0x0705:
            X.C18070vi.A0X(r1)
            X.9tJ r2 = A0E(r1)
            java.lang.String r1 = "poll_creation_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0714:
            int r1 = r0.bitField1_
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0792
            X.8ap r7 = r0.pollUpdateMessage_
            if (r7 != 0) goto L_0x0720
            X.8ap r7 = X.C165248ap.DEFAULT_INSTANCE
        L_0x0720:
            X.C18070vi.A0X(r7)
            r5 = 0
            int r1 = r7.bitField0_
            boolean r3 = X.AnonymousClass8BW.A1Q(r1)
            java.lang.String r2 = "poll_creation_message_key"
            r1 = 66
            X.9tJ r2 = A0N(r2, r1, r3)
            if (r2 != 0) goto L_0x078a
            int r1 = r7.bitField0_
            r1 = r1 & 2
            boolean r1 = X.AnonymousClass000.A1O(r1)
            java.lang.String r6 = "vote"
            X.9tJ r2 = A0N(r6, r5, r1)
            if (r2 != 0) goto L_0x078a
            X.8ZE r3 = r7.vote_
            if (r3 != 0) goto L_0x074a
            X.8ZE r3 = X.AnonymousClass8ZE.DEFAULT_INSTANCE
        L_0x074a:
            X.C18070vi.A0X(r3)
            int r1 = r3.bitField0_
            boolean r2 = X.AnonymousClass8BW.A1Q(r1)
            java.lang.String r1 = "enc_payload"
            X.9tJ r1 = A0N(r1, r5, r2)
            if (r1 != 0) goto L_0x0776
            int r1 = r3.bitField0_
            r1 = r1 & 2
            boolean r1 = X.AnonymousClass000.A1O(r1)
            java.lang.String r4 = "enc_iv"
            X.9tJ r1 = A0N(r4, r5, r1)
            if (r1 != 0) goto L_0x0776
            X.DSQ r3 = r3.encIv_
            X.C18070vi.A0X(r3)
            r1 = 12
            X.9tJ r1 = A01(r3, r4, r5, r1)
        L_0x0776:
            X.9tJ r2 = A0M(r1, r6)
            if (r2 != 0) goto L_0x078a
            int r1 = r7.bitField0_
            r1 = r1 & 8
            boolean r2 = X.AnonymousClass000.A1O(r1)
            java.lang.String r1 = "sender_timestamp_ms"
            X.9tJ r2 = A0N(r1, r5, r2)
        L_0x078a:
            java.lang.String r1 = "poll_update_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0792:
            int r1 = r0.bitField1_
            r1 = r1 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x07aa
            X.8Xc r1 = r0.documentWithCaptionMessage_
            if (r1 != 0) goto L_0x079e
            X.8Xc r1 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x079e:
            X.9tJ r2 = A06(r1)
            java.lang.String r1 = "document_with_caption_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x07aa:
            int r1 = r0.bitField1_
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x07d1
            X.8Xo r2 = r0.requestPhoneNumberMessage_
            if (r2 != 0) goto L_0x07b6
            X.8Xo r2 = X.C164108Xo.DEFAULT_INSTANCE
        L_0x07b6:
            X.C18070vi.A0X(r2)
            int r1 = r2.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0b3e
            X.8cd r1 = r2.contextInfo_
            if (r1 != 0) goto L_0x07c5
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x07c5:
            X.9tJ r2 = A02(r1)
        L_0x07c9:
            java.lang.String r1 = "request_phone_number_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x07d1:
            int r1 = r0.bitField1_
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x07e9
            X.8Xc r1 = r0.viewOnceMessageV2_
            if (r1 != 0) goto L_0x07dd
            X.8Xc r1 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x07dd:
            X.9tJ r2 = A06(r1)
            java.lang.String r1 = "view_once_message_v2"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x07e9:
            int r1 = r0.bitField1_
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x082e
            X.8a4 r4 = r0.encReactionMessage_
            if (r4 != 0) goto L_0x07f5
            X.8a4 r4 = X.C164788a4.DEFAULT_INSTANCE
        L_0x07f5:
            X.C18070vi.A0X(r4)
            int r1 = r4.bitField0_
            boolean r2 = X.AnonymousClass8BW.A1Q(r1)
            java.lang.String r1 = "target_message_key"
            r3 = 11
            X.9tJ r2 = A0N(r1, r3, r2)
            if (r2 != 0) goto L_0x0826
            int r1 = r4.bitField0_
            r1 = r1 & 2
            boolean r2 = X.AnonymousClass000.A1O(r1)
            java.lang.String r1 = "enc_payload"
            X.9tJ r2 = A0N(r1, r3, r2)
            if (r2 != 0) goto L_0x0826
            int r1 = r4.bitField0_
            r1 = r1 & 4
            boolean r2 = X.AnonymousClass000.A1O(r1)
            java.lang.String r1 = "enc_iv"
            X.9tJ r2 = A0N(r1, r3, r2)
        L_0x0826:
            java.lang.String r1 = "enc_reaction_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x082e:
            int r1 = r0.bitField1_
            r1 = r1 & 8192(0x2000, float:1.14794E-41)
            boolean r1 = X.AnonymousClass000.A1O(r1)
            if (r1 == 0) goto L_0x084a
            X.8Xc r1 = r0.editedMessage_
            if (r1 != 0) goto L_0x083e
            X.8Xc r1 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x083e:
            X.9tJ r2 = A06(r1)
            java.lang.String r1 = "edited_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x084a:
            int r1 = r0.bitField1_
            r1 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0862
            X.8Xc r1 = r0.viewOnceMessageV2Extension_
            if (r1 != 0) goto L_0x0856
            X.8Xc r1 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x0856:
            X.9tJ r2 = A06(r1)
            java.lang.String r1 = "view_once_message_v2_extension"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0862:
            int r2 = r0.bitField1_
            r1 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x087f
            X.8bx r1 = r0.pollCreationMessageV2_
            if (r1 != 0) goto L_0x0870
            X.8bx r1 = X.C165908bx.DEFAULT_INSTANCE
        L_0x0870:
            X.C18070vi.A0X(r1)
            X.9tJ r2 = A0E(r1)
            java.lang.String r1 = "poll_creation_message_v2"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x087f:
            int r2 = r0.bitField1_
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x08b4
            X.8aH r4 = r0.scheduledCallCreationMessage_
            if (r4 != 0) goto L_0x088c
            X.8aH r4 = X.C164918aH.DEFAULT_INSTANCE
        L_0x088c:
            X.C18070vi.A0X(r4)
            r3 = 0
            int r1 = r4.bitField0_
            boolean r2 = X.AnonymousClass8BW.A1Q(r1)
            java.lang.String r1 = "scheduled_timestamp_ms"
            X.9tJ r2 = A0N(r1, r3, r2)
            if (r2 != 0) goto L_0x08ac
            int r1 = r4.bitField0_
            r1 = r1 & 4
            boolean r2 = X.AnonymousClass000.A1O(r1)
            java.lang.String r1 = "title"
            X.9tJ r2 = A0N(r1, r3, r2)
        L_0x08ac:
            java.lang.String r1 = "scheduled_call_creation_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x08b4:
            int r2 = r0.bitField1_
            r1 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 & r1
            boolean r1 = X.AnonymousClass000.A1O(r2)
            if (r1 == 0) goto L_0x08d1
            X.8Xc r1 = r0.groupMentionedMessage_
            if (r1 != 0) goto L_0x08c5
            X.8Xc r1 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x08c5:
            X.9tJ r2 = A06(r1)
            java.lang.String r1 = "group_mentioned_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x08d1:
            int r2 = r0.bitField1_
            r1 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x08ed
            X.8bx r1 = r0.pollCreationMessageV3_
            if (r1 != 0) goto L_0x08de
            X.8bx r1 = X.C165908bx.DEFAULT_INSTANCE
        L_0x08de:
            X.C18070vi.A0X(r1)
            X.9tJ r2 = A0E(r1)
            java.lang.String r1 = "poll_creation_message_v3"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x08ed:
            int r2 = r0.bitField1_
            r1 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x0909
            X.8ca r1 = r0.ptvMessage_
            if (r1 != 0) goto L_0x08fa
            X.8ca r1 = X.C166248ca.DEFAULT_INSTANCE
        L_0x08fa:
            X.C18070vi.A0X(r1)
            X.9tJ r2 = A0K(r1)
            java.lang.String r1 = "ptv_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0909:
            int r2 = r0.bitField1_
            r1 = 4194304(0x400000, float:5.877472E-39)
            r2 = r2 & r1
            boolean r1 = X.AnonymousClass000.A1O(r2)
            if (r1 == 0) goto L_0x0926
            X.8Xc r1 = r0.botInvokeMessage_
            if (r1 != 0) goto L_0x091a
            X.8Xc r1 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x091a:
            X.9tJ r2 = A06(r1)
            java.lang.String r1 = "bot_invoke_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0926:
            int r2 = r0.bitField1_
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x094e
            X.8bv r2 = r0.messageHistoryBundle_
            if (r2 != 0) goto L_0x0933
            X.8bv r2 = X.C165888bv.DEFAULT_INSTANCE
        L_0x0933:
            X.C18070vi.A0X(r2)
            int r1 = r2.bitField0_
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0b3b
            X.8cd r1 = r2.contextInfo_
            if (r1 != 0) goto L_0x0942
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x0942:
            X.9tJ r2 = A02(r1)
        L_0x0946:
            java.lang.String r1 = "message_history_bundle"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x094e:
            int r2 = r0.bitField1_
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r2 = r2 & r1
            boolean r1 = X.AnonymousClass000.A1O(r2)
            if (r1 == 0) goto L_0x096b
            X.8Xc r1 = r0.lottieStickerMessage_
            if (r1 != 0) goto L_0x095f
            X.8Xc r1 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x095f:
            X.9tJ r2 = A06(r1)
            java.lang.String r1 = "lottie_sticker_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x096b:
            int r2 = r0.bitField1_
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r1
            boolean r1 = X.AnonymousClass000.A1O(r2)
            if (r1 == 0) goto L_0x099d
            X.8c4 r3 = r0.eventMessage_
            if (r3 != 0) goto L_0x097c
            X.8c4 r3 = X.AnonymousClass8c4.DEFAULT_INSTANCE
        L_0x097c:
            X.C18070vi.A0X(r3)
            int r1 = r3.bitField0_
            boolean r1 = X.AnonymousClass8BW.A1Q(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0b20
            X.8cd r1 = r3.contextInfo_
            if (r1 != 0) goto L_0x098e
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x098e:
            X.9tJ r1 = A02(r1)
            if (r1 == 0) goto L_0x0b20
            r2 = r1
        L_0x0995:
            java.lang.String r1 = "event_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x099d:
            int r2 = r0.bitField1_
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x09ce
            X.8Yz r3 = r0.commentMessage_
            if (r3 != 0) goto L_0x09aa
            X.8Yz r3 = X.C164478Yz.DEFAULT_INSTANCE
        L_0x09aa:
            X.C18070vi.A0X(r3)
            java.lang.String r2 = "message"
            int r1 = r3.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0b1d
            X.8cr r1 = r3.message_
            if (r1 != 0) goto L_0x09bb
            X.8cr r1 = X.C166418cr.DEFAULT_INSTANCE
        L_0x09bb:
            X.C18070vi.A0X(r1)
            X.9tJ r1 = A0L(r1)
            X.9tJ r2 = A0M(r1, r2)
        L_0x09c6:
            java.lang.String r1 = "comment_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x09ce:
            int r2 = r0.bitField1_
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x09f6
            X.8bZ r2 = r0.newsletterAdminInviteMessage_
            if (r2 != 0) goto L_0x09db
            X.8bZ r2 = X.C165668bZ.DEFAULT_INSTANCE
        L_0x09db:
            X.C18070vi.A0X(r2)
            int r1 = r2.bitField0_
            r1 = r1 & 32
            if (r1 == 0) goto L_0x0b1a
            X.8cd r1 = r2.contextInfo_
            if (r1 != 0) goto L_0x09ea
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x09ea:
            X.9tJ r2 = A02(r1)
        L_0x09ee:
            java.lang.String r1 = "newsletter_admin_invite_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x09f6:
            int r1 = r0.bitField2_
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0a1d
            X.8al r2 = r0.albumMessage_
            if (r2 != 0) goto L_0x0a02
            X.8al r2 = X.C165208al.DEFAULT_INSTANCE
        L_0x0a02:
            X.C18070vi.A0X(r2)
            int r1 = r2.bitField0_
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0b17
            X.8cd r1 = r2.contextInfo_
            if (r1 != 0) goto L_0x0a11
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x0a11:
            X.9tJ r2 = A02(r1)
        L_0x0a15:
            java.lang.String r1 = "album_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0a1d:
            int r1 = r0.bitField2_
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0a35
            X.8Xc r1 = r0.eventCoverImage_
            if (r1 != 0) goto L_0x0a29
            X.8Xc r1 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x0a29:
            X.9tJ r2 = A06(r1)
            java.lang.String r1 = "event_cover_image"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0a35:
            int r1 = r0.bitField2_
            r1 = r1 & 16
            if (r1 == 0) goto L_0x0a5c
            X.8cY r2 = r0.stickerPackMessage_
            if (r2 != 0) goto L_0x0a41
            X.8cY r2 = X.C166228cY.DEFAULT_INSTANCE
        L_0x0a41:
            X.C18070vi.A0X(r2)
            int r1 = r2.bitField0_
            r1 = r1 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0b14
            X.8cd r1 = r2.contextInfo_
            if (r1 != 0) goto L_0x0a50
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x0a50:
            X.9tJ r2 = A02(r1)
        L_0x0a54:
            java.lang.String r1 = "sticker_pack_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0a5c:
            int r1 = r0.bitField2_
            r1 = r1 & 32
            if (r1 == 0) goto L_0x0a74
            X.8Xc r1 = r0.statusMentionMessage_
            if (r1 != 0) goto L_0x0a68
            X.8Xc r1 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x0a68:
            X.9tJ r2 = A06(r1)
            java.lang.String r1 = "status_mention_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0a74:
            int r1 = r0.bitField2_
            r1 = r1 & 64
            if (r1 == 0) goto L_0x0a9b
            X.8aF r2 = r0.pollResultSnapshotMessage_
            if (r2 != 0) goto L_0x0a80
            X.8aF r2 = X.C164898aF.DEFAULT_INSTANCE
        L_0x0a80:
            X.C18070vi.A0X(r2)
            int r1 = r2.bitField0_
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0b12
            X.8cd r1 = r2.contextInfo_
            if (r1 != 0) goto L_0x0a8f
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x0a8f:
            X.9tJ r2 = A02(r1)
        L_0x0a93:
            java.lang.String r1 = "poll_result_snapshot_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0a9b:
            int r1 = r0.bitField2_
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0ab3
            X.8Xc r1 = r0.pollCreationOptionImageMessage_
            if (r1 != 0) goto L_0x0aa7
            X.8Xc r1 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x0aa7:
            X.9tJ r2 = A06(r1)
            java.lang.String r1 = "poll_creation_option_image_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0ab3:
            int r1 = r0.bitField2_
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0acb
            X.8Xc r1 = r0.associatedChildMessage_
            if (r1 != 0) goto L_0x0abf
            X.8Xc r1 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x0abf:
            X.9tJ r2 = A06(r1)
            java.lang.String r1 = "associated_child_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0acb:
            int r1 = r0.bitField2_
            r1 = r1 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0ae3
            X.8Xc r1 = r0.groupStatusMentionMessage_
            if (r1 != 0) goto L_0x0ad7
            X.8Xc r1 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x0ad7:
            X.9tJ r2 = A06(r1)
            java.lang.String r1 = "group_status_mention_message"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0ae3:
            int r1 = r0.bitField2_
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0afb
            X.8Xc r1 = r0.pollCreationMessageV4_
            if (r1 != 0) goto L_0x0aef
            X.8Xc r1 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x0aef:
            X.9tJ r2 = A06(r1)
            java.lang.String r1 = "poll_creation_message_v4"
            X.9tJ r1 = A0M(r2, r1)
            if (r1 != 0) goto L_0x0cc8
        L_0x0afb:
            int r1 = r0.bitField2_
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0b11
            X.8Xc r0 = r0.pollCreationMessageV5_
            if (r0 != 0) goto L_0x0b07
            X.8Xc r0 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x0b07:
            X.9tJ r1 = A06(r0)
            java.lang.String r0 = "poll_creation_message_v5"
            X.9tJ r12 = A0M(r1, r0)
        L_0x0b11:
            return r12
        L_0x0b12:
            r2 = 0
            goto L_0x0a93
        L_0x0b14:
            r2 = 0
            goto L_0x0a54
        L_0x0b17:
            r2 = 0
            goto L_0x0a15
        L_0x0b1a:
            r2 = 0
            goto L_0x09ee
        L_0x0b1d:
            r2 = 0
            goto L_0x09c6
        L_0x0b20:
            int r1 = r3.bitField0_
            r1 = r1 & 16
            if (r1 == 0) goto L_0x0995
            X.8cE r1 = r3.location_
            if (r1 != 0) goto L_0x0b2c
            X.8cE r1 = X.C166028cE.DEFAULT_INSTANCE
        L_0x0b2c:
            X.C18070vi.A0X(r1)
            X.9tJ r2 = A0C(r1)
            java.lang.String r1 = "location"
            X.9tJ r2 = A0M(r2, r1)
            goto L_0x0995
        L_0x0b3b:
            r2 = 0
            goto L_0x0946
        L_0x0b3e:
            r2 = 0
            goto L_0x07c9
        L_0x0b41:
            r2 = 0
            goto L_0x06e8
        L_0x0b44:
            int r1 = r4.bitField0_
            r1 = r1 & 4
            if (r1 == 0) goto L_0x06f1
            X.8cd r1 = r4.contextInfo_
            if (r1 != 0) goto L_0x0b50
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x0b50:
            X.9tJ r3 = A02(r1)
            goto L_0x06f1
        L_0x0b56:
            r2 = 0
            goto L_0x06ae
        L_0x0b59:
            r2 = 0
            goto L_0x0667
        L_0x0b5c:
            int r1 = r4.bitField0_
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0b76
            X.8cd r1 = r4.contextInfo_
            if (r1 != 0) goto L_0x0b68
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x0b68:
            boolean r1 = r1.isForwarded_
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = X.C72463Mc.A1Y(r1)
            if (r1 == 0) goto L_0x0b76
            goto L_0x05f4
        L_0x0b76:
            java.lang.String r13 = "E2E.Message.ButtonsMessage"
            java.lang.String r15 = "(has(content_text) && size(content_text) > 0 && size(buttons) > 0) || (has(context_info) && context_info.is_forwarded == true)"
            java.lang.String r16 = "content_text and buttons are required unless is_forwarded == true"
            r17 = 11
            X.9tJ r11 = new X.9tJ
            r14 = r12
            r11.<init>(r12, r13, r14, r15, r16, r17)
        L_0x0b84:
            r3 = r11
            goto L_0x0640
        L_0x0b87:
            java.lang.String r13 = "E2E.Message.ListResponseMessage"
            java.lang.String r15 = "(!has(list_type) || list_type != 0) && size(title) > 0"
            java.lang.String r16 = "list_type = UNKNOWN must have title"
            r17 = 11
            X.9tJ r11 = new X.9tJ
            r14 = r12
            r11.<init>(r12, r13, r14, r15, r16, r17)
            goto L_0x059a
        L_0x0b97:
            X.9Jf r1 = X.AnonymousClass9Jf.SINGLE_SELECT
            goto L_0x056d
        L_0x0b9b:
            X.9Jf r1 = X.AnonymousClass9Jf.UNKNOWN
            goto L_0x056d
        L_0x0b9f:
            r2 = 0
            goto L_0x053f
        L_0x0ba2:
            int r1 = r4.bitField0_
            r1 = r1 & 2
            boolean r1 = X.AnonymousClass000.A1O(r1)
            java.lang.String r2 = "description"
            r6 = 11
            X.9tJ r11 = A0N(r2, r6, r1)
            if (r11 != 0) goto L_0x04fd
            java.lang.String r1 = r4.description_
            X.C18070vi.A0X(r1)
            X.9tJ r11 = A0O(r1, r2)
            if (r11 != 0) goto L_0x04fd
            int r1 = r4.bitField0_
            r1 = r1 & 16
            if (r1 == 0) goto L_0x0c4d
            X.8aB r10 = r4.productListInfo_
            if (r10 != 0) goto L_0x0bcb
            X.8aB r10 = X.C164858aB.DEFAULT_INSTANCE
        L_0x0bcb:
            X.C18070vi.A0X(r10)
            X.EE9 r1 = r10.productSections_
            X.C18070vi.A0X(r1)
            java.lang.String r9 = "product_sections"
            X.9tJ r2 = A0R(r9, r1)
            if (r2 != 0) goto L_0x0c45
            X.EE9 r1 = r10.productSections_
            java.util.Iterator r11 = X.AnonymousClass8BS.A0r(r1)
        L_0x0be1:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0c61
            java.lang.Object r2 = r11.next()
            X.8Z6 r2 = (X.AnonymousClass8Z6) r2
            X.C72453Mb.A1R(r2)
            X.EE9 r1 = r2.products_
            X.C18070vi.A0X(r1)
            java.lang.String r8 = "products"
            X.9tJ r1 = A0R(r8, r1)
            if (r1 != 0) goto L_0x0c31
            X.EE9 r1 = r2.products_
            java.util.Iterator r7 = X.AnonymousClass8BS.A0r(r1)
        L_0x0c03:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0c5f
            java.lang.Object r5 = r7.next()
            X.8Xh r5 = (X.C164038Xh) r5
            X.C72453Mb.A1R(r5)
            int r1 = r5.bitField0_
            boolean r1 = X.AnonymousClass8BW.A1Q(r1)
            java.lang.String r2 = "product_id"
            X.9tJ r1 = A0N(r2, r6, r1)
            if (r1 != 0) goto L_0x0c2b
            java.lang.String r1 = r5.productId_
            X.C18070vi.A0X(r1)
            X.9tJ r1 = A0O(r1, r2)
            if (r1 == 0) goto L_0x0c03
        L_0x0c2b:
            X.9tJ r1 = A0M(r1, r8)
            if (r1 == 0) goto L_0x0be1
        L_0x0c31:
            X.9tJ r2 = A0M(r1, r9)
            if (r2 != 0) goto L_0x0c45
            int r1 = r10.bitField0_
            r1 = r1 & 2
            boolean r2 = X.AnonymousClass000.A1O(r1)
            java.lang.String r1 = "business_owner_jid"
            X.9tJ r2 = A0N(r1, r6, r2)
        L_0x0c45:
            java.lang.String r1 = "product_list_info"
            X.9tJ r11 = A0M(r2, r1)
            if (r11 != 0) goto L_0x04fd
        L_0x0c4d:
            int r1 = r4.bitField0_
            r1 = r1 & 64
            if (r1 == 0) goto L_0x04fe
            X.8cd r1 = r4.contextInfo_
            if (r1 != 0) goto L_0x0c59
            X.8cd r1 = X.C166278cd.DEFAULT_INSTANCE
        L_0x0c59:
            X.9tJ r3 = A02(r1)
            goto L_0x04fe
        L_0x0c5f:
            r1 = 0
            goto L_0x0c2b
        L_0x0c61:
            r1 = 0
            goto L_0x0c31
        L_0x0c63:
            java.lang.String r13 = "E2E.Message.ListMessage"
            java.lang.String r15 = "list_type != 1 || (size(button_text) > 0 && size(sections) > 0)"
            java.lang.String r16 = "SINGLE_SELECT must have button_text and sections"
            goto L_0x04f5
        L_0x0c6b:
            int r1 = r7.bitField0_
            r1 = r1 & 32
            if (r1 == 0) goto L_0x0481
            X.DSQ r2 = r7.botMessageSecret_
            X.C18070vi.A0X(r2)
            java.lang.String r1 = "bot_message_secret"
            X.9tJ r5 = A01(r2, r1, r6, r3)
            goto L_0x0481
        L_0x0c7e:
            r2 = 0
            goto L_0x0448
        L_0x0c81:
            r2 = 0
            goto L_0x03f7
        L_0x0c84:
            r2 = 0
            goto L_0x03cf
        L_0x0c87:
            int r1 = r3.bitField0_
            r1 = r1 & 4
            if (r1 == 0) goto L_0x036c
            long r4 = r3.amount1000_
            java.lang.String r14 = "amount_1000"
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = X.AnonymousClass04C.A00(r4, r2)
            if (r1 <= 0) goto L_0x036c
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r1 = "Expected uint64 less or equal to "
            java.lang.String r16 = A0S(r1, r4, r2)
            r17 = 11
            X.9tJ r11 = new X.9tJ
            r13 = r12
            r15 = r12
            r11.<init>(r12, r13, r14, r15, r16, r17)
            goto L_0x036c
        L_0x0cb1:
            r2 = 0
            goto L_0x0331
        L_0x0cb4:
            r2 = 0
            goto L_0x0305
        L_0x0cb7:
            r2 = r12
            goto L_0x02b4
        L_0x0cba:
            r1 = r12
            goto L_0x029e
        L_0x0cbd:
            r7 = r12
            goto L_0x0129
        L_0x0cc0:
            r2 = 0
            goto L_0x0075
        L_0x0cc3:
            r2 = 0
            goto L_0x003c
        L_0x0cc6:
            r0 = move-exception
            throw r0
        L_0x0cc8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A9A.A0L(X.8cr):X.9tJ");
    }

    public static final C195419tJ A0M(C195419tJ r6, String str) {
        C195419tJ r1 = r6;
        if (r6 == null) {
            return null;
        }
        return new C195419tJ(r1, (String) null, str, (String) null, "Referenced message is invalid", 11);
    }

    public static final C195419tJ A00(long j) {
        if (AnonymousClass04C.A00(j, 0) > 0) {
            return null;
        }
        return new C195419tJ((C195419tJ) null, (String) null, "file_length", (String) null, A0S("Expected uint64 greater than ", AnonymousClass000.A10(), 0), 13);
    }

    public static final C195419tJ A05(C166208cW r2) {
        if ((r2.bitField0_ & 65536) == 0) {
            return null;
        }
        C166278cd r0 = r2.contextInfo_;
        if (r0 == null) {
            r0 = C166278cd.DEFAULT_INSTANCE;
        }
        return A02(r0);
    }

    public static final C195419tJ A07(C165948c5 r1) {
        if ((r1.bitField0_ & 64) == 0) {
            return null;
        }
        C166348ck r0 = r1.hydratedHsm_;
        if (r0 == null) {
            r0 = C166348ck.DEFAULT_INSTANCE;
        }
        C18070vi.A0X(r0);
        return A0M(A0I(r0), "hydrated_hsm");
    }

    public static final C195419tJ A0C(C166028cE r1) {
        if ((r1.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) == 0) {
            return null;
        }
        C166278cd r0 = r1.contextInfo_;
        if (r0 == null) {
            r0 = C166278cd.DEFAULT_INSTANCE;
        }
        return A02(r0);
    }

    public static final C195419tJ A0E(C165908bx r11) {
        C195419tJ r1;
        if (AnonymousClass000.A1O(r11.bitField0_ & 4)) {
            int i = r11.selectableOptionsCount_;
            if (((long) i) >= 0) {
                Integer valueOf = Integer.valueOf(i);
                EE9 ee9 = r11.options_;
                C18070vi.A0X(ee9);
                if (valueOf.compareTo(AnonymousClass8BT.A0l(ee9)) <= 0) {
                    C195419tJ A0N = A0N(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, 11, AnonymousClass000.A1O(r11.bitField0_ & 2));
                    if (A0N != null) {
                        return A0N;
                    }
                    String str = r11.name_;
                    C18070vi.A0X(str);
                    C195419tJ A0O = A0O(str, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    if (A0O != null) {
                        return A0O;
                    }
                    String str2 = r11.name_;
                    C18070vi.A0X(str2);
                    C195419tJ A0P = A0P(str2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, 11, 5000);
                    if (A0P != null) {
                        return A0P;
                    }
                    Iterator A0r = AnonymousClass8BS.A0r(r11.options_);
                    while (true) {
                        if (!A0r.hasNext()) {
                            r1 = null;
                            break;
                        }
                        AnonymousClass8ZD r0 = (AnonymousClass8ZD) A0r.next();
                        C18070vi.A0b(r0);
                        r1 = A0D(r0);
                        if (r1 != null) {
                            break;
                        }
                    }
                    C195419tJ A0M = A0M(r1, "options");
                    if (A0M != null) {
                        return A0M;
                    }
                    if ((r11.bitField0_ & 8) != 0) {
                        C166278cd r02 = r11.contextInfo_;
                        if (r02 == null) {
                            r02 = C166278cd.DEFAULT_INSTANCE;
                        }
                        C195419tJ A02 = A02(r02);
                        if (A02 != null) {
                            return A02;
                        }
                    }
                    if ((r11.bitField0_ & 64) == 0) {
                        return null;
                    }
                    AnonymousClass8ZD r03 = r11.correctAnswer_;
                    if (r03 == null) {
                        r03 = AnonymousClass8ZD.DEFAULT_INSTANCE;
                    }
                    C18070vi.A0X(r03);
                    return A0M(A0D(r03), "correct_answer");
                }
            }
        }
        return new C195419tJ((C195419tJ) null, "E2E.Message.PollCreationMessage", (String) null, "has(selectable_options_count) && selectable_options_count >= 0 && selectable_options_count <= size(options)", "Rule violated", 11);
    }

    public static final C195419tJ A0G(C166218cX r11) {
        if (AnonymousClass000.A1O(r11.bitField0_ & 2)) {
            DSQ dsq = r11.fileSha256_;
            C18070vi.A0X(dsq);
            C195419tJ A012 = A01(dsq, "file_sha256", 14, 32);
            if (A012 != null) {
                return A012;
            }
        }
        if ((r11.bitField0_ & 4) != 0) {
            DSQ dsq2 = r11.fileEncSha256_;
            C18070vi.A0X(dsq2);
            C195419tJ A013 = A01(dsq2, "file_enc_sha256", 14, 32);
            if (A013 != null) {
                return A013;
            }
        }
        int i = r11.bitField0_;
        if ((i & 256) != 0 && AnonymousClass04C.A00(r11.fileLength_, 0) < 0) {
            return new C195419tJ((C195419tJ) null, (String) null, "file_length", (String) null, A0S("Expected uint64 greater or equal to ", AnonymousClass000.A10(), 0), 13);
        }
        if ((i & 16384) == 0) {
            return null;
        }
        C166278cd r0 = r11.contextInfo_;
        if (r0 == null) {
            r0 = C166278cd.DEFAULT_INSTANCE;
        }
        return A02(r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r0 == null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C195419tJ A0H(X.C165868bt r3) {
        /*
            int r1 = r3.titleCase_
            boolean r0 = X.C17890vO.A1R(r1)
            r2 = 0
            if (r0 == 0) goto L_0x0016
            r0 = 1
            if (r1 != r0) goto L_0x0042
            java.lang.Object r0 = r3.title_
            X.8cW r0 = (X.C166208cW) r0
        L_0x0010:
            X.9tJ r0 = A04(r0)
            if (r0 != 0) goto L_0x0045
        L_0x0016:
            int r1 = r3.titleCase_
            r0 = 3
            if (r1 != r0) goto L_0x0025
            java.lang.Object r0 = r3.title_
            X.8cc r0 = (X.C166268cc) r0
            X.9tJ r0 = A08(r0)
            if (r0 != 0) goto L_0x0045
        L_0x0025:
            int r1 = r3.titleCase_
            r0 = 4
            if (r1 != r0) goto L_0x0034
            java.lang.Object r0 = r3.title_
            X.8ca r0 = (X.C166248ca) r0
            X.9tJ r0 = A0J(r0)
            if (r0 != 0) goto L_0x0045
        L_0x0034:
            int r1 = r3.titleCase_
            r0 = 5
            if (r1 != r0) goto L_0x0041
            java.lang.Object r0 = r3.title_
            X.8cE r0 = (X.C166028cE) r0
            X.9tJ r2 = A0B(r0)
        L_0x0041:
            return r2
        L_0x0042:
            X.8cW r0 = X.C166208cW.DEFAULT_INSTANCE
            goto L_0x0010
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A9A.A0H(X.8bt):X.9tJ");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01ef, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r1 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r1 == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009f, code lost:
        if (r1 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0156, code lost:
        if (r0 == null) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x016e, code lost:
        if (r0 == null) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0186, code lost:
        if (r0 == null) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r1 == null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0198, code lost:
        if (r0 == null) goto L_0x019a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0149 A[EDGE_INSN: B:114:0x0149->B:76:0x0149 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0149 A[EDGE_INSN: B:116:0x0149->B:76:0x0149 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x00a7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C195419tJ A0I(X.C166348ck r8) {
        /*
            int r0 = r8.formatCase_
            boolean r0 = X.C17890vO.A1R(r0)
            r7 = 0
            if (r0 == 0) goto L_0x0158
            X.8bV r2 = r8.A0R()
            X.C18070vi.A0X(r2)
            int r1 = r2.titleCase_
            boolean r0 = X.C17890vO.A1R(r1)
            r3 = 0
            if (r0 == 0) goto L_0x0026
            r0 = 1
            if (r1 != r0) goto L_0x01eb
            java.lang.Object r0 = r2.title_
            X.8cW r0 = (X.C166208cW) r0
        L_0x0020:
            X.9tJ r1 = A04(r0)
            if (r1 != 0) goto L_0x0150
        L_0x0026:
            int r1 = r2.titleCase_
            r0 = 2
            if (r1 != r0) goto L_0x003e
            java.lang.Object r0 = r2.title_
            X.8c5 r0 = (X.C165948c5) r0
            X.C18070vi.A0X(r0)
            X.9tJ r1 = A07(r0)
            java.lang.String r0 = "highly_structured_message"
            X.9tJ r1 = A0M(r1, r0)
            if (r1 != 0) goto L_0x0150
        L_0x003e:
            int r1 = r2.titleCase_
            r0 = 3
            if (r1 != r0) goto L_0x004d
            java.lang.Object r0 = r2.title_
            X.8cc r0 = (X.C166268cc) r0
            X.9tJ r1 = A08(r0)
            if (r1 != 0) goto L_0x0150
        L_0x004d:
            int r1 = r2.titleCase_
            r0 = 4
            if (r1 != r0) goto L_0x005c
            java.lang.Object r0 = r2.title_
            X.8ca r0 = (X.C166248ca) r0
            X.9tJ r1 = A0J(r0)
            if (r1 != 0) goto L_0x0150
        L_0x005c:
            int r1 = r2.titleCase_
            r0 = 5
            if (r1 != r0) goto L_0x006b
            java.lang.Object r0 = r2.title_
            X.8cE r0 = (X.C166028cE) r0
            X.9tJ r1 = A0B(r0)
            if (r1 != 0) goto L_0x0150
        L_0x006b:
            int r0 = r2.bitField0_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0086
            X.8c5 r0 = r2.content_
            if (r0 != 0) goto L_0x0077
            X.8c5 r0 = X.C165948c5.DEFAULT_INSTANCE
        L_0x0077:
            X.C18070vi.A0X(r0)
            X.9tJ r1 = A07(r0)
            java.lang.String r0 = "content"
            X.9tJ r1 = A0M(r1, r0)
            if (r1 != 0) goto L_0x0150
        L_0x0086:
            int r0 = r2.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x00a1
            X.8c5 r0 = r2.footer_
            if (r0 != 0) goto L_0x0092
            X.8c5 r0 = X.C165948c5.DEFAULT_INSTANCE
        L_0x0092:
            X.C18070vi.A0X(r0)
            X.9tJ r1 = A07(r0)
            java.lang.String r0 = "footer"
            X.9tJ r1 = A0M(r1, r0)
            if (r1 != 0) goto L_0x0150
        L_0x00a1:
            X.EE9 r0 = r2.buttons_
            java.util.Iterator r6 = X.AnonymousClass8BS.A0r(r0)
        L_0x00a7:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x014a
            java.lang.Object r4 = r6.next()
            X.8ae r4 = (X.C165138ae) r4
            X.C72453Mb.A1R(r4)
            int r1 = r4.buttonCase_
            r0 = 1
            if (r1 != r0) goto L_0x00e3
            java.lang.Object r1 = r4.button_
            X.8ZK r1 = (X.AnonymousClass8ZK) r1
            X.C18070vi.A0X(r1)
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01e8
            X.8c5 r0 = r1.displayText_
            if (r0 != 0) goto L_0x00ce
            X.8c5 r0 = X.C165948c5.DEFAULT_INSTANCE
        L_0x00ce:
            X.C18070vi.A0X(r0)
            X.9tJ r1 = A07(r0)
            java.lang.String r0 = "display_text"
            X.9tJ r1 = A0M(r1, r0)
        L_0x00db:
            java.lang.String r0 = "quick_reply_button"
            X.9tJ r0 = A0M(r1, r0)
            if (r0 != 0) goto L_0x0149
        L_0x00e3:
            int r1 = r4.buttonCase_
            r0 = 2
            if (r1 != r0) goto L_0x0116
            java.lang.Object r5 = r4.button_
            X.8ZL r5 = (X.AnonymousClass8ZL) r5
            X.C18070vi.A0X(r5)
            int r0 = r5.bitField0_
            boolean r0 = X.AnonymousClass8BW.A1Q(r0)
            r2 = 0
            if (r0 == 0) goto L_0x01cd
            X.8c5 r0 = r5.displayText_
            if (r0 != 0) goto L_0x00fe
            X.8c5 r0 = X.C165948c5.DEFAULT_INSTANCE
        L_0x00fe:
            X.C18070vi.A0X(r0)
            X.9tJ r1 = A07(r0)
            java.lang.String r0 = "display_text"
            X.9tJ r0 = A0M(r1, r0)
            if (r0 == 0) goto L_0x01cd
            r2 = r0
        L_0x010e:
            java.lang.String r0 = "url_button"
            X.9tJ r0 = A0M(r2, r0)
            if (r0 != 0) goto L_0x0149
        L_0x0116:
            int r1 = r4.buttonCase_
            r0 = 3
            if (r1 != r0) goto L_0x00a7
            java.lang.Object r4 = r4.button_
            X.8ZJ r4 = (X.AnonymousClass8ZJ) r4
            X.C18070vi.A0X(r4)
            int r0 = r4.bitField0_
            boolean r0 = X.AnonymousClass8BW.A1Q(r0)
            r2 = 0
            if (r0 == 0) goto L_0x01b2
            X.8c5 r0 = r4.displayText_
            if (r0 != 0) goto L_0x0131
            X.8c5 r0 = X.C165948c5.DEFAULT_INSTANCE
        L_0x0131:
            X.C18070vi.A0X(r0)
            X.9tJ r1 = A07(r0)
            java.lang.String r0 = "display_text"
            X.9tJ r0 = A0M(r1, r0)
            if (r0 == 0) goto L_0x01b2
            r2 = r0
        L_0x0141:
            java.lang.String r0 = "call_button"
            X.9tJ r0 = A0M(r2, r0)
            if (r0 == 0) goto L_0x00a7
        L_0x0149:
            r3 = r0
        L_0x014a:
            java.lang.String r0 = "buttons"
            X.9tJ r1 = A0M(r3, r0)
        L_0x0150:
            java.lang.String r0 = "four_row_template"
            X.9tJ r0 = A0M(r1, r0)
            if (r0 != 0) goto L_0x01ef
        L_0x0158:
            int r1 = r8.formatCase_
            r0 = 2
            if (r1 != r0) goto L_0x0170
            java.lang.Object r0 = r8.format_
            X.8bt r0 = (X.C165868bt) r0
            X.C18070vi.A0X(r0)
            X.9tJ r1 = A0H(r0)
            java.lang.String r0 = "hydrated_four_row_template"
            X.9tJ r0 = A0M(r1, r0)
            if (r0 != 0) goto L_0x01ef
        L_0x0170:
            int r1 = r8.formatCase_
            r0 = 5
            if (r1 != r0) goto L_0x0188
            java.lang.Object r0 = r8.format_
            X.8cp r0 = (X.C166398cp) r0
            X.C18070vi.A0X(r0)
            X.9tJ r1 = A0A(r0)
            java.lang.String r0 = "interactive_message_template"
            X.9tJ r0 = A0M(r1, r0)
            if (r0 != 0) goto L_0x01ef
        L_0x0188:
            int r0 = r8.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x019a
            X.8cd r0 = r8.contextInfo_
            if (r0 != 0) goto L_0x0194
            X.8cd r0 = X.C166278cd.DEFAULT_INSTANCE
        L_0x0194:
            X.9tJ r0 = A02(r0)
            if (r0 != 0) goto L_0x01ef
        L_0x019a:
            int r0 = r8.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x01b1
            X.8bt r0 = X.AnonymousClass8BS.A0K(r8)
            X.C18070vi.A0X(r0)
            X.9tJ r1 = A0H(r0)
            java.lang.String r0 = "hydrated_template"
            X.9tJ r7 = A0M(r1, r0)
        L_0x01b1:
            return r7
        L_0x01b2:
            int r0 = r4.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0141
            X.8c5 r0 = r4.phoneNumber_
            if (r0 != 0) goto L_0x01be
            X.8c5 r0 = X.C165948c5.DEFAULT_INSTANCE
        L_0x01be:
            X.C18070vi.A0X(r0)
            X.9tJ r1 = A07(r0)
            java.lang.String r0 = "phone_number"
            X.9tJ r2 = A0M(r1, r0)
            goto L_0x0141
        L_0x01cd:
            int r0 = r5.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x010e
            X.8c5 r0 = r5.url_
            if (r0 != 0) goto L_0x01d9
            X.8c5 r0 = X.C165948c5.DEFAULT_INSTANCE
        L_0x01d9:
            X.C18070vi.A0X(r0)
            X.9tJ r1 = A07(r0)
            java.lang.String r0 = "url"
            X.9tJ r2 = A0M(r1, r0)
            goto L_0x010e
        L_0x01e8:
            r1 = 0
            goto L_0x00db
        L_0x01eb:
            X.8cW r0 = X.C166208cW.DEFAULT_INSTANCE
            goto L_0x0020
        L_0x01ef:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A9A.A0I(X.8ck):X.9tJ");
    }

    public static final C195419tJ A0N(String str, int i, boolean z) {
        if (z) {
            return null;
        }
        return new C195419tJ((C195419tJ) null, (String) null, str, (String) null, "Expected field to be set", i);
    }

    public static final C195419tJ A0O(String str, String str2) {
        if (AnonymousClass04C.A00((long) str.length(), 1) >= 0) {
            return null;
        }
        return new C195419tJ((C195419tJ) null, (String) null, str2, (String) null, A0S("Expected minimum string length of ", AnonymousClass000.A10(), 1), 11);
    }

    public static final C195419tJ A0Q(String str, List list) {
        if (list.contains(str)) {
            return null;
        }
        return new C195419tJ((C195419tJ) null, (String) null, "mimetype", (String) null, AnonymousClass001.A1E(list, "Expected string to be one of values ", AnonymousClass000.A10()), 17);
    }

    public static final C195419tJ A0R(String str, List list) {
        if (AnonymousClass04C.A00((long) list.size(), 1) >= 0) {
            return null;
        }
        return new C195419tJ((C195419tJ) null, (String) null, str, (String) null, A0S("Expected list of minimum size ", AnonymousClass000.A10(), 1), 11);
    }

    public A9A(AnonymousClass190 r1, C18030ve r2) {
        C18070vi.A0j(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }

    public static final C195419tJ A01(DSQ dsq, String str, int i, long j) {
        if (((long) dsq.A02()) == j) {
            return null;
        }
        return new C195419tJ((C195419tJ) null, (String) null, str, (String) null, A0S("Expected string length of ", AnonymousClass000.A10(), j), i);
    }

    public static C195419tJ A02(C166278cd r1) {
        C195419tJ r12;
        C18070vi.A0X(r1);
        if ((r1.bitField0_ & 4) != 0) {
            C166418cr r0 = r1.quotedMessage_;
            if (r0 == null) {
                r0 = C166418cr.DEFAULT_INSTANCE;
            }
            C18070vi.A0X(r0);
            r12 = A0M(A0L(r0), "quoted_message");
        } else {
            r12 = null;
        }
        return A0M(r12, "context_info");
    }

    public static C195419tJ A04(C166208cW r1) {
        C18070vi.A0X(r1);
        return A0M(A05(r1), "document_message");
    }

    public static C195419tJ A06(C163988Xc r2) {
        C18070vi.A0X(r2);
        if ((r2.bitField0_ & 1) == 0) {
            return null;
        }
        C166418cr r0 = r2.message_;
        if (r0 == null) {
            r0 = C166418cr.DEFAULT_INSTANCE;
        }
        C18070vi.A0X(r0);
        return A0M(A0L(r0), "message");
    }

    public static C195419tJ A08(C166268cc r1) {
        C18070vi.A0X(r1);
        return A0M(A09(r1), "image_message");
    }

    public static C195419tJ A0B(C166028cE r1) {
        C18070vi.A0X(r1);
        return A0M(A0C(r1), "location_message");
    }

    public static C195419tJ A0J(C166248ca r1) {
        C18070vi.A0X(r1);
        return A0M(A0K(r1), "video_message");
    }

    public static final C195419tJ A0P(String str, String str2, int i, long j) {
        if (AnonymousClass04C.A00((long) str.length(), j) <= 0) {
            return null;
        }
        return new C195419tJ((C195419tJ) null, (String) null, str2, (String) null, A0S("Expected maximum string length of ", AnonymousClass000.A10(), j), i);
    }

    public static String A0S(String str, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(C60652oO.A01(j));
        return sb.toString();
    }

    public static final void A0T(A9A a9a, C166418cr r9, String str) {
        String str2;
        try {
            C195419tJ A0L = A0L(r9);
            if (A0L != null) {
                String str3 = A0L.A00;
                if (str3 == null) {
                    str3 = "E2E.Message";
                    A0L.A00 = str3;
                }
                AnonymousClass190 r4 = a9a.A01;
                String A1H = AnonymousClass001.A1H("declarative-protobuf-validation-error-", str, AnonymousClass000.A10());
                StringBuilder A10 = AnonymousClass000.A10();
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("Type: ");
                A10.append(AnonymousClass8BW.A0l(str3, A102, 10));
                String str4 = A0L.A04;
                if (str4 != null) {
                    StringBuilder sb = new StringBuilder(str4);
                    while (true) {
                        C195419tJ r1 = A0L.A02;
                        if (r1 == null) {
                            break;
                        }
                        if (r1.A04 != null) {
                            sb.append(".");
                            sb.append(r1.A04);
                        }
                        A0L = r1;
                    }
                    StringBuilder A103 = AnonymousClass000.A10();
                    A103.append("Path: ");
                    A103.append(sb);
                    A103.append(10);
                    AnonymousClass8BS.A1D(A103, A10);
                }
                String str5 = A0L.A05;
                if (str5 != null) {
                    StringBuilder A104 = AnonymousClass000.A10();
                    A104.append("Rule: ");
                    A10.append(AnonymousClass8BW.A0l(str5, A104, 10));
                }
                StringBuilder A105 = AnonymousClass000.A10();
                A105.append("Error: ");
                A10.append(AnonymousClass8BW.A0l(A0L.A03, A105, 10));
                Integer valueOf = Integer.valueOf(A0L.A01);
                if (valueOf == null) {
                    str2 = null;
                } else {
                    str2 = valueOf.toString();
                }
                StringBuilder A106 = AnonymousClass000.A10();
                A106.append("e2eFailureReason: ");
                C108985cd.A1L(str2, A106, A10);
                r4.A0G(A1H, C18070vi.A0H(A10), true);
            }
        } catch (Exception e) {
            a9a.A01.A0E(AnonymousClass001.A1H("declarative-protobuf-validation-exception-", str, AnonymousClass000.A10()), AnonymousClass001.A1E(e, "E2E.Message: ", AnonymousClass000.A10()), e);
        }
    }
}
