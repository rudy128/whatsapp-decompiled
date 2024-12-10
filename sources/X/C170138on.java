package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8on  reason: invalid class name and case insensitive filesystem */
public final class C170138on extends AnonymousClass1NZ {
    public final C218617r A00;
    public final AnonymousClass118 A01;
    public final AnonymousClass1QQ A02;
    public final AnonymousClass72F A03;
    public final AnonymousClass00H A04;
    public final C18030ve A05;

    public ArrayList A0N(File file) {
        C18070vi.A0d(file, 0);
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return AnonymousClass000.A13();
        }
        List asList = Arrays.asList(listFiles);
        C18070vi.A0X(asList);
        return C17880vN.A10(asList);
    }

    public void A0I(Context context, C171768sF r22, File file) {
        int i;
        AnonymousClass1Ez r5 = new AnonymousClass1Ez("payment-backgrounds-v2");
        C171768sF r4 = r22;
        try {
            if (!C18020vd.A05(C18040vf.A02, this.A05, 1084)) {
                Log.i("PaymentBackgroundsBackupV2/restore/encrypted backgrounds not enabled");
            } else {
                File A0e = C17880vN.A0e(this.A02.A03(), "Payment Backgrounds");
                if (!A0e.exists()) {
                    Log.i("PaymentBackgroundsBackupV2/restore/payment backgrounds backup folder does not exist");
                } else {
                    File A0H = this.A00.A0H();
                    if (!A0H.exists()) {
                        C17900vP.A0X(A0H, "PaymentBackgroundsBackupV2/restore/failed to get internal payment backgrounds folder ", AnonymousClass000.A10());
                    } else {
                        Iterator it = A0N(A0e).iterator();
                        int i2 = 0;
                        int i3 = 0;
                        while (it.hasNext()) {
                            File A0T = AnonymousClass8BS.A0T(it);
                            File A06 = C64062u9.A06(A0H.getCanonicalPath(), C21721ArX.A04(A0T));
                            if (A06 != null) {
                                C18070vi.A0d(A0T, 0);
                                try {
                                    C191639mv r2 = (C191639mv) this.A04.get();
                                    AnonymousClass9JN A022 = AnonymousClass9JN.A02(A3K.A00(AnonymousClass8BS.A0i(A0T), C21721ArX.A04(A0T)));
                                    if (A022 == null) {
                                        A022 = AnonymousClass9JN.UNENCRYPTED;
                                    }
                                    C189869jz A07 = r2.A00((C19947A0e) null, A022, A0T, false).A07(this.A01, (B9V) null, A06, 0, 0, false);
                                    C17900vP.A0Y(A07, "PaymentBackgroundsBackupV2/restore/result ", AnonymousClass000.A10());
                                    if (A07.A00 == 1) {
                                        i3++;
                                    }
                                } catch (Exception e) {
                                    Log.w("PaymentBackgroundsBackupV2/restore/error", e);
                                }
                                i2++;
                            }
                        }
                        if (r22 != null) {
                            if (i2 == 0) {
                                i = 0;
                            } else {
                                i = 1;
                            }
                            r4.A05 = i;
                            r4.A0F = C17880vN.A0n(i2);
                            r4.A0G = C17880vN.A0n(i3);
                            A0K(r4, r5.A02());
                        }
                        return;
                    }
                }
            }
        } catch (IOException e2) {
            if (r22 != null) {
                r4.A05 = Integer.valueOf(A3O.A02(e2));
                Long A0L = C17890vO.A0L();
                r4.A0F = A0L;
                r4.A0G = A0L;
            }
            Log.e("PaymentBackgroundsBackupV2/restore failed due to exception ", e2);
        } catch (Throwable th) {
            if (r22 != null) {
                A0K(r4, r5.A02());
            }
            throw th;
        }
        if (r22 == null) {
            return;
        }
        A0K(r4, r5.A02());
    }

    public void A0K(C171768sF r3, long j) {
        r3.A0E = C17880vN.A0o(C17900vP.A01(r3.A0E), j);
    }

    public boolean A0S(C171768sF r2, File file) {
        Log.w("PaymentBackgroundsBackupV2/restoreFile/ should not be called");
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: X.A26} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: X.A26} */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.A26 A0T(X.C171828sL r26, X.AnonymousClass9JN r27) {
        /*
            r25 = this;
            r2 = r26
            r6 = r27
            X.C18070vi.A0h(r6, r2)
            r0 = r25
            X.0ve r4 = r0.A05
            r3 = 1084(0x43c, float:1.519E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r4, r3)
            if (r1 != 0) goto L_0x0036
            java.lang.String r1 = "PaymentBackgroundsBackupV2/backup/encrypted backgrounds not enabled"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1L7 r0 = r0.A02
            java.io.File r1 = r0.A03()
            java.lang.String r0 = "Payment Backgrounds"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)
            r5 = 0
            X.C64062u9.A0K(r0, r5)
            java.lang.String r7 = "payment-backgrounds-v2"
            r8 = 3
            r9 = 0
            X.A26 r4 = new X.A26
            r6 = r5
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x0036:
            java.lang.String r7 = "payment-backgrounds-v2"
            X.1Ez r8 = new X.1Ez
            r8.<init>((java.lang.String) r7)
            boolean r1 = r0.A0L()
            if (r1 != 0) goto L_0x0072
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PaymentBackgroundsBackupV2/backup/sdcard_unavailable "
            r1.append(r0)
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            X.C17890vO.A1A(r1, r0)
            r10 = 0
            r13 = 1
        L_0x0055:
            r14 = 0
            X.A26 r4 = new X.A26
            r9 = r4
            r11 = r10
            r12 = r7
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x005f:
            int r0 = r4.A01
            int r0 = X.A3O.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0A = r0
            java.lang.Long r0 = X.AnonymousClass8BT.A0n(r8)
            r2.A0K = r0
            return r4
        L_0x0072:
            java.util.HashMap r12 = X.C17880vN.A11()
            X.1QQ r4 = r0.A02
            java.lang.String r1 = "PAY: PaymentBackgroundStore/getStoredPaymentBackgrounds"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r3 = "SELECT payment_background.background_id, file_size, width, height, mime_type, placeholder_color, text_color, subtext_color, media_key, media_key_timestamp, file_sha256, file_enc_sha256, direct_path, fullsize_url, description, lg FROM payment_background"
            java.lang.String r1 = "payments/QUERY_PAYMENT_BACKGROUNDS"
            java.util.ArrayList r4 = X.AnonymousClass1QQ.A01(r4, r3, r1)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r1 = "PAY: PaymentBackgroundStore/getStoredPaymentBackgrounds/result size="
            r3.append(r1)
            int r1 = r4.size()
            X.C17900vP.A0o(r3, r1)
            java.util.Iterator r4 = r4.iterator()
        L_0x0099:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00bf
            java.lang.Object r3 = r4.next()
            X.AEX r3 = (X.AEX) r3
            X.72F r1 = r0.A03
            X.17r r1 = r1.A00
            java.io.File r1 = r1.A0H()
            java.io.File r3 = r3.A01(r1)
            boolean r1 = r3.exists()
            if (r1 == 0) goto L_0x0099
            java.lang.String r1 = X.AnonymousClass8BS.A0i(r3)
            r12.put(r1, r3)
            goto L_0x0099
        L_0x00bf:
            X.1L7 r10 = r0.A02
            java.io.File r1 = r10.A03()
            java.lang.String r3 = "Payment Backgrounds"
            java.io.File r1 = X.C17880vN.A0e(r1, r3)
            X.AnonymousClass8BV.A1H(r1)
            java.io.File r1 = r10.A03()
            java.io.File r1 = X.C17880vN.A0e(r1, r3)
            java.io.File[] r13 = r1.listFiles()
            r4 = 0
            if (r13 == 0) goto L_0x00f6
            int r11 = r13.length
            r9 = 0
        L_0x00df:
            if (r9 >= r11) goto L_0x00f6
            r5 = r13[r9]
            X.C18070vi.A0b(r5)
            java.lang.String r1 = X.C21721ArX.A04(r5)
            boolean r1 = r12.containsKey(r1)
            if (r1 != 0) goto L_0x00f3
            X.C64062u9.A0Q(r5)
        L_0x00f3:
            int r9 = r9 + 1
            goto L_0x00df
        L_0x00f6:
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x0100
            r10 = 0
            r13 = 3
            goto L_0x0055
        L_0x0100:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r17 = X.C17890vO.A0i(r12)
        L_0x0108:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x01eb
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r17)
            java.lang.String r9 = X.C17880vN.A0x(r1)
            java.lang.Object r14 = r1.getValue()
            java.io.File r14 = (java.io.File) r14
            java.io.File r1 = r10.A03()
            java.io.File r11 = X.C17880vN.A0e(r1, r3)
            r1 = 1
            X.C18070vi.A0d(r9, r1)
            java.lang.StringBuilder r9 = X.AnonymousClass000.A11(r9)
            java.lang.String r1 = X.A3K.A01(r6)
            java.io.File r11 = X.AnonymousClass8BW.A0X(r11, r1, r9)
            boolean r1 = r11.exists()
            if (r1 == 0) goto L_0x015b
            long r15 = r14.lastModified()
            long r12 = r11.lastModified()
            int r1 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r1 >= 0) goto L_0x015b
            r19 = 0
            r22 = 2
            r23 = 0
            X.A26 r1 = new X.A26
            r20 = r19
            r18 = r1
            r21 = r7
            r18.<init>(r19, r20, r21, r22, r23)
        L_0x0157:
            r5.add(r1)
            goto L_0x0108
        L_0x015b:
            X.00H r1 = r0.A04     // Catch:{ IOException -> 0x01ce }
            java.lang.Object r1 = r1.get()     // Catch:{ IOException -> 0x01ce }
            X.9mv r1 = (X.C191639mv) r1     // Catch:{ IOException -> 0x01ce }
            r9 = 0
            X.A5N r13 = r1.A00(r9, r6, r11, r4)     // Catch:{ IOException -> 0x01ce }
            X.118 r1 = r0.A01     // Catch:{ IOException -> 0x01ce }
            android.content.Context r12 = r1.A00     // Catch:{ IOException -> 0x01ce }
            boolean r1 = r13.A09(r12, r14)     // Catch:{ IOException -> 0x01ce }
            if (r1 == 0) goto L_0x0192
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x01ce }
            java.lang.String r1 = "PaymentBackgroundsBackupV2/createSingleFileBackupIfNeeded/skip backup because backup file "
            X.AnonymousClass8BV.A1J(r11, r1, r12)     // Catch:{ IOException -> 0x01ce }
            java.lang.String r1 = " has the same source file"
            X.C17890vO.A1A(r12, r1)     // Catch:{ IOException -> 0x01ce }
            r22 = 2
            r23 = 0
            X.A26 r1 = new X.A26     // Catch:{ IOException -> 0x01ce }
            r19 = r9
            r18 = r1
            r20 = r9
            r21 = r7
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ IOException -> 0x01ce }
            goto L_0x0157
        L_0x0192:
            boolean r1 = r13.A0A(r12, r14)     // Catch:{ IOException -> 0x01ce }
            if (r1 != 0) goto L_0x01af
            java.lang.String r1 = "PaymentBackgroundsBackupV2/backup/failed to prepare for backup"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IOException -> 0x01ce }
            r22 = 1
            r23 = 0
            X.A26 r1 = new X.A26     // Catch:{ IOException -> 0x01ce }
            r19 = r9
            r18 = r1
            r20 = r9
            r21 = r7
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ IOException -> 0x01ce }
            goto L_0x0157
        L_0x01af:
            r13.A08(r9, r14)     // Catch:{ IOException -> 0x01ce }
            r11.getName()
            r11.length()
            long r23 = r11.length()
            java.lang.Long r20 = X.C17890vO.A0L()
            X.A26 r1 = new X.A26
            r18 = r1
            r19 = r11
            r21 = r7
            r22 = r4
            r18.<init>(r19, r20, r21, r22, r23)
            goto L_0x0157
        L_0x01ce:
            r11 = move-exception
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()
            java.lang.String r1 = "PaymentBackgroundsBackupV2/backup/failed to create single file backup. Error: "
            X.C108995ce.A1M(r1, r9, r11)
            r19 = 0
            r22 = 1
            r23 = 0
            X.A26 r1 = new X.A26
            r20 = r19
            r18 = r1
            r21 = r7
            r18.<init>(r19, r20, r21, r22, r23)
            goto L_0x0157
        L_0x01eb:
            java.util.LinkedHashMap r7 = X.C17880vN.A13()
            java.util.Iterator r6 = r5.iterator()
        L_0x01f3:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0222
            java.lang.Object r0 = r6.next()
            X.A26 r0 = (X.A26) r0
            int r0 = r0.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r7.get(r3)
            if (r1 != 0) goto L_0x0216
            boolean r0 = r7.containsKey(r3)
            if (r0 != 0) goto L_0x0216
            X.4rD r1 = new X.4rD
            r1.<init>()
        L_0x0216:
            X.4rD r1 = (X.C98474rD) r1
            int r0 = r1.element
            int r0 = r0 + 1
            r1.element = r0
            r7.put(r3, r1)
            goto L_0x01f3
        L_0x0222:
            java.util.Iterator r1 = X.AnonymousClass000.A15(r7)
        L_0x0226:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0230
            X.AnonymousClass8BY.A1N(r1)
            goto L_0x0226
        L_0x0230:
            java.util.Map r3 = X.C41681wt.A03(r7)
            r0 = 1
            java.lang.Object r0 = X.AnonymousClass000.A0w(r3, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            r1 = 0
            if (r0 == 0) goto L_0x02a1
            java.lang.Long r0 = X.C17890vO.A0N(r0)
        L_0x0242:
            r2.A0L = r0
            r0 = 2
            java.lang.Object r0 = X.AnonymousClass000.A0w(r3, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x029f
            java.lang.Long r0 = X.C17890vO.A0N(r0)
        L_0x0251:
            r2.A0M = r0
            java.lang.Object r0 = X.AnonymousClass000.A0w(r3, r4)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x025f
            java.lang.Long r1 = X.C17890vO.A0N(r0)
        L_0x025f:
            r2.A0N = r1
            java.util.Iterator r6 = r5.iterator()
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x02b5
            java.lang.Object r4 = r6.next()
        L_0x026f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x02a3
            java.lang.Object r3 = r6.next()
            X.A26 r3 = (X.A26) r3
            X.A26 r4 = (X.A26) r4
            java.lang.String r12 = r4.A05
            int r5 = r4.A01
            int r1 = r3.A01
            if (r5 == r1) goto L_0x028c
            r0 = 1
            if (r5 == r0) goto L_0x028b
            r5 = 0
            if (r1 != r0) goto L_0x028c
        L_0x028b:
            r5 = 1
        L_0x028c:
            long r0 = r4.A02
            long r3 = r3.A02
            long r0 = r0 + r3
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            r10 = 0
            X.A26 r4 = new X.A26
            r9 = r4
            r13 = r5
            r14 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x026f
        L_0x029f:
            r0 = r1
            goto L_0x0251
        L_0x02a1:
            r0 = r1
            goto L_0x0242
        L_0x02a3:
            X.A26 r4 = (X.A26) r4
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PaymentBackgroundsBackupV2/total size of backup is "
            r3.append(r0)
            long r0 = r4.A02
            X.C17890vO.A16(r3, r0)
            goto L_0x005f
        L_0x02b5:
            java.lang.String r1 = "Empty collection can't be reduced."
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170138on.A0T(X.8sL, X.9JN):X.A26");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C170138on(C218617r r2, AnonymousClass118 r3, AnonymousClass1NX r4, AnonymousClass1QQ r5, C18030ve r6, AnonymousClass72F r7, AnonymousClass00H r8) {
        super(r4);
        C18070vi.A0w(r6, r3, r2, r8, r5);
        C18070vi.A0d(r7, 6);
        this.A05 = r6;
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = r8;
        this.A02 = r5;
        this.A03 = r7;
    }

    public String A0M() {
        return "payment-backgrounds-v2";
    }

    public void A0R(C171878sQ r2, double d) {
        r2.A0Q = Double.valueOf(d);
    }
}
