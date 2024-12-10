package X;

/* renamed from: X.6xi  reason: invalid class name and case insensitive filesystem */
public final class C138796xi {
    public final /* synthetic */ AnonymousClass73G A00;

    public C138796xi() {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x019a  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C23134Bbn r21, java.lang.String r22) {
        /*
            r20 = this;
            r8 = 0
            r7 = r21
            r6 = r22
            boolean r5 = X.C18070vi.A17(r6, r7)
            r0 = r20
            X.73G r4 = r0.A00
            int r0 = r4.A00
            boolean r19 = X.AnonymousClass000.A1T(r0, r5)
            X.6J2 r2 = r4.A0B
            java.util.HashMap r3 = r2.A04
            long r0 = r7.A01
            java.lang.Object r10 = X.C108965cb.A0n(r3, r0)
            X.CpR r10 = (X.C25959CpR) r10
            if (r10 != 0) goto L_0x0039
            X.6J1 r9 = r4.A0C
            java.util.HashMap r3 = r9.A04
            long r0 = r7.A01
            java.lang.Object r10 = X.C108965cb.A0n(r3, r0)
            X.CpR r10 = (X.C25959CpR) r10
            if (r10 != 0) goto L_0x0039
            java.util.HashMap r3 = r9.A01
            long r0 = r7.A01
            java.lang.Object r10 = X.C108965cb.A0n(r3, r0)
            X.CpR r10 = (X.C25959CpR) r10
        L_0x0039:
            if (r19 != 0) goto L_0x004b
            X.6J1 r9 = r4.A0C
            java.util.HashMap r3 = r9.A05
            long r0 = r7.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r0, r7)
            r9.A00()
        L_0x004b:
            r9 = 2
            if (r19 == 0) goto L_0x0142
            if (r10 == 0) goto L_0x01ae
            int r0 = r10.A03
            if (r0 != r9) goto L_0x01ae
            java.util.HashMap r3 = r2.A05
            long r0 = r7.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r0, r7)
            r2.A00()
            int r0 = r7.A00
            if (r0 != r5) goto L_0x01ae
            int r0 = r2.A01
            int r0 = r0 + 1
            r2.A01 = r0
            X.0vl r0 = r4.A0G
            java.lang.Object r11 = r0.getValue()
            X.6y2 r11 = (X.C138996y2) r11
            X.CRa r0 = r10.A05
            if (r0 == 0) goto L_0x013c
            android.os.ParcelFileDescriptor r1 = r0.A02
            java.lang.String r0 = "ParcelFileDescriptor is not available to the File"
            X.C18210vx.A02(r1, r0)
            if (r1 == 0) goto L_0x013c
            java.io.FileDescriptor r0 = r1.getFileDescriptor()     // Catch:{ IOException -> 0x018a }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x018a }
            r3.<init>(r0)     // Catch:{ IOException -> 0x018a }
            java.util.HashMap r12 = r2.A01     // Catch:{ IOException -> 0x018a }
            long r0 = r10.A04     // Catch:{ IOException -> 0x018a }
            java.lang.Object r13 = X.C108965cb.A0n(r12, r0)     // Catch:{ IOException -> 0x018a }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ IOException -> 0x018a }
            if (r13 != 0) goto L_0x0098
            java.lang.String r13 = ""
        L_0x0098:
            int r12 = r13.length()     // Catch:{ IOException -> 0x018a }
            if (r12 != 0) goto L_0x00ad
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x018a }
            java.lang.String r3 = "thunderstorm_logs: ThunderstormMediaContentManager/ handleFilePayload/ no file name found for payload id "
            java.lang.String r0 = X.C17890vO.A0a(r3, r11, r0)     // Catch:{ IOException -> 0x018a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x018a }
            goto L_0x0194
        L_0x00ad:
            java.lang.String r12 = r11.A01(r13)     // Catch:{ IOException -> 0x018a }
            int r18 = r12.length()     // Catch:{ IOException -> 0x018a }
            if (r18 != 0) goto L_0x00c2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x018a }
            java.lang.String r0 = "thunderstorm_logs: ThunderstormMediaContentManager/ handleFilePayload/ invalid file name: "
            X.C17900vP.A0g(r0, r13, r1)     // Catch:{ IOException -> 0x018a }
            goto L_0x0194
        L_0x00c2:
            java.lang.String r0 = android.os.Environment.DIRECTORY_DCIM     // Catch:{ IOException -> 0x018a }
            java.io.File r1 = android.os.Environment.getExternalStoragePublicDirectory(r0)     // Catch:{ IOException -> 0x018a }
            java.io.File r17 = X.C17880vN.A0e(r1, r12)     // Catch:{ IOException -> 0x018a }
            r16 = 1
        L_0x00ce:
            boolean r0 = r17.exists()     // Catch:{ IOException -> 0x018a }
            if (r0 == 0) goto L_0x0115
            X.0vb r0 = r11.A01     // Catch:{ IOException -> 0x018a }
            java.text.NumberFormat r13 = r0.A0L()     // Catch:{ IOException -> 0x018a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ IOException -> 0x018a }
            java.lang.String r15 = r13.format(r0)     // Catch:{ IOException -> 0x018a }
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x018a }
            r0 = 46
            int r14 = r18 + -1
            int r0 = X.AnonymousClass1YF.A0B(r12, r0, r14)     // Catch:{ IOException -> 0x018a }
            java.lang.String r0 = X.C108955ca.A0q(r8, r0, r12)     // Catch:{ IOException -> 0x018a }
            r13.append(r0)     // Catch:{ IOException -> 0x018a }
            r0 = 95
            r13.append(r0)     // Catch:{ IOException -> 0x018a }
            r13.append(r15)     // Catch:{ IOException -> 0x018a }
            java.lang.String r0 = "."
            int r0 = X.AnonymousClass1YF.A0E(r12, r0, r14)     // Catch:{ IOException -> 0x018a }
            java.lang.String r0 = X.C108955ca.A0z(r12, r0)     // Catch:{ IOException -> 0x018a }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r13)     // Catch:{ IOException -> 0x018a }
            r17.getName()     // Catch:{ IOException -> 0x018a }
            java.io.File r17 = X.C17880vN.A0e(r1, r0)     // Catch:{ IOException -> 0x018a }
            int r16 = r16 + 1
            goto L_0x00ce
        L_0x0115:
            java.io.FileOutputStream r0 = X.C108945cZ.A19(r17)     // Catch:{ IOException -> 0x018a }
            X.C64062u9.A00(r3, r0)     // Catch:{ IOException -> 0x018a }
            r3.close()     // Catch:{ IOException -> 0x018a }
            r0.close()     // Catch:{ IOException -> 0x018a }
            X.118 r0 = r11.A00     // Catch:{ IOException -> 0x018a }
            android.content.Context r3 = r0.A00     // Catch:{ IOException -> 0x018a }
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ IOException -> 0x018a }
            java.lang.String r0 = r17.getAbsolutePath()     // Catch:{ IOException -> 0x018a }
            r1[r8] = r0     // Catch:{ IOException -> 0x018a }
            r0 = 0
            android.media.MediaScannerConnection.scanFile(r3, r1, r0, r0)     // Catch:{ IOException -> 0x018a }
            int r0 = r2.A00     // Catch:{ IOException -> 0x018a }
            int r0 = r0 + 1
            r2.A00 = r0     // Catch:{ IOException -> 0x018a }
            r17.getPath()     // Catch:{ IOException -> 0x018a }
            goto L_0x0194
        L_0x013c:
            java.lang.String r0 = "thunderstorm_logs: ThunderstormMediaContentManager/ handlePayload/ payload is not a file"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0194
        L_0x0142:
            int r0 = r7.A00
            if (r0 != r5) goto L_0x01ae
            if (r10 == 0) goto L_0x0154
            int r0 = r10.A03
            if (r0 != r5) goto L_0x017f
            X.6J1 r1 = r4.A0C
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
        L_0x0154:
            X.6J1 r2 = r4.A0C
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x025b
            int r1 = r2.A00
            int r0 = r2.A00
            if (r1 != r0) goto L_0x025b
            r2.A02 = r5
            java.util.HashMap r0 = r2.A04
            java.util.Collection r0 = X.C108955ca.A17(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x016c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ae
            java.lang.Object r0 = r1.next()
            X.CpR r0 = (X.C25959CpR) r0
            X.C18070vi.A0b(r0)
            X.AnonymousClass73G.A00(r0, r4, r6)
            goto L_0x016c
        L_0x017f:
            if (r0 != r9) goto L_0x0154
            X.6J1 r1 = r4.A0C
            int r0 = r1.A01
            int r0 = r0 + 1
            r1.A01 = r0
            goto L_0x0154
        L_0x018a:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "thunderstorm_logs: ThunderstormMediaContentManager/ handlePayload/ exception while saving media: "
            X.C108995ce.A1M(r0, r1, r3)
        L_0x0194:
            int r3 = r2.A01
            int r0 = r2.A00
            if (r3 != r0) goto L_0x01ae
            X.6ta r1 = r4.A02
            java.lang.Long r0 = X.C108955ca.A0m()
            r1.A04 = r0
            int r0 = r2.A00
            if (r0 == r3) goto L_0x0269
            X.6lZ r1 = r4.A01
            if (r1 == 0) goto L_0x01ae
            r0 = 6
            r1.A00(r6, r0)
        L_0x01ae:
            int r0 = r7.A00
            r11 = 3
            if (r0 != r11) goto L_0x0216
            java.util.HashMap r0 = r4.A0E
            java.lang.Object r0 = r0.get(r6)
            X.6tB r0 = (X.C136046tB) r0
            if (r0 == 0) goto L_0x01bf
            r0.A00 = r9
        L_0x01bf:
            X.6lZ r0 = r4.A01
            if (r0 == 0) goto L_0x0216
            com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity r12 = r0.A00
            X.73G r0 = X.C108965cb.A0d(r12)
            int r0 = r0.A00
            boolean r18 = X.AnonymousClass000.A1T(r0, r5)
            X.0vl r13 = r12.A0L
            X.73G r1 = X.C108945cZ.A10(r13)
            int r0 = r1.A00
            if (r0 == r5) goto L_0x0256
            if (r0 == r9) goto L_0x0253
            r2 = 0
        L_0x01dd:
            X.73G r1 = X.C108945cZ.A10(r13)
            int r0 = r1.A00
            if (r0 == r5) goto L_0x024e
            if (r0 == r9) goto L_0x024b
            r0 = 0
        L_0x01e9:
            r13 = r6
            r14 = r2
            r16 = r0
            com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity.A0d(r12, r13, r14, r16, r18)
            java.util.List r12 = r12.A0K
            java.util.Iterator r14 = r12.iterator()
        L_0x01f6:
            boolean r12 = r14.hasNext()
            if (r12 == 0) goto L_0x0249
            java.lang.Object r13 = r14.next()
            boolean r12 = X.C140096zw.A00(r13, r6)
            if (r12 == 0) goto L_0x01f6
        L_0x0206:
            X.6zw r13 = (X.C140096zw) r13
            if (r13 == 0) goto L_0x0216
            X.1DT r13 = r13.A05
            float r12 = (float) r2
            float r2 = (float) r0
            float r12 = r12 / r2
            java.lang.Float r0 = java.lang.Float.valueOf(r12)
            r13.A0E(r0)
        L_0x0216:
            int r0 = r7.A00
            if (r0 != r9) goto L_0x0246
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r11]
            long r0 = r7.A01
            X.AnonymousClass3MX.A1S(r3, r8, r0)
            if (r10 == 0) goto L_0x0247
            int r0 = r10.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x022b:
            r3[r5] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            java.lang.Object[] r1 = X.C108945cZ.A1b(r0, r3, r9, r11)
            java.lang.String r0 = "thunderstorm_logs: ThunderstormManager/ transfer failed for payloadId: %d, type: %d, isIncomingPayload: %b"
            java.lang.String r0 = X.C108955ca.A12(r2, r0, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.6lZ r1 = r4.A01
            if (r1 == 0) goto L_0x0246
            r0 = 5
            r1.A00(r6, r0)
        L_0x0246:
            return
        L_0x0247:
            r0 = 0
            goto L_0x022b
        L_0x0249:
            r13 = 0
            goto L_0x0206
        L_0x024b:
            X.6J1 r0 = r1.A0C
            goto L_0x0250
        L_0x024e:
            X.6J2 r0 = r1.A0B
        L_0x0250:
            long r0 = r0.A02
            goto L_0x01e9
        L_0x0253:
            X.6J1 r0 = r1.A0C
            goto L_0x0258
        L_0x0256:
            X.6J2 r0 = r1.A0B
        L_0x0258:
            long r2 = r0.A03
            goto L_0x01dd
        L_0x025b:
            int r1 = r2.A01
            int r0 = r2.A00
            if (r1 != r0) goto L_0x01ae
            X.6ta r1 = r4.A02
            java.lang.Long r0 = X.C108955ca.A0m()
            r1.A04 = r0
        L_0x0269:
            X.6lZ r0 = r4.A01
            if (r0 == 0) goto L_0x01ae
            com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity r11 = r0.A00
            X.73G r0 = X.C108965cb.A0d(r11)
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x0282
            X.1KB r1 = r11.A05
            r0 = 13
            X.7RC r0 = X.AnonymousClass7RC.A00(r11, r0)
            r1.CGP(r0)
        L_0x0282:
            X.0vl r1 = r11.A0L
            X.73G r0 = X.C108945cZ.A10(r1)
            int r0 = r0.A00
            r3 = 1
            if (r0 == r5) goto L_0x028e
            r3 = 0
        L_0x028e:
            com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity.A0V(r11, r6)
            if (r3 == 0) goto L_0x029a
            X.73G r0 = X.C108945cZ.A10(r1)
            r0.A06(r6)
        L_0x029a:
            java.util.List r0 = r11.A0K
            java.util.Iterator r1 = r0.iterator()
        L_0x02a0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02d7
            java.lang.Object r2 = r1.next()
            boolean r0 = X.C140096zw.A00(r2, r6)
            if (r0 == 0) goto L_0x02a0
        L_0x02b0:
            X.6zw r2 = (X.C140096zw) r2
            if (r2 == 0) goto L_0x01ae
            X.1DT r1 = r2.A03
            r0 = 2131896891(0x7f122a3b, float:1.9428656E38)
            if (r3 == 0) goto L_0x02be
            r0 = 2131896892(0x7f122a3c, float:1.9428658E38)
        L_0x02be:
            X.C108955ca.A1C(r11, r1, r0)
            X.1DT r1 = r2.A06
            r0 = 3
            X.AnonymousClass3MX.A1K(r1, r0)
            X.1DT r1 = r2.A05
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.A0E(r0)
            r11.A4b(r2, r6, r3)
            goto L_0x01ae
        L_0x02d7:
            r2 = 0
            goto L_0x02b0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138796xi.A00(X.Bbn, java.lang.String):void");
    }

    public C138796xi(AnonymousClass73G r1) {
        this.A00 = r1;
    }
}
