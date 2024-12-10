package X;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.facebook.smartcapture.docauth.DocAuthManager;
import com.facebook.smartcapture.view.IdCaptureActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.DEn  reason: case insensitive filesystem */
public final class C26805DEn implements E9C {
    public int A00;
    public int A01;
    public C24321BzI A02;
    public Integer A03;
    public Integer A04;
    public boolean A05;
    public final DocAuthManager A06;
    public final C24321BzI A07;
    public final C26548D3k A08;
    public final C25120CYt A09;
    public final BH7 A0A;
    public final WeakReference A0B;
    public final WeakReference A0C;
    public final Map A0D;
    public final Handler A0E = C17890vO.A0D();
    public final BVO A0F;
    public final C24783CKc A0G = new C24783CKc(this);

    public C26805DEn(Context context, DocAuthManager docAuthManager, C24321BzI bzI, C26548D3k d3k, BVO bvo, C28556E7h e7h) {
        C18070vi.A0d(bzI, 5);
        this.A08 = d3k;
        this.A0B = AnonymousClass3MW.A0z(context);
        this.A07 = bzI;
        this.A0C = AnonymousClass3MW.A0z(e7h);
        this.A06 = docAuthManager;
        Integer num = AnonymousClass00R.A00;
        this.A04 = num;
        docAuthManager.A01 = AnonymousClass3MW.A0z(this);
        this.A0F = bvo;
        UUID.randomUUID().toString();
        this.A09 = new C25120CYt(bvo);
        this.A0D = C17880vN.A11();
        this.A03 = num;
        this.A04 = num;
        this.A0A = new BH7(context, this);
    }

    public void Bsw(Exception exc) {
        C18070vi.A0d(exc, 0);
        C28556E7h e7h = (C28556E7h) this.A0C.get();
        if (e7h != null) {
            IdCaptureActivity idCaptureActivity = (IdCaptureActivity) e7h;
            idCaptureActivity.runOnUiThread(new AnonymousClass7RP(idCaptureActivity));
        }
    }

    public void C0W(C25751ClL clL) {
        C18070vi.A0d(clL, 0);
        new Thread(new C27081DTg(C17890vO.A0D(), this, clL, 24)).start();
    }

