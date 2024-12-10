package com.whatsapp.conversation.themes.viewModel;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass0DT;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11Z;
import X.AnonymousClass1BI;
import X.AnonymousClass1D6;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1LU;
import X.AnonymousClass1OS;
import X.AnonymousClass1ZU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4SC;
import X.AnonymousClass4VO;
import X.AnonymousClass4aW;
import X.C108605by;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C18600wl;
import X.C19620yd;
import X.C218617r;
import X.C23421Fz;
import X.C24781Lq;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C32071ga;
import X.C41561wd;
import X.C41731wy;
import X.C64062u9;
import X.C72453Mb;
import X.C72473Md;
import X.C80173wi;
import X.C80273ws;
import X.C80373x2;
import X.C80383x3;
import X.C85344Na;
import X.C85594Nz;
import X.C87864Xj;
import X.C88434Zr;
import X.C99614tB;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class ChatThemeViewModel extends AnonymousClass1J2 {
    public C85594Nz A00;
    public ArrayList A01;
    public List A02;
    public List A03;
    public boolean A04;
    public AnonymousClass4SC A05;
    public List A06;
    public List A07;
    public final AnonymousClass1DS A08;
    public final AnonymousClass1DS A09;
    public final AnonymousClass1DS A0A;
    public final AnonymousClass1DS A0B;
    public final AnonymousClass1DS A0C;
    public final AnonymousClass1DS A0D;
    public final AnonymousClass1DS A0E;
    public final AnonymousClass1DT A0F;
    public final AnonymousClass1DT A0G;
    public final AnonymousClass1DT A0H;
    public final AnonymousClass1DT A0I;
    public final C218617r A0J;
    public final C32071ga A0K;
    public final C108605by A0L;
    public final AnonymousClass11C A0M;
    public final AnonymousClass11Z A0N;
    public final C18030ve A0O;
    public final AnonymousClass1LU A0P;
    public final AnonymousClass1BI A0Q;
    public final AnonymousClass4SC A0R = new AnonymousClass4SC((Drawable) null, AnonymousClass3MY.A0f(), "DEFAULT", (String) null, true);
    public final C87864Xj A0S;
    public final AnonymousClass4aW A0T;
    public final C41731wy A0U;
    public final C41731wy A0V;
    public final C41731wy A0W;
    public final AnonymousClass00H A0X;
    public final C18600wl A0Y;
    public final AnonymousClass10I A0Z;

    @DebugMetadata(c = "com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$1", f = "ChatThemeViewModel.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                ChatThemeViewModel chatThemeViewModel = ChatThemeViewModel.this;
                C23421Fz BOW = chatThemeViewModel.A0L.BOW();
                C99614tB A00 = C99614tB.A00(chatThemeViewModel, 15);
                this.label = 1;
                if (BOW.BFC(this, A00) == r4) {
                    return r4;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            return C27621Wu.A00;
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized X.AnonymousClass4SC A03(android.content.Context r2, com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r3, boolean r4) {
        /*
            monitor-enter(r3)
            if (r4 != 0) goto L_0x0007
            X.4SC r0 = r3.A05     // Catch:{ all -> 0x001c }
            if (r0 != 0) goto L_0x0011
        L_0x0007:
            X.4aW r1 = r3.A0T     // Catch:{ all -> 0x001c }
            X.1BI r0 = r3.A0Q     // Catch:{ all -> 0x001c }
            X.4SC r0 = r1.A0E(r2, r0)     // Catch:{ all -> 0x001c }
            r3.A05 = r0     // Catch:{ all -> 0x001c }
        L_0x0011:
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "selectedWallpaper"
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x001c }
            r0 = 0
            throw r0     // Catch:{ all -> 0x001c }
        L_0x001a:
            monitor-exit(r3)
            return r0
        L_0x001c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel.A03(android.content.Context, com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel, boolean):X.4SC");
    }

    public final void A0U(Context context, String str, boolean z) {
        boolean z2 = false;
        C18070vi.A0d(str, 0);
        C41731wy r4 = this.A0U;
        AnonymousClass1BI r3 = this.A0Q;
        if (r3 == null) {
            z2 = true;
        }
        Intent A0A2 = C17880vN.A0A();
        C72473Md.A0s(A0A2, r3, context.getPackageName(), "com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity");
        A0A2.putExtra("is_using_global_wallpaper", z2);
        A0A2.putExtra("THEME_ID_KEY", str);
        A0A2.putExtra("is_bubble_colors", z);
        r4.A0F(AnonymousClass1D6.A00(A0A2, 21));
    }

    public final void A0V(C88434Zr r9) {
        C108605by r7 = this.A0L;
        List<C80173wi> BUi = r7.BUi();
        LinkedHashMap A13 = C17880vN.A13();
        for (C80173wi r2 : BUi) {
            C80373x2 r1 = r2.A00;
            Object obj = A13.get(r1);
            if (obj == null) {
                obj = AnonymousClass1ZU.A06(r1);
                A13.put(r1, obj);
            }
            ((List) obj).add(r2);
        }
        List BaK = r7.BaK();
        C80383x3 r3 = C80383x3.A00;
        List<Object> A0x = C29431cG.A0x(BaK, r3);
        ArrayList A132 = AnonymousClass000.A13();
        for (Object obj2 : A0x) {
            Object obj3 = A13.get(obj2);
            if (obj3 != null) {
                A132.add(obj3);
            }
        }
        this.A07 = C29351c6.A0F(A132);
        List A0N2 = C18070vi.A0N(C80273ws.A00, r3, new C88434Zr[2], 0, 1);
        List list = this.A07;
        if (list == null) {
            C18070vi.A11("messageColorList");
            throw null;
        }
        ArrayList A0k = C29431cG.A0k(list, A0N2);
        this.A06 = A0k;
        AnonymousClass1DT r72 = this.A0G;
        ArrayList A0D2 = C29351c6.A0D(A0k);
        Iterator it = A0k.iterator();
        while (it.hasNext()) {
            C88434Zr r4 = (C88434Zr) it.next();
            A0D2.add(new AnonymousClass4VO(r4, this.A0R, (String) null, C18070vi.A18(r4.A00, r9.A00)));
        }
        r72.A0E(A0D2);
    }

    public ChatThemeViewModel(C24781Lq r10, C218617r r11, C108605by r12, AnonymousClass11C r13, AnonymousClass11Z r14, C18030ve r15, AnonymousClass1LU r16, AnonymousClass1BI r17, C87864Xj r18, AnonymousClass4aW r19, AnonymousClass10I r20, AnonymousClass00H r21, C18600wl r22) {
        AnonymousClass4aW r3 = r19;
        AnonymousClass1LU r5 = r16;
        C18070vi.A0w(r12, r3, r5, r13, r14);
        AnonymousClass10I r1 = r20;
        C87864Xj r4 = r18;
        C18070vi.A0x(r4, r1, r15, r11, r10);
        AnonymousClass00H r0 = r21;
        C18600wl r2 = r22;
        C72473Md.A1L(r0, r2);
        this.A0L = r12;
        this.A0T = r3;
        this.A0P = r5;
        this.A0M = r13;
        this.A0N = r14;
        this.A0S = r4;
        this.A0Z = r1;
        this.A0O = r15;
        this.A0J = r11;
        this.A0X = r0;
        this.A0Y = r2;
        this.A0Q = r17;
        this.A0K = r10.A00("wallpaper-cache", (int) (C19620yd.A00 / 8192));
        AnonymousClass1DT A0L2 = AnonymousClass3MW.A0L();
        this.A0F = A0L2;
        this.A08 = A0L2;
        AnonymousClass1DT A0L3 = AnonymousClass3MW.A0L();
        this.A0G = A0L3;
        this.A0A = A0L3;
        AnonymousClass1DT A0L4 = AnonymousClass3MW.A0L();
        this.A0H = A0L4;
        this.A0D = A0L4;
        C41731wy A0o = AnonymousClass3MW.A0o();
        this.A0U = A0o;
        this.A09 = A0o;
        C41731wy A0o2 = AnonymousClass3MW.A0o();
        this.A0W = A0o2;
        this.A0C = A0o2;
        C41731wy A0o3 = AnonymousClass3MW.A0o();
        this.A0V = A0o3;
        this.A0B = A0o3;
        AnonymousClass1DT A0L5 = AnonymousClass3MW.A0L();
        this.A0I = A0L5;
        this.A0E = A0L5;
        AnonymousClass3MW.A1X(r2, new AnonymousClass1((C30391dr) null), C41561wd.A00(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(android.content.Context r10, X.AnonymousClass4VO r11, X.AnonymousClass4D5 r12, com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r13, X.C30391dr r14, int r15) {
        /*
            boolean r0 = r14 instanceof X.C100874vD
            if (r0 == 0) goto L_0x00d4
            r3 = r14
            X.4vD r3 = (X.C100874vD) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d4
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r1 = r3.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            r2 = 2
            r9 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 == r9) goto L_0x00aa
            if (r0 != r2) goto L_0x00db
            X.C30691eM.A01(r1)
        L_0x0023:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0026:
            X.C30691eM.A01(r1)
            X.4SC r0 = r11.A01
            java.lang.String r0 = r0.A03
            java.lang.String r8 = "DEFAULT"
            boolean r0 = X.C18070vi.A18(r0, r8)
            if (r0 == 0) goto L_0x0073
            X.4D5 r0 = X.AnonymousClass4D5.WALLPAPER
            if (r12 != r0) goto L_0x0073
            X.4aW r10 = r13.A0T
            X.1BI r7 = r13.A0Q
            r0 = -1
            r6 = 0
            if (r15 != r0) goto L_0x0042
            r15 = 0
        L_0x0042:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r5 = 0
            X.4Na r0 = new X.4Na
            r0.<init>(r1, r8, r5)
            X.AnonymousClass4aW.A09(r7, r0, r10, r9, r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            X.4Na r0 = new X.4Na
            r0.<init>(r1, r8, r5)
            X.AnonymousClass4aW.A09(r7, r0, r10, r6, r6)
        L_0x005b:
            X.5by r6 = r13.A0L
            X.4Zr r5 = r11.A00
            X.1BI r1 = r13.A0Q
            r0 = 0
            r3.L$0 = r0
            r3.L$1 = r0
            r3.L$2 = r0
            r3.L$3 = r0
            r3.label = r2
            java.lang.Object r0 = r6.CGn(r5, r1, r3)
            if (r0 != r4) goto L_0x0023
            return r4
        L_0x0073:
            java.lang.String r1 = r11.A02
            if (r1 == 0) goto L_0x005b
            r3.L$0 = r13
            r3.L$1 = r11
            r3.L$2 = r10
            r3.L$3 = r12
            r3.I$0 = r15
            r3.label = r9
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C71053Dp.A01
            X.1dr r0 = X.C30581eB.A02(r3)
            X.3Dp r8 = new X.3Dp
            r8.<init>(r0)
            X.10I r7 = r13.A0Z
            X.4Xj r6 = r13.A0S
            android.net.Uri r5 = android.net.Uri.parse(r1)
            X.4q1 r1 = new X.4q1
            r1.<init>(r8)
            X.49l r0 = new X.49l
            r0.<init>(r10, r5, r1, r6)
            X.C17890vO.A0u(r0, r7)
            java.lang.Object r0 = r8.A00()
            if (r0 != r4) goto L_0x00bd
            return r4
        L_0x00aa:
            int r15 = r3.I$0
            java.lang.Object r12 = r3.L$3
            java.lang.Object r10 = r3.L$2
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r11 = r3.L$1
            X.4VO r11 = (X.AnonymousClass4VO) r11
            java.lang.Object r13 = r3.L$0
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r13 = (com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel) r13
            X.C30691eM.A01(r1)
        L_0x00bd:
            X.4D5 r0 = X.AnonymousClass4D5.WALLPAPER
            if (r12 != r0) goto L_0x005b
            X.4Xj r1 = r13.A0S
            java.lang.String r0 = r11.A02
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri r0 = r1.A01(r0)
            X.C18070vi.A0X(r0)
            A05(r10, r0, r13, r15)
            goto L_0x005b
        L_0x00d4:
            X.4vD r3 = new X.4vD
            r3.<init>(r13, r14)
            goto L_0x0012
        L_0x00db:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel.A04(android.content.Context, X.4VO, X.4D5, com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel, X.1dr, int):java.lang.Object");
    }

    public static final void A05(Context context, Uri uri, ChatThemeViewModel chatThemeViewModel, int i) {
        FileInputStream fileInputStream;
        AnonymousClass4aW r6 = chatThemeViewModel.A0T;
        AnonymousClass1BI r7 = chatThemeViewModel.A0Q;
        BitmapDrawable bitmapDrawable = null;
        try {
            uri.getClass();
            fileInputStream = new FileInputStream(C64062u9.A04(uri));
            Bitmap A0O2 = C72453Mb.A0O(AnonymousClass4aW.A00(context), fileInputStream, false);
            if (A0O2 != null) {
                bitmapDrawable = new BitmapDrawable(context.getResources(), A0O2);
            } else {
                r6.A03.A05(2131889983);
            }
            fileInputStream.close();
        } catch (IOException unused) {
            r6.A03.A05(2131889983);
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        if (bitmapDrawable != null) {
            String name = new File(uri.toString()).getName();
            if (i == -1) {
                i = 50;
            }
            File A082 = AnonymousClass4aW.A08(context, bitmapDrawable, name);
            AnonymousClass4aW.A09(r7, new C85344Na(Integer.valueOf(i), "USER_PROVIDED", Uri.fromFile(A082).toString()), r6, true, false);
            AnonymousClass4aW.A09(r7, new C85344Na(0, "USER_PROVIDED", Uri.fromFile(A082).toString()), r6, false, false);
            return;
        }
        return;
        throw th;
    }

    public void A0S() {
        this.A0K.A02.A07(-1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass4VO A00(android.content.Context r10, X.C88434Zr r11, java.lang.String r12) {
        /*
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.io.File r0 = r10.getFilesDir()
            java.lang.String r0 = r0.getPath()
            r2.append(r0)
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r3 = 0
            r0[r3] = r12
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = "/downloadable/wallpaper-v3-1/thumbnails/light/wallpaper-000%s.jpg"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.C18070vi.A0X(r0)
            java.lang.String r4 = X.AnonymousClass000.A0y(r0, r2)
            java.lang.String r6 = "LoadThumbnailWallpaperImageTask/error when loading wallpaper resource"
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            android.graphics.Point r1 = X.AnonymousClass4aW.A00(r10)
            r5 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException | OutOfMemoryError -> 0x0048 }
            r2.<init>(r0)     // Catch:{ IOException | OutOfMemoryError -> 0x0048 }
            r0 = 1
            android.graphics.Bitmap r0 = X.C72453Mb.A0O(r1, r2, r0)     // Catch:{ all -> 0x0041 }
            r2.close()     // Catch:{ IOException | OutOfMemoryError -> 0x0048 }
            r5 = r0
            goto L_0x004c
        L_0x0041:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException | OutOfMemoryError -> 0x0048 }
            throw r0     // Catch:{ IOException | OutOfMemoryError -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)
        L_0x004c:
            android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
            r6.<init>(r5)
            java.lang.String r8 = "DOWNLOADED"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r10 = 1
            r9 = 0
            X.4SC r5 = new X.4SC
            r5.<init>(r6, r7, r8, r9, r10)
            X.4VO r0 = new X.4VO
            r0.<init>(r11, r5, r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel.A00(android.content.Context, X.4Zr, java.lang.String):X.4VO");
    }

    public final void A0T(Context context) {
        AnonymousClass3MW.A1X(this.A0Y, new ChatThemeViewModel$refreshUi$1(context, this, (C30391dr) null), C72453Mb.A12(this, context));
    }
}
