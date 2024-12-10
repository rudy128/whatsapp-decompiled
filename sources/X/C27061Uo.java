package X;

import android.content.Intent;
import com.whatsapp.base.WaFragment;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1Uo  reason: invalid class name and case insensitive filesystem */
public abstract class C27061Uo {
    public final C19880zA A00;
    public final C218617r A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass1UD A04;
    public final C24791Lr A05;
    public final C18030ve A06;
    public final C27021Uk A07;
    public final AnonymousClass1DC A08;
    public final AnonymousClass11C A09;
    public final C18000vb A0A;
    public final AnonymousClass10I A0B;

    public void A04(Intent intent, AnonymousClass1FU r8, int i) {
        A05(intent, r8, r8, (AnonymousClass1E7) null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r3 == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.content.Intent r14, X.AnonymousClass1FU r15, X.AnonymousClass1FT r16, X.AnonymousClass1E7 r17, int r18) {
        /*
            r13 = this;
            r4 = r15
            r9 = r17
            if (r14 == 0) goto L_0x0032
            android.net.Uri r3 = r14.getData()
            java.lang.String r0 = "webImageSource"
            java.lang.String r10 = r14.getStringExtra(r0)
            if (r3 != 0) goto L_0x0034
        L_0x0012:
            java.io.File r0 = r13.A02(r9)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0026
            java.io.File r0 = r13.A02(r9)
            android.net.Uri r3 = android.net.Uri.fromFile(r0)
            if (r3 != 0) goto L_0x0034
        L_0x0026:
            java.lang.String r0 = "profileinfo/cropphoto/no-data"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131889970(0x7f120f32, float:1.9414619E38)
            r15.BhQ(r0)
            return
        L_0x0032:
            r10 = 0
            goto L_0x0012
        L_0x0034:
            X.11C r7 = r13.A09
            X.0vb r8 = r13.A0A
            X.1Lr r6 = r13.A05
            boolean r0 = r13 instanceof X.C27071Up
            if (r0 == 0) goto L_0x0051
            r12 = 0
        L_0x003f:
            X.2Pn r2 = new X.2Pn
            r5 = r16
            r11 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.10I r1 = r13.A0B
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.CGM(r2, r0)
            return
        L_0x0051:
            r12 = 2
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27061Uo.A05(android.content.Intent, X.1FU, X.1FT, X.1E7, int):void");
    }

    public void A06(Intent intent, WaFragment waFragment, int i) {
        WaFragment waFragment2 = waFragment;
        if (waFragment.A1n() != null) {
            A05(intent, (AnonymousClass1FU) waFragment.A1D(), waFragment2, (AnonymousClass1E7) null, i);
        }
    }

    public void A07(AnonymousClass01E r11, AnonymousClass1E7 r12, int i) {
        A08(r11, r12, (Integer) null, i, 1, -1, true, false, false);
    }

    public static void A00(C27061Uo r3, String str) {
        C218617r r32 = r3.A01;
        r32.A0a("tmpi");
        if (!C218617r.A02(r32.A0G(), "tmpi").delete()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/failed-delete-file");
            sb.append(C218617r.A02(r32.A0G(), "tmpi").getAbsolutePath());
            Log.w(sb.toString());
        }
    }

    public File A02(AnonymousClass1E7 r5) {
        String rawString;
        C218617r r2;
        StringBuilder sb;
        if (r5 instanceof AnonymousClass25I) {
            r2 = this.A01;
            sb = new StringBuilder();
            sb.append("tmpi");
            rawString = ((AnonymousClass25I) r5).A00;
        } else {
            if (r5 != null) {
                AnonymousClass1BI r1 = r5.A0J;
                if (C29681ch.A00(r1)) {
                    C17960vV.A07(r1);
                    rawString = r1.getRawString();
                    r2 = this.A01;
                    sb = new StringBuilder();
                    sb.append("tmpi");
                }
            }
            return C218617r.A02(this.A01.A0G(), "tmpi");
        }
        sb.append(rawString);
        return C218617r.A02(r2.A0G(), sb.toString());
    }

    public void A03(Intent intent, AnonymousClass1FU r4) {
        int intExtra = intent.getIntExtra("error_message_id", -1);
        if (intExtra > 0) {
            this.A02.A0E(r4, intExtra);
        }
    }

    public void A09(AnonymousClass1E7 r4, int i) {
        if (this instanceof C27071Up) {
            C27071Up r2 = (C27071Up) this;
            if (r4 != null && r2.A03.A0O(r4.A0J) && i == 2) {
                C19880zA r1 = r2.A00;
                if (r1.A07()) {
                    ((AnonymousClass00H) r1.A03()).get();
                    throw new NullPointerException("isProfileLockedAndMvEditEnabled");
                }
            }
        }
    }

    public void A0A(String str) {
        if (C18020vd.A05(C18040vf.A02, this.A06, 10394)) {
            this.A0B.CGF(new AnonymousClass7RS(2, str, this));
        } else {
            A00(this, str);
        }
    }

    public C27061Uo(C19880zA r1, C218617r r2, AnonymousClass1KB r3, AnonymousClass11S r4, AnonymousClass1UD r5, C24791Lr r6, AnonymousClass11C r7, C18000vb r8, C18030ve r9, C27021Uk r10, AnonymousClass1DC r11, AnonymousClass10I r12) {
        this.A06 = r9;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A0B = r12;
        this.A01 = r2;
        this.A00 = r1;
        this.A0A = r8;
        this.A08 = r11;
        this.A09 = r7;
        this.A07 = r10;
        this.A05 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0340, code lost:
        if (r0 == null) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0342, code lost:
        r4 = new android.os.Bundle();
        r4.putString("group_jid", r0.getRawString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0350, code lost:
        r5 = new android.os.Bundle();
        r5.putInt("title_resource", r6);
        r5.putParcelableArrayList("choosable_intents", new java.util.ArrayList(r3));
        r5.putInt("request_code", r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x036c, code lost:
        if (r28 == null) goto L_0x0378;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x036e, code lost:
        r5.putInt("subtitle_resource", r28.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0378, code lost:
        if (r4 == null) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x037a, code lost:
        r5.putBundle("logging_extras", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x037f, code lost:
        r0 = new com.whatsapp.IntentChooserBottomSheetDialogFragment();
        r0.A1R(r5);
        X.C20098A7b.A01(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x038a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x038b, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x038d, code lost:
        if (r5 == 0) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0390, code lost:
        if (r5 == 2) goto L_0x039f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0392, code lost:
        r0.A00.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x039e, code lost:
        throw new java.lang.NullPointerException("getCoverPhotoStringId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x039f, code lost:
        r6 = 2131899265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03a4, code lost:
        r6 = 2131899332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03a9, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x03ac, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03af, code lost:
        r7 = androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r1.A0L == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03b7, code lost:
        if (X.C18020vd.A05(r9, r10, 9156) != false) goto L_0x03c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03b9, code lost:
        r9 = "com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03bb, code lost:
        r8 = new android.content.Intent();
        r8.setClassName(r4.getPackageName(), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03c9, code lost:
        r9 = "com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoActivity";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03cc, code lost:
        r5 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03cf, code lost:
        r5.setClassName(r7, "com.whatsapp.profile.ResetGroupPhoto");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03d6, code lost:
        if ((r0 instanceof X.C27071Up) == false) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03d8, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03d9, code lost:
        r5 = new android.content.Intent();
        r5.setClassName(r4.getPackageName(), "com.whatsapp.profile.ResetPhoto");
        r5.putExtra("photo_type", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03ee, code lost:
        r8 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03f0, code lost:
        r4 = (X.C48292Lx) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03f5, code lost:
        if (r4.A01 != false) goto L_0x0405;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03f7, code lost:
        r2 = r4.A00.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03fd, code lost:
        if (r2 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0403, code lost:
        if (r2.exists() == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0405, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r27 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if ((r0 instanceof X.C27071Up) == false) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r2 = ((X.C27071Up) r0).A03.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r2 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        r4 = r2.exists();
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (r4 != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        r4 = r26;
        r6 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (r32 == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        if (r2 == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        A09(r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r15 == false) goto L_0x03d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        r5 = new android.content.Intent();
        r7 = r4.getPackageName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        if (r14 == false) goto L_0x03cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        r5.setClassName(r7, "com.whatsapp.profile.ResetGroupPhoto");
        r5.putExtra("PROMPT_RES_ID_KEY", 2131895118);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        r7 = r4.getResources();
        X.C18070vi.A0d(r7, 0);
        r3.add(new X.C89464cV(r5, java.lang.Integer.valueOf(r7.getColor(2131101222)), (java.lang.Integer) null, 2131895135, 2131231847, 2131432582, 2, true));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        r7 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        if (r0.A08.BcY() == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        r9 = X.C64062u9.A02(r4, A02(r1));
        r8 = new android.content.Intent();
        r8.setClassName(r4.getPackageName(), "com.whatsapp.profile.CapturePhoto");
        r8.putExtra("target_file_uri", r9);
        r8 = r8.putExtra("should_return_photo_source", r7);
        X.C18070vi.A0d(r8, 0);
        r9 = r4.getResources();
        r2 = X.AnonymousClass1YL.A00(r4, 2130970828, 2131102239);
        X.C18070vi.A0d(r9, 0);
        r3.add(new X.C89464cV(r8, java.lang.Integer.valueOf(r9.getColor(r2)), (java.lang.Integer) null, 2131887939, 2131232194, 0, 1, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fa, code lost:
        r2 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fc, code lost:
        if (r15 == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fe, code lost:
        r2 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0100, code lost:
        r7 = X.AnonymousClass1LU.A0E(r4, r2).putExtra("should_return_photo_source", r7);
        r12 = r0 instanceof X.C27071Up;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010f, code lost:
        if (r12 == false) goto L_0x03cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0111, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0112, code lost:
        r8 = r7.putExtra("photo_type", r5).putExtra("photo_update_surface_type", r6);
        X.C18070vi.A0d(r8, 0);
        r10 = r4.getResources();
        r7 = X.AnonymousClass1YL.A00(r4, 2130970828, 2131102239);
        X.C18070vi.A0d(r10, 0);
        r3.add(new X.C89464cV(r8, java.lang.Integer.valueOf(r10.getColor(r7)), (java.lang.Integer) null, 2131890624, 2131232193, 0, 1, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0157, code lost:
        if ((r0 instanceof X.C48292Lx) != false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0159, code lost:
        if (r15 != false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0161, code lost:
        if (r0.A03.A0N() != false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0163, code lost:
        A09(r1, r6);
        r10 = r0.A06;
        r9 = X.C18040vf.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0170, code lost:
        if (X.C18020vd.A05(r9, r10, 1396) == false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0178, code lost:
        if (X.C18020vd.A05(r9, r10, 9156) == false) goto L_0x03b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0180, code lost:
        if (r0.A07.A01() == false) goto L_0x03c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0182, code lost:
        r8 = new android.content.Intent();
        r8.setClassName(r4.getPackageName(), "com.whatsapp.profile.coinflip.nux.CoinFlipNUXBottomSheetLauncher");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0190, code lost:
        r21 = 2131232292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x019b, code lost:
        if (X.C18020vd.A05(X.C18040vf.A01, r10, 9398) == false) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x019d, code lost:
        r21 = 2131231709;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01a0, code lost:
        r10 = r4.getResources();
        r7 = X.AnonymousClass1YL.A00(r4, 2130970828, 2131102239);
        X.C18070vi.A0d(r10, 0);
        r18 = java.lang.Integer.valueOf(r10.getColor(r7));
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01c3, code lost:
        if (r0.A07.A01() == false) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c5, code lost:
        r7 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01c7, code lost:
        r3.add(new X.C89464cV(r8, r18, java.lang.Integer.valueOf(r7), 2131886831, r21, 0, 1, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01d7, code lost:
        if (r34 != false) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01d9, code lost:
        if (r15 == false) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01db, code lost:
        r8 = android.net.Uri.fromFile(r0.A05.A02(r1));
        r9 = new android.content.Intent();
        r9.setClassName(r4, "com.whatsapp.group.GroupProfileEmojiEditor");
        r9.putExtra("emojiEditorImageResult", r8);
        r9.putExtra("emojiEditorProfileTarget", r30);
        r8 = r0.A06;
        X.C18070vi.A0d(r8, 0);
        r21 = 2131232118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0209, code lost:
        if (X.C25291Nq.A04(r8, 10925) == false) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x020b, code lost:
        r21 = 2131232331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x020e, code lost:
        r10 = r4.getResources();
        r7 = X.AnonymousClass1YL.A00(r4, 2130970828, 2131102239);
        X.C18070vi.A0d(r10, 0);
        r3.add(new X.C89464cV(r9, java.lang.Integer.valueOf(r10.getColor(r7)), (java.lang.Integer) null, 2131891127, r21, 0, 1, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0238, code lost:
        if (r34 != false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x023a, code lost:
        if (r15 == false) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x023c, code lost:
        if (r27 == null) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x023e, code lost:
        r7 = r1.A0K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0242, code lost:
        r9 = android.net.Uri.fromFile(A02(r1));
        r8 = new android.content.Intent();
        r8.setClassName(r4.getPackageName(), "com.whatsapp.profile.WebImagePicker");
        r8.putExtra("output", r9);
        r8.putExtra("query", r7);
        r9 = r4.getResources();
        r2 = X.AnonymousClass1YL.A00(r4, 2130970828, 2131102239);
        X.C18070vi.A0d(r9, 0);
        r3.add(new X.C89464cV(r8, java.lang.Integer.valueOf(r9.getColor(r2)), (java.lang.Integer) null, 2131895530, 2131232271, 0, 1, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x028d, code lost:
        A09(r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0291, code lost:
        if (r6 == 2) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0293, code lost:
        if (r31 != 0) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0295, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0296, code lost:
        if (r5 == 0) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0298, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0299, code lost:
        if (r15 != false) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x029b, code lost:
        if (r2 == false) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02a9, code lost:
        if (X.C18020vd.A05(X.C18040vf.A01, r0.A04.A00, 12466) == false) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02ab, code lost:
        r8 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02ac, code lost:
        if (r15 == false) goto L_0x02af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02ae, code lost:
        r8 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02af, code lost:
        r9 = android.net.Uri.fromFile(r0.A05.A02(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02b9, code lost:
        if (r27 == null) goto L_0x03ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02bb, code lost:
        r10 = r1.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02bd, code lost:
        X.C18070vi.A0d(r9, 1);
        r6 = new android.content.Intent();
        r6.setClassName(r4.getPackageName(), "com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetLauncher");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02ce, code lost:
        if (r10 == null) goto L_0x03a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02d0, code lost:
        r7 = r10.getRawString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02d4, code lost:
        r6.putExtra("chat_jid", r7);
        r6.putExtra("output_uri", r9);
        r6.putExtra("entry_point", r8);
        r7 = r4.getResources();
        r2 = X.AnonymousClass1YL.A00(r4, 2130970828, 2131102239);
        X.C18070vi.A0d(r7, 0);
        r3.add(new X.C89464cV(r6, java.lang.Integer.valueOf(r7.getColor(r2)), (java.lang.Integer) null, 2131898952, 2131233141, 0, 1, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0310, code lost:
        com.whatsapp.util.Log.i("profile/photo/updater/run chooser");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0315, code lost:
        if (r15 == false) goto L_0x038d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0317, code lost:
        r6 = 2131891126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x031a, code lost:
        if (r14 == false) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x031c, code lost:
        r6 = 2131888559;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x031f, code lost:
        r2 = r4.A03.A00.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0325, code lost:
        if (r12 == false) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0327, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0336, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, ((X.C27071Up) r0).A07.A02, 10532) == false) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0338, code lost:
        if (r27 == null) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x033a, code lost:
        r0 = r1.A06(com.whatsapp.jid.GroupJid.class);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.AnonymousClass01E r26, X.AnonymousClass1E7 r27, java.lang.Integer r28, int r29, int r30, int r31, boolean r32, boolean r33, boolean r34) {
        /*
            r25 = this;
            r1 = r27
            if (r27 == 0) goto L_0x0412
            X.1BI r0 = r1.A0J
        L_0x0006:
            boolean r2 = X.C29681ch.A00(r0)
            r0 = r25
            if (r2 == 0) goto L_0x040b
            java.io.File r2 = r0.A02(r1)
            r2.delete()
        L_0x0015:
            r2 = 4
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            if (r27 == 0) goto L_0x0408
            boolean r2 = r1.A0F()
            if (r2 == 0) goto L_0x0408
            r15 = 1
            X.2d6 r2 = r1.A0L
            r14 = 1
            if (r2 != 0) goto L_0x002c
        L_0x0029:
            r14 = 0
            if (r27 == 0) goto L_0x0042
        L_0x002c:
            boolean r2 = r0 instanceof X.C27071Up
            if (r2 == 0) goto L_0x03f0
            r2 = r0
            X.1Up r2 = (X.C27071Up) r2
            X.1Lr r2 = r2.A03
            java.io.File r2 = r2.A01(r1)
            if (r2 == 0) goto L_0x0042
            boolean r4 = r2.exists()
            r2 = 1
            if (r4 != 0) goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            r4 = r26
            r6 = r31
            if (r32 == 0) goto L_0x0096
            if (r2 == 0) goto L_0x0096
            r0.A09(r1, r6)
            if (r15 == 0) goto L_0x03d4
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r7 = r4.getPackageName()
            java.lang.String r2 = "com.whatsapp.profile.ResetGroupPhoto"
            if (r14 == 0) goto L_0x03cf
            r5.setClassName(r7, r2)
            java.lang.String r7 = "PROMPT_RES_ID_KEY"
            r2 = 2131895118(0x7f12234e, float:1.942506E38)
            r5.putExtra(r7, r2)
        L_0x0068:
            r21 = 2131231847(0x7f080467, float:1.8079787E38)
            r20 = 2131895135(0x7f12235f, float:1.9425094E38)
            r8 = 0
            r19 = 0
            r22 = 2131432582(0x7f0b1486, float:1.8486926E38)
            android.content.res.Resources r7 = r4.getResources()
            r2 = 2131101222(0x7f060626, float:1.7814848E38)
            X.C18070vi.A0d(r7, r8)
            int r2 = r7.getColor(r2)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r2)
            r24 = 1
            r23 = 2
            X.4cV r2 = new X.4cV
            r16 = r2
            r17 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r3.add(r2)
        L_0x0096:
            X.1DC r2 = r0.A08
            boolean r2 = r2.BcY()
            r7 = r33
            if (r2 == 0) goto L_0x00fa
            java.io.File r2 = r0.A02(r1)
            android.net.Uri r9 = X.C64062u9.A02(r4, r2)
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r5 = r4.getPackageName()
            java.lang.String r2 = "com.whatsapp.profile.CapturePhoto"
            r8.setClassName(r5, r2)
            java.lang.String r2 = "target_file_uri"
            r8.putExtra(r2, r9)
            java.lang.String r2 = "should_return_photo_source"
            android.content.Intent r8 = r8.putExtra(r2, r7)
            r20 = 2131887939(0x7f120743, float:1.94105E38)
            r21 = 2131232194(0x7f0805c2, float:1.808049E38)
            r5 = 0
            X.C18070vi.A0d(r8, r5)
            r19 = 0
            android.content.res.Resources r9 = r4.getResources()
            r10 = 2130970828(0x7f0408cc, float:1.7550377E38)
            r2 = 2131102239(0x7f060a1f, float:1.781691E38)
            int r2 = X.AnonymousClass1YL.A00(r4, r10, r2)
            X.C18070vi.A0d(r9, r5)
            int r2 = r9.getColor(r2)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r2)
            r23 = 1
            X.4cV r2 = new X.4cV
            r24 = r5
            r22 = r5
            r16 = r2
            r17 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r3.add(r2)
        L_0x00fa:
            r2 = 9
            if (r15 == 0) goto L_0x0100
            r2 = 8
        L_0x0100:
            android.content.Intent r5 = X.AnonymousClass1LU.A0E(r4, r2)
            java.lang.String r2 = "should_return_photo_source"
            android.content.Intent r7 = r5.putExtra(r2, r7)
            java.lang.String r2 = "photo_type"
            boolean r12 = r0 instanceof X.C27071Up
            if (r12 == 0) goto L_0x03cc
            r5 = 0
        L_0x0112:
            android.content.Intent r7 = r7.putExtra(r2, r5)
            java.lang.String r2 = "photo_update_surface_type"
            android.content.Intent r8 = r7.putExtra(r2, r6)
            r20 = 2131890624(0x7f1211c0, float:1.9415945E38)
            r21 = 2131232193(0x7f0805c1, float:1.8080488E38)
            r2 = 0
            X.C18070vi.A0d(r8, r2)
            r19 = 0
            android.content.res.Resources r10 = r4.getResources()
            r9 = 2130970828(0x7f0408cc, float:1.7550377E38)
            r7 = 2131102239(0x7f060a1f, float:1.781691E38)
            int r7 = X.AnonymousClass1YL.A00(r4, r9, r7)
            X.C18070vi.A0d(r10, r2)
            int r7 = r10.getColor(r7)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r7)
            r13 = 1
            r11 = 0
            X.4cV r7 = new X.4cV
            r24 = r2
            r22 = r2
            r23 = r13
            r16 = r7
            r17 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r3.add(r7)
            boolean r7 = r0 instanceof X.C48292Lx
            if (r7 != 0) goto L_0x01d7
            if (r15 != 0) goto L_0x01d7
            X.11S r7 = r0.A03
            boolean r7 = r7.A0N()
            if (r7 != 0) goto L_0x01d7
            r0.A09(r1, r6)
            X.0ve r10 = r0.A06
            r7 = 1396(0x574, float:1.956E-42)
            X.0vf r9 = X.C18040vf.A02
            boolean r7 = X.C18020vd.A05(r9, r10, r7)
            if (r7 == 0) goto L_0x01d7
            r8 = 9156(0x23c4, float:1.283E-41)
            boolean r7 = X.C18020vd.A05(r9, r10, r8)
            if (r7 == 0) goto L_0x03b3
            X.1Uk r7 = r0.A07
            boolean r7 = r7.A01()
            if (r7 == 0) goto L_0x03c9
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r9 = r4.getPackageName()
            java.lang.String r7 = "com.whatsapp.profile.coinflip.nux.CoinFlipNUXBottomSheetLauncher"
            r8.setClassName(r9, r7)
        L_0x0190:
            X.0vf r9 = X.C18040vf.A01
            r7 = 9398(0x24b6, float:1.317E-41)
            boolean r7 = X.C18020vd.A05(r9, r10, r7)
            r21 = 2131232292(0x7f080624, float:1.808069E38)
            if (r7 == 0) goto L_0x01a0
            r21 = 2131231709(0x7f0803dd, float:1.8079507E38)
        L_0x01a0:
            r20 = 2131886831(0x7f1202ef, float:1.9408252E38)
            android.content.res.Resources r10 = r4.getResources()
            r9 = 2130970828(0x7f0408cc, float:1.7550377E38)
            r7 = 2131102239(0x7f060a1f, float:1.781691E38)
            int r7 = X.AnonymousClass1YL.A00(r4, r9, r7)
            X.C18070vi.A0d(r10, r2)
            int r7 = r10.getColor(r7)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r7)
            X.1Uk r7 = r0.A07
            boolean r9 = r7.A01()
            r7 = 2
            if (r9 == 0) goto L_0x01c7
            r7 = 17
        L_0x01c7:
            java.lang.Integer r19 = java.lang.Integer.valueOf(r7)
            X.4cV r7 = new X.4cV
            r16 = r7
            r17 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r3.add(r7)
        L_0x01d7:
            if (r34 != 0) goto L_0x01db
            if (r15 == 0) goto L_0x028d
        L_0x01db:
            X.1Lr r7 = r0.A05
            java.io.File r7 = r7.A02(r1)
            android.net.Uri r8 = android.net.Uri.fromFile(r7)
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            java.lang.String r7 = "com.whatsapp.group.GroupProfileEmojiEditor"
            r9.setClassName(r4, r7)
            java.lang.String r7 = "emojiEditorImageResult"
            r9.putExtra(r7, r8)
            java.lang.String r7 = "emojiEditorProfileTarget"
            r8 = r30
            r9.putExtra(r7, r8)
            X.0ve r8 = r0.A06
            X.C18070vi.A0d(r8, r2)
            r7 = 10925(0x2aad, float:1.5309E-41)
            boolean r7 = X.C25291Nq.A04(r8, r7)
            r21 = 2131232118(0x7f080576, float:1.8080336E38)
            if (r7 == 0) goto L_0x020e
            r21 = 2131232331(0x7f08064b, float:1.8080768E38)
        L_0x020e:
            r20 = 2131891127(0x7f1213b7, float:1.9416965E38)
            r19 = 0
            android.content.res.Resources r10 = r4.getResources()
            r8 = 2130970828(0x7f0408cc, float:1.7550377E38)
            r7 = 2131102239(0x7f060a1f, float:1.781691E38)
            int r7 = X.AnonymousClass1YL.A00(r4, r8, r7)
            X.C18070vi.A0d(r10, r2)
            int r7 = r10.getColor(r7)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r7)
            X.4cV r7 = new X.4cV
            r16 = r7
            r17 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r3.add(r7)
            if (r34 != 0) goto L_0x023c
            if (r15 == 0) goto L_0x028d
        L_0x023c:
            if (r27 == 0) goto L_0x03af
            java.lang.String r7 = r1.A0K()
        L_0x0242:
            java.io.File r2 = r0.A02(r1)
            android.net.Uri r9 = android.net.Uri.fromFile(r2)
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r10 = r4.getPackageName()
            java.lang.String r2 = "com.whatsapp.profile.WebImagePicker"
            r8.setClassName(r10, r2)
            java.lang.String r2 = "output"
            r8.putExtra(r2, r9)
            java.lang.String r2 = "query"
            r8.putExtra(r2, r7)
            r20 = 2131895530(0x7f1224ea, float:1.9425896E38)
            r21 = 2131232271(0x7f08060f, float:1.8080647E38)
            android.content.res.Resources r9 = r4.getResources()
            r7 = 2130970828(0x7f0408cc, float:1.7550377E38)
            r2 = 2131102239(0x7f060a1f, float:1.781691E38)
            int r2 = X.AnonymousClass1YL.A00(r4, r7, r2)
            X.C18070vi.A0d(r9, r11)
            int r2 = r9.getColor(r2)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r2)
            X.4cV r2 = new X.4cV
            r16 = r2
            r17 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r3.add(r2)
        L_0x028d:
            r0.A09(r1, r6)
            r2 = 2
            if (r6 == r2) goto L_0x0295
            if (r31 != 0) goto L_0x0298
        L_0x0295:
            r2 = 1
            if (r5 == 0) goto L_0x0299
        L_0x0298:
            r2 = 0
        L_0x0299:
            if (r15 != 0) goto L_0x029d
            if (r2 == 0) goto L_0x0310
        L_0x029d:
            X.1UD r2 = r0.A04
            X.0ve r7 = r2.A00
            X.0vf r6 = X.C18040vf.A01
            r2 = 12466(0x30b2, float:1.7469E-41)
            boolean r2 = X.C18020vd.A05(r6, r7, r2)
            if (r2 == 0) goto L_0x0310
            r8 = 5
            if (r15 == 0) goto L_0x02af
            r8 = 6
        L_0x02af:
            X.1Lr r2 = r0.A05
            java.io.File r2 = r2.A02(r1)
            android.net.Uri r9 = android.net.Uri.fromFile(r2)
            if (r27 == 0) goto L_0x03ac
            X.1BI r10 = r1.A0J
        L_0x02bd:
            X.C18070vi.A0d(r9, r13)
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            java.lang.String r7 = r4.getPackageName()
            java.lang.String r2 = "com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetLauncher"
            r6.setClassName(r7, r2)
            if (r10 == 0) goto L_0x03a9
            java.lang.String r7 = r10.getRawString()
        L_0x02d4:
            java.lang.String r2 = "chat_jid"
            r6.putExtra(r2, r7)
            java.lang.String r2 = "output_uri"
            r6.putExtra(r2, r9)
            java.lang.String r2 = "entry_point"
            r6.putExtra(r2, r8)
            r20 = 2131898952(0x7f123248, float:1.9432836E38)
            r21 = 2131233141(0x7f080975, float:1.8082411E38)
            r19 = 0
            android.content.res.Resources r7 = r4.getResources()
            r8 = 2130970828(0x7f0408cc, float:1.7550377E38)
            r2 = 2131102239(0x7f060a1f, float:1.781691E38)
            int r2 = X.AnonymousClass1YL.A00(r4, r8, r2)
            X.C18070vi.A0d(r7, r11)
            int r2 = r7.getColor(r2)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r2)
            X.4cV r2 = new X.4cV
            r16 = r2
            r17 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r3.add(r2)
        L_0x0310:
            java.lang.String r2 = "profile/photo/updater/run chooser"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            if (r15 == 0) goto L_0x038d
            r6 = 2131891126(0x7f1213b6, float:1.9416963E38)
            if (r14 == 0) goto L_0x031f
            r6 = 2131888559(0x7f1209af, float:1.9411757E38)
        L_0x031f:
            X.1Gb r2 = r4.A03
            X.1GO r2 = r2.A00
            X.1GP r2 = r2.A03
            if (r12 == 0) goto L_0x038b
            X.1Up r0 = (X.C27071Up) r0
            X.1Un r0 = r0.A07
            X.0ve r5 = r0.A02
            r4 = 10532(0x2924, float:1.4758E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r4)
            r4 = 0
            if (r0 == 0) goto L_0x0350
            if (r27 == 0) goto L_0x0350
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x0350
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r1 = "group_jid"
            java.lang.String r0 = r0.getRawString()
            r4.putString(r1, r0)
        L_0x0350:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r0 = "title_resource"
            r5.putInt(r0, r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            java.lang.String r0 = "choosable_intents"
            r5.putParcelableArrayList(r0, r1)
            java.lang.String r0 = "request_code"
            r1 = r29
            r5.putInt(r0, r1)
            if (r28 == 0) goto L_0x0378
            java.lang.String r1 = "subtitle_resource"
            int r0 = r28.intValue()
            r5.putInt(r1, r0)
        L_0x0378:
            if (r4 == 0) goto L_0x037f
            java.lang.String r0 = "logging_extras"
            r5.putBundle(r0, r4)
        L_0x037f:
            com.whatsapp.IntentChooserBottomSheetDialogFragment r0 = new com.whatsapp.IntentChooserBottomSheetDialogFragment
            r0.<init>()
            r0.A1R(r5)
            X.C20098A7b.A01(r0, r2)
            return
        L_0x038b:
            r4 = 0
            goto L_0x0350
        L_0x038d:
            if (r5 == 0) goto L_0x03a4
            r2 = 2
            if (r5 == r2) goto L_0x039f
            X.0zA r0 = r0.A00
            r0.A03()
            java.lang.String r1 = "getCoverPhotoStringId"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x039f:
            r6 = 2131899265(0x7f123381, float:1.9433471E38)
            goto L_0x031f
        L_0x03a4:
            r6 = 2131899332(0x7f1233c4, float:1.9433607E38)
            goto L_0x031f
        L_0x03a9:
            r7 = 0
            goto L_0x02d4
        L_0x03ac:
            r10 = 0
            goto L_0x02bd
        L_0x03af:
            java.lang.String r7 = "icon"
            goto L_0x0242
        L_0x03b3:
            boolean r7 = X.C18020vd.A05(r9, r10, r8)
            if (r7 != 0) goto L_0x03c9
            java.lang.String r9 = "com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity"
        L_0x03bb:
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r7 = r4.getPackageName()
            r8.setClassName(r7, r9)
            goto L_0x0190
        L_0x03c9:
            java.lang.String r9 = "com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoActivity"
            goto L_0x03bb
        L_0x03cc:
            r5 = 2
            goto L_0x0112
        L_0x03cf:
            r5.setClassName(r7, r2)
            goto L_0x0068
        L_0x03d4:
            boolean r2 = r0 instanceof X.C27071Up
            if (r2 == 0) goto L_0x03ee
            r8 = 0
        L_0x03d9:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r7 = r4.getPackageName()
            java.lang.String r2 = "com.whatsapp.profile.ResetPhoto"
            r5.setClassName(r7, r2)
            java.lang.String r2 = "photo_type"
            r5.putExtra(r2, r8)
            goto L_0x0068
        L_0x03ee:
            r8 = 2
            goto L_0x03d9
        L_0x03f0:
            r4 = r0
            X.2Lx r4 = (X.C48292Lx) r4
            boolean r2 = r4.A01
            if (r2 != 0) goto L_0x0405
            X.1Lr r2 = r4.A00
            java.io.File r2 = r2.A01(r1)
            if (r2 == 0) goto L_0x0042
            boolean r2 = r2.exists()
            if (r2 == 0) goto L_0x0042
        L_0x0405:
            r2 = 1
            goto L_0x0043
        L_0x0408:
            r15 = 0
            goto L_0x0029
        L_0x040b:
            java.lang.String r2 = "PhotoUpdater"
            r0.A0A(r2)
            goto L_0x0015
        L_0x0412:
            r0 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27061Uo.A08(X.01E, X.1E7, java.lang.Integer, int, int, int, boolean, boolean, boolean):void");
    }
}
