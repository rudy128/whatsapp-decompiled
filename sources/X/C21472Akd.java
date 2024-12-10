package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.jid.UserJid;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Akd  reason: case insensitive filesystem */
public class C21472Akd implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public C21472Akd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A06 = obj6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v192, resolved type: X.21w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v194, resolved type: X.21y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v209, resolved type: X.21w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v210, resolved type: X.21w} */
    /* JADX WARNING: type inference failed for: r4v0, types: [X.5oM, java.lang.Object, X.DMs] */
    /* JADX WARNING: type inference failed for: r8v12, types: [X.2SB, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x029d, code lost:
        if (r10 != null) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x029f, code lost:
        r2.setVisibility(8);
        r9.inflate();
        r9 = X.AnonymousClass3MW.A0r(r8, 2131432446);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02ae, code lost:
        if (r11 == null) goto L_0x02f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        r1 = ((X.C61762qD) r10.first).A09;
        r21 = ((java.lang.Integer) r10.second).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0303, code lost:
        r21 = ((java.lang.Integer) r11.second).intValue();
        r1 = X.C17880vN.A16(((X.C20253ADl) r11.first).A01.A00).getString("display_text");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x031d, code lost:
        r9.setText(r1);
        r9.setSize(X.AnonymousClass4D1.A03);
        r5.A0G = true;
        r9.setOnClickListener(new X.C89784d1(r5, r11, r4, r10, r21, 1));
        r0 = r5.A1E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x033e, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0340, code lost:
        r0 = r0.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0344, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0346, code lost:
        r0.setPlayControlVisibility(8);
        r0.A09 = false;
        r5.A1n = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x034f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0350, code lost:
        com.whatsapp.util.Log.e("MediaViewFragment/failed to parse interactive message button params", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x05b1, code lost:
        if (r9 == null) goto L_0x05b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x078e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0793, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:?, code lost:
        com.whatsapp.util.Log.w("encb/EncBackupManager/decrypt media failed", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0798, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:?, code lost:
        com.whatsapp.util.Log.w("encb/EncBackupManager/decrypt media failed", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0b55, code lost:
        r3 = ((java.util.concurrent.atomic.AtomicBoolean) r0.A04).get();
        r2 = ((X.C125736bb) r0.A02).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0b63, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0178, code lost:
        if (X.C42701yb.A01(r2) != false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:?, code lost:
        r2.A03 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0f7e, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0f7f, code lost:
        r1 = r2.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0f81, code lost:
        if (r3 == false) goto L_0x0f8c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0f83, code lost:
        r0 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0f88, code lost:
        r1.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0f8b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0f8c, code lost:
        r0 = new X.C162178Jk();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0fa1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0fa2, code lost:
        X.CDX.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0fa5, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:629:0x1165, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:0x1168, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:635:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:636:0x116c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:640:0x116f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:0x1170, code lost:
        X.CDX.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:0x1173, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01df, code lost:
        if (r11 != null) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0798 A[ExcHandler: InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException (r0v108 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:257:0x0752] */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x080f  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x0a4f  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0a88  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x0a9f  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0ab2  */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x0dbb A[Catch:{ Exception -> 0x0eac }] */
    /* JADX WARNING: Removed duplicated region for block: B:493:0x0dfb A[Catch:{ Exception -> 0x0eac }] */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x0e7e  */
    /* JADX WARNING: Removed duplicated region for block: B:693:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r70 = this;
            r0 = r70
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x10fc;
                case 1: goto L_0x1067;
                case 2: goto L_0x104b;
                case 3: goto L_0x0831;
                case 4: goto L_0x0638;
                case 5: goto L_0x0fa6;
                case 6: goto L_0x0567;
                case 7: goto L_0x0b1e;
                case 8: goto L_0x09b2;
                case 9: goto L_0x0543;
                case 10: goto L_0x042b;
                case 11: goto L_0x093f;
                case 12: goto L_0x0923;
                case 13: goto L_0x0104;
                case 14: goto L_0x0907;
                case 15: goto L_0x0048;
                case 16: goto L_0x08eb;
                case 17: goto L_0x08ca;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r6 = r0.A01
            X.206 r6 = (X.AnonymousClass206) r6
            java.lang.Object r7 = r0.A02
            X.1WM r7 = (X.AnonymousClass1WM) r7
            java.lang.Object r2 = r0.A03
            X.121 r2 = (X.AnonymousClass121) r2
            java.lang.Object r5 = r0.A04
            X.1KB r5 = (X.AnonymousClass1KB) r5
            java.lang.Object r4 = r0.A05
            java.lang.Object r3 = r0.A06
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            int r1 = r6.A0D()
            r0 = 7
            if (r1 != r0) goto L_0x0039
            r6.A0U()
            boolean r0 = r6 instanceof X.AnonymousClass212
            if (r0 == 0) goto L_0x0044
            X.205 r0 = r6.A0v
            X.11m r2 = r7.A0E
            java.util.Set r1 = java.util.Collections.singleton(r0)
            r0 = 0
            r2.A0A(r1, r0)
        L_0x0039:
            r1 = 27
            X.7RO r0 = new X.7RO
            r0.<init>(r6, r4, r3, r1)
            r5.A0J(r0)
        L_0x0043:
            return
        L_0x0044:
            r2.CQw(r6)
            goto L_0x0039
        L_0x0048:
            java.lang.Object r5 = r0.A01
            X.9u1 r5 = (X.C195859u1) r5
            java.lang.Object r14 = r0.A02
            android.content.Context r14 = (android.content.Context) r14
            java.lang.Object r4 = r0.A03
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.Object r8 = r0.A04
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            java.lang.Object r3 = r0.A05
            X.9ui r3 = (X.C196259ui) r3
            java.lang.Object r2 = r0.A06
            X.BCC r2 = (X.BCC) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: sendGetContactInfoForJid: "
            X.C17900vP.A0Y(r4, r0, r1)
            X.AZ6 r10 = r5.A07
            r10.COK()
            X.90Z r0 = r5.A08
            java.lang.String r6 = "upi-get-vpa"
            X.9r1 r1 = r0.A02
            java.lang.Integer r7 = r1.A00(r6)
            if (r3 == 0) goto L_0x007d
            r3.A02(r6)
        L_0x007d:
            X.0ve r13 = r5.A03
            X.1Ln r9 = r5.A02
            X.190 r0 = r5.A00
            com.whatsapp.jid.UserJid r11 = X.C60432o1.A01(r0, r9, r13, r4, r6)
            if (r11 != 0) goto L_0x0096
            java.lang.String r0 = "PAY: IndiaUpiContactActions : lidCompatibleJid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.A7B r3 = X.A7B.A00()
        L_0x0092:
            r2.Bss(r3)
            return
        L_0x0096:
            if (r8 == 0) goto L_0x0102
            X.1QL r0 = r5.A05
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0102
            boolean r0 = r8.booleanValue()
            if (r0 == 0) goto L_0x00ff
            java.lang.String r9 = "true"
        L_0x00a8:
            X.00H r12 = r5.A09
            java.lang.String r8 = X.C17890vO.A0T(r12)
            X.9F5 r0 = new X.9F5
            r0.<init>((java.lang.String) r8, (com.whatsapp.jid.UserJid) r11, (java.lang.String) r9)
            r11 = 12215(0x2fb7, float:1.7117E-41)
            X.0vf r9 = X.C18040vf.A02
            boolean r9 = X.C18020vd.A05(r9, r13, r11)
            X.1OZ r26 = X.C17880vN.A0U(r12)
            X.1ca r28 = r0.BVP()
            if (r9 == 0) goto L_0x1135
            X.1KB r9 = r5.A01
            X.00H r11 = r5.A0A
            X.1jG r18 = X.AnonymousClass8BR.A0a(r11)
            r25 = 0
            X.8zU r13 = new X.8zU
            r15 = r14
            r24 = r7
            r22 = r10
            r23 = r0
            r20 = r2
            r21 = r5
            r19 = r3
            r17 = r4
            r16 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r31 = 0
            r30 = 204(0xcc, float:2.86E-43)
            r27 = r13
            r29 = r8
            boolean r0 = r26.A0N(r27, r28, r29, r30, r31)
            if (r0 != 0) goto L_0x0043
            r0 = 7
            X.A7B r3 = new X.A7B
            r3.<init>((int) r0)
            r1.A01(r3, r7, r6)
            if (r2 == 0) goto L_0x0043
            goto L_0x0092
        L_0x00ff:
            java.lang.String r9 = "false"
            goto L_0x00a8
        L_0x0102:
            r9 = 0
            goto L_0x00a8
        L_0x0104:
            java.lang.Object r5 = r0.A01
            com.whatsapp.mediaview.MediaViewFragment r5 = (com.whatsapp.mediaview.MediaViewFragment) r5
            java.lang.Object r8 = r0.A02
            android.view.View r8 = (android.view.View) r8
            java.lang.Object r1 = r0.A03
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            java.lang.Object r4 = r0.A04
            X.21V r4 = (X.AnonymousClass21V) r4
            java.lang.Object r9 = r0.A05
            android.view.ViewStub r9 = (android.view.ViewStub) r9
            java.lang.Object r6 = r0.A06
            r1.inflate()
            r0 = 2131432452(0x7f0b1404, float:1.8486662E38)
            android.view.View r1 = r8.findViewById(r0)
            if (r1 == 0) goto L_0x0143
            r0 = 2131434514(0x7f0b1c12, float:1.8490844E38)
            android.widget.ImageView r7 = X.AnonymousClass3MW.A0G(r1, r0)
            X.0vb r3 = r5.A0W
            android.content.res.Resources r2 = r1.getResources()
            r1 = 0
            r0 = 2131233420(0x7f080a8c, float:1.8082977E38)
            android.graphics.drawable.Drawable r1 = X.C40501uo.A00(r1, r2, r0)
            X.3cP r0 = new X.3cP
            r0.<init>(r1, r3)
            r7.setImageDrawable(r0)
        L_0x0143:
            X.205 r0 = r4.A0v
            X.1BI r2 = r0.A00
            X.C17960vV.A07(r2)
            X.00H r0 = r5.A1X
            java.lang.Object r0 = r0.get()
            X.6z1 r0 = (X.C139546z1) r0
            boolean r0 = r0.A02(r4)
            if (r0 == 0) goto L_0x017a
            boolean r0 = X.C22971Dz.A0V(r2)
            if (r0 != 0) goto L_0x017a
            boolean r0 = X.C22971Dz.A0S(r2)
            if (r0 != 0) goto L_0x017a
            X.1CJ r1 = r5.A0X
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r0 = X.C36321nh.A00(r2)
            int r1 = r1.A06(r0)
            r0 = 3
            if (r1 == r0) goto L_0x017a
            boolean r0 = X.C42701yb.A01(r2)
            r15 = 1
            if (r0 == 0) goto L_0x017b
        L_0x017a:
            r15 = 0
        L_0x017b:
            boolean r0 = X.C22971Dz.A0V(r2)
            r14 = r0 ^ 1
            r0 = 2131432452(0x7f0b1404, float:1.8486662E38)
            android.view.View r2 = r8.findViewById(r0)
            r7 = 0
            if (r2 == 0) goto L_0x01e1
            boolean r0 = r4 instanceof X.C438521e
            r13 = 0
            if (r0 == 0) goto L_0x01f7
            X.00H r0 = r5.A1Z
            java.lang.Object r0 = r0.get()
            X.A4R r0 = (X.A4R) r0
            r1 = r4
            X.21e r1 = (X.C438521e) r1
            X.C18070vi.A0d(r1, r7)
            X.0ve r0 = r0.A00
            r11 = 11323(0x2c3b, float:1.5867E-41)
            X.0vf r10 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r10, r0, r11)
            if (r0 == 0) goto L_0x01f7
            X.AEt r0 = r1.A00
            if (r0 == 0) goto L_0x01f5
            java.lang.String r0 = r0.A0D
        L_0x01b0:
            java.lang.String r3 = "MARKETING"
            boolean r0 = X.C18070vi.A18(r0, r3)
            if (r0 == 0) goto L_0x01f7
            X.1D6 r0 = X.A4R.A01(r1)
            if (r0 == 0) goto L_0x01f7
            X.00H r0 = r5.A1Z
            java.lang.Object r0 = r0.get()
            X.A4R r0 = (X.A4R) r0
            X.0ve r0 = r0.A00
            boolean r0 = X.C18020vd.A05(r10, r0, r11)
            if (r0 == 0) goto L_0x01e1
            X.AEt r0 = r1.A00
            if (r0 == 0) goto L_0x01f3
            java.lang.String r0 = r0.A0D
        L_0x01d4:
            boolean r0 = X.C18070vi.A18(r0, r3)
            if (r0 == 0) goto L_0x01e1
            X.1D6 r11 = X.A4R.A01(r1)
        L_0x01de:
            r10 = r13
            if (r11 != 0) goto L_0x029f
        L_0x01e1:
            r3 = 8
            if (r15 != 0) goto L_0x0357
            if (r14 != 0) goto L_0x0357
            r0 = 2131432447(0x7f0b13ff, float:1.8486652E38)
            X.C72463Mc.A16(r8, r0, r3)
            if (r2 == 0) goto L_0x0043
            r2.setVisibility(r3)
            return
        L_0x01f3:
            r0 = r13
            goto L_0x01d4
        L_0x01f5:
            r0 = r13
            goto L_0x01b0
        L_0x01f7:
            boolean r0 = r4 instanceof X.C438121a
            if (r0 == 0) goto L_0x024e
            X.00H r0 = r5.A1Z
            java.lang.Object r0 = r0.get()
            X.A4R r0 = (X.A4R) r0
            r1 = r4
            X.21a r1 = (X.C438121a) r1
            X.C18070vi.A0d(r1, r7)
            X.0ve r0 = r0.A00
            r11 = 11691(0x2dab, float:1.6383E-41)
            X.0vf r10 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r10, r0, r11)
            if (r0 == 0) goto L_0x024e
            X.AEt r0 = r1.A00
            if (r0 == 0) goto L_0x024c
            java.lang.String r0 = r0.A0D
        L_0x021b:
            java.lang.String r3 = "MARKETING"
            boolean r0 = X.C18070vi.A18(r0, r3)
            if (r0 == 0) goto L_0x024e
            X.1D6 r0 = X.A4R.A01(r1)
            if (r0 == 0) goto L_0x024e
            X.00H r0 = r5.A1Z
            java.lang.Object r0 = r0.get()
            X.A4R r0 = (X.A4R) r0
            X.0ve r0 = r0.A00
            boolean r0 = X.C18020vd.A05(r10, r0, r11)
            if (r0 == 0) goto L_0x01e1
            X.AEt r0 = r1.A00
            if (r0 == 0) goto L_0x024a
            java.lang.String r0 = r0.A0D
        L_0x023f:
            boolean r0 = X.C18070vi.A18(r0, r3)
            if (r0 == 0) goto L_0x01e1
            X.1D6 r11 = X.A4R.A01(r1)
            goto L_0x01de
        L_0x024a:
            r0 = r13
            goto L_0x023f
        L_0x024c:
            r0 = r13
            goto L_0x021b
        L_0x024e:
            boolean r0 = r4 instanceof X.C440521y
            if (r0 == 0) goto L_0x02b1
            X.00H r0 = r5.A1Z
            java.lang.Object r10 = r0.get()
            X.A4R r10 = (X.A4R) r10
            r1 = r4
            X.21y r1 = (X.C440521y) r1
            X.C18070vi.A0d(r1, r7)
            X.0ve r0 = r10.A00
            r12 = 11323(0x2c3b, float:1.5867E-41)
            X.0vf r11 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r11, r0, r12)
            if (r0 == 0) goto L_0x02b1
            X.2k6 r0 = r1.A00
            java.lang.String r0 = r0.A04
            java.lang.String r3 = "MARKETING"
            boolean r0 = X.C18070vi.A18(r0, r3)
            if (r0 == 0) goto L_0x02b1
            X.1D6 r0 = X.A4R.A00(r10, r1)
            if (r0 == 0) goto L_0x02b1
            X.00H r0 = r5.A1Z
            java.lang.Object r10 = r0.get()
            X.A4R r10 = (X.A4R) r10
            X.0ve r0 = r10.A00
            boolean r0 = X.C18020vd.A05(r11, r0, r12)
            if (r0 == 0) goto L_0x01e1
            X.2k6 r0 = r1.A00
        L_0x0290:
            java.lang.String r0 = r0.A04
            boolean r0 = X.C18070vi.A18(r0, r3)
            if (r0 == 0) goto L_0x01e1
            X.1D6 r10 = X.A4R.A00(r10, r1)
            r11 = r13
            if (r10 == 0) goto L_0x01e1
        L_0x029f:
            r3 = 8
            r2.setVisibility(r3)
            r9.inflate()
            r0 = 2131432446(0x7f0b13fe, float:1.848665E38)
            com.whatsapp.wds.components.button.WDSButton r9 = X.AnonymousClass3MW.A0r(r8, r0)
            if (r11 == 0) goto L_0x02f4
            goto L_0x0303
        L_0x02b1:
            boolean r0 = r4 instanceof X.C440321w
            if (r0 == 0) goto L_0x01e1
            X.00H r0 = r5.A1Z
            java.lang.Object r10 = r0.get()
            X.A4R r10 = (X.A4R) r10
            r1 = r4
            X.21w r1 = (X.C440321w) r1
            X.C18070vi.A0d(r1, r7)
            X.0ve r0 = r10.A00
            r12 = 11691(0x2dab, float:1.6383E-41)
            X.0vf r11 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r11, r0, r12)
            if (r0 == 0) goto L_0x01e1
            X.2k6 r0 = r1.A00
            java.lang.String r0 = r0.A04
            java.lang.String r3 = "MARKETING"
            boolean r0 = X.C18070vi.A18(r0, r3)
            if (r0 == 0) goto L_0x01e1
            X.1D6 r0 = X.A4R.A00(r10, r1)
            if (r0 == 0) goto L_0x01e1
            X.00H r0 = r5.A1Z
            java.lang.Object r10 = r0.get()
            X.A4R r10 = (X.A4R) r10
            X.0ve r0 = r10.A00
            boolean r0 = X.C18020vd.A05(r11, r0, r12)
            if (r0 == 0) goto L_0x01e1
            X.2k6 r0 = r1.A00
            goto L_0x0290
        L_0x02f4:
            java.lang.Object r0 = r10.first     // Catch:{ Exception -> 0x034f }
            X.2qD r0 = (X.C61762qD) r0     // Catch:{ Exception -> 0x034f }
            java.lang.String r1 = r0.A09     // Catch:{ Exception -> 0x034f }
            java.lang.Object r0 = r10.second     // Catch:{ Exception -> 0x034f }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x034f }
            int r21 = r0.intValue()     // Catch:{ Exception -> 0x034f }
            goto L_0x031d
        L_0x0303:
            java.lang.Object r1 = r11.first     // Catch:{ Exception -> 0x034f }
            X.ADl r1 = (X.C20253ADl) r1     // Catch:{ Exception -> 0x034f }
            java.lang.Object r0 = r11.second     // Catch:{ Exception -> 0x034f }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x034f }
            int r21 = r0.intValue()     // Catch:{ Exception -> 0x034f }
            X.AEe r0 = r1.A01     // Catch:{ Exception -> 0x034f }
            java.lang.String r0 = r0.A00     // Catch:{ Exception -> 0x034f }
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ Exception -> 0x034f }
            java.lang.String r0 = "display_text"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ Exception -> 0x034f }
        L_0x031d:
            r9.setText(r1)     // Catch:{ Exception -> 0x034f }
            X.4D1 r0 = X.AnonymousClass4D1.NORMAL     // Catch:{ Exception -> 0x034f }
            r9.setSize(r0)     // Catch:{ Exception -> 0x034f }
            r1 = 1
            r5.A0G = r1     // Catch:{ Exception -> 0x034f }
            X.4d1 r0 = new X.4d1     // Catch:{ Exception -> 0x034f }
            r19 = r4
            r20 = r10
            r22 = r1
            r17 = r5
            r18 = r11
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x034f }
            r9.setOnClickListener(r0)     // Catch:{ Exception -> 0x034f }
            X.70X r0 = r5.A1E     // Catch:{ Exception -> 0x034f }
            if (r0 == 0) goto L_0x0043
            X.6Mj r0 = r0.A0A()     // Catch:{ Exception -> 0x034f }
            if (r0 == 0) goto L_0x0043
            r0.setPlayControlVisibility(r3)     // Catch:{ Exception -> 0x034f }
            r0.A09 = r7     // Catch:{ Exception -> 0x034f }
            r5.A1n = r1     // Catch:{ Exception -> 0x034f }
            goto L_0x1165
        L_0x034f:
            r1 = move-exception
            java.lang.String r0 = "MediaViewFragment/failed to parse interactive message button params"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x01e1
        L_0x0357:
            r0 = 2131432447(0x7f0b13ff, float:1.8486652E38)
            X.C72463Mc.A16(r8, r0, r3)
            if (r2 == 0) goto L_0x0043
            r0 = 2131434359(0x7f0b1b77, float:1.849053E38)
            X.AnonymousClass3MY.A1B(r2, r0, r3)
            r0 = 2131434334(0x7f0b1b5e, float:1.849048E38)
            X.AnonymousClass3MY.A1A(r2, r0, r3)
            r0 = 2131432450(0x7f0b1402, float:1.8486658E38)
            android.view.View r10 = X.AnonymousClass1HF.A06(r2, r0)
            if (r14 == 0) goto L_0x03fd
            r0 = 12
            X.3By r7 = new X.3By
            r7.<init>(r5, r4, r0)
            com.whatsapp.mediaview.MediaViewCurrentMessageViewModel r0 = r5.A0n
            if (r0 == 0) goto L_0x03b9
            r0 = 2131434359(0x7f0b1b77, float:1.849053E38)
            android.view.View r9 = r2.findViewById(r0)
            com.whatsapp.conversation.conversationrow.ReactionsBubbleLayout r9 = (com.whatsapp.conversation.conversationrow.ReactionsBubbleLayout) r9
            r0 = 4
            r9.setVisibility(r0)
            r0 = 1
            r9.A0A = r0
            r0 = 2131232858(0x7f08085a, float:1.8081837E38)
            r9.setBackgroundResource(r0)
            android.util.DisplayMetrics r8 = X.AnonymousClass3Ma.A09(r9)
            r1 = 1
            r0 = 1098907648(0x41800000, float:16.0)
            float r0 = android.util.TypedValue.applyDimension(r1, r0, r8)
            int r1 = (int) r0
            r0 = 0
            r9.setPadding(r1, r0, r1, r0)
            java.lang.ref.WeakReference r9 = X.AnonymousClass3MW.A0z(r9)
            com.whatsapp.mediaview.MediaViewCurrentMessageViewModel r0 = r5.A0n
            X.1DT r1 = r0.A00
            r13 = 0
            X.7AJ r0 = new X.7AJ
            r8 = r0
            r11 = r5
            r12 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            r1.A0A(r5, r0)
        L_0x03b9:
            boolean r0 = r5.A1b()
            if (r0 == 0) goto L_0x03fd
            r0 = 2131434334(0x7f0b1b5e, float:1.849048E38)
            android.view.View r9 = X.AnonymousClass1HF.A06(r2, r0)
            com.whatsapp.reactions.ReactionsTrayViewModel r0 = r5.A13
            if (r0 != 0) goto L_0x03eb
            X.1It r1 = X.AnonymousClass3MW.A0N(r5)
            java.lang.Class<com.whatsapp.reactions.ReactionsTrayViewModel> r0 = com.whatsapp.reactions.ReactionsTrayViewModel.class
            X.1J2 r8 = r1.A00(r0)
            com.whatsapp.reactions.ReactionsTrayViewModel r8 = (com.whatsapp.reactions.ReactionsTrayViewModel) r8
            r5.A13 = r8
            X.1vp r7 = r8.A0H
            r1 = 24
            X.4fm r0 = new X.4fm
            r0.<init>(r8, r5, r1)
            r7.A0A(r5, r0)
            X.1vp r1 = r8.A0F
            r0 = 11
            X.AnonymousClass7AQ.A00(r5, r1, r0)
        L_0x03eb:
            com.whatsapp.mediaview.MediaViewCurrentMessageViewModel r0 = r5.A0n
            if (r0 == 0) goto L_0x03fd
            X.1DT r1 = r0.A00
            r13 = 1
            X.7AJ r0 = new X.7AJ
            r8 = r0
            r11 = r5
            r12 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            r1.A0A(r5, r0)
        L_0x03fd:
            r0 = 2131434512(0x7f0b1c10, float:1.849084E38)
            android.view.View r6 = X.AnonymousClass1HF.A06(r2, r0)
            if (r15 == 0) goto L_0x1161
            r0 = 2131434514(0x7f0b1c12, float:1.8490844E38)
            X.AnonymousClass1HF.A06(r2, r0)
            r1 = 17
            X.787 r0 = new X.787
            r0.<init>(r5, r4, r1)
            r6.setOnClickListener(r0)
            r0 = 2131430490(0x7f0b0c5a, float:1.8482682E38)
            android.view.View r2 = X.AnonymousClass1HF.A06(r2, r0)
            r1 = 18
            X.787 r0 = new X.787
            r0.<init>(r5, r4, r1)
            r2.setOnClickListener(r0)
            r0 = 1
            r5.A0G = r0
            return
        L_0x042b:
            java.lang.Object r7 = r0.A01
            X.4X0 r7 = (X.AnonymousClass4X0) r7
            java.lang.Object r8 = r0.A02
            X.3uP r8 = (X.AnonymousClass3uP) r8
            java.lang.Object r9 = r0.A03
            android.view.View r9 = (android.view.View) r9
            java.lang.Object r6 = r0.A04
            com.whatsapp.KeyboardPopupLayout r6 = (com.whatsapp.KeyboardPopupLayout) r6
            java.lang.Object r5 = r0.A05
            X.4DC r5 = (X.AnonymousClass4DC) r5
            java.lang.Object r4 = r0.A06
            X.205 r4 = (X.AnonymousClass205) r4
            X.0vl r2 = r7.A05
            java.lang.Object r1 = r2.getValue()
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            X.206 r0 = r8.getFMessage()
            X.205 r0 = r0.A0v
            java.lang.String r0 = r0.A01
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L_0x0043
            X.0ve r3 = r7.A02
            r1 = 12250(0x2fda, float:1.7166E-41)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r3, r1)
            if (r1 <= 0) goto L_0x0472
            java.lang.Object r0 = r2.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            int r0 = r0.size()
            if (r0 < r1) goto L_0x0472
            return
        L_0x0472:
            android.graphics.Rect r10 = X.AnonymousClass3MW.A07()
            android.graphics.Rect r11 = X.AnonymousClass3MW.A07()
            r9.getGlobalVisibleRect(r10)
            r6.getGlobalVisibleRect(r11)
            android.content.Context r0 = r6.getContext()
            com.airbnb.lottie.LottieAnimationView r3 = new com.airbnb.lottie.LottieAnimationView
            r3.<init>(r0)
            X.0vl r14 = r7.A06
            java.lang.Object r0 = X.AnonymousClass8BV.A0n(r5, r14)
            X.9rX r0 = (X.C194319rX) r0
            r12 = 0
            if (r0 == 0) goto L_0x0540
            float r1 = r0.A02
        L_0x0496:
            float r0 = X.C72473Md.A00(r6)
            float r1 = r1 * r0
            int r9 = (int) r1
            java.lang.Object r0 = X.AnonymousClass8BV.A0n(r5, r14)
            X.9rX r0 = (X.C194319rX) r0
            if (r0 == 0) goto L_0x053d
            float r1 = r0.A00
        L_0x04a6:
            float r0 = X.C72473Md.A00(r6)
            float r1 = r1 * r0
            int r13 = (int) r1
            java.lang.Object r0 = X.AnonymousClass8BV.A0n(r5, r14)
            X.9rX r0 = (X.C194319rX) r0
            if (r0 == 0) goto L_0x04b6
            float r12 = r0.A01
        L_0x04b6:
            float r0 = X.C72473Md.A00(r6)
            float r12 = r12 * r0
            int r12 = (int) r12
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r9, r13)
            r3.setLayoutParams(r0)
            X.0vl r0 = r7.A04
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.Object r0 = r0.get(r5)
            X.1tf r0 = (X.C39801tf) r0
            if (r0 == 0) goto L_0x0043
            r3.setComposition(r0)
            int r1 = r10.top
            int r0 = r11.top
            int r1 = r1 - r0
            int r1 = r1 - r13
            int r1 = r1 + r12
            float r0 = (float) r1
            r3.setY(r0)
            X.0vb r0 = r7.A01
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            if (r0 == 0) goto L_0x052d
            int r1 = r10.left
            int r0 = r11.left
            int r1 = r1 - r0
            int r0 = r10.width()
            int r0 = r0 / 2
            int r1 = r1 + r0
            int r0 = r9 / 2
            int r1 = r1 - r0
        L_0x04f9:
            float r0 = (float) r1
            r3.setX(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_END
            r3.setScaleType(r0)
            r6.addView(r3)
            java.lang.Object r9 = r2.getValue()
            java.util.AbstractMap r9 = (java.util.AbstractMap) r9
            java.lang.String r2 = r4.A01
            X.C18070vi.A0X(r2)
            float r0 = r3.getY()
            int r1 = (int) r0
            X.4Nt r0 = new X.4Nt
            r0.<init>(r3, r8, r5, r1)
            r9.put(r2, r0)
            r3.A04()
            X.A9D r1 = new X.A9D
            r1.<init>(r3, r6, r7, r4)
            X.1rd r0 = r3.A09
            X.1rf r0 = r0.A0d
            r0.addListener(r1)
            return
        L_0x052d:
            int r1 = r10.right
            int r0 = r11.right
            int r1 = r1 - r0
            int r0 = r10.width()
            int r0 = r0 / 2
            int r1 = r1 - r0
            int r0 = r9 / 2
            int r1 = r1 + r0
            goto L_0x04f9
        L_0x053d:
            r1 = 0
            goto L_0x04a6
        L_0x0540:
            r1 = 0
            goto L_0x0496
        L_0x0543:
            java.lang.Object r1 = r0.A05
            X.49m r1 = (X.C827249m) r1
            boolean r1 = r1.A02
            if (r1 != 0) goto L_0x0043
            java.lang.Object r2 = r0.A02
            java.lang.Object r1 = r0.A06
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r1 = r1.getTag()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0043
            java.lang.Object r1 = r0.A01
            X.5ZA r1 = (X.AnonymousClass5ZA) r1
            java.lang.Object r0 = r0.A03
            android.text.SpannableStringBuilder r0 = (android.text.SpannableStringBuilder) r0
            r1.CF8(r0)
            return
        L_0x0567:
            java.lang.Object r4 = r0.A01
            X.2dh r4 = (X.C54162dh) r4
            java.lang.Object r8 = r0.A02
            X.2hx r8 = (X.C56742hx) r8
            java.lang.Object r1 = r0.A03
            X.1W6 r1 = (X.AnonymousClass1W6) r1
            java.lang.Object r5 = r0.A04
            X.22M r5 = (X.AnonymousClass22M) r5
            java.lang.Object r11 = r0.A05
            X.206 r11 = (X.AnonymousClass206) r11
            java.lang.Object r3 = r0.A06
            r0 = 5
            X.C18070vi.A0d(r3, r0)
            X.205 r7 = r5.A0v
            X.206 r1 = X.C108945cZ.A0s(r7, r1)
            boolean r0 = r1 instanceof X.AnonymousClass22M
            if (r0 == 0) goto L_0x05b3
            X.22M r1 = (X.AnonymousClass22M) r1
            if (r1 == 0) goto L_0x05b3
            long r0 = r8.A00(r1)
            r9 = -1
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x05b3
            X.00H r6 = r4.A02
            java.lang.Object r2 = r6.get()
            X.1TD r2 = (X.AnonymousClass1TD) r2
            X.9Bw r9 = r2.A04(r0)
            if (r9 != 0) goto L_0x0623
            java.lang.Object r2 = r6.get()
            X.1TD r2 = (X.AnonymousClass1TD) r2
            X.9Bw r9 = r2.A05(r0)
            if (r9 != 0) goto L_0x0623
        L_0x05b3:
            long r0 = r11.A0x
            X.1Cd r2 = r8.A00
            X.1at r2 = r2.get()
            r6 = r2
            X.1av r6 = (X.C28801av) r6     // Catch:{ all -> 0x116d }
            X.1Ev r8 = r6.A02     // Catch:{ all -> 0x116d }
            java.lang.String r6 = "SELECT video_call, call_result FROM message_quoted_call_log WHERE message_row_id = ?"
            java.lang.String[] r1 = X.C17900vP.A0t(r0)     // Catch:{ all -> 0x116d }
            java.lang.String r0 = "GET_QUOTED_CALL_LOG_MESSAGE"
            android.database.Cursor r6 = r8.A0A(r6, r0, r1)     // Catch:{ all -> 0x116d }
            boolean r0 = r6.moveToLast()     // Catch:{ all -> 0x1166 }
            r8 = 0
            if (r0 == 0) goto L_0x05e7
            java.lang.String r0 = "video_call"
            int r0 = X.C17890vO.A01(r6, r0)     // Catch:{ all -> 0x1166 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x1166 }
            java.lang.String r0 = "call_result"
            int r0 = X.C17890vO.A01(r6, r0)     // Catch:{ all -> 0x1166 }
            X.1D6 r8 = X.AnonymousClass1D6.A00(r1, r0)     // Catch:{ all -> 0x1166 }
        L_0x05e7:
            r6.close()     // Catch:{ all -> 0x116d }
            r2.close()
            boolean r6 = r7.A02
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            if (r6 != 0) goto L_0x0635
            X.1BI r0 = r5.A0H()
        L_0x05f7:
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A01(r0)
            if (r8 == 0) goto L_0x0043
            if (r2 == 0) goto L_0x0043
            java.lang.String r1 = r7.A01
            X.C18070vi.A0X(r1)
            r0 = -1
            X.4cT r11 = new X.4cT
            r11.<init>(r0, r2, r1, r6)
            long r13 = r5.A0I
            int r1 = X.AnonymousClass3MZ.A04(r8)
            r0 = 1
            boolean r15 = X.AnonymousClass000.A1T(r1, r0)
            r10 = 0
            X.9Bw r9 = new X.9Bw
            r12 = r10
            r9.<init>(r10, r11, r12, r13, r15)
            int r0 = X.C108955ca.A09(r8)
            r9.A0E(r0)
        L_0x0623:
            X.25F r0 = r5.A00
            r0.A02(r9)
            X.1KB r2 = r4.A00
            r1 = 19
            X.7Pb r0 = new X.7Pb
            r0.<init>(r3, r1)
            r2.A0J(r0)
            return
        L_0x0635:
            X.1BI r0 = r7.A00
            goto L_0x05f7
        L_0x0638:
            java.lang.Object r6 = r0.A01
            X.9i4 r6 = (X.C188839i4) r6
            java.lang.Object r5 = r0.A02
            X.A2d r5 = (X.C19990A2d) r5
            java.lang.Object r9 = r0.A03
            java.util.concurrent.atomic.AtomicReference r9 = (java.util.concurrent.atomic.AtomicReference) r9
            java.lang.Object r7 = r0.A04
            java.util.AbstractCollection r7 = (java.util.AbstractCollection) r7
            java.lang.Object r11 = r0.A05
            java.util.concurrent.atomic.AtomicInteger r11 = (java.util.concurrent.atomic.AtomicInteger) r11
            java.lang.Object r3 = r0.A06
            java.util.concurrent.CountDownLatch r3 = (java.util.concurrent.CountDownLatch) r3
            X.1L7 r8 = r6.A0A     // Catch:{ all -> 0x1178 }
            java.lang.String r10 = r5.A06     // Catch:{ all -> 0x1178 }
            java.lang.String r0 = X.C41361wE.A07(r8, r10)     // Catch:{ all -> 0x1178 }
            if (r0 != 0) goto L_0x0665
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1178 }
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/null-local-path relative path:"
            X.C17900vP.A0e(r0, r10, r1)     // Catch:{ all -> 0x1178 }
            goto L_0x1174
        L_0x0665:
            java.io.File r2 = X.C108945cZ.A17(r0)     // Catch:{ all -> 0x1178 }
            X.1oW r4 = r6.A08     // Catch:{ all -> 0x1178 }
            boolean r0 = r4.A01()     // Catch:{ all -> 0x1178 }
            if (r0 == 0) goto L_0x1174
            java.lang.Object r0 = r9.get()     // Catch:{ all -> 0x1178 }
            if (r0 == 0) goto L_0x067e
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/another-thread-failed/aborting-restore"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x1178 }
            goto L_0x1174
        L_0x067e:
            java.util.concurrent.atomic.AtomicLong r13 = r6.A0M     // Catch:{ 8gp -> 0x07e4, 8ge | 8gg | 8gi | 8gm | 8gn | 8go -> 0x07da }
            r13.getClass()     // Catch:{ 8gp -> 0x07e4, 8ge | 8gg | 8gi | 8gm | 8gn | 8go -> 0x07da }
            X.AMU r1 = new X.AMU     // Catch:{ 8gp -> 0x07e4, 8ge | 8gg | 8gi | 8gm | 8gn | 8go -> 0x07da }
            r1.<init>(r13)     // Catch:{ 8gp -> 0x07e4, 8ge | 8gg | 8gi | 8gm | 8gn | 8go -> 0x07da }
            X.A7X r0 = r6.A09     // Catch:{ 8gp -> 0x07e4, 8ge | 8gg | 8gi | 8gm | 8gn | 8go -> 0x07da }
            boolean r0 = X.C20127A8m.A07(r1, r4, r0, r5, r2)     // Catch:{ 8gp -> 0x07e4, 8ge | 8gg | 8gi | 8gm | 8gn | 8go -> 0x07da }
            if (r0 == 0) goto L_0x07f5
            X.A55 r0 = r5.A02     // Catch:{ all -> 0x1178 }
            if (r0 == 0) goto L_0x0703
            long r0 = r0.A00     // Catch:{ all -> 0x1178 }
        L_0x0696:
            r13.addAndGet(r0)     // Catch:{ all -> 0x1178 }
            java.util.concurrent.atomic.AtomicLong r12 = r6.A0O     // Catch:{ all -> 0x1178 }
            r12.incrementAndGet()     // Catch:{ all -> 0x1178 }
            X.1NP r11 = r6.A03     // Catch:{ all -> 0x1178 }
            long r0 = r13.get()     // Catch:{ all -> 0x1178 }
            android.content.SharedPreferences$Editor r9 = X.AnonymousClass8BT.A04(r11)     // Catch:{ all -> 0x1178 }
            java.lang.String r7 = "gdrive_already_downloaded_bytes"
            X.C17880vN.A1D(r9, r7, r0)     // Catch:{ all -> 0x1178 }
            long r0 = r12.get()     // Catch:{ all -> 0x1178 }
            android.content.SharedPreferences$Editor r9 = X.AnonymousClass8BT.A04(r11)     // Catch:{ all -> 0x1178 }
            java.lang.String r7 = "pending_media_restore_already_downloaded_file_count"
            X.C17880vN.A1D(r9, r7, r0)     // Catch:{ all -> 0x1178 }
            java.lang.String r1 = ".mcrypt1"
            boolean r0 = r10.endsWith(r1)     // Catch:{ all -> 0x1178 }
            if (r0 == 0) goto L_0x079d
            X.1NT r10 = r6.A04     // Catch:{ all -> 0x1178 }
            boolean r0 = r10.A04()     // Catch:{ all -> 0x1178 }
            if (r0 != 0) goto L_0x06d1
            java.lang.String r0 = "restore>MediaRestoreAction/decrypt-media/failed encryption disabled"
        L_0x06cc:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x1178 }
            goto L_0x0806
        L_0x06d1:
            java.lang.String r7 = r2.getName()     // Catch:{ all -> 0x1178 }
            boolean r0 = r7.endsWith(r1)     // Catch:{ all -> 0x1178 }
            if (r0 != 0) goto L_0x06ec
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1178 }
            java.lang.String r0 = "restore>MediaRestoreAction/decrypt-media/failed no extension "
            r2.append(r0)     // Catch:{ all -> 0x1178 }
            r2.append(r7)     // Catch:{ all -> 0x1178 }
        L_0x06e7:
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x1178 }
            goto L_0x06cc
        L_0x06ec:
            java.lang.String r1 = r5.A01()     // Catch:{ all -> 0x1178 }
            java.lang.String r0 = X.C41361wE.A07(r8, r1)     // Catch:{ all -> 0x1178 }
            if (r0 != 0) goto L_0x0706
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1178 }
            java.lang.String r0 = "restore>MediaRestoreAction/decrypt-media/failed to get path for "
            r2.append(r0)     // Catch:{ all -> 0x1178 }
            r2.append(r1)     // Catch:{ all -> 0x1178 }
            goto L_0x06e7
        L_0x0703:
            long r0 = r5.A00     // Catch:{ all -> 0x1178 }
            goto L_0x0696
        L_0x0706:
            java.io.File r9 = X.C108945cZ.A17(r0)     // Catch:{ all -> 0x1178 }
            java.io.File r5 = r9.getParentFile()     // Catch:{ all -> 0x1178 }
            if (r5 == 0) goto L_0x071c
            boolean r0 = r5.exists()     // Catch:{ all -> 0x1178 }
            if (r0 != 0) goto L_0x0725
            boolean r0 = r5.mkdirs()     // Catch:{ all -> 0x1178 }
            if (r0 != 0) goto L_0x0725
        L_0x071c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1178 }
            java.lang.String r0 = "restore>MediaRestoreAction/decrypt-media/failed to create parent "
            X.C17900vP.A0Z(r5, r0, r1)     // Catch:{ all -> 0x1178 }
        L_0x0725:
            int r0 = r7.length()     // Catch:{ all -> 0x1178 }
            int r0 = r0 + -8
            java.lang.String r0 = X.AnonymousClass8BS.A0o(r7, r0)     // Catch:{ all -> 0x1178 }
            byte[] r5 = X.AnonymousClass1EG.A0J(r0)     // Catch:{ all -> 0x1178 }
            java.lang.String r7 = "encb/EncBackupManager/decrypt media failed"
            X.1NO r0 = r10.A02     // Catch:{ all -> 0x1178 }
            byte[] r1 = r0.A03()     // Catch:{ all -> 0x1178 }
            r12 = 0
            if (r1 == 0) goto L_0x0806
            r0 = 48
            byte[] r11 = X.C20058A5h.A00(r1, r5, r0)     // Catch:{ all -> 0x1178 }
            r1 = 32
            byte[] r8 = new byte[r1]     // Catch:{ all -> 0x1178 }
            java.lang.System.arraycopy(r11, r12, r8, r12, r1)     // Catch:{ all -> 0x1178 }
            r0 = 16
            byte[] r5 = new byte[r0]     // Catch:{ all -> 0x1178 }
            java.lang.System.arraycopy(r11, r1, r5, r12, r0)     // Catch:{ all -> 0x1178 }
            javax.crypto.Cipher r1 = X.AnonymousClass8BR.A18()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798 }
            javax.crypto.spec.SecretKeySpec r0 = X.AnonymousClass8BS.A0v(r8)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798 }
            X.AnonymousClass8BW.A1O(r0, r1, r5)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798 }
            java.io.FileInputStream r0 = X.C108945cZ.A18(r2)     // Catch:{ IOException -> 0x0793, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798 }
            javax.crypto.CipherInputStream r5 = new javax.crypto.CipherInputStream     // Catch:{ IOException -> 0x0793, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798 }
            r5.<init>(r0, r1)     // Catch:{ IOException -> 0x0793, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798 }
            X.1NM r0 = r10.A04     // Catch:{ all -> 0x0789 }
            X.17z r1 = r0.A00()     // Catch:{ all -> 0x0789 }
            X.2QW r0 = new X.2QW     // Catch:{ all -> 0x0789 }
            r0.<init>(r1, r9)     // Catch:{ all -> 0x0789 }
            X.C64062u9.A00(r5, r0)     // Catch:{ all -> 0x077f }
            r0.close()     // Catch:{ all -> 0x0789 }
            r5.close()     // Catch:{ IOException -> 0x0793, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798 }
            r2.delete()     // Catch:{ all -> 0x1178 }
            r2 = r9
            goto L_0x079d
        L_0x077f:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0784 }
            goto L_0x0788
        L_0x0784:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0789 }
        L_0x0788:
            throw r1     // Catch:{ all -> 0x0789 }
        L_0x0789:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x078e }
            goto L_0x0792
        L_0x078e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0793, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798 }
        L_0x0792:
            throw r1     // Catch:{ IOException -> 0x0793, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798 }
        L_0x0793:
            r0 = move-exception
            com.whatsapp.util.Log.w(r7, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0798 }
            goto L_0x0806
        L_0x0798:
            r0 = move-exception
            com.whatsapp.util.Log.w(r7, r0)     // Catch:{ all -> 0x1178 }
            goto L_0x0806
        L_0x079d:
            java.util.concurrent.atomic.AtomicInteger r7 = r6.A0K     // Catch:{ all -> 0x1178 }
            int r0 = r7.getAndDecrement()     // Catch:{ all -> 0x1178 }
            if (r0 <= 0) goto L_0x07c8
            X.1ST r0 = r6.A0B     // Catch:{ RuntimeException -> 0x07bf }
            java.util.List r0 = r0.A0F(r2)     // Catch:{ RuntimeException -> 0x07bf }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ RuntimeException -> 0x07bf }
        L_0x07af:
            boolean r0 = r5.hasNext()     // Catch:{ RuntimeException -> 0x07bf }
            if (r0 == 0) goto L_0x07c8
            X.206 r1 = X.C17880vN.A0Y(r5)     // Catch:{ RuntimeException -> 0x07bf }
            X.1Vr r0 = r6.A0G     // Catch:{ RuntimeException -> 0x07bf }
            r0.A01(r1)     // Catch:{ RuntimeException -> 0x07bf }
            goto L_0x07af
        L_0x07bf:
            r1 = move-exception
            r7.incrementAndGet()     // Catch:{ all -> 0x1178 }
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/thumbnail regeneration failed."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x1178 }
        L_0x07c8:
            X.17r r0 = r6.A01     // Catch:{ IOException -> 0x0806 }
            boolean r0 = r0.A0n(r2)     // Catch:{ IOException -> 0x0806 }
            if (r0 == 0) goto L_0x0806
            android.content.Context r1 = r6.A00     // Catch:{ all -> 0x1178 }
            android.net.Uri r0 = android.net.Uri.fromFile(r2)     // Catch:{ all -> 0x1178 }
            X.C26511Sk.A0O(r1, r0)     // Catch:{ all -> 0x1178 }
            goto L_0x0806
        L_0x07da:
            r1 = move-exception
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x1178 }
            r9.set(r1)     // Catch:{ all -> 0x1178 }
            goto L_0x07f5
        L_0x07e4:
            r2 = move-exception
            int r1 = r11.incrementAndGet()     // Catch:{ all -> 0x1178 }
            r0 = 20
            if (r1 <= r0) goto L_0x0800
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/missing file"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x1178 }
            r9.set(r2)     // Catch:{ all -> 0x1178 }
        L_0x07f5:
            r7.add(r5)     // Catch:{ all -> 0x1178 }
            java.util.concurrent.atomic.AtomicLong r2 = r6.A0L     // Catch:{ all -> 0x1178 }
            long r0 = r5.A00     // Catch:{ all -> 0x1178 }
            r2.addAndGet(r0)     // Catch:{ all -> 0x1178 }
            goto L_0x0806
        L_0x0800:
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/missing file (non-critical)"
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x1178 }
            goto L_0x07f5
        L_0x0806:
            r3.countDown()
            boolean r0 = r4.A01()
            if (r0 == 0) goto L_0x0043
            java.util.concurrent.atomic.AtomicLong r5 = r6.A0N
            long r3 = r5.get()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0043
            X.8yN r1 = r6.A07
            java.util.concurrent.atomic.AtomicLong r0 = r6.A0M
            long r3 = r0.get()
            long r6 = r5.get()
            r5 = 4
            X.35L r2 = new X.35L
            r2.<init>(r3, r5, r6)
            r1.notifyAllObservers(r2)
            return
        L_0x0831:
            java.lang.Object r8 = r0.A01
            java.util.concurrent.atomic.AtomicReference r8 = (java.util.concurrent.atomic.AtomicReference) r8
            java.lang.Object r2 = r0.A02
            X.9nU r2 = (X.C191969nU) r2
            java.lang.Object r13 = r0.A03
            java.lang.Object r12 = r0.A04
            X.A2r r12 = (X.C20002A2r) r12
            java.lang.Object r5 = r0.A05
            java.util.concurrent.atomic.AtomicBoolean r5 = (java.util.concurrent.atomic.AtomicBoolean) r5
            java.lang.Object r6 = r0.A06
            java.util.concurrent.CountDownLatch r6 = (java.util.concurrent.CountDownLatch) r6
            java.lang.String r9 = "gdrive/encrypted-re-upload/backup-file"
            java.lang.String r14 = "gdrive/encrypted-re-upload/backup-file failed on "
            r4 = 0
            X.C18070vi.A0d(r8, r4)
            r3 = 1
            r0 = 4
            X.C18070vi.A0g(r5, r0, r6)
            java.lang.Object r0 = r8.get()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            if (r0 != 0) goto L_0x1194
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            java.io.File r0 = r12.A01()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            r10 = 0
            r1[r4] = r0     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            java.lang.String r0 = r12.A05     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            r1[r3] = r0     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            r0 = 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            java.lang.String r0 = "gdrive/encrypted-re-upload//upload filePath:%s, fileUploadPath:%s"
            X.C108955ca.A1W(r0, r7, r1)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            X.1oW r11 = r2.A07     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            boolean r0 = r11.A01()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            if (r0 == 0) goto L_0x08c0
            X.8gQ r7 = new X.8gQ     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            r7.<init>(r13, r2, r12, r3)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            java.lang.String r0 = "gdrive/encrypted-re-upload//upload "
            r1.append(r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            java.lang.String r0 = "<file>"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            java.lang.Object r7 = X.A84.A00(r7, r11, r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            X.A2d r7 = (X.C19990A2d) r7     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            boolean r0 = r11.A01()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            if (r0 == 0) goto L_0x08c0
            if (r7 == 0) goto L_0x08c0
            java.lang.String r0 = "gdrive/encrypted-re-upload/upload/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            java.util.Map r1 = r2.A0K     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            java.lang.String r0 = r7.A01()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            X.C18070vi.A0X(r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            r1.put(r0, r7)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            java.util.concurrent.atomic.AtomicLong r2 = r2.A0R     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            X.A55 r0 = r7.A02     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            if (r0 == 0) goto L_0x08bc
            long r0 = r0.A00     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
        L_0x08b8:
            r2.addAndGet(r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            goto L_0x08bf
        L_0x08bc:
            long r0 = r7.A00     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x118d, FileNotFoundException -> 0x117d }
            goto L_0x08b8
        L_0x08bf:
            r10 = 1
        L_0x08c0:
            r5.compareAndSet(r3, r10)
            r6.countDown()
            if (r10 != 0) goto L_0x0043
            goto L_0x119a
        L_0x08ca:
            java.lang.Object r6 = r0.A01
            X.3M2 r6 = (X.AnonymousClass3M2) r6
            java.lang.Object r5 = r0.A02
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r4 = r0.A03
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.lang.Object r3 = r0.A04
            X.206 r3 = (X.AnonymousClass206) r3
            java.lang.Object r2 = r0.A05
            X.2SA r2 = (X.AnonymousClass2SA) r2
            java.lang.Object r1 = r0.A06
            X.36w r1 = (X.C693536w) r1
            android.graphics.BitmapFactory$Options r0 = X.C32021gV.A0E
            r6.CMa(r4, r5, r3)
            r2.A02(r1)
            return
        L_0x08eb:
            java.lang.Object r1 = r0.A06
            X.7Gg r1 = (X.C144167Gg) r1
            java.lang.Object r6 = r0.A02
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.lang.Object r5 = r0.A05
            java.security.PublicKey r5 = (java.security.PublicKey) r5
            java.lang.Object r4 = r0.A04
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r2 = r0.A01
            X.89m r2 = (X.C1606789m) r2
            java.lang.Object r3 = r0.A03
            X.705 r3 = (X.AnonymousClass705) r3
            r1.CBW(r2, r3, r4, r5, r6)
            return
        L_0x0907:
            java.lang.Object r1 = r0.A01
            X.7Gh r1 = (X.C144177Gh) r1
            java.lang.Object r6 = r0.A02
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.lang.Object r5 = r0.A03
            java.security.PublicKey r5 = (java.security.PublicKey) r5
            java.lang.Object r4 = r0.A04
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r2 = r0.A05
            X.89m r2 = (X.C1606789m) r2
            java.lang.Object r3 = r0.A06
            X.705 r3 = (X.AnonymousClass705) r3
            r1.CBW(r2, r3, r4, r5, r6)
            return
        L_0x0923:
            java.lang.Object r1 = r0.A06
            X.7Gd r1 = (X.C144137Gd) r1
            java.lang.Object r6 = r0.A02
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.lang.Object r5 = r0.A05
            java.security.PublicKey r5 = (java.security.PublicKey) r5
            java.lang.Object r4 = r0.A04
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r2 = r0.A01
            X.89m r2 = (X.C1606789m) r2
            java.lang.Object r3 = r0.A03
            X.705 r3 = (X.AnonymousClass705) r3
            r1.CBW(r2, r3, r4, r5, r6)
            return
        L_0x093f:
            java.lang.Object r5 = r0.A01
            X.4aY r5 = (X.AnonymousClass4aY) r5
            java.lang.Object r8 = r0.A02
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            java.lang.Object r11 = r0.A03
            com.whatsapp.KeyboardPopupLayout r11 = (com.whatsapp.KeyboardPopupLayout) r11
            java.lang.Object r10 = r0.A04
            android.widget.ListView r10 = (android.widget.ListView) r10
            java.lang.Object r9 = r0.A05
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            java.lang.Object r6 = r0.A06
            android.view.View r6 = (android.view.View) r6
            X.3VQ r1 = r5.A2b
            r0 = 0
            r1.A0b(r0)
            android.view.View r7 = r5.A0Q
            r2 = 0
            com.whatsapp.conversation.ConversationListView r0 = r5.A2B
            if (r0 == 0) goto L_0x0968
            boolean r2 = r0.A0D(r2)
        L_0x0968:
            r0 = 0
            r11.setClipChildren(r0)
            if (r8 == 0) goto L_0x09a1
            int r12 = r10.getTranscriptMode()
            int r4 = r8.getHeight()
            float r1 = (float) r4
            r0 = 0
            android.view.animation.TranslateAnimation r3 = new android.view.animation.TranslateAnimation
            r3.<init>(r0, r0, r0, r1)
            r0 = 250(0xfa, double:1.235E-321)
            r3.setDuration(r0)
            r7.startAnimation(r3)
            if (r2 == 0) goto L_0x098e
            r2 = 2
            r10.setTranscriptMode(r2)
            r10.startAnimation(r3)
        L_0x098e:
            X.3OT r2 = new X.3OT
            r2.<init>(r9, r4)
            r2.setDuration(r0)
            r9.startAnimation(r2)
            X.3by r7 = new X.3by
            r7.<init>(r8, r9, r10, r11, r12)
            r2.setAnimationListener(r7)
        L_0x09a1:
            r0 = 1
            int r0 = r5.A2H(r0)
            r5.A2g(r0)
            r0 = 8
            r6.setVisibility(r0)
            r5.A2e()
            return
        L_0x09b2:
            java.lang.Object r13 = r0.A03
            X.3rW r13 = (X.AnonymousClass3rW) r13
            X.1E7 r15 = r13.A0H
            X.1bI r10 = r13.A0J
            android.widget.TextView r14 = r13.A09
            X.C17960vV.A07(r10)
            X.1xh r9 = r13.A0D
            com.whatsapp.TextEmojiLabel r7 = r13.A0C
            android.view.View r12 = r13.A02
            java.lang.Object r1 = r0.A02
            X.1xn r1 = (X.C42201xn) r1
            java.lang.String r6 = r1.A01(r15)
            android.util.Pair r1 = r13.A0K()
            java.lang.Object r5 = r1.second
            java.lang.String r5 = (java.lang.String) r5
            boolean r3 = r13.A0F()
            r1 = 800(0x320, double:3.953E-321)
            r8 = 0
            if (r3 == 0) goto L_0x0ae9
            if (r14 == 0) goto L_0x0ae9
            android.text.TextPaint r4 = r14.getPaint()
            java.lang.String r3 = "•"
            float r3 = r4.measureText(r3)
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r11 = (int) r3
            int r3 = r14.getPaddingLeft()
            int r11 = r11 + r3
            int r3 = r14.getPaddingRight()
            int r11 = r11 + r3
            if (r9 != 0) goto L_0x0ad9
            r4 = 0
        L_0x09fd:
            java.lang.Object r3 = r0.A01
            X.0ve r3 = (X.C18030ve) r3
            int r14 = X.C196929vs.A00(r3)
            double r3 = (double) r4
            double r3 = java.lang.Math.ceil(r3)
            int r9 = (int) r3
            X.01E r4 = r13.A0U
            android.content.res.Resources r3 = X.C108955ca.A0D(r4)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r14)
            int r3 = r3.getIntrinsicWidth()
            int r9 = r9 + r3
            android.content.res.Resources r4 = X.C108955ca.A0D(r4)
            r3 = 2131169136(0x7f070f70, float:1.7952594E38)
            int r3 = r4.getDimensionPixelSize(r3)
            int r9 = r9 + r3
            int r9 = r9 + r11
            float r4 = (float) r9
            float r8 = r8 + r4
            if (r6 == 0) goto L_0x0ad6
            android.text.TextPaint r3 = r7.getPaint()
            float r11 = r3.measureText(r5)
            if (r12 != 0) goto L_0x0ad0
            r3 = 0
        L_0x0a36:
            float r3 = (float) r3
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x0ad6
            android.text.TextPaint r3 = r7.getPaint()
            float r3 = r3.measureText(r6)
            float r11 = r11 - r3
            float r8 = r8 + r11
        L_0x0a45:
            java.lang.Object r3 = r0.A06
            X.0vb r3 = (X.C18000vb) r3
            boolean r3 = X.AnonymousClass3MY.A1b(r3)
            if (r3 == 0) goto L_0x0a50
            float r4 = -r8
        L_0x0a50:
            r12 = 0
            r13 = 0
            android.view.animation.TranslateAnimation r11 = new android.view.animation.TranslateAnimation
            r16 = r12
            r18 = r12
            r19 = r13
            r14 = r12
            r15 = r4
            r17 = r13
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r11.setDuration(r1)
            X.5qy r3 = new X.5qy
            r3.<init>(r10, r0, r12)
            r11.setAnimationListener(r3)
            android.view.ViewGroup$LayoutParams r3 = r10.A03()
            r3.width = r9
            r10.A06(r3)
            android.view.View r3 = r10.A02()
            r3.startAnimation(r11)
        L_0x0a7c:
            r10 = 0
        L_0x0a7d:
            java.lang.Object r4 = r0.A06
            X.0vb r4 = (X.C18000vb) r4
            boolean r3 = X.AnonymousClass3MY.A1b(r4)
            float r15 = (float) r9
            if (r3 == 0) goto L_0x0a89
            float r15 = -r8
        L_0x0a89:
            r12 = 0
            r13 = 0
            android.view.animation.TranslateAnimation r11 = new android.view.animation.TranslateAnimation
            r16 = r12
            r18 = r12
            r19 = r13
            r14 = r12
            r17 = r13
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r3 = 1
            r11.setFillAfter(r3)
            if (r10 == 0) goto L_0x0aa1
            r1 = 4000(0xfa0, double:1.9763E-320)
        L_0x0aa1:
            r11.setDuration(r1)
            X.8d8 r1 = new X.8d8
            r1.<init>(r7, r0, r6, r3)
            r11.setAnimationListener(r1)
            boolean r0 = X.AnonymousClass3MW.A1Z(r4)
            if (r0 == 0) goto L_0x0ab5
            r7.setText(r6)
        L_0x0ab5:
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            android.text.TextPaint r0 = r7.getPaint()
            float r0 = r0.measureText(r5)
            double r0 = (double) r0
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            r3.width = r0
            r7.setLayoutParams(r3)
            r7.startAnimation(r11)
            return
        L_0x0ad0:
            int r3 = r12.getWidth()
            goto L_0x0a36
        L_0x0ad6:
            r6 = r5
            goto L_0x0a45
        L_0x0ad9:
            com.whatsapp.TextEmojiLabel r3 = r9.A01
            android.text.TextPaint r4 = r3.getPaint()
            java.lang.String r3 = r15.A0L()
            float r4 = r4.measureText(r3)
            goto L_0x09fd
        L_0x0ae9:
            if (r6 != 0) goto L_0x0aee
            r6 = r5
        L_0x0aec:
            r9 = 0
            goto L_0x0a7c
        L_0x0aee:
            android.text.TextPaint r3 = r7.getPaint()
            float r8 = r3.measureText(r5)
            android.text.TextPaint r3 = r7.getPaint()
            float r3 = r3.measureText(r6)
            float r8 = r8 - r3
            java.lang.Object r9 = r0.A01
            X.0vd r9 = (X.C18020vd) r9
            r4 = 6172(0x181c, float:8.649E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r3, r9, r4)
            if (r3 == 0) goto L_0x0aec
            java.lang.Object r4 = r0.A04
            X.11P r4 = (X.AnonymousClass11P) r4
            X.01E r3 = r13.A0U
            java.lang.String r3 = X.AnonymousClass72Y.A01(r3, r4, r15)
            if (r3 == 0) goto L_0x0aec
            r6 = r5
            r9 = 0
            r10 = 1
            goto L_0x0a7d
        L_0x0b1e:
            java.lang.Object r1 = r0.A06
            r24 = r1
            r1 = r24
            X.1TH r1 = (X.AnonymousClass1TH) r1
            r24 = r1
        L_0x0b28:
            X.2n6 r1 = r24.A02()
            if (r1 == 0) goto L_0x0b55
            java.lang.Object r2 = r0.A04
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            boolean r2 = r2.get()
            if (r2 != 0) goto L_0x0b55
            java.lang.Object r2 = r0.A03
            X.11E r2 = (X.AnonymousClass11E) r2
            boolean r2 = r2.A09()
            if (r2 != 0) goto L_0x0b67
            java.lang.Object r4 = r0.A01
            X.0vd r4 = (X.C18020vd) r4
            r3 = 4879(0x130f, float:6.837E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r4, r3)
            if (r2 == 0) goto L_0x0b67
            java.lang.String r1 = "HistorySyncWorkProcessor/run no network access"
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x0b55:
            java.lang.Object r1 = r0.A02
            X.6bb r1 = (X.C125736bb) r1
            java.lang.Object r0 = r0.A04
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            boolean r3 = r0.get()
            com.whatsapp.companiondevice.sync.HistorySyncWorker r2 = r1.A00
            monitor-enter(r2)
            r0 = 1
            goto L_0x0f7c
        L_0x0b67:
            java.lang.Object r2 = r0.A05
            X.1TO r2 = (X.AnonymousClass1TO) r2
            X.1RK r9 = r2.A0O
            com.whatsapp.jid.DeviceJid r3 = r1.A0D
            r69 = r3
            int r4 = r69.getDevice()
            X.4Zh r11 = r9.A05(r4)
            r25 = 0
            if (r11 != 0) goto L_0x0b96
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "history-sync-send-methods/sendMsgHistoryChunk no device info for device id "
            X.C17900vP.A0k(r2, r3, r4)
        L_0x0b86:
            long r3 = r1.A06
            r2 = 1
            X.C17960vV.A00()
            r1 = r24
            X.1Oq r1 = r1.A02
            X.1au r6 = r1.A06()
            goto L_0x0eb4
        L_0x0b96:
            com.whatsapp.jid.DeviceJid r3 = r11.A08
            boolean r5 = X.C62832s4.A00(r3)
            long r3 = r1.A05
            r38 = 0
            int r6 = (r3 > r38 ? 1 : (r3 == r38 ? 0 : -1))
            if (r6 < 0) goto L_0x0cdc
            java.lang.String r6 = r1.A0E
            r22 = r6
            X.1Ry r8 = r2.A0R
            X.231 r7 = r8.A02(r3)
            X.23J r7 = (X.AnonymousClass23J) r7
            if (r7 == 0) goto L_0x0b86
            com.whatsapp.jid.DeviceJid r3 = r7.A00
            X.C17960vV.A07(r3)
            int r3 = r3.getDevice()
            X.4Zh r6 = r9.A05(r3)
            int r4 = r7.A03
            int r3 = r7.A00
            int r14 = X.AnonymousClass1TO.A00(r6, r2, r4, r3, r5)
            X.122 r13 = r2.A0E
            if (r5 == 0) goto L_0x0bdb
            long r9 = r7.A08
            long r3 = r7.A06
            r15 = r9
            r17 = r3
            android.database.Cursor r17 = r13.A0H(r14, r15, r17)
        L_0x0bd6:
            if (r17 == 0) goto L_0x0b86
            if (r6 != 0) goto L_0x0bf7
            goto L_0x0beb
        L_0x0bdb:
            long r11 = r7.A08
            long r9 = r7.A06
            long r3 = r7.A0I
            r15 = r11
            r17 = r9
            r19 = r3
            android.database.Cursor r17 = r13.A0I(r14, r15, r17, r19)
            goto L_0x0bd6
        L_0x0beb:
            java.lang.String r2 = "history-sync-send-methods/resendMsgHistoryChunk device no longer exists in db"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x0f95 }
            long r2 = r7.A0x     // Catch:{ all -> 0x0f95 }
            r8.A05(r2)     // Catch:{ all -> 0x0f95 }
            goto L_0x0cd7
        L_0x0bf7:
            X.9te r18 = X.AnonymousClass1TO.A02(r6, r2)     // Catch:{ all -> 0x0f95 }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0f95 }
            X.1T7 r3 = r2.A0W     // Catch:{ all -> 0x0f95 }
            r16 = r3
            r19 = r4
            r20 = r38
            java.util.LinkedHashMap r8 = r16.A03(r17, r18, r19, r20)     // Catch:{ all -> 0x0f95 }
            int r10 = r17.getCount()     // Catch:{ all -> 0x0f95 }
            X.8cQ r3 = X.C166148cQ.DEFAULT_INSTANCE     // Catch:{ all -> 0x0f95 }
            X.Bmt r5 = r3.A0N()     // Catch:{ all -> 0x0f95 }
            X.8X2 r5 = (X.AnonymousClass8X2) r5     // Catch:{ all -> 0x0f95 }
            int r3 = r7.A03     // Catch:{ all -> 0x0f95 }
            X.9KV r3 = X.AnonymousClass1TO.A03(r3)     // Catch:{ all -> 0x0f95 }
            r5.A0K(r3)     // Catch:{ all -> 0x0f95 }
            int r3 = r7.A00     // Catch:{ all -> 0x0f95 }
            r5.A0G(r3)     // Catch:{ all -> 0x0f95 }
            int r3 = r7.A01     // Catch:{ all -> 0x0f95 }
            r5.A0H(r3)     // Catch:{ all -> 0x0f95 }
            boolean r3 = r4.isEmpty()     // Catch:{ all -> 0x0f95 }
            if (r3 != 0) goto L_0x0c33
            r5.A0L(r4)     // Catch:{ all -> 0x0f95 }
        L_0x0c33:
            java.util.Iterator r13 = X.AnonymousClass000.A15(r8)     // Catch:{ all -> 0x0f95 }
        L_0x0c37:
            boolean r3 = r13.hasNext()     // Catch:{ all -> 0x0f95 }
            if (r3 == 0) goto L_0x0c74
            java.util.Map$Entry r4 = X.AnonymousClass000.A16(r13)     // Catch:{ all -> 0x0f95 }
            java.lang.Object r3 = r4.getKey()     // Catch:{ all -> 0x0f95 }
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3     // Catch:{ all -> 0x0f95 }
            boolean r3 = X.C22971Dz.A0V(r3)     // Catch:{ all -> 0x0f95 }
            if (r3 != 0) goto L_0x0c37
            java.lang.Object r12 = r4.getValue()     // Catch:{ all -> 0x0f95 }
            X.2Ay r12 = (X.C45662Ay) r12     // Catch:{ all -> 0x0f95 }
            java.lang.Object r11 = r4.getKey()     // Catch:{ all -> 0x0f95 }
            X.1BI r11 = (X.AnonymousClass1BI) r11     // Catch:{ all -> 0x0f95 }
            long r8 = r7.A08     // Catch:{ all -> 0x0f95 }
            long r3 = r7.A09     // Catch:{ all -> 0x0f95 }
            r26 = r11
            r27 = r2
            r28 = r12
            r29 = r8
            r31 = r3
            X.AnonymousClass1TO.A06(r26, r27, r28, r29, r31)     // Catch:{ all -> 0x0f95 }
            X.Bm6 r3 = r12.A0C()     // Catch:{ all -> 0x0f95 }
            X.8cf r3 = (X.C166298cf) r3     // Catch:{ all -> 0x0f95 }
            r5.A0J(r3)     // Catch:{ all -> 0x0f95 }
            goto L_0x0c37
        L_0x0c74:
            java.lang.String r4 = r7.A0J     // Catch:{ all -> 0x0f95 }
            if (r4 == 0) goto L_0x0c86
            java.lang.String r3 = r7.A0I     // Catch:{ all -> 0x0f95 }
            if (r3 == 0) goto L_0x0c86
            X.2SB r8 = new X.2SB     // Catch:{ all -> 0x0f95 }
            r8.<init>()     // Catch:{ all -> 0x0f95 }
            r8.A01 = r4     // Catch:{ all -> 0x0f95 }
            r8.A00 = r3     // Catch:{ all -> 0x0f95 }
            goto L_0x0c87
        L_0x0c86:
            r8 = 0
        L_0x0c87:
            com.whatsapp.jid.DeviceJid r3 = r7.A00     // Catch:{ Exception -> 0x0cd1 }
            r20 = r3
            X.C17960vV.A07(r20)     // Catch:{ Exception -> 0x0cd1 }
            int r3 = r7.A00     // Catch:{ Exception -> 0x0cd1 }
            r19 = r3
            int r3 = r7.A03     // Catch:{ Exception -> 0x0cd1 }
            r18 = r3
            int r9 = r7.A01     // Catch:{ Exception -> 0x0cd1 }
            int r3 = r7.A02     // Catch:{ Exception -> 0x0cd1 }
            int r37 = r3 + 1
            long r15 = r7.A08     // Catch:{ Exception -> 0x0cd1 }
            long r13 = r7.A06     // Catch:{ Exception -> 0x0cd1 }
            long r11 = r7.A09     // Catch:{ Exception -> 0x0cd1 }
            X.205 r3 = r7.A0v     // Catch:{ Exception -> 0x0cd1 }
            java.lang.String r7 = r3.A01     // Catch:{ Exception -> 0x0cd1 }
            long r3 = (long) r10     // Catch:{ Exception -> 0x0cd1 }
            java.lang.String r6 = r6.A02     // Catch:{ Exception -> 0x0cd1 }
            r50 = -1
            r52 = 0
            r31 = r7
            r32 = r22
            r33 = r6
            r34 = r19
            r35 = r18
            r36 = r9
            r40 = r15
            r42 = r13
            r44 = r11
            r46 = r3
            r48 = r38
            r26 = r8
            r27 = r20
            r28 = r2
            r29 = r5
            r30 = r25
            X.AnonymousClass1TO.A01(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42, r44, r46, r48, r50, r52)     // Catch:{ Exception -> 0x0cd1 }
            goto L_0x0cd7
        L_0x0cd1:
            r3 = move-exception
            java.lang.String r2 = "history-sync-send-methods/resend-msg-history-chunk failed"
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ all -> 0x0f95 }
        L_0x0cd7:
            r17.close()
            goto L_0x0b86
        L_0x0cdc:
            int r4 = r1.A01
            r3 = 3
            r7 = 0
            boolean r51 = X.AnonymousClass000.A1T(r4, r3)
            int r6 = r1.A00
            r3 = r51 ^ 1
            int r23 = r6 + r3
            long r9 = r1.A04
            r56 = r9
            java.util.Map r16 = java.util.Collections.emptyMap()
            java.util.ArrayList r17 = X.AnonymousClass000.A13()
            long r3 = r1.A09     // Catch:{ Exception -> 0x0eac }
            r21 = r3
            int r3 = (r3 > r38 ? 1 : (r3 == r38 ? 0 : -1))
            if (r3 <= 0) goto L_0x0d06
            long r3 = r1.A07     // Catch:{ Exception -> 0x0eac }
            int r8 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r8 < 0) goto L_0x0d06
            r5 = 0
            goto L_0x0d76
        L_0x0d06:
            int r3 = r1.A02     // Catch:{ Exception -> 0x0eac }
            int r27 = X.AnonymousClass1TO.A00(r11, r2, r3, r6, r5)     // Catch:{ Exception -> 0x0eac }
            if (r5 == 0) goto L_0x0d1d
            X.122 r6 = r2.A0E     // Catch:{ OutOfMemoryError -> 0x0e94 }
            long r4 = r1.A0A     // Catch:{ OutOfMemoryError -> 0x0e94 }
            r26 = r6
            r28 = r4
            r30 = r9
            android.database.Cursor r6 = r26.A0H(r27, r28, r30)     // Catch:{ OutOfMemoryError -> 0x0e94 }
            goto L_0x0d31
        L_0x0d1d:
            X.122 r6 = r2.A0E     // Catch:{ OutOfMemoryError -> 0x0e94 }
            long r4 = r1.A0A     // Catch:{ OutOfMemoryError -> 0x0e94 }
            X.11P r8 = r2.A09     // Catch:{ OutOfMemoryError -> 0x0e94 }
            long r32 = X.AnonymousClass11P.A01(r8)     // Catch:{ OutOfMemoryError -> 0x0e94 }
            r26 = r6
            r28 = r4
            r30 = r9
            android.database.Cursor r6 = r26.A0I(r27, r28, r30, r32)     // Catch:{ OutOfMemoryError -> 0x0e94 }
        L_0x0d31:
            if (r6 == 0) goto L_0x0b86
            X.9te r36 = X.AnonymousClass1TO.A02(r11, r2)     // Catch:{ all -> 0x0e8a }
            X.1T7 r4 = r2.A0W     // Catch:{ all -> 0x0e8a }
            r34 = r4
            r35 = r6
            r37 = r17
            java.util.LinkedHashMap r16 = r34.A03(r35, r36, r37, r38)     // Catch:{ all -> 0x0e8a }
            int r5 = r6.getCount()     // Catch:{ all -> 0x0e8a }
            boolean r4 = r6.moveToLast()     // Catch:{ all -> 0x0e8a }
            if (r4 == 0) goto L_0x0d73
            java.lang.String r4 = "_id"
            long r9 = X.C17890vO.A06(r6, r4)     // Catch:{ all -> 0x0e8a }
            java.lang.String r4 = "message_type"
            int r8 = r6.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0e8a }
        L_0x0d59:
            boolean r4 = r6.isNull(r8)     // Catch:{ all -> 0x0e8a }
            if (r4 != 0) goto L_0x0d6d
            int r12 = r6.getInt(r8)     // Catch:{ all -> 0x0e8a }
            r4 = 7
            if (r12 == r4) goto L_0x0d6d
            java.lang.String r4 = "timestamp"
            long r38 = X.C17890vO.A06(r6, r4)     // Catch:{ all -> 0x0e8a }
            goto L_0x0d73
        L_0x0d6d:
            boolean r4 = r6.moveToPrevious()     // Catch:{ all -> 0x0e8a }
            if (r4 != 0) goto L_0x0d59
        L_0x0d73:
            r6.close()     // Catch:{ OutOfMemoryError -> 0x0e94 }
        L_0x0d76:
            long r3 = r1.A08     // Catch:{ Exception -> 0x0eac }
            r19 = r3
            long r14 = (long) r5     // Catch:{ Exception -> 0x0eac }
            long r12 = r3 + r14
            if (r5 == 0) goto L_0x0df0
            long r3 = r1.A0A     // Catch:{ Exception -> 0x0eac }
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0df0
            r18 = 0
            X.1NK r5 = r2.A0H     // Catch:{ Exception -> 0x0eac }
            int r5 = r5.A00(r3, r9)     // Catch:{ Exception -> 0x0eac }
            double r3 = (double) r12     // Catch:{ Exception -> 0x0eac }
            long r5 = (long) r5     // Catch:{ Exception -> 0x0eac }
            long r5 = r5 + r12
            double r7 = (double) r5     // Catch:{ Exception -> 0x0eac }
            double r3 = r3 / r7
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 * r5
            int r5 = (int) r3     // Catch:{ Exception -> 0x0eac }
        L_0x0d96:
            X.8cQ r3 = X.C166148cQ.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0eac }
            X.Bmt r6 = r3.A0N()     // Catch:{ Exception -> 0x0eac }
            X.8X2 r6 = (X.AnonymousClass8X2) r6     // Catch:{ Exception -> 0x0eac }
            int r3 = r1.A02     // Catch:{ Exception -> 0x0eac }
            r33 = r3
            X.9KV r3 = X.AnonymousClass1TO.A03(r33)     // Catch:{ Exception -> 0x0eac }
            r6.A0K(r3)     // Catch:{ Exception -> 0x0eac }
            r3 = r23
            r6.A0G(r3)     // Catch:{ Exception -> 0x0eac }
            r6.A0H(r5)     // Catch:{ Exception -> 0x0eac }
            java.util.Iterator r16 = X.AnonymousClass000.A15(r16)     // Catch:{ Exception -> 0x0eac }
        L_0x0db5:
            boolean r3 = r16.hasNext()     // Catch:{ Exception -> 0x0eac }
            if (r3 == 0) goto L_0x0df5
            java.util.Map$Entry r7 = X.AnonymousClass000.A16(r16)     // Catch:{ Exception -> 0x0eac }
            java.lang.Object r3 = r7.getKey()     // Catch:{ Exception -> 0x0eac }
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3     // Catch:{ Exception -> 0x0eac }
            boolean r3 = X.C22971Dz.A0V(r3)     // Catch:{ Exception -> 0x0eac }
            if (r3 != 0) goto L_0x0db5
            java.lang.Object r4 = r7.getValue()     // Catch:{ Exception -> 0x0eac }
            X.2Ay r4 = (X.C45662Ay) r4     // Catch:{ Exception -> 0x0eac }
            java.lang.Object r3 = r7.getKey()     // Catch:{ Exception -> 0x0eac }
            X.1BI r3 = (X.AnonymousClass1BI) r3     // Catch:{ Exception -> 0x0eac }
            long r7 = r1.A0B     // Catch:{ Exception -> 0x0eac }
            r26 = r3
            r27 = r2
            r28 = r4
            r29 = r9
            r31 = r7
            X.AnonymousClass1TO.A06(r26, r27, r28, r29, r31)     // Catch:{ Exception -> 0x0eac }
            X.Bm6 r3 = r4.A0C()     // Catch:{ Exception -> 0x0eac }
            X.8cf r3 = (X.C166298cf) r3     // Catch:{ Exception -> 0x0eac }
            r6.A0J(r3)     // Catch:{ Exception -> 0x0eac }
            goto L_0x0db5
        L_0x0df0:
            r18 = 1
            r5 = 100
            goto L_0x0d96
        L_0x0df5:
            boolean r3 = r17.isEmpty()     // Catch:{ Exception -> 0x0eac }
            if (r3 != 0) goto L_0x0e00
            r3 = r17
            r6.A0L(r3)     // Catch:{ Exception -> 0x0eac }
        L_0x0e00:
            X.2SB r3 = r1.A0C     // Catch:{ Exception -> 0x0eac }
            r27 = r3
            long r3 = r1.A0B     // Catch:{ Exception -> 0x0eac }
            r67 = r3
            java.lang.String r3 = r1.A0E     // Catch:{ Exception -> 0x0eac }
            r8 = r3
            java.lang.String r3 = r11.A02     // Catch:{ Exception -> 0x0eac }
            r52 = 0
            r11 = 0
            r45 = r25
            r40 = r27
            r41 = r69
            r42 = r2
            r43 = r6
            r44 = r25
            r46 = r8
            r47 = r3
            r48 = r23
            r49 = r33
            r50 = r5
            r54 = r9
            r58 = r67
            r60 = r14
            r62 = r38
            r64 = r19
            r66 = r11
            long r16 = X.AnonymousClass1TO.A01(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r54, r56, r58, r60, r62, r64, r66)     // Catch:{ Exception -> 0x0eac }
            if (r18 != 0) goto L_0x0e3b
            if (r51 != 0) goto L_0x0e3b
            goto L_0x0e3e
        L_0x0e3b:
            r4 = r25
            goto L_0x0e6b
        L_0x0e3e:
            long r14 = r1.A06     // Catch:{ Exception -> 0x0eac }
            long r6 = r1.A0A     // Catch:{ Exception -> 0x0eac }
            long r2 = r1.A07     // Catch:{ Exception -> 0x0eac }
            long r2 = r2 + r16
            long r45 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0eac }
            r32 = 1
            r47 = -1
            X.2n6 r4 = new X.2n6     // Catch:{ Exception -> 0x0eac }
            r26 = r4
            r28 = r69
            r29 = r8
            r30 = r33
            r31 = r23
            r33 = r14
            r35 = r9
            r37 = r6
            r39 = r67
            r41 = r12
            r43 = r2
            r49 = r21
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r35, r37, r39, r41, r43, r45, r47, r49)     // Catch:{ Exception -> 0x0eac }
        L_0x0e6b:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0eac }
            java.lang.String r2 = "history-sync-send-methods/send-msg-history-chunk/progress = "
            r3.append(r2)     // Catch:{ Exception -> 0x0eac }
            r3.append(r5)     // Catch:{ Exception -> 0x0eac }
            java.lang.String r2 = ", last id = "
            X.C17900vP.A0m(r2, r3, r9)     // Catch:{ Exception -> 0x0eac }
            if (r4 == 0) goto L_0x0b86
            X.C17960vV.A00()
            r1 = r24
            X.1Oq r1 = r1.A02
            X.1au r6 = r1.A06()
            goto L_0x0ed1
        L_0x0e8a:
            r5 = move-exception
            r6.close()     // Catch:{ all -> 0x0e8f }
            goto L_0x0e93
        L_0x0e8f:
            r4 = move-exception
            X.AnonymousClass0DT.A00(r5, r4)     // Catch:{ OutOfMemoryError -> 0x0e94 }
        L_0x0e93:
            throw r5     // Catch:{ OutOfMemoryError -> 0x0e94 }
        L_0x0e94:
            java.lang.String r4 = "history-sync-send-methods/send-msg-history-chunk failed OOM"
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ Exception -> 0x0eac }
            X.190 r6 = r2.A01     // Catch:{ Exception -> 0x0eac }
            java.lang.String r5 = "historySyncSendMethod/outOfMemory"
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0eac }
            java.lang.String r2 = "type="
            java.lang.String r2 = X.AnonymousClass001.A1I(r2, r4, r3)     // Catch:{ Exception -> 0x0eac }
            r6.A0G(r5, r2, r7)     // Catch:{ Exception -> 0x0eac }
            goto L_0x0b86
        L_0x0eac:
            r3 = move-exception
            java.lang.String r2 = "history-sync-send-methods/send-msg-history-chunk failed"
            com.whatsapp.util.Log.e(r2, r3)
            goto L_0x0b86
        L_0x0eb4:
            r1 = r6
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x0f9f }
            X.1Ev r7 = r1.A02     // Catch:{ all -> 0x0f9f }
            java.lang.String r5 = "DELETE FROM msg_history_sync WHERE _id=?"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x0f9f }
            X.C17890vO.A1J(r2, r3)     // Catch:{ all -> 0x0f9f }
            java.lang.String r1 = "MessageHistorySyncTable.DELETE_SYNC_STATE_BY_ID"
            r7.A0F(r5, r1, r2)     // Catch:{ all -> 0x0f9f }
            r6.close()
            r2 = r24
            r1 = r69
            X.AnonymousClass1TH.A01(r2, r1)
            goto L_0x0b28
        L_0x0ed1:
            r1 = r6
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x0f9f }
            X.1Ev r8 = r1.A02     // Catch:{ all -> 0x0f9f }
            java.lang.String r7 = "UPDATE msg_history_sync SET device_id=?, sync_type=?, last_processed_msg_row_id=?, oldest_msg_row_id=?, sent_msgs_count=?, chunk_order=?, sent_bytes=?, last_chunk_timestamp=?, status=?, peer_msg_row_id=?, oldest_message_to_sync_row_id=?, session_id=?, md_reg_attempt_id=?, size_limit_bytes=?, full_history_on_demand_request_id=? WHERE _id=?"
            r1 = 16
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ all -> 0x0f9f }
            com.whatsapp.jid.DeviceJid r3 = r4.A0D     // Catch:{ all -> 0x0f9f }
            X.C17880vN.A1J(r3, r5, r11)     // Catch:{ all -> 0x0f9f }
            int r1 = r4.A02     // Catch:{ all -> 0x0f9f }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0f9f }
            r1 = 1
            r5[r1] = r2     // Catch:{ all -> 0x0f9f }
            long r1 = r4.A04     // Catch:{ all -> 0x0f9f }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0f9f }
            r1 = 2
            r5[r1] = r2     // Catch:{ all -> 0x0f9f }
            long r1 = r4.A0A     // Catch:{ all -> 0x0f9f }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0f9f }
            r1 = 3
            r5[r1] = r2     // Catch:{ all -> 0x0f9f }
            long r1 = r4.A08     // Catch:{ all -> 0x0f9f }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0f9f }
            r1 = 4
            r5[r1] = r2     // Catch:{ all -> 0x0f9f }
            int r1 = r4.A00     // Catch:{ all -> 0x0f9f }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0f9f }
            r1 = 5
            r5[r1] = r2     // Catch:{ all -> 0x0f9f }
            long r1 = r4.A07     // Catch:{ all -> 0x0f9f }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0f9f }
            r1 = 6
            r5[r1] = r2     // Catch:{ all -> 0x0f9f }
            long r1 = r4.A03     // Catch:{ all -> 0x0f9f }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0f9f }
            r1 = 7
            r5[r1] = r2     // Catch:{ all -> 0x0f9f }
            int r1 = r4.A01     // Catch:{ all -> 0x0f9f }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0f9f }
            r1 = 8
            r5[r1] = r2     // Catch:{ all -> 0x0f9f }
            long r1 = r4.A05     // Catch:{ all -> 0x0f9f }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0f9f }
            r1 = 9
            r5[r1] = r2     // Catch:{ all -> 0x0f9f }
            long r1 = r4.A0B     // Catch:{ all -> 0x0f9f }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0f9f }
            r1 = 10
            r5[r1] = r2     // Catch:{ all -> 0x0f9f }
            X.2SB r9 = r4.A0C     // Catch:{ all -> 0x0f9f }
            r2 = 0
            if (r9 == 0) goto L_0x0f47
            java.lang.String r1 = r9.A01     // Catch:{ all -> 0x0f9f }
            r25 = r1
        L_0x0f47:
            r1 = 11
            r5[r1] = r25     // Catch:{ all -> 0x0f9f }
            if (r9 == 0) goto L_0x0f4f
            java.lang.String r2 = r9.A00     // Catch:{ all -> 0x0f9f }
        L_0x0f4f:
            r1 = 12
            r5[r1] = r2     // Catch:{ all -> 0x0f9f }
            long r1 = r4.A09     // Catch:{ all -> 0x0f9f }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0f9f }
            r1 = 13
            r5[r1] = r2     // Catch:{ all -> 0x0f9f }
            java.lang.String r2 = r4.A0E     // Catch:{ all -> 0x0f9f }
            r1 = 14
            r5[r1] = r2     // Catch:{ all -> 0x0f9f }
            long r1 = r4.A06     // Catch:{ all -> 0x0f9f }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0f9f }
            r1 = 15
            r5[r1] = r2     // Catch:{ all -> 0x0f9f }
            java.lang.String r1 = "MessageHistorySyncTable.UPDATE_SYNC_STATE"
            r8.A0F(r7, r1, r5)     // Catch:{ all -> 0x0f9f }
            r6.close()
            r1 = r24
            X.AnonymousClass1TH.A01(r1, r3)
            goto L_0x0b28
        L_0x0f7c:
            r2.A03 = r0     // Catch:{ all -> 0x0f92 }
            monitor-exit(r2)     // Catch:{ all -> 0x0f92 }
            X.5qs r1 = r2.A04
            if (r3 == 0) goto L_0x0f8c
            X.8Ji r0 = new X.8Ji
            r0.<init>()
        L_0x0f88:
            r1.A03(r0)
            return
        L_0x0f8c:
            X.8Jk r0 = new X.8Jk
            r0.<init>()
            goto L_0x0f88
        L_0x0f92:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0f92 }
            throw r1
        L_0x0f95:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0f9a }
            throw r1
        L_0x0f9a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0f9f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0fa1 }
        L_0x0fa1:
            r1 = move-exception
            X.CDX.A00(r6, r0)
            throw r1
        L_0x0fa6:
            java.lang.Object r11 = r0.A01
            X.9i2 r11 = (X.C188819i2) r11
            java.lang.Object r1 = r0.A02
            X.0yx r1 = (X.C19760yx) r1
            java.lang.Object r8 = r0.A03
            java.util.concurrent.atomic.AtomicReference r8 = (java.util.concurrent.atomic.AtomicReference) r8
            java.lang.Object r2 = r0.A04
            java.util.concurrent.CountDownLatch r2 = (java.util.concurrent.CountDownLatch) r2
            java.lang.Object r9 = r0.A05
            X.B73 r9 = (X.B73) r9
            java.lang.Object r6 = r0.A06
            java.util.concurrent.atomic.AtomicBoolean r6 = (java.util.concurrent.atomic.AtomicBoolean) r6
            java.lang.Object r7 = r1.A00
            X.A2d r7 = (X.C19990A2d) r7
            java.lang.Object r10 = r1.A01
            java.io.File r10 = (java.io.File) r10
            java.lang.Object r0 = r8.get()     // Catch:{ 8gm -> 0x1043 }
            if (r0 == 0) goto L_0x0fd5
            java.lang.String r0 = "restore>RestoreAction/restore-backups-dir/another-thread-failed/abort"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 8gm -> 0x1043 }
        L_0x0fd1:
            r2.countDown()     // Catch:{ 8gm -> 0x1043 }
            goto L_0x0ff6
        L_0x0fd5:
            X.A55 r0 = r7.A02     // Catch:{ 8gm -> 0x1043 }
            if (r0 == 0) goto L_0x0ff3
            java.lang.String r5 = r0.A03     // Catch:{ 8gm -> 0x1043 }
        L_0x0fdb:
            X.1L7 r4 = r11.A09     // Catch:{ 8gm -> 0x1043 }
            X.1NW r3 = r11.A01     // Catch:{ 8gm -> 0x1043 }
            long r0 = r10.length()     // Catch:{ 8gm -> 0x1043 }
            java.lang.String r0 = X.C41361wE.A05(r3, r4, r10, r0)     // Catch:{ 8gm -> 0x1043 }
            boolean r0 = r5.equals(r0)     // Catch:{ 8gm -> 0x1043 }
            if (r0 == 0) goto L_0x0ff7
            java.lang.String r0 = "restore>RestoreAction/restore-backups-dir/skipping/already-downloaded"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 8gm -> 0x1043 }
            goto L_0x0fd1
        L_0x0ff3:
            java.lang.String r5 = r7.A03     // Catch:{ 8gm -> 0x1043 }
            goto L_0x0fdb
        L_0x0ff6:
            return
        L_0x0ff7:
            X.1oW r5 = r11.A07
            X.A7X r1 = r11.A08
            java.util.concurrent.atomic.AtomicLong r4 = r11.A0M
            java.util.concurrent.atomic.AtomicLong r3 = r11.A0L
            java.lang.Object r0 = r8.get()     // Catch:{ all -> 0x103e }
            if (r0 == 0) goto L_0x100b
            java.lang.String r0 = "restore>RestoreAction/restore-backups-dir/another-thread-failed/abort"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x103e }
            goto L_0x103a
        L_0x100b:
            boolean r0 = X.C20127A8m.A07(r9, r5, r1, r7, r10)     // Catch:{ 8gp -> 0x102a, 9LZ -> 0x1020 }
            if (r0 == 0) goto L_0x1030
            long r0 = r7.A00     // Catch:{ all -> 0x103e }
            r9.Bqp(r0)     // Catch:{ all -> 0x103e }
            r4.addAndGet(r0)     // Catch:{ all -> 0x103e }
            r10.getAbsolutePath()     // Catch:{ all -> 0x103e }
            r10.length()     // Catch:{ all -> 0x103e }
            goto L_0x103a
        L_0x1020:
            r1 = move-exception
            java.lang.String r0 = "restore>RestoreAction/restore-file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x103e }
            r8.set(r1)     // Catch:{ all -> 0x103e }
            goto L_0x1030
        L_0x102a:
            r1 = move-exception
            java.lang.String r0 = "restore>RestoreAction/restore-backups-dir/file-not-found"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x103e }
        L_0x1030:
            long r0 = r7.A00     // Catch:{ all -> 0x103e }
            r3.addAndGet(r0)     // Catch:{ all -> 0x103e }
            r1 = 1
            r0 = 0
            r6.compareAndSet(r1, r0)     // Catch:{ all -> 0x103e }
        L_0x103a:
            r2.countDown()
            return
        L_0x103e:
            r1 = move-exception
            r2.countDown()
            throw r1
        L_0x1043:
            r0 = move-exception
            r8.set(r0)
            r2.countDown()
            return
        L_0x104b:
            java.lang.Object r1 = r0.A06
            X.7Ge r1 = (X.C144147Ge) r1
            java.lang.Object r6 = r0.A02
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.lang.Object r5 = r0.A05
            java.security.PublicKey r5 = (java.security.PublicKey) r5
            java.lang.Object r4 = r0.A04
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r2 = r0.A01
            X.89m r2 = (X.C1606789m) r2
            java.lang.Object r3 = r0.A03
            X.705 r3 = (X.AnonymousClass705) r3
            r1.CBW(r2, r3, r4, r5, r6)
            return
        L_0x1067:
            java.lang.Object r4 = r0.A01
            X.1iW r4 = (X.C33251iW) r4
            java.lang.Object r10 = r0.A02
            android.net.Uri r10 = (android.net.Uri) r10
            java.lang.Object r9 = r0.A03
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r13 = r0.A04
            X.206 r13 = (X.AnonymousClass206) r13
            java.lang.Object r2 = r0.A06
            X.AEv r2 = (X.C20287AEv) r2
            java.lang.Object r7 = r0.A05
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            r3 = 0
            X.1Sl r1 = r4.A18     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            r0 = 100
            android.graphics.Bitmap r8 = r1.A0h(r10, r0, r0)     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            java.io.ByteArrayOutputStream r5 = X.C108945cZ.A15()     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x10e3 }
            r0 = 80
            r8.compress(r1, r0, r5)     // Catch:{ all -> 0x10e3 }
            byte[] r6 = r5.toByteArray()     // Catch:{ all -> 0x10e3 }
            r5.close()     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            r8.recycle()     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            java.util.ArrayList r5 = X.AnonymousClass000.A14(r9)     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            java.util.Iterator r1 = r9.iterator()     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
        L_0x10a5:
            boolean r0 = r1.hasNext()     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            if (r0 == 0) goto L_0x10d7
            X.1BI r12 = X.C17880vN.A0Q(r1)     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            X.2rc r11 = new X.2rc     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            r11.<init>()     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            X.1Sb r9 = r4.A0j     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            r14 = 0
            r19 = 23
            r16 = r14
            r17 = r14
            r18 = r14
            r21 = r3
            r22 = r3
            r23 = r3
            r15 = r14
            r20 = r3
            X.21V r0 = r9.A03(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            X.22Q r0 = (X.AnonymousClass22Q) r0     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            r2.A00(r0)     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            r0.A01 = r7     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            r5.add(r0)     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            goto L_0x10a5
        L_0x10d7:
            X.1KB r2 = r4.A03     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            r1 = 1
            X.AkM r0 = new X.AkM     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            r0.<init>(r4, r5, r6, r1)     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            r2.A0J(r0)     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
            return
        L_0x10e3:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x10e8 }
            goto L_0x10ec
        L_0x10e8:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
        L_0x10ec:
            throw r1     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x10ed }
        L_0x10ed:
            r2 = move-exception
            X.1KB r1 = r4.A03
            r0 = 2131888004(0x7f120784, float:1.9410631E38)
            r1.A06(r0, r3)
            java.lang.String r0 = "UserActions/userActionSendProductMessages/product thumbnail load failed"
            com.whatsapp.util.Log.e(r0, r2)
            return
        L_0x10fc:
            java.lang.Object r1 = r0.A05
            X.A2t r1 = (X.A2t) r1
            boolean r1 = r1.A0J
            if (r1 == 0) goto L_0x112c
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r2 >= r1) goto L_0x112c
            X.5oM r4 = new X.5oM
            r4.<init>()
            java.lang.Object r1 = r0.A04
            X.3Kb r1 = (X.C71973Kb) r1
            X.AHx r1 = (X.C20367AHx) r1
            java.util.concurrent.Executor r3 = r1.A02
            r2 = 26
            X.Akc r1 = new X.Akc
            r1.<init>((X.C113975oM) r4, (X.C21472Akd) r0, (int) r2)
            r3.execute(r1)
            r2 = 27
            X.Akc r1 = new X.Akc
            r1.<init>((X.C113975oM) r4, (X.C21472Akd) r0, (int) r2)
            r4.BBG(r1, r3)
            return
        L_0x112c:
            java.lang.Object r1 = r0.A03
            X.DMs r1 = (X.DMs) r1
            r0 = 0
            r1.A05(r0)
            return
        L_0x1135:
            X.1KB r6 = r5.A01
            X.00H r1 = r5.A0A
            X.1jG r18 = X.AnonymousClass8BR.A0a(r1)
            r25 = 1
            X.8zU r13 = new X.8zU
            r15 = r14
            r24 = r7
            r22 = r10
            r23 = r0
            r20 = r2
            r21 = r5
            r19 = r3
            r17 = r4
            r16 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r31 = 0
            r30 = 204(0xcc, float:2.86E-43)
            r27 = r13
            r29 = r8
            r26.A0I(r27, r28, r29, r30, r31)
            return
        L_0x1161:
            r6.setVisibility(r3)
            return
        L_0x1165:
            return
        L_0x1166:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x1168 }
        L_0x1168:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x116d }
            throw r0     // Catch:{ all -> 0x116d }
        L_0x116d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x116f }
        L_0x116f:
            r1 = move-exception
            X.CDX.A00(r2, r0)
            throw r1
        L_0x1174:
            r3.countDown()
            return
        L_0x1178:
            r1 = move-exception
            r3.countDown()
            throw r1
        L_0x117d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x11a4 }
            java.lang.String r0 = "gdrive/encrypted-re-upload/backup-file/file-not-found "
            r1.append(r0)     // Catch:{ all -> 0x11a4 }
            java.lang.String r0 = "<file>"
            X.C108985cd.A1M(r0, r1, r2)     // Catch:{ all -> 0x11a4 }
            goto L_0x1194
        L_0x118d:
            r0 = move-exception
            com.whatsapp.util.Log.e(r9, r0)     // Catch:{ all -> 0x11a4 }
            r8.set(r0)     // Catch:{ all -> 0x11a4 }
        L_0x1194:
            r5.compareAndSet(r3, r4)
            r6.countDown()
        L_0x119a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r14)
            java.lang.String r0 = "<file>"
            X.C17890vO.A1A(r1, r0)
            return
        L_0x11a4:
            r2 = move-exception
            r5.compareAndSet(r3, r4)
            r6.countDown()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r14)
            java.lang.String r0 = "<file>"
            X.C17890vO.A1A(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21472Akd.run():void");
    }

    public C21472Akd(C1606789m r2, AnonymousClass705 r3, C144137Gd r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A00 = 12;
        C18070vi.A0d(x509Certificate, 2);
        C72473Md.A1J(r2, r3);
        this.A06 = r4;
        this.A02 = x509Certificate;
        this.A05 = publicKey;
        this.A04 = num;
        this.A01 = r2;
        this.A03 = r3;
    }

    public C21472Akd(Context context, B4L b4l, C20001A2q a2q, A2t a2t, C71973Kb r6) {
        this.A00 = 0;
        this.A03 = new Object();
        this.A01 = context;
        this.A05 = a2t;
        this.A06 = a2q;
        this.A02 = b4l;
        this.A04 = r6;
    }

    public C21472Akd(C125736bb r2, AnonymousClass11E r3, AnonymousClass1TH r4, C18030ve r5, AnonymousClass1TO r6) {
        this.A00 = 7;
        C18070vi.A0s(r5, r6, r4, r3);
        this.A01 = r5;
        this.A05 = r6;
        this.A06 = r4;
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = new AtomicBoolean();
    }

    public C21472Akd(C1606789m r2, AnonymousClass705 r3, C144167Gg r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A00 = 16;
        C18070vi.A0d(x509Certificate, 2);
        C72473Md.A1J(r2, r3);
        this.A06 = r4;
        this.A02 = x509Certificate;
        this.A05 = publicKey;
        this.A04 = num;
        this.A01 = r2;
        this.A03 = r3;
    }

    public C21472Akd(C144147Ge r2, C1606789m r3, AnonymousClass705 r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A00 = 2;
        C18070vi.A0d(x509Certificate, 2);
        C72473Md.A1J(r3, r4);
        this.A06 = r2;
        this.A02 = x509Certificate;
        this.A05 = publicKey;
        this.A04 = num;
        this.A01 = r3;
        this.A03 = r4;
    }

    public C21472Akd(Uri uri, C33251iW r3, C20287AEv aEv, UserJid userJid, AnonymousClass206 r6, List list) {
        this.A00 = 1;
        this.A01 = r3;
        this.A02 = uri;
        this.A03 = list;
        this.A04 = r6;
        this.A06 = aEv;
        this.A05 = userJid;
    }
}
