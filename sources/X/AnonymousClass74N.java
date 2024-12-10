package X;

import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.74N  reason: invalid class name */
public class AnonymousClass74N {
    public static final int A00 = 8;
    public static final int A01 = 20;
    public static final int A02 = 72;
    public static final int A03 = 108;
    public static final String A04 = "com.whatsapp.sharing.category.SHARE_TARGET_DEFAULT";
    public static final Set A05 = new AnonymousClass7T1();

    public static C136826uT A03(AnonymousClass1M9 r3, C24921Me r4, AnonymousClass11C r5, AnonymousClass1E7 r6) {
        return new C136826uT((IconCompat) null, r4.A0I(r6), (String) null, A06(r3, r5, r6), false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r0 = ((X.C25741Pl) r3.get()).A00((com.whatsapp.jid.UserJid) r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0N(X.AnonymousClass1BI r2, X.AnonymousClass00H r3) {
        /*
            r1 = 0
            if (r2 == 0) goto L_0x0020
            boolean r0 = X.C42701yb.A01(r2)
            if (r0 == 0) goto L_0x0020
            boolean r0 = r2 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r3.get()
            X.1Pl r0 = (X.C25741Pl) r0
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.24e r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x0020
            r1 = 1
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74N.A0N(X.1BI, X.00H):boolean");
    }

    public static int A00(Context context) {
        if (Build.VERSION.SDK_INT < 25) {
            return 8;
        }
        return AnonymousClass74E.A00(context);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.1LU, java.lang.Object] */
    public static ShortcutInfo A01(Context context, AnonymousClass1VW r15, AnonymousClass1M9 r16, C24921Me r17, C27191Vc r18, AnonymousClass11C r19, AnonymousClass1E7 r20, AnonymousClass00H r21, String str, int i) {
        Log.i("WaShortcutsApiHelper/createShortcutForContact");
        Class<AnonymousClass1BI> cls = AnonymousClass1BI.class;
        AnonymousClass1E7 r6 = r20;
        Context context2 = context;
        Intent A1w = new Object().A1w(context, (AnonymousClass1BI) r6.A06(cls), 0);
        if (A0N((AnonymousClass1BI) r6.A06(cls), r21)) {
            A1w.putExtra("bot_metrics_entrypoint", "APP_SHORTCUT");
            A1w.putExtra("bot_metrics_destination_id", C17890vO.A0Q());
        }
        ShortcutInfo.Builder rank = new ShortcutInfo.Builder(context, C108985cd.A0l(r6)).setShortLabel(str).setCategories(A05).setLongLived(true).setRank(i);
        C60442o2.A01(A1w, "WaShortcutsHelper");
        ShortcutInfo.Builder intent = rank.setIntent(A1w.setAction("android.intent.action.VIEW"));
        Bitmap A042 = r18.A04(context2, r6, "WaShortcutsHelper.createShortcutForContact", 0.0f, 72, true);
        if (A042 == null) {
            int A022 = r15.A02(r6);
            C18070vi.A0d(context2, 0);
            A042 = r15.A04(context2, (AnonymousClass1VX) null, 0.0f, A022, 72);
        }
        intent.setIcon(Icon.createWithAdaptiveBitmap(A02(A042)));
        if (C22971Dz.A0Y(r6.A0J)) {
            intent.setPerson(new Person.Builder().setName(r17.A0I(r6)).setUri(A06(r16, r19, r6)).build());
        }
        return intent.build();
    }

    public static Bitmap A02(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(A03, A03, Bitmap.Config.ARGB_8888);
        Canvas A0I = C108945cZ.A0I(createBitmap);
        Paint A06 = AnonymousClass3MW.A06();
        RectF rectF = new RectF(0.0f, 0.0f, 108.0f, 108.0f);
        A0I.drawARGB(0, 0, 0, 0);
        A06.setAntiAlias(true);
        A06.setDither(true);
        A06.setFilterBitmap(true);
        A06.setColor(-1);
        A0I.drawRect(rectF, A06);
        C108965cb.A11(A06, PorterDuff.Mode.SRC_IN);
        A0I.drawBitmap(bitmap, ((float) (A0I.getWidth() - bitmap.getWidth())) / 2.0f, ((float) (A0I.getHeight() - bitmap.getHeight())) / 2.0f, A06);
        return createBitmap;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C139656zE A04(android.content.Context r16, X.C19880zA r17, X.C19880zA r18, X.AnonymousClass1VW r19, X.AnonymousClass1M9 r20, X.C24921Me r21, X.C27191Vc r22, X.C27171Va r23, X.AnonymousClass11C r24, X.AnonymousClass1E7 r25, X.AnonymousClass00H r26, int r27) {
        /*
            java.lang.String r0 = "WaShortcutsApiHelper/createShortcutCompatForContact"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10 = r25
            X.1BI r6 = r10.A0J
            X.C17960vV.A07(r6)
            r5 = r21
            java.lang.String r8 = r5.A0I(r10)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r2 = 0
            if (r0 == 0) goto L_0x0032
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WaShortcutsApiHelper/createShortcutCompatForContact empty name for:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " type:"
            r1.append(r0)
            int r0 = r6.getType()
            X.C17900vP.A0o(r1, r0)
            return r2
        L_0x0032:
            boolean r0 = r18.A07()
            if (r0 == 0) goto L_0x0042
            X.C19880zA.A02(r18)
            java.lang.String r0 = "isNotificationSender"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0042:
            X.1LU r1 = new X.1LU
            r1.<init>()
            X.1BI r0 = X.AnonymousClass1E7.A00(r10)
            r4 = 0
            r9 = r16
            android.content.Intent r7 = r1.A1w(r9, r0, r4)
            r0 = r26
            boolean r0 = A0N(r6, r0)
            if (r0 == 0) goto L_0x006a
            java.lang.String r1 = "APP_SHORTCUT"
            java.lang.String r0 = "bot_metrics_entrypoint"
            r7.putExtra(r0, r1)
            java.lang.String r1 = X.C17890vO.A0Q()
            java.lang.String r0 = "bot_metrics_destination_id"
            r7.putExtra(r0, r1)
        L_0x006a:
            java.lang.String r0 = r6.getRawString()
            X.71Y r3 = new X.71Y
            r3.<init>((android.content.Context) r9, (java.lang.String) r0)
            X.6zE r2 = r3.A00
            r2.A0B = r8
            r0 = 1
            r2.A0N = r0
            r0 = r27
            r2.A02 = r0
            java.lang.String r0 = "WaShortcutsHelper"
            X.C60442o2.A01(r7, r0)
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = r7.setAction(r0)
            r0 = 1
            android.content.Intent[] r0 = new android.content.Intent[r0]
            r0[r4] = r1
            r2.A0P = r0
            java.lang.Object r0 = r17.A04()
            if (r0 == 0) goto L_0x00cb
            boolean r0 = X.C42701yb.A01(r6)
            if (r0 == 0) goto L_0x00cb
            r0 = 6
            java.lang.Integer[] r7 = new java.lang.Integer[r0]
            r0 = 1
            X.C17880vN.A1T(r7, r0, r4)
            r6 = 3
            X.C17880vN.A1T(r7, r6, r0)
            java.lang.Integer r1 = X.C108955ca.A0f()
            r0 = 2
            r7[r0] = r1
            X.C17880vN.A1T(r7, r0, r6)
            r0 = 13
            X.AnonymousClass3Ma.A1T(r7, r0)
            r0 = 20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 5
            java.util.List r1 = X.C18070vi.A0O(r1, r7, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x012e
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x012e
        L_0x00cb:
            java.util.Set r1 = A05
            X.016 r0 = new X.016
            r0.<init>((int) r4)
            r0.addAll(r1)
            r2.A0F = r0
        L_0x00d7:
            r14 = 1
            java.lang.String r11 = "WaShortcutsHelper.createShortcutCompatForContact"
            r13 = 72
            r12 = 0
            r8 = r22
            android.graphics.Bitmap r0 = r8.A04(r9, r10, r11, r12, r13, r14)
            if (r0 != 0) goto L_0x0102
            r0 = r23
            android.graphics.Bitmap r0 = r0.A00(r9, r10, r12, r13)
            if (r0 != 0) goto L_0x0102
            r14 = r19
            int r18 = r14.A02(r10)
            X.1BI r0 = r10.A0J
            X.1VX r16 = X.AnonymousClass1VW.A01(r0)
            r15 = r9
            r17 = r12
            r19 = r13
            android.graphics.Bitmap r0 = r14.A04(r15, r16, r17, r18, r19)
        L_0x0102:
            android.graphics.Bitmap r6 = A02(r0)
            if (r6 == 0) goto L_0x013f
            r1 = 5
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>(r1)
            r0.A06 = r6
            r2.A09 = r0
            X.1BI r0 = r10.A0J
            boolean r0 = X.C22971Dz.A0Y(r0)
            if (r0 == 0) goto L_0x0129
            r1 = r20
            r0 = r24
            X.6uT r1 = A03(r1, r5, r0, r10)
            r0 = 1
            X.6uT[] r0 = new X.C136826uT[r0]
            r0[r4] = r1
            r2.A0Q = r0
        L_0x0129:
            X.6zE r0 = r3.A00()
            return r0
        L_0x012e:
            java.util.Iterator r1 = r1.iterator()
        L_0x0132:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cb
            int r0 = X.C72453Mb.A0H(r1)
            if (r0 != 0) goto L_0x00d7
            goto L_0x0132
        L_0x013f:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74N.A04(android.content.Context, X.0zA, X.0zA, X.1VW, X.1M9, X.1Me, X.1Vc, X.1Va, X.11C, X.1E7, X.00H, int):X.6zE");
    }

    public static List A07(C19880zA r5, C37551pj r6, AnonymousClass1M9 r7, AnonymousClass1CJ r8, C25181Nf r9, C26051Qq r10, AnonymousClass1MZ r11) {
        Log.i("WaShortcutsApiHelper/getFrequentContacts");
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = r10.A01(true, false).iterator();
        while (it.hasNext()) {
            AnonymousClass1BI A0Q = C17880vN.A0Q(it);
            AnonymousClass1E7 A0E = r7.A0E(A0Q);
            if (A0E != null && !r6.A0P(C22941Dw.A00(A0Q)) && !r8.A0T(A0Q) && !C22971Dz.A0Z(A0Q) && !C22971Dz.A0a(A0Q)) {
                if (!A0E.A0F() || r11.A0J((GroupJid) A0Q)) {
                    A13.add(A0E);
                }
            }
        }
        if (A13.isEmpty()) {
            Log.i("WaShortcutsApiHelper/getFrequentContacts/get N contacts");
            A13 = r9.A02(20);
            if (A13.isEmpty()) {
                Log.i("WaShortcutsApiHelper/getFrequentContacts/get contact picker list");
                r7.A0u(A13);
            }
        }
        if (!r5.A07()) {
            return A08(r8, A13);
        }
        C19880zA.A02(r5);
        throw AnonymousClass000.A0s("maybeGetNotificationUser");
    }

    public static List A08(AnonymousClass1CJ r6, List list) {
        ArrayList A0z = C17880vN.A0z(8);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1E7 A0O = C17880vN.A0O(it);
            AnonymousClass1BI r1 = A0O.A0J;
            if (r1 != null && !C22971Dz.A0T(r1) && !r6.A0S(r1) && !C22971Dz.A0V(r1) && !C22971Dz.A0S(r1) && !C22971Dz.A0Z(r1)) {
                A0z.add(A0O);
                if (A0z.size() >= 8) {
                    break;
                }
            }
        }
        return A0z;
    }

    public static void A0A(Context context) {
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        List<ShortcutInfo> shortcuts = shortcutManager.getShortcuts(8);
        ArrayList A13 = AnonymousClass000.A13();
        for (ShortcutInfo id : shortcuts) {
            A13.add(id.getId());
        }
        shortcutManager.removeLongLivedShortcuts(A13);
    }

    public static synchronized void A0E(Context context, C19880zA r18, C19880zA r19, AnonymousClass190 r20, C37551pj r21, AnonymousClass1VW r22, AnonymousClass1M9 r23, C24921Me r24, C27191Vc r25, C27171Va r26, AnonymousClass11C r27, C219217x r28, AnonymousClass1CJ r29, C25181Nf r30, C26051Qq r31, AnonymousClass1MZ r32, AnonymousClass00H r33) {
        synchronized (AnonymousClass74N.class) {
            C19880zA r8 = r19;
            AnonymousClass1M9 r10 = r23;
            List A07 = A07(r8, r21, r10, r29, r30, r31, r32);
            ArrayList A13 = AnonymousClass000.A13();
            Context context2 = context;
            if (AnonymousClass000.A1P(r28.A00.A00.checkCallingOrSelfPermission("android.permission.CAMERA"))) {
                A13.add(C32531hL.A00(context2));
            }
            int A002 = A00(context2);
            int i = 0;
            while (true) {
                if (i < A07.size()) {
                    C27171Va r13 = r26;
                    C19880zA r7 = r18;
                    AnonymousClass1VW r9 = r22;
                    C24921Me r11 = r24;
                    C27191Vc r12 = r25;
                    C139656zE A042 = A04(context2, r7, r8, r9, r10, r11, r12, r13, r27, (AnonymousClass1E7) A07.get(i), r33, i);
                    if (A042 != null) {
                        A13.add(A042);
                        if (A002 == A13.size()) {
                            break;
                        }
                    }
                    i++;
                }
            }
            try {
                A0K(context2, A13);
            } catch (IllegalArgumentException | IllegalStateException | SecurityException e) {
                r20.A0G("WaShortcutsHelper/rebuildDynamicShortcuts", (String) null, true);
                Log.w("WaShortcutsHelper/exception happened. ", e);
            }
        }
        return;
    }

    public static synchronized void A0G(Context context, AnonymousClass1VW r15, AnonymousClass1M9 r16, C24921Me r17, C27191Vc r18, AnonymousClass11C r19, AnonymousClass1E7 r20, AnonymousClass00H r21, String str) {
        synchronized (AnonymousClass74N.class) {
            Context context2 = context;
            List A032 = AnonymousClass74E.A03(context);
            AnonymousClass1E7 r11 = r20;
            String str2 = str;
            if (A0M(A05(C108985cd.A0l(r11), A032), str2)) {
                Log.i("WaShortcutsApiHelper/publishShortcut/shortcut already published");
            } else {
                AnonymousClass1VW r6 = r15;
                AnonymousClass1M9 r7 = r16;
                C24921Me r8 = r17;
                C27191Vc r9 = r18;
                AnonymousClass11C r10 = r19;
                AnonymousClass00H r12 = r21;
                ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(A01(context2, r6, r7, r8, r9, r10, r11, r12, str2, Math.min(A032.size(), A00(context))));
            }
        }
    }

    public static void A0K(Context context, List list) {
        Log.i("WaShortcutsApiHelper/rebuild shortcut lists");
        AnonymousClass74E.A05(context);
        int A002 = A00(context);
        if (list.size() > A002) {
            list = list.subList(0, A002);
        }
        AnonymousClass74E.A07(context, list);
    }

    public static void A0L(Context context, List list) {
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        if (shortcutManager != null) {
            shortcutManager.disableShortcuts(list);
        }
    }

    public static boolean A0M(C139656zE r0, String str) {
        if (r0 == null || !r0.A0B.toString().equals(str)) {
            return false;
        }
        return true;
    }

    public static C139656zE A05(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C139656zE r1 = (C139656zE) it.next();
            if (r1.A0D.equals(str)) {
                return r1;
            }
        }
        return null;
    }

    public static String A06(AnonymousClass1M9 r1, AnonymousClass11C r2, AnonymousClass1E7 r3) {
        Uri A09 = r1.A09(r3, r2.A0O());
        if (A09 != null) {
            return A09.toString();
        }
        return null;
    }

    public static void A0H(Context context, AnonymousClass1E7 r3) {
        ArrayList A13 = AnonymousClass000.A13();
        A13.add(C108985cd.A0l(r3));
        A0L(context, A13);
    }

    public static void A0I(Context context, AnonymousClass1BI r4) {
        String rawString = r4.getRawString();
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        for (ShortcutInfo shortcutInfo : shortcutManager.getShortcuts(8)) {
            if (shortcutInfo.getId().equals(rawString)) {
                shortcutManager.removeLongLivedShortcuts(Collections.singletonList(shortcutInfo.getId()));
                return;
            }
        }
    }

    public static void A09(Context context) {
        AnonymousClass74E.A05(context);
    }
}
