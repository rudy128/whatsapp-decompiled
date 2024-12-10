package X;

import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.73v  reason: invalid class name and case insensitive filesystem */
public abstract class C1409873v {
    public static AnonymousClass737 A00(AnonymousClass737 r3, C18010vc r4) {
        int[] iArr = r3.A00;
        if (!AnonymousClass74I.A03(iArr) || !r4.A05("emoji_modifiers").contains(A02(iArr))) {
            return r3;
        }
        return new AnonymousClass737(A06(r4, iArr));
    }

    public static int[] A06(C18010vc r1, int[] iArr) {
        return AnonymousClass74I.A09(iArr, C17890vO.A00(r1.A05("emoji_modifiers"), A02(iArr)));
    }

    public static String A01(int[] iArr) {
        int[] A08 = AnonymousClass74I.A08(iArr);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("multi_skin_");
        return AnonymousClass000.A0y(new AnonymousClass737(A08).toString(), A10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (X.AnonymousClass74I.A00(r3) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(int[] r4) {
        /*
            boolean r1 = X.AnonymousClass74I.A03(r4)
            java.lang.String r0 = "must be skin tone"
            X.C17960vV.A0F(r1, r0)
            int[] r3 = X.AnonymousClass72X.A03(r4)
            int r2 = r3.length
            r0 = 3
            if (r2 == r0) goto L_0x0014
            r0 = 4
            if (r2 != r0) goto L_0x004f
        L_0x0014:
            int r0 = r2 + -2
            r1 = r3[r0]
            r0 = 8205(0x200d, float:1.1498E-41)
            if (r1 != r0) goto L_0x004f
            int r0 = r2 + -1
            r3 = r3[r0]
            boolean r0 = X.AnonymousClass74I.A00(r3)
            if (r0 == 0) goto L_0x004f
        L_0x0026:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            r0 = 0
            r0 = r4[r0]
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r2.append(r0)
            if (r3 != 0) goto L_0x003d
            java.lang.String r0 = ""
        L_0x0038:
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)
            return r0
        L_0x003d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "_"
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toString(r3)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            goto L_0x0038
        L_0x004f:
            r3 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1409873v.A02(int[]):java.lang.String");
    }

    public static void A03(C18010vc r4, int[] iArr) {
        String join;
        int[] A07 = AnonymousClass74I.A07(iArr);
        if (!AnonymousClass74I.A02(A07)) {
            Log.e("EmojiSkinTonePreferenceManager/savePreferredMultiSkinTone/emoji is not a multi skin tone emoji");
            return;
        }
        String A01 = A01(A07);
        List<Pair> list = new C139466yt(iArr).A01;
        ArrayList A14 = AnonymousClass000.A14(list);
        for (Pair A00 : list) {
            int A002 = C108965cb.A00(A00);
            if (A002 > 0) {
                A14.add(Integer.toString(A002));
            }
        }
        if (A14.size() == 0) {
            join = "";
        } else {
            join = TextUtils.join("_", A14);
        }
        C17880vN.A1E(r4.A05("emoji_modifiers").edit(), A01, join);
    }

    public static void A04(C18010vc r3, int[] iArr) {
        int i;
        String A02 = A02(iArr);
        if (AnonymousClass74I.A01(iArr)) {
            i = iArr[1];
        } else {
            i = 0;
        }
        C17880vN.A1C(r3.A05("emoji_modifiers").edit(), A02, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r4 = android.text.TextUtils.split(r1, "_");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A05(X.C18010vc r4, int[] r5) {
        /*
            java.lang.String r2 = A01(r5)
            java.lang.String r0 = "emoji_modifiers"
            android.content.SharedPreferences r1 = r4.A05(r0)     // Catch:{ ClassCastException -> 0x0043 }
            java.lang.String r0 = ""
            java.lang.String r1 = r1.getString(r2, r0)     // Catch:{ ClassCastException -> 0x0043 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "_"
            java.lang.String[] r4 = android.text.TextUtils.split(r1, r0)
            int r3 = r4.length
            r0 = 2
            if (r3 < r0) goto L_0x0042
            int[] r0 = X.AnonymousClass74I.A07(r5)
            int[] r0 = X.AnonymousClass74I.A05(r0)
            X.6yt r2 = new X.6yt
            r2.<init>(r0)
            r1 = 1
        L_0x002e:
            int r0 = r1 + -1
            r0 = r4[r0]
            int r0 = java.lang.Integer.parseInt(r0)
            X.6yt r2 = r2.A00(r1, r0)
            int r1 = r1 + 1
            if (r1 <= r3) goto L_0x002e
            int[] r5 = r2.A01()
        L_0x0042:
            return r5
        L_0x0043:
            r1 = move-exception
            java.lang.String r0 = "EmojiSkinTonePreferenceManager/getPreferredMultiSkinTone"
            com.whatsapp.util.Log.e(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1409873v.A05(X.0vc, int[]):int[]");
    }
}
