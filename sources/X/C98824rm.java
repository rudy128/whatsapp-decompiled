package X;

import android.content.Context;
import com.whatsapp.AbstractAppShellDelegate;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.4rm  reason: invalid class name and case insensitive filesystem */
public class C98824rm implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public C98824rm(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A05 = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.3ze} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: X.3zX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: X.3ze} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: X.3ze} */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:85|86|87|88|89|90|91|(2:93|94)|95|96|(1:98)|99|100) */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x026c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x026d, code lost:
        if (r2 != null) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0273, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0278, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x027e, code lost:
        throw new java.lang.RuntimeException(r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x023a */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x024c A[SYNTHETIC, Splitter:B:93:0x024c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r1 = r14.A00
            switch(r1) {
                case 0: goto L_0x00ce;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x00fd;
                case 4: goto L_0x0119;
                case 5: goto L_0x001b;
                case 6: goto L_0x0084;
                case 7: goto L_0x012d;
                case 8: goto L_0x0141;
                case 9: goto L_0x01ce;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r14.A02
            X.6xR r2 = (X.C138636xR) r2
            java.lang.Object r1 = r14.A03
            X.1FU r1 = (X.AnonymousClass1FU) r1
            int r6 = r14.A01
            java.lang.Object r3 = r14.A04
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            java.lang.String r5 = r14.A05
            java.lang.String r4 = "block"
            X.C138636xR.A00(r1, r2, r3, r4, r5, r6)
        L_0x001a:
            return
        L_0x001b:
            int r1 = r14.A01
            java.lang.Object r2 = r14.A02
            X.4U7 r2 = (X.AnonymousClass4U7) r2
            java.lang.Object r6 = r14.A03
            com.whatsapp.jid.Jid r6 = (com.whatsapp.jid.Jid) r6
            java.lang.String r4 = r14.A05
            java.lang.Object r3 = r14.A04
            X.4OU r3 = (X.AnonymousClass4OU) r3
            X.3zX r5 = new X.3zX
            r5.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.A03 = r0
            java.lang.Boolean r1 = X.AnonymousClass000.A0i()
            if (r2 == 0) goto L_0x004e
            java.lang.String r0 = r2.A01
            if (r0 == 0) goto L_0x0042
            r5.A00 = r1
        L_0x0042:
            java.lang.String r0 = r2.A02
            if (r0 == 0) goto L_0x0048
            r5.A01 = r1
        L_0x0048:
            java.lang.Long r0 = r2.A00
            if (r0 == 0) goto L_0x004e
            r5.A02 = r1
        L_0x004e:
            if (r6 == 0) goto L_0x007f
            X.9jB r0 = r3.A02     // Catch:{ NumberFormatException -> 0x007b }
            java.lang.String r0 = r0.A00(r6)     // Catch:{ NumberFormatException -> 0x007b }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x007b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x007b }
            r5.A04 = r0     // Catch:{ NumberFormatException -> 0x007b }
            X.0ve r2 = r3.A00     // Catch:{ NumberFormatException -> 0x007b }
            r1 = 8492(0x212c, float:1.19E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ NumberFormatException -> 0x007b }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ NumberFormatException -> 0x007b }
            if (r0 == 0) goto L_0x007f
            X.00H r0 = r3.A04     // Catch:{ NumberFormatException -> 0x007b }
            java.lang.Object r0 = r0.get()     // Catch:{ NumberFormatException -> 0x007b }
            X.1Nl r0 = (X.C25241Nl) r0     // Catch:{ NumberFormatException -> 0x007b }
            java.lang.String r0 = X.AnonymousClass3Ma.A14(r0, r6)     // Catch:{ NumberFormatException -> 0x007b }
            r5.A06 = r0     // Catch:{ NumberFormatException -> 0x007b }
            goto L_0x007f
        L_0x007b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x007f:
            r5.A05 = r4
            X.18K r0 = r3.A01
            goto L_0x00ca
        L_0x0084:
            java.lang.Object r4 = r14.A02
            X.4aI r4 = (X.C88654aI) r4
            java.lang.Object r5 = r14.A03
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.Object r3 = r14.A04
            X.4YT r3 = (X.AnonymousClass4YT) r3
            int r1 = r14.A01
            java.lang.String r2 = r14.A05
            if (r5 == 0) goto L_0x001a
            X.1eS r0 = r4.A01
            X.8oR r0 = r0.A02(r5)
            if (r0 == 0) goto L_0x001a
            X.1M9 r0 = r4.A00
            X.1E7 r0 = r0.A0H(r5)
            X.3ze r5 = X.C88654aI.A01(r4, r3, r0, r1)
            java.lang.String r0 = "agm"
            r5.A06 = r0
            if (r2 == 0) goto L_0x00bd
            org.json.JSONObject r1 = X.C17880vN.A15()
            java.lang.String r0 = "agm_cta_type"
            r1.put(r0, r2)
            java.lang.String r0 = r1.toString()
            r5.A05 = r0
        L_0x00bd:
            X.00H r0 = r4.A09
            java.lang.Object r0 = r0.get()
            X.4QA r0 = (X.AnonymousClass4QA) r0
            r0.A00()
            X.18K r0 = r4.A05
        L_0x00ca:
            r0.CC7(r5)
            return
        L_0x00ce:
            java.lang.Object r8 = r14.A02
            X.6xR r8 = (X.C138636xR) r8
            java.lang.Object r5 = r14.A03
            X.1E7 r5 = (X.AnonymousClass1E7) r5
            java.lang.String r10 = r14.A05
            java.lang.Object r3 = r14.A04
            X.1FU r3 = (X.AnonymousClass1FU) r3
            int r1 = r14.A01
            X.6uY r2 = r8.A03
            r0 = 0
            r2.A02(r5, r10, r0)
            X.7ET r4 = new X.7ET
            r6 = r4
            r7 = r3
            r9 = r5
            r11 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            X.0ve r0 = r8.A05
            boolean r0 = X.AnonymousClass3MX.A1X(r0)
            r11 = r0 ^ 1
            r6 = 0
            r8 = r6
            r9 = r6
            r7 = r6
            r2.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x00fd:
            int r5 = r14.A01
            java.lang.Object r4 = r14.A02
            X.BAU r4 = (X.BAU) r4
            java.lang.Object r3 = r14.A03
            X.9qM r3 = (X.C193599qM) r3
            java.lang.String r2 = r14.A05
            java.lang.Object r1 = r14.A04
            X.1D6 r1 = (X.AnonymousClass1D6) r1
            X.C18070vi.A0s(r4, r3, r2, r1)
            X.AxR r0 = new X.AxR
            r0.<init>(r4, r3, r2, r1)
            X.C20017A3j.A01(r0, r5)
            return
        L_0x0119:
            java.lang.Object r4 = r14.A02
            com.whatsapp.calling.service.VoiceServiceEventCallback r4 = (com.whatsapp.calling.service.VoiceServiceEventCallback) r4
            java.lang.Object r3 = r14.A03
            com.whatsapp.jid.DeviceJid r3 = (com.whatsapp.jid.DeviceJid) r3
            java.lang.String r2 = r14.A05
            java.lang.Object r1 = r14.A04
            byte[] r1 = (byte[]) r1
            int r0 = r14.A01
            r4.m43lambda$rejectedDecryptionFailure$4$comwhatsappcallingserviceVoiceServiceEventCallback(r3, r2, r1, r0)
            return
        L_0x012d:
            java.lang.Object r4 = r14.A02
            X.1Kr r4 = (X.C24531Kr) r4
            java.lang.Object r3 = r14.A03
            X.2rg r3 = (X.C62612rg) r3
            int r2 = r14.A01
            java.lang.String r1 = r14.A05
            java.lang.Object r0 = r14.A04
            X.1Kj r0 = (X.C24451Kj) r0
            X.C24531Kr.A01(r4, r3, r0, r1, r2)
            return
        L_0x0141:
            int r8 = r14.A01
            java.lang.Object r4 = r14.A02
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            java.lang.Object r5 = r14.A03
            com.whatsapp.group.ExitGroupsDialogFragment r5 = (com.whatsapp.group.ExitGroupsDialogFragment) r5
            java.lang.Object r7 = r14.A04
            X.1EC r7 = (X.AnonymousClass1EC) r7
            java.lang.String r3 = r14.A05
            r2 = 1
            if (r8 != r2) goto L_0x0159
            r0 = 300(0x12c, double:1.48E-321)
            android.os.SystemClock.sleep(r0)
        L_0x0159:
            if (r4 == 0) goto L_0x018f
            boolean r0 = r4.isChecked()
            if (r0 == 0) goto L_0x018f
        L_0x0161:
            X.C18070vi.A0b(r7)
            if (r2 == 0) goto L_0x01a9
            X.1M9 r0 = r5.A02
            if (r0 == 0) goto L_0x01c7
            X.1E7 r4 = r0.A0H(r7)
            X.6uY r0 = r5.A04
            if (r0 == 0) goto L_0x01a6
            if (r3 == 0) goto L_0x01a1
            r2 = 0
            r0.A02(r4, r3, r2)
            X.6uY r3 = r5.A04
            if (r3 == 0) goto L_0x019b
            X.1KB r1 = r5.A00
            if (r1 == 0) goto L_0x0197
            X.1NN r0 = r5.A08
            if (r0 == 0) goto L_0x0191
            X.4kY r2 = new X.4kY
            r2.<init>(r1, r0, r8)
            r1 = 0
            r0 = 1
            r3.A01(r2, r4, r0, r1)
            return
        L_0x018f:
            r2 = 0
            goto L_0x0161
        L_0x0191:
            java.lang.String r0 = "conversationObservers"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0197:
            X.AnonymousClass3MW.A1C()
            throw r2
        L_0x019b:
            java.lang.String r0 = "spamReportManager"
            X.C18070vi.A11(r0)
            throw r2
        L_0x01a1:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        L_0x01a6:
            java.lang.String r0 = "spamReportManager"
            goto L_0x01c9
        L_0x01a9:
            X.12M r0 = r5.A0D
            if (r0 == 0) goto L_0x01c4
            X.126 r6 = r5.A0C
            if (r6 == 0) goto L_0x01c1
            X.1NN r4 = r5.A08
            if (r4 == 0) goto L_0x01be
            X.40j r3 = new X.40j
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A0D(r3)
            return
        L_0x01be:
            java.lang.String r0 = "conversationObservers"
            goto L_0x01c9
        L_0x01c1:
            java.lang.String r0 = "groupChatManager"
            goto L_0x01c9
        L_0x01c4:
            java.lang.String r0 = "groupXmppMethods"
            goto L_0x01c9
        L_0x01c7:
            java.lang.String r0 = "contactManager"
        L_0x01c9:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x01ce:
            java.lang.Object r4 = r14.A02
            X.19w r4 = (X.C224319w) r4
            java.lang.Object r3 = r14.A03
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r5 = "libs.spo"
            java.lang.Object r1 = r14.A04
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r12 = r14.A01
            java.lang.String r0 = "whatsappassetdecompressor/scheduling decompression of secondary libs"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = -4
            android.os.Process.setThreadPriority(r0)
            java.lang.String r0 = "whatsappassetdecompressor/initiating decompression of secondary libs"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "compressed/"
            r2.append(r0)
            r7 = 0
            java.lang.String r0 = X.C224319w.A00(r4)
            r2.append(r0)
            java.lang.String r0 = "/"
            java.lang.String r9 = X.AnonymousClass001.A1H(r0, r5, r2)
            java.lang.String r0 = "."
            int r0 = r5.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r10 = r5.substring(r0)
            X.0vS r0 = r4.A03
            java.io.File r2 = r0.A01()
            java.lang.String r0 = "decompressed"
            java.io.File r0 = X.C17880vN.A0e(r2, r0)
            java.io.File r5 = X.C17880vN.A0e(r0, r5)
            android.content.res.AssetManager r8 = r3.getAssets()     // Catch:{ AssetDecompressionException -> 0x023a }
            java.lang.String r11 = r5.getAbsolutePath()     // Catch:{ AssetDecompressionException -> 0x023a }
            r13 = -1
            java.lang.String[] r6 = com.facebook.superpack.AssetDecompressor.decompress_range(r8, r9, r10, r11, r12, r13)     // Catch:{ AssetDecompressionException -> 0x023a }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ AssetDecompressionException -> 0x023a }
            java.lang.String r0 = "whatsappassetdecompressor/secondary libs decompressed size/"
            r2.append(r0)     // Catch:{ AssetDecompressionException -> 0x023a }
            int r0 = r6.length     // Catch:{ AssetDecompressionException -> 0x023a }
            X.C17900vP.A0o(r2, r0)     // Catch:{ AssetDecompressionException -> 0x023a }
            goto L_0x0250
        L_0x023a:
            android.content.res.AssetManager r0 = r3.getAssets()     // Catch:{ AssetDecompressionException | IOException -> 0x0278 }
            java.io.InputStream r2 = r0.open(r9)     // Catch:{ AssetDecompressionException | IOException -> 0x0278 }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ all -> 0x026c }
            java.lang.String[] r6 = com.facebook.superpack.AssetDecompressor.decompress_legacy(r2, r10, r0)     // Catch:{ all -> 0x026c }
            if (r2 == 0) goto L_0x024f
            r2.close()     // Catch:{ AssetDecompressionException | IOException -> 0x0278 }
        L_0x024f:
            r7 = 1
        L_0x0250:
            java.util.List r0 = java.util.Arrays.asList(r6)
            java.util.ArrayList r0 = X.C17880vN.A10(r0)
            if (r7 != 0) goto L_0x025d
            r0.addAll(r1)
        L_0x025d:
            X.C224319w.A01(r3, r4, r5, r0)
            X.198 r0 = r4.A04
            java.util.concurrent.CountDownLatch r0 = r0.A01
            r0.countDown()
            r0 = 0
            android.os.Process.setThreadPriority(r0)
            return
        L_0x026c:
            r1 = move-exception
            if (r2 == 0) goto L_0x0277
            r2.close()     // Catch:{ all -> 0x0273 }
            goto L_0x0277
        L_0x0273:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ AssetDecompressionException | IOException -> 0x0278 }
        L_0x0277:
            throw r1     // Catch:{ AssetDecompressionException | IOException -> 0x0278 }
        L_0x0278:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98824rm.run():void");
    }

    public C98824rm(Context context, C224319w r3, ArrayList arrayList, int i) {
        this.A00 = 9;
        this.A02 = r3;
        this.A03 = context;
        this.A05 = AbstractAppShellDelegate.COMPRESSED_LIBS_ARCHIVE_NAME;
        this.A04 = arrayList;
        this.A01 = i;
    }

    public C98824rm(C88654aI r2, AnonymousClass4YT r3, UserJid userJid, String str, int i) {
        this.A00 = 6;
        this.A02 = r2;
        this.A03 = userJid;
        this.A04 = r3;
        this.A01 = i;
        this.A05 = str;
    }
}
