package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.util.Log;
import java.util.UUID;

/* renamed from: X.1hL  reason: invalid class name and case insensitive filesystem */
public class C32531hL implements AnonymousClass191 {
    public final C19880zA A00;
    public final C19880zA A01;
    public final AnonymousClass190 A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass1VW A04;
    public final AnonymousClass1M9 A05;
    public final C24921Me A06;
    public final C27191Vc A07;
    public final C27171Va A08;
    public final AnonymousClass11C A09;
    public final AnonymousClass118 A0A;
    public final C219217x A0B;
    public final C19830z4 A0C;
    public final AnonymousClass1CJ A0D;
    public final C25181Nf A0E;
    public final C26051Qq A0F;
    public final AnonymousClass1MZ A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass1KB A0J;
    public final AnonymousClass10I A0K;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r8 != null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.content.Context r10, X.AnonymousClass1E7 r11, java.lang.String r12) {
        /*
            r9 = this;
            r6 = r11
            r8 = r12
            if (r12 != 0) goto L_0x000d
            X.1Me r0 = r9.A06
            java.lang.String r8 = r0.A0I(r11)
            r2 = 0
            if (r8 == 0) goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L_0x002c
            if (r2 == 0) goto L_0x002e
            java.lang.String r0 = "WaShortcutsHelper/publishShortcut"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1VW r1 = r9.A04
            X.1M9 r2 = r9.A05
            X.1Me r3 = r9.A06
            X.11C r5 = r9.A09
            X.1Vc r4 = r9.A07
            X.00H r7 = r9.A0I
            r0 = r10
            X.AnonymousClass74N.A0G(r0, r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x002b:
            return
        L_0x002c:
            if (r2 != 0) goto L_0x002b
        L_0x002e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "No valid display name for contact "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            com.whatsapp.util.Log.e(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32531hL.A04(android.content.Context, X.1E7, java.lang.String):void");
    }

    public /* synthetic */ void Blf() {
    }

    public static C139656zE A00(Context context) {
        AnonymousClass71Y r5 = new AnonymousClass71Y(context, "open_camera");
        String string = context.getString(2131896135);
        C139656zE r4 = r5.A00;
        r4.A0B = string;
        r4.A09 = IconCompat.A02(context.getResources(), context.getPackageName(), 2131232308);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.camera.LauncherCameraActivity");
        intent.putExtra("media_sharing_user_journey_origin", 31);
        intent.putExtra("media_sharing_user_journey_start_target", 9);
        r4.A0P = new Intent[]{intent.addFlags(268435456).setAction("android.intent.action.VIEW")};
        return r5.A00();
    }

    public static C139656zE A01(C32531hL r13, AnonymousClass1E7 r14, boolean z, boolean z2) {
        Intent intent;
        Bitmap bitmap;
        Context context = r13.A0A.A00;
        AnonymousClass1E7 r8 = r14;
        String A022 = C63462t7.A02(r13.A06.A0I(r14));
        if (z2) {
            AnonymousClass1BI r0 = r14.A0J;
            C17960vV.A07(r0);
            String rawString = r0.getRawString();
            intent = AnonymousClass1LU.A0C(context, 0);
            intent.setAction("android.intent.action.MAIN");
            intent.addFlags(335544320);
            intent.putExtra("jid", rawString);
        } else {
            intent = new Intent();
            intent.setAction("com.whatsapp.Conversation");
            intent.addFlags(335544320);
            AnonymousClass1BI r02 = r14.A0J;
            C17960vV.A07(r02);
            intent.putExtra("jid", r02.getRawString());
        }
        intent.putExtra("displayname", A022);
        if (Build.VERSION.SDK_INT >= 23 && AnonymousClass74N.A0N(r14.A0J, r13.A0I)) {
            intent.putExtra("bot_metrics_entrypoint", "APP_SHORTCUT");
            intent.putExtra("bot_metrics_destination_id", UUID.randomUUID().toString());
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131168720);
        if (z) {
            bitmap = r13.A07.A04(context, r8, "WaShortcutsHelper.createConversationShortcutInfo", context.getResources().getDimension(2131168737), dimensionPixelSize, false);
            if (bitmap == null) {
                bitmap = r13.A04.A06(context, r14);
                if (!(bitmap.getWidth() == dimensionPixelSize && bitmap.getHeight() == dimensionPixelSize)) {
                    bitmap = Bitmap.createScaledBitmap(bitmap, dimensionPixelSize, dimensionPixelSize, true);
                }
            }
        } else {
            bitmap = null;
        }
        C60442o2.A01(intent, "ShortcutIntentHelper");
        if (A022 == null) {
            r13.A02.A0G("UnexpectedNull/WaShortcutsHelper/ShortcutName", (String) null, true);
        }
        AnonymousClass1BI r03 = r14.A0J;
        C17960vV.A07(r03);
        AnonymousClass71Y r5 = new AnonymousClass71Y(context, r03.getRawString());
        C139656zE r1 = r5.A00;
        r1.A0P = new Intent[]{intent};
        r1.A0B = A022;
        if (bitmap != null) {
            r1.A09 = IconCompat.A03(bitmap);
        }
        return r5.A00();
    }

    public void A02() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            Log.i("WaShortcutsHelper/deletealldynamicshortcuts");
            AnonymousClass74E.A05(this.A0A.A00);
        }
        if (i >= 30) {
            Log.i("WaShortcutsHelper/deleteallcachedshortcuts");
            AnonymousClass74N.A0A(this.A0A.A00);
        }
    }

    public void A03() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.A0K.CGL(new C70613Bu(this, 9), "WaShortcutsHelper/updateAppShortcuts");
        }
    }

    public void A05(AnonymousClass1E7 r5) {
        Context context = this.A0A.A00;
        C139656zE A012 = A01(this, r5, true, false);
        if (AnonymousClass74E.A08(context)) {
            AnonymousClass74E.A06(context, A012);
            if (Build.VERSION.SDK_INT >= 26) {
                return;
            }
        } else {
            Intent A013 = AnonymousClass74E.A01(context, A012);
            A013.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
            context.sendBroadcast(A013);
        }
        this.A0J.A08(2131889015, 1);
    }

    public void A06(AnonymousClass1E7 r4) {
        Context context = this.A0A.A00;
        if (Build.VERSION.SDK_INT >= 26) {
            AnonymousClass74N.A0H(context, r4);
            return;
        }
        Intent A012 = AnonymousClass74E.A01(context, A01(this, r4, false, false));
        A012.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
        context.sendBroadcast(A012);
    }

    public void A07(AnonymousClass1BI r3) {
        if (Build.VERSION.SDK_INT >= 30) {
            Log.i("WaShortcutsHelper/removeShortcutFromCache");
            AnonymousClass74N.A0I(this.A0A.A00, r3);
        }
    }

    public void Blg() {
        if (Build.VERSION.SDK_INT >= 23) {
            AnonymousClass11S r0 = this.A03;
            r0.A0I();
            if (r0.A0E != null) {
                C19830z4 r10 = this.A0C;
                if (((SharedPreferences) r10.A00.get()).getInt("sharing_shortcuts_version", 0) != 1) {
                    Context context = this.A0A.A00;
                    AnonymousClass190 r17 = this.A02;
                    AnonymousClass1CJ r16 = this.A0D;
                    AnonymousClass1VW r18 = this.A04;
                    AnonymousClass1M9 r15 = this.A05;
                    C24921Me r14 = this.A06;
                    AnonymousClass11C r13 = this.A09;
                    C27171Va r12 = this.A08;
                    C19880zA r6 = this.A00;
                    C219217x r5 = this.A0B;
                    C26051Qq r4 = this.A0F;
                    AnonymousClass1MZ r3 = this.A0G;
                    C27191Vc r2 = this.A07;
                    C25181Nf r1 = this.A0E;
                    C19880zA r02 = this.A01;
                    AnonymousClass11C r23 = r13;
                    AnonymousClass190 r162 = r17;
                    C37551pj r172 = (C37551pj) this.A0H.get();
                    AnonymousClass1M9 r19 = r15;
                    Context context2 = context;
                    C19880zA r142 = r6;
                    C19880zA r152 = r02;
                    AnonymousClass74N.A0E(context2, r142, r152, r162, r172, r18, r19, r14, r2, r12, r23, r5, r16, r1, r4, r3, this.A0I);
                    C19830z4.A00(r10).putInt("sharing_shortcuts_version", 1).apply();
                }
            }
        }
    }

    public C32531hL(C19880zA r2, C19880zA r3, AnonymousClass190 r4, AnonymousClass1KB r5, AnonymousClass11S r6, AnonymousClass1VW r7, AnonymousClass1M9 r8, C24921Me r9, C27191Vc r10, C27171Va r11, AnonymousClass11C r12, AnonymousClass118 r13, C219217x r14, C19830z4 r15, AnonymousClass1CJ r16, C25181Nf r17, C26051Qq r18, AnonymousClass1MZ r19, AnonymousClass10I r20, AnonymousClass00H r21, AnonymousClass00H r22) {
        this.A0J = r5;
        this.A0A = r13;
        this.A02 = r4;
        this.A0K = r20;
        this.A03 = r6;
        this.A0D = r16;
        this.A04 = r7;
        this.A05 = r8;
        this.A06 = r9;
        this.A08 = r11;
        this.A09 = r12;
        this.A0H = r21;
        this.A0B = r14;
        this.A00 = r2;
        this.A0C = r15;
        this.A0F = r18;
        this.A0G = r19;
        this.A07 = r10;
        this.A0E = r17;
        this.A01 = r3;
        this.A0I = r22;
    }

    public void Ba9() {
    }
}