    public void C8r(C25751ClL clL) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        if (r9.A04 != X.AnonymousClass00R.A03) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        r2 = r9.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        if (r2 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        r2 = r9.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
        r6 = (com.facebook.smartcapture.view.IdCaptureActivity) r6;
        X.AnonymousClass3MZ.A0F(r6).post(new X.AnonymousClass7RF(r9, r2, 3, r10));
        r9.A02 = r2;
        r0 = r9.A04;
        r8 = r9.A03;
        r2 = X.C18070vi.A17(r0, r8);
        r7 = r6.A04;
        X.C18070vi.A0b(r7);
        r7 = (com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment) r7;
        r1 = r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0098, code lost:
        if (r1 == 4) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        if (r1 == 3) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        if (r1 == 7) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
        if (r1 == 12) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a5, code lost:
        if (r1 == 11) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a7, code lost:
        r2 = r6.A04;
        X.C18070vi.A0b(r2);
        r2 = (com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment) r2;
        r1 = r2.A04;
        X.C18070vi.A0b(r1);
        r1.post(new X.C27082DTh(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c0, code lost:
        if (r7.A01 != X.AnonymousClass00R.A01) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c2, code lost:
        r0 = r8.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c6, code lost:
        if (r0 == 0) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c8, code lost:
        r1 = 2131898632;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
        if (r0 == r2) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cd, code lost:
        r1 = 2131898634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d1, code lost:
        r1 = 2131898633;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d5, code lost:
        r1 = 2131898638;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dc, code lost:
        if (r7.A1b() == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00de, code lost:
        r3 = r7.A14().getResources().getText(r1);
        X.C18070vi.A0X(r3);
        r2 = r7.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ef, code lost:
        if (r2 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f1, code lost:
        r2.post(new X.C27076DTa(r7, r3, 21));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ff, code lost:
        r6.CIE(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011d, code lost:
        r9.A0B.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0164, code lost:
        r9.A05 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C26805DEn r9, boolean r10) {
        /*
            java.lang.ref.WeakReference r0 = r9.A0C
            java.lang.Object r6 = r0.get()
            X.E7h r6 = (X.C28556E7h) r6
            if (r6 == 0) goto L_0x0188
            X.CYt r8 = r9.A09
            java.lang.Integer r0 = r9.A04
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0034;
                case 1: goto L_0x0037;
                case 2: goto L_0x003a;
                case 3: goto L_0x003d;
                case 4: goto L_0x0040;
                case 5: goto L_0x0043;
                case 6: goto L_0x0046;
                case 7: goto L_0x0049;
                case 8: goto L_0x004c;
                case 9: goto L_0x004f;
                case 10: goto L_0x0052;
                case 11: goto L_0x0055;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.String r7 = "capturing_manual"
        L_0x0017:
            r5 = 0
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r8.A01
            long r2 = r2 - r0
            float r1 = (float) r2
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r0
            r4 = 3
            java.math.RoundingMode r3 = java.math.RoundingMode.HALF_UP
            org.json.JSONObject r2 = X.C17880vN.A15()
            double r0 = (double) r1
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r0 = r0.setScale(r4, r3)
            goto L_0x0058
        L_0x0034:
            java.lang.String r7 = "initial"
            goto L_0x0017
        L_0x0037:
            java.lang.String r7 = "downloading_deps"
            goto L_0x0017
        L_0x003a:
            java.lang.String r7 = "download_failed"
            goto L_0x0017
        L_0x003d:
            java.lang.String r7 = "looking_for_id"
            goto L_0x0017
        L_0x0040:
            java.lang.String r7 = "id_found"
            goto L_0x0017
        L_0x0043:
            java.lang.String r7 = "blur_detected"
            goto L_0x0017
        L_0x0046:
            java.lang.String r7 = "glare_detected"
            goto L_0x0017
        L_0x0049:
            java.lang.String r7 = "manual_capture"
            goto L_0x0017
        L_0x004c:
            java.lang.String r7 = "holding_steady"
            goto L_0x0017
        L_0x004f:
            java.lang.String r7 = "scanning_credit_card"
            goto L_0x0017
        L_0x0052:
            java.lang.String r7 = "credit_card_scanned"
            goto L_0x0017
        L_0x0055:
            java.lang.String r7 = "capturing_automatic"
            goto L_0x0017
        L_0x0058:
            r2.put(r7, r0)     // Catch:{ JSONException -> 0x005b }
        L_0x005b:
            r8.A00(r2)
            java.lang.Integer r0 = r9.A04
            int r0 = r0.intValue()
            r3 = 4
            r1 = 1
            switch(r0) {
                case 1: goto L_0x00fc;
                case 2: goto L_0x00ff;
                case 3: goto L_0x010d;
                case 4: goto L_0x0114;
                case 5: goto L_0x0164;
                case 6: goto L_0x0164;
                case 7: goto L_0x0104;
                case 8: goto L_0x0069;
                case 9: goto L_0x0069;
                case 10: goto L_0x0069;
                case 11: goto L_0x0124;
                case 12: goto L_0x0124;
                default: goto L_0x0069;
            }
        L_0x0069:
            java.lang.Integer r1 = r9.A04
            java.lang.Integer r0 = X.AnonymousClass00R.A03
            if (r1 != r0) goto L_0x0073
            X.BzI r2 = r9.A02
            if (r2 != 0) goto L_0x0075
        L_0x0073:
            X.BzI r2 = r9.A07
        L_0x0075:
            X.7RF r1 = new X.7RF
            r1.<init>(r9, r2, r4, r10)
            com.facebook.smartcapture.view.IdCaptureActivity r6 = (com.facebook.smartcapture.view.IdCaptureActivity) r6
            android.view.View r0 = X.AnonymousClass3MZ.A0F(r6)
            r0.post(r1)
            r9.A02 = r2
            java.lang.Integer r0 = r9.A04
            java.lang.Integer r8 = r9.A03
            boolean r2 = X.C18070vi.A17(r0, r8)
            com.facebook.smartcapture.ui.CaptureOverlayFragment r7 = r6.A04
            X.C18070vi.A0b(r7)
            com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment r7 = (com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment) r7
            int r1 = r0.intValue()
            if (r1 == r3) goto L_0x00bc
            if (r1 == r4) goto L_0x00bc
            r0 = 7
            if (r1 == r0) goto L_0x00bc
            r0 = 12
            if (r1 == r0) goto L_0x00d5
            r0 = 11
            if (r1 == r0) goto L_0x00d5
        L_0x00a7:
            com.facebook.smartcapture.ui.CaptureOverlayFragment r2 = r6.A04
            X.C18070vi.A0b(r2)
            com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment r2 = (com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment) r2
            android.widget.ProgressBar r1 = r2.A04
            X.C18070vi.A0b(r1)
            X.DTh r0 = new X.DTh
            r0.<init>(r2)
            r1.post(r0)
            return
        L_0x00bc:
            java.lang.Integer r1 = r7.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x00cd
            int r0 = r8.intValue()
            if (r0 == r5) goto L_0x00d1
            r1 = 2131898632(0x7f123108, float:1.9432187E38)
            if (r0 == r2) goto L_0x00d8
        L_0x00cd:
            r1 = 2131898634(0x7f12310a, float:1.9432191E38)
            goto L_0x00d8
        L_0x00d1:
            r1 = 2131898633(0x7f123109, float:1.943219E38)
            goto L_0x00d8
        L_0x00d5:
            r1 = 2131898638(0x7f12310e, float:1.94322E38)
        L_0x00d8:
            boolean r0 = r7.A1b()
            if (r0 == 0) goto L_0x00a7
            android.content.Context r0 = r7.A14()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.CharSequence r3 = r0.getText(r1)
            X.C18070vi.A0X(r3)
            com.facebook.smartcapture.components.ContourView r2 = r7.A06
            if (r2 == 0) goto L_0x00a7
            r1 = 21
            X.DTa r0 = new X.DTa
            r0.<init>(r7, r3, r1)
            r2.post(r0)
            goto L_0x00a7
        L_0x00fc:
            r6.CKl(r5, r10)
        L_0x00ff:
            r6.CIE(r3)
            goto L_0x0069
        L_0x0104:
            r6.CIE(r5)
            r6.CKl(r1, r10)
            r9.A05 = r5
            goto L_0x011d
        L_0x010d:
            r6.CIE(r5)
            r6.CKl(r1, r10)
            goto L_0x0164
        L_0x0114:
            boolean r0 = r9.A05
            if (r0 != 0) goto L_0x011d
            r9.A05 = r1
            android.os.SystemClock.elapsedRealtime()
        L_0x011d:
            java.lang.ref.WeakReference r0 = r9.A0B
            r0.get()
            goto L_0x0069
        L_0x0124:
            r0 = r6
            com.facebook.smartcapture.view.IdCaptureActivity r0 = (com.facebook.smartcapture.view.IdCaptureActivity) r0
            com.facebook.smartcapture.camera.CameraFragment r8 = r0.A02
            if (r8 == 0) goto L_0x0185
            X.DEn r7 = r0.A03
            if (r7 != 0) goto L_0x0136
            java.lang.String r0 = "presenter"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0136:
            boolean r0 = com.facebook.smartcapture.camera.CameraFragment.A02(r8)
            if (r0 != 0) goto L_0x0185
            X.BHG r0 = r8.A01
            if (r0 == 0) goto L_0x0185
            X.EAk r0 = r0.A0Q
            if (r0 == 0) goto L_0x0185
            boolean r0 = r0.isConnected()
            if (r0 != r1) goto L_0x0185
            X.CKJ r2 = X.C25971Cpe.A0B
            java.lang.Object r0 = com.facebook.smartcapture.camera.CameraFragment.A00(r2, r8)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0168
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x0168
            X.BHG r0 = r8.A01
            if (r0 == 0) goto L_0x0161
            r0.A03(r7)
        L_0x0161:
            r6.CKl(r5, r10)
        L_0x0164:
            r9.A05 = r5
            goto L_0x0069
        L_0x0168:
            X.Csq r1 = new X.Csq
            r1.<init>()
            X.C26128Csq.A01(r2, r1, r5)
            X.BHG r0 = r8.A01
            if (r0 == 0) goto L_0x0161
            X.EAk r2 = r0.A0Q
            if (r2 == 0) goto L_0x0161
            X.CXe r1 = r1.A03()
            X.BUi r0 = new X.BUi
            r0.<init>(r7, r8, r3)
            r2.Bk3(r0, r1)
            goto L_0x0161
        L_0x0185:
            r9.A02()
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26805DEn.A00(X.DEn, boolean):void");
    }

    public final void A01() {
        Integer num;
        Integer num2 = this.A08.A07;
        C28556E7h e7h = (C28556E7h) this.A0C.get();
        if (e7h == null) {
            return;
        }
        if (this.A03 == AnonymousClass00R.A00 && num2 == (num = AnonymousClass00R.A01)) {
            this.A03 = num;
            BLP blp = (BLP) e7h;
            blp.A05 = C24350Bzl.FIRST_PHOTO_CONFIRMATION;
            blp.A2n().A00(blp.A05, C24350Bzl.SECOND_PHOTO_CAPTURE);
            return;
        }
        IdCaptureActivity idCaptureActivity = (IdCaptureActivity) e7h;
        Intent intent = new Intent();
        intent.setData(idCaptureActivity.A00);
        C26805DEn dEn = idCaptureActivity.A03;
        if (dEn == null) {
            C18070vi.A11("presenter");
            throw null;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(dEn.A0D);
        C18070vi.A0X(unmodifiableMap);
        intent.putExtra("front_file_path", idCaptureActivity.A2m().A0B);
        intent.putExtra("front_authenticity_upload_medium", (Serializable) unmodifiableMap.get(C24332BzT.ID_FRONT));
        Integer num3 = idCaptureActivity.A2m().A07;
        C24332BzT bzT = C24332BzT.ID_BACK;
        if (num3 == AnonymousClass00R.A01) {
            intent.putExtra("back_file_path", idCaptureActivity.A2m().A0A);
            intent.putExtra("back_authenticity_upload_medium", (Serializable) unmodifiableMap.get(bzT));
        }
        idCaptureActivity.setResult(-1, intent);
        idCaptureActivity.finish();
        idCaptureActivity.A2n();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r1 != X.AnonymousClass00R.A0C) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r4 = this;
            X.D3k r0 = r4.A08
            java.lang.Integer r1 = r0.A09
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r3 = 0
            boolean r2 = X.AnonymousClass000.A1Z(r1, r0)
            java.lang.Integer r1 = r4.A04
            if (r1 == r0) goto L_0x0029
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x0029
            java.lang.Integer r0 = X.AnonymousClass00R.A15
            if (r1 == r0) goto L_0x0029
            java.lang.Integer r0 = X.AnonymousClass00R.A04
            if (r1 == r0) goto L_0x0029
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 == r0) goto L_0x0023
        L_0x001f:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
        L_0x0021:
            r4.A04 = r0
        L_0x0023:
            r4.A05 = r3
            A00(r4, r3)
            return
        L_0x0029:
            if (r2 == 0) goto L_0x001f
            java.lang.Integer r0 = X.AnonymousClass00R.A15
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26805DEn.A02():void");
    }

    public void Bny() {
        this.A01 = this.A00;
    }
}
