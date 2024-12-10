package X;

/* renamed from: X.6lv  reason: invalid class name and case insensitive filesystem */
public final class C131946lv {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5.A03, 5082) != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass1FL r12, X.AnonymousClass778 r13, int r14) {
        /*
            r11 = this;
            r6 = r12
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            X.1GP r4 = X.AnonymousClass3MX.A0O(r12)
            X.00H r3 = r11.A00
            java.lang.Object r5 = r3.get()
            X.6pW r5 = (X.C133806pW) r5
            X.0z4 r0 = r5.A00
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "fun_stickers_notice_started_clicked"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 != 0) goto L_0x004f
            boolean r0 = r5.A00()
            if (r0 == 0) goto L_0x004f
            X.0ve r2 = r5.A03
            r1 = 5082(0x13da, float:7.121E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x004f
        L_0x0031:
            com.whatsapp.expressionstray.expression.stickers.funstickers.FunStickersNoticeBottomSheet r2 = new com.whatsapp.expressionstray.expression.stickers.funstickers.FunStickersNoticeBottomSheet
            r2.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "stickerOrigin"
            r1.putInt(r0, r14)
            if (r13 == 0) goto L_0x0046
            java.lang.String r0 = "funStickerData"
            r1.putParcelable(r0, r13)
        L_0x0046:
            r2.A1R(r1)
            java.lang.String r0 = "fun_stickers_notice_dialog"
        L_0x004b:
            X.C20098A7b.A03(r2, r4, r0)
        L_0x004e:
            return
        L_0x004f:
            boolean r0 = r5.A01()
            if (r0 != 0) goto L_0x0031
            java.lang.Object r0 = r3.get()
            X.6pW r0 = (X.C133806pW) r0
            X.0ve r1 = r0.A03
            r0 = 4837(0x12e5, float:6.778E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 != 0) goto L_0x00c9
            r0 = 5082(0x13da, float:7.121E-42)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 != 0) goto L_0x00c9
            X.00H r0 = r11.A01
            java.lang.Object r7 = r0.get()
            X.6wo r7 = (X.C138276wo) r7
            X.7wI r2 = new X.7wI
            r2.<init>(r4, r11, r13, r14)
            X.0ve r1 = r7.A00
            r0 = 5206(0x1456, float:7.295E-42)
            java.lang.String r0 = X.C18020vd.A01(r3, r1, r0)
            if (r0 == 0) goto L_0x0090
            int r10 = java.lang.Integer.parseInt(r0)
        L_0x008a:
            X.832 r9 = new X.832
            r9.<init>(r12, r7, r2, r10)
            goto L_0x0094
        L_0x0090:
            r10 = 20900727(0x13eeb77, float:3.5066426E-38)
            goto L_0x008a
        L_0x0094:
            X.1iv r0 = r7.A01     // Catch:{ IllegalArgumentException -> 0x00a2 }
            boolean r0 = r0.A08(r10)     // Catch:{ IllegalArgumentException -> 0x00a2 }
            if (r0 == 0) goto L_0x009f
            X.6Qy r1 = X.C122586Qy.TRUE     // Catch:{ IllegalArgumentException -> 0x00a2 }
            goto L_0x00a9
        L_0x009f:
            X.6Qy r1 = X.C122586Qy.FALSE     // Catch:{ IllegalArgumentException -> 0x00a2 }
            goto L_0x00a9
        L_0x00a2:
            java.lang.String r0 = "GenAiPrivacyLauncher/isAccepted, Error getting disclosure state"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6Qy r1 = X.C122586Qy.ERROR
        L_0x00a9:
            X.6Qy r0 = X.C122586Qy.ERROR
            if (r1 == r0) goto L_0x00b1
            r9.invoke(r1)
            return
        L_0x00b1:
            boolean r0 = r12 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x004e
            X.1FU r6 = (X.AnonymousClass1FU) r6
            if (r6 == 0) goto L_0x004e
            X.1pm r1 = X.AnonymousClass3MZ.A0H(r6)
            X.0wl r0 = r7.A02
            r8 = 0
            com.whatsapp.funstickers.data.pdf.GenAiPrivacyLauncher$attemptDownloadDisclosure$1 r5 = new com.whatsapp.funstickers.data.pdf.GenAiPrivacyLauncher$attemptDownloadDisclosure$1
            r5.<init>(r6, r7, r8, r9, r10)
            X.AnonymousClass3MW.A1X(r0, r5, r1)
            return
        L_0x00c9:
            com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet r2 = new com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet
            r2.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "stickerOrigin"
            r1.putInt(r0, r14)
            if (r13 == 0) goto L_0x00de
            java.lang.String r0 = "funStickerData"
            r1.putParcelable(r0, r13)
        L_0x00de:
            r2.A1R(r1)
            java.lang.String r0 = "search_fun_stickers_bottom_sheet"
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131946lv.A00(X.1FL, X.778, int):void");
    }

    public C131946lv(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
