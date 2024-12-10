package com.whatsapp.calling.areffects;

import X.AnonymousClass00R;
import X.AnonymousClass1VE;
import X.AnonymousClass3MZ;
import X.AnonymousClass4D9;
import X.C108205bJ;
import X.C108345bY;
import X.C17880vN;
import X.C17960vV;
import X.C18070vi;
import X.C29351c6;
import X.C35911n2;
import X.C35921n3;
import X.C83474Fg;
import X.C89504cZ;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;

public final class StickyEffectsStateSaver implements C108205bJ {
    public final AnonymousClass1VE A00;
    public final Set A01 = C17880vN.A14();
    public final C35911n2 A02 = new C35921n3();

    public StickyEffectsStateSaver(AnonymousClass1VE r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean BjK(C108345bY r6, Integer num) {
        boolean A17 = C18070vi.A17(r6, num);
        if (num == AnonymousClass00R.A00) {
            if (C83474Fg.A00(r6.BOO(), AnonymousClass4D9.CALLING, r6.BR7())) {
                this.A01.add(new C89504cZ(r6));
                return A17;
            }
        }
        return false;
    }

    public void CGl(Integer num, String str) {
        String obj;
        SharedPreferences.Editor putString;
        C18070vi.A0d(num, 0);
        if (num == AnonymousClass00R.A00) {
            Set<C89504cZ> set = this.A01;
            if (!set.isEmpty()) {
                C17960vV.A00();
                AnonymousClass1VE r3 = this.A00;
                if (set.isEmpty()) {
                    obj = null;
                } else {
                    ArrayList A0D = C29351c6.A0D(set);
                    for (C89504cZ A002 : set) {
                        A0D.add(A002.A00());
                    }
                    obj = new JSONArray(A0D).toString();
                }
                SharedPreferences.Editor A08 = AnonymousClass3MZ.A08(r3);
                if (obj == null) {
                    putString = A08.remove("ar_effects_sticky_effects");
                } else {
                    putString = A08.putString("ar_effects_sticky_effects", obj);
                }
                putString.apply();
                set.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059 A[Catch:{ JSONException -> 0x0087, all -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060 A[Catch:{ JSONException -> 0x0087, all -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063 A[Catch:{ JSONException -> 0x0087, all -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object BZe(java.lang.String r8, X.C30391dr r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C100584uk
            if (r0 == 0) goto L_0x002a
            r6 = r9
            X.4uk r6 = (X.C100584uk) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002a
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r2 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r6.label
            r0 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0035
            if (r1 != r0) goto L_0x0030
            java.lang.Object r3 = r6.L$1
            X.1n2 r3 = (X.C35911n2) r3
            java.lang.Object r0 = r6.L$0
            com.whatsapp.calling.areffects.StickyEffectsStateSaver r0 = (com.whatsapp.calling.areffects.StickyEffectsStateSaver) r0
            X.C30691eM.A01(r2)
            goto L_0x0047
        L_0x002a:
            X.4uk r6 = new X.4uk
            r6.<init>(r7, r9)
            goto L_0x0012
        L_0x0030:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0035:
            X.C30691eM.A01(r2)
            X.1n2 r3 = r7.A02
            r6.L$0 = r7
            r6.L$1 = r3
            r6.label = r0
            java.lang.Object r0 = r3.Bhx(r6)
            if (r0 == r5) goto L_0x0096
            r0 = r7
        L_0x0047:
            java.util.LinkedHashSet r5 = X.C17880vN.A14()     // Catch:{ all -> 0x0091 }
            X.1VE r6 = r0.A00     // Catch:{ all -> 0x0091 }
            android.content.SharedPreferences r1 = X.AnonymousClass1VE.A00(r6)     // Catch:{ all -> 0x0091 }
            java.lang.String r2 = "ar_effects_sticky_effects"
            boolean r0 = r1.contains(r2)     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = ""
            java.lang.String r1 = r1.getString(r2, r0)     // Catch:{ all -> 0x0091 }
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            if (r1 == 0) goto L_0x008d
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass3MZ.A08(r6)     // Catch:{ all -> 0x0091 }
            X.C17880vN.A1B(r0, r2)     // Catch:{ all -> 0x0091 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0087 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0087 }
            X.Akx r1 = X.A6n.A04(r0)     // Catch:{ JSONException -> 0x0087 }
        L_0x0073:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x0087 }
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r1.next()     // Catch:{ JSONException -> 0x0087 }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0087 }
            X.4cZ r0 = X.C83514Fk.A00(r0)     // Catch:{ JSONException -> 0x0087 }
            r5.add(r0)     // Catch:{ JSONException -> 0x0087 }
            goto L_0x0073
        L_0x0087:
            r1 = move-exception
            java.lang.String r0 = "StickyEffectsStateSaver/getStateToRestore Parsing error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0091 }
        L_0x008d:
            r3.CQ9(r4)
            return r5
        L_0x0091:
            r0 = move-exception
            r3.CQ9(r4)
            throw r0
        L_0x0096:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.areffects.StickyEffectsStateSaver.BZe(java.lang.String, X.1dr):java.lang.Object");
    }
}
