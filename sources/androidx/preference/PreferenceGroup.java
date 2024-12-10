package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass00O;
import X.AnonymousClass8BR;
import X.AnonymousClass8BV;
import X.AnonymousClass8Gu;
import X.AnonymousClass9UH;
import X.C108955ca;
import X.C161648Gx;
import X.C17900vP;
import X.C21466AkX;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import java.util.List;

public abstract class PreferenceGroup extends Preference {
    public int A00;
    public List A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public final AnonymousClass00O A05;
    public final Handler A06;
    public final Runnable A07;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public static void A00(Preference preference, PreferenceGroup preferenceGroup) {
        long j;
        synchronized (preferenceGroup) {
            Preference.A03(preference);
            if (preference.A0D == preferenceGroup) {
                preference.A0D = null;
            }
            if (preferenceGroup.A01.remove(preference)) {
                String str = preference.A0J;
                if (str != null) {
                    AnonymousClass00O r2 = preferenceGroup.A05;
                    if (preference instanceof C161648Gx) {
                        j = ((C161648Gx) preference).A00;
                    } else {
                        j = preference.A04;
                    }
                    r2.put(str, Long.valueOf(j));
                    Handler handler = preferenceGroup.A06;
                    Runnable runnable = preferenceGroup.A07;
                    handler.removeCallbacks(runnable);
                    handler.post(runnable);
                }
                if (preferenceGroup.A02) {
                    preference.A08();
                }
            }
        }
    }

    public void A0S() {
        synchronized (this) {
            List list = this.A01;
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    A00((Preference) C108955ca.A0p(list), this);
                }
            }
        }
        A06();
    }

    public void A0C(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(AnonymousClass8Gu.class)) {
            AnonymousClass8Gu r3 = (AnonymousClass8Gu) parcelable;
            this.A00 = r3.A00;
            parcelable = r3.getSuperState();
        }
        super.A0C(parcelable);
    }

    public Preference A0R(CharSequence charSequence) {
        if (charSequence == null) {
            throw AnonymousClass000.A0k("Key cannot be null");
        } else if (TextUtils.equals(this.A0J, charSequence)) {
            return this;
        } else {
            List list = this.A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Preference preference = (Preference) list.get(i);
                if (TextUtils.equals(preference.A0J, charSequence) || ((preference instanceof PreferenceGroup) && (preference = ((PreferenceGroup) preference).A0R(charSequence)) != null)) {
                    return preference;
                }
            }
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0T(androidx.preference.Preference r8) {
        /*
            r7 = this;
            java.util.List r3 = r7.A01
            boolean r0 = r3.contains(r8)
            r6 = 1
            if (r0 != 0) goto L_0x00c1
            java.lang.String r4 = r8.A0J
            if (r4 == 0) goto L_0x0032
            r1 = r7
        L_0x000e:
            androidx.preference.PreferenceGroup r0 = r1.A0D
            if (r0 == 0) goto L_0x0015
            androidx.preference.PreferenceGroup r1 = r1.A0D
            goto L_0x000e
        L_0x0015:
            androidx.preference.Preference r0 = r1.A0R(r4)
            if (r0 == 0) goto L_0x0032
            java.lang.String r2 = "PreferenceGroup"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Found duplicated key: \""
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "\". This can cause unintended behaviour, please use unique keys for every preference."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            android.util.Log.e(r2, r0)
        L_0x0032:
            int r2 = r8.A02
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r0) goto L_0x0055
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x004a
            int r1 = r7.A04
            int r0 = r1 + 1
            r7.A04 = r0
            if (r1 == r2) goto L_0x004a
            r8.A02 = r1
            r8.A06()
        L_0x004a:
            boolean r0 = r8 instanceof androidx.preference.PreferenceGroup
            if (r0 == 0) goto L_0x0055
            r1 = r8
            androidx.preference.PreferenceGroup r1 = (androidx.preference.PreferenceGroup) r1
            boolean r0 = r7.A03
            r1.A03 = r0
        L_0x0055:
            int r2 = java.util.Collections.binarySearch(r3, r8)
            if (r2 >= 0) goto L_0x005d
            int r2 = -r2
            int r2 = r2 - r6
        L_0x005d:
            boolean r1 = r7.A0P()
            boolean r0 = r8.A0Q
            if (r0 != r1) goto L_0x006c
            r0 = r1 ^ 1
            r8.A0Q = r0
            X.AnonymousClass8BV.A19(r8)
        L_0x006c:
            monitor-enter(r7)
            r3.add(r2, r8)     // Catch:{ all -> 0x00be }
            monitor-exit(r7)     // Catch:{ all -> 0x00be }
            X.9th r5 = r7.A0E
            java.lang.String r4 = r8.A0J
            if (r4 == 0) goto L_0x0090
            X.00O r1 = r7.A05
            boolean r0 = r1.containsKey(r4)
            if (r0 == 0) goto L_0x0090
            java.lang.Object r0 = r1.get(r4)
            long r2 = X.C17880vN.A05(r0)
            r1.remove(r4)
        L_0x008a:
            r8.A04 = r2
            r8.A0O = r6
            r1 = 0
            goto L_0x009a
        L_0x0090:
            monitor-enter(r5)
            long r2 = r5.A00     // Catch:{ all -> 0x00bb }
            r0 = 1
            long r0 = r0 + r2
            r5.A00 = r0     // Catch:{ all -> 0x00bb }
            monitor-exit(r5)     // Catch:{ all -> 0x00bb }
            goto L_0x008a
        L_0x009a:
            r8.A0F(r5)     // Catch:{ all -> 0x00b7 }
            r8.A0O = r1
            androidx.preference.PreferenceGroup r0 = r8.A0D
            if (r0 != 0) goto L_0x00b0
            r8.A0D = r7
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x00ac
            r8.A07()
        L_0x00ac:
            r7.A06()
            return
        L_0x00b0:
            java.lang.String r0 = "This preference already has a parent. You must remove the existing parent before assigning a new one."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x00b7:
            r0 = move-exception
            r8.A0O = r1
            throw r0
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00bb }
            throw r0
        L_0x00be:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00be }
            throw r0
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.PreferenceGroup.A0T(androidx.preference.Preference):void");
    }

    public void A07() {
        super.A07();
        this.A02 = true;
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).A07();
        }
    }

    public void A0A(Bundle bundle) {
        super.A0A(bundle);
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).A0A(bundle);
        }
    }

    public void A0B(Bundle bundle) {
        super.A0B(bundle);
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).A0B(bundle);
        }
    }

    public void A0L(boolean z) {
        super.A0L(z);
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) list.get(i);
            if (preference.A0Q == z) {
                preference.A0Q = !z;
                AnonymousClass8BV.A19(preference);
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A05 = new AnonymousClass00O(0);
        this.A06 = new Handler();
        this.A03 = true;
        this.A04 = 0;
        this.A02 = false;
        this.A00 = Integer.MAX_VALUE;
        this.A07 = new C21466AkX((Object) this, 11);
        this.A01 = AnonymousClass000.A13();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass9UH.A08, i, i2);
        this.A03 = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            int i3 = obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i3 != Integer.MAX_VALUE && !AnonymousClass8BR.A1S(this.A0J)) {
                StringBuilder A10 = AnonymousClass000.A10();
                C17900vP.A0a(this, A10);
                Log.e("PreferenceGroup", AnonymousClass000.A0y(" should have a key defined if it contains an expandable preference", A10));
            }
            this.A00 = i3;
        }
        obtainStyledAttributes.recycle();
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
