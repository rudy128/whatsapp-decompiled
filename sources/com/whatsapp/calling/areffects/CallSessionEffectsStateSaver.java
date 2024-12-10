package com.whatsapp.calling.areffects;

import X.AnonymousClass00R;
import X.AnonymousClass1VE;
import X.AnonymousClass3MZ;
import X.C108205bJ;
import X.C108345bY;
import X.C17880vN;
import X.C17960vV;
import X.C18070vi;
import X.C29351c6;
import X.C35911n2;
import X.C35921n3;
import X.C89504cZ;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;

public final class CallSessionEffectsStateSaver implements C108205bJ {
    public final AnonymousClass1VE A00;
    public final Set A01 = C17880vN.A14();
    public final C35911n2 A02 = new C35921n3();

    public CallSessionEffectsStateSaver(AnonymousClass1VE r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean BjK(C108345bY r4, Integer num) {
        boolean A17 = C18070vi.A17(r4, num);
        if (num != AnonymousClass00R.A00) {
            return false;
        }
        this.A01.add(new C89504cZ(r4));
        return A17;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e A[Catch:{ JSONException -> 0x00ac, all -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e A[Catch:{ JSONException -> 0x00ac, all -> 0x00b6 }, LOOP:0: B:30:0x0098->B:32:0x009e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object BZe(java.lang.String r11, X.C30391dr r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C100764v2
            if (r0 == 0) goto L_0x002e
            r6 = r12
            X.4v2 r6 = (X.C100764v2) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002e
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r5 = r6.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r6.label
            r0 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0039
            if (r1 != r0) goto L_0x0034
            java.lang.Object r2 = r6.L$2
            X.1n2 r2 = (X.C35911n2) r2
            java.lang.Object r11 = r6.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r0 = r6.L$0
            com.whatsapp.calling.areffects.CallSessionEffectsStateSaver r0 = (com.whatsapp.calling.areffects.CallSessionEffectsStateSaver) r0
            X.C30691eM.A01(r5)
            goto L_0x004d
        L_0x002e:
            X.4v2 r6 = new X.4v2
            r6.<init>(r10, r12)
            goto L_0x0012
        L_0x0034:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0039:
            X.C30691eM.A01(r5)
            X.1n2 r2 = r10.A02
            r6.L$0 = r10
            r6.L$1 = r11
            r6.L$2 = r2
            r6.label = r0
            java.lang.Object r0 = r2.Bhx(r6)
            if (r0 == r4) goto L_0x00bb
            r0 = r10
        L_0x004d:
            java.util.LinkedHashSet r4 = X.C17880vN.A14()     // Catch:{ all -> 0x00b6 }
            X.1VE r8 = r0.A00     // Catch:{ all -> 0x00b6 }
            android.content.SharedPreferences r9 = X.AnonymousClass1VE.A00(r8)     // Catch:{ all -> 0x00b6 }
            java.lang.String r7 = "ar_effects_call_id"
            boolean r0 = r9.contains(r7)     // Catch:{ all -> 0x00b6 }
            r6 = 0
            if (r0 == 0) goto L_0x0078
            java.lang.String r5 = ""
            java.lang.String r0 = r9.getString(r7, r5)     // Catch:{ all -> 0x00b6 }
            boolean r0 = r0.equals(r11)     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x0078
            java.lang.String r1 = "ar_effects_call_effects"
            boolean r0 = r9.contains(r1)     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x0078
            java.lang.String r6 = r9.getString(r1, r5)     // Catch:{ all -> 0x00b6 }
        L_0x0078:
            int r5 = r11.length()     // Catch:{ all -> 0x00b6 }
            if (r5 <= 0) goto L_0x008b
            java.lang.String r1 = "ar_effects_call_effects"
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass3MZ.A08(r8)     // Catch:{ all -> 0x00b6 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r7)     // Catch:{ all -> 0x00b6 }
            X.C17880vN.A1B(r0, r1)     // Catch:{ all -> 0x00b6 }
        L_0x008b:
            if (r6 == 0) goto L_0x00b2
            if (r5 == 0) goto L_0x00b2
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00ac }
            r0.<init>(r6)     // Catch:{ JSONException -> 0x00ac }
            X.Akx r1 = X.A6n.A04(r0)     // Catch:{ JSONException -> 0x00ac }
        L_0x0098:
            boolean r0 = r1.hasNext()     // Catch:{ JSONException -> 0x00ac }
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r0 = r1.next()     // Catch:{ JSONException -> 0x00ac }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x00ac }
            X.4cZ r0 = X.C83514Fk.A00(r0)     // Catch:{ JSONException -> 0x00ac }
            r4.add(r0)     // Catch:{ JSONException -> 0x00ac }
            goto L_0x0098
        L_0x00ac:
            r1 = move-exception
            java.lang.String r0 = "CallEffectsStateSaver/getStateToRestore Parsing error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00b6 }
        L_0x00b2:
            r2.CQ9(r3)
            return r4
        L_0x00b6:
            r0 = move-exception
            r2.CQ9(r3)
            throw r0
        L_0x00bb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.areffects.CallSessionEffectsStateSaver.BZe(java.lang.String, X.1dr):java.lang.Object");
    }

    public void CGl(Integer num, String str) {
        String obj;
        SharedPreferences.Editor putString;
        C18070vi.A0h(num, str);
        if (num == AnonymousClass00R.A00 && str.length() != 0) {
            Set<C89504cZ> set = this.A01;
            if (!set.isEmpty()) {
                C17960vV.A00();
                AnonymousClass1VE r5 = this.A00;
                if (set.isEmpty()) {
                    obj = null;
                } else {
                    ArrayList A0D = C29351c6.A0D(set);
                    for (C89504cZ A002 : set) {
                        A0D.add(A002.A00());
                    }
                    obj = new JSONArray(A0D).toString();
                }
                SharedPreferences.Editor A08 = AnonymousClass3MZ.A08(r5);
                if (obj == null) {
                    putString = A08.remove("ar_effects_call_id").remove("ar_effects_call_effects");
                } else {
                    putString = A08.putString("ar_effects_call_id", str).putString("ar_effects_call_effects", obj);
                }
                putString.apply();
                set.clear();
            }
        }
    }
}
