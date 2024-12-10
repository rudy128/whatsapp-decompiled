package X;

import android.content.Context;
import android.util.SparseArray;
import com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl;
import java.util.Map;

/* renamed from: X.Bpx  reason: case insensitive filesystem */
public final class C23806Bpx extends C65802x8 {
    public final WaAuthenticityInterpreterCallbackImpl A00;

    public C23806Bpx(WaAuthenticityInterpreterCallbackImpl waAuthenticityInterpreterCallbackImpl) {
        super("authenticity.action.Upload", "bk.action.authenticity.DocumentPicker", "bk.action.authenticity.DocumentUpload", "authenticity.action.OpenIdCapture", "authenticity.action.OpenSelfieCapture", "bk.action.wa.authenticity.CompleteAuthenticityFlowWithResult");
        this.A00 = waAuthenticityInterpreterCallbackImpl;
    }

    public static final AnonymousClass01C A00(C23736Boh boh) {
        Context context;
        DOZ doz = boh.A00;
        if (doz != null) {
            context = doz.A00;
        } else {
            context = null;
        }
        if (context instanceof AnonymousClass01C) {
            return (AnonymousClass01C) context;
        }
        if (doz == null) {
            return null;
        }
        Object obj = doz.A02.A00().get(2131428249);
        if (obj instanceof AnonymousClass01C) {
            return (AnonymousClass01C) obj;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: X.ECW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: X.ECW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: X.ECW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: X.ECW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: X.ECW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: X.ECW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: X.ECW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: X.ECW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: X.ECW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: X.ECW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: X.ECW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: X.ECW} */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: type inference failed for: r2v13, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: type inference failed for: r1v25, types: [X.BVV, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v26, types: [X.BVX, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v33, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: type inference failed for: r5v8, types: [X.BVW, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v57, types: [X.BVX, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x042d, code lost:
        return X.C27621Wu.A00;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object BKe(X.C199029zJ r34, X.C25681CkC r35, java.lang.String r36) {
        /*
            r33 = this;
            r0 = r35
            X.Boh r0 = (X.C23736Boh) r0
            r2 = 0
            r11 = r34
            r8 = r36
            boolean r3 = X.C18070vi.A17(r8, r11)
            r1 = 2
            X.C18070vi.A0d(r0, r1)
            int r4 = r8.hashCode()
            r10 = 6
            r7 = 4
            r6 = 3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r12 = 0
            r5 = r33
            switch(r4) {
                case -1666112743: goto L_0x0023;
                case -1559448186: goto L_0x015a;
                case -1509532004: goto L_0x027b;
                case -1439269849: goto L_0x02e8;
                case 978011219: goto L_0x0383;
                case 1127893446: goto L_0x03db;
                default: goto L_0x0022;
            }
        L_0x0022:
            return r12
        L_0x0023:
            java.lang.String r2 = "authenticity.action.OpenSelfieCapture"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x0022
            java.util.List r4 = r11.A00
            java.lang.Object r3 = r4.get(r3)
            boolean r2 = r3 instanceof java.lang.Number
            if (r2 == 0) goto L_0x0037
            if (r3 != 0) goto L_0x0038
        L_0x0037:
            r3 = r9
        L_0x0038:
            java.lang.String r8 = r3.toString()
            java.lang.String r6 = X.C17880vN.A0w(r4, r1)
            X.E8A r9 = X.C25488Cgj.A00(r11, r7)
            r2 = 5
            X.E8A r7 = X.AnonymousClass8BT.A08(r4, r2)
            java.lang.Object r3 = r11.A00(r10)
            X.DFL r3 = (X.DFL) r3
            X.C18070vi.A0b(r3)
            r2 = 51
            X.ECW r2 = A01(r3, r2)
            X.01C r4 = A00(r0)
            if (r4 == 0) goto L_0x0022
            com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl r5 = r5.A00
            X.C18070vi.A0b(r6)
            X.Dsu r15 = new X.Dsu
            r15.<init>(r0, r9)
            X.DmC r3 = new X.DmC
            r3.<init>(r0, r7)
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            X.C18070vi.A0d(r8, r1)
            X.00H r0 = r5.A05
            java.lang.Object r14 = r0.get()
            X.D6l r14 = (X.C26617D6l) r14
            X.00H r0 = r14.A03
            java.lang.Object r1 = r0.get()
            X.17y r1 = (X.C219317y) r1
            java.lang.String r0 = "scp_photo.jpg"
            java.io.File r0 = r1.A00(r0)
            java.lang.String r5 = r0.getCanonicalPath()
            X.00H r0 = r14.A02
            java.lang.Object r7 = r0.get()
            X.CTr r7 = (X.C25015CTr) r7
            r7.A02 = r4
            r7.A08 = r6
            if (r2 != 0) goto L_0x00a1
            X.BVY r2 = new X.BVY
            r2.<init>()
        L_0x00a1:
            r7.A05 = r2
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            X.BzU r1 = X.C24333BzU.LEFT
            r2.add(r1)
            X.BzU r0 = X.C24333BzU.UP
            r2.add(r0)
            X.BzU r0 = X.C24333BzU.RIGHT
            r2.add(r0)
            r2.add(r1)
            X.D3t r1 = new X.D3t
            r1.<init>((java.util.List) r2)
            X.D3T r0 = new X.D3T
            r0.<init>()
            r0.A05 = r5
            r7.A03 = r0
            r7.A04 = r1
            X.1Fv r0 = r4.getLifecycle()
            r0.A05(r14)
            X.01M r2 = r4.A04
            X.02i r1 = new X.02i
            r1.<init>()
            r18 = 1
            X.D5a r13 = new X.D5a
            r16 = r4
            r17 = r3
            r13.<init>(r14, r15, r16, r17, r18)
            java.lang.String r0 = "selfiecapture_rq#101"
            X.05q r4 = r2.A04(r13, r1, r0)
            r14.A00 = r4
            X.BVW r5 = new X.BVW
            r5.<init>()
            r7.A06 = r5
            X.BVX r0 = new X.BVX
            r0.<init>()
            r7.A07 = r0
            r0 = 2132083740(0x7f15041c, float:1.980763E38)
            r7.A01 = r0
            r7.A00 = r0
            android.content.Context r3 = r7.A02
            X.D3t r14 = r7.A04
            X.D3T r13 = r7.A03
            java.lang.String r2 = r7.A08
            java.lang.String r0 = "Required value was null."
            if (r3 == 0) goto L_0x043d
            if (r14 == 0) goto L_0x0438
            if (r13 == 0) goto L_0x0433
            if (r2 == 0) goto L_0x042e
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            X.ECW r15 = r7.A05
            if (r15 != 0) goto L_0x011f
            X.BVY r15 = new X.BVY
            r15.<init>()
        L_0x011f:
            int r6 = r7.A01
            int r1 = r7.A00
            X.BVX r0 = r7.A07
            r26 = 0
            java.lang.Integer r18 = X.AnonymousClass00R.A00
            java.lang.Integer r19 = X.AnonymousClass00R.A0Y
            r28 = 0
            X.D4D r11 = new X.D4D
            r22 = r12
            r23 = r12
            r20 = r12
            r21 = r2
            r24 = r6
            r25 = r1
            r16 = r5
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28)
            X.Bzg r2 = X.C24345Bzg.CAPTURE
            java.lang.Class<com.facebook.smartcapture.view.SelfiePhotoCaptureActivity> r0 = com.facebook.smartcapture.view.SelfiePhotoCaptureActivity.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r3, r0)
            java.lang.String r0 = "selfie_capture_config"
            r1.putExtra(r0, r11)
            java.lang.String r0 = "previous_step"
            r1.putExtra(r0, r2)
            r4.A03(r1)
            goto L_0x042b
        L_0x015a:
            java.lang.String r2 = "authenticity.action.OpenIdCapture"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x0022
            java.util.List r4 = r11.A00
            java.lang.Object r3 = r4.get(r3)
            boolean r2 = r3 instanceof java.lang.Number
            if (r2 == 0) goto L_0x016e
            if (r3 != 0) goto L_0x016f
        L_0x016e:
            r3 = r9
        L_0x016f:
            java.lang.String r8 = r3.toString()
            java.lang.String r2 = X.C17880vN.A0w(r4, r6)
            X.E8A r9 = X.C25488Cgj.A00(r11, r7)
            r3 = 5
            X.E8A r7 = X.AnonymousClass8BT.A08(r4, r3)
            java.lang.Object r4 = r11.A00(r10)
            X.DFL r4 = (X.DFL) r4
            X.C18070vi.A0b(r4)
            r3 = 40
            X.ECW r3 = A01(r4, r3)
            X.01C r14 = A00(r0)
            if (r14 == 0) goto L_0x0022
            com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl r6 = r5.A00
            X.C18070vi.A0b(r2)
            X.Dsv r5 = new X.Dsv
            r5.<init>(r0, r9)
            X.DmB r4 = new X.DmB
            r4.<init>(r0, r7)
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.C18070vi.A0d(r8, r1)
            X.00H r0 = r6.A04
            java.lang.Object r15 = r0.get()
            X.D6j r15 = (X.C26615D6j) r15
            X.00H r0 = r15.A03
            java.lang.Object r1 = r0.get()
            X.17y r1 = (X.C219317y) r1
            java.lang.String r0 = "scp_front.jpg"
            java.io.File r0 = r1.A00(r0)
            java.lang.String r1 = r0.getCanonicalPath()
            X.00H r0 = r15.A02
            java.lang.Object r0 = r0.get()
            X.CTq r0 = (X.CTq) r0
            r0.A01 = r14
            r0.A08 = r2
            X.C72453Mb.A1R(r1)
            r0.A07 = r1
            if (r3 != 0) goto L_0x01dd
            X.BVY r3 = new X.BVY
            r3.<init>()
        L_0x01dd:
            r0.A02 = r3
            X.1Fv r1 = r14.getLifecycle()
            r1.A05(r15)
            X.01M r3 = r14.A04
            X.02i r2 = new X.02i
            r2.<init>()
            r30 = 0
            X.D5a r13 = new X.D5a
            r17 = r5
            r18 = r30
            r16 = r4
            r13.<init>(r14, r15, r16, r17, r18)
            java.lang.String r1 = "idcapture_rq#101"
            X.05q r2 = r3.A04(r13, r2, r1)
            r15.A00 = r2
            X.BVV r1 = new X.BVV
            r1.<init>()
            r0.A03 = r1
            X.BVX r1 = new X.BVX
            r1.<init>()
            r0.A04 = r1
            r1 = 2132083738(0x7f15041a, float:1.9807627E38)
            r0.A00 = r1
            java.lang.String r4 = r0.A08
            android.content.Context r3 = r0.A01
            if (r3 == 0) goto L_0x0449
            if (r4 == 0) goto L_0x0449
            X.BzI r1 = X.C24321BzI.ID1
            android.os.Bundle r11 = X.C17880vN.A0D()
            java.lang.Integer r8 = r0.A05
            X.BVV r14 = r0.A03
            int r7 = r0.A00
            X.BVX r15 = r0.A04
            java.lang.String r6 = r0.A07
            java.lang.Integer r5 = r0.A06
            X.ECW r13 = r0.A02
            if (r13 != 0) goto L_0x0238
            X.BVY r13 = new X.BVY
            r13.<init>()
        L_0x0238:
            r26 = 300000(0x493e0, double:1.482197E-318)
            r28 = 0
            java.lang.Integer r18 = X.AnonymousClass00R.A01
            X.D3k r10 = new X.D3k
            r21 = r12
            r23 = r12
            r24 = r12
            r32 = r30
            r19 = r12
            r20 = r6
            r22 = r4
            r25 = r7
            r31 = r30
            r16 = r8
            r17 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r31, r32)
            java.lang.String r0 = r0.A07
            if (r0 == 0) goto L_0x0442
            X.Bzl r5 = X.C24350Bzl.INITIAL
            java.lang.Class<com.facebook.smartcapture.view.IdCaptureActivity> r0 = com.facebook.smartcapture.view.IdCaptureActivity.class
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r3, r0)
            java.lang.String r0 = "preset_document_type"
            r4.putExtra(r0, r1)
            java.lang.String r0 = "id_capture_config"
            r4.putExtra(r0, r10)
            java.lang.String r0 = "previous_step"
            r4.putExtra(r0, r5)
            r2.A03(r4)
            goto L_0x042b
        L_0x027b:
            java.lang.String r2 = "authenticity.action.Upload"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x0022
            java.lang.Object r3 = r11.A00(r3)
            X.C18070vi.A0X(r3)
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r4 = r11.A00(r1)
            X.C18070vi.A0X(r4)
            java.util.Map r4 = (java.util.Map) r4
            X.E8A r8 = X.C25488Cgj.A00(r11, r6)
            X.E8A r6 = X.C25488Cgj.A00(r11, r7)
            r1 = 5
            java.lang.String r15 = X.AnonymousClass8BT.A0t(r11, r1)
            java.lang.Object r9 = r11.A00(r10)
            X.DFL r9 = (X.DFL) r9
            X.C18070vi.A0b(r9)
            r1 = 0
            r7 = 38
            long r21 = r9.A05(r7, r1)
            X.01C r1 = A00(r0)
            if (r1 == 0) goto L_0x0022
            com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl r14 = r5.A00
            X.DqW r5 = new X.DqW
            r5.<init>(r0, r8)
            X.DqX r2 = new X.DqX
            r2.<init>(r0, r6)
            X.C18070vi.A0b(r15)
            X.C18070vi.A0j(r3, r4)
            r0 = 5
            X.C18070vi.A0d(r15, r0)
            X.1pm r1 = X.AnonymousClass2SS.A00(r1)
            X.0wl r0 = r14.A07
            com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$upload$1 r13 = new com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$upload$1
            r16 = r3
            r17 = r4
            r18 = r12
            r19 = r5
            r20 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            X.AnonymousClass3MW.A1X(r0, r13, r1)
            return r12
        L_0x02e8:
            java.lang.String r1 = "bk.action.wa.authenticity.CompleteAuthenticityFlowWithResult"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0022
            java.lang.String r6 = X.AnonymousClass8BT.A0t(r11, r2)
            X.01C r4 = A00(r0)
            if (r4 == 0) goto L_0x0022
            com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl r0 = r5.A00
            X.C18070vi.A0b(r6)
            X.C18070vi.A0d(r6, r3)
            X.00H r0 = r0.A03
            java.lang.Object r3 = r0.get()
            X.CRs r3 = (X.C24968CRs) r3
            X.11S r0 = r3.A01
            r0.A0I()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x0336
            X.1L9 r3 = r3.A00
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.pancake.dosa.DosaActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "geVerificationResult"
            r2.putExtra(r0, r6)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            android.content.Intent r0 = r2.setFlags(r0)
            r3.A08(r4, r0)
        L_0x0331:
            r4.finish()
            goto L_0x042b
        L_0x0336:
            int r1 = r6.hashCode()
            r0 = -1881380961(0xffffffff8fdc679f, float:-2.1733588E-29)
            if (r1 == r0) goto L_0x036d
            r0 = -489858475(0xffffffffe2cd5a55, float:-1.8940458E21)
            if (r1 == r0) goto L_0x0362
            r0 = -75067603(0xfffffffffb868f2d, float:-1.3973435E36)
            if (r1 != r0) goto L_0x0378
            java.lang.String r0 = "APPROVE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0378
            r1 = 34
        L_0x0353:
            X.1CM r0 = r3.A02
            r0.A01(r1)
            android.content.Intent r1 = X.AnonymousClass1LU.A1l(r4, r2)
            X.1L9 r0 = r3.A00
            r0.A08(r4, r1)
            goto L_0x0331
        L_0x0362:
            java.lang.String r0 = "ABANDON"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0378
            r1 = 29
            goto L_0x0353
        L_0x036d:
            java.lang.String r0 = "REJECT"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0378
            r1 = 35
            goto L_0x0353
        L_0x0378:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CompleteAuthenticityFlowManagerImpl/onCompleteFlow/unknown result: "
            X.C17900vP.A0e(r0, r6, r1)
            goto L_0x042b
        L_0x0383:
            java.lang.String r4 = "bk.action.authenticity.DocumentPicker"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x0022
            java.util.List r4 = r11.A00
            r4.get(r2)
            X.E8A r2 = X.C25488Cgj.A00(r11, r3)
            X.E8A r1 = X.C25488Cgj.A00(r11, r1)
            X.E8A r4 = X.C25488Cgj.A00(r11, r6)
            X.01C r7 = A00(r0)
            if (r7 == 0) goto L_0x0022
            com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl r6 = r5.A00
            X.DqY r3 = new X.DqY
            r3.<init>(r0, r2)
            X.DmD r2 = new X.DmD
            r2.<init>(r0, r1)
            X.DqZ r1 = new X.DqZ
            r1.<init>(r0, r4)
            X.D6k r5 = r6.A01
            X.Dr0 r4 = new X.Dr0
            r4.<init>(r6, r2, r3, r1)
            X.1Fv r0 = r7.getLifecycle()
            r0.A05(r5)
            X.01M r3 = r7.A04
            X.05t r2 = new X.05t
            r2.<init>()
            X.D5Z r1 = new X.D5Z
            r1.<init>(r7, r5, r4)
            java.lang.String r0 = "documentpicker_rq#101"
            X.05q r1 = r3.A04(r1, r2, r0)
            r5.A00 = r1
            java.lang.String[] r0 = X.C26616D6k.A01
            r1.A03(r0)
            goto L_0x042b
        L_0x03db:
            java.lang.String r4 = "bk.action.authenticity.DocumentUpload"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x0022
            X.E8A r4 = X.C25488Cgj.A00(r11, r2)
            X.E8A r3 = X.C25488Cgj.A00(r11, r3)
            X.E8A r2 = X.C25488Cgj.A00(r11, r1)
            java.util.List r8 = r11.A00
            java.lang.String r11 = X.C17880vN.A0w(r8, r6)
            java.lang.String r10 = X.C17880vN.A0w(r8, r7)
            X.01C r8 = A00(r0)
            if (r8 == 0) goto L_0x0022
            com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl r9 = r5.A00
            X.C18070vi.A0b(r10)
            X.C18070vi.A0b(r11)
            X.Dqa r14 = new X.Dqa
            r14.<init>(r0, r4)
            X.DmE r13 = new X.DmE
            r13.<init>(r0, r2)
            X.Dqb r15 = new X.Dqb
            r15.<init>(r0, r3)
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            X.C18070vi.A0d(r11, r1)
            X.1pm r1 = X.AnonymousClass2SS.A00(r8)
            X.0wl r0 = r9.A07
            com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$documentUpload$1 r7 = new com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl$documentUpload$1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            X.AnonymousClass3MW.A1X(r0, r7, r1)
        L_0x042b:
            X.1Wu r12 = X.C27621Wu.A00
            return r12
        L_0x042e:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0433:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0438:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x043d:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0442:
            java.lang.String r0 = "Front file path must not be null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0449:
            java.lang.String r0 = "All required fields must not be null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23806Bpx.BKe(X.9zJ, X.CkC, java.lang.String):java.lang.Object");
    }

    public static final ECW A01(DFL dfl, int i) {
        int keyAt;
        C98494rF A002 = C98494rF.A00();
        SparseArray sparseArray = dfl.A06;
        int size = sparseArray.size();
        SparseArray sparseArray2 = (SparseArray) dfl.A07.A00();
        int size2 = sparseArray2.size() + size;
        int i2 = 0;
        while (true) {
            if (i2 < size2) {
                if (i2 <= size - 1) {
                    keyAt = sparseArray.keyAt(i2);
                } else {
                    keyAt = sparseArray2.keyAt(i2 - size);
                }
                Object A003 = DFL.A00(dfl, keyAt);
                if (A003 != null && keyAt == i) {
                    A002.element = new D4E((Map) A003);
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return (ECW) A002.element;
    }
}
